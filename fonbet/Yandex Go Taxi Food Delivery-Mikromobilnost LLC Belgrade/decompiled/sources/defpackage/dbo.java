package defpackage;

import android.net.Uri;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.EsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.SslErrorEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;

/* loaded from: classes4.dex */
public final class dbo implements IEsiaAuthWebClientListener {
    public final /* synthetic */ ebo a;

    public dbo(ebo eboVar) {
        this.a = eboVar;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onChangeUrlByRedirect(String str, String str2) {
        this.a.e0(new vao(str, str2));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final boolean onErrorLoadPage(int i, String str) {
        return false;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onPageCommitVisible() {
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onPageFinished() {
        ebo eboVar = this.a;
        if (jl40.l(((cbo) eboVar.a0()).a, xt41.c)) {
            return;
        }
        cbo a = cbo.a((cbo) eboVar.a0(), xt41.b);
        r0 r0Var = (r0) eboVar.c0();
        r0Var.getClass();
        r0Var.m(null, a);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onPageStarted() {
        ebo eboVar = this.a;
        cbo cboVar = new cbo(zt41.b, eboVar.b0());
        r0 r0Var = (r0) eboVar.c0();
        r0Var.getClass();
        r0Var.m(null, cboVar);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onProcessBrowserUrl(Uri uri) {
        if (uri != null) {
            this.a.e0(new wao(uri));
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onProcessError(EsiaVerificationEbsException esiaVerificationEbsException) {
        ebo eboVar = this.a;
        cbo a = cbo.a((cbo) eboVar.a0(), xt41.c);
        r0 r0Var = (r0) eboVar.c0();
        r0Var.getClass();
        r0Var.m(null, a);
        eboVar.E.getCurrentFlow().emit(esiaVerificationEbsException.isAccessDeniedError() ? new Event.Process(new AccessDeniedEsiaVerificationEbsException(esiaVerificationEbsException.getErrorCode(), esiaVerificationEbsException.getErrorMessage())) : new Event.Error(esiaVerificationEbsException));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onProcessEsiaUrlWithoutPath(Uri uri) {
        onProcessBrowserUrl(this.a.F.getHomePageUri());
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onProcessRedirectUrl(String str) {
        ebo eboVar = this.a;
        cbo a = cbo.a((cbo) eboVar.a0(), xt41.c);
        r0 r0Var = (r0) eboVar.c0();
        r0Var.getClass();
        r0Var.m(null, a);
        eboVar.E.getCurrentFlow().emit(new Event.Process(str));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener
    public final void onSslError(SslErrorEsiaVerificationEbsException sslErrorEsiaVerificationEbsException) {
        this.a.f0(new hao(sslErrorEsiaVerificationEbsException));
    }
}
