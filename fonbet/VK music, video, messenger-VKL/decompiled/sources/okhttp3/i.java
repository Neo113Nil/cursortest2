package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* compiled from: Handshake.kt */
/* loaded from: classes8.dex */
public final class i extends Lambda implements gzs<List<? extends Certificate>> {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // xsna.gzs
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
