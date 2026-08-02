package yads;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import xsna.emb;

/* loaded from: classes10.dex */
public final class j53 {
    public final jn a;

    public /* synthetic */ j53() {
        this(new jn());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context, String str) {
        hm0 hm0Var;
        byte[] bArr;
        byte[] decode;
        qu2 a = gx2.a().a(context);
        if (a == null || (hm0Var = a.a0) == null) {
            hm0Var = hm0.c;
        }
        String str2 = hm0Var.a;
        ju1 ju1Var = new ju1(hm0Var.b, str2);
        byte[] bytes = str.getBytes(emb.b);
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
            bArr = ju1Var.a(bytes, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
            if (bArr != null) {
                return null;
            }
            this.a.getClass();
            return jn.a(bArr);
        }
        bArr = null;
        if (bArr != null) {
        }
    }

    public j53(jn jnVar) {
        this.a = jnVar;
    }
}
