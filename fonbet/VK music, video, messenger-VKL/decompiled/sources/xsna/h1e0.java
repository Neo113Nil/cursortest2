package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import xsna.g1e0;

/* compiled from: ProfilesMergeTask.kt */
/* loaded from: classes2.dex */
public final class h1e0 extends b920 {
    public final ProfilesSimpleInfo c;
    public final long d;
    public final boolean e;

    public h1e0(ProfilesSimpleInfo profilesSimpleInfo, long j, boolean z) {
        this.c = profilesSimpleInfo;
        this.d = j;
        this.e = z;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        w2wVar.I0().u(new defpackage.l(new ProfilesSimpleInfo(), this, w2wVar, 4));
        g1e0.a aVar = new g1e0.a();
        aVar.b = Source.CACHE;
        f1e0 f1e0Var = new f1e0();
        ProfilesSimpleInfo profilesSimpleInfo = this.c;
        f1e0Var.a.addAll(profilesSimpleInfo.b.keySet());
        f1e0Var.b.addAll(profilesSimpleInfo.c.keySet());
        f1e0Var.c.addAll(profilesSimpleInfo.d.keySet());
        f1e0Var.d.addAll(profilesSimpleInfo.e.keySet());
        f1e0Var.e.addAll(profilesSimpleInfo.f.keySet());
        aVar.a.e(f1e0Var);
        return ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)))).Ob();
    }

    public /* synthetic */ h1e0(ProfilesSimpleInfo profilesSimpleInfo, long j) {
        this(profilesSimpleInfo, j, true);
    }
}
