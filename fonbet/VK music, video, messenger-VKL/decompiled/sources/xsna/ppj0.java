package xsna;

import android.net.Uri;

/* compiled from: SimpleCacheKey.java */
/* loaded from: classes12.dex */
public final class ppj0 implements ww8 {
    public final String a;

    public ppj0(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // xsna.ww8
    public final String a() {
        return this.a;
    }

    @Override // xsna.ww8
    public final boolean b() {
        return false;
    }

    @Override // xsna.ww8
    public final boolean c(Uri uri) {
        return this.a.contains(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppj0) {
            return this.a.equals(((ppj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
