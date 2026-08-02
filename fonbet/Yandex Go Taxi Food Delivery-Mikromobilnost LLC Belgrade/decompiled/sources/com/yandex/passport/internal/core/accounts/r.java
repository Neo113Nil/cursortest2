package com.yandex.passport.internal.core.accounts;

import android.content.Context;
import android.util.Base64;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.d6w;
import defpackage.f73;
import defpackage.j73;
import defpackage.kgx;
import defpackage.uo2;
import defpackage.uza;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes8.dex */
public final class r {
    public static final Charset c = uza.a;
    public final Context a;
    public final com.yandex.passport.internal.storage.i b;

    public r(Context context, com.yandex.passport.internal.storage.i iVar) {
        this.a = context;
        this.b = iVar;
    }

    public static byte[] d(byte[] bArr) {
        if (bArr.length == 0) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "validateCheckSum failed: input empty", 8);
            }
            throw new Exception() { // from class: com.yandex.passport.internal.core.accounts.MasterTokenEncrypter$ChecksumValidationException
            };
        }
        byte[] D0 = kotlin.collections.a.D0(j73.X(bArr, new d6w(0, bArr.length - 2, 1)));
        int i = 0;
        for (byte b : D0) {
            i += b & 255;
        }
        if (((byte) i) == bArr[bArr.length - 1]) {
            return D0;
        }
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "validateCheckSum failed: checksum mismatch", 8);
        }
        throw new Exception() { // from class: com.yandex.passport.internal.core.accounts.MasterTokenEncrypter$ChecksumValidationException
        };
    }

    public final q a(String str) {
        byte[] bArr = com.yandex.passport.internal.entities.o.c;
        Context context = this.a;
        com.yandex.passport.internal.entities.o r = com.yandex.passport.internal.util.p.r(context.getPackageManager(), context.getPackageName());
        com.yandex.passport.internal.entities.o r2 = com.yandex.passport.internal.util.p.r(context.getPackageManager(), context.getPackageName());
        if ((r.c() && !r2.b()) || (r.b() && r2.b())) {
            return new q(str, null);
        }
        if (str == null) {
            return new q(str, null);
        }
        try {
            byte[] decode = Base64.decode(str, 2);
            try {
                p c2 = c();
                Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
                cipher.init(2, c2.c(), c2.b());
                return new q(new String(d(cipher.doFinal(decode)), c), null);
            } catch (Exception e) {
                return new q("-", e);
            }
        } catch (IllegalArgumentException e2) {
            return new q(str, e2);
        }
    }

    public final String b(String str) {
        byte[] bArr = com.yandex.passport.internal.entities.o.c;
        Context context = this.a;
        com.yandex.passport.internal.entities.o r = com.yandex.passport.internal.util.p.r(context.getPackageManager(), context.getPackageName());
        com.yandex.passport.internal.entities.o r2 = com.yandex.passport.internal.util.p.r(context.getPackageManager(), context.getPackageName());
        if ((r.c() && !r2.b()) || ((r.b() && r2.b()) || str == null)) {
            return str;
        }
        byte[] bytes = str.getBytes(c);
        int i = 0;
        for (byte b : bytes) {
            i += b & 255;
        }
        int length = bytes.length;
        byte[] copyOf = Arrays.copyOf(bytes, length + 1);
        copyOf[length] = (byte) i;
        p c2 = c();
        Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
        cipher.init(1, c2.c(), c2.b());
        return Base64.encodeToString(cipher.doFinal(copyOf), 2);
    }

    public final p c() {
        com.yandex.passport.internal.storage.i iVar = this.b;
        uo2 uo2Var = iVar.j;
        kgx[] kgxVarArr = com.yandex.passport.internal.storage.i.m;
        String str = (String) uo2Var.getValue(iVar, kgxVarArr[8]);
        if (str != null) {
            return new p(Base64.decode(str, 2));
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance(JCSP.AES_NAME);
        keyGenerator.init(128, SecureRandom.getInstance("SHA1PRNG"));
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        byte[] bArr = new byte[16];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        byte[] r = f73.r(encoded, bArr);
        iVar.j.setValue(iVar, kgxVarArr[8], Base64.encodeToString(r, 2));
        return new p(r);
    }
}
