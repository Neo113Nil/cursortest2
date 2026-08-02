package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: ImItemList.kt */
/* loaded from: classes2.dex */
public final class n5w implements frz {
    public static final bpn0 d = new bpn0(new l35(15));
    public final d5w b;
    public final ProfilesInfo c;

    public n5w(d5w d5wVar, ProfilesInfo profilesInfo) {
        this.b = d5wVar;
        this.c = profilesInfo;
    }

    @Override // xsna.frz
    public final boolean c() {
        d5w d5wVar = this.b;
        if (d5wVar.c.isEmpty()) {
            return getSize() == 0 && !d5wVar.f && d5wVar.g;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5w)) {
            return false;
        }
        n5w n5wVar = (n5w) obj;
        return epx.f(this.b, n5wVar.b) && epx.f(this.c, n5wVar.c);
    }

    @Override // xsna.frz
    public final int getSize() {
        return this.b.a.size();
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemList(history=");
        sb.append(this.b);
        sb.append(", cachedProfiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.c, ')');
    }
}
