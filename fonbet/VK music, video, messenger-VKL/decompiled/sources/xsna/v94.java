package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.audience.impl.di.AudienceResearchComponentImpl;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.clips.config.authors.impl.di.ClipsConfigAuthorsComponentBase;
import com.vk.core.apps.BuildInfo;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.toggle.Features;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.SuperAppPip2Component;
import com.vkontakte.android.task.di.components.navigation.VkAppRouterComponentImpl;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import xsna.dhr0;
import xsna.q6r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v94 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ v94(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Lazy lazy;
        int i = 0;
        VkBuildAppStore vkBuildAppStore = null;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AudienceResearchComponentImpl.d;
                return new eb4();
            case 1:
                umu0 umu0Var = r55.g;
                if (umu0Var == null) {
                    umu0Var = null;
                }
                umu0Var.getClass();
                r55 r55Var = r55.a;
                umu0 umu0Var2 = r55.g;
                return new q3z(r55.a(), (umu0Var2 != null ? umu0Var2 : null).e, r55.h().n(), VkClientLibverifyInfo.Service.REGISTRATION);
            case 2:
                return 0L;
            case 3:
                return new ClipsConfigAuthorsComponentBase.a();
            case 4:
                return new CommonEditorComponentImpl.a();
            case 5:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_STARTUP_BACKOFF_CONFIG);
            case 6:
                return Boolean.valueOf(BuildInfo.s());
            case 7:
                vwv vwvVar = vwv.b;
                vwvVar.getClass();
                ur4 b = ((xal) vwv.g.getValue()).b();
                if (b != null) {
                    int a = b.a();
                    List<String> list = qr4.a;
                    qr4.c(jw5.g, b);
                    io.reactivex.rxjava3.disposables.c cVar = vwv.h;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    aqi aqiVar = vwv.d;
                    if (aqiVar == null) {
                        aqiVar = null;
                    }
                    aqiVar.getClass();
                    a1w a1wVar = q1w.a;
                    vwv.h = (a1wVar != null ? a1wVar : null).E(vwvVar, new dhr(a)).m(asu0.a.d()).subscribe(new cw(new sd4(29), 24), new k5(new kz0(22), 23));
                }
                return s3q0.a;
            case 8:
                return new p2w();
            case 9:
                qcy<Object>[] qcyVarArr2 = ReviewsComponentImpl.l;
                return new nla0();
            case 10:
                mgn0 mgn0Var = jgn0.a;
                return (mgn0Var == null || !mgn0Var.l) ? new hnv0() : new qjv0((ExecutorService) jgn0.f.getValue());
            case 11:
                return qz9.b(SystemClock.currentThreadTimeMillis());
            case 12:
                return ((AccountManagerComponent) j6i.b(m7m.f(new q6r0.e()), AccountManagerComponent.class)).c();
            case 13:
                VKApplication.a aVar = VKApplication.c;
                t6g0 t6g0Var = t6g0.b;
                t6g0.d().c();
                return Boolean.valueOf(t6g0.d().K0());
            case 14:
                Context context = e43.a;
                Context context2 = context != null ? context : null;
                ehr0 ehr0Var = dhr0.e;
                return new dhr0.f(context2, (dhr0.C().b ? ehr0Var.a : ehr0Var.b).c);
            case 15:
                return new NewsfeedMappersComponentImpl.a();
            case 16:
                return new SuperAppPip2Component.a();
            case 17:
                qcy<Object>[] qcyVarArr3 = VkAppRouterComponentImpl.b;
                return new pau0();
            case 18:
                VkBuildAppStore.a aVar2 = VkBuildAppStore.Companion;
                String str = (String) com.vk.core.apps.a.i.getValue();
                aVar2.getClass();
                VkBuildAppStore[] values = VkBuildAppStore.values();
                int length = values.length;
                while (true) {
                    if (i < length) {
                        VkBuildAppStore vkBuildAppStore2 = values[i];
                        if (epx.f(vkBuildAppStore2.i(), str)) {
                            vkBuildAppStore = vkBuildAppStore2;
                        } else {
                            i++;
                        }
                    }
                }
                if (vkBuildAppStore != null) {
                    return vkBuildAppStore;
                }
                lazy = VkBuildAppStore.DEFAULT$delegate;
                return (VkBuildAppStore) lazy.getValue();
            case 19:
                asu0.a.getClass();
                return new j3q((ExecutorService) asu0.s0.getValue());
            case 20:
                asu0.a.getClass();
                bsu0 bsu0Var = (bsu0) asu0.E.getValue();
                return Boolean.valueOf(bsu0Var != null ? bsu0Var.c : false);
            case 21:
                return new qkg();
            default:
                return new bit();
        }
    }
}
