package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import kotlin.Pair;
import xsna.g1e0;

/* compiled from: DialogGetProfilesExtCmd.kt */
/* loaded from: classes2.dex */
public final class hem extends le6<phm> {
    public final Peer b;
    public final Source c;
    public final boolean d;
    public final Object e;
    public final Boolean f;

    public hem(Peer peer, Source source, boolean z, Object obj, Boolean bool) {
        this.b = peer;
        this.c = source;
        this.d = z;
        this.e = obj;
        this.f = bool;
    }

    @Override // xsna.le6
    public final phm e(w2w w2wVar) {
        Pair pair;
        ProfilesInfo profilesInfo;
        Object obj = this.e;
        boolean z = this.d;
        Source source = this.c;
        Boolean bool = this.f;
        if (bool == null) {
            pair = new Pair((xpp) w2wVar.L0(this, new xdm(this.b, source, z, obj)), Boolean.TRUE);
        } else {
            pair = new Pair(((dem) w2wVar.L0(this, new cem(this.b, this.c, this.d, this.e, null, bool))).a, Boolean.valueOf(!r3.b));
        }
        xpp xppVar = (xpp) pair.d();
        boolean booleanValue = ((Boolean) pair.g()).booleanValue();
        ohm ohmVar = (ohm) xppVar.a();
        if (ohmVar != null) {
            g1e0.a aVar = new g1e0.a();
            aVar.i(ohmVar);
            aVar.b = source;
            aVar.c = z;
            aVar.d = obj;
            profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        } else {
            profilesInfo = new ProfilesInfo();
        }
        return new phm(xppVar, profilesInfo, booleanValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hem)) {
            return false;
        }
        hem hemVar = (hem) obj;
        return epx.f(this.b, hemVar.b) && this.c == hemVar.c && this.d == hemVar.d && epx.f(this.e, hemVar.e) && epx.f(this.f, hemVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.f;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogGetProfilesExtCmd(peer=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        sb.append(this.e);
        sb.append(", loadNextPage=");
        return tn.a(sb, this.f, ')');
    }
}
