package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.SpoilersOnboardingV2;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;

/* loaded from: classes2.dex */
public final class ewt0 implements ev31 {
    public final Context a;
    public final b b;

    public ewt0(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public static Text a(int i, String str) {
        return str != null ? g8e.i(Text.Companion, str) : unr0.h(Text.Companion, i);
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        b bVar = this.b;
        bVar.getClass();
        SpoilersOnboardingV2 spoilersOnboardingV2 = (SpoilersOnboardingV2) bVar.d(mwt0.a).getData();
        Text a = a(dzh0.ybsdk_spoilers_spoiler_onboarding_title, spoilersOnboardingV2.getTitle());
        String descriptionHtml = spoilersOnboardingV2.getDescriptionHtml();
        if (descriptionHtml == null) {
            descriptionHtml = spoilersOnboardingV2.getSubtitle();
        }
        return new dwt0(a, a(dzh0.ybsdk_spoilers_spoiler_onboarding_description_v2, descriptionHtml), new vrc(CommunicationFullScreenView$State$Type.VIDEO, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, 0, false, null, lob1.f(this.a) ? spoilersOnboardingV2.getVideo().getDark() : spoilersOnboardingV2.getVideo().getLight(), VideoPlayer$RepeatMode.ONE, null, null, null, -471859202, 3), new YbButtonViewGroup.b(null, new YbButtonView.a(a(dzh0.ybsdk_spoilers_spoiler_onboarding_primary_button_title_v2, spoilersOnboardingV2.getPrimaryButtonTitle()), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(a(dzh0.ybsdk_spoilers_spoiler_onboarding_secondary_button_title_v2, spoilersOnboardingV2.getSecondaryButtonTitle()), null, null, null, null, null, null, false, false, null, 4094), null, 9));
    }
}
