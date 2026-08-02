package defpackage;

import android.content.Context;
import com.whatsapp.otp.android.sdk.enums.WhatsAppClientType;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import java.util.function.Function;

/* loaded from: classes13.dex */
public final /* synthetic */ class dyc implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return tje.y(n4h0.ic_default_payment_method, (Context) obj);
            case 2:
                return new k0a0(IconType.MBANK_ACCOUNT).a((Context) obj);
            case 3:
                return vng.t(IconType.GENERIC_SBP_BANK.getResourceId(), (Context) obj);
            case 4:
                CameraPosition cameraPosition = (CameraPosition) obj;
                Point target = cameraPosition.getTarget();
                float zoom = cameraPosition.getZoom();
                if (zoom > 16.0f) {
                    zoom = 16.0f;
                }
                return new CameraPosition(target, zoom, cameraPosition.getAzimuth(), cameraPosition.getTilt());
            default:
                return ((WhatsAppClientType) obj).a();
        }
    }
}
