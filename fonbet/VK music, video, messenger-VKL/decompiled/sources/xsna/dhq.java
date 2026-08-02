package xsna;

import com.vk.profile.core.tabs.ui.fab.ProfileFabState;

/* compiled from: FabDelegate.kt */
/* loaded from: classes5.dex */
public interface dhq {
    static /* synthetic */ void f(dhq dhqVar, Boolean bool, Float f, int i) {
        Boolean bool2 = Boolean.FALSE;
        if ((i & 1) != 0) {
            bool2 = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        dhqVar.c(bool2, bool, f);
    }

    void c(Boolean bool, Boolean bool2, Float f);

    void g(ProfileFabState profileFabState);

    boolean getHasOffset();

    void n(ProfileFabState profileFabState, ProfileFabState profileFabState2, Float f);

    void setOnGrowthTrapButtonClick(gzs<s3q0> gzsVar);

    void setOnGrowthTrapButtonShown(gzs<s3q0> gzsVar);

    void setOnLeftButtonClicked(izs<? super ProfileFabState, s3q0> izsVar);

    void setOnRightButtonClicked(izs<? super ProfileFabState, s3q0> izsVar);
}
