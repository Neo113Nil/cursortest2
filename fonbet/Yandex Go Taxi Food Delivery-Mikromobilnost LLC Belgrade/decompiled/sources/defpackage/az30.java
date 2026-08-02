package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.GeoObjectSession;
import com.yandex.runtime.Error;
import java.io.IOException;
import kotlin.Result;
import ru.yandex.taxi.masstransit.datasource.schedule.MtScheduleInfoService$scheduleRequest0E7RQCE$$inlined$suspendCallbackApi$2;

/* loaded from: classes6.dex */
public final class az30 implements GeoObjectSession.GeoObjectListener {
    public final /* synthetic */ MtScheduleInfoService$scheduleRequest0E7RQCE$$inlined$suspendCallbackApi$2 a;

    public az30(MtScheduleInfoService$scheduleRequest0E7RQCE$$inlined$suspendCallbackApi$2 mtScheduleInfoService$scheduleRequest0E7RQCE$$inlined$suspendCallbackApi$2) {
        this.a = mtScheduleInfoService$scheduleRequest0E7RQCE$$inlined$suspendCallbackApi$2;
    }

    @Override // com.yandex.mapkit.GeoObjectSession.GeoObjectListener
    public final void onGeoObjectError(Error error) {
        this.a.invoke(new Result(new Result.Failure(new IOException("Error " + error + " during stop schedule request"))));
    }

    @Override // com.yandex.mapkit.GeoObjectSession.GeoObjectListener
    public final void onGeoObjectResult(GeoObject geoObject) {
        this.a.invoke(new Result(geoObject));
    }
}
