package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.core.apps.BuildInfo;
import com.vk.ecomm.cart.impl.di.CartComponentImpl;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.shared.di.ReportComponentImpl;
import com.vk.superapp.core.js.bridge.api.di.JsCoreDelegateComponent;
import com.vk.superapp.core.js.bridge.impl.di.JsCoreDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.ProfileFragmentProviderComponentImpl;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkEditComponentVkApp;
import kotlin.Result;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class mn8 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mn8(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return (String) drm0.c0(BuildInfo.d, new String[]{"-"}, 0, 6).get(0);
            case 1:
                qcy<Object>[] qcyVarArr = CartComponentImpl.f;
                return new uv9();
            case 2:
                return new ClipsUploadSdkEditComponentVkApp.a();
            case 3:
                qcy<Object>[] qcyVarArr2 = MarketComponentImpl.l;
                return new r9h();
            case 4:
                k720 k720Var = k720.a;
                return k720.M("menu_items_superapp_v_", "superapp_last_loaded_timestamp");
            case 5:
                dhr0.a.getClass();
                return dhr0.E();
            case 6:
                return new yho0(new s040());
            case 7:
                return ((OfflineAudioComponent) k840.a.b().a(fpf0.a(OfflineAudioComponent.class))).I();
            case 8:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 9:
                return new kym();
            case 10:
                try {
                    failure = new JsCoreDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsCoreDelegateComponent.Companion.getClass();
                Object b = JsCoreDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 11:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(com.vk.toggle.b.A.a(MusicFeatures.AUDIO_NEW_DOWNLOADED_TRACKS_DUPLICATE_FIX));
            case 12:
                VKApplication.a aVar = VKApplication.c;
                return q6r0.f().y();
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_CAST_NEW_RECEIVER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_FIX_FILTERS;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 15:
                return new ProfileFragmentProviderComponentImpl.a();
            case 16:
                return new ReportComponentImpl.a();
            case 17:
                return asu0.k;
            default:
                return new Handler(Looper.getMainLooper());
        }
    }
}
