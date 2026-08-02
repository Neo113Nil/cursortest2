package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.doh0;
import xsna.goh0;

/* compiled from: SearchCommunitiesOnMapDetailsReducer.kt */
/* loaded from: classes5.dex */
public final class eoh0 extends dm50<loh0, doh0, goh0> {
    public final vig0 d;

    public eoh0(vig0 vig0Var) {
        super(goh0.b.b);
        this.d = vig0Var;
    }

    @Override // xsna.dm50
    public final goh0 c(goh0 goh0Var, doh0 doh0Var) {
        goh0 goh0Var2 = goh0Var;
        doh0 doh0Var2 = doh0Var;
        if (doh0Var2 instanceof doh0.a) {
            doh0.a aVar = (doh0.a) doh0Var2;
            goh0.a aVar2 = goh0Var2 instanceof goh0.a ? (goh0.a) goh0Var2 : null;
            if (aVar2 == null) {
                aVar2 = new goh0.a(aVar.b, null, null, false);
            }
            return goh0.a.a(aVar2, aVar.b, aVar.c, aVar.d, false, 8);
        }
        if (doh0Var2 instanceof doh0.c) {
            goh0.a aVar3 = (goh0.a) (goh0Var2 instanceof goh0.a ? goh0Var2 : null);
            return aVar3 != null ? goh0.a.a(aVar3, null, null, null, true, 7) : goh0Var2;
        }
        if (doh0Var2 instanceof doh0.b) {
            doh0.b bVar = (doh0.b) doh0Var2;
            goh0.a aVar4 = (goh0.a) (goh0Var2 instanceof goh0.a ? goh0Var2 : null);
            if (aVar4 == null) {
                return goh0Var2;
            }
            ExtendedCommunityProfile extendedCommunityProfile = aVar4.b;
            extendedCommunityProfile.a1 = bVar.b.value;
            return goh0.a.a(aVar4, extendedCommunityProfile, null, null, false, 6);
        }
        if (doh0Var2 instanceof doh0.e) {
            doh0.e eVar = (doh0.e) doh0Var2;
            goh0.a aVar5 = (goh0.a) (goh0Var2 instanceof goh0.a ? goh0Var2 : null);
            if (aVar5 == null) {
                return goh0Var2;
            }
            ExtendedCommunityProfile extendedCommunityProfile2 = aVar5.b;
            extendedCommunityProfile2.i2 = eVar.b;
            return goh0.a.a(aVar5, extendedCommunityProfile2, null, null, false, 14);
        }
        if (!(doh0Var2 instanceof doh0.d)) {
            throw new NoWhenBranchMatchedException();
        }
        doh0.d dVar = (doh0.d) doh0Var2;
        goh0.a aVar6 = (goh0.a) (goh0Var2 instanceof goh0.a ? goh0Var2 : null);
        if (aVar6 == null) {
            return goh0Var2;
        }
        ExtendedCommunityProfile extendedCommunityProfile3 = aVar6.b;
        extendedCommunityProfile3.a1 = dVar.b.value;
        return goh0.a.a(aVar6, extendedCommunityProfile3, null, null, false, 14);
    }

    @Override // xsna.dm50
    public final loh0 d() {
        return new loh0(e(new j6e0(6)), e(new ece0(this, 3)));
    }

    @Override // xsna.dm50
    public final void h(goh0 goh0Var, loh0 loh0Var) {
        goh0 goh0Var2 = goh0Var;
        loh0 loh0Var2 = loh0Var;
        if (goh0Var2 instanceof goh0.a) {
            f(loh0Var2.b, goh0Var2);
        } else {
            if (!(goh0Var2 instanceof goh0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(loh0Var2.a, goh0Var2);
        }
    }
}
