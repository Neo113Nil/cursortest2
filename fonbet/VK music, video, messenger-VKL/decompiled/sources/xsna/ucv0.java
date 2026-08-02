package xsna;

import com.vk.dto.photo.Photo;

/* compiled from: VkPhotoUiDto.kt */
/* loaded from: classes4.dex */
public final class ucv0 {
    public final Photo a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;

    public ucv0(Photo photo, boolean z, String str, int i, String str2) {
        this.a = photo;
        this.b = z;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    public static ucv0 a(ucv0 ucv0Var, boolean z) {
        Photo photo = ucv0Var.a;
        String str = ucv0Var.c;
        int i = ucv0Var.d;
        String str2 = ucv0Var.e;
        ucv0Var.getClass();
        return new ucv0(photo, z, str, i, str2);
    }

    public final Photo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucv0)) {
            return false;
        }
        ucv0 ucv0Var = (ucv0) obj;
        return epx.f(this.a, ucv0Var.a) && this.b == ucv0Var.b && epx.f(this.c, ucv0Var.c) && this.d == ucv0Var.d && epx.f(this.e, ucv0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, urd0.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkPhotoUiDto(photo=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", imageContentDescription=");
        sb.append(this.c);
        sb.append(", checkBoxImageRes=");
        sb.append(this.d);
        sb.append(", checkBoxContentDescription=");
        return ho8.a(sb, this.e, ')');
    }
}
