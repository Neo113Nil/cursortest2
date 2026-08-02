package xsna;

import com.vkontakte.android.R;

/* compiled from: PhotosGetAlbumsParams.kt */
/* loaded from: classes18.dex */
public final class yea0 {
    public final int a;
    public final int b;
    public final boolean c;

    public yea0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yea0)) {
            return false;
        }
        yea0 yea0Var = (yea0) obj;
        yea0Var.getClass();
        return this.a == yea0Var.a && this.b == yea0Var.b && this.c == yea0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, shy.a(this.a, Integer.hashCode(R.string.album_unnamed) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetAlbumsParams(albumUnnamed=2131952187, allPhotos=");
        sb.append(this.a);
        sb.append(", userPhotosTitle=");
        sb.append(this.b);
        sb.append(", isHiNetworkSpeed=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
