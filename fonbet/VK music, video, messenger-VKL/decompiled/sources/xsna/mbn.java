package xsna;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes8.dex */
public final class mbn extends Lambda implements izs<IOException, s3q0> {
    final /* synthetic */ jbn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbn(jbn jbnVar) {
        super(1);
        this.this$0 = jbnVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(IOException iOException) {
        jbn jbnVar = this.this$0;
        byte[] bArr = x2r0.a;
        jbnVar.k = true;
        return s3q0.a;
    }
}
