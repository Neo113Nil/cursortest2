package xsna;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: BrowserDescriptor.java */
/* loaded from: classes15.dex */
public final class nk8 {
    public final String a;
    public final HashSet b;
    public final String c;
    public final Boolean d;

    public nk8() {
        throw null;
    }

    public nk8(@NonNull PackageInfo packageInfo, boolean z) {
        String str = packageInfo.packageName;
        Signature[] signatureArr = packageInfo.signatures;
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            try {
                hashSet.add(Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10));
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }
        String str2 = packageInfo.versionName;
        this.a = str;
        this.b = hashSet;
        this.c = str2;
        this.d = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nk8)) {
            return false;
        }
        nk8 nk8Var = (nk8) obj;
        return this.a.equals(nk8Var.a) && this.c.equals(nk8Var.c) && this.d == nk8Var.d && this.b.equals(nk8Var.b);
    }

    public final int hashCode() {
        int a = (this.d.booleanValue() ? 1 : 0) + urd0.a(this.a.hashCode() * 92821, 92821, this.c);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a = (a * 92821) + ((String) it.next()).hashCode();
        }
        return a;
    }
}
