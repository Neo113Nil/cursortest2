package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.toggle.features.VideoFeatures;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.epe;
import xsna.mme;

/* compiled from: ClipsOwnerSwipeMviStateMapper.kt */
/* loaded from: classes17.dex */
public final class woe {
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new bv0(7));
    public final boolean e;

    public woe(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        boolean z;
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.c = bpn0Var3;
        if (BuildInfo.q()) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_SWIPE_NEW_CHANNEL;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                z = true;
                this.e = z;
            }
        }
        z = false;
        this.e = z;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    public final voe a(voe voeVar, epe epeVar) {
        mme bVar;
        mme mmeVar;
        ProfileFragmentProviderComponent profileFragmentProviderComponent;
        yrf yrfVar = voeVar.b;
        if (!(epeVar instanceof epe.a)) {
            if (epeVar instanceof epe.b) {
                return voeVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        epe.a aVar = (epe.a) epeVar;
        if (aVar instanceof epe.a.b) {
            epe.a.b bVar2 = (epe.a.b) aVar;
            return voe.a(voeVar, new yrf(new mme.e(yrfVar.c, new mme.e.a(Integer.valueOf(bVar2.b.intValue()), p4g.q(bVar2.c), bVar2.d, bVar2.e, bVar2.f, bVar2.g, bVar2.h, bVar2.i, bVar2.j, bVar2.l, voeVar.f)), yrfVar.c, yrfVar.d, bVar2.f), false, null, null, bVar2.k, null, 110);
        }
        if (!(aVar instanceof epe.a.C2831a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (voeVar.f) {
            return voeVar;
        }
        epe.a.C2831a c2831a = (epe.a.C2831a) aVar;
        doe doeVar = c2831a.b;
        UserId userId = doeVar != null ? doeVar.b : null;
        if (epx.f(voeVar.d, doeVar != null ? doeVar.b : null)) {
            mmeVar = voeVar.e;
        } else {
            if (voeVar.g) {
                if ((doeVar != null ? doeVar.b : null) != null) {
                    UserId userId2 = doeVar.b;
                    if (this.e) {
                        ((xas0) this.c.getValue()).getClass();
                        mmeVar = null;
                    } else {
                        bVar = new mme.d(userId2, new mme.a(new ji0(((p8t0) this.a.getValue()).b(userId2), 18)));
                        mmeVar = bVar;
                    }
                }
            }
            if (doeVar != null) {
                String str = yrfVar.c;
                mme.c cVar = null;
                if (((Boolean) this.d.getValue()).booleanValue() && (profileFragmentProviderComponent = (ProfileFragmentProviderComponent) this.b.getValue()) != null) {
                    UserId userId3 = doeVar.b;
                    boolean z = doeVar.a;
                    dhr0.a.getClass();
                    cVar = new mme.c(userId3, profileFragmentProviderComponent, new mme.c.a(dhr0.u().c, doeVar.b, z));
                }
                if (cVar != null) {
                    mmeVar = cVar;
                } else {
                    long j = doeVar.b.b;
                    boolean z2 = doeVar.a;
                    dhr0.a.getClass();
                    bVar = new mme.b(j, str, new mme.b.a(dhr0.u().c, doeVar.b, z2));
                    mmeVar = bVar;
                }
            }
            mmeVar = null;
        }
        return voe.a(voeVar, null, c2831a.c, userId, mmeVar, false, doeVar != null ? doeVar.c : null, 49);
    }
}
