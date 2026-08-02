package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import com.vk.profile.user.api.domain.onboarding.analytics.OnBoardingType;
import com.vkontakte.android.R;
import java.util.Map;
import ru.ok.gl.tf.Tensorflow;
import xsna.b080;

/* compiled from: OnboardingRouterImpl.kt */
/* loaded from: classes5.dex */
public final class rh80 implements qh80 {
    @Override // xsna.qh80
    public final void a(Context context, Hint hint, UserId userId) {
        Map<String, String> map = hint.e;
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        String string = context2.getString(R.string.photo_flow_onboarding_title_1);
        String string2 = context2.getString(R.string.photo_flow_onboarding_subtitle_1);
        String str = map != null ? map.get("dark_1") : null;
        if (str == null) {
            str = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource = new ContentHintOnboardingResource.RemoteContentResource(string, string2, new ContentHintOnboardingResource.ContentUrl.Video(str), context2.getString(R.string.photo_flow_onboarding_button_1));
        String string3 = context2.getString(R.string.photo_flow_onboarding_title_2);
        String string4 = context2.getString(R.string.photo_flow_onboarding_subtitle_2);
        String str2 = map != null ? map.get("dark_2") : null;
        if (str2 == null) {
            str2 = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource2 = new ContentHintOnboardingResource.RemoteContentResource(string3, string4, new ContentHintOnboardingResource.ContentUrl.Video(str2), context2.getString(R.string.photo_flow_onboarding_button_2));
        String string5 = context2.getString(R.string.photo_flow_onboarding_title_3);
        String string6 = context2.getString(R.string.photo_flow_onboarding_subtitle_3);
        String str3 = map != null ? map.get("dark_3") : null;
        if (str3 == null) {
            str3 = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource3 = new ContentHintOnboardingResource.RemoteContentResource(string5, string6, new ContentHintOnboardingResource.ContentUrl.Video(str3), context2.getString(R.string.photo_flow_onboarding_button_3));
        String string7 = context2.getString(R.string.photo_flow_onboarding_title_4);
        String string8 = context2.getString(R.string.photo_flow_onboarding_subtitle_4);
        String str4 = map != null ? map.get("dark_4") : null;
        if (str4 == null) {
            str4 = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource4 = new ContentHintOnboardingResource.RemoteContentResource(string7, string8, new ContentHintOnboardingResource.ContentUrl.Video(str4), context2.getString(R.string.photo_flow_onboarding_button_4));
        String string9 = context2.getString(R.string.photo_flow_onboarding_title_5);
        String string10 = context2.getString(R.string.photo_flow_onboarding_subtitle_5);
        String str5 = map != null ? map.get("dark_5_android") : null;
        if (str5 == null) {
            str5 = "";
        }
        ContentHintOnboardingResource.Contents.ServicesContents servicesContents = new ContentHintOnboardingResource.Contents.ServicesContents(e43.l(remoteContentResource, remoteContentResource2, remoteContentResource3, remoteContentResource4, new ContentHintOnboardingResource.RemoteContentResource(string9, string10, new ContentHintOnboardingResource.ContentUrl.Video(str5), context2.getString(R.string.photo_flow_onboarding_button_5))));
        String string11 = context2.getString(R.string.photo_flow_onboarding_title_1);
        String string12 = context2.getString(R.string.photo_flow_onboarding_subtitle_1);
        String str6 = map != null ? map.get("light_1") : null;
        if (str6 == null) {
            str6 = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource5 = new ContentHintOnboardingResource.RemoteContentResource(string11, string12, new ContentHintOnboardingResource.ContentUrl.Video(str6), context2.getString(R.string.photo_flow_onboarding_button_1));
        String string13 = context2.getString(R.string.photo_flow_onboarding_title_2);
        String string14 = context2.getString(R.string.photo_flow_onboarding_subtitle_2);
        String str7 = map != null ? map.get("light_2") : null;
        if (str7 == null) {
            str7 = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource6 = new ContentHintOnboardingResource.RemoteContentResource(string13, string14, new ContentHintOnboardingResource.ContentUrl.Video(str7), context2.getString(R.string.photo_flow_onboarding_button_2));
        String string15 = context2.getString(R.string.photo_flow_onboarding_title_3);
        String string16 = context2.getString(R.string.photo_flow_onboarding_subtitle_3);
        String str8 = map != null ? map.get("light_3") : null;
        if (str8 == null) {
            str8 = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource7 = new ContentHintOnboardingResource.RemoteContentResource(string15, string16, new ContentHintOnboardingResource.ContentUrl.Video(str8), context2.getString(R.string.photo_flow_onboarding_button_3));
        String string17 = context2.getString(R.string.photo_flow_onboarding_title_4);
        String string18 = context2.getString(R.string.photo_flow_onboarding_subtitle_4);
        String str9 = map != null ? map.get("light_4") : null;
        if (str9 == null) {
            str9 = "";
        }
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource8 = new ContentHintOnboardingResource.RemoteContentResource(string17, string18, new ContentHintOnboardingResource.ContentUrl.Video(str9), context2.getString(R.string.photo_flow_onboarding_button_4));
        String string19 = context2.getString(R.string.photo_flow_onboarding_title_5);
        String string20 = context2.getString(R.string.photo_flow_onboarding_subtitle_5);
        String str10 = map != null ? map.get("light_5_android") : null;
        new b080.a(context, new ContentHintOnboardingResource(servicesContents, new ContentHintOnboardingResource.Contents.ServicesContents(e43.l(remoteContentResource5, remoteContentResource6, remoteContentResource7, remoteContentResource8, new ContentHintOnboardingResource.RemoteContentResource(string19, string20, new ContentHintOnboardingResource.ContentUrl.Video(str10 != null ? str10 : ""), context2.getString(R.string.photo_flow_onboarding_button_5))))), hint.b, true, true, OnBoardingType.PHOTO_FLOW, userId, null, Tensorflow.FRAME_HEIGHT).I0(hint.b);
    }
}
