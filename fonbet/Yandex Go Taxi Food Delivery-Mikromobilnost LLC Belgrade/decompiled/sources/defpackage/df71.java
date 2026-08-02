package defpackage;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Result;

/* loaded from: classes7.dex */
public final class df71 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context, String str) {
        qi61 qi61Var;
        byte[] bArr;
        Object failure;
        byte[] decode;
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        if (a == null || (qi61Var = a.a0) == null) {
            qi61Var = qi61.c;
        }
        String str2 = qi61Var.a;
        dn60 dn60Var = new dn60(qi61Var.b, 15, (byte) 0);
        byte[] bytes = str.getBytes(uza.a);
        try {
            decode = Base64.decode(str2, 0);
        } catch (Throwable unused) {
        }
        if (decode != null) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr2);
            bArr = dn60Var.y(bytes, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
            if (bArr != null) {
                return null;
            }
            try {
                failure = Base64.encodeToString(bArr, 2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return (String) (failure instanceof Result.Failure ? null : failure);
        }
        bArr = null;
        if (bArr != null) {
        }
    }
}
