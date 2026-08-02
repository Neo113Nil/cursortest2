package defpackage;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import ru.rt.ebs.cryptosdk.core.EbsCryptoCore;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.NotInitializedSdkEbsException;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.di.ICoreComponent;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient;
import ru.rt.ebs.cryptosdk.core.networkClient.entities.INetworkClient;
import ru.rt.ebs.cryptosdk.core.security.entities.models.TLSOptions;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationListener;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationResult;
import ru.rt.ebs.cryptosdk.entities.models.FZ115VerificationRequest;
import ru.rt.ebs.cryptosdk.entities.models.ProdEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.entities.models.VerificationWithoutEsiaRequest;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;
import ru.rt.ebs.cryptosdk.navigation.models.VerificationLauncher;

/* loaded from: classes4.dex */
public abstract class ajn extends EbsCryptoCore {
    public static final zin Companion = new zin();
    private static final String SERIAL_NUMBER = "5050N-K3010-01MCZ-XW06B-AQL2F";
    private x3v _sdkComponent;

    public static void a(ajn ajnVar, IVerificationListener iVerificationListener) {
        try {
            try {
                if (ajnVar._sdkComponent == null) {
                    iVerificationListener.onCancel();
                } else {
                    VerificationResult verificationResult = ((ICoreComponent) ((amp0) ajnVar.b()).a).getVerificationSessionComponent().getVerificationSessionController().getVerificationResult();
                    if (verificationResult instanceof VerificationResult.Error) {
                        iVerificationListener.onError(((VerificationResult.Error) verificationResult).getError());
                    } else if (verificationResult instanceof VerificationResult.Success) {
                        iVerificationListener.onSuccess(((VerificationResult.Success) verificationResult).getCookieVrf());
                    } else {
                        if (!(verificationResult instanceof VerificationResult.Cancel) && !(verificationResult instanceof VerificationResult.Empty)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iVerificationListener.onCancel();
                    }
                }
                ajnVar.c();
            } catch (Exception e) {
                EbsLogger.INSTANCE.error(e);
                iVerificationListener.onError(e);
                ajnVar.c();
            }
        } catch (Throwable th) {
            ajnVar.c();
            throw th;
        }
    }

    public final x3v b() {
        x3v x3vVar = this._sdkComponent;
        if (x3vVar != null) {
            return x3vVar;
        }
        throw new NotInitializedSdkEbsException();
    }

    public final void c() {
        try {
            if (isInitializedSdk()) {
                amp0 amp0Var = (amp0) b();
                ((u650) amp0Var.b).release();
                ((wrr) amp0Var.c).y = null;
                ((ICoreComponent) amp0Var.a).releaseVerification();
            }
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            throw e;
        }
    }

    public final VerificationLauncher createVerificationLauncherSdk(t50 t50Var, pey peyVar, IVerificationListener iVerificationListener) {
        return new VerificationLauncher(t50Var, peyVar, new t8j(22, this, iVerificationListener));
    }

    public final INetworkClient getNetworkClientSdk() {
        try {
            try {
                if (!isInitializedSdk()) {
                    throw new NotInitializedSdkEbsException();
                }
                ((ICoreComponent) ((amp0) b()).a).getInitializationComponent().getInitializationController().updateRegistrationNotSuspend();
                return ((ICoreComponent) ((amp0) b()).a).getNetworkClientComponent().getNetworkClient();
            } catch (Exception e) {
                EbsLogger.INSTANCE.error(e);
                throw e;
            }
        } catch (Exception e2) {
            EbsLogger.INSTANCE.error(e2);
            throw e2;
        }
    }

    public final void initializeSdk(Context context, IEbsCryptoSdkConfig iEbsCryptoSdkConfig, TLSOptions tLSOptions) {
        if (isInitializedSdk()) {
            return;
        }
        try {
            if (this._sdkComponent == null) {
                new fnp0();
                ICoreComponent createCoreComponent = createCoreComponent(context, new ProdEbsCryptoSdkConfig(new Token("")), iEbsCryptoSdkConfig);
                jnc jncVar = new jnc();
                u650 u650Var = new u650();
                wrr wrrVar = new wrr(createCoreComponent.getVerificationFlowComponent(), createCoreComponent.getEsiaComponent(), jncVar, createCoreComponent.getCommonComponent());
                amp0 amp0Var = new amp0();
                amp0Var.a = createCoreComponent;
                amp0Var.b = u650Var;
                amp0Var.c = wrrVar;
                IVerificationFlowComponent verificationFlowComponent = createCoreComponent.getVerificationFlowComponent();
                pgk0 pgk0Var = u650Var.b;
                if (pgk0Var == null) {
                    mc50 mc50Var = u650Var.a;
                    if (mc50Var == null) {
                        mc50Var = new mc50();
                        u650Var.a = mc50Var;
                    }
                    pgk0Var = new pgk0(4, mc50Var);
                    u650Var.b = pgk0Var;
                }
                verificationFlowComponent.registerVerificationRouter(pgk0Var);
                this._sdkComponent = amp0Var;
            }
            ((ICoreComponent) ((amp0) b()).a).getInitializationComponent().getInitializationController().initializeSdk(iEbsCryptoSdkConfig, tLSOptions, new Token(SERIAL_NUMBER));
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            throw e;
        }
    }

    public final void inject$cryptosdk_prodRelease(Object obj) {
        try {
            s5b1.e(obj, b());
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            throw e;
        }
    }

    public final boolean isInitializedSdk() {
        try {
            if (this._sdkComponent != null) {
                if (((ICoreComponent) ((amp0) b()).a).getInitializationComponent().getInitializationController().isInitializedSdk()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            EbsLogger.INSTANCE.warning("EbsCryptoSdk.isInitialized", e);
            return false;
        }
    }

    public final void registerLoggerSdk(IEbsLoggerClient iEbsLoggerClient) {
        EbsLogger.INSTANCE.addClient(iEbsLoggerClient);
    }

    public final void releaseSdk() {
        try {
            x3v x3vVar = this._sdkComponent;
            if (x3vVar != null) {
                ((amp0) x3vVar).release();
            }
            this._sdkComponent = null;
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            throw e;
        }
    }

    public final void startVerificationFZ115Sdk(FZ115VerificationRequest fZ115VerificationRequest, VerificationLauncher verificationLauncher, VideoResolutionRestrictions videoResolutionRestrictions) {
        try {
            c();
            amp0 amp0Var = (amp0) b();
            ICoreComponent iCoreComponent = (ICoreComponent) amp0Var.a;
            VerificationRequestScheme.FZ115 verificationRequestScheme = fZ115VerificationRequest.getVerificationRequestScheme();
            u650 u650Var = (u650) amp0Var.b;
            pgk0 pgk0Var = u650Var.b;
            if (pgk0Var == null) {
                mc50 mc50Var = u650Var.a;
                if (mc50Var == null) {
                    mc50Var = new mc50();
                    u650Var.a = mc50Var;
                }
                pgk0Var = new pgk0(4, mc50Var);
                u650Var.b = pgk0Var;
            }
            iCoreComponent.initVerificationFZ115(verificationRequestScheme, pgk0Var);
            wrr wrrVar = (wrr) amp0Var.c;
            wrrVar.z = fZ115VerificationRequest.getDesignOptions();
            wrrVar.A = videoResolutionRestrictions;
            verificationLauncher.startVerification$cryptosdk_prodRelease(((ICoreComponent) ((amp0) b()).a).getInitializationComponent().getInitializationController());
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            throw e;
        }
    }

    public final void startVerificationWithoutEsiaSdk(VerificationWithoutEsiaRequest verificationWithoutEsiaRequest, VerificationLauncher verificationLauncher, VideoResolutionRestrictions videoResolutionRestrictions) {
        try {
            c();
            amp0 amp0Var = (amp0) b();
            ICoreComponent iCoreComponent = (ICoreComponent) amp0Var.a;
            VerificationRequestScheme.WithoutEsia verificationRequestScheme = verificationWithoutEsiaRequest.getVerificationRequestScheme();
            u650 u650Var = (u650) amp0Var.b;
            pgk0 pgk0Var = u650Var.b;
            if (pgk0Var == null) {
                mc50 mc50Var = u650Var.a;
                if (mc50Var == null) {
                    mc50Var = new mc50();
                    u650Var.a = mc50Var;
                }
                pgk0Var = new pgk0(4, mc50Var);
                u650Var.b = pgk0Var;
            }
            iCoreComponent.initVerificationWithoutEsia(verificationRequestScheme, pgk0Var);
            wrr wrrVar = (wrr) amp0Var.c;
            wrrVar.z = verificationWithoutEsiaRequest.getDesignOptions();
            wrrVar.A = videoResolutionRestrictions;
            verificationLauncher.startVerification$cryptosdk_prodRelease(((ICoreComponent) ((amp0) b()).a).getInitializationComponent().getInitializationController());
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            throw e;
        }
    }

    public final void unregisterLoggerSdk(IEbsLoggerClient iEbsLoggerClient) {
        EbsLogger.INSTANCE.removeClient(iEbsLoggerClient);
    }
}
