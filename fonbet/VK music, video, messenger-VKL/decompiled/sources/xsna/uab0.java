package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;

/* compiled from: PlaylistLiteEntity.kt */
/* loaded from: classes3.dex */
public final class uab0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final DownloadingState d;
    public final String e;

    public uab0(int i, DownloadingState downloadingState, UserId userId, String str, String str2) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = downloadingState;
        this.e = str2;
    }

    public final DownloadingState a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uab0)) {
            return false;
        }
        uab0 uab0Var = (uab0) obj;
        return this.a == uab0Var.a && epx.f(this.b, uab0Var.b) && epx.f(this.c, uab0Var.c) && epx.f(this.d, uab0Var.d) && epx.f(this.e, uab0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistLiteEntity(id=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", pid=");
        sb.append(this.c);
        sb.append(", downloadingState=");
        sb.append(this.d);
        sb.append(", jsonRaw=");
        return ho8.a(sb, this.e, ')');
    }
}
