package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityCheckListState.kt */
/* loaded from: classes18.dex */
public final class twg implements km50 {
    public final int b;
    public final int c;
    public final List<svg> d;
    public final nwg e;
    public final a f;
    public final boolean g;
    public final boolean h;
    public final UserId i;
    public final uy9 j;
    public final boolean k;

    /* compiled from: CommunityCheckListState.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckListGroupInfo(description=");
            sb.append(this.a);
            sb.append(", shortAddress=");
            return ho8.a(sb, this.b, ')');
        }

        public /* synthetic */ a(int i) {
            this("", "");
        }

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public twg() {
        this(0);
    }

    public static twg a(twg twgVar, int i, int i2, List list, nwg nwgVar, a aVar, boolean z, boolean z2, UserId userId, uy9 uy9Var, boolean z3, int i3) {
        if ((i3 & 1) != 0) {
            i = twgVar.b;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = twgVar.c;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            list = twgVar.d;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            nwgVar = twgVar.e;
        }
        nwg nwgVar2 = nwgVar;
        a aVar2 = (i3 & 16) != 0 ? twgVar.f : aVar;
        boolean z4 = (i3 & 32) != 0 ? twgVar.g : z;
        boolean z5 = (i3 & 64) != 0 ? twgVar.h : z2;
        UserId userId2 = (i3 & 128) != 0 ? twgVar.i : userId;
        uy9 uy9Var2 = (i3 & 256) != 0 ? twgVar.j : uy9Var;
        boolean z6 = (i3 & 512) != 0 ? twgVar.k : z3;
        twgVar.getClass();
        return new twg(i4, i5, list2, nwgVar2, aVar2, z4, z5, userId2, uy9Var2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twg)) {
            return false;
        }
        twg twgVar = (twg) obj;
        return this.b == twgVar.b && this.c == twgVar.c && epx.f(this.d, twgVar.d) && epx.f(this.e, twgVar.e) && epx.f(this.f, twgVar.f) && this.g == twgVar.g && this.h == twgVar.h && epx.f(this.i, twgVar.i) && epx.f(this.j, twgVar.j) && this.k == twgVar.k;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
        nwg nwgVar = this.e;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + bh10.a(qoy.b(qoy.b((this.f.hashCode() + ((a2 + (nwgVar == null ? 0 : nwgVar.hashCode())) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCheckListState(completedTipsCount=");
        sb.append(this.b);
        sb.append(", totalTipsCount=");
        sb.append(this.c);
        sb.append(", categories=");
        sb.append(this.d);
        sb.append(", partnerBanner=");
        sb.append(this.e);
        sb.append(", groupInfo=");
        sb.append(this.f);
        sb.append(", isLoading=");
        sb.append(this.g);
        sb.append(", isRefresh=");
        sb.append(this.h);
        sb.append(", groupId=");
        sb.append(this.i);
        sb.append(", image=");
        sb.append(this.j);
        sb.append(", isError=");
        return defpackage.q0.a(sb, this.k, ')');
    }

    public twg(int i, int i2, List<svg> list, nwg nwgVar, a aVar, boolean z, boolean z2, UserId userId, uy9 uy9Var, boolean z3) {
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = nwgVar;
        this.f = aVar;
        this.g = z;
        this.h = z2;
        this.i = userId;
        this.j = uy9Var;
        this.k = z3;
    }

    public twg(int i) {
        this(0, 0, EmptyList.b, null, new a(0), false, false, UserId.d, new uy9("", ""), false);
    }
}
