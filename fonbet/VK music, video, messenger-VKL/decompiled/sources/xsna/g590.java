package xsna;

import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkOwner;
import java.util.List;

/* compiled from: OwnerMappingData.kt */
/* loaded from: classes17.dex */
public final class g590 {
    public final List<SdkCoOwnerItem> a;
    public final SdkOwner b;
    public final String c;
    public final e590 d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ g590(List list, SdkOwner sdkOwner, String str, e590 e590Var, boolean z) {
        this(list, sdkOwner, str, e590Var, z, null, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g590)) {
            return false;
        }
        g590 g590Var = (g590) obj;
        return epx.f(this.a, g590Var.a) && epx.f(this.b, g590Var.b) && epx.f(this.c, g590Var.c) && epx.f(this.d, g590Var.d) && this.e == g590Var.e && epx.f(this.f, g590Var.f) && epx.f(this.g, g590Var.g) && this.h == g590Var.h && this.i == g590Var.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SdkOwner sdkOwner = this.b;
        int b = qoy.b((this.d.hashCode() + urd0.a((hashCode + (sdkOwner == null ? 0 : sdkOwner.hashCode())) * 31, 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.i) + qoy.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnerMappingData(approvedCoauthors=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", ownerName=");
        sb.append(this.c);
        sb.append(", ownerPhotoData=");
        sb.append(this.d);
        sb.append(", isAdsBannerVisible=");
        sb.append(this.e);
        sb.append(", musicTitle=");
        sb.append(this.f);
        sb.append(", musicAuthor=");
        sb.append(this.g);
        sb.append(", isTrendMusic=");
        sb.append(this.h);
        sb.append(", isOriginalMusic=");
        return defpackage.q0.a(sb, this.i, ')');
    }

    public g590(List list, SdkOwner sdkOwner, String str, e590 e590Var, boolean z, String str2, String str3, boolean z2, boolean z3) {
        this.a = list;
        this.b = sdkOwner;
        this.c = str;
        this.d = e590Var;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = z3;
    }
}
