package xsna;

import com.vk.feed.settings.impl.di.NewsfeedSettingsComponentImpl;
import com.vk.onboardingscreens.impl.di.OnboardingScreensComponentImpl;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vk.voip.OKVoipEngine;
import ru.ok.android.externcalls.sdk.Conversation;
import xsna.rwm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class om60 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ om60(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new j2c0();
            case 1:
                qcy<Object>[] qcyVarArr = NewsfeedSettingsComponentImpl.d;
                return new ysg0();
            case 2:
                OKVoipEngine.b.getClass();
                return OKVoipEngine.E.getConversation();
            case 3:
                qcy<Object>[] qcyVarArr2 = OnboardingScreensComponentImpl.h;
                return new hzq0();
            case 4:
                return new lfa0();
            case 5:
                return new l1e0(new m1e0(com.vk.contacts.d.a, new a1e0()));
            case 6:
                return new q9q0();
            case 7:
                PublishFragmentInternalComponent.a aVar = PublishFragmentInternalComponent.v;
                return new bee0(new uft0(), new zqu(), new dy2());
            case 8:
                return new zpf0();
            case 9:
                return s3q0.a;
            case 10:
                nr4.a().getClass();
                return Integer.valueOf(o0m0.a());
            case 11:
                int i = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.c(dhr0.y());
            case 12:
                return new jl80();
            case 13:
                int i2 = VideoAlbumFragment.i1;
                return Boolean.valueOf(fxc0.B().J().X1());
            case 14:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(fxc0.B().J().s1());
            case 15:
                return new ucg0();
            case 16:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(com.vk.voip.ui.c.G().b());
            default:
                com.vk.voip.ui.c.r.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation != null) {
                    return conversation.getMediaMuteManager();
                }
                return null;
        }
    }
}
