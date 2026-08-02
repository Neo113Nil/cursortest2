package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.GeoObjectSession;
import com.yandex.runtime.Error;
import java.io.IOException;
import kotlin.Result;
import ru.yandex.taxi.masstransit.datasource.schedule.MtStopInfoRepository$stopRequestgIAlus$$inlined$suspendCallbackApi$2;

/* loaded from: classes6.dex */
public final class p140 implements GeoObjectSession.GeoObjectListener {
    public final /* synthetic */ MtStopInfoRepository$stopRequestgIAlus$$inlined$suspendCallbackApi$2 a;

    public p140(MtStopInfoRepository$stopRequestgIAlus$$inlined$suspendCallbackApi$2 mtStopInfoRepository$stopRequestgIAlus$$inlined$suspendCallbackApi$2) {
        this.a = mtStopInfoRepository$stopRequestgIAlus$$inlined$suspendCallbackApi$2;
    }

    @Override // com.yandex.mapkit.GeoObjectSession.GeoObjectListener
    public final void onGeoObjectError(Error error) {
        this.a.invoke(new Result(new Result.Failure(new IOException("Error " + error + " in masstransit stop request"))));
    }

    @Override // com.yandex.mapkit.GeoObjectSession.GeoObjectListener
    public final void onGeoObjectResult(GeoObject geoObject) {
        this.a.invoke(new Result(geoObject));
    }
}
