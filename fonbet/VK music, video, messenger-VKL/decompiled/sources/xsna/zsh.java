package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;
import xsna.wox;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zsh implements b0t {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zsh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.b0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.b) {
            case 0:
                com.vk.profile.community.impl.ui.profile.e eVar = (com.vk.profile.community.impl.ui.profile.e) this.c;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                ((Integer) obj2).getClass();
                CommunityProfileState.a aVar = (CommunityProfileState.a) obj3;
                stc0 stc0Var = (stc0) obj4;
                xrh xrhVar = (xrh) obj5;
                List list = (List) obj6;
                r8h r8hVar = aVar.a;
                boolean z = aVar.b;
                jmh jmhVar = eVar.g;
                if (!z) {
                    r8hVar = null;
                }
                jmhVar.getClass();
                return new CommunityProfileViewState.Data.a(extendedCommunityProfile, eVar.m.b(jmh.a(extendedCommunityProfile, r8hVar)), stc0Var, xrhVar, list);
            default:
                yg5 yg5Var = (yg5) this.c;
                VideoFile videoFile = (VideoFile) obj;
                j4t0 j4t0Var = (j4t0) obj2;
                drt0 drt0Var = (drt0) obj3;
                List list2 = (List) obj4;
                Boolean bool = (Boolean) obj6;
                wox.a aVar2 = (wox.a) ((it80) obj5).a;
                d3b0 v0 = yg5Var.v0();
                return new mit0(videoFile, j4t0Var, drt0Var, list2, aVar2, v0 != null ? v0.getSessionId() : null, bool.booleanValue());
        }
    }
}
