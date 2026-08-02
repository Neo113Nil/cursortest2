package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.voip.userid.CallsUserId;

/* compiled from: VoipScheduleCallGroup.kt */
/* loaded from: classes7.dex */
public final class rww0 {
    public final CallsUserId a;
    public final String b;
    public final ImageList c;
    public final boolean d;

    public rww0(CallsUserId callsUserId, String str, ImageList imageList, boolean z) {
        this.a = callsUserId;
        this.b = str;
        this.c = imageList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rww0)) {
            return false;
        }
        rww0 rww0Var = (rww0) obj;
        return epx.f(this.a, rww0Var.a) && epx.f(this.b, rww0Var.b) && epx.f(this.c, rww0Var.c) && this.d == rww0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipScheduleCallGroup(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", imageIsNft=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
