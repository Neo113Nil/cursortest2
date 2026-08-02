package xsna;

import android.graphics.drawable.Drawable;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;

/* compiled from: FilteredSourceUiDto.kt */
/* loaded from: classes18.dex */
public final class yer {
    public final UserId a;
    public final kr5 b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final VerifyInfo f;
    public final boolean g;

    public yer(UserId userId, kr5 kr5Var, String str, String str2, boolean z, VerifyInfo verifyInfo, boolean z2) {
        this.a = userId;
        this.b = kr5Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = verifyInfo;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yer.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yer yerVar = (yer) obj;
        if (!epx.f(this.a, yerVar.a)) {
            return false;
        }
        kr5 kr5Var = this.b;
        if (!epx.f(kr5Var.b, yerVar.b.b)) {
            return false;
        }
        AvatarBorderType avatarBorderType = kr5Var.a;
        kr5 kr5Var2 = yerVar.b;
        return avatarBorderType == kr5Var2.a && epx.f(kr5Var.c, kr5Var2.c) && epx.f(this.c, yerVar.c) && epx.f(this.d, yerVar.d) && this.e == yerVar.e && epx.f(this.f, yerVar.f) && this.g == yerVar.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        kr5 kr5Var = this.b;
        int hashCode2 = (kr5Var.a.hashCode() + ((kr5Var.b.hashCode() + hashCode) * 31)) * 31;
        Drawable drawable = kr5Var.c;
        int c = u11.c((hashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        int b = qoy.b((c + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.e);
        VerifyInfo verifyInfo = this.f;
        return Boolean.hashCode(this.g) + ((b + (verifyInfo != null ? verifyInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilteredSourceUiDto(sourceId=");
        sb.append(this.a);
        sb.append(", avatarConfig=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append((Object) this.c);
        sb.append(", subtitle=");
        sb.append((Object) this.d);
        sb.append(", isSubtitleVisible=");
        sb.append(this.e);
        sb.append(", verifyInfo=");
        sb.append(this.f);
        sb.append(", isVerificationIconVisible=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
