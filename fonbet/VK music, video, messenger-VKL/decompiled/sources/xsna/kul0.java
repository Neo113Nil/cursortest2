package xsna;

import com.vk.api.generated.stories.dto.StoriesGetFeedSettingsResponseDto;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.voip.ui.VoipViewModelState;
import xsna.gaw0;
import xsna.h1o0;
import xsna.l1o0;
import xsna.ncp0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kul0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ kul0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                StoriesGetFeedSettingsResponseDto storiesGetFeedSettingsResponseDto = (StoriesGetFeedSettingsResponseDto) obj;
                Boolean e = storiesGetFeedSettingsResponseDto.e();
                Boolean bool = Boolean.TRUE;
                return new hsl0(epx.f(e, bool), epx.f(storiesGetFeedSettingsResponseDto.d(), bool));
            case 1:
                qgi0.g((tgi0) obj);
                return s3q0.a;
            case 2:
                l1o0.a aVar = (l1o0.a) obj;
                return new h1o0.b.C2967b(aVar.a, aVar.b, aVar.c);
            case 3:
                return new ncp0.a(((Integer) obj).intValue());
            case 4:
                int i = UserProfileHeaderView.G;
                qgi0.r((tgi0) obj, "topBarLeftIcon");
                return s3q0.a;
            case 5:
                tj50.a aVar2 = (tj50.a) obj;
                w9w0 w9w0Var = w9w0.b;
                ao8 ao8Var = ao8.d;
                return new gaw0.a(aVar2.a(w9w0Var, ao8Var), aVar2.a(x9w0.b, ao8Var), aVar2.a(new bws(28), ao8Var));
            default:
                return Boolean.valueOf(((VoipViewModelState) obj) == VoipViewModelState.InCall);
        }
    }
}
