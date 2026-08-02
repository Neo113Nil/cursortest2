package xsna;

import com.vk.content.pivacy.di.ContentPrivacyComponentImpl;
import com.vk.ecomm.market.web.di.MarketWebComponentImpl;
import com.vk.im.engine.di.lifecycle.ImEngineLifecycleScopedComponentImpl;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.vksteps.di.VkStepsComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.comments.api.di.ExternalVideoCommentsComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.MenuComponentImpl;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class r03 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ r03(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                CoreFeatures coreFeatures = CoreFeatures.CORE_SKIP_RETRY_SERVER_DOWN;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 1:
                a1w a1wVar = q1w.a;
                if (a1wVar != null) {
                    return a1wVar;
                }
                return null;
            case 2:
                return new ContentPrivacyComponentImpl.a();
            case 3:
                return qz9.b(System.currentTimeMillis());
            case 4:
                bpn0 bpn0Var = gjv.c;
                return new ikv(null, ((aky) bpn0Var.getValue()).a, ((aky) bpn0Var.getValue()).b);
            case 5:
                return new ImEngineLifecycleScopedComponentImpl.a();
            case 6:
                y970 y970Var = y970.b;
                l9r l9rVar = (l9r) y970.d.getValue();
                asu0.a.getClass();
                return new wel(l9rVar, asu0.q(), null);
            case 7:
                asu0.a.getClass();
                return (ExecutorService) asu0.T.getValue();
            case 8:
                qcy<Object>[] qcyVarArr = ProtectAppComponentImpl.i;
                return new x7e0();
            case 9:
                return new MarketWebComponentImpl.a();
            case 10:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new aul0();
            case 11:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_CATALOG_ITEM_LARGE_VKUI;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new ExternalVideoCommentsComponent.a();
            case 14:
                return new MenuComponentImpl.a();
            case 15:
                return new VkStepsComponentImpl.a();
            case 16:
                esu0.a.getClass();
                if (e43.a == null || !esu0.a().exists()) {
                    return null;
                }
                try {
                    String r = nbr.r(esu0.a(), emb.b);
                    if (drm0.N(r)) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject(r);
                    return new dsu0(jSONObject.getLong("fallback_threshold"), jSONObject.optBoolean("is_experimental_thread_pool_config_enabled", false), jSONObject.optBoolean("is_task_time_in_pool_metrics_enabled", false));
                } catch (IllegalArgumentException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return null;
                } catch (NullPointerException e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                    return null;
                } catch (JSONException e3) {
                    com.vk.metrics.eventtracking.b.a.a(e3);
                    return null;
                }
            case 17:
                return new u99(com.vk.voip.ui.c.b);
            default:
                return new kci();
        }
    }

    public /* synthetic */ r03(VKApplication vKApplication) {
        this.b = 11;
    }
}
