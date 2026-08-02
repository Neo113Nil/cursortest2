package xsna;

import android.graphics.drawable.Drawable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;

/* compiled from: NewsfeedCoownersListItemUiDto.kt */
/* loaded from: classes17.dex */
public final class ie60 {
    public final UserId a;
    public final String b;
    public final boolean c;
    public final String d;
    public final Drawable e;
    public final ImageStatus f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    public final int k;
    public final int l;

    public ie60(UserId userId, String str, boolean z, String str2, Drawable drawable, ImageStatus imageStatus, String str3, boolean z2, boolean z3, Integer num, int i, int i2) {
        this.a = userId;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = drawable;
        this.f = imageStatus;
        this.g = str3;
        this.h = z2;
        this.i = z3;
        this.j = num;
        this.k = i;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie60)) {
            return false;
        }
        ie60 ie60Var = (ie60) obj;
        return epx.f(this.a, ie60Var.a) && epx.f(this.b, ie60Var.b) && this.c == ie60Var.c && epx.f(this.d, ie60Var.d) && epx.f(this.e, ie60Var.e) && epx.f(this.f, ie60Var.f) && epx.f(this.g, ie60Var.g) && this.h == ie60Var.h && this.i == ie60Var.i && epx.f(this.j, ie60Var.j) && this.k == ie60Var.k && this.l == ie60Var.l;
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d);
        Drawable drawable = this.e;
        int hashCode = (a + (drawable == null ? 0 : drawable.hashCode())) * 31;
        ImageStatus imageStatus = this.f;
        int hashCode2 = (hashCode + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31;
        String str = this.g;
        int b = qoy.b(qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i);
        Integer num = this.j;
        return Integer.hashCode(this.l) + shy.a(this.k, (b + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCoownersListItemUiDto(ownerId=");
        sb.append(this.a);
        sb.append(", photoUrl=");
        sb.append(this.b);
        sb.append(", isOwner=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", verificationIcon=");
        sb.append(this.e);
        sb.append(", imageStatus=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", showSubscribeButton=");
        sb.append(this.h);
        sb.append(", isUnsubscribeButtonState=");
        sb.append(this.i);
        sb.append(", iconResIdBeforeSubtitile=");
        sb.append(this.j);
        sb.append(", subscribeButtonTextResId=");
        sb.append(this.k);
        sb.append(", subscribeButtonAccesibilityResId=");
        return vu5.b(sb, this.l, ')');
    }
}
