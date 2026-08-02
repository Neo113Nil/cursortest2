package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.w;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.feature.educations.internal.ui.ScrollSnapPreference;

/* loaded from: classes3.dex */
public final class njp0 extends w {
    public boolean p;
    public boolean q;
    public long r;
    public final /* synthetic */ ScrollSnapPreference s;
    public final /* synthetic */ Integer t;
    public final /* synthetic */ int u;
    public final /* synthetic */ AppBarLayout v;
    public final /* synthetic */ RecyclerView w;
    public final /* synthetic */ jc0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njp0(ScrollSnapPreference scrollSnapPreference, Integer num, int i, AppBarLayout appBarLayout, RecyclerView recyclerView, jc0 jc0Var, Context context) {
        super(context);
        this.s = scrollSnapPreference;
        this.t = num;
        this.u = i;
        this.v = appBarLayout;
        this.w = recyclerView;
        this.x = jc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z;
        int i = this.u;
        AppBarLayout appBarLayout = this.v;
        if (i > 0 && appBarLayout != null) {
            if (appBarLayout.getTop() + appBarLayout.getHeight() > 0 && Math.abs(appBarLayout.getTop()) < appBarLayout.getTotalScrollRange()) {
                z = true;
                this.q = z;
                if (z) {
                    return;
                }
                if (appBarLayout != null) {
                    appBarLayout.setExpanded(false);
                }
                long j = this.r;
                if (j < 300) {
                    j = 300;
                }
                this.r = j;
                return;
            }
        }
        z = false;
        this.q = z;
        if (z) {
        }
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void g() {
        super.g();
        int i = this.u;
        final int i2 = 0;
        AppBarLayout appBarLayout = this.v;
        final int i3 = 1;
        boolean z = (i != 0 || appBarLayout == null || appBarLayout.getTop() == 0) ? false : true;
        if (z) {
            appBarLayout.setExpanded(true);
            long j = this.r;
            if (j < 300) {
                j = 300;
            }
            this.r = j;
        }
        boolean z2 = z || this.q;
        boolean z3 = this.p;
        final jc0 jc0Var = this.x;
        RecyclerView recyclerView = this.w;
        if (z3 || z2) {
            recyclerView.postDelayed(new Runnable() { // from class: ljp0
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i2;
                    jc0 jc0Var2 = jc0Var;
                    switch (i4) {
                        case 0:
                            jc0Var2.invoke();
                            break;
                        default:
                            jc0Var2.invoke();
                            break;
                    }
                }
            }, this.r);
        } else {
            recyclerView.post(new Runnable() { // from class: ljp0
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    jc0 jc0Var2 = jc0Var;
                    switch (i4) {
                        case 0:
                            jc0Var2.invoke();
                            break;
                        default:
                            jc0Var2.invoke();
                            break;
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void h(View view, RecyclerView.k kVar, t0 t0Var) {
        super.h(view, kVar, t0Var);
        int l = l(q(), view);
        long j = this.r;
        long n = n(Math.abs(l));
        if (j < n) {
            j = n;
        }
        this.r = j;
    }

    @Override // androidx.recyclerview.widget.w
    public final int l(int i, View view) {
        int l = super.l(i, view);
        int i2 = i == 1 ? -1 : 1;
        Integer num = this.t;
        int intValue = ((num != null ? num.intValue() : 0) * i2) + l;
        if (intValue != 0) {
            this.p = true;
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.w
    public final int q() {
        int i = mjp0.a[this.s.ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        w511.b();
        return 0;
    }
}
