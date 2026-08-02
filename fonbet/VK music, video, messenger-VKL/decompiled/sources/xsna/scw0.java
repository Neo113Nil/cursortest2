package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class scw0 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                return new VoipActionsFeatureState.d(true, bool.booleanValue(), bool.booleanValue() ? R.string.voip_local_dump_record_stop : R.string.voip_local_dump_record_start);
            default:
                return s3q0.a;
        }
    }
}
