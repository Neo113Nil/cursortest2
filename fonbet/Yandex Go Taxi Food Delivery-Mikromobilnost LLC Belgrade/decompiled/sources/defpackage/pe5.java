package defpackage;

import androidx.compose.foundation.text.g;

/* loaded from: classes10.dex */
public final /* synthetic */ class pe5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ tls c;

    public /* synthetic */ pe5(g gVar, tls tlsVar, int i) {
        this.a = i;
        this.b = gVar;
        this.c = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        tls tlsVar = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                dry0 dry0Var = (dry0) obj;
                if (gVar != null) {
                    gVar.a.setValue(dry0Var);
                }
                if (tlsVar != null) {
                    tlsVar.invoke(dry0Var);
                }
                return zy11.a;
            default:
                gVar.c.add(tlsVar);
                return new te4(19, gVar, tlsVar);
        }
    }
}
