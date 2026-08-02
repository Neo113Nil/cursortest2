package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class lau implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wbu b;
    public final /* synthetic */ sls c;

    public /* synthetic */ lau(sls slsVar, wbu wbuVar) {
        this.c = slsVar;
        this.b = wbuVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wbu wbuVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    a.f(this.c, null, null, 0L, 0L, null, null, false, null, null, null, wwg.S(275016173, true, new ctq(8, wbuVar), btsVar), btsVar, 0, 4094);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                e0b1.c(wbuVar, this.c, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ lau(wbu wbuVar, sls slsVar, int i) {
        this.b = wbuVar;
        this.c = slsVar;
    }
}
