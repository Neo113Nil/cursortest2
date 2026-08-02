package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import xsna.gx8;

/* compiled from: Repository.kt */
/* loaded from: classes11.dex */
public final class t6g0 implements gx8.a, w8i {
    public static final t6g0 b = new t6g0();
    public static final bpn0 c = new bpn0(new ab3(12));
    public static final bpn0 d = new bpn0(new eu2(13));
    public static final bpn0 e = new bpn0(new bb3(10));
    public static final bpn0 f = new bpn0(new r63(10));
    public static final bpn0 g = new bpn0(new hu2(11));

    public static gxh b() {
        return (gxh) d.getValue();
    }

    public static ExtendedProfilesRepository c() {
        return (ExtendedProfilesRepository) f.getValue();
    }

    public static kcl0 d() {
        return (kcl0) g.getValue();
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.SYSTEM;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        b().clear();
        ((klq0) e.getValue()).clear();
        c().clear();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "VKRepository";
    }

    @Override // xsna.gx8.a
    public final long u() {
        return c().u() + ((klq0) e.getValue()).u() + b().u();
    }
}
