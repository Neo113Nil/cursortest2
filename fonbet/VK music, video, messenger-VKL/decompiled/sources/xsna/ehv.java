package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.entries.Html5Entry;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Html5StateController.kt */
/* loaded from: classes4.dex */
public final class ehv extends RecyclerView.t implements bkm {
    public final dkf0 b;
    public final jhv c;
    public ww50<?> d;
    public final int e;
    public boolean f;
    public boolean g = true;
    public final HashSet<WeakReference<chv>> h = new HashSet<>();
    public final Rect i = new Rect();
    public final a j;

    /* compiled from: Html5StateController.kt */
    public static final class a implements RecyclerView.q {
        public RecyclerView b;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void g(View view) {
            RecyclerView recyclerView = this.b;
            RecyclerView.e0 childViewHolder = recyclerView != null ? recyclerView.getChildViewHolder(view) : null;
            if (childViewHolder instanceof chv) {
                ehv.this.u((chv) childViewHolder, true, false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void k(View view) {
            RecyclerView recyclerView = this.b;
            RecyclerView.e0 childViewHolder = recyclerView != null ? recyclerView.getChildViewHolder(view) : null;
            if (childViewHolder instanceof chv) {
                ehv.this.u((chv) childViewHolder, false, false);
            }
        }
    }

    public ehv(Context context, dkf0 dkf0Var, jhv jhvVar) {
        RecyclerView recyclerView;
        ww50<?> Y;
        this.b = dkf0Var;
        this.c = jhvVar;
        a aVar = new a();
        this.j = aVar;
        ComponentCallbacks2 h = e3m.h(context);
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            this.d = Y;
            this.e = Y.y();
            Y.c0(this);
            Y.j(this);
        }
        RecyclerView recyclerView2 = aVar.b;
        if ((recyclerView2 == null || recyclerView2 != dkf0Var.getRecyclerView()) && (recyclerView = dkf0Var.getRecyclerView()) != null) {
            RecyclerView recyclerView3 = aVar.b;
            if (recyclerView3 != null) {
                recyclerView3.removeOnChildAttachStateChangeListener(aVar);
            }
            recyclerView.addOnChildAttachStateChangeListener(aVar);
            aVar.b = recyclerView;
        }
    }

    @Override // xsna.bkm
    public final void bb(int i) {
        boolean z = this.f;
        boolean z2 = i > this.e;
        if (z2 == z) {
            return;
        }
        if (z2) {
            this.f = true;
            if (this.g) {
                return;
            }
            s();
            return;
        }
        this.f = false;
        if (this.g) {
            return;
        }
        t(false, true);
    }

    public final void l(chv chvVar, Html5Entry html5Entry) {
        Html5Entry q6;
        Iterator<WeakReference<chv>> it = this.h.iterator();
        while (it.hasNext()) {
            chv chvVar2 = it.next().get();
            if (chvVar2 != chvVar && chvVar2 != null && (q6 = chvVar2.q6()) != null && q6.equals(html5Entry)) {
                chvVar2.U6();
                chvVar2.p = null;
            }
        }
    }

    public final void m() {
        Iterator<WeakReference<chv>> it = this.h.iterator();
        while (it.hasNext()) {
            WeakReference<chv> next = it.next();
            chv chvVar = next != null ? next.get() : null;
            if (chvVar != null) {
                chvVar.U6();
            } else {
                it.remove();
            }
        }
    }

    public final void n() {
        this.g = true;
        if (this.f) {
            return;
        }
        s();
    }

    public final void o() {
        this.g = false;
        if (this.f) {
            return;
        }
        t(false, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        jhv jhvVar;
        boolean z = i == 1;
        boolean z2 = i == 0;
        if (z2 && (jhvVar = this.c) != null) {
            jhvVar.b();
        }
        t(z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        jhv jhvVar;
        boolean z = i2 != 0;
        boolean z2 = i2 == 0;
        if (z2 && (jhvVar = this.c) != null) {
            jhvVar.b();
        }
        t(z, z2);
    }

    public final void p() {
        ww50<?> ww50Var = this.d;
        if (ww50Var != null) {
            ww50Var.c0(this);
        }
        RecyclerView recyclerView = this.b.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.removeOnChildAttachStateChangeListener(this.j);
        }
        this.d = null;
    }

    public final void q() {
        Iterator<WeakReference<chv>> it = this.h.iterator();
        while (it.hasNext()) {
            chv chvVar = it.next().get();
            if (chvVar != null) {
                chvVar.T6();
            }
            if (chvVar != null) {
                chvVar.U6();
            }
            it.remove();
        }
    }

    public final void r() {
        if (this.g || this.f) {
            s();
        } else {
            t(false, false);
        }
    }

    public final void s() {
        Iterator<WeakReference<chv>> it = this.h.iterator();
        while (it.hasNext()) {
            WeakReference<chv> next = it.next();
            chv chvVar = next != null ? next.get() : null;
            if (chvVar != null) {
                chvVar.T6();
            } else {
                it.remove();
            }
        }
    }

    public final void t(boolean z, boolean z2) {
        if (this.g || this.f) {
            return;
        }
        Iterator<WeakReference<chv>> it = this.h.iterator();
        while (it.hasNext()) {
            WeakReference<chv> next = it.next();
            chv chvVar = next != null ? next.get() : null;
            if (chvVar != null) {
                u(chvVar, z, z2);
            } else {
                it.remove();
            }
        }
    }

    public final void u(chv chvVar, boolean z, boolean z2) {
        int i;
        ihv ihvVar;
        View view = chvVar.itemView;
        if (view == null || !view.isAttachedToWindow() || view.getHeight() == 0) {
            i = 0;
        } else {
            Rect rect = this.i;
            view.getGlobalVisibleRect(rect);
            i = rect.height();
        }
        if (z) {
            chvVar.T6();
        }
        if (i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Html5Entry html5Entry = (Html5Entry) chvVar.p;
            if (html5Entry != null) {
                ihv ihvVar2 = chvVar.E;
                if (ihvVar2 == null) {
                    chvVar.R6();
                } else {
                    Html5Entry item = ihvVar2.getItem();
                    if (item != null && !item.equals(html5Entry)) {
                        chvVar.U6();
                        chvVar.R6();
                    }
                }
            }
        } else {
            chvVar.U6();
        }
        if (!z2 || ((Html5Entry) chvVar.p) == null || (ihvVar = chvVar.E) == null) {
            return;
        }
        if (!ihvVar.c() && ihvVar.e.w.d) {
            ihvVar.d(true);
            return;
        }
        khv khvVar = ihvVar.g;
        if (khvVar == null || !khvVar.j || !khvVar.i || khvVar.h || khvVar.f) {
            return;
        }
        khvVar.h = true;
        khvVar.i = false;
        khvVar.d("client_message_resume();");
        xuo0.a.getClass();
        khvVar.n = xuo0.c();
        com.vk.newsfeed.common.util.k.j(khvVar.l);
    }
}
