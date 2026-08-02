package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsCoauthorsSelectedItemViewState.kt */
/* loaded from: classes16.dex */
public final class tmd {
    public final UserId a;
    public final String b;
    public final String c;
    public final String d;

    public tmd(UserId userId, String str, String str2, String str3) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmd)) {
            return false;
        }
        tmd tmdVar = (tmd) obj;
        return epx.f(this.a, tmdVar.a) && epx.f(this.b, tmdVar.b) && epx.f(this.c, tmdVar.c) && epx.f(this.d, tmdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsCoauthorsSelectedItemViewState(id=");
        sb.append(this.a);
        sb.append(", visibleName=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", fullName=");
        return ho8.a(sb, this.d, ')');
    }
}
