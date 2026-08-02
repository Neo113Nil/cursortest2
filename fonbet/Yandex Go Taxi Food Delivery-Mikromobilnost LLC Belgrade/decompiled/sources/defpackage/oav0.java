package defpackage;

import android.content.Intent;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.search.common.presenter.b;
import com.yandex.go.blur.core.BlurEffect$CoordinatesType;
import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;
import com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.UniversalQrScannerDeeplinkHandler$processIntent$$inlined$suspendCallbackApi$2;
import com.yandex.mapkit.road_events.EventInfoSession;

/* loaded from: classes14.dex */
public final class oav0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oav0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        pew0 pew0Var;
        int i;
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                b bVar = (b) obj2;
                bVar.Lh();
                bVar.rh((ic61) obj);
                break;
            case 1:
                a76 a76Var = (a76) obj;
                SuperappSearchbarContainerView superappSearchbarContainerView = (SuperappSearchbarContainerView) obj2;
                if (!(a76Var instanceof y66)) {
                    a76Var = null;
                }
                y66 y66Var = (y66) a76Var;
                float measuredHeight = superappSearchbarContainerView.getMeasuredHeight();
                int i3 = y66Var != null ? y66Var.a : 0;
                BlurEffect$CoordinatesType blurEffect$CoordinatesType = BlurEffect$CoordinatesType.Relative;
                pew0Var = superappSearchbarContainerView.searchbarViewDimens;
                float paddingBottom = (measuredHeight - superappSearchbarContainerView.getPaddingBottom()) - pew0Var.b.c;
                i = superappSearchbarContainerView.blurTopOffset;
                break;
            case 2:
                f.l((mnq0) obj, (String) obj2);
                break;
            case 3:
                ((m2k0) obj).G(((tx40) obj2).getFloatValue());
                break;
            case 4:
                float[] fArr = ((n810) obj).a;
                rzx rzxVar = (rzx) obj2;
                if (rzxVar.d()) {
                    gwk0.o(rzxVar).B(rzxVar, fArr);
                    break;
                }
                break;
            case 5:
                ((UniversalQrScannerDeeplinkHandler$processIntent$$inlined$suspendCallbackApi$2) obj2).invoke((Intent) obj);
                break;
            default:
                ((EventInfoSession) obj2).cancel();
                break;
        }
        return zy11Var;
    }
}
