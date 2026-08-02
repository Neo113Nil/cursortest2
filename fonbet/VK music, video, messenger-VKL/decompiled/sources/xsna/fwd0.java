package xsna;

import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vk.profile.design.view.fab.ProfileFabView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fwd0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fwd0(int i, izs izsVar, q630 q630Var, boolean z) {
        this.c = z;
        this.d = izsVar;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return ProfileFabView.B((ProfileFabState) this.d, (ProfileFabView) this.e, this.c, (androidx.compose.runtime.a) obj, intValue);
            default:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                zzj0.a(ne7.I(49), (androidx.compose.runtime.a) obj, izsVar, q630Var, this.c);
                return s3q0.a;
        }
    }

    public /* synthetic */ fwd0(ProfileFabState profileFabState, ProfileFabView profileFabView, boolean z) {
        this.d = profileFabState;
        this.e = profileFabView;
        this.c = z;
    }
}
