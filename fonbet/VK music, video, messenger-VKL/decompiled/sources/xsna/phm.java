package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: DialogMembersListExt.kt */
/* loaded from: classes2.dex */
public final class phm {
    public final xpp<ohm> a;
    public final ProfilesInfo b;
    public final boolean c;

    public phm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phm)) {
            return false;
        }
        phm phmVar = (phm) obj;
        return epx.f(this.a, phmVar.a) && epx.f(this.b, phmVar.b) && this.c == phmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ur.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMembersListExt(list=");
        sb.append(this.a);
        sb.append(", info=");
        sb.append(this.b);
        sb.append(", isFull=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public phm(xpp<ohm> xppVar, ProfilesInfo profilesInfo, boolean z) {
        this.a = xppVar;
        this.b = profilesInfo;
        this.c = z;
    }

    public phm(int i) {
        this(new xpp(new ohm(), false), new ProfilesInfo(), true);
    }
}
