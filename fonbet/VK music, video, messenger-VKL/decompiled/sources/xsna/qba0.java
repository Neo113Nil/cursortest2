package xsna;

import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;

/* compiled from: PhotoTag.kt */
/* loaded from: classes4.dex */
public final class qba0 {
    public final Photo a;
    public final PhotoAlbum b;
    public final Owner c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final int j;
    public final boolean k;
    public final String l;
    public final String m;
    public final boolean n;

    public qba0(Photo photo, PhotoAlbum photoAlbum, Owner owner, boolean z, String str, String str2, String str3, String str4, long j, int i, boolean z2, String str5, String str6, boolean z3) {
        this.a = photo;
        this.b = photoAlbum;
        this.c = owner;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = j;
        this.j = i;
        this.k = z2;
        this.l = str5;
        this.m = str6;
        this.n = z3;
    }

    public final Owner a() {
        return this.c;
    }

    public final Photo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qba0)) {
            return false;
        }
        qba0 qba0Var = (qba0) obj;
        return epx.f(this.a, qba0Var.a) && epx.f(this.b, qba0Var.b) && epx.f(this.c, qba0Var.c) && this.d == qba0Var.d && epx.f(this.e, qba0Var.e) && epx.f(this.f, qba0Var.f) && epx.f(this.g, qba0Var.g) && epx.f(this.h, qba0Var.h) && this.i == qba0Var.i && this.j == qba0Var.j && this.k == qba0Var.k && epx.f(this.l, qba0Var.l) && epx.f(this.m, qba0Var.m) && this.n == qba0Var.n;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PhotoAlbum photoAlbum = this.b;
        int hashCode2 = (hashCode + (photoAlbum == null ? 0 : photoAlbum.hashCode())) * 31;
        Owner owner = this.c;
        int b = qoy.b((hashCode2 + (owner == null ? 0 : owner.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode3 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int b2 = qoy.b(shy.a(this.j, bh10.a((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31), 31, this.k);
        String str5 = this.l;
        int hashCode6 = (b2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        return Boolean.hashCode(this.n) + ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoTag(photo=");
        sb.append(this.a);
        sb.append(", album=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", isRecognition=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", primaryBtnTitle=");
        sb.append(this.g);
        sb.append(", secondaryBtnTitle=");
        sb.append(this.h);
        sb.append(", date=");
        sb.append(this.i);
        sb.append(", tagId=");
        sb.append(this.j);
        sb.append(", isDeleted=");
        sb.append(this.k);
        sb.append(", trackCode=");
        sb.append(this.l);
        sb.append(", type=");
        sb.append(this.m);
        sb.append(", ignoreRestrictions=");
        return defpackage.q0.a(sb, this.n, ')');
    }
}
