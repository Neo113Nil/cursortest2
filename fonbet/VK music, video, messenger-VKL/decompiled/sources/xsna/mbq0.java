package xsna;

import com.vk.dto.group.Group;
import java.util.ArrayList;

/* compiled from: UploadGroupsResponse.kt */
/* loaded from: classes17.dex */
public final class mbq0 {
    public final ArrayList a;
    public final Group b;
    public final int c;
    public final boolean d;

    public mbq0(ArrayList arrayList, Group group, int i, boolean z) {
        this.a = arrayList;
        this.b = group;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbq0)) {
            return false;
        }
        mbq0 mbq0Var = (mbq0) obj;
        return this.a.equals(mbq0Var.a) && epx.f(this.b, mbq0Var.b) && this.c == mbq0Var.c && this.d == mbq0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Group group = this.b;
        return Boolean.hashCode(this.d) + shy.a(this.c, (hashCode + (group == null ? 0 : group.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadGroupsResponse(groups=");
        sb.append(this.a);
        sb.append(", selectedGroup=");
        sb.append(this.b);
        sb.append(", loaded=");
        sb.append(this.c);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
