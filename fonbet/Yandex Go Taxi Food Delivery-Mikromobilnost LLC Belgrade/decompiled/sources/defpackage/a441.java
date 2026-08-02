package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.go.where_you_are.impl.router.a;
import com.yandex.messaging.chat.attachments.c;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$UpdateTargetsState$Target;
import com.yandex.plus.home.state.UpdateTargetEvent;
import java.io.InputStream;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.AdES.AdESConfig;
import ru.CryptoPro.CAdES.envelope.EnvelopedOptions;
import ru.CryptoPro.CAdES.exception.EnvelopedException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Parameters;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost3412_15_Encryption_Parameters;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_12_KEG_Parameters;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.KeyStore.KeyLockInterface;
import ru.CryptoPro.JCP.params.G3412ParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.OmacParamsSpec;
import ru.CryptoPro.JCP.spec.GostCipherSpec;
import ru.yandex.taxi.widget.wheel.WheelView;
import yads.e42;
import yads.el2;
import yads.fl2;
import yads.gp1;
import yads.hw2;
import yads.jk3;
import yads.lv1;
import yads.mp1;
import yads.og3;
import yads.q63;
import yads.qp1;
import yads.s83;
import yads.t52;
import yads.vp2;
import yads.xp2;
import yads.zp1;

