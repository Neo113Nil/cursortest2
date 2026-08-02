package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: ChannelsHistoryExt.kt */
/* loaded from: classes16.dex */
public final class sfb {
    public final qfb a;
    public final ProfilesInfo b;

    public sfb(qfb qfbVar, ProfilesInfo profilesInfo) {
        this.a = qfbVar;
        this.b = profilesInfo;
    }

    public final qfb a() {
        return this.a;
    }

    public final ProfilesInfo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfb)) {
            return false;
        }
        sfb sfbVar = (sfb) obj;
        return epx.f(this.a, sfbVar.a) && epx.f(this.b, sfbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsHistoryExt(history=");
        sb.append(this.a);
        sb.append(", profiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
    }
}
