package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityArtistPageItemModel.kt */
/* loaded from: classes5.dex */
public final class yrg extends s4h {
    public final String b;
    public final boolean c;
    public final UserId d;

    public yrg(UserId userId, String str, boolean z) {
        this.b = str;
        this.c = z;
        this.d = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrg)) {
            return false;
        }
        yrg yrgVar = (yrg) obj;
        return epx.f(this.b, yrgVar.b) && this.c == yrgVar.c && epx.f(this.d, yrgVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d.b) + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityArtistPageItemModel(artistId=");
        sb.append(this.b);
        sb.append(", hasOnlineBlock=");
        sb.append(this.c);
        sb.append(", uid=");
        return gp.b(sb, this.d, ')');
    }
}
