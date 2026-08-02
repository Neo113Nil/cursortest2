package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: LiveSpectatorItem.kt */
/* loaded from: classes3.dex */
public final class mlz implements hfz {
    public final UserId b;
    public final String c;
    public final String d;

    public mlz(UserId userId, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlz)) {
            return false;
        }
        mlz mlzVar = (mlz) obj;
        return epx.f(this.b, mlzVar.b) && epx.f(this.c, mlzVar.c) && epx.f(this.d, mlzVar.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.b);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveSpectatorItem(userId=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", userName=");
        return ho8.a(sb, this.d, ')');
    }
}
