package com.ybsdk.feature.pin.internal.domain;

import android.app.KeyguardManager;
import android.content.pm.PackageManager;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import com.ybsdk.feature.pinstorage.internal.data.c;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.YbBiometrySuggestScreenRetryConfig;
import defpackage.bwb0;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gdf;
import defpackage.gqp0;
import defpackage.jhb;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pp51;
import defpackage.rt1;
import defpackage.rx5;
import defpackage.sx5;
import defpackage.trp0;
import defpackage.ux5;
import defpackage.v0c0;
import defpackage.w1u0;
import defpackage.wlp;
import defpackage.x4c;
import defpackage.y6i0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b {
    public final gdf a;
    public final c b;
    public final w1u0 c;
    public final com.ybsdk.feature.pin.internal.repositories.a d;
    public final a e;
    public final ux5 f;
    public final bwb0 g;
    public final AppAnalyticsReporter h;
    public int i;

    public b(gdf gdfVar, c cVar, w1u0 w1u0Var, com.ybsdk.feature.pin.internal.repositories.a aVar, a aVar2, ux5 ux5Var, bwb0 bwb0Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = gdfVar;
        this.b = cVar;
        this.c = w1u0Var;
        this.d = aVar;
        this.e = aVar2;
        this.f = ux5Var;
        this.g = bwb0Var;
        this.h = appAnalyticsReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:12:0x002b, B:13:0x008d, B:19:0x0047, B:20:0x0067, B:23:0x006c, B:28:0x0070, B:29:0x007b, B:25:0x00ab, B:26:0x00b2, B:35:0x0096, B:38:0x0054), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PinInteractor$decryptAndValidatePinToken$1 pinInteractor$decryptAndValidatePinToken$1;
        int i;
        Object e;
        v0c0 v0c0Var;
        PinTokenEntity pinTokenEntity;
        try {
            if (continuationImpl instanceof PinInteractor$decryptAndValidatePinToken$1) {
                pinInteractor$decryptAndValidatePinToken$1 = (PinInteractor$decryptAndValidatePinToken$1) continuationImpl;
                int i2 = pinInteractor$decryptAndValidatePinToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pinInteractor$decryptAndValidatePinToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pinInteractor$decryptAndValidatePinToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pinInteractor$decryptAndValidatePinToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        c cVar = this.b;
                        pinInteractor$decryptAndValidatePinToken$1.L$0 = str;
                        pinInteractor$decryptAndValidatePinToken$1.L$1 = str2;
                        pinInteractor$decryptAndValidatePinToken$1.L$2 = str3;
                        pinInteractor$decryptAndValidatePinToken$1.L$3 = this;
                        pinInteractor$decryptAndValidatePinToken$1.label = 1;
                        e = cVar.e(pinInteractor$decryptAndValidatePinToken$1);
                        if (e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pinTokenEntity = (PinTokenEntity) pinInteractor$decryptAndValidatePinToken$1.L$0;
                            kotlin.b.b(obj);
                            return new jhb(pinTokenEntity, (StartSessionState) obj);
                        }
                        this = (b) pinInteractor$decryptAndValidatePinToken$1.L$3;
                        str3 = (String) pinInteractor$decryptAndValidatePinToken$1.L$2;
                        str2 = (String) pinInteractor$decryptAndValidatePinToken$1.L$1;
                        str = (String) pinInteractor$decryptAndValidatePinToken$1.L$0;
                        kotlin.b.b(obj);
                        e = ((Result) obj).getValue();
                    }
                    if (e instanceof Result.Failure) {
                        e = null;
                    }
                    v0c0Var = (v0c0) e;
                    if (v0c0Var != null) {
                        throw new IllegalArgumentException("Encrypted pin can't be null");
                    }
                    try {
                        gdf gdfVar = this.a;
                        String str4 = v0c0Var.a;
                        gdfVar.getClass();
                        PinTokenEntity a = gdf.a(str, str4);
                        pinInteractor$decryptAndValidatePinToken$1.L$0 = a;
                        pinInteractor$decryptAndValidatePinToken$1.L$1 = null;
                        pinInteractor$decryptAndValidatePinToken$1.L$2 = null;
                        pinInteractor$decryptAndValidatePinToken$1.L$3 = null;
                        pinInteractor$decryptAndValidatePinToken$1.label = 2;
                        obj = this.g(a, str2, str3, pinInteractor$decryptAndValidatePinToken$1);
                        if (obj != coroutineSingletons) {
                            pinTokenEntity = a;
                            return new jhb(pinTokenEntity, (StartSessionState) obj);
                        }
                        return coroutineSingletons;
                    } catch (Exception e2) {
                        trp0 trp0Var = trp0.a;
                        trp0.e(new gqp0(e2, "Decrypt", false, "decryptAndValidatePinToken"));
                        return new Result.Failure(e2);
                    }
                }
            }
            if (i != 0) {
            }
            if (e instanceof Result.Failure) {
            }
            v0c0Var = (v0c0) e;
            if (v0c0Var != null) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pinInteractor$decryptAndValidatePinToken$1 = new PinInteractor$decryptAndValidatePinToken$1(this, continuationImpl);
        Object obj2 = pinInteractor$decryptAndValidatePinToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInteractor$decryptAndValidatePinToken$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        if (r5 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r6 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        if (r6 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PinInteractor$hasBiometric$1 pinInteractor$hasBiometric$1;
        Object obj;
        int i;
        Object obj2;
        Throwable a;
        boolean z;
        if (continuationImpl instanceof PinInteractor$hasBiometric$1) {
            pinInteractor$hasBiometric$1 = (PinInteractor$hasBiometric$1) continuationImpl;
            int i2 = pinInteractor$hasBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinInteractor$hasBiometric$1.label = i2 - Integer.MIN_VALUE;
                obj = pinInteractor$hasBiometric$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinInteractor$hasBiometric$1.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinInteractor$hasBiometric$1.label = 1;
                    obj = this.b.k(pinInteractor$hasBiometric$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    z = !((Boolean) obj).booleanValue();
                }
                if (((Boolean) obj).booleanValue() && ((com.ybsdk.feature.pin.internal.domain.biometric.a) this.f).c()) {
                    try {
                        a aVar = this.e;
                        aVar.getClass();
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(1, aVar.d());
                        obj2 = cipher;
                    } catch (Throwable th) {
                        obj2 = new Result.Failure(th);
                    }
                    a = Result.a(obj2);
                    if (a != null) {
                        z = true;
                    } else {
                        pinInteractor$hasBiometric$1.label = 2;
                        obj = e(a, pinInteractor$hasBiometric$1);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        pinInteractor$hasBiometric$1 = new PinInteractor$hasBiometric$1(this, continuationImpl);
        obj = pinInteractor$hasBiometric$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInteractor$hasBiometric$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
            a aVar2 = this.e;
            aVar2.getClass();
            Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher2.init(1, aVar2.d());
            obj2 = cipher2;
            a = Result.a(obj2);
            if (a != null) {
            }
        }
        z22 = false;
        return Boolean.valueOf(z22);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(1:(1:9)(2:22|23))(2:24|(1:26))|10|11|12|13|14|(1:16)|17))|27|6|(0)(0)|10|11|12|13|14|(0)|17) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PinInteractor$removePinBiometric$1 pinInteractor$removePinBiometric$1;
        int i;
        Throwable a;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof PinInteractor$removePinBiometric$1) {
            pinInteractor$removePinBiometric$1 = (PinInteractor$removePinBiometric$1) continuationImpl;
            int i2 = pinInteractor$removePinBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinInteractor$removePinBiometric$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinInteractor$removePinBiometric$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinInteractor$removePinBiometric$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinInteractor$removePinBiometric$1.label = 1;
                    if (this.b.t(pinInteractor$removePinBiometric$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.e.getClass();
                String str = a.d;
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                keyStore.deleteEntry(str);
                Object failure = zy11Var;
                a = Result.a(failure);
                if (a != null) {
                    x4c.g("Failed to remove key from keystore", a, oyr.p("Key: ", str, ", keystore: AndroidKeyStore"), null, 8);
                }
                return zy11Var;
            }
        }
        pinInteractor$removePinBiometric$1 = new PinInteractor$removePinBiometric$1(this, continuationImpl);
        Object obj2 = pinInteractor$removePinBiometric$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInteractor$removePinBiometric$1.label;
        if (i != 0) {
        }
        this.e.getClass();
        String str2 = a.d;
        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
        keyStore2.load(null);
        keyStore2.deleteEntry(str2);
        Object failure2 = zy11Var;
        a = Result.a(failure2);
        if (a != null) {
        }
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PinTokenEntity pinTokenEntity, String str, String str2, ContinuationImpl continuationImpl) {
        PinInteractor$saveAndValidatePinToken$1 pinInteractor$saveAndValidatePinToken$1;
        int i;
        Object y;
        try {
            if (continuationImpl instanceof PinInteractor$saveAndValidatePinToken$1) {
                pinInteractor$saveAndValidatePinToken$1 = (PinInteractor$saveAndValidatePinToken$1) continuationImpl;
                int i2 = pinInteractor$saveAndValidatePinToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pinInteractor$saveAndValidatePinToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pinInteractor$saveAndValidatePinToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pinInteractor$saveAndValidatePinToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        try {
                            this.a.getClass();
                            String b = gdf.b(str, pinTokenEntity);
                            c cVar = this.b;
                            pinInteractor$saveAndValidatePinToken$1.L$0 = pinTokenEntity;
                            pinInteractor$saveAndValidatePinToken$1.L$1 = str2;
                            pinInteractor$saveAndValidatePinToken$1.L$2 = this;
                            pinInteractor$saveAndValidatePinToken$1.label = 1;
                            y = cVar.y(b, pinInteractor$saveAndValidatePinToken$1);
                            if (y == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Exception e) {
                            trp0 trp0Var = trp0.a;
                            trp0.e(new gqp0(e, "Encrypt", false, "saveAndValidatePinToken"));
                            return new Result.Failure(e);
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.b.b(obj);
                                return (StartSessionState) obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (b) pinInteractor$saveAndValidatePinToken$1.L$2;
                        str2 = (String) pinInteractor$saveAndValidatePinToken$1.L$1;
                        pinTokenEntity = (PinTokenEntity) pinInteractor$saveAndValidatePinToken$1.L$0;
                        kotlin.b.b(obj);
                        y = ((Result) obj).getValue();
                    }
                    kotlin.b.b(y);
                    pinInteractor$saveAndValidatePinToken$1.L$0 = null;
                    pinInteractor$saveAndValidatePinToken$1.L$1 = null;
                    pinInteractor$saveAndValidatePinToken$1.L$2 = null;
                    pinInteractor$saveAndValidatePinToken$1.label = 2;
                    obj = this.g(pinTokenEntity, str2, null, pinInteractor$saveAndValidatePinToken$1);
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(y);
            pinInteractor$saveAndValidatePinToken$1.L$0 = null;
            pinInteractor$saveAndValidatePinToken$1.L$1 = null;
            pinInteractor$saveAndValidatePinToken$1.L$2 = null;
            pinInteractor$saveAndValidatePinToken$1.label = 2;
            obj = this.g(pinTokenEntity, str2, null, pinInteractor$saveAndValidatePinToken$1);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pinInteractor$saveAndValidatePinToken$1 = new PinInteractor$saveAndValidatePinToken$1(this, continuationImpl);
        Object obj2 = pinInteractor$saveAndValidatePinToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInteractor$saveAndValidatePinToken$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c7, code lost:
    
        if (r3 != r5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018c, code lost:
    
        if (r3 != r5) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Throwable th, ContinuationImpl continuationImpl) {
        PinInteractor$shouldRetryOnBiometricException$1 pinInteractor$shouldRetryOnBiometricException$1;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        String message;
        Object A;
        boolean z3;
        Object A2;
        Object obj = zy11.a;
        if (continuationImpl instanceof PinInteractor$shouldRetryOnBiometricException$1) {
            pinInteractor$shouldRetryOnBiometricException$1 = (PinInteractor$shouldRetryOnBiometricException$1) continuationImpl;
            int i4 = pinInteractor$shouldRetryOnBiometricException$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pinInteractor$shouldRetryOnBiometricException$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = pinInteractor$shouldRetryOnBiometricException$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinInteractor$shouldRetryOnBiometricException$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ProviderException providerException = th instanceof ProviderException ? (ProviderException) th : null;
                    boolean z4 = (providerException == null || (message = providerException.getMessage()) == null || !evu0.y(message, "Keystore key generation failed", false)) ? false : true;
                    boolean z5 = (th instanceof KeyPermanentlyInvalidatedException) || (th instanceof UnrecoverableKeyException) || z4;
                    rt1 rt1Var = this.h.g;
                    String valueOf = String.valueOf(th.getMessage());
                    int i5 = this.i;
                    Boolean valueOf2 = Boolean.valueOf(this.e.c);
                    com.ybsdk.feature.pin.internal.domain.biometric.a aVar = (com.ybsdk.feature.pin.internal.domain.biometric.a) this.f;
                    PackageManager packageManager = aVar.a.getPackageManager();
                    mrj mrjVar = aVar.b;
                    boolean z6 = z4;
                    rx5 rx5Var = new rx5(com.ybsdk.feature.pin.internal.domain.biometric.a.b(mrjVar.g(15)), com.ybsdk.feature.pin.internal.domain.biometric.a.b(mrjVar.g(255)), com.ybsdk.feature.pin.internal.domain.biometric.a.b(mrjVar.g(32768)));
                    boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.strongbox_keystore");
                    boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.fingerprint");
                    boolean hasSystemFeature3 = packageManager.hasSystemFeature("android.software.verified_boot");
                    boolean hasSystemFeature4 = packageManager.hasSystemFeature("android.hardware.biometrics.face");
                    boolean hasSystemFeature5 = packageManager.hasSystemFeature("android.hardware.biometrics.iris");
                    Object systemService = aVar.a.getSystemService("keyguard");
                    KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
                    boolean isDeviceSecure = keyguardManager != null ? keyguardManager.isDeviceSecure() : false;
                    Object systemService2 = aVar.a.getSystemService("keyguard");
                    KeyguardManager keyguardManager2 = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
                    String str = "BiometricErrorDiagnostics(deviceAuthState=" + rx5Var + ", securityFeatures=" + new sx5(hasSystemFeature, hasSystemFeature2, hasSystemFeature4, hasSystemFeature5, hasSystemFeature3, isDeviceSecure, keyguardManager2 != null ? keyguardManager2.isDeviceLocked() : false) + Extension.C_BRAKE;
                    LinkedHashMap w = g8e.w(5, Constants.KEY_MESSAGE, valueOf);
                    w.put("is_handled_exception", Boolean.valueOf(z5));
                    w.put("retry_count", Integer.valueOf(i5));
                    w.put("is_user_authentication_required", valueOf2);
                    w.put("biometric_error_diagnostics", str);
                    rt1Var.a.a("biometric.initialized_cipher_error", w);
                    if (z5) {
                        int i6 = this.i;
                        this.i = i6 + 1;
                        z = true;
                        if (i6 < 1) {
                            pinInteractor$shouldRetryOnBiometricException$1.label = 1;
                            if (c(pinInteractor$shouldRetryOnBiometricException$1) != obj3) {
                                i3 = 2;
                                pinInteractor$shouldRetryOnBiometricException$1.label = i3;
                                A = this.b.A(0, pinInteractor$shouldRetryOnBiometricException$1);
                                if (A == obj3) {
                                }
                            }
                            return obj3;
                        }
                    } else {
                        z = true;
                    }
                    if (z6 && ((CommonFeatureFlag) this.g.a.d(wlp.S0).getData()).isEnabled() && this.e.c) {
                        pinInteractor$shouldRetryOnBiometricException$1.label = 3;
                        if (c(pinInteractor$shouldRetryOnBiometricException$1) != obj3) {
                            i2 = 4;
                            pinInteractor$shouldRetryOnBiometricException$1.label = i2;
                            z3 = false;
                            A2 = this.b.A(0, pinInteractor$shouldRetryOnBiometricException$1);
                            if (A2 == obj3) {
                            }
                        }
                        return obj3;
                    }
                    this.i = 0;
                    z2 = false;
                } else if (i == 1) {
                    kotlin.b.b(obj2);
                    i3 = 2;
                    z = true;
                    pinInteractor$shouldRetryOnBiometricException$1.label = i3;
                    A = this.b.A(0, pinInteractor$shouldRetryOnBiometricException$1);
                    if (A == obj3) {
                        obj = A;
                    }
                } else if (i == 2) {
                    kotlin.b.b(obj2);
                    z = true;
                    z2 = z;
                } else if (i == 3) {
                    kotlin.b.b(obj2);
                    i2 = 4;
                    z = true;
                    pinInteractor$shouldRetryOnBiometricException$1.label = i2;
                    z3 = false;
                    A2 = this.b.A(0, pinInteractor$shouldRetryOnBiometricException$1);
                    if (A2 == obj3) {
                        obj = A2;
                    }
                } else {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    z = true;
                    z3 = false;
                    this.e.c = z3;
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            }
        }
        pinInteractor$shouldRetryOnBiometricException$1 = new PinInteractor$shouldRetryOnBiometricException$1(this, continuationImpl);
        Object obj22 = pinInteractor$shouldRetryOnBiometricException$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInteractor$shouldRetryOnBiometricException$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        PinInteractor$shouldShowBiometric$1 pinInteractor$shouldShowBiometric$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PinInteractor$shouldShowBiometric$1) {
            pinInteractor$shouldShowBiometric$1 = (PinInteractor$shouldShowBiometric$1) continuationImpl;
            int i2 = pinInteractor$shouldShowBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinInteractor$shouldShowBiometric$1.label = i2 - Integer.MIN_VALUE;
                obj = pinInteractor$shouldShowBiometric$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinInteractor$shouldShowBiometric$1.label;
                c cVar = this.b;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((com.ybsdk.feature.pin.internal.domain.biometric.a) this.f).c()) {
                        pinInteractor$shouldShowBiometric$1.label = 1;
                        obj = cVar.k(pinInteractor$shouldShowBiometric$1);
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    Integer num = (Integer) obj;
                    d6w n = y6i0.n(0, ((YbBiometrySuggestScreenRetryConfig) this.g.a.d(pp51.a).getData()).getRetriesNumber());
                    if (num != null && n.g(num.intValue())) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    pinInteractor$shouldShowBiometric$1.label = 2;
                    obj = cVar.c(pinInteractor$shouldShowBiometric$1);
                }
                return Boolean.valueOf(z);
            }
        }
        pinInteractor$shouldShowBiometric$1 = new PinInteractor$shouldShowBiometric$1(this, continuationImpl);
        obj = pinInteractor$shouldShowBiometric$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInteractor$shouldShowBiometric$1.label;
        c cVar2 = this.b;
        boolean z2 = false;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }

    public final Object g(PinTokenEntity pinTokenEntity, String str, String str2, ContinuationImpl continuationImpl) {
        return ((com.ybsdk.di.modules.features.pin.b) this.c).a(g8e.p(pinTokenEntity.getTokenUid(), Extension.DOT_CHAR, evu0.k0(pinTokenEntity.getToken()).toString()), str, str2, continuationImpl);
    }
}
