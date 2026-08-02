package defpackage;

import android.util.Base64;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes3.dex */
public final class gdf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static PinTokenEntity a(String str, String str2) {
        ?? r1;
        String B0 = gvu0.B0(36, str2);
        d6w d6wVar = new d6w(0, str2.length() - 37, 1);
        byte[] decode = Base64.decode(d6wVar.isEmpty() ? "" : str2.substring(0, d6wVar.b + 1), 1);
        int length = decode.length;
        if (16 >= length) {
            int length2 = decode.length;
            if (length2 == 0) {
                r1 = EmptyList.a;
            } else if (length2 != 1) {
                r1 = new ArrayList(decode.length);
                for (byte b : decode) {
                    r1.add(Byte.valueOf(b));
                }
            } else {
                r1 = Collections.singletonList(Byte.valueOf(decode[0]));
            }
        } else {
            ArrayList arrayList = new ArrayList(16);
            for (int i = length - 16; i < length; i++) {
                arrayList.add(Byte.valueOf(decode[i]));
            }
            r1 = arrayList;
        }
        byte[] D0 = a.D0((Collection) r1);
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        vbb c = c(str, D0);
        cipher.init(2, (SecretKeySpec) c.a, (IvParameterSpec) c.b);
        return new PinTokenEntity(Base64.encodeToString(cipher.doFinal(j73.Y(decode, new d6w(0, decode.length - 17, 1))), 1), B0);
    }

    public static String b(String str, PinTokenEntity pinTokenEntity) {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        vbb c = c(str, null);
        cipher.init(1, (SecretKeySpec) c.a, (IvParameterSpec) c.b);
        return b64.j(Base64.encodeToString(f73.r(cipher.doFinal(Base64.decode(pinTokenEntity.getToken(), 1)), cipher.getIV()), 1), pinTokenEntity.getTokenUid());
    }

    public static vbb c(String str, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[16];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        }
        byte[] r = f73.r(MessageDigest.getInstance(JCP.DIGEST_SHA_256).digest(Base64.decode(str, 1)), bArr);
        vbb vbbVar = new vbb();
        vbbVar.a = new SecretKeySpec(j73.Y(r, new d6w(0, r.length - 17, 1)), "AES/CBC/NoPadding");
        vbbVar.b = new IvParameterSpec(j73.Y(r, new d6w(r.length - 16, r.length - 1, 1)));
        return vbbVar;
    }
}
