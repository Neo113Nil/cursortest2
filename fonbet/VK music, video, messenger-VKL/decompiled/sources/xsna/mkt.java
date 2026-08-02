package xsna;

import com.vk.log.L;
import java.util.concurrent.CancellationException;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes2.dex */
public final class mkt extends kotlin.coroutines.a implements pvj {
    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        L.s(th instanceof CancellationException ? L.LogType.d : L.LogType.e, "GeoFeature/errorHandler", "handle error", th);
    }
}
