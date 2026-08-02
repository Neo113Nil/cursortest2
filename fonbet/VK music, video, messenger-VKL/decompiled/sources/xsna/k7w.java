package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: ImItemList.kt */
/* loaded from: classes2.dex */
public final class k7w {
    public final m5w a;
    public final ProfilesInfo b;

    public k7w(m5w m5wVar, ProfilesInfo profilesInfo) {
        this.a = m5wVar;
        this.b = profilesInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7w)) {
            return false;
        }
        k7w k7wVar = (k7w) obj;
        return epx.f(this.a, k7wVar.a) && epx.f(this.b, k7wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemListUpdate(historyUpdate=");
        sb.append(this.a);
        sb.append(", cachedProfiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
    }
}
