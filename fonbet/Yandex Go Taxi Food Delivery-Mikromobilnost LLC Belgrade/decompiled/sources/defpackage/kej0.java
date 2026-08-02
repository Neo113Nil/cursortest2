package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.List;

/* loaded from: classes13.dex */
public final /* synthetic */ class kej0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bpl0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ kej0(int i, tls tlsVar, bpl0 bpl0Var) {
        this.a = i;
        this.b = bpl0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        bpl0 bpl0Var = this.b;
        u6y u6yVar = (u6y) obj;
        switch (i) {
            case 0:
                List list = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                ((m6y) u6yVar).f(list.size(), wlsVar != null ? new qq5(7, wlsVar, list) : null, new qc0(list, 25), new a(-930734472, new zx8(list, tlsVar, 7), true));
                break;
            case 1:
                List list2 = bpl0Var.a;
                wls wlsVar2 = bpl0Var.b;
                ((m6y) u6yVar).f(list2.size(), wlsVar2 != null ? new qq5(11, wlsVar2, list2) : null, new pcx0(list2, 7), new a(-930734472, new yc0(list2, tlsVar, 16, bpl0Var), true));
                break;
            default:
                List list3 = bpl0Var.a;
                wls wlsVar3 = bpl0Var.b;
                ((m6y) u6yVar).f(list3.size(), wlsVar3 != null ? new qq5(12, wlsVar3, list3) : null, new pcx0(list3, 9), new a(-930734472, new zx8(list3, tlsVar, 12), true));
                break;
        }
        return zy11Var;
    }
}
