package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.qta;

/* compiled from: Share.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class xtr {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r4 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> lbj0<T> a(ksr<? extends T> ksrVar, int i) {
        qta.g7.getClass();
        int i2 = qta.a.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (ksrVar instanceof sya) {
            sya syaVar = (sya) ksrVar;
            ksr<T> h = syaVar.h();
            BufferOverflow bufferOverflow = syaVar.d;
            if (h != null) {
                int i4 = syaVar.c;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (bufferOverflow != BufferOverflow.SUSPEND) {
                    if (i == 0) {
                        i3 = 1;
                    }
                    i3 = 0;
                }
                return new lbj0<>(i3, syaVar.b, bufferOverflow, h);
            }
        }
        return new lbj0<>(i3, EmptyCoroutineContext.b, BufferOverflow.SUSPEND, ksrVar);
    }
}
