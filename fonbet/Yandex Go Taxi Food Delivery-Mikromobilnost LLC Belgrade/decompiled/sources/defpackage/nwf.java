package defpackage;

import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;

/* loaded from: classes15.dex */
public final class nwf implements xvf0 {
    public final /* synthetic */ int a;

    public /* synthetic */ nwf(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new wbz0();
            case 1:
                return new lr51(new ExternalSchemesInteractor());
            case 2:
                return new mj6();
            case 3:
                return new liy0();
            case 4:
                return zzf.Z0();
            case 5:
                return bkz.a();
            case 6:
                return new fwu0();
            case 7:
                return new wdz(new m7z());
            case 8:
                return new kv70();
            case 9:
                return rjz.a();
            case 10:
                return dkz.a();
            case 11:
                return new yiy0();
            case 12:
                return new ziy0();
            case 13:
                return new jzz(new m7z());
            case 14:
                return new awb0();
            case 15:
                return new kwl();
            case 16:
                return h7g0.a();
            case 17:
                return new f9g();
            case 18:
                return new w7g();
            case 19:
                MainScreenBehavior mainScreenBehavior = MainScreenBehavior.SHORTCUTS;
                q5z.i(mainScreenBehavior);
                return mainScreenBehavior;
            case 20:
                return null;
            case 21:
                return new wbg();
            default:
                return new dcg();
        }
    }
}
