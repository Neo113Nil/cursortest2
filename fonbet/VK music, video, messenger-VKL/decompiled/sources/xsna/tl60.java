package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: NewsfeedIgnoreItemResult.kt */
/* loaded from: classes4.dex */
public final class tl60 {
    public final boolean a;
    public final String b;
    public final UserId c;
    public final String d;
    public final String e;
    public final boolean f;
    public final NewsfeedNewsfeedItemTypeDto g;

    public tl60() {
        this(false, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl60)) {
            return false;
        }
        tl60 tl60Var = (tl60) obj;
        return this.a == tl60Var.a && epx.f(this.b, tl60Var.b) && epx.f(this.c, tl60Var.c) && epx.f(this.d, tl60Var.d) && epx.f(this.e, tl60Var.e) && this.f == tl60Var.f && this.g == tl60Var.g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int a = bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.b);
        String str2 = this.d;
        int hashCode2 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.g.hashCode() + qoy.b((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        return "NewsfeedIgnoreItemResult(status=" + this.a + ", message=" + this.b + ", ownerId=" + this.c + ", firstNameGen=" + this.d + ", lastNameGen=" + this.e + ", isRestorable=" + this.f + ", contentType=" + this.g + ')';
    }

    public tl60(boolean z, String str, UserId userId, String str2, String str3, boolean z2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto) {
        this.a = z;
        this.b = str;
        this.c = userId;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = newsfeedNewsfeedItemTypeDto;
    }

    public /* synthetic */ tl60(boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, int i) {
        this((i & 1) != 0 ? false : z, null, UserId.d, null, null, false, (i & 64) != 0 ? NewsfeedNewsfeedItemTypeDto.POST : newsfeedNewsfeedItemTypeDto);
    }
}
