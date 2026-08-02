package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$attr;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.i1n;

/* compiled from: DisclaimerDecoration.kt */
@ozl
/* loaded from: classes4.dex */
public final class v0n extends RecyclerView.n {
    public static final Set<Integer> k = rl3.y0(new Integer[]{50, 203, 42, 257, 59, 353, 71, 15, Integer.valueOf(PsExtractor.PRIVATE_STREAM_1), 299, Integer.valueOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), 354, 49});
    public static final Set<Integer> l = rl3.y0(new Integer[]{2, 178, 372});
    public final i1n b;
    public final int c;
    public final int d;
    public final Object e;
    public final Point f;
    public final Rect g;
    public final int h;
    public final int i;
    public final Object j;

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ RecyclerView b;

        public a(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            RecyclerView recyclerView = this.b;
            wjf0.c(recyclerView, new b(recyclerView));
        }
    }

    /* compiled from: DisclaimerDecoration.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ RecyclerView b;

        public b(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invalidateItemDecorations();
            return s3q0.a;
        }
    }

    public v0n(RecyclerView recyclerView) {
        this.b = new i1n(recyclerView.getContext());
        int i = R$attr.backgroundColor;
        abg0 abg0Var = dhr0.t;
        this.c = abg0Var.c(i);
        this.d = abg0Var.c(R.attr.vk_ui_text_secondary);
        qbj qbjVar = new qbj(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, qbjVar);
        this.f = new Point();
        this.g = new Rect();
        this.h = recyclerView.getContext().getColor(R.color.vk_black_alpha45);
        this.i = abg0Var.c(R.attr.vk_ui_text_contrast);
        this.j = msy.a(lazyThreadSafetyMode, new tvj(this, 4));
        io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new u0n(recyclerView.getContext(), 0))).m(asu0.m()).subscribe(new i22(new fo6(11, this, recyclerView), 20), new j22(new kp1(com.vk.metrics.eventtracking.b.a, 6), 25));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        DisclaimerData N3;
        View R0;
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        qi6 qi6Var = childViewHolder instanceof qi6 ? (qi6) childViewHolder : null;
        if (qi6Var == null) {
            return;
        }
        int itemViewType = qi6Var.getItemViewType();
        View view2 = qi6Var.itemView;
        Parcelable t6 = qi6Var.t6();
        tsx0 tsx0Var = t6 instanceof tsx0 ? (tsx0) t6 : null;
        if (tsx0Var == null || (N3 = tsx0Var.N3()) == null) {
            return;
        }
        DisclaimerContent contentType = tsx0Var.getContentType();
        t0n t0nVar = view2 instanceof t0n ? (t0n) view2 : null;
        if (t0nVar != null && (R0 = t0nVar.R0()) != null) {
            view2 = R0;
        }
        if (view2.getHeight() == 0) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (view2.isLaidOut()) {
                wjf0.c(recyclerView, new b(recyclerView));
            } else {
                view2.addOnLayoutChangeListener(new a(recyclerView));
            }
        }
        Rect rect2 = this.g;
        int i = rect2.top;
        int i2 = rect2.bottom;
        this.b.getClass();
        Point point = this.f;
        i1n.a(view2, N3, i, i2, point);
        if ((contentType != DisclaimerContent.TEXT || (itemViewType != 178 && itemViewType != 2 && itemViewType != 372)) && (contentType != DisclaimerContent.CARDS || (itemViewType != 15 && itemViewType != 49 && itemViewType != 8))) {
            if (contentType != DisclaimerContent.TEXT_WITH_CONTENT) {
                return;
            }
            if (itemViewType != 189 && itemViewType != 124) {
                return;
            }
        }
        rect.set(0, 0, 0, point.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i;
        Drawable drawable;
        v0n v0nVar = this;
        RecyclerView recyclerView2 = recyclerView;
        int childCount = recyclerView2.getChildCount();
        int i2 = 0;
        boolean z = false;
        while (true) {
            i1n i1nVar = v0nVar.b;
            if (i2 >= childCount) {
                if (z) {
                    return;
                }
                i1nVar.getClass();
                c1n.a.setEmpty();
                i1nVar.b.setEmpty();
                return;
            }
            RecyclerView.e0 childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i2));
            qi6 qi6Var = childViewHolder instanceof qi6 ? (qi6) childViewHolder : null;
            if (qi6Var != null) {
                NewsEntry t6 = qi6Var.t6();
                Post R = t6 != 0 ? di60.R(t6) : null;
                tsx0 tsx0Var = t6 instanceof tsx0 ? (tsx0) t6 : null;
                if (tsx0Var != null) {
                    DisclaimerData N3 = tsx0Var.N3();
                    if ((R == null || !R.gc()) && N3 != null) {
                        int itemViewType = qi6Var.getItemViewType();
                        if ((tsx0Var.getContentType() == DisclaimerContent.TEXT && l.contains(Integer.valueOf(itemViewType))) || ((tsx0Var.getContentType() == DisclaimerContent.TEXT_WITH_CONTENT || tsx0Var.getContentType() == DisclaimerContent.CARDS) && k.contains(Integer.valueOf(itemViewType)))) {
                            View view = qi6Var.itemView;
                            t0n t0nVar = qi6Var instanceof t0n ? (t0n) qi6Var : null;
                            View R0 = t0nVar != null ? t0nVar.R0() : null;
                            int itemViewType2 = qi6Var.getItemViewType();
                            z6g z6gVar = (itemViewType2 == 2 || itemViewType2 == 15 || itemViewType2 == 49 || itemViewType2 == 124 || itemViewType2 == 178 || itemViewType2 == 189 || itemViewType2 == 372) ? (z6g) v0nVar.e.getValue() : null;
                            if (z6gVar == null) {
                                z6gVar = (z6g) v0nVar.j.getValue();
                            }
                            if (qi6Var instanceof a1n) {
                                a1n a1nVar = (a1n) qi6Var;
                                if (!a1nVar.o5()) {
                                    a1nVar.U5();
                                    a1nVar.E2(N3);
                                }
                            }
                            int itemViewType3 = qi6Var.getItemViewType();
                            Paint paint = i1nVar.a;
                            int i3 = i1nVar.h;
                            Point point = i1nVar.i;
                            Rect rect = i1nVar.b;
                            Rect rect2 = v0nVar.g;
                            int i4 = rect2.top;
                            int i5 = rect2.bottom;
                            i = childCount;
                            int i6 = rect2.left;
                            Integer valueOf = Integer.valueOf(i6);
                            if (i6 == -1) {
                                valueOf = null;
                            }
                            int intValue = valueOf != null ? valueOf.intValue() : i3;
                            int i7 = rect2.right;
                            Integer valueOf2 = Integer.valueOf(i7);
                            if (i7 == -1) {
                                valueOf2 = null;
                            }
                            int intValue2 = valueOf2 != null ? valueOf2.intValue() : i3;
                            int i8 = i1n.a.$EnumSwitchMapping$0[N3.b.ordinal()];
                            int i9 = intValue;
                            if (i8 == 1) {
                                drawable = i1nVar.c;
                            } else if (i8 == 2) {
                                drawable = i1nVar.d;
                            } else if (i8 == 3) {
                                drawable = i1nVar.e;
                            } else if (i8 == 4) {
                                drawable = i1nVar.f;
                            } else {
                                if (i8 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                drawable = i1nVar.g;
                            }
                            i1n.a(R0 == null ? view : R0, N3, i4, i5, point);
                            int bottom = (R0 == null || R0.equals(view)) ? view.getBottom() : view.getPaddingTop() + R0.getBottom() + view.getTop();
                            int i10 = bottom - point.y;
                            int left = view.getLeft();
                            int width = view.getWidth();
                            int i11 = point.x;
                            int b2 = x9.b(width, i11, 2, left);
                            rect.set(b2, i10, i11 + b2, bottom);
                            paint.setColor(z6gVar.a);
                            rect.offset(0, (itemViewType3 == 2 || itemViewType3 == 15 || itemViewType3 == 49 || itemViewType3 == 124 || itemViewType3 == 178 || itemViewType3 == 189 || itemViewType3 == 372) ? point.y : 0);
                            c1n.a.set(rect);
                            canvas.drawRect(rect, paint);
                            rect.left += i9;
                            rect.right -= intValue2;
                            rect.top += i4;
                            rect.bottom -= i5;
                            if (drawable != null) {
                                drawable.setBounds(rect);
                            }
                            if (drawable != null) {
                                drawable.setTint(z6gVar.b);
                            }
                            if (drawable != null) {
                                drawable.draw(canvas);
                            }
                            z = true;
                            i2++;
                            v0nVar = this;
                            recyclerView2 = recyclerView;
                            childCount = i;
                        }
                    }
                }
            }
            i = childCount;
            i2++;
            v0nVar = this;
            recyclerView2 = recyclerView;
            childCount = i;
        }
    }
}
