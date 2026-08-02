package defpackage;

import com.yandex.go.position_alert.WarningModalView;
import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;

/* loaded from: classes6.dex */
public final /* synthetic */ class oo21 implements hr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oo21(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hr7
    public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bhf bhfVar = (bhf) obj;
                if (!z) {
                    bhfVar.Hg();
                    break;
                } else if (cameraUpdateReason == CameraUpdateReason.APPLICATION) {
                    bhfVar.Hg();
                    break;
                }
                break;
            case 1:
                qh31 qh31Var = (qh31) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    hi31 hi31Var = qh31Var.c;
                    hi31Var.a.g(fi31.a);
                    break;
                }
                break;
            case 2:
                k kVar = (k) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    kVar.d();
                    break;
                }
                break;
            default:
                WarningModalView.cameraListener$lambda$0((WarningModalView) obj, cameraPosition, cameraUpdateReason, z);
                break;
        }
    }
}
