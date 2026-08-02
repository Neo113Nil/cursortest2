package xsna;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: SelectionDecoration.kt */
/* loaded from: classes2.dex */
public final class vci0 extends RecyclerView.n {
    public static final int[] n = {R.attr.state_checked};
    public static final int[] o = StateSet.NOTHING;
    public static final WeakHashMap<RecyclerView, vci0> p = new WeakHashMap<>();
    public final RecyclerView b;
    public boolean c;
    public boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Rect i;
    public final ValueAnimator j;
    public final WeakReference<RecyclerView> k;
    public final tci0 l;
    public final uci0 m;

    public vci0() {
        throw null;
    }

    public vci0(RecyclerView recyclerView, tcn tcnVar) {
        this.b = recyclerView;
        this.e = iah0.a(24);
        this.f = iah0.a(32);
        this.g = iah0.a(8);
        this.h = iah0.a(6);
        this.i = new Rect();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.sci0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                vci0.this.b.invalidateItemDecorations();
            }
        });
        this.j = ofFloat;
        this.k = new WeakReference<>(recyclerView);
        this.l = new tci0(this);
        this.m = new uci0(this, tcnVar);
    }

    public static boolean l(RecyclerView recyclerView, int i) {
        Msg Q;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            adapter = null;
        }
        if (adapter == null) {
            return false;
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = qk30.b(i, adapter);
        if (((b == null || (Q = b.Q()) == null) ? null : Integer.valueOf(Q.b)) == null || !(adapter instanceof ok30)) {
            return false;
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i, ((ok30) adapter).f);
        e7i0 e7i0Var = gVar instanceof e7i0 ? (e7i0) gVar : null;
        if (e7i0Var != null) {
            return e7i0Var.p();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Msg Q;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            adapter = null;
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = adapter != null ? qk30.b(childAdapterPosition, adapter) : null;
        int b2 = ((b != null ? b.m() : false) && ((b == null || (Q = b.Q()) == null) ? false : Q.i)) ? an10.b(((Float) this.j.getAnimatedValue()).floatValue() * this.f) : 0;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            view.setTranslationX(b2);
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setTranslationX(b2);
        }
    }

    public final void m(boolean z) {
        if (this.c != z) {
            ValueAnimator valueAnimator = this.j;
            if (z) {
                valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            } else {
                valueAnimator.setFloatValues(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            valueAnimator.start();
            this.c = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        MsgBubbleView K3;
        Rect bubbleDrawablePadding;
        Msg Q;
        super.onDraw(canvas, recyclerView, a0Var);
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (this.c || this.j.isRunning()) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    adapter = null;
                }
                if (adapter != null) {
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = qk30.b(childAdapterPosition, adapter);
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2 = qk30.b(childAdapterPosition + 1, adapter);
                    if (b != null) {
                        if (b.m()) {
                            Msg Q2 = b.Q();
                            if (epx.f(Q2 != null ? Integer.valueOf(Q2.b) : null, (b2 == null || (Q = b2.Q()) == null) ? null : Integer.valueOf(Q.b))) {
                            }
                        }
                        if (b.m()) {
                            Msg Q3 = b.Q();
                            MsgFromUser msgFromUser = Q3 instanceof MsgFromUser ? (MsgFromUser) Q3 : null;
                            if (msgFromUser != null && !msgFromUser.hc()) {
                                Object childViewHolder = recyclerView.getChildViewHolder(childAt);
                                xtr0 xtr0Var = childViewHolder instanceof xtr0 ? (xtr0) childViewHolder : null;
                                int i3 = (xtr0Var == null || (K3 = xtr0Var.K3()) == null || (bubbleDrawablePadding = K3.getBubbleDrawablePadding()) == null) ? 0 : bubbleDrawablePadding.bottom;
                                float floatValue = ((Float) this.j.getAnimatedValue()).floatValue();
                                int i4 = this.g;
                                int i5 = this.e;
                                int b3 = an10.b((floatValue * (i4 + i5)) - i5);
                                int bottom = childAt.getBottom() - i5;
                                int i6 = this.h;
                                int i7 = (bottom - i6) - i3;
                                int b4 = an10.b((((Float) this.j.getAnimatedValue()).floatValue() * (i4 + i5)) - i5) + i5;
                                int bottom2 = (childAt.getBottom() - i6) - i3;
                                Rect rect = this.i;
                                rect.set(b3, i7, b4, bottom2);
                                int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt);
                                int i8 = rect.right;
                                uci0 uci0Var = this.m;
                                if (i8 > 0) {
                                    Drawable drawable = uci0Var.get(Integer.valueOf(childAdapterPosition2));
                                    if (drawable != null) {
                                        drawable.setBounds(rect);
                                        drawable.setState(l(recyclerView, childAdapterPosition2) ? n : o);
                                        drawable.draw(canvas);
                                    }
                                } else {
                                    Drawable drawable2 = uci0Var.get(Integer.valueOf(childAdapterPosition2));
                                    if (drawable2 != null) {
                                        drawable2.jumpToCurrentState();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = i2;
        }
    }
}
