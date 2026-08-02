package xsna;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PackageInfoExt.kt */
/* loaded from: classes5.dex */
public final class u790 {
    public static final boolean a(PackageInfo packageInfo, List<String> list) {
        Signature[] signatureArr;
        Object obj;
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo == null || (signatureArr = signingInfo.getSigningCertificateHistory()) == null) {
            signatureArr = new Signature[0];
        }
        ArrayList arrayList = new ArrayList(signatureArr.length);
        for (Signature signature : signatureArr) {
            arrayList.add(b(signature));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (brm0.w((String) next2, str, true)) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    public static final String b(Signature signature) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
        messageDigest.update(signature.toByteArray());
        byte[] digest = messageDigest.digest();
        return String.format(vu5.b(new StringBuilder("%0"), digest.length << 1, 'X'), Arrays.copyOf(new Object[]{new BigInteger(1, digest)}, 1));
    }
}
