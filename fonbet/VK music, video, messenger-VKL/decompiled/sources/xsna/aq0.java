package xsna;

import com.vk.com.vk.donut.popup.impl.di.DonutPopupComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import com.vk.superapp.vkclient.js.bridge.api.di.JsVkclientDelegateComponent;
import com.vk.superapp.vkclient.js.bridge.impl.di.JsVkclientDelegateComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.task.di.components.InfoBridgeComponentImpl;
import com.vkontakte.android.task.di.components.SuperAppMinimizablePlayerComponentImpl;
import kotlin.Result;
import xsna.asu0;
import xsna.trw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class aq0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ aq0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        switch (this.b) {
            case 0:
                return Preference.f("multiacc_additional_prefs");
            case 1:
                qcy<Object>[] qcyVarArr = DefaultPlayerUIComponentImpl.h;
                return new sww();
            case 2:
                qcy<Object>[] qcyVarArr2 = DonutPopupComponentImpl.b;
                return new i1o();
            case 3:
                int i = FitSystemWindowsFrameLayout.h;
                CoreFeatures coreFeatures = CoreFeatures.FAIL_FAST;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 4:
                return new trw.a();
            case 5:
                return dcw0.a;
            case 6:
                k720 k720Var = k720.a;
                return k720.M("menu_items_games_v_", "menu_items_games_timestamp_name");
            case 7:
                return new e6n0();
            case 8:
                try {
                    failure = new JsVkclientDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsVkclientDelegateComponent.Companion.getClass();
                Object b = JsVkclientDelegateComponent.Companion.b();
                if (failure instanceof Result.Failure) {
                    failure = b;
                }
                return (c8m) failure;
            case 9:
                return rhn0.a();
            case 10:
                return Boolean.TRUE;
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MIX_DISCOVER_TABS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                return new InfoBridgeComponentImpl.a();
            case 13:
                return new SuperAppMinimizablePlayerComponentImpl.b();
            case 14:
                return (StatInteractorComponent) m7m.e().a(fpf0.a(StatInteractorComponent.class));
            case 15:
                asu0 asu0Var = asu0.a;
                s63 s63Var = asu0.n;
                asu0Var.getClass();
                return asu0.E((asu0.a) asu0.G(0, s63Var).invoke(), "vk-rl-cache-thread-");
            default:
                xof0 b2 = com.vk.toggle.d.d.b();
                if (b2 == null) {
                    return null;
                }
                return new rfv0(b2);
        }
    }
}
