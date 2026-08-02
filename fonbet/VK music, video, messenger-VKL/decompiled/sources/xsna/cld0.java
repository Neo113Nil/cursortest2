package xsna;

import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ProductCardGalleryState.kt */
/* loaded from: classes18.dex */
public final class cld0 {
    public final List<Photo> a;
    public final ArrayList b;
    public final int c;
    public final boolean d;

    public cld0(List list, ArrayList arrayList, int i, boolean z) {
        this.a = list;
        this.b = arrayList;
        this.c = i;
        this.d = z;
    }

    public static cld0 a(cld0 cld0Var, int i) {
        List<Photo> list = cld0Var.a;
        ArrayList arrayList = cld0Var.b;
        boolean z = cld0Var.d;
        cld0Var.getClass();
        cld0Var.getClass();
        return new cld0(list, arrayList, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cld0)) {
            return false;
        }
        cld0 cld0Var = (cld0) obj;
        return epx.f(this.a, cld0Var.a) && this.b.equals(cld0Var.b) && this.c == cld0Var.c && this.d == cld0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(shy.a(this.c, qr.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCardGalleryState(photos=");
        sb.append(this.a);
        sb.append(", videos=");
        sb.append(this.b);
        sb.append(", currentPosition=");
        sb.append(this.c);
        sb.append(", isService=");
        return n23.b(sb, this.d, ", isPageRefresh=false)");
    }
}