/* loaded from: classes7.dex */
public final class a441 implements y821, ky41, rzb, o651, p2r, wp61, kk71, kyv, lu61, KeyLockInterface, g291, vk61, qe71, re81, e381, pj71, jm71, jm81 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0096, code lost:
    
        if (r9.equals(ru.CryptoPro.JCP.JCP.GOST_DH_2012_512_NAME) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00b1, code lost:
    
        if (r9.equals(ru.CryptoPro.JCP.JCP.GOST_DH_2012_256_NAME) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x003a, code lost:
    
        if (r7.equals(r10.a) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0144 A[Catch: all -> 0x023e, Exception -> 0x0242, TryCatch #7 {Exception -> 0x0242, all -> 0x023e, blocks: (B:8:0x0024, B:25:0x00bf, B:36:0x0149, B:40:0x016d, B:51:0x019c, B:93:0x0158, B:96:0x0167, B:97:0x0116, B:103:0x012f, B:105:0x0144, B:12:0x0045, B:115:0x00b3, B:121:0x00ab), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b A[Catch: all -> 0x003d, Exception -> 0x0041, TRY_ENTER, TryCatch #8 {Exception -> 0x0041, all -> 0x003d, blocks: (B:124:0x0034, B:28:0x00e4, B:30:0x00ec, B:32:0x00f4, B:35:0x00fd, B:39:0x0162, B:42:0x017b, B:45:0x0184, B:47:0x018c, B:99:0x011e, B:19:0x007e, B:22:0x0098, B:110:0x00a5, B:111:0x00aa, B:112:0x0087, B:119:0x0090), top: B:123:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca A[Catch: all -> 0x01ba, Exception -> 0x01bd, TryCatch #0 {Exception -> 0x01bd, blocks: (B:53:0x01a5, B:56:0x01ad, B:57:0x01c2, B:59:0x01ca, B:60:0x0227, B:68:0x01d8, B:70:0x01e0, B:71:0x01ee, B:73:0x01f6, B:74:0x0204, B:76:0x020c, B:77:0x021a, B:78:0x01c0), top: B:52:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8 A[Catch: all -> 0x01ba, Exception -> 0x01bd, TryCatch #0 {Exception -> 0x01bd, blocks: (B:53:0x01a5, B:56:0x01ad, B:57:0x01c2, B:59:0x01ca, B:60:0x0227, B:68:0x01d8, B:70:0x01e0, B:71:0x01ee, B:73:0x01f6, B:74:0x0204, B:76:0x020c, B:77:0x021a, B:78:0x01c0), top: B:52:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158 A[Catch: all -> 0x023e, Exception -> 0x0242, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0242, all -> 0x023e, blocks: (B:8:0x0024, B:25:0x00bf, B:36:0x0149, B:40:0x016d, B:51:0x019c, B:93:0x0158, B:96:0x0167, B:97:0x0116, B:103:0x012f, B:105:0x0144, B:12:0x0045, B:115:0x00b3, B:121:0x00ab), top: B:7:0x0024 }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a441(PrivateKey privateKey, xr1 xr1Var, xr1 xr1Var2, byte[] bArr, nr41 nr41Var, EnvelopedOptions envelopedOptions) {
        SecretKey secretKey;
        String str;
        u2 u2Var;
        boolean equals;
        u2 u2Var2;
        String str2;
        Asn1BerDecodeBuffer asn1BerDecodeBuffer;
        u2 u2Var3;
        boolean equals2;
        int i;
        byte[] bArr2;
        OID oid;
        Cipher cipher;
        String str3;
        String str4;
        AlgorithmParameterSpec gostCipherSpec;
        this.a = 13;
        ?? r5 = 1;
        ?? r52 = 1;
        boolean z = lu61.p5 || (envelopedOptions != null && envelopedOptions.csp().isCopySecretKeyToLocalContext());
        try {
            str = xr1Var.a.a;
            u2Var = lu61.i5;
            equals = str.equals(u2Var.a);
            u2Var2 = lu61.j5;
        } catch (Exception e) {
            e = e;
            r52 = 0;
        } catch (Throwable th) {
            th = th;
            r5 = 0;
        }
        try {
            if (!equals) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    secretKey = null;
                    throw new EnvelopedException("Input cipher initiation failed", e);
                } catch (Throwable th2) {
                    th = th2;
                    secretKey = null;
                    if (z) {
                        ((SpecKey) secretKey).clear();
                    }
                    throw th;
                }
            }
            Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(((i3) xr1Var.b.toASN1Primitive()).getEncoded());
            GostR3410_12_KEG_Parameters gostR3410_12_KEG_Parameters = new GostR3410_12_KEG_Parameters();
            gostR3410_12_KEG_Parameters.decode(asn1BerDecodeBuffer2);
            asn1BerDecodeBuffer2.reset();
            String oid2 = new OID(gostR3410_12_KEG_Parameters.algorithm.value).toString();
            String algorithm = privateKey.getAlgorithm();
            switch (algorithm.hashCode()) {
                case -1864865883:
                    break;
                case -1864863128:
                    break;
                case 752485737:
                    if (algorithm.equals(JCP.GOST_EL_2012_256_NAME)) {
                        if (!oid2.equals(lu61.n5.toString())) {
                            throw new EnvelopedException("Invalid KEG algorithm");
                        }
                        str2 = xr1Var2.a.a;
                        asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(xr1Var2.b.toASN1Primitive().getEncoded("DER"));
                        u2Var3 = lu61.e5;
                        equals2 = str2.equals(u2Var3.a);
                        u2 u2Var4 = lu61.f5;
                        u2 u2Var5 = lu61.d5;
                        u2 u2Var6 = lu61.g5;
                        if (!equals2 && !str2.equals(u2Var5.a) && !str2.equals(u2Var6.a) && !str2.equals(u2Var4.a)) {
                            Gost28147_89_Parameters gost28147_89_Parameters = new Gost28147_89_Parameters();
                            gost28147_89_Parameters.decode(asn1BerDecodeBuffer);
                            asn1BerDecodeBuffer.reset();
                            bArr2 = gost28147_89_Parameters.iv.value;
                            oid = new OID(gost28147_89_Parameters.encryptionParamSet.value);
                            String defaultEncryptionProvider = AdESConfig.getDefaultEncryptionProvider();
                            try {
                                try {
                                    if (str.equals(u2Var.a)) {
                                        str3 = "GostTransportM";
                                    } else if (str.equals(u2Var2.a)) {
                                        str3 = "GostTransportK";
                                    } else {
                                        cipher = Cipher.getInstance("GostTransport", defaultEncryptionProvider);
                                        cipher.init(4, privateKey);
                                        if (!str2.equals(u2Var3.a) && !str2.equals(u2Var6.a)) {
                                            if (!str2.equals(u2Var5.a) && !str2.equals(u2Var4.a)) {
                                                str4 = null;
                                                secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                                                if (AdESConfig.isJCP() && z) {
                                                    this.c = SecretKeyFactory.getInstance("LOCAL_CONTEXT", defaultEncryptionProvider).translateKey(secretKey);
                                                } else {
                                                    this.c = secretKey;
                                                }
                                                if (!str2.equals(u2Var3.a)) {
                                                    this.b = Cipher.getInstance("GOST3412_2015_K/CTR_ACPKM/NoPadding", defaultEncryptionProvider);
                                                    gostCipherSpec = new G3412ParamsSpec(bArr2, true);
                                                } else if (str2.equals(u2Var5.a)) {
                                                    this.b = Cipher.getInstance("GOST3412_2015_M/CTR_ACPKM/NoPadding", defaultEncryptionProvider);
                                                    gostCipherSpec = new G3412ParamsSpec(bArr2, true);
                                                } else if (str2.equals(u2Var6.a)) {
                                                    this.b = Cipher.getInstance("GOST3412_2015_K/OMAC_CTR/NoPadding", defaultEncryptionProvider);
                                                    gostCipherSpec = new OmacParamsSpec(nr41Var, bArr2, true);
                                                } else if (str2.equals(u2Var4.a)) {
                                                    this.b = Cipher.getInstance("GOST3412_2015_M/OMAC_CTR/NoPadding", defaultEncryptionProvider);
                                                    gostCipherSpec = new OmacParamsSpec(nr41Var, bArr2, true);
                                                } else {
                                                    this.b = Cipher.getInstance("GOST28147/CFB/NoPadding", defaultEncryptionProvider);
                                                    gostCipherSpec = new GostCipherSpec(bArr2, oid);
                                                }
                                                ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                                if (z || secretKey == null) {
                                                    return;
                                                }
                                                ((SpecKey) secretKey).clear();
                                                return;
                                            }
                                            str4 = "GOST3412_2015_M";
                                            secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                                            if (AdESConfig.isJCP()) {
                                            }
                                            this.c = secretKey;
                                            if (!str2.equals(u2Var3.a)) {
                                            }
                                            ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                            if (z) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        str4 = "GOST3412_2015_K";
                                        secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                                        if (AdESConfig.isJCP()) {
                                        }
                                        this.c = secretKey;
                                        if (!str2.equals(u2Var3.a)) {
                                        }
                                        ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                        if (z) {
                                        }
                                    }
                                    if (!str2.equals(u2Var3.a)) {
                                        if (!str2.equals(u2Var5.a)) {
                                            str4 = null;
                                            secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                                            if (AdESConfig.isJCP()) {
                                            }
                                            this.c = secretKey;
                                            if (!str2.equals(u2Var3.a)) {
                                            }
                                            ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                            if (z) {
                                            }
                                        }
                                        str4 = "GOST3412_2015_M";
                                        secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                                        if (AdESConfig.isJCP()) {
                                        }
                                        this.c = secretKey;
                                        if (!str2.equals(u2Var3.a)) {
                                        }
                                        ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                        if (z) {
                                        }
                                    }
                                    if (AdESConfig.isJCP()) {
                                    }
                                    this.c = secretKey;
                                    if (!str2.equals(u2Var3.a)) {
                                    }
                                    ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                    if (z) {
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    throw new EnvelopedException("Input cipher initiation failed", e);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (z && secretKey != null) {
                                    ((SpecKey) secretKey).clear();
                                }
                                throw th;
                            }
                            cipher = Cipher.getInstance(str3, defaultEncryptionProvider);
                            cipher.init(4, privateKey);
                            str4 = "GOST3412_2015_K";
                            secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                        }
                        i = (!str2.equals(u2Var3.a) || str2.equals(u2Var6.a)) ? 16 : 8;
                        Gost3412_15_Encryption_Parameters gost3412_15_Encryption_Parameters = new Gost3412_15_Encryption_Parameters();
                        gost3412_15_Encryption_Parameters.decode(asn1BerDecodeBuffer);
                        asn1BerDecodeBuffer.reset();
                        bArr2 = gost3412_15_Encryption_Parameters.ukm.value;
                        if (bArr2.length == (i >> 1) + 8) {
                            throw new EnvelopedException("Invalid UKM length");
                        }
                        oid = new OID(str2);
                        String defaultEncryptionProvider2 = AdESConfig.getDefaultEncryptionProvider();
                        if (str.equals(u2Var.a)) {
                        }
                        cipher = Cipher.getInstance(str3, defaultEncryptionProvider2);
                        cipher.init(4, privateKey);
                        if (!str2.equals(u2Var3.a)) {
                        }
                        str4 = "GOST3412_2015_K";
                        secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                        if (AdESConfig.isJCP()) {
                        }
                        this.c = secretKey;
                        if (!str2.equals(u2Var3.a)) {
                        }
                        ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                        if (z) {
                        }
                    }
                    throw new EnvelopedException("Unsupported KEG algorithm");
                case 752488492:
                    if (algorithm.equals(JCP.GOST_EL_2012_512_NAME)) {
                        if (!oid2.equals(lu61.o5.toString())) {
                            throw new EnvelopedException("Invalid KEG algorithm");
                        }
                        str2 = xr1Var2.a.a;
                        asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(xr1Var2.b.toASN1Primitive().getEncoded("DER"));
                        u2Var3 = lu61.e5;
                        equals2 = str2.equals(u2Var3.a);
                        u2 u2Var42 = lu61.f5;
                        u2 u2Var52 = lu61.d5;
                        u2 u2Var62 = lu61.g5;
                        if (!equals2) {
                            Gost28147_89_Parameters gost28147_89_Parameters2 = new Gost28147_89_Parameters();
                            gost28147_89_Parameters2.decode(asn1BerDecodeBuffer);
                            asn1BerDecodeBuffer.reset();
                            bArr2 = gost28147_89_Parameters2.iv.value;
                            oid = new OID(gost28147_89_Parameters2.encryptionParamSet.value);
                            String defaultEncryptionProvider22 = AdESConfig.getDefaultEncryptionProvider();
                            if (str.equals(u2Var.a)) {
                            }
                            cipher = Cipher.getInstance(str3, defaultEncryptionProvider22);
                            cipher.init(4, privateKey);
                            if (!str2.equals(u2Var3.a)) {
                            }
                            str4 = "GOST3412_2015_K";
                            secretKey = (SecretKey) cipher.unwrap(bArr, str4, 3);
                            if (AdESConfig.isJCP()) {
                            }
                            this.c = secretKey;
                            if (!str2.equals(u2Var3.a)) {
                            }
                            ((Cipher) this.b).init(2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                            if (z) {
                            }
                            break;
                        }
                        if (str2.equals(u2Var3.a)) {
                            break;
                        }
                        Gost3412_15_Encryption_Parameters gost3412_15_Encryption_Parameters2 = new Gost3412_15_Encryption_Parameters();
                        gost3412_15_Encryption_Parameters2.decode(asn1BerDecodeBuffer);
                        asn1BerDecodeBuffer.reset();
                        bArr2 = gost3412_15_Encryption_Parameters2.ukm.value;
                        if (bArr2.length == (i >> 1) + 8) {
                        }
                    }
                    throw new EnvelopedException("Unsupported KEG algorithm");
                default:
                    throw new EnvelopedException("Unsupported KEG algorithm");
            }
        } catch (Exception e4) {
            e = e4;
            secretKey = r52;
            throw new EnvelopedException("Input cipher initiation failed", e);
        } catch (Throwable th4) {
            th = th4;
            secretKey = r5;
            if (z) {
            }
            throw th;
        }
    }

    public static void x(MessengerParams messengerParams, w040 w040Var) {
        String v = cl91.v(true);
        y220 y220Var = messengerParams.i;
        w040Var.k(new ei41("disableOpenInNewTabButton", true), "1");
        w040Var.k(new ei41("disableNavigation", true), v);
        w040Var.k(new ei41("disableChatHeader", true), v);
        w040Var.k(new ei41("disableChatList", true), v);
        w040Var.k(new ei41("hideClose", true), "1");
        w040Var.k(new ei41("onboarding", true), "0");
        w040Var.k(new ei41("importantMessages", true), "0");
        w040Var.k(new ei41("recommended_chats", true), "0");
        w040Var.k(new ei41("recommendedChatsDisabledForAnonymous", true), "1");
        w040Var.k(new ei41("picturePicker", true), "0");
        w040Var.k(new ei41("disableStikers", true), cl91.v(messengerParams.f));
        w040Var.k(new ei41("voice", true), cl91.v(messengerParams.h));
        w040Var.k(new ei41("disableDisplayRestriction", true), cl91.v(messengerParams.g));
        w040Var.k(new ei41("translationLangCode", true), y220Var != null ? y220Var.a : null);
        w040Var.k(new ei41("translationSupportedLangCodes", true), null);
        w040Var.k(new ei41(DivkitThemeChangeListener.THEME_VARIABLE_NAME, true), null);
        w040Var.k(new ei41("memoryHistory", true), v);
        w040Var.k(new ei41("unreadCountDetailedWorkspace", true), "0");
        w040Var.k(new ei41("disableDownloadWithOAuth", false), "1");
        w040Var.k(new ei41("singleChatMode", false), cl91.v(false));
        w040Var.k(new ei41("unreadCountersByChats", false), "1");
    }

    @Override // defpackage.kk71, defpackage.e381, defpackage.jm71
    /* renamed from: a, reason: collision with other method in class */
    public void mo24a() {
        switch (this.a) {
            case 12:
                ((dl81) this.c).e(rf71.f);
                break;
            case 24:
                pb81 pb81Var = (pb81) this.c;
                String str = ((hw2) this.b).b;
                q63 q63Var = q63.j;
                ExecutorService executorService = pb81.d;
                pb81Var.a(str, q63Var, b.f());
                break;
            default:
                ji41 ji41Var = (ji41) this.b;
                if (ji41Var != null) {
                    ji41Var.mo24a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jm71
    public void b() {
        x071 x071Var;
        t52 t52Var = (t52) ((yp61) ((s421) this.c).b).d();
        if (t52Var != null && (x071Var = t52Var.c.b) != null) {
            CheckBox muteControl = x071Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(null);
                muteControl.setVisibility(8);
            }
            ProgressBar videoProgress = x071Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setProgress(0);
                videoProgress.setVisibility(8);
            }
            TextView countDownProgress = x071Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(8);
            }
        }
        ji41 ji41Var = (ji41) this.b;
        if (ji41Var != null) {
            ji41Var.b();
        }
    }

    @Override // defpackage.jm71
    public void c() {
        s421 s421Var = (s421) this.c;
        t52 t52Var = (t52) ((yp61) s421Var.b).d();
        if (t52Var != null) {
            sl81 sl81Var = (sl81) s421Var.w;
            t52Var.b.setVisibility(0);
            og3 og3Var = t52Var.a;
            og3Var.a.setVisibility(8);
            ImageView imageView = og3Var.b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            e42 e42Var = t52Var.c;
            vk81 vk81Var = (vk81) sl81Var.a;
            x071 x071Var = e42Var.b;
            i630 i630Var = vk81Var.a;
            if (x071Var != null) {
                CheckBox muteControl = x071Var.getMuteControl();
                if (muteControl != null) {
                    muteControl.setOnClickListener(new y7z0(20, vk81Var, muteControl));
                    muteControl.setVisibility(i630Var.b ? 0 : 8);
                }
                ProgressBar videoProgress = x071Var.getVideoProgress();
                if (videoProgress != null) {
                    videoProgress.setVisibility(i630Var.c ? 8 : 0);
                }
                TextView countDownProgress = x071Var.getCountDownProgress();
                if (countDownProgress != null) {
                    countDownProgress.setText("");
                    countDownProgress.setVisibility(0);
                }
            }
        }
        ji41 ji41Var = (ji41) this.b;
        if (ji41Var != null) {
            ji41Var.c();
        }
    }

    @Override // defpackage.kk71
    public zt5 d(w971 w971Var, long j) {
        int f;
        long j2 = w971Var.w;
        int min = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, w971Var.c - j2);
        dl81 dl81Var = (dl81) this.c;
        dl81Var.i(min);
        w971Var.I(dl81Var.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (true) {
            int i3 = dl81Var.c;
            int i4 = dl81Var.b;
            if (i3 - i4 < 4) {
                return j3 != -9223372036854775807L ? new zt5(-2, j3, j2 + i) : zt5.e;
            }
            int f2 = v071.f(i4, dl81Var.a);
            int i5 = dl81Var.b;
            if (f2 != 442) {
                dl81Var.m(i5 + 1);
            } else {
                dl81Var.m(i5 + 4);
                long a = g471.a(dl81Var);
                if (a != -9223372036854775807L) {
                    long c = ((lo61) this.b).c(a);
                    if (c > j) {
                        return j3 == -9223372036854775807L ? new zt5(-1, c, j2) : new zt5(0, -9223372036854775807L, j2 + i2);
                    }
                    long j4 = c + 100000;
                    int i6 = dl81Var.b;
                    if (j4 > j) {
                        return new zt5(0, -9223372036854775807L, j2 + i6);
                    }
                    j3 = c;
                    i2 = i6;
                }
                int i7 = dl81Var.c;
                int i8 = dl81Var.b;
                if (i7 - i8 >= 10) {
                    dl81Var.m(i8 + 9);
                    int s = dl81Var.s() & 7;
                    int i9 = dl81Var.c;
                    int i10 = dl81Var.b;
                    if (i9 - i10 >= s) {
                        dl81Var.m(i10 + s);
                        int i11 = dl81Var.c;
                        int i12 = dl81Var.b;
                        if (i11 - i12 >= 4) {
                            if (v071.f(i12, dl81Var.a) == 443) {
                                dl81Var.m(dl81Var.b + 4);
                                int x = dl81Var.x();
                                int i13 = dl81Var.c;
                                int i14 = dl81Var.b;
                                if (i13 - i14 < x) {
                                    dl81Var.m(i7);
                                } else {
                                    dl81Var.m(i14 + x);
                                }
                            }
                            while (true) {
                                int i15 = dl81Var.c;
                                int i16 = dl81Var.b;
                                if (i15 - i16 < 4 || (f = v071.f(i16, dl81Var.a)) == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                dl81Var.m(dl81Var.b + 4);
                                if (dl81Var.c - dl81Var.b < 2) {
                                    dl81Var.m(i7);
                                    break;
                                }
                                dl81Var.m(Math.min(dl81Var.c, dl81Var.b + dl81Var.x()));
                            }
                        } else {
                            dl81Var.m(i7);
                        }
                    } else {
                        dl81Var.m(i7);
                    }
                } else {
                    dl81Var.m(i7);
                }
                i = dl81Var.b;
            }
        }
    }

    @Override // defpackage.ky41
    public void e() {
        ux41 ux41Var = (ux41) this.b;
        ux41Var.a.block();
        ux41Var.c.block();
    }

    @Override // defpackage.rzb
    public void f() {
        ((ec31) this.b).invoke();
    }

    @Override // defpackage.ky41
    public void g(int i, boolean z) {
        ux41 ux41Var = (ux41) this.b;
        WheelView wheelView = ux41Var.b;
        vd11 currentSubtree = wheelView.getCurrentSubtree();
        int size = currentSubtree.b.size();
        WheelView wheelView2 = ux41Var.c;
        if (size == 0) {
            wheelView2.setVisibility(8);
            ((h2r) this.c).l(ux41Var.a.getSelectedItem(), i, -1, z);
            return;
        }
        wheelView2.setVisibility(0);
        wheelView2.setAdapter(new wd11(currentSubtree));
        int selectedItem = wheelView2.getSelectedItem();
        if (selectedItem >= wheelView2.getItemsCount()) {
            selectedItem = wheelView2.getItemsCount() - 1;
        }
        wheelView2.setCurrentItem(selectedItem);
        ux41Var.e.g(wheelView.getSelectedItem(), z);
    }

    @Override // ru.CryptoPro.JCP.KeyStore.KeyLockInterface
    public Map getDeniedAliases() {
        return (HashMap) this.b;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.KeyLockInterface
    public ReentrantReadWriteLock getLock() {
        return (ReentrantReadWriteLock) this.c;
    }

    @Override // defpackage.re81
    public String h(fe81 fe81Var) {
        String str = ((c171) fe81Var.b.b).d;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // defpackage.ky41
    public void i() {
        ux41 ux41Var = (ux41) this.b;
        ux41Var.a.unblock();
        ux41Var.c.unblock();
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        ((fl2) this.c).invoke(jk3Var);
    }

    @Override // defpackage.qe71
    public mb71 k(kh61 kh61Var, bq71 bq71Var) {
        return new xrr((Context) this.c, kh61Var, bq71Var, (v981) this.b);
    }

    @Override // defpackage.wp61
    public hm61 l(int i, int i2) {
        wp61[] wp61VarArr = (wp61[]) this.c;
        int length = wp61VarArr.length;
        int i3 = 0;
        while (i3 < length) {
            hm61 l = wp61VarArr[i3].l(i, i2);
            int i4 = l.a;
            i3++;
            i2 = l.b;
            i = i4;
        }
        hm61 hm61Var = (hm61) this.b;
        hm61Var.a = i;
        hm61Var.b = i2;
        return hm61Var;
    }

    @Override // defpackage.pj71
    public void m(View view, uy71 uy71Var) {
    }

    @Override // defpackage.kyv
    public InputStream n(InputStream inputStream) {
        return new js61(this, inputStream, (Cipher) this.b, 1);
    }

    @Override // defpackage.pj71
    public void o(uy71 uy71Var, vj81 vj81Var) {
        fj71 fj71Var = uy71Var.d;
        vi71 vi71Var = (vi71) this.c;
        o081 o081Var = (o081) this.b;
        vi71Var.getClass();
        if (!uy71Var.e || fj71Var == null) {
            return;
        }
        vj81Var.b(fj71Var, new jq81(uy71Var, (b181) vi71Var.b, o081Var, (iz71) vi71Var.c, (bl61) vi71Var.w));
    }

    @Override // defpackage.rzb
    public void onCancel() {
        a aVar;
        kz41 kz41Var;
        cz41 cz41Var = (cz41) this.c;
        if (((WhereYouAreModalView) cz41Var.a.b.a().i(WhereYouAreModalView.class)) == null && (kz41Var = (aVar = cz41Var.a).j) != null) {
            aVar.b(new kz41(kz41Var.a, kz41Var.b, kz41Var.c, kz41Var.d, kz41Var.e, true));
        }
    }

    @Override // defpackage.jm81
    public boolean p(zp1 zp1Var, Class cls) {
        xp2 xp2Var = zp1Var.i;
        return xp2Var != null && xp2Var.b == mp1.d && MediatedRewardedAdapter.class.isAssignableFrom(cls);
    }

    @Override // defpackage.jm81
    public com.monetization.ads.mediation.base.a q(Context context, zp1 zp1Var) {
        vp2 vp2Var;
        MediatedInterstitialAdapter mediatedInterstitialAdapter;
        d881 d881Var = (d881) this.c;
        xp2 xp2Var = zp1Var.i;
        if (xp2Var == null || (vp2Var = xp2Var.c) == null || (mediatedInterstitialAdapter = (MediatedInterstitialAdapter) ((rr41) this.b).i(context, zp1Var, MediatedInterstitialAdapter.class)) == null) {
            return null;
        }
        return new gp1(mediatedInterstitialAdapter, d881Var, vp2Var);
    }

    @Override // defpackage.re81
    public String s(Context context, fe81 fe81Var, fw81 fw81Var) {
        Map map = ((qp1) this.b).c;
        in61 a = oy61.a(context, fe81Var, fw81Var);
        if (map != null) {
            a.i.putAll(map);
        }
        return ((c291) this.c).a(context, new v771(a).toString());
    }

    @Override // defpackage.qe71
    public mb71 t(hd71 hd71Var, bq71 bq71Var) {
        return new xrr((Context) this.c, hd71Var, bq71Var, (v981) this.b);
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return ((AbstractCollection) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.qe71
    public mb71 u(bt81 bt81Var, bq71 bq71Var) {
        return new xrr((Context) this.c, bt81Var, bq71Var, (v981) this.b);
    }

    public synchronized String[] v() {
        try {
            if (((String[]) this.c) == null) {
                this.c = new String[((AbstractCollection) this.b).size()];
                Iterator it = ((AbstractCollection) this.b).iterator();
                int i = 0;
                while (it.hasNext()) {
                    ((String[]) this.c)[i] = ((mu61) it.next()).a;
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String[]) ((String[]) this.c).clone();
    }

    public void w(Set set) {
        UpdateTargetEvent updateTargetEvent;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            switch (xv41.a[((OutMessage$UpdateTargetsState$Target) it.next()).ordinal()]) {
                case 1:
                    updateTargetEvent = UpdateTargetEvent.ALL;
                    break;
                case 2:
                    updateTargetEvent = UpdateTargetEvent.PLUS_AMOUNT;
                    break;
                case 3:
                    updateTargetEvent = UpdateTargetEvent.PAY_BUTTON;
                    break;
                case 4:
                    updateTargetEvent = UpdateTargetEvent.FINTECH;
                    break;
                case 5:
                    updateTargetEvent = UpdateTargetEvent.FAMILY;
                    break;
                case 6:
                    updateTargetEvent = UpdateTargetEvent.PLAQUE;
                    break;
                case 7:
                    updateTargetEvent = UpdateTargetEvent.DAILY;
                    break;
                case 8:
                    updateTargetEvent = UpdateTargetEvent.APPWIDGET_DAILY;
                    break;
                default:
                    w511.b();
                    return;
            }
            arrayList.add(updateTargetEvent);
        }
        ((t821) ((wog) this.c).r.getValue()).a.g(kotlin.collections.a.N0(arrayList));
    }

    @Override // defpackage.re81
    public s83 a() {
        return s83.c;
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        switch (this.a) {
            case 17:
                ((el2) this.b).invoke((kc71) obj);
                break;
            default:
                ((Handler) this.b).post(new kx6(this, obj, SystemClock.elapsedRealtime(), 8));
                break;
        }
    }

    @Override // defpackage.p2r
    public void a(k2r k2rVar) {
        j18 j18Var = (j18) this.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(k2rVar);
        }
    }

    @Override // defpackage.p2r
    public void b(i2r i2rVar) {
        j18 j18Var = (j18) this.b;
        if (j18Var.t() instanceof mf60) {
            if (!((c) this.c).i.a(tz10.n) && (i2rVar instanceof l2r)) {
                j18Var.resumeWith(i2rVar);
            }
            if (i2rVar instanceof m2r) {
                j18Var.resumeWith(i2rVar);
            }
        }
    }

    @Override // defpackage.vk61
    public kg61 c(du71 du71Var, bq71 bq71Var) {
        return new ry61((v981) this.b, du71Var, bq71Var, (fe81) this.c);
    }

    public /* synthetic */ a441(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ a441(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public a441() {
        this.a = 14;
        this.b = new HashMap();
        this.c = new ReentrantReadWriteLock();
    }

    public a441(TreeSet treeSet) {
        this.a = 15;
        this.b = treeSet;
    }

    public a441(String[] strArr) {
        boolean z;
        this.a = 15;
        if (strArr == null) {
            ny61.g("CipherSuites may not be null");
            throw null;
        }
        this.b = new ArrayList(strArr.length);
        boolean z2 = false;
        for (String str : strArr) {
            if (str != null) {
                mu61 mu61Var = (mu61) mu61.B.get(str);
                if (mu61Var == null || !(z = mu61Var.x)) {
                    ny61.g("Unsupported ciphersuite ".concat(str));
                    throw null;
                }
                if (!z) {
                    z2 = z2 ? z2 : true;
                    if (!z) {
                        ny61.g(oyr.p("Cannot support ", str, " with currently installed providers"));
                        throw null;
                    }
                }
                ((AbstractCollection) this.b).add(mu61Var);
            } else {
                HashMap hashMap = mu61.A;
                ny61.g("Name must not be null");
                throw null;
            }
        }
    }

    public a441(s421 s421Var) {
        this.a = 27;
        this.c = s421Var;
    }

    public a441(Context context) {
        this.a = 29;
        vr vrVar = new vr(context, 18);
        cr71 cr71Var = new cr71(context, 3);
        this.b = vrVar;
        this.c = cr71Var;
    }

    public a441(Context context, cf71 cf71Var) {
        this.a = 23;
        this.b = new gr81(cf71Var);
        this.c = context.getApplicationContext();
    }

    public a441(Context context, v981 v981Var) {
        this.a = 21;
        this.b = v981Var;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public a441(Context context, fe81 fe81Var, v981 v981Var, hw2 hw2Var) {
        this.a = 24;
        pb81 pb81Var = new pb81(context, fe81Var, v981Var);
        this.b = hw2Var;
        this.c = pb81Var;
    }

    public a441(Context context, bs81 bs81Var, cf71 cf71Var) {
        this.a = 25;
        mj31 mj31Var = new mj31(context, bs81Var);
        this.b = cf71Var;
        this.c = mj31Var;
    }

    public a441(lo61 lo61Var) {
        this.a = 12;
        this.b = lo61Var;
        this.c = new dl81();
    }

    public a441(fe81 fe81Var) {
        this.a = 20;
        pf71 pf71Var = new pf71();
        this.b = fe81Var;
        this.c = pf71Var;
    }

    public a441(lv1 lv1Var) {
        this.a = 16;
        this.b = lv1Var;
        this.c = new a391();
    }

    public a441(qp1 qp1Var) {
        this.a = 22;
        c291 c291Var = new c291();
        this.b = qp1Var;
        this.c = c291Var;
    }

    public a441(wp61[] wp61VarArr) {
        this.a = 10;
        this.b = new hm61();
        this.c = wp61VarArr;
    }

    public a441(KSerializer kSerializer, sbx sbxVar) {
        this.a = 2;
        this.b = sbxVar;
        this.c = new v521(kSerializer);
    }

    public a441(androidx.window.layout.a aVar) {
        this.a = 6;
        androidx.window.java.core.a aVar2 = new androidx.window.java.core.a();
        this.b = aVar;
        this.c = aVar2;
    }

    public a441(wog wogVar) {
        this.a = 3;
        this.c = wogVar;
        this.b = new ey4(new cdz0(((t821) wogVar.r.getValue()).b, 12), 27);
    }
}
