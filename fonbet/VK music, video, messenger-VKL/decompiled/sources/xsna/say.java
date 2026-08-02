package xsna;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
/* loaded from: classes.dex */
public final class say extends Lambda implements izs<Throwable, Throwable> {
    public static final say i = new say(1);

    @Override // xsna.izs
    public final Throwable invoke(Throwable th) {
        Throwable th2 = th;
        return th2 == null ? new IOException("Unknown IOException") : th2;
    }
}
