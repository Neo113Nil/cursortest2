package com.yandex.fintechsdk.security.impl.internal.devicechallenge;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import defpackage.abe;
import defpackage.bz5;
import defpackage.cz5;
import defpackage.dz5;
import defpackage.eaj;
import defpackage.eja1;
import defpackage.ez5;
import defpackage.g8e;
import defpackage.j9a;
import defpackage.kz5;
import defpackage.m6v;
import defpackage.mrj;
import defpackage.mu21;
import defpackage.nz5;
import defpackage.qz5;
import defpackage.tje;
import defpackage.uza;
import defpackage.wls;
import defpackage.z22;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import org.json.JSONObject;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes11.dex */
public final class a {
    public final z22 a;
    public final Context b;
    public final eaj c;
    public final m6v d;
    public final mu21 e;

    public a(z22 z22Var, Context context, eaj eajVar, m6v m6vVar, mu21 mu21Var) {
        this.a = z22Var;
        this.b = context;
        this.c = eajVar;
        this.d = m6vVar;
        this.e = mu21Var;
    }

    public final void a(FragmentActivity fragmentActivity, String str, int i, String str2, wls wlsVar) {
        tje.N(eja1.s(fragmentActivity), null, null, new DeviceChallengeHelperImpl$completionWithDelay$1(this, i, wlsVar, str, str2, null), 3);
    }

    public final PublicKey b() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(c(), 4);
        builder.setDigests(JCP.DIGEST_SHA_256);
        builder.setUserAuthenticationRequired(true);
        keyPairGenerator.initialize((Build.VERSION.SDK_INT >= 30 ? builder.setUserAuthenticationParameters(0, 3) : builder.setUserAuthenticationValidityDurationSeconds(-1)).build());
        return keyPairGenerator.generateKeyPair().getPublic();
    }

    public final String c() {
        String uid = this.e.a.getUid();
        String str = this.d.c.b;
        if (str == null) {
            str = "";
        }
        return g8e.p(uid, "-", str);
    }

    public final String d() {
        PublicKey publicKey;
        if (this.c.a()) {
            boolean z = new mrj(new abe(this.b, 2)).g(15) == 0;
            bz5 bz5Var = new bz5(z);
            z22 z22Var = this.a;
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(bz5Var);
            if (z) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(c())) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(kz5.c);
                        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                        keyStore2.load(null);
                        publicKey = keyStore2.getCertificate(c()).getPublicKey();
                    } else {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(dz5.c);
                        publicKey = b();
                        if (publicKey != null) {
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(ez5.c);
                        } else {
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new cz5("KeyPairGenerator.generateKeyPair() returned null"));
                        }
                    }
                } catch (Exception e) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new cz5(String.valueOf(e.getMessage())));
                    publicKey = null;
                }
                if (publicKey != null) {
                    return Base64.encodeToString(publicKey.getEncoded(), 2);
                }
            }
        }
        return null;
    }

    public final void e(FragmentActivity fragmentActivity, int i, int i2, String str, String str2, j9a j9aVar) {
        if (!this.c.a() || new mrj(new abe(this.b, 2)).g(15) != 0) {
            j9aVar.invoke(null, null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("purchase_token", str2);
        jSONObject.put("payment_method_id", str);
        jSONObject.put(ClidProvider.TIMESTAMP, System.currentTimeMillis() / 1000);
        String jSONObject2 = jSONObject.toString();
        nz5 nz5Var = new nz5(jSONObject2);
        com.yandex.fintechsdk.core.analytics.impl.internal.a aVar = (com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a;
        aVar.a(nz5Var);
        byte[] bytes = jSONObject2.getBytes(uza.a);
        String encodeToString = Base64.encodeToString(bytes, 2);
        aVar.a(qz5.c);
        tje.N(eja1.s(fragmentActivity), null, null, new DeviceChallengeHelperImpl$getSignature$1(this, i2, fragmentActivity, bytes, encodeToString, i, j9aVar, null), 3);
    }
}
