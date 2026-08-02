package xsna;

import java.util.LinkedHashMap;

/* compiled from: Ripple.android.kt */
/* loaded from: classes11.dex */
public final class dc2 extends klg0 implements flg0 {
    public glg0 A;
    public dlg0 z;

    @Override // xsna.flg0
    public final void F0() {
        this.A = null;
        mio.a(this);
    }

    @Override // xsna.q630.c
    public final void b2() {
        dlg0 dlg0Var = this.z;
        if (dlg0Var != null) {
            F0();
            sq90 sq90Var = dlg0Var.e;
            glg0 glg0Var = (glg0) ((LinkedHashMap) sq90Var.a).get(this);
            if (glg0Var != null) {
                glg0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) sq90Var.a;
                glg0 glg0Var2 = (glg0) linkedHashMap.get(this);
                if (glg0Var2 != null) {
                }
                linkedHashMap.remove(this);
                dlg0Var.d.add(glg0Var);
            }
        }
    }
}
