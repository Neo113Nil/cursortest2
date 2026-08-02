package xsna;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: GlideUrl.java */
/* loaded from: classes12.dex */
public final class e1u implements ady {
    public final oyu b;

    @Nullable
    public final URL c;

    @Nullable
    public final String d;

    @Nullable
    public String e;

    @Nullable
    public URL f;

    @Nullable
    public volatile byte[] g;
    public int h;

    public e1u(URL url) {
        isy isyVar = oyu.a;
        nr2.r(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        nr2.r(isyVar, "Argument must not be null");
        this.b = isyVar;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(ady.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        nr2.r(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() throws MalformedURLException {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.c;
                    nr2.r(url, "Argument must not be null");
                    str = url.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof e1u) {
            e1u e1uVar = (e1u) obj;
            if (c().equals(e1uVar.c()) && this.b.equals(e1uVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ady
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

    public e1u(String str) {
        isy isyVar = oyu.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            nr2.r(isyVar, "Argument must not be null");
            this.b = isyVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
