package xsna;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
public class ujc extends zc {
    public xlb0 N;
    public nuw O;

    public ujc() {
        throw null;
    }

    @Override // xsna.zc, xsna.puw
    public final void E1(fa2 fa2Var, PointerEventPass pointerEventPass) {
        ArrayList arrayList = fa2Var.a;
        super.E1(fa2Var, pointerEventPass);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.O == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                nuw nuwVar = (nuw) arrayList.get(i);
                if (nuwVar.i && !nuwVar.equals(this.O)) {
                    y2(true);
                    return;
                }
            }
            return;
        }
        if (this.O == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (c4g0.h((nuw) arrayList.get(i2))) {
                    nuw nuwVar2 = (nuw) arrayList.get(0);
                    nuwVar2.i = true;
                    this.O = nuwVar2;
                    if (this.w) {
                        r2(nuwVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            nuw nuwVar3 = (nuw) arrayList.get(i3);
            if (nuwVar3.i || !nuwVar3.h || nuwVar3.d) {
                float e = ((rut0) ovi.a(this, uvi.t)).e();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    nuw nuwVar4 = (nuw) arrayList.get(i4);
                    boolean z = Math.abs(ov70.d(ov70.e(nuwVar4.c, this.O.c))) > e;
                    if (nuwVar4.i || z) {
                        y2(true);
                        return;
                    }
                }
                return;
            }
        }
        ((nuw) arrayList.get(0)).i = true;
        if (this.w) {
            q2(this.O.c, true);
            this.x.invoke();
        }
        this.O = null;
    }

    @Override // xsna.zc, xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        super.H(plb0Var, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.N == null) {
                return;
            }
            List<xlb0> list = plb0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                xlb0 xlb0Var = list.get(i);
                if (xlb0Var.c() && !xlb0Var.equals(this.N)) {
                    y2(false);
                    return;
                }
            }
            return;
        }
        if (this.N == null) {
            if (z2o0.f(plb0Var, true, false)) {
                xlb0 xlb0Var2 = plb0Var.a.get(0);
                xlb0Var2.a();
                this.N = xlb0Var2;
                if (this.w) {
                    s2(xlb0Var2);
                    return;
                }
                return;
            }
            return;
        }
        List<xlb0> list2 = plb0Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!fdi.n(list2.get(i2))) {
                long o2 = o2(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    xlb0 xlb0Var3 = list2.get(i3);
                    if (xlb0Var3.c() || fdi.z(xlb0Var3, j, o2)) {
                        y2(false);
                        return;
                    }
                }
                return;
            }
        }
        list2.get(0).a();
        if (this.w) {
            q2(this.N.c, false);
            this.x.invoke();
        }
        this.N = null;
    }

    @Override // xsna.puw
    public final void J0() {
        y2(true);
    }

    @Override // xsna.zc, xsna.cmb0
    public final void h1() {
        super.h1();
        y2(false);
    }

    @Override // xsna.zc
    public final boolean v2(KeyEvent keyEvent) {
        return false;
    }

    @Override // xsna.zc
    public final void w2(KeyEvent keyEvent) {
        this.x.invoke();
    }

    public final void y2(boolean z) {
        if (z) {
            this.O = null;
        } else {
            this.N = null;
        }
        p2(z);
    }
}
