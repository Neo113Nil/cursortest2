package defpackage;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import com.fluttercandies.photo_manager.core.utils.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class d93 {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final long i;
    public final int j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;

    public d93(long j, String str, long j2, long j3, int i, int i2, int i3, String str2, long j4, int i4, boolean z, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
        this.i = j4;
        this.j = i4;
        this.k = z;
        this.l = str3;
        this.m = str4;
        b.a.getClass();
        this.n = str3;
    }

    public final Uri a() {
        Uri uri;
        int i = this.g;
        char c = i != 1 ? i != 2 ? i != 3 ? (char) 0 : (char) 2 : (char) 3 : (char) 1;
        if (c == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (c == 2) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else if (c != 3) {
            b.a.getClass();
            uri = MediaStore.Files.getContentUri("external");
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        return ContentUris.withAppendedId(uri, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d93)) {
            return false;
        }
        d93 d93Var = (d93) obj;
        return this.a == d93Var.a && this.b.equals(d93Var.b) && this.c == d93Var.c && this.d == d93Var.d && this.e == d93Var.e && this.f == d93Var.f && this.g == d93Var.g && this.h.equals(d93Var.h) && this.i == d93Var.i && this.j == d93Var.j && this.k == d93Var.k && this.l.equals(d93Var.l) && this.m.equals(d93Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + unr0.b(unr0.e(oyr.b(this.j, qv10.c(unr0.b(oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, qv10.c(qv10.c(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31, this.h), 31, this.i), 31), 29791, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder k = x4e.k("AssetEntity(id=", this.a, ", path=", this.b);
        x4e.A(this.c, ", duration=", ", createDt=", k);
        vfc.y(k, this.d, ", width=", this.e);
        k.append(", height=");
        k.append(this.f);
        k.append(", type=");
        k.append(this.g);
        x4e.C(k, ", displayName=", this.h, ", modifiedDate=");
        vfc.y(k, this.i, ", orientation=", this.j);
        k.append(", isFavorite=");
        k.append(this.k);
        k.append(", lat=null, lng=null, androidQRelativePath=");
        k.append(this.l);
        return unr0.r(k, ", mimeType=", this.m, Extension.C_BRAKE);
    }
}
