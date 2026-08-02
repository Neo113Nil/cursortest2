package xsna;

import com.vk.dto.common.id.UserId;
import xsna.m5t0;

/* compiled from: VideoDiscoveryRelatedVideosStateLoaderExt.kt */
/* loaded from: classes7.dex */
public final class d7b0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final String d;
    public final m5t0.a.C3323a e;

    public d7b0(int i, UserId userId, String str, String str2, m5t0.a.C3323a c3323a) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = c3323a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7b0)) {
            return false;
        }
        d7b0 d7b0Var = (d7b0) obj;
        return this.a == d7b0Var.a && epx.f(this.b, d7b0Var.b) && epx.f(this.c, d7b0Var.c) && epx.f(this.d, d7b0Var.d) && epx.f(this.e, d7b0Var.e);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaylistArgs(playlistId=" + this.a + ", userId=" + this.b + ", referrer=" + this.c + ", trackCode=" + this.d + ", shuffle=" + this.e + ')';
    }
}
