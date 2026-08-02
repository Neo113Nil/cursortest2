package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.h1n;

/* compiled from: DisclaimerDecorationNew.kt */
/* loaded from: classes4.dex */
public final class x0n extends RecyclerView.n {
    public final h1n b = new h1n();
    public final Point c = new Point();
    public boolean d;
    public qi6<?> e;
    public boolean f;
    public boolean g;

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

    /* compiled from: DisclaimerDecorationNew.kt */
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

    public x0n(RecyclerView recyclerView) {
        hg1.b(recyclerView, io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new w0n(recyclerView.getContext(), this, 0))).m(asu0.m()).subscribe(new da(new b1a(13, this, recyclerView), 23), new vl0(new l3f(com.vk.metrics.eventtracking.b.a, 7), 19)));
    }

    public static qi6 l(qi6 qi6Var) {
        if (qi6Var.getItemViewType() == 317 || qi6Var.getItemViewType() == 15 || qi6Var.getItemViewType() == 354 || qi6Var.getItemViewType() == 408) {
            return qi6Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        u1c0 J0;
        View R0;
        RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
        Integer num = null;
        qi6<?> qi6Var = childViewHolder instanceof qi6 ? (qi6) childViewHolder : null;
        if (qi6Var == null) {
            return;
        }
        View view2 = qi6Var.itemView;
        NewsEntry t6 = qi6Var.t6();
        tsx0 tsx0Var = t6 instanceof tsx0 ? (tsx0) t6 : null;
        if (tsx0Var == null) {
            rect.setEmpty();
            return;
        }
        NewsEntry newsEntry = t6 == 0 ? null : t6;
        Post R = newsEntry != null ? di60.R(newsEntry) : null;
        if ((R != null && R.gc()) || tsx0Var.N3() == null) {
            rect.setEmpty();
            return;
        }
        qi6<?> m = m(qi6Var, tsx0Var);
        View view3 = m != null ? m.itemView : null;
        if (view3 == null || !view.equals(view3)) {
            rect.setEmpty();
            return;
        }
        t0n t0nVar = qi6Var instanceof t0n ? (t0n) qi6Var : null;
        if (t0nVar != null && (R0 = t0nVar.R0()) != null) {
            view2 = R0;
        }
        if (view2.getHeight() == 0) {
            rect.setEmpty();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (view2.isLaidOut()) {
                wjf0.c(recyclerView, new b(recyclerView));
                return;
            } else {
                view2.addOnLayoutChangeListener(new a(recyclerView));
                return;
            }
        }
        Point point = this.c;
        this.b.a(view2, point, (tsx0) t6);
        RecyclerView.e0 childViewHolder2 = recyclerView.getChildViewHolder(view3);
        qi6 qi6Var2 = childViewHolder2 instanceof qi6 ? (qi6) childViewHolder2 : null;
        if (qi6Var2 != null && (J0 = qi6Var2.J0()) != null) {
            num = Integer.valueOf(J0.c);
        }
        if (epx.f(qi6Var.itemView, view3) && (num == null || num.intValue() != 1)) {
            rect.set(0, 0, 0, point.y);
        } else if (epx.f(qi6Var.itemView, view3) && num != null && num.intValue() == 1) {
            rect.set(0, point.y, 0, 0);
        }
    }

    public final qi6<?> m(qi6<?> qi6Var, tsx0 tsx0Var) {
        u1c0 J0;
        u1c0 J02;
        if (tsx0Var instanceof ShitAttachment) {
            return l(qi6Var);
        }
        qi6<?> qi6Var2 = null;
        if (tsx0Var instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) tsx0Var;
            NewsEntry t6 = qi6Var.t6();
            if (t6 != null) {
                if (!this.g && t6.equals(promoPost)) {
                    this.g = true;
                }
                if (!this.f && this.g && !t6.equals(promoPost)) {
                    this.f = true;
                }
                boolean z = this.f;
                qi6<?> qi6Var3 = this.e;
                if (epx.f(qi6Var3 != null ? qi6Var3.t6() : null, promoPost) && z && ((J02 = qi6Var3.J0()) == null || J02.c != 1)) {
                    qi6Var2 = qi6Var3;
                } else if (t6.equals(promoPost) && (J0 = qi6Var.J0()) != null && J0.c == 1) {
                    qi6Var2 = qi6Var;
                }
                this.e = qi6Var;
                return qi6Var2;
            }
        } else if (tsx0Var instanceof MyTargetNativeAdEntry) {
            return l(qi6Var);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Drawable drawable;
        this.d = false;
        this.f = false;
        this.g = false;
        this.e = null;
        int childCount = recyclerView.getChildCount();
        int i = 0;
        View view = null;
        qi6<?> qi6Var = null;
        DisclaimerData disclaimerData = null;
        qi6<?> qi6Var2 = null;
        Object obj = null;
        while (true) {
            if (i >= childCount) {
                break;
            }
            RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            qi6<?> qi6Var3 = childViewHolder instanceof qi6 ? (qi6) childViewHolder : null;
            if (qi6Var3 != null) {
                obj = qi6Var3.t6();
                tsx0 tsx0Var = obj instanceof tsx0 ? (tsx0) obj : null;
                if (tsx0Var != null && (disclaimerData = tsx0Var.N3()) != null) {
                    NewsEntry newsEntry = tsx0Var instanceof NewsEntry ? (NewsEntry) tsx0Var : null;
                    Post R = newsEntry != null ? di60.R(newsEntry) : null;
                    if ((R == null || !R.gc()) && tsx0Var.N3() != null && !this.d) {
                        if (view == null) {
                            t0n t0nVar = qi6Var3 instanceof t0n ? (t0n) qi6Var3 : null;
                            view = t0nVar != null ? t0nVar.R0() : null;
                        }
                        if (qi6Var2 == null) {
                            qi6Var2 = m(qi6Var3, tsx0Var);
                        }
                        if (view != null && qi6Var2 != null) {
                            qi6Var = qi6Var3;
                            break;
                        }
                    }
                }
                qi6Var = qi6Var3;
            }
            i++;
        }
        h1n h1nVar = this.b;
        if (qi6Var2 != null && disclaimerData != null && qi6Var != null && obj != null) {
            this.d = true;
            if (qi6Var instanceof a1n) {
                a1n a1nVar = (a1n) qi6Var;
                if (!a1nVar.o5()) {
                    a1nVar.U5();
                    a1nVar.E2(disclaimerData);
                }
            }
            int itemViewType = qi6Var2.getItemViewType();
            View view2 = qi6Var.itemView;
            View view3 = qi6Var2.itemView;
            Paint paint = h1nVar.b;
            ?? r13 = h1nVar.l;
            ?? r14 = h1nVar.k;
            Point point = h1nVar.i;
            Rect rect = h1nVar.c;
            int i2 = h1n.a.$EnumSwitchMapping$0[disclaimerData.b.ordinal()];
            if (i2 == 1) {
                drawable = h1nVar.d;
            } else if (i2 == 2) {
                drawable = h1nVar.e;
            } else if (i2 == 3) {
                drawable = h1nVar.f;
            } else if (i2 == 4) {
                drawable = h1nVar.g;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                drawable = h1nVar.h;
            }
            h1nVar.a(view == null ? view2 : view, point, obj instanceof tsx0 ? (tsx0) obj : null);
            boolean z = itemViewType == 1;
            int top = view3 != null ? z ? view3.getTop() : view3.getBottom() : (view == null || view.equals(view2)) ? view2.getBottom() : view.getBottom() + view2.getTop() + view2.getPaddingTop();
            int i3 = top - point.y;
            int left = view2.getLeft();
            int width = view2.getWidth();
            int i4 = point.x;
            boolean z2 = z;
            int b2 = x9.b(width, i4, 2, left);
            rect.set(b2, i3, i4 + b2, top);
            paint.setColor(((z6g) r14.getValue()).a);
            if ((!z2 && view3 != null) || itemViewType == 2 || itemViewType == 15 || itemViewType == 49 || itemViewType == 124 || itemViewType == 178 || itemViewType == 189 || itemViewType == 372) {
                rect.offset(0, point.y);
            }
            c1n.a.set(rect);
            canvas.drawRect(rect, paint);
            rect.top = ((Number) h1nVar.m.getValue()).intValue() + rect.top;
            rect.left = ((Number) r13.getValue()).intValue() + rect.left;
            rect.right -= ((Number) r13.getValue()).intValue();
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            if (drawable != null) {
                drawable.setTint(((z6g) r14.getValue()).b);
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        if (this.d) {
            return;
        }
        h1nVar.getClass();
        c1n.a.setEmpty();
        h1nVar.c.setEmpty();
    }
}
