package com.google.android.gms.common;

import defpackage.cvw;
import defpackage.oyr;
import defpackage.sfu;
import defpackage.xra1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzk c;

    public /* synthetic */ d(boolean z, String str, zzk zzkVar) {
        this.a = z;
        this.b = str;
        this.c = zzkVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.a;
        String str = this.b;
        zzk zzkVar = this.c;
        String str2 = (z || !f.b(str, zzkVar, true, false).a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA_256);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        cvw.l(messageDigest);
        byte[] digest = messageDigest.digest(zzkVar.zzc());
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : digest) {
            char[] cArr2 = sfu.b;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & PKIBody._CCP];
            i2 += 2;
        }
        return xra1.a(oyr.w(str2, ": pkg=", str, ", sha256=", new String(cArr)), ", atk=", z, ", ver=12451000.false");
    }
}
