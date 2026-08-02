package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.rxd0;

/* compiled from: ProfileInfoMediator.kt */
/* loaded from: classes2.dex */
public final class sxd0 implements rxd0 {
    public final ProfilesInfo a = new ProfilesInfo();
    public ProfilesSimpleInfo b = new ProfilesSimpleInfo();
    public final ArrayList c = new ArrayList();

    @Override // xsna.rxd0
    public final ProfilesSimpleInfo a() {
        return this.b;
    }

    @Override // xsna.rxd0
    public final void b(rxd0.a aVar) {
        this.c.remove(aVar);
    }

    @Override // xsna.rxd0
    public final void c(rxd0.a aVar) {
        this.c.add(aVar);
    }

    public final void d(ProfilesInfo profilesInfo, f1e0 f1e0Var) {
        bpn0 bpn0Var = i0q0.a;
        ProfilesInfo profilesInfo2 = this.a;
        profilesInfo2.Hb(profilesInfo);
        this.b = profilesInfo2.Ob();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((rxd0.a) it.next()).b(this.b, f1e0Var);
        }
    }
}
