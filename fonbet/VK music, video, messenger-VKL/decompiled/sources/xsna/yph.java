package xsna;

import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommunityProfileLegoAuthorHeaderReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class yph implements heh {
    public final cph a;

    public yph(cph cphVar, jmh jmhVar, zph zphVar) {
        this.a = cphVar;
    }

    @Override // xsna.heh
    public final CommunityProfileState a(CommunityProfileState communityProfileState, d.v vVar) {
        ExtendedCommunityProfile extendedCommunityProfile;
        return ((vVar instanceof d.v.e) && (extendedCommunityProfile = communityProfileState.b) != null) ? CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, this.a.a(communityProfileState, extendedCommunityProfile, new com.vk.movika.sdk.base.observable.u(17)), null, null, 0, false, null, null, null, 0, null, null, null, false, 268427263) : communityProfileState;
    }

    @Override // xsna.heh
    public final CommunityProfileViewState.Data.c b(CommunityProfileViewState.Data.c cVar) {
        return cVar instanceof CommunityProfileViewState.Data.c.b ? cVar : CommunityProfileViewState.Data.c.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0.a != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    @Override // xsna.heh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CommunityProfileState d(CommunityProfileState communityProfileState, d.C1611d c1611d) {
        boolean z;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (extendedCommunityProfile != null) {
            z = true;
            if (extendedCommunityProfile.n0) {
                CommunityProfileState.a aVar = communityProfileState.l;
                if (aVar.b) {
                }
                if (z) {
                    return communityProfileState;
                }
                int i = c1611d.b;
                return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, i < 0 ? 0 : i, null, null, null, false, 264241151);
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // xsna.heh
    public final CommunityProfileViewState.Data.e e(ExtendedCommunityProfile extendedCommunityProfile, CommunityProfileState.a aVar, ArrayList arrayList, a8p0 a8p0Var) {
        int i;
        r8h r8hVar = aVar.b ? aVar.a : null;
        boolean z = jmh.a(extendedCommunityProfile, r8hVar) instanceof CommunityProfileViewState.Data.c.b;
        List<String> list = a8p0Var.a;
        List b = asg.b(r8hVar);
        if (b.isEmpty()) {
            List a = asg.a(extendedCommunityProfile, list);
            int i2 = 0;
            if (!(a instanceof Collection) || !a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (!drm0.N((String) it.next()) && (i2 = i2 + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            i = i2;
        } else {
            i = b.size();
        }
        return new CommunityProfileViewState.Data.e.b(extendedCommunityProfile, arrayList, z, i, a8p0Var.b, 224);
    }

    @Override // xsna.heh
    public final CommunityProfileState f(CommunityProfileState communityProfileState, d.e eVar) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (extendedCommunityProfile == null) {
            return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, eVar.b, 0, null, null, null, false, 266338303);
        }
        return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, this.a.a(communityProfileState, extendedCommunityProfile, new arf(eVar, 4)), null, null, 0, false, null, null, eVar.b, 0, null, null, null, false, 266330111);
    }

    @Override // xsna.heh
    public final List<String> c(List<String> list) {
        return list;
    }
}
