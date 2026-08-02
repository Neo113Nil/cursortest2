package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsPlaylistMinModel.kt */
/* loaded from: classes16.dex */
public final class mqe {
    public final int a;
    public final List<List<BaseImageDto>> b;
    public final String c;
    public final int d;
    public final UserId e;

    public mqe(int i, int i2, UserId userId, String str, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = i2;
        this.e = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqe)) {
            return false;
        }
        mqe mqeVar = (mqe) obj;
        return this.a == mqeVar.a && epx.f(this.b, mqeVar.b) && epx.f(this.c, mqeVar.c) && this.d == mqeVar.d && epx.f(this.e, mqeVar.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e.b) + shy.a(this.d, urd0.a(fw3.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPlaylistMinModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", ownerId=");
        return gp.b(sb, this.e, ')');
    }
}
