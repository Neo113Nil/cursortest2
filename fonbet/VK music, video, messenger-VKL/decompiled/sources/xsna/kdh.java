package xsna;

import com.vk.dto.group.GroupContentTabType;
import xsna.ddh;

/* compiled from: CommunityPriorityBlockDataModel.kt */
/* loaded from: classes5.dex */
public final class kdh {
    public final String a;
    public final GroupContentTabType b;
    public final ddh c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public kdh(String str, GroupContentTabType groupContentTabType, ddh ddhVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = groupContentTabType;
        this.c = ddhVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static kdh a(kdh kdhVar, ddh ddhVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        String str = kdhVar.a;
        GroupContentTabType groupContentTabType = kdhVar.b;
        if ((i & 4) != 0) {
            ddhVar = kdhVar.c;
        }
        ddh ddhVar2 = ddhVar;
        if ((i & 32) != 0) {
            z3 = kdhVar.f;
        }
        boolean z6 = z3;
        if ((i & 64) != 0) {
            z4 = kdhVar.g;
        }
        boolean z7 = z4;
        if ((i & 128) != 0) {
            z5 = kdhVar.h;
        }
        kdhVar.getClass();
        return new kdh(str, groupContentTabType, ddhVar2, z, z2, z6, z7, z5);
    }

    public final ddh.a b() {
        ddh ddhVar = this.c;
        if (ddhVar == null || !(ddhVar instanceof ddh.a)) {
            return null;
        }
        return (ddh.a) ddhVar;
    }

    public final ddh.b c() {
        ddh ddhVar = this.c;
        if (ddhVar == null || !(ddhVar instanceof ddh.b)) {
            return null;
        }
        return (ddh.b) ddhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdh)) {
            return false;
        }
        kdh kdhVar = (kdh) obj;
        return epx.f(this.a, kdhVar.a) && this.b == kdhVar.b && epx.f(this.c, kdhVar.c) && this.d == kdhVar.d && this.e == kdhVar.e && this.f == kdhVar.f && this.g == kdhVar.g && this.h == kdhVar.h;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        ddh ddhVar = this.c;
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (ddhVar != null ? ddhVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityPriorityBlockDataModel(title=");
        sb.append(this.a);
        sb.append(", priorityBlockType=");
        sb.append(this.b);
        sb.append(", content=");
        sb.append(this.c);
        sb.append(", isError=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", isNextPageLoading=");
        sb.append(this.f);
        sb.append(", isNextPageError=");
        sb.append(this.g);
        sb.append(", isPaginationAvailable=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
