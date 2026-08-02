package defpackage;

import android.content.Context;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.spec.NameAlgIdSpec;
import ru.CryptoPro.JCSP.CSPConfigBase;
import ru.CryptoPro.JCSP.params.PasswordParamsSpec;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController;
import ru.rt.ebs.cryptosdk.core.security.controllers.a;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.BioRngEbsException;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.InitializationSecurityEbsException;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.LicensingSecurityEbsException;
import ru.rt.ebs.cryptosdk.core.security.entities.exceptions.VerifySecurityEbsException;
import ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSFactory;

/* loaded from: classes4.dex */
public final class a7q0 implements ISecurityController {
    public final ICommonController a;
    public final p1b b;
    public final Map c;
    public final String d;
    public final ISdkDispatchers e;
    public hwo0 f;

    public a7q0(ICommonController iCommonController, p1b p1bVar, Map map, String str, ISdkDispatchers iSdkDispatchers) {
        this.a = iCommonController;
        this.b = p1bVar;
        this.c = map;
        this.d = str;
        this.e = iSdkDispatchers;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final ITLSFactory getTLSFactory() {
        hwo0 hwo0Var = this.f;
        if (hwo0Var != null) {
            return hwo0Var;
        }
        hwo0 hwo0Var2 = new hwo0(this.b, this.c);
        this.f = hwo0Var2;
        return hwo0Var2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final void init(Context context) {
        try {
            this.b.e(context);
        } catch (InitializationSecurityEbsException e) {
            Throwable cause = e.getCause();
            VerifySecurityEbsException verifySecurityEbsException = cause instanceof VerifySecurityEbsException ? (VerifySecurityEbsException) cause : null;
            if (verifySecurityEbsException != null) {
                this.a.failVerifyIntegrity(verifySecurityEbsException);
            }
            throw e;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final void initializeBioRNG() {
        try {
            String uuid = UUID.randomUUID().toString();
            String concat = "\\\\.\\HDIMAGE\\".concat(uuid);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(JCP.GOST_DH_2012_256_NAME, "JCSP");
            keyPairGenerator.initialize(new NameAlgIdSpec(concat));
            keyPairGenerator.initialize(new PasswordParamsSpec(null));
            keyPairGenerator.generateKeyPair();
            KeyStore keyStore = KeyStore.getInstance("HDIMAGE", "JCSP");
            keyStore.load(null, null);
            keyStore.deleteEntry(uuid);
        } catch (Exception e) {
            throw new BioRngEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final void installNewLicense(Token token) {
        try {
            if (CSPConfigBase.getCSPProviderInfo().getLicense().checkAndSave(token.getValue(), true) != 0) {
                throw new LicensingSecurityEbsException("Error occurred after checking the serial number");
            }
            EbsLogger.INSTANCE.info("License serial number installation is successful");
        } catch (Exception e) {
            if (!(e instanceof LicensingSecurityEbsException)) {
                throw new LicensingSecurityEbsException(e);
            }
            throw e;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final boolean isInitialized() {
        return CSPConfigBase.isInitiated();
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final boolean isLicenseStatusOk() {
        try {
            return CSPConfigBase.getCSPProviderInfo().getLicense().checkAndSave() == 0;
        } catch (Exception e) {
            if (e instanceof LicensingSecurityEbsException) {
                throw e;
            }
            throw new LicensingSecurityEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final void release() {
        this.f = null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final Object verify(Continuation continuation) {
        Object k0 = tje.k0(this.e.io(), new a(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController
    public final void verifyImmediately() {
        this.a.verifyIntegrity(new b7p0(8, this));
    }
}
