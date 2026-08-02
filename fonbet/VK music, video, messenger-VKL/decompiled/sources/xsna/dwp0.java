package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import java.util.List;

/* compiled from: UGCPackEntity.kt */
/* loaded from: classes5.dex */
public final class dwp0 {
    public final UserId a;
    public final long b;
    public final List<UGCStickerModel> c;
    public final String d;
    public final iyp0 e;

    public dwp0(UserId userId, long j, List<UGCStickerModel> list, String str, iyp0 iyp0Var) {
        this.a = userId;
        this.b = j;
        this.c = list;
        this.d = str;
        this.e = iyp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwp0)) {
            return false;
        }
        dwp0 dwp0Var = (dwp0) obj;
        return epx.f(this.a, dwp0Var.a) && this.b == dwp0Var.b && epx.f(this.c, dwp0Var.c) && epx.f(this.d, dwp0Var.d) && epx.f(this.e, dwp0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(fw3.a(bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d);
        iyp0 iyp0Var = this.e;
        return a + (iyp0Var == null ? 0 : iyp0Var.hashCode());
    }

    public final String toString() {
        return "UGCPackEntity(ownerId=" + this.a + ", id=" + this.b + ", stickers=" + this.c + ", hash=" + this.d + ", editParams=" + this.e + ')';
    }
}
