package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public interface gqs extends tpr {
    static /* synthetic */ tpr c(gqs gqsVar, fse fseVar, int i, BufferOverflow bufferOverflow, int i2) {
        if ((i2 & 1) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return gqsVar.a(fseVar, i, bufferOverflow);
    }

    tpr a(fse fseVar, int i, BufferOverflow bufferOverflow);
}
