package xsna;

import android.net.Uri;

/* compiled from: BackgroundChooseItem.kt */
/* loaded from: classes2.dex */
public final class mka0 extends mw5 {
    public final String b;
    public final Uri c;
    public final Uri d;
    public final boolean e;

    public mka0(String str, Uri uri, Uri uri2, boolean z) {
        this.b = str;
        this.c = uri;
        this.d = uri2;
        this.e = z;
    }

    @Override // xsna.mw5
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mka0)) {
            return false;
        }
        mka0 mka0Var = (mka0) obj;
        return epx.f(this.b, mka0Var.b) && epx.f(this.c, mka0Var.c) && epx.f(this.d, mka0Var.d) && this.e == mka0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Uri uri = this.c;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }

    @Override // xsna.t1c
    public final boolean isChecked() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PictureItem(id=");
        sb.append(this.b);
        sb.append(", imageUri=");
        sb.append(this.c);
        sb.append(", imageUriDark=");
        sb.append(this.d);
        sb.append(", isChecked=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
