package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pcw0 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new VoipActionsFeatureState.g(true, ((Boolean) obj).booleanValue());
            case 1:
                return inw0.a((UserProfile) obj);
            default:
                return (grx0) obj;
        }
    }
}
