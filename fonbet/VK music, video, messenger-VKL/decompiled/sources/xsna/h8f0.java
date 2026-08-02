package xsna;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: RealConnection.kt */
/* loaded from: classes8.dex */
public final class h8f0 extends Lambda implements gzs<List<? extends Certificate>> {
    final /* synthetic */ okhttp3.a $address;
    final /* synthetic */ gqa $certificatePinner;
    final /* synthetic */ okhttp3.j $unverifiedHandshake;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8f0(gqa gqaVar, okhttp3.j jVar, okhttp3.a aVar) {
        super(0);
        this.$certificatePinner = gqaVar;
        this.$unverifiedHandshake = jVar;
        this.$address = aVar;
    }

    @Override // xsna.gzs
    public final List<? extends Certificate> invoke() {
        return this.$certificatePinner.b.d(this.$address.h.d, this.$unverifiedHandshake.c());
    }
}
