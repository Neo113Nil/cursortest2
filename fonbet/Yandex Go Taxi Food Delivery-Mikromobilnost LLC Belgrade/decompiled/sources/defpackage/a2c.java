package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.a;
import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.platform.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class a2c extends a {
    public zvd0 Q;
    public dsv R;

    @Override // androidx.compose.foundation.a, defpackage.gwd0
    public final void D() {
        super.D();
        T0(false);
    }

    @Override // androidx.compose.foundation.a
    public final boolean Q0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.a
    public final void R0(KeyEvent keyEvent) {
        this.B.invoke();
    }

    public final void T0(boolean z) {
        if (z) {
            this.R = null;
        } else {
            this.Q = null;
        }
        K0(z);
    }

    @Override // androidx.compose.foundation.a, defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        super.m0(tvd0Var, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.Q == null) {
                return;
            }
            List list = tvd0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zvd0 zvd0Var = (zvd0) list.get(i);
                if (zvd0Var.j() && zvd0Var != this.Q) {
                    T0(false);
                    return;
                }
            }
            return;
        }
        if (this.Q == null) {
            if (z.g(tvd0Var, true, false)) {
                zvd0 zvd0Var2 = (zvd0) tvd0Var.a.get(0);
                zvd0Var2.a();
                this.Q = zvd0Var2;
                if (this.A) {
                    N0(zvd0Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = tvd0Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!kx91.c((zvd0) list2.get(i2))) {
                long J0 = J0(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    zvd0 zvd0Var3 = (zvd0) list2.get(i3);
                    if (zvd0Var3.j() || kx91.f(zvd0Var3, j, J0)) {
                        T0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((zvd0) list2.get(0)).a();
        if (this.A) {
            L0(this.Q.c, false);
            this.B.invoke();
        }
        this.Q = null;
    }

    @Override // defpackage.isv
    public final void n0(bsv bsvVar, PointerEventPass pointerEventPass) {
        O0();
        if (this.A && this.E == null) {
            z2t z2tVar = new z2t(this);
            E0(z2tVar);
            this.E = z2tVar;
        }
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.R == null) {
                return;
            }
            ArrayList arrayList = ((y92) bsvVar).a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dsv dsvVar = (dsv) arrayList.get(i);
                if (dsvVar.i && dsvVar != this.R) {
                    T0(true);
                    return;
                }
            }
            return;
        }
        if (this.R == null) {
            ArrayList arrayList2 = ((y92) bsvVar).a;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (s5b1.d((dsv) arrayList2.get(i2))) {
                    dsv dsvVar2 = (dsv) ((y92) bsvVar).a.get(0);
                    dsvVar2.i = true;
                    this.R = dsvVar2;
                    if (this.A) {
                        M0(dsvVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ArrayList arrayList3 = ((y92) bsvVar).a;
        int size3 = arrayList3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            dsv dsvVar3 = (dsv) arrayList3.get(i3);
            if (dsvVar3.i || !dsvVar3.h || dsvVar3.d) {
                float c = ((xp31) npb1.c(this, j.t)).c();
                ArrayList arrayList4 = ((y92) bsvVar).a;
                int size4 = arrayList4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    dsv dsvVar4 = (dsv) arrayList4.get(i4);
                    boolean z = Math.abs(wu60.d(wu60.e(dsvVar4.c, this.R.c))) > c;
                    if (dsvVar4.i || z) {
                        T0(true);
                        return;
                    }
                }
                return;
            }
        }
        ((dsv) ((y92) bsvVar).a.get(0)).i = true;
        if (this.A) {
            L0(this.R.c, true);
            this.B.invoke();
        }
        this.R = null;
    }

    @Override // defpackage.isv
    public final void y0() {
        T0(true);
    }
}
