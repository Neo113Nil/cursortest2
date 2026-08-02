package defpackage;

import com.yandex.go.dto.response.Action$Payload;
import com.yandex.go.flex.main_screen.actions.SdcRouteSelectionAction;
import com.yandex.go.flex.main_screen.actions.SdcRouteSelectionAction$Screen$$serializer;
import com.yandex.go.flex.main_screen.actions.b;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import com.yandex.go.scooters.data.model.ScootersSurgeExperiment$SurgeSettingsByBalance$$serializer;
import com.yandex.go.scooters.data.model.c0;
import com.yandex.go.scooters.data.model.d0;
import com.yandex.go.scooters.data.model.f0;
import com.yandex.go.scooters.packages.upsale_on_book.data.model.ScootersUpsalePackageOnBookExperiment;
import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import com.yandex.go.scooters.passes.data.model.k;
import com.yandex.go.scooters.passes.super_pass.experiments.ScootersSuperPassGracePeriodExperiment;
import com.yandex.go.scooters.subscription.upsale_on_book.data.model.ScootersSubscriptionUpsaleOnBookExperiment;
import com.yandex.go.scooters.subscription.upsale_on_book.data.model.a;
import com.yandex.go.scooters.super_passes.upsale_on_book.data.model.ScootersUpsaleSuperPassOnBookExperiment;
import defpackage.j8p0;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;
import ru.yandex.taxi.layers.experiments.h;
import ru.yandex.taxi.layers.experiments.i;
import ru.yandex.taxi.layers.experiments.j;
import ru.yandex.taxi.layers.experiments.l;
import ru.yandex.taxi.layers.experiments.n;
import ru.yandex.taxi.layers.experiments.o;

/* loaded from: classes8.dex */
public final /* synthetic */ class czo0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ czo0(cop0 cop0Var) {
        this.a = 27;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = ScootersSubscriptionUpsaleOnBookExperiment.Companion;
                return new p53(pnz.a, 0);
            case 1:
                com.yandex.go.scooters.passes.super_pass.experiments.a aVar2 = ScootersSuperPassGracePeriodExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 2:
                k kVar = ScootersSuperPassLegalTermsExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 3:
                c0 c0Var = ScootersSurgeExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 4:
                d0 d0Var = ScootersSurgeExperiment.Settings.Companion;
                return new p53(ScootersSurgeExperiment$SurgeSettingsByBalance$$serializer.INSTANCE, 0);
            case 5:
                f0 f0Var = ScootersSurgeExperiment.SurgeSettings.Content.Companion;
                return new p53(lsw0.e, 0);
            case 6:
                f0 f0Var2 = ScootersSurgeExperiment.SurgeSettings.Content.Companion;
                return new p53(lsw0.e, 0);
            case 7:
                com.yandex.go.scooters.packages.upsale_on_book.data.model.a aVar3 = ScootersUpsalePackageOnBookExperiment.Companion;
                return new p53(pnz.a, 0);
            case 8:
                com.yandex.go.scooters.super_passes.upsale_on_book.data.model.a aVar4 = ScootersUpsaleSuperPassOnBookExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 9:
                com.yandex.go.scooters.super_passes.upsale_on_book.data.model.a aVar5 = ScootersUpsaleSuperPassOnBookExperiment.Companion;
                return new p53(pnz.a, 0);
            case 10:
                g8p0 g8p0Var = j8p0.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 11:
                g8p0 g8p0Var2 = j8p0.Companion;
                return new p53(h8p0.a, 0);
            case 12:
                i8p0 i8p0Var = j8p0.a.Companion;
                return new p53(auu0.a, 0);
            case 13:
                n8p0 n8p0Var = o8p0.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 14:
                sjh sjhVar = uyj.a;
                return o400.a;
            case 15:
                sjh sjhVar2 = uyj.a;
                return o400.a.x;
            case 16:
                return vez0.g("com.yandex.go.layers.api.model.params.Screen", Screen.values(), new String[]{"main", "choose_a", "choose_b", "choose_mid", "choose_userplace", "totw", "multiorder", "summary", "discovery", "superapp_discovery_map"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
            case 17:
                zdp0 zdp0Var = ScreenModeMapProvidersExperiment.Companion;
                return new p53(i.a, 0);
            case 18:
                h hVar = ScreenModeMapProvidersExperiment.a.Companion;
                return Action$Payload.Mode.Companion.serializer();
            case 19:
                h hVar2 = ScreenModeMapProvidersExperiment.a.Companion;
                return jsq0.Companion.serializer(Action$Payload.ObjectType.Companion.serializer());
            case 20:
                j jVar = ScreenModeMapProvidersExperiment.b.Companion;
                return new p53(n.a, 0);
            case 21:
                j jVar2 = ScreenModeMapProvidersExperiment.b.Companion;
                return new p53(ru.yandex.taxi.layers.experiments.k.a, 0);
            case 22:
                l lVar = ScreenModeMapProvidersExperiment.c.Companion;
                return Mode.Companion.serializer();
            case 23:
                return vez0.g("ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment.ZoomMode", ScreenModeMapProvidersExperiment.ZoomMode.values(), new String[]{"zoom_if_no_objects", "always_zoom"}, new Annotation[][]{null, null});
            case 24:
                o oVar = ScreenModeMapProvidersExperiment.d.Companion;
                return Mode.Companion.serializer();
            case 25:
                o oVar2 = ScreenModeMapProvidersExperiment.d.Companion;
                return ScreenModeMapProvidersExperiment.ZoomMode.Companion.serializer();
            case 26:
                b bVar = SdcRouteSelectionAction.Companion;
                return new p53(SdcRouteSelectionAction$Screen$$serializer.INSTANCE, 0);
            case 27:
                return new qes0(c1i0.PlusSDK_Theme_Home_Light, c1i0.PlusSDK_Theme_Home_Dark);
            case 28:
                return new p53(auu0.a, 0);
            default:
                return new p53(elw0.a, 0);
        }
    }

    public /* synthetic */ czo0(int i) {
        this.a = i;
    }
}
