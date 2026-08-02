package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class p4d implements ClipItemViewEvent {
    public final int b;
    public final List<String> c;
    public final String d;
    public final Integer e;
    public final UserId f;

    public p4d(int i, UserId userId, Integer num, String str, List list) {
        this.b = i;
        this.c = list;
        this.d = str;
        this.e = num;
        this.f = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4d)) {
            return false;
        }
        p4d p4dVar = (p4d) obj;
        return this.b == p4dVar.b && epx.f(this.c, p4dVar.c) && epx.f(this.d, p4dVar.d) && epx.f(this.e, p4dVar.e) && epx.f(this.f, p4dVar.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        List<String> list = this.c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.f;
        return hashCode4 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadData(slotId=");
        sb.append(this.b);
        sb.append(", wbItemIds=");
        sb.append(this.c);
        sb.append(", articles=");
        sb.append(this.d);
        sb.append(", videoId=");
        sb.append(this.e);
        sb.append(", ownerId=");
        return gp.b(sb, this.f, ')');
    }
}
