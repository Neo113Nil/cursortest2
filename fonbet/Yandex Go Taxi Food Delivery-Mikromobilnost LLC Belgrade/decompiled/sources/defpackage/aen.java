package defpackage;

import android.bluetooth.BluetoothAdapter;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import ru.yandex.taxi.delegates.a;

/* loaded from: classes5.dex */
public final class aen implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ aen(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                gcn gcnVar = (gcn) obj2;
                ty5 ty5Var = aVar.d;
                BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType = BiometricsAnalytics$BiometricsFlowType.BtCheckState;
                ty5Var.b(biometricsAnalytics$BiometricsFlowType);
                BluetoothAdapter r = qje.r(aVar.a);
                boolean z = r != null && r.isEnabled();
                gcnVar.a(new ck7(new cfb(z), null));
                ty5Var.a(biometricsAnalytics$BiometricsFlowType, z ? BiometricsAnalytics$BiometricsFlowResult.Success : BiometricsAnalytics$BiometricsFlowResult.Failed, z ? null : BiometricsAnalytics$BiometricsFlowFailureReason.BtOff);
                break;
            default:
                aVar.b((gcn) obj2);
                break;
        }
        return zy11Var;
    }
}
