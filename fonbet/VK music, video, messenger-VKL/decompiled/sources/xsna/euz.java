package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import kotlin.NoWhenBranchMatchedException;
import xsna.g1e0;
import xsna.pdg0;

/* compiled from: LocalChannelProfilesDataSource.kt */
/* loaded from: classes16.dex */
public final class euz {
    public final a1w a;

    public euz(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final ProfilesInfo a(f1e0 f1e0Var) {
        Object obj;
        if (f1e0Var.f()) {
            return new ProfilesInfo();
        }
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(f1e0Var);
        aVar.b = Source.CACHE;
        aVar.d = this;
        pdg0 n = this.a.n(this, new d1e0(new g1e0(aVar)));
        if (n instanceof pdg0.a) {
            obj = new ProfilesInfo();
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        return (ProfilesInfo) obj;
    }
}
