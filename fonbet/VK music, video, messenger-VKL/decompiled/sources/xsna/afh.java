package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.LinkedList;
import java.util.List;
import xsna.bfh;

/* compiled from: CommunityProfileClosedOrPrivateMapper.kt */
/* loaded from: classes5.dex */
public final class afh extends s770 {
    public final bfh c;

    public afh(bfh bfhVar) {
        this.c = bfhVar;
    }

    @Override // xsna.s770
    public final List<s4h> h(kn00 kn00Var) {
        int i;
        pvn pvnVar = new pvn(null);
        LinkedList linkedList = (LinkedList) pvnVar.b;
        bfh bfhVar = this.c;
        bfhVar.getClass();
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        boolean z = kn00Var.f;
        bfh.a aVar = z ? bfhVar.g : bfhVar.h;
        aVar.c(pvnVar, new o9d0(extendedCommunityProfile, kn00Var.b, f6h.a(extendedCommunityProfile, z), kn00Var.c, false, kn00Var.e, kn00Var.g));
        if (aVar.b() && (extendedCommunityProfile.z1 != null || (((i = extendedCommunityProfile.Y) != 0 || extendedCommunityProfile.Z != 2) && (i != 1 || extendedCommunityProfile.Z != 1)))) {
            bfhVar.u(pvnVar, extendedCommunityProfile, kn00Var.c, false, true);
        }
        ((s4h) linkedList.getLast()).a = true;
        return linkedList;
    }
}
