package defpackage;

import androidx.compose.foundation.lazy.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class m4b0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ m4b0(b bVar, oz40 oz40Var, int i) {
        this.a = i;
        this.b = bVar;
        this.c = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = true;
        oz40 oz40Var = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                if (!bVar.b() && !bVar.e()) {
                    z = false;
                }
                oz40Var.setValue(Boolean.valueOf(z));
                break;
            default:
                if (!bVar.b() && !bVar.e()) {
                    z = false;
                }
                oz40Var.setValue(Boolean.valueOf(z));
                break;
        }
        return zy11Var;
    }
}
