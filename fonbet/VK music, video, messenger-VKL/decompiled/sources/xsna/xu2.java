package xsna;

import android.content.Context;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.clips.config.authors.impl.di.ClipsConfigAuthorsComponentBase;
import com.vk.clips.edit.di.ClipEditComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.popupmanager.impl.di.PopupManagerComponentImpl;
import com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent;
import com.vk.superapp.ads.js.bridge.impl.di.JsAdsDelegateComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xu2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xu2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        int i;
        switch (this.b) {
            case 0:
                return asu0.C();
            case 1:
                return o25.a().c();
            case 2:
                return new n97();
            case 3:
                qcy<Object>[] qcyVarArr = ClipEditComponentImpl.c;
                return new twe();
            case 4:
                qcy<Object>[] qcyVarArr2 = ClipsConfigAuthorsComponentBase.f;
                return Boolean.FALSE;
            case 5:
                return new CameraClipsComponentBase.a();
            case 6:
                qcy<Object>[] qcyVarArr3 = DefaultPlayerUIComponentImpl.h;
                return new zil();
            case 7:
                return com.vkontakte.android.data.a.a;
            case 8:
                return Boolean.valueOf(Preference.d("performance", "__app_performance_app_crash_storage_fix_enabled", false));
            case 9:
                return new fhv();
            case 10:
                try {
                    failure = new JsAdsDelegateComponentImpl.b();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsAdsDelegateComponent.Companion.getClass();
                Object b = JsAdsDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 11:
                Context context = xuo0.e;
                return Boolean.valueOf(context != null ? Preference.h(context, 0, "time_provider").getBoolean("use_server_clock", false) : false);
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AUTHOR_CLIP_ONBOARD;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new GamesCatalogComponentImpl.a();
            case 14:
                return new PopupManagerComponentImpl.a();
            case 15:
                return asu0.l;
            default:
                if (BuildInfo.e != 99999 || !BuildInfo.h()) {
                    eqy<bek0> eqyVar = com.vk.toggle.d.a;
                    b.d i2 = com.vk.toggle.b.A.i(CoreFeatures.SINGLE_PREF_FILE);
                    try {
                        i = Integer.parseInt(i2 != null ? i2.c.toString() : null);
                    } catch (Throwable unused) {
                        i = 0;
                    }
                    if (i == 1) {
                        r1 = true;
                    }
                }
                return Boolean.valueOf(r1);
        }
    }
}
