package xsna;

import android.content.Context;
import android.os.Build;
import com.vk.clips.sdk.target.impl.di.MyTargetComponentImpl;
import com.vk.coowners.di.NewsfeedCoownersComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.music.offline.configs.impl.di.AudioReactionsComponentImpl;
import com.vk.queuesync.di.SuperAppQueueComponentImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.toggle.Features;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class r63 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ r63(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExecutorService b;
        String str;
        switch (this.b) {
            case 0:
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "vk-logger-thread");
                return b;
            case 1:
                nb3.a.getClass();
                int i = BuildInfo.e;
                Context context = e43.a;
                String d = b6m.d(context != null ? context : null);
                str = Build.BRAND;
                String str2 = Build.MODEL;
                r6m.a.getClass();
                return new MobileOfficialAppsCoreDeviceStat$DeviceInfoItem(i, d, str, str2, "android", String.valueOf(Build.VERSION.SDK_INT));
            case 2:
                return new MyTargetComponentImpl.a();
            case 3:
                return new u83();
            case 4:
                return Executors.newSingleThreadExecutor();
            case 5:
                return new io.reactivex.rxjava3.subjects.f();
            case 6:
                o2l.a.getClass();
                boolean z = false;
                if (BuildInfo.h() && o2l.b("__dbg_simulate_cmd_delays", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return new ix4();
            case 8:
                return new AudioReactionsComponentImpl.a();
            case 9:
                return Boolean.valueOf(com.vk.toggle.b.A.a(Features.Type.FEATURE_SMB_AD_DISCLAIMER_REDESIGN));
            case 10:
                t6g0 t6g0Var = t6g0.b;
                return new bcq((klq0) t6g0.e.getValue());
            case 11:
                VKApplication.a aVar = VKApplication.c;
                return com.vk.toggle.d.m().b;
            case 12:
                return ((MultiAccountComponent) ((k7m) m7m.f(i9r0.a)).a(fpf0.a(MultiAccountComponent.class))).c();
            case 13:
                return o360.b();
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ALBUM_SLIDER_VKUI;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                return new t5t0();
            case 16:
                return new SuperAppQueueComponentImpl.a();
            case 17:
                return new NewsfeedCoownersComponentImpl.a();
            case 18:
                return asu0.i;
            default:
                o260 o260Var = d260.a;
                o260 o260Var2 = o260Var != null ? o260Var : null;
                o260Var2.getClass();
                return o260Var2.b(NetworkClient.ClientType.CLIENT_DEFAULT);
        }
    }
}
