package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.filter.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FilterItemAnimator.kt */
/* loaded from: classes4.dex */
public final class xcr extends androidx.recyclerview.widget.g {
    public final com.vk.photo.editor.features.filter.d t;
    public final RecyclerView u;
    public final q5f v;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();

    /* compiled from: FilterItemAnimator.kt */
    public static class a extends RecyclerView.l.c {
        public final int c;

        public a(int i) {
            this.c = i;
        }
    }

    /* compiled from: FilterItemAnimator.kt */
    public static final class b {
        public final rtm0 a;
        public final float b;
        public final float c;

        public b(rtm0 rtm0Var, float f, float f2) {
            this.a = rtm0Var;
            this.b = f;
            this.c = f2;
        }
    }

    /* compiled from: FilterItemAnimator.kt */
    public static final class c extends a {
        public final int d;

        public c(int i, int i2) {
            super(i);
            this.d = i2;
        }
    }

    public xcr(com.vk.photo.editor.features.filter.d dVar, RecyclerView recyclerView, q5f q5fVar) {
        this.t = dVar;
        this.u = recyclerView;
        this.v = q5fVar;
        this.g = false;
        this.e = 300L;
    }

    public final oer H(rtm0 rtm0Var, int i) {
        Integer num = rtm0Var.v;
        int intValue = i - (num != null ? num.intValue() : 0);
        while (true) {
            intValue--;
            if (-1 >= intValue) {
                return null;
            }
            com.vk.photo.editor.features.filter.a x0 = this.t.x0(intValue);
            RecyclerView recyclerView = this.u;
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(intValue);
            View view = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null;
            if ((x0 instanceof a.C1457a) && view != null) {
                RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(view);
                if (childViewHolder instanceof oer) {
                    return (oer) childViewHolder;
                }
            }
        }
    }

    public final boolean I(rtm0 rtm0Var, int i, int i2, boolean z) {
        View view = rtm0Var.itemView;
        view.animate().setInterpolator(new AccelerateDecelerateInterpolator());
        j(rtm0Var);
        View view2 = rtm0Var.itemView;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        rtm0Var.itemView.setAlpha(1.0f);
        view.setTranslationX(i - view.getLeft());
        int i3 = i2 - i;
        if (i3 == 0) {
            h(rtm0Var);
            return false;
        }
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f2);
        view.getTranslationX();
        this.w.add(new b(rtm0Var, view.getTranslationX() + i3, f));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean c(RecyclerView.e0 e0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = e0Var.itemView;
        int left = cVar2 != null ? cVar2.a : view.getLeft();
        int top = cVar2 != null ? cVar2.b : view.getTop();
        if ((((a) cVar).c & 8) == 0 && !(i == left && i2 == top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return y(e0Var, i, i2, left, top);
        }
        c cVar3 = cVar instanceof c ? (c) cVar : null;
        if (cVar3 == null) {
            z(e0Var);
            return true;
        }
        rtm0 rtm0Var = (rtm0) e0Var;
        oer H = H(rtm0Var, cVar3.d);
        View view2 = H != null ? H.itemView : null;
        View view3 = rtm0Var.itemView;
        return I(rtm0Var, (int) rtm0Var.itemView.getX(), (int) ((((view2 != null ? view2.getLeft() : 0) + (view2 != null ? view2.getRight() : 0)) / 2.0f) - ((view3.getRight() - view3.getLeft()) / 2.0f)), false);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void j(RecyclerView.e0 e0Var) {
        e0Var.itemView.animate().cancel();
        this.x.remove(e0Var);
        super.j(e0Var);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        while (true) {
            ArrayList arrayList = this.x;
            if (arrayList.size() <= 0) {
                super.k();
                return;
            } else {
                RecyclerView.e0 e0Var = (RecyclerView.e0) j5g.i0(arrayList);
                e0Var.itemView.animate().cancel();
                arrayList.remove(e0Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return (!super.n() && this.x.isEmpty() && this.w.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void p() {
        o(new RecyclerView.l.a() { // from class: xsna.wcr
            @Override // androidx.recyclerview.widget.RecyclerView.l.a
            public final void a() {
                q5f q5fVar = xcr.this.v;
                if (q5fVar != null) {
                    q5fVar.invoke();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.l.c q(RecyclerView.a0 a0Var, RecyclerView.e0 e0Var, int i, List<Object> list) {
        if (e0Var instanceof rtm0) {
            c cVar = new c(i, ((rtm0) e0Var).getOldPosition());
            cVar.a(e0Var);
            return cVar;
        }
        a aVar = new a(i);
        aVar.a(e0Var);
        return aVar;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        super.r();
        ArrayList arrayList = this.w;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            rtm0 rtm0Var = bVar.a;
            View view = rtm0Var.itemView;
            ViewPropertyAnimator alpha = view.animate().translationX(bVar.b).alpha(bVar.c);
            this.x.add(rtm0Var);
            alpha.setDuration(this.e).setListener(new ycr(this, rtm0Var, view, alpha)).start();
        }
        arrayList.clear();
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        rtm0 rtm0Var;
        int adapterPosition;
        if (!(e0Var instanceof rtm0) || (adapterPosition = (rtm0Var = (rtm0) e0Var).getAdapterPosition()) == -1) {
            return false;
        }
        oer H = H(rtm0Var, adapterPosition);
        View view = H != null ? H.itemView : null;
        View view2 = rtm0Var.itemView;
        return I(rtm0Var, (int) ((((view != null ? view.getLeft() : 0) + (view != null ? view.getRight() : 0)) / 2.0f) - ((view2.getRight() - view2.getLeft()) / 2.0f)), rtm0Var.itemView.getLeft(), true);
    }
}
