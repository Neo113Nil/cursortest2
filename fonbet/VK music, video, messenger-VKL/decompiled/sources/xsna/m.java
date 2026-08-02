package xsna;

import android.content.SharedPreferences;
import com.google.gson.GsonBuilder;
import com.vk.catalog.mvi.section.impl.di.CatalogInteractorComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.ecomm.cart.impl.di.CartComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.di.ImReportersComponentImpl;
import com.vk.libvideo.di.VideoDownloadsComponentImpl;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.vkworkout.di.VkWorkoutWidgetBridgeComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.push.PushComponentImpl;
import com.vkontakte.android.task.di.components.VkMaxUtilityComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.text.Regex;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import xsna.hds;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Executors.newSingleThreadExecutor();
            case 1:
                return new Regex("\"sizes\":(\\[.*?\\])");
            case 2:
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                zeb c = zdwVar.c();
                if (c != null) {
                    return ((kju0) c).n;
                }
                return null;
            case 3:
                return new ImReportersComponentImpl.a();
            case 4:
                return new GsonBuilder().setLenient().create();
            case 5:
                return new CatalogInteractorComponentImpl.a();
            case 6:
                cnw0 cnw0Var = OKVoipEngine.v;
                if (cnw0Var == null) {
                    return null;
                }
                return cnw0Var;
            case 7:
                return hds.a.a;
            case 8:
                Preference preference = Preference.a;
                preference.getClass();
                SharedPreferences p = Preference.p(preference, "by_version");
                int i = p.getInt(CallAnalyticsApiRequest.KEY_APP_VERSION, 0);
                if (i != Preference.h) {
                    p.edit().clear().apply();
                    p.edit().putInt(CallAnalyticsApiRequest.KEY_APP_VERSION, Preference.h).putInt("app_prev_version", i).apply();
                }
                return p;
            case 9:
                return new adf0();
            case 10:
                return new pep0(new son0());
            case 11:
                VkWorkoutWidgetBridgeComponent.Companion.getClass();
                return VkWorkoutWidgetBridgeComponent.Companion.a();
            case 12:
                return new CartComponentImpl.a();
            case 13:
                qcy<Object>[] qcyVarArr = StoryViewerComponentImpl.s;
                return new a7m0();
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_PROFILE_BOTTOM_SHEET_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 15:
                return new VkMaxUtilityComponent.a();
            case 16:
                return new VideoDownloadsComponentImpl.a();
            case 17:
                return new PushComponentImpl.a();
            case 18:
                asu0.a.getClass();
                ExecutorService executorService = (ExecutorService) asu0.e0.getValue();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
            case 19:
                return new cew0(new bpc0(12));
            default:
                o260 o260Var = d260.a;
                return (o260Var != null ? o260Var : null).b(NetworkClient.ClientType.CLIENT_WEB);
        }
    }
}
