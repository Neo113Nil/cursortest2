package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import xsna.eyx;

/* compiled from: Timeout.kt */
/* loaded from: classes11.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient eyx b;

    public TimeoutCancellationException(String str, eyx eyxVar) {
        super(str);
        this.b = eyxVar;
    }
}
