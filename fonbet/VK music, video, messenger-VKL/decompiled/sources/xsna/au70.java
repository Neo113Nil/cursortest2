package xsna;

import android.net.Uri;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OfflineHelper.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class au70 extends FunctionReferenceImpl implements izs<Uri, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Uri uri) {
        RuntimeException runtimeException;
        Uri uri2 = uri;
        synchronized (((bu70) this.receiver)) {
            androidx.media3.datasource.cache.c cVar = bu70.d;
            if (cVar == null) {
                runtimeException = cu70.a;
                throw runtimeException;
            }
            cVar.c(bu70.g.k(new evk(uri2)));
        }
        return s3q0.a;
    }
}
