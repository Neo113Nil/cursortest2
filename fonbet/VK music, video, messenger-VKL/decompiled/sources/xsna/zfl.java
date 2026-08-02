package xsna;

import android.os.Process;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.browserlogin.impl.di.BrowserLoginComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.di.ImUiPreferencesComponentImpl;
import com.vk.libvideo.impl.di.VideoNotificationsPermissionComponentImpl;
import com.vk.stat.di.StatComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.qr.web2app.QrWebToAppComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.before.UserIdLegacyTrackerTaskLogic;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zfl implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zfl(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        UserIdLegacyTrackerTaskLogic.a aVar;
        switch (this.b) {
            case 0:
                return new egl();
            case 1:
                return new ImUiPreferencesComponentImpl.a();
            case 2:
                k720 k720Var = k720.a;
                return k720.M("lottie_key_superapp_v_", "lottie_animation_data");
            case 3:
                k720 k720Var2 = k720.a;
                return k720.M("steps_background_sync_schedule_key_superapp_v_", "steps_sync_schedule_name");
            case 4:
                cnw0 cnw0Var = OKVoipEngine.v;
                if (cnw0Var == null) {
                    return null;
                }
                return cnw0Var;
            case 5:
                return Preference.p(Preference.a, null);
            case 6:
                yzc0 yzc0Var = yzc0.b;
                return new h5y0(((NewsfeedOptionalAdsComponent) yzc0.c.getValue()).d5(), ((YandexAdFeatureComponent) yzc0.f.getValue()).e5(), (b25) yzc0.e.getValue());
            case 7:
                return new StatComponent.a();
            case 8:
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                String name = UserId.class.getName();
                int length = stackTrace.length;
                String str = name;
                int i = 0;
                boolean z = false;
                while (true) {
                    if (i < length) {
                        StackTraceElement stackTraceElement = stackTrace[i];
                        if (drm0.D(stackTraceElement.getClassName(), name, false)) {
                            str = stackTraceElement.getClassName();
                            z = true;
                        }
                        if (!z || epx.f(stackTraceElement.getClassName(), str)) {
                            i++;
                        } else {
                            aVar = new UserIdLegacyTrackerTaskLogic.a(stackTraceElement, str);
                        }
                    } else {
                        aVar = null;
                    }
                }
                StringBuilder sb = new StringBuilder("Don't use legacy UserId API - {");
                sb.append(aVar != null ? aVar.a() : null);
                sb.append("}!");
                new UserIdLegacyTrackerTaskLogic.UserIdLegacyUsageException(sb.toString()).printStackTrace();
                try {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                } catch (Throwable unused) {
                    return s3q0.a;
                }
            case 9:
                VKApplication.a aVar2 = VKApplication.c;
                ((StoriesComponent) m7m.e().a(fpf0.a(StoriesComponent.class))).bf().o();
                return s3q0.a;
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.CJM_TRACK;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                return new BrowserLoginComponentImpl.a();
            case 12:
                return new VideoNotificationsPermissionComponentImpl.a();
            case 13:
                return new QrWebToAppComponentImpl.a();
            case 14:
                return asu0.q;
            default:
                return new VoipAnalyticsInternalComponent.a();
        }
    }

    public /* synthetic */ zfl(Object obj, int i) {
        this.b = i;
    }
}
