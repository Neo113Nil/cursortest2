package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AudioSavePlaylistRequests.kt */
/* loaded from: classes14.dex */
public final class ax4 {
    public final int a;
    public final UserId b;
    public final String c;

    public ax4(int i, UserId userId, String str) {
        this.a = i;
        this.b = userId;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax4)) {
            return false;
        }
        ax4 ax4Var = (ax4) obj;
        return this.a == ax4Var.a && epx.f(this.b, ax4Var.b) && epx.f(this.c, ax4Var.c);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSavePlaylistBatchResponse(playlistId=");
        sb.append(this.a);
        sb.append(", localOwnerId=");
        sb.append(this.b);
        sb.append(", accessKey=");
        return ho8.a(sb, this.c, ')');
    }
}
