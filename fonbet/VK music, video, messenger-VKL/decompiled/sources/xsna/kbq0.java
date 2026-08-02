package xsna;

import android.view.View;
import com.vk.api.generated.calls.dto.CallsSettingsDto;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.lyq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kbq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ kbq0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                ryq0 ryq0Var = (ryq0) obj;
                int i = lyq0.a.$EnumSwitchMapping$0[ryq0Var.l.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return Integer.valueOf(R.string.user_recom_themes_placeholder_step2_subtitle);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (ryq0Var.k) {
                    return Integer.valueOf(R.string.user_recom_themes_registration_placeholder_step1_subtitle);
                }
                return null;
            case 2:
                long j = ((h9x) obj).a;
                return new tq2((int) (j >> 32), (int) (j & 4294967295L));
            case 3:
                return new io.reactivex.rxjava3.internal.operators.observable.q(new mh40((View) obj, 21));
            case 4:
                return rsg0.T((rsg0) obj);
            default:
                CallsSettingsDto callsSettingsDto = (CallsSettingsDto) obj;
                return new djw0(callsSettingsDto.d(), epx.f(callsSettingsDto.e(), Boolean.TRUE));
        }
    }
}
