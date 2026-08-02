package xsna;

import androidx.datastore.core.CorruptionException;
import java.io.IOException;

/* compiled from: ReplaceFileCorruptionHandler.jvm.kt */
/* loaded from: classes.dex */
public final class x0g0<T> implements twj<T> {
    public final izs<CorruptionException, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public x0g0(izs<? super CorruptionException, ? extends T> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.twj
    public final Object a(CorruptionException corruptionException) throws IOException {
        return this.b.invoke(corruptionException);
    }
}
