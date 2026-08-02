package defpackage;

import androidx.compose.foundation.text.selection.i;
import androidx.compose.runtime.internal.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class gkq0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zkq0 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ i w;

    public /* synthetic */ gkq0(zkq0 zkq0Var, a aVar, i iVar) {
        this.b = zkq0Var;
        this.c = aVar;
        this.w = iVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i iVar = this.w;
        a aVar = this.c;
        zkq0 zkq0Var = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    frb1.b(iVar, wwg.S(-284825865, true, new gkq0(zkq0Var, aVar, iVar), btsVar), btsVar, 48);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    sb2.b(alq0.a.a(zkq0Var), wwg.S(610483127, true, new onc(aVar, iVar), btsVar2), btsVar2, 56);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ gkq0(i iVar, zkq0 zkq0Var, a aVar) {
        this.w = iVar;
        this.b = zkq0Var;
        this.c = aVar;
    }
}
