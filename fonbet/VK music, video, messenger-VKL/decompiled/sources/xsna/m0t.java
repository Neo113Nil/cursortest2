package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes11.dex */
public interface m0t<T> extends ksr<T> {

    /* compiled from: ChannelFlow.kt */
    public static final class a {
        public static /* synthetic */ ksr a(m0t m0tVar, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow, int i2) {
            if ((i2 & 1) != 0) {
                dVar = EmptyCoroutineContext.b;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return m0tVar.a(dVar, i, bufferOverflow);
        }
    }

    ksr<T> a(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow);
}
