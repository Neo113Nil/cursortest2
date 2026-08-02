package xsna;

import android.net.Uri;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OneVideoOfflineManager.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class lm80 extends FunctionReferenceImpl implements izs<Uri, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Uri uri) {
        Uri uri2 = uri;
        mm80 mm80Var = (mm80) this.receiver;
        synchronized (mm80Var) {
            androidx.media3.datasource.cache.c cVar = mm80Var.d;
            if (cVar == null) {
                throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
            }
            cVar.c(mm80Var.g.k(new evk(uri2)));
        }
        return s3q0.a;
    }
}
