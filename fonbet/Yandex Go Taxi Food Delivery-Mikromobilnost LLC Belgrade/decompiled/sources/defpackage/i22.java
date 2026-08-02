package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.LruCache;
import com.yandex.go.antirobot.experiment.AntirobotExperiment;
import com.yandex.go.app.icon.experiments.AppDynamicIconExperiment;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.AppBarScaffold;
import com.yandex.go.lifecycle.experiments.AppLifecycleLcpExperiment;
import com.yandex.go.lifecycle.experiments.AppLifecycleLcpExperiment$DelayScenario$$serializer;
import com.yandex.go.lifecycle.experiments.b;
import com.yandex.go.splash.data.dto.AnimatedSplashScreenExperiment;
import com.yandex.go.splash.data.dto.AnimatedSplashScreenExperiment$SplashAnimation$$serializer;
import com.yandex.go.splash.data.dto.a;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.persuggest.api.LocationProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class i22 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ i22(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        pz40 state_delegate$lambda$0;
        switch (this.a) {
            case 0:
                return new LruCache(256);
            case 1:
                HandlerThread handlerThread = new HandlerThread("Analytics Handler Thread");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 2:
                return new p53(auu0.a, 0);
            case 3:
                i3y i3yVar = skd0.a;
                return skd0.d().toString();
            case 4:
                a aVar = AnimatedSplashScreenExperiment.Companion;
                return new p53(AnimatedSplashScreenExperiment$SplashAnimation$$serializer.INSTANCE, 0);
            case 5:
                lh2 lh2Var = lh2.c;
                return NavigationDirection.FORWARD;
            case 6:
                lh2 lh2Var2 = lh2.c;
                return NavigationDirection.BACKWARD;
            case 7:
                com.yandex.go.antirobot.experiment.a aVar2 = AntirobotExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 8:
                com.yandex.go.flex.common.scaffolds.appbarscaffold.a aVar3 = AppBarScaffold.Companion;
                return DivkitSnippet.Companion.serializer();
            case 9:
                com.yandex.go.flex.common.scaffolds.appbarscaffold.a aVar4 = AppBarScaffold.Companion;
                return ThemedColor.Companion.serializer();
            case 10:
                com.yandex.go.flex.common.scaffolds.appbarscaffold.a aVar5 = AppBarScaffold.Companion;
                return DivkitSnippet.Companion.serializer();
            case 11:
                com.yandex.go.flex.common.scaffolds.appbarscaffold.a aVar6 = AppBarScaffold.Companion;
                return DivkitSnippet.Companion.serializer();
            case 12:
                com.yandex.go.flex.common.scaffolds.appbarscaffold.a aVar7 = AppBarScaffold.Companion;
                return DivkitSnippet.Companion.serializer();
            case 13:
                com.yandex.go.flex.common.scaffolds.appbarscaffold.a aVar8 = AppBarScaffold.Companion;
                return ThemedColor.Companion.serializer();
            case 14:
                com.yandex.go.app.icon.experiments.a aVar9 = AppDynamicIconExperiment.Companion;
                return AppDynamicIconExperiment.DynamicAppIcon.Companion.serializer();
            case 15:
                return vez0.g("com.yandex.go.app.icon.experiments.AppDynamicIconExperiment.DynamicAppIcon", AppDynamicIconExperiment.DynamicAppIcon.values(), new String[]{"default"}, new Annotation[][]{null});
            case 16:
                com.yandex.go.lifecycle.experiments.a aVar10 = AppLifecycleLcpExperiment.Companion;
                return new p53(AppLifecycleLcpExperiment$DelayScenario$$serializer.INSTANCE, 0);
            case 17:
                b bVar = AppLifecycleLcpExperiment.DelayScenario.Companion;
                return AppLifecycleLcpExperiment.DelayScenario.Strategy.Companion.serializer();
            case 18:
                return vez0.g("com.yandex.go.lifecycle.experiments.AppLifecycleLcpExperiment.DelayScenario.Strategy", AppLifecycleLcpExperiment.DelayScenario.Strategy.values(), new String[]{"after_fcp", "after_lcp", "primary_on_activity", "on_activity", "on_application", "on_configuration", null}, new Annotation[][]{null, null, null, null, null, null, null});
            case 19:
                oz40 oz40Var = sy2.a;
                return null;
            case 20:
                oz40 oz40Var2 = ty2.a;
                return null;
            case 21:
                throw new IllegalStateException("Missing Colors Setup");
            case 22:
                throw new IllegalStateException("Missing Typography Setup");
            case 23:
                throw new IllegalStateException("Missing Shapes Setup");
            case 24:
                state_delegate$lambda$0 = AppVisibilitySubscriptionImpl.state_delegate$lambda$0();
                return state_delegate$lambda$0;
            case 25:
                t03 t03Var = v03.Companion;
                return new p53(vne.a, 0);
            case 26:
                t03 t03Var2 = v03.Companion;
                return new p53(j13.a, 0);
            case 27:
                t03 t03Var3 = v03.Companion;
                return new p53(f03.a, 0);
            case 28:
                t03 t03Var4 = v03.Companion;
                return new p53(y03.a, 0);
            default:
                t03 t03Var5 = v03.Companion;
                return LocationProvider.Companion.serializer();
        }
    }
}
