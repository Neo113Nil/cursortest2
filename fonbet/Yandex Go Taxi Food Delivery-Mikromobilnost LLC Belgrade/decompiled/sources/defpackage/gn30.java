package defpackage;

import com.yandex.mapkit.transport.masstransit.LineInfo;
import com.yandex.mapkit.transport.masstransit.LineSession;
import com.yandex.runtime.Error;
import java.io.IOException;
import kotlin.Result;
import ru.yandex.taxi.masstransit.datasource.line.MtLineRepositoryImpl$mapKitRequestgIAlus$$inlined$suspendCallbackApi$2;

/* loaded from: classes6.dex */
public final class gn30 implements LineSession.LineListener {
    public final /* synthetic */ MtLineRepositoryImpl$mapKitRequestgIAlus$$inlined$suspendCallbackApi$2 a;

    public gn30(MtLineRepositoryImpl$mapKitRequestgIAlus$$inlined$suspendCallbackApi$2 mtLineRepositoryImpl$mapKitRequestgIAlus$$inlined$suspendCallbackApi$2) {
        this.a = mtLineRepositoryImpl$mapKitRequestgIAlus$$inlined$suspendCallbackApi$2;
    }

    @Override // com.yandex.mapkit.transport.masstransit.LineSession.LineListener
    public final void onLineError(Error error) {
        this.a.invoke(new Result(new Result.Failure(new IOException("Error " + error + " in masstransit stop request"))));
    }

    @Override // com.yandex.mapkit.transport.masstransit.LineSession.LineListener
    public final void onLineResponse(LineInfo lineInfo) {
        this.a.invoke(new Result(lineInfo));
    }
}
