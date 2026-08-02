package xsna;

import com.vkontakte.android.R;
import xsna.rgw0;
import xsna.tlo0;

/* compiled from: VoipCallByPhoneViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class ugw0 {
    public static tlo0.f a(rgw0 rgw0Var) {
        tlo0.a aVar;
        int i;
        if (rgw0Var instanceof rgw0.h) {
            aVar = tlo0.Companion;
            i = R.string.voip_call_by_phone_label_unknown_peer;
        } else if (rgw0Var instanceof rgw0.c) {
            aVar = tlo0.Companion;
            i = R.string.voip_call_by_phone_label_calls_disabled;
        } else if (rgw0Var instanceof rgw0.i) {
            aVar = tlo0.Companion;
            i = R.string.voip_call_by_phone_label_was_offline_too_long;
        } else {
            if (!(rgw0Var instanceof rgw0.a)) {
                return null;
            }
            aVar = tlo0.Companion;
            i = R.string.voip_call_by_phone_label_call_to_self;
        }
        return tq.h(aVar, i);
    }
}
