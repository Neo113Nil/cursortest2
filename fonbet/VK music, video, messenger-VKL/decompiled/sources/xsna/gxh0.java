package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* compiled from: SearchParamsViewDialogNavigator.kt */
@ozl
/* loaded from: classes5.dex */
public final class gxh0 implements exh0 {
    public final FragmentManager a;
    public final ArrayList b = new ArrayList();
    public final a c = new a();

    /* compiled from: SearchParamsViewDialogNavigator.kt */
    public final class a extends FragmentManager.m {
        public a() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void e(Fragment fragment) {
            gxh0 gxh0Var = gxh0.this;
            ArrayList arrayList = gxh0Var.b;
            if (fragment.isRemoving() && fragment == j5g.k0(arrayList)) {
                g5g.J(arrayList);
                if (arrayList.isEmpty()) {
                    gxh0Var.a.r0(gxh0Var.c);
                } else {
                    gxh0Var.c();
                }
            }
        }
    }

    public gxh0(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // xsna.nqh0
    public final void a(androidx.fragment.app.d dVar) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            this.a.c0(this.c, false);
        }
        androidx.fragment.app.d dVar2 = (androidx.fragment.app.d) j5g.k0(arrayList);
        arrayList.add(dVar);
        if (dVar2 != null) {
            dVar2.dismiss();
        }
        c();
    }

    @Override // xsna.exh0
    public final FragmentManager b() {
        return this.a;
    }

    public final void c() {
        ArrayList arrayList = this.b;
        androidx.fragment.app.d dVar = (androidx.fragment.app.d) j5g.k0(arrayList);
        if (dVar == null) {
            return;
        }
        dVar.Td(this.a, "search_params_view_dialog_" + e43.h(arrayList));
    }

    @Override // xsna.nqh0
    public final void release() {
        ArrayList arrayList = this.b;
        androidx.fragment.app.d dVar = (androidx.fragment.app.d) g5g.J(arrayList);
        if (dVar != null) {
            dVar.dismiss();
        }
        arrayList.clear();
        this.a.r0(this.c);
    }
}
