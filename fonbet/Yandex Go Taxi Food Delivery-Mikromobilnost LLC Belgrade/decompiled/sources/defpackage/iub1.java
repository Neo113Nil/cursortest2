package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.slot.SlotSize;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class iub1 {
    public static final void a(wj90 wj90Var, hfa0 hfa0Var, z0a0 z0a0Var, String str, tls tlsVar, sls slsVar, fid fidVar, int i) {
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(392896157);
        int i2 = i | (btsVar.k(wj90Var) ? 4 : 2) | (btsVar.e(hfa0Var) ? 32 : 16) | (btsVar.k(z0a0Var) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.e(tlsVar2) ? 16384 : 8192) | (btsVar.e(slsVar) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            re91.d(null, hfa0Var, z0a0Var, str, slsVar, btsVar, ((i2 >> 3) & HProv.ALG_CLASS_ALL) | (i2 & 8176));
            if (wj90Var == null) {
                btsVar.e0(394763234);
                btsVar.t(false);
                tlsVar2 = tlsVar;
            } else {
                btsVar.e0(394763235);
                x2y x2yVar = new x2y(1.0f, true);
                boolean z = ((i2 & 14) == 4) | ((i2 & HProv.ALG_CLASS_ALL) == 16384);
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    tlsVar2 = tlsVar;
                    Q = new ifa(wj90Var, tlsVar2, 3);
                    btsVar.o0(Q);
                } else {
                    tlsVar2 = tlsVar;
                }
                t791.a(x2yVar, wj90Var, false, null, null, null, (sls) Q, btsVar, (i2 << 3) & 112, 60);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(wj90Var, hfa0Var, z0a0Var, str, tlsVar2, slsVar, i);
        }
    }

    public static final void b(ola olaVar, hfa0 hfa0Var, z0a0 z0a0Var, String str, tls tlsVar, sls slsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1719775848);
        int i2 = i | (btsVar.k(olaVar) ? 4 : 2) | (btsVar.e(hfa0Var) ? 32 : 16) | (btsVar.k(z0a0Var) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | (btsVar.e(slsVar) ? 131072 : 65536) | (btsVar.e(tlsVar2) ? 1048576 : 524288);
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            dta1.a(null, false, null, false, false, wwg.S(477306468, true, new es60(olaVar, hfa0Var, z0a0Var, str, tlsVar, slsVar, tlsVar2), btsVar), btsVar, ImageMetadata.EDGE_MODE, 31);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(olaVar, hfa0Var, z0a0Var, str, tlsVar, slsVar, tlsVar2, i, 9);
        }
    }

    public static final void c(e711 e711Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1030202297);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(e711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-1079504196);
            e(e711Var, f530Var, null, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(-1079453604);
            d(e711Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(e711Var, f530Var, z, i, 21);
        }
    }

    public static final void d(e711 e711Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-453654878);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(e711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(ljs0.b(f530Var, 0.0f, SlotSize.XS.getSize(), 1), 1.0f);
            ved.a.getClass();
            ydb1.a(c, ved.b, wwg.S(-1585667087, true, new n911(e711Var, i3), btsVar), null, ved.c, null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(e711Var, f530Var, i, 11);
        }
    }

    public static final void e(e711 e711Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1751256761);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(e711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ety0Var3 = xya1.e(btsVar).h.a;
            } else {
                btsVar.Y();
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            boolean e = btsVar.e(e711Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new jl01(21, e711Var);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(f530Var, (tls) Q);
            SlotSize slotSize = SlotSize.XS;
            a5l0.d("", a, slotSize.getSize(), slotSize.getSize(), x4c.x, 0.0f, null, null, wwg.S(1384250291, true, new n911(e711Var, i3), btsVar), wwg.S(1234646217, true, new hex0(23, e711Var, ety0Var3), btsVar), btsVar, 905994246, 224);
            ety0Var2 = ety0Var3;
        } else {
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(e711Var, f530Var, ety0Var2, i, 9);
        }
    }

    public static ay5 f() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b = vcf.b("androidxBiometric", 3);
            vcf.d(b);
            vcf.e(b);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JCSP.AES_NAME, "AndroidKeyStore");
            vcf.c(keyGenerator, vcf.a(b));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new ay5(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject g(ay5 ay5Var) {
        IdentityCredential identityCredential;
        if (ay5Var == null) {
            return null;
        }
        Cipher cipher = ay5Var.b;
        if (cipher != null) {
            return wcf.b(cipher);
        }
        Signature signature = ay5Var.a;
        if (signature != null) {
            return wcf.a(signature);
        }
        Mac mac = ay5Var.c;
        if (mac != null) {
            return wcf.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = ay5Var.d) == null) {
            return null;
        }
        return xcf.a(identityCredential);
    }
}
