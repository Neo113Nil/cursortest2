package xsna;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.ecomm.moderation.api.di.ModerationComponent$Companion$STUB$1;
import com.vk.feature.uxpolls.modalpoll.BaseModalFragment;
import com.vk.music.player.analytics.impl.tracker.di.PlayerAnalyticsComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.auth.js.bridge.impl.di.JsAuthDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import xsna.rwu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ c6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        AdRevenueRepository initialize$lambda$220$lambda$82;
        switch (this.b) {
            case 0:
                return new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
            case 1:
                return new s290();
            case 2:
                int i = BaseModalFragment.V;
                return new Handler(Looper.getMainLooper());
            case 3:
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = ClipsEntryPointsComponentImpl.f;
                return new rud();
            case 5:
                qcy<Object>[] qcyVarArr2 = ClipsViewersSdkComponentImpl.l;
                return new djh0();
            case 6:
                return new Handler(Looper.getMainLooper());
            case 7:
                return new dem(new xpp(), false);
            case 8:
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return new he70();
            case 12:
                return new gj2();
            case 13:
                return new ucg0();
            case 14:
                qcy<Object>[] qcyVarArr3 = JsAuthDelegateComponentImpl.b;
                return new j2y();
            case 15:
                return new StringBuilder();
            case 16:
                return Boolean.TRUE;
            case 17:
                qcy<Object>[] qcyVarArr4 = ModerationComponent$Companion$STUB$1.f;
                return new a430();
            case 18:
                return fxc0.B();
            case 19:
                return Boolean.valueOf(MusicFeatures.AUDIO_VKUI_SEARCH.h());
            case 20:
                return new t3c0(null);
            case 21:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent));
            case 22:
                qcy<Object>[] qcyVarArr5 = PlayerAnalyticsComponentImpl.i;
                return new on40();
            case 23:
                return new o9r0(false, null, Float.valueOf(cn70.a() * 1.5f), null, true, null, Float.valueOf(cn70.a() * 1.5f), Float.valueOf(cn70.a() * 1.5f), Float.valueOf(cn70.a() * 30.0f), 1578);
            case 24:
                return ((NewsFeedComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 25:
                return new rwu.a(new s7c0(3)).b().toString();
            case 26:
                initialize$lambda$220$lambda$82 = ServiceProvider.initialize$lambda$220$lambda$82();
                return initialize$lambda$220$lambda$82;
            case 27:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMS_INBOX_FATAL_ERROR, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 28:
                qcy<Object>[] qcyVarArr6 = StoriesComponentImpl.N;
                return new StoriesComponentImpl.b();
            default:
                iyk0 iyk0Var = qer0.a;
                return Boolean.FALSE;
        }
    }
}
