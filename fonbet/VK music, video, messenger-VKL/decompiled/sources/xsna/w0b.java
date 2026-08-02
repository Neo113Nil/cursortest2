package xsna;

import kotlinx.coroutines.channels.BufferOverflow;
import xsna.qta;

/* compiled from: Channel.kt */
/* loaded from: classes11.dex */
public final class w0b {
    public static nm8 a(int i, BufferOverflow bufferOverflow, tuq tuqVar, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            tuqVar = null;
        }
        if (i == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new e3j(1, bufferOverflow, tuqVar);
            }
            qta.g7.getClass();
            return new nm8(qta.a.b, tuqVar);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new nm8(i, tuqVar) : new e3j(i, bufferOverflow, tuqVar) : new nm8(Integer.MAX_VALUE, tuqVar) : bufferOverflow == BufferOverflow.SUSPEND ? new nm8(0, tuqVar) : new e3j(1, bufferOverflow, tuqVar);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new e3j(1, BufferOverflow.DROP_OLDEST, tuqVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
