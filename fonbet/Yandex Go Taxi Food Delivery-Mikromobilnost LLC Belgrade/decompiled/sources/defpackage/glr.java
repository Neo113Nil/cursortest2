package defpackage;

import android.graphics.drawable.ColorDrawable;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.w;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import java.util.Map;
import ru.yandex.taxi.search.panorama.TaxiPanoramaModalView;

/* loaded from: classes10.dex */
public final /* synthetic */ class glr implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ glr(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.b = z;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 forward$lambda$2;
        int width;
        int height;
        kt10 kt10Var;
        zy11 renderPickupPoints$lambda$3$0$0;
        int i = this.a;
        boolean z = this.b;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                forward$lambda$2 = FlexRouteHandlerImpl.forward$lambda$2((Map) obj4, (FlexRouteHandlerImpl) obj3, (u1m) obj2, (ywl) obj, z);
                return forward$lambda$2;
            case 1:
                dss dssVar = (dss) obj4;
                PlainMessage.Image image = (PlainMessage.Image) obj3;
                String str = (String) obj2;
                css cssVar = (css) obj;
                if (z) {
                    width = Math.min(dssVar.O.getWidth(), dssVar.O.getHeight());
                    height = width;
                } else {
                    width = dssVar.O.getWidth();
                    height = dssVar.O.getHeight();
                }
                boolean z2 = image.animated;
                PlainMessage.FileInfo fileInfo = image.fileInfo;
                if (z2) {
                    kt10Var = new kt10(str, width, height, true, fileInfo.size, new ColorDrawable(dssVar.R), fileInfo.source, Boolean.TRUE);
                } else {
                    kt10Var = new kt10(str, width, height, false, 0L, new ColorDrawable(dssVar.R), fileInfo.source, Boolean.TRUE);
                }
                dssVar.P.d(kt10Var, false);
                dssVar.O.setOnClickListener(new cun(cssVar, dssVar, image, width, height));
                return zy11.a;
            case 2:
                return new w(this.b, (sls) obj4, (sls) obj3, (SheetValue) obj2, (tls) obj);
            default:
                renderPickupPoints$lambda$3$0$0 = TaxiPanoramaModalView.renderPickupPoints$lambda$3$0$0((TaxiPanoramaModalView) obj4, (t8y0) obj3, (wb90) obj2, (zzs) obj, z);
                return renderPickupPoints$lambda$3$0$0;
        }
    }

    public /* synthetic */ glr(boolean z, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
    }
}
