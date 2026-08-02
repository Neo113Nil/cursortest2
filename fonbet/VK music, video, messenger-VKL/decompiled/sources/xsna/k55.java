package xsna;

import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.mail.auth.contract.di.MailAuthInternalComponent;
import com.vk.music.di.VkAppPlayerUIComponentImpl;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.profile.community.suggestions.impl.di.CommunitySuggestionsComponentImpl;
import com.vk.stories.viewer.reactions.impl.di.StoryReactionsComponentImpl;
import com.vk.superapp.di.AboutAppComponentImpl;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.topics.impl.di.TopicsComponentImpl;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.VKApplication;
import java.util.regex.Pattern;
import ru.ok.android.externcalls.sdk.Conversation;
import xsna.l55;
import xsna.q6r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k55 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ k55(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                return ((MailAuthInternalComponent) ((k7m) m7m.f(new l55.e())).a(fpf0.a(MailAuthInternalComponent.class))).z2().a();
            case 1:
                return new CommunitySuggestionsComponentImpl.a();
            case 2:
                return new StoryReactionsComponentImpl.a();
            case 3:
                return Pattern.compile("\\d{8}|\\d{6}|\\d{4}");
            case 4:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_NEW_API_CLIENT);
            case 5:
                return vfv0.a;
            case 6:
                mgn0 mgn0Var = jgn0.a;
                if (mgn0Var != null) {
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(mgn0Var.a) == 0) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 7:
                qcy<Object>[] qcyVarArr = TabbarSettingsComponentImpl.p;
                return new iwn0();
            case 8:
                qcy<Object>[] qcyVarArr2 = TopicsComponentImpl.c;
                return new ki7();
            case 9:
                return ((MultiAccountComponent) j6i.b(m7m.f(new q6r0.c()), MultiAccountComponent.class)).c();
            case 10:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.FEATURE_VIDEO_FINAL_TREE_COMMENTS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                if (fxc0.B().J().A()) {
                    return new kls0();
                }
                return null;
            case 13:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.DB_QUERIES_STAT);
                if (i == null) {
                    return null;
                }
                if (!i.a) {
                    i = null;
                }
                if (i != null) {
                    return i.c.toString();
                }
                return null;
            case 14:
                return new AboutAppComponentImpl.a();
            case 15:
                return l9u0.a;
            case 16:
                qcy<Object>[] qcyVarArr3 = VkAppPlayerUIComponentImpl.k;
                return new zza0(BottomPlayerAppearance.COMPACT);
            case 17:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                Boolean bool = (Boolean) com.vk.core.apps.a.c(Boolean.FALSE, "com.vk.IS_DYNAMIC_BUILD");
                bool.getClass();
                return bool;
            case 18:
                com.vk.voip.ui.c.r.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation != null) {
                    return conversation.getAsrOnlineManager();
                }
                return null;
            default:
                return new tit();
        }
    }

    public /* synthetic */ k55(VKApplication vKApplication) {
        this.b = 10;
    }
}
