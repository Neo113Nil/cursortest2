package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class cit implements khx {
    public final peu b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public cit(String str, peu peuVar) {
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            ny61.g("Must not be null or empty");
            throw null;
        }
        this.d = str;
        z2a1.e(peuVar, "Argument must not be null");
        this.b = peuVar;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(khx.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        z2a1.e(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                z2a1.e(url, "Argument must not be null");
                str = url.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof cit) {
            cit citVar = (cit) obj;
            if (c().equals(citVar.c()) && this.b.equals(citVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = this.b.hashCode() + (hashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public cit(URL url) {
        s4y s4yVar = peu.a;
        z2a1.e(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        z2a1.e(s4yVar, "Argument must not be null");
        this.b = s4yVar;
    }
}
