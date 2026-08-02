package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.vk.catalog2.feature.music.search.history.di.SearchHistoryRepoComponentImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.newsfeed.impl.postmodal.reactions.di.ModalPostReactionsComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.web.view.marker.di.WebViewMarkerComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.SuperAppMinimizablePlayerComponentImpl;
import java.util.Arrays;
import java.util.Locale;
import xsna.kfv0;
import xsna.nu70;
import xsna.vvs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class x0f implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ x0f(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ClipsCoauthorsComponentImpl.a();
            case 1:
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                return intent;
            case 2:
                int i = nu70.b;
                return nu70.a.a();
            case 3:
                return new SearchHistoryRepoComponentImpl.a();
            case 4:
                return xhr0.c(String.format(Locale.US, "VKApp/%s (Linux; U; Android %s; %s Build/%s)", Arrays.copyOf(new Object[]{BuildInfo.d, Build.VERSION.RELEASE, Build.MODEL, Build.ID}, 4)));
            case 5:
                return Boolean.valueOf(com.vk.toggle.d.s().a);
            case 6:
                return new Handler(Looper.getMainLooper());
            case 7:
                qcy<Object>[] qcyVarArr = SuperAppMinimizablePlayerComponentImpl.g;
                return vvs0.a.a;
            case 8:
                VKApplication.a aVar = VKApplication.c;
                VideoPipStateHolder.a.getClass();
                return VideoPipStateHolder.c();
            case 9:
                VKApplication.a aVar2 = VKApplication.c;
                a201.b().c();
                return s3q0.a;
            case 10:
                dhr0 dhr0Var = dhr0.a;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                dhr0Var.getClass();
                return dhr0.n(context);
            case 11:
                CoreFeatures coreFeatures = CoreFeatures.NEW_NAVIGATION_ROUTER;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 12:
                return new WebViewMarkerComponentImpl.a();
            case 13:
                return new ModalPostReactionsComponentImpl.a();
            case 14:
                if (jfv0.h.length() == 0) {
                    tv4.b("No appId was set during Reef initialization", com.vk.metrics.eventtracking.b.a);
                }
                return new kfv0.a(jfv0.h, jfv0.g, jfv0.i).a();
            default:
                return new Handler(Looper.getMainLooper());
        }
    }
}
