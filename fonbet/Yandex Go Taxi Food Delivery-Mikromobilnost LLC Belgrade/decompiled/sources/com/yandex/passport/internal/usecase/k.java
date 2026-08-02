package com.yandex.passport.internal.usecase;

import android.os.Build;
import android.util.Base64;
import com.yandex.passport.internal.report.r6;
import com.yandex.passport.internal.report.yd;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class k {
    public final r0 a;
    public final com.yandex.passport.internal.flags.j b;
    public final com.yandex.passport.internal.report.reporters.w c;
    public final ThreadLocal d = ThreadLocal.withInitial(new i(1));

    public k(com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.report.reporters.w wVar, r0 r0Var) {
        this.a = r0Var;
        this.b = jVar;
        this.c = wVar;
    }

    public final byte[] a(byte[] bArr, SecretKey secretKey) {
        Cipher cipher;
        byte[] byteArray;
        ThreadLocal threadLocal = this.d;
        if (threadLocal == null || (cipher = (Cipher) threadLocal.get()) == null) {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        synchronized (cipher) {
            cipher.init(1, secretKey);
            byte[] doFinal = cipher.doFinal(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write("PASSPORT_ENCRYPTED:".getBytes(r0.d));
            byteArrayOutputStream.write(cipher.getIV());
            byteArrayOutputStream.write(doFinal);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        return byteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.Result$Failure] */
    public final Serializable b(String str, String str2) {
        byte[] byteArray;
        com.yandex.passport.internal.flags.j jVar = this.b;
        try {
            if ((((Boolean) jVar.b(com.yandex.passport.internal.flags.q.h0)).booleanValue() || ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.g0)).booleanValue()) && !((List) jVar.b(com.yandex.passport.internal.flags.q.t0)).contains(Build.MODEL)) {
                if (str != null) {
                    boolean booleanValue = ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.u0)).booleanValue();
                    r0 r0Var = this.a;
                    if (booleanValue) {
                        byte[] bytes = str.getBytes(r0.d);
                        Serializable a = r0Var.a(str2, "encrypt");
                        kotlin.b.b(a);
                        byteArray = a(bytes, (SecretKey) a);
                    } else {
                        Charset charset = r0.d;
                        byte[] bytes2 = str.getBytes(charset);
                        Serializable a2 = r0Var.a(str2, "encrypt");
                        kotlin.b.b(a2);
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(1, (SecretKey) a2);
                        byte[] doFinal = cipher.doFinal(bytes2);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write("PASSPORT_ENCRYPTED:".getBytes(charset));
                        byteArrayOutputStream.write(cipher.getIV());
                        byteArrayOutputStream.write(doFinal);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    str = Base64.encodeToString(byteArray, 2);
                } else {
                    str = null;
                }
            }
        } catch (Throwable th) {
            str = new Result.Failure(th);
        }
        Throwable a3 = Result.a(str);
        if (a3 != null) {
            com.yandex.passport.internal.report.reporters.w wVar = this.c;
            wVar.getClass();
            wVar.f(r6.w, new yd(a3), new com.yandex.passport.internal.report.i(str2, 6, false));
        }
        return str;
    }
}
