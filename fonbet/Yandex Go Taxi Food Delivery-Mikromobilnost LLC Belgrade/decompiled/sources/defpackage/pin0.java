package defpackage;

import android.net.Uri;
import com.yandex.go.scooters.discovery.m;
import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import com.yandex.go.scooters.requirements.SkipCheck;

/* loaded from: classes13.dex */
public final /* synthetic */ class pin0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ pin0(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        c21 c21Var = sy60.Q2;
        Uri uri = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        zy11 zy11Var = zy11.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.R(null, new pin0(mVar, 4));
                break;
            case 1:
                mVar.S.b(uyn0.a);
                mVar.R(SkipCheck.DEBT, new pin0(mVar, 9));
                break;
            case 2:
                mVar.r(new v1n0(18));
                break;
            case 3:
                mVar.T(new teo0(objArr == true ? 1 : 0), null);
                break;
            case 4:
                mVar.D((m950) mVar.V.get(), new ptn0(new ktn0(InsuranceOpenReason.DISCOVERY_SHORCUT), null), new y6n0(1));
                break;
            case 5:
                mVar.T(new seo0(objArr2 == true ? 1 : 0), null);
                break;
            case 6:
                mVar.D((m950) mVar.P.get(), new r2p0(null, ScootersSupportEntryPoint.DISCOVERY), c21Var);
                break;
            case 7:
                mVar.D((m950) mVar.W.get(), new fno0(uri), c21Var);
                break;
            case 8:
                mVar.r(new v1n0(19));
                break;
            case 9:
                mVar.S(new hzn0(ScootersMosRuActionDialogOpenReason.DISCOVERY_SHORTCUT));
                break;
            case 10:
                mVar.S(new hzn0(ScootersMosRuActionDialogOpenReason.DISCOVERY_SCREEN));
                break;
            case 11:
                mVar.R(null, new pin0(mVar, 8));
                break;
            case 12:
                mVar.R(SkipCheck.DEBT, new pin0(mVar, 6));
                break;
            case 13:
                mVar.R(null, new pin0(mVar, 7));
                break;
            case 14:
                mVar.R(null, new pin0(mVar, 5));
                break;
            default:
                mVar.R(null, new pin0(mVar, 3));
                break;
        }
        return zy11Var;
    }
}
