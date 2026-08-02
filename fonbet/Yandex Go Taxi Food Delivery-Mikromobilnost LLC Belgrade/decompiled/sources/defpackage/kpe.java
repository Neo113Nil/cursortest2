package defpackage;

import android.net.Uri;
import java.net.URI;
import ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.di.ICoreComponent;
import ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge;
import ru.rt.ebs.cryptosdk.core.initialization.di.IInitializationComponent;
import ru.rt.ebs.cryptosdk.core.instructions.di.IInstructionsComponent;
import ru.rt.ebs.cryptosdk.core.metadata.di.IMetadataComponent;
import ru.rt.ebs.cryptosdk.core.networkClient.di.INetworkClientComponent;
import ru.rt.ebs.cryptosdk.core.registration.di.IRegistrationComponent;
import ru.rt.ebs.cryptosdk.core.security.di.ISecurityComponent;
import ru.rt.ebs.cryptosdk.core.storage.di.IStorageComponent;
import ru.rt.ebs.cryptosdk.core.verification.adapter.di.IAdapterComponent;
import ru.rt.ebs.cryptosdk.core.verification.consumer.di.IConsumerComponent;
import ru.rt.ebs.cryptosdk.core.verification.ebs.di.IEbsComponent;
import ru.rt.ebs.cryptosdk.core.verification.esia.di.IEsiaComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationSessionComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;

/* loaded from: classes4.dex */
public final class kpe implements ICoreComponent {
    public final q4g A;
    public final boj0 B;
    public final q4g C;
    public final w3i D;
    public final an8 E;
    public final s421 F;
    public final kcz0 G;
    public final o021 H;
    public final ht10 I;
    public final an8 a;
    public final ht10 b;
    public final hwo0 c;
    public final boj0 w;
    public final xv10 x;
    public final hwo0 y;
    public final wrr z;

    public kpe(an8 an8Var, ht10 ht10Var, hwo0 hwo0Var, boj0 boj0Var, xv10 xv10Var, hwo0 hwo0Var2, wrr wrrVar, q4g q4gVar, boj0 boj0Var2, q4g q4gVar2, w3i w3iVar, an8 an8Var2, s421 s421Var, kcz0 kcz0Var, o021 o021Var, ht10 ht10Var2) {
        this.a = an8Var;
        this.b = ht10Var;
        this.c = hwo0Var;
        this.w = boj0Var;
        this.x = xv10Var;
        this.y = hwo0Var2;
        this.z = wrrVar;
        this.A = q4gVar;
        this.B = boj0Var2;
        this.C = q4gVar2;
        this.D = w3iVar;
        this.E = an8Var2;
        this.F = s421Var;
        this.G = kcz0Var;
        this.H = o021Var;
        this.I = ht10Var2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IAdapterComponent getAdapterComponent() {
        return this.B;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final ICommonComponent getCommonComponent() {
        return this.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IConsumerComponent getConsumerComponent() {
        return this.E;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IEbsComponent getEbsComponent() {
        return this.D;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IEsiaComponent getEsiaComponent() {
        return this.C;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IInitializationComponent getInitializationComponent() {
        return this.z;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IInstructionsComponent getInstructionsComponent() {
        return this.A;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IMetadataComponent getMetadataComponent() {
        return this.b;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final INetworkClientComponent getNetworkClientComponent() {
        return this.I;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IRegistrationComponent getRegistrationComponent() {
        return this.x;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final ISecurityComponent getSecurityComponent() {
        return this.y;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IStorageComponent getStorageComponent() {
        return this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IVerificationFlowBridge getVerificationFlowBridge() {
        return this.H;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IVerificationFlowComponent getVerificationFlowComponent() {
        return this.G;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final IVerificationSessionComponent getVerificationSessionComponent() {
        return this.F;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final void initVerificationFZ115(VerificationRequestScheme.FZ115 fz115, IVerificationRouter iVerificationRouter) {
        Exception exc = ((u6f0) this.a.getCommonController()).a;
        if (exc != null) {
            throw exc;
        }
        boj0 boj0Var = this.w;
        boj0Var.f().a(d70.a, fz115.getAdapterApiUri());
        boj0Var.f().a(d70.b, fz115.getConsumerApiUri());
        ((y831) this.F.getVerificationSessionController()).createSession(fz115);
        kcz0 kcz0Var = this.G;
        ((o021) kcz0Var.a).j = iVerificationRouter;
        ((a201) kcz0Var.getVerificationFlowController()).createFlowFZ115();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final void initVerificationWithoutEsia(VerificationRequestScheme.WithoutEsia withoutEsia, IVerificationRouter iVerificationRouter) {
        URI uploadUri = withoutEsia.getUploadUri();
        an8 an8Var = this.a;
        if (!juf0.c(Uri.parse(uploadUri.toString()), an8Var.getAllowedRedirectHosts())) {
            throw new EbsException(EbsException.NOT_ALLOWED_HOST_ERROR_CODE, oyr.p("Хост ", uploadUri.getHost(), " в параметре uploadUri отсутствует в списке допустимых"));
        }
        Exception exc = ((u6f0) an8Var.getCommonController()).a;
        if (exc != null) {
            throw exc;
        }
        boj0 boj0Var = this.w;
        boj0Var.f().a(d70.a, withoutEsia.getAdapterApiUri());
        boj0Var.f().a(d70.b, withoutEsia.getConsumerApiUri());
        ((y831) this.F.getVerificationSessionController()).createSession(withoutEsia);
        kcz0 kcz0Var = this.G;
        ((o021) kcz0Var.a).j = iVerificationRouter;
        ((a201) kcz0Var.getVerificationFlowController()).createFlowWithoutEsia();
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public final void release() {
        this.b.release();
        this.c.release();
        this.w.release();
        this.x.x = null;
        this.y.release();
        this.z.release();
        this.A.y = null;
        this.B.release();
        this.C.release();
        this.D.release();
        this.E.b = null;
        this.F.release();
        this.G.release();
        this.I.c = null;
        this.a.release();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.ICoreComponent
    public final void releaseVerification() {
        this.A.y = null;
        this.b.release();
        this.B.release();
        this.C.release();
        this.D.release();
        this.E.b = null;
        this.G.release();
        this.F.release();
        this.H.j = null;
    }
}
