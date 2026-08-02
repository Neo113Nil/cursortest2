package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class goi0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final Photo d;

    public goi0(int i, UserId userId, String str, Photo photo) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goi0)) {
            return false;
        }
        goi0 goi0Var = (goi0) obj;
        return this.a == goi0Var.a && epx.f(this.b, goi0Var.b) && epx.f(this.c, goi0Var.c) && epx.f(this.d, goi0Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c);
        Photo photo = this.d;
        return a + (photo == null ? 0 : photo.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceAlbumData(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", photo=");
        return tq.c(sb, this.d, ')');
    }
}
