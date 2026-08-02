package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import java.util.UUID;

/* compiled from: AdditionalSettingsInfo.kt */
/* loaded from: classes4.dex */
public final class rr0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final WallOwner g;
    public final AdditionalSettingsConfiguration h;
    public final UserType i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final UUID n;

    public rr0(AdditionalSettingsConfiguration additionalSettingsConfiguration, WallOwner wallOwner, UserType userType, String str, String str2, UUID uuid, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = wallOwner;
        this.h = additionalSettingsConfiguration;
        this.i = userType;
        this.j = z7;
        this.k = z8;
        this.l = str;
        this.m = str2;
        this.n = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr0)) {
            return false;
        }
        rr0 rr0Var = (rr0) obj;
        return this.a == rr0Var.a && this.b == rr0Var.b && this.c == rr0Var.c && this.d == rr0Var.d && this.e == rr0Var.e && this.f == rr0Var.f && epx.f(this.g, rr0Var.g) && epx.f(this.h, rr0Var.h) && this.i == rr0Var.i && this.j == rr0Var.j && this.k == rr0Var.k && epx.f(this.l, rr0Var.l) && epx.f(this.m, rr0Var.m) && epx.f(this.n, rr0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + urd0.a(urd0.a(qoy.b(qoy.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        return "AdditionalSettingsInfo(isCommentChangeAvailable=" + this.a + ", isEditMode=" + this.b + ", isDraft=" + this.c + ", isCommunity=" + this.d + ", hasCoauthors=" + this.e + ", shouldShowNotificationsButton=" + this.f + ", owner=" + this.g + ", additionalSettingsConfiguration=" + this.h + ", userType=" + this.i + ", isSuggest=" + this.j + ", isAdmin=" + this.k + ", signerFirstNameGen=" + this.l + ", signerLastNameGen=" + this.m + ", targetScreenUniqueId=" + this.n + ')';
    }
}
