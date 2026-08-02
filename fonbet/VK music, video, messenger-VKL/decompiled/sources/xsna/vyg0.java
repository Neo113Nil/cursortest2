package xsna;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SSLKeyStore.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class vyg0 extends FunctionReferenceImpl implements izs<Certificate, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(Certificate certificate) {
        Certificate certificate2 = certificate;
        uyg0 uyg0Var = (uyg0) this.receiver;
        return Boolean.valueOf(!uyg0Var.a || ((certificate2 instanceof X509Certificate) && !epx.f(((X509Certificate) certificate2).getSerialNumber(), uyg0Var.h)));
    }
}
