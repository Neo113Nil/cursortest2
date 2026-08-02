package defpackage;

import com.yx360.design.compose.atoms.snackbar.a;

/* loaded from: classes11.dex */
public final class atm implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ysm b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xsm w;

    public atm(ysm ysmVar, String str, xsm xsmVar) {
        this.b = ysmVar;
        this.c = str;
        this.w = xsmVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xsm xsmVar = this.w;
        String str = this.c;
        ysm ysmVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                a.b(str, xsmVar, ysmVar, fidVar, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                a.c(((Boolean) ysmVar.a.getValue()).booleanValue(), wwg.S(-113812752, true, new atm(str, xsmVar, ysmVar), fidVar2), fidVar2, 384);
                break;
        }
        return zy11Var;
    }

    public atm(String str, xsm xsmVar, ysm ysmVar) {
        this.c = str;
        this.w = xsmVar;
        this.b = ysmVar;
    }
}
