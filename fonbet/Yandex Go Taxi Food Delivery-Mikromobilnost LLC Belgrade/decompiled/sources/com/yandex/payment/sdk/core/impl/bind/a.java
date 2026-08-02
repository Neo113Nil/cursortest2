package com.yandex.payment.sdk.core.impl.bind;

import android.content.res.Resources;
import android.util.Base64;
import defpackage.lwh0;
import defpackage.ocy;
import defpackage.pcy;
import defpackage.rzo;
import defpackage.sc8;
import defpackage.w511;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class a {
    public final Resources a;
    public final int b;

    public a(pcy pcyVar, Resources resources) {
        int i;
        this.a = resources;
        int i2 = ocy.a[pcyVar.a.ordinal()];
        if (i2 == 1) {
            i = lwh0.paymentsdk_bindings_key_debug;
        } else if (i2 == 2) {
            i = lwh0.paymentsdk_bindings_key_localdebug;
        } else if (i2 == 3) {
            i = lwh0.paymentsdk_bindings_key_debug;
        } else if (i2 == 4) {
            i = lwh0.paymentsdk_bindings_key_debug;
        } else {
            if (i2 != 5) {
                w511.b();
                throw null;
            }
            i = lwh0.paymentsdk_bindings_key_release;
        }
        this.b = i;
    }

    public final sc8 a(byte[] bArr) {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(rzo.R(this.a.openRawResource(this.b))));
        int length = bArr.length;
        DefaultCardDataCipher$CipherInfo defaultCardDataCipher$CipherInfo = DefaultCardDataCipher$CipherInfo.RSA_SHA512;
        defaultCardDataCipher$CipherInfo.getClass();
        DefaultCardDataCipher$CipherInfo defaultCardDataCipher$CipherInfo2 = DefaultCardDataCipher$CipherInfo.RSA_SHA256;
        if (length > ((rSAPublicKey.getModulus().bitLength() / 8) - (defaultCardDataCipher$CipherInfo == defaultCardDataCipher$CipherInfo2 ? 64 : 128)) - 2) {
            defaultCardDataCipher$CipherInfo = defaultCardDataCipher$CipherInfo2;
        }
        Cipher cipher = Cipher.getInstance(defaultCardDataCipher$CipherInfo.getAlgorithm());
        cipher.init(1, rSAPublicKey);
        return new sc8(Base64.encodeToString(cipher.doFinal(bArr), 2), defaultCardDataCipher$CipherInfo.getHashAlgorithm());
    }
}
