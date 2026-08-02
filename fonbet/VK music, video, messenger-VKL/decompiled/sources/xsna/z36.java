package xsna;

import androidx.lifecycle.Lifecycle;
import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes13.dex */
public interface z36 extends Closeable, e5z, ot80 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @androidx.lifecycle.o(Lifecycle.Event.ON_DESTROY)
    void close();
}
