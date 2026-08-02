package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import java.util.List;

/* compiled from: UGCStickerPackModel.kt */
/* loaded from: classes18.dex */
public final class ewp0 {
    public final UserId a;
    public final long b;
    public final List<UGCStickerModel> c;
    public final String d;
    public final iyp0 e;
    public final long f;

    public ewp0(UserId userId, long j, List<UGCStickerModel> list, String str, iyp0 iyp0Var, long j2) {
        this.a = userId;
        this.b = j;
        this.c = list;
        this.d = str;
        this.e = iyp0Var;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewp0)) {
            return false;
        }
        ewp0 ewp0Var = (ewp0) obj;
        return epx.f(this.a, ewp0Var.a) && this.b == ewp0Var.b && epx.f(this.c, ewp0Var.c) && epx.f(this.d, ewp0Var.d) && epx.f(this.e, ewp0Var.e) && this.f == ewp0Var.f;
    }

    public final int hashCode() {
        int a = urd0.a(fw3.a(bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d);
        iyp0 iyp0Var = this.e;
        return Long.hashCode(this.f) + ((a + (iyp0Var == null ? 0 : iyp0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UGCStickerPackModel(ownerId=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", stickers=");
        sb.append(this.c);
        sb.append(", hash=");
        sb.append(this.d);
        sb.append(", editParams=");
        sb.append(this.e);
        sb.append(", lastSyncTime=");
        return vu5.a(')', this.f, sb);
    }

    public /* synthetic */ ewp0(UserId userId, long j, List list, String str, iyp0 iyp0Var) {
        this(userId, j, list, str, iyp0Var, System.currentTimeMillis());
    }
}
