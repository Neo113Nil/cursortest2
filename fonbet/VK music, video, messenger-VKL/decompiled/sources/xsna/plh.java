package xsna;

import com.vk.dto.user.RequestUserProfile;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import xsna.cvd0;
import xsna.sdk0;
import xsna.wdk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class plh implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ plh(RequestUserProfile requestUserProfile, boolean z, ldk0 ldk0Var) {
        this.d = requestUserProfile;
        this.c = z;
        this.e = ldk0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CommunityProfileContentItem.State state;
        int i;
        ArrayList arrayList;
        cvd0.e eVar;
        CommunityProfileContentItem.ContentType contentType;
        String str;
        boolean z;
        boolean z2;
        String str2;
        CommunityProfileContentItem.State state2;
        switch (this.b) {
            case 0:
                qlh qlhVar = (qlh) this.d;
                sst0 sst0Var = (sst0) this.e;
                if (this.c) {
                    state2 = CommunityProfileContentItem.State.ERROR;
                    state = null;
                    i = 31743;
                    arrayList = null;
                    eVar = null;
                    contentType = null;
                    str = null;
                    z = false;
                    z2 = false;
                    str2 = null;
                } else {
                    state = CommunityProfileContentItem.State.ERROR;
                    i = 28671;
                    arrayList = null;
                    eVar = null;
                    contentType = null;
                    str = null;
                    z = false;
                    z2 = false;
                    str2 = null;
                    state2 = null;
                }
                qlhVar.w(sst0.i(sst0Var, arrayList, eVar, contentType, str, z, z2, str2, state2, state, i));
                break;
            default:
                RequestUserProfile requestUserProfile = (RequestUserProfile) this.d;
                ldk0 ldk0Var = (ldk0) this.e;
                Integer num = (Integer) obj;
                if (num == null || num.intValue() != 0) {
                    boolean z3 = this.c;
                    requestUserProfile.i0 = Boolean.valueOf(z3);
                    if (z3) {
                        ldk0Var.T(new sdk0.a.C3662a());
                    } else {
                        ldk0Var.T(new sdk0.a.b());
                    }
                    ldk0Var.i.b(new wdk0.b(requestUserProfile));
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }

    public /* synthetic */ plh(qlh qlhVar, sst0 sst0Var, boolean z) {
        this.d = qlhVar;
        this.e = sst0Var;
        this.c = z;
    }
}
