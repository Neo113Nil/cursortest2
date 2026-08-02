package com.yandex.passport.internal.usecase;

import android.util.Base64;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.q6;
import com.yandex.passport.internal.report.yd;
import defpackage.f73;
import java.io.Serializable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class j {
    public final r0 a;
    public final com.yandex.passport.internal.report.reporters.w b;
    public final com.yandex.passport.internal.flags.j c;
    public final ThreadLocal d = ThreadLocal.withInitial(new i(0));

    public j(com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.report.reporters.w wVar, r0 r0Var) {
        this.a = r0Var;
        this.b = wVar;
        this.c = jVar;
    }

    public final byte[] a(String str, byte[] bArr) {
        Cipher cipher;
        byte[] doFinal;
        ThreadLocal threadLocal = this.d;
        if (threadLocal == null || (cipher = (Cipher) threadLocal.get()) == null) {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        byte[] m = f73.m(0, 12, bArr);
        byte[] m2 = f73.m(12, bArr.length, bArr);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, m);
        Serializable a = this.a.a(str, "decrypt");
        kotlin.b.b(a);
        SecretKey secretKey = (SecretKey) a;
        synchronized (cipher) {
            cipher.init(2, secretKey, gCMParameterSpec);
            doFinal = cipher.doFinal(m2);
        }
        return doFinal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.Result$Failure] */
    public final Serializable b(String str, String str2) {
        String str3;
        byte[] decode;
        byte[] bytes;
        boolean z = false;
        if (str == null) {
            str = null;
        } else {
            try {
                try {
                    decode = Base64.decode(str, 2);
                    bytes = "PASSPORT_ENCRYPTED:".getBytes(r0.d);
                } catch (IllegalArgumentException e) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "decoded exception: " + e, 8);
                    }
                }
            } catch (Throwable th) {
                str3 = new Result.Failure(th);
            }
            if (decode.length >= bytes.length) {
                int length = bytes.length;
                for (int i = 0; i < length; i++) {
                    if (decode[i] != bytes[i]) {
                        break;
                    }
                }
                byte[] m = f73.m(bytes.length, decode.length, decode);
                if (((Boolean) this.c.b(com.yandex.passport.internal.flags.q.u0)).booleanValue()) {
                    str3 = new String(a(str2, m), r0.d);
                } else {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    byte[] m2 = f73.m(0, 12, m);
                    byte[] m3 = f73.m(12, m.length, m);
                    GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, m2);
                    Serializable a = this.a.a(str2, "decrypt");
                    kotlin.b.b(a);
                    cipher.init(2, (SecretKey) a, gCMParameterSpec);
                    str3 = new String(cipher.doFinal(m3), r0.d);
                }
                str = str3;
            }
        }
        Throwable a2 = Result.a(str);
        if (a2 != null) {
            com.yandex.passport.internal.report.reporters.w wVar = this.b;
            wVar.getClass();
            wVar.f(q6.w, new yd(a2), new com.yandex.passport.internal.report.i(str2, 6, z));
        }
        return str;
    }
}
