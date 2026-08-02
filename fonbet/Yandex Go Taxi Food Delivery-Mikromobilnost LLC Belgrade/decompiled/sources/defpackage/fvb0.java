package defpackage;

import android.graphics.Paint;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment$TextLinesConfig$$serializer;
import com.yandex.go.places.experiments.map.pin_war_v2.a;
import com.yandex.go.places.experiments.map.pin_war_v2.h;
import com.yandex.go.places.experiments.map.pin_war_v2.j;
import com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.layer.b;
import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconActionDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconActionKind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.h1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.j1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.n1;
import java.lang.annotation.Annotation;

/* loaded from: classes13.dex */
public final /* synthetic */ class fvb0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ fvb0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 zy11Var4;
        zy11 zy11Var5;
        zy11 zy11Var6;
        zy11 zy11Var7;
        zy11 zy11Var8;
        switch (this.a) {
            case 0:
                zy11Var = zy11.a;
                return zy11Var;
            case 1:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 2:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 3:
                zy11Var4 = zy11.a;
                return zy11Var4;
            case 4:
                zy11Var5 = zy11.a;
                return zy11Var5;
            case 5:
                zy11Var6 = zy11.a;
                return zy11Var6;
            case 6:
                zy11Var7 = zy11.a;
                return zy11Var7;
            case 7:
                zy11Var8 = zy11.a;
                return zy11Var8;
            case 8:
                h1 h1Var = PinIconActionDto.Companion;
                return PinIconActionKind.Companion.serializer();
            case 9:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconActionKind", PinIconActionKind.values(), new String[]{"address_change", "open_scooters", null}, new Annotation[][]{null, null, null});
            case 10:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconAnnotationDto.Unsupported", j1.INSTANCE, new Annotation[0]);
            case 11:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconStateDto.Unsupported", n1.INSTANCE, new Annotation[0]);
            case 12:
                return new bgc(12);
            case 13:
                return vez0.g("com.yandex.go.address.models.PlaceType", PlaceType.values(), new String[]{"work", "home", "other"}, new Annotation[][]{null, null, null});
            case 14:
                Paint f = unr0.f(true);
                f.setStyle(Paint.Style.STROKE);
                return f;
            case 15:
                b bVar = PlacesOrganizationsLayerResponse.Companion;
                return new p53(e.Companion.serializer(), 0);
            case 16:
                Paint f2 = unr0.f(true);
                f2.setStyle(Paint.Style.STROKE);
                return f2;
            case 17:
                Paint f3 = unr0.f(true);
                f3.setStyle(Paint.Style.STROKE);
                return f3;
            case 18:
                Paint f4 = unr0.f(true);
                f4.setStyle(Paint.Style.FILL);
                return f4;
            case 19:
                a aVar = PlacesPinWarV2Experiment.Animation.Companion;
                return PlacesPinWarV2Experiment.GeometryEasing.Companion.serializer();
            case 20:
                return vez0.g("com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment.GeometryEasing", PlacesPinWarV2Experiment.GeometryEasing.values(), new String[]{"linear", "ease_in", "ease_out", "ease_in_out"}, new Annotation[][]{null, null, null, null});
            case 21:
                return vez0.g("com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment.LabelRenderingMode", PlacesPinWarV2Experiment.LabelRenderingMode.values(), new String[]{"independent_label", "embedded_in_icon"}, new Annotation[][]{null, null});
            case 22:
                h hVar = PlacesPinWarV2Experiment.PinStyleVariantConfig.Companion;
                return new p53(PlacesPinWarV2Experiment$TextLinesConfig$$serializer.INSTANCE, 0);
            case 23:
                j jVar = PlacesPinWarV2Experiment.TextLinesConfig.Companion;
                return PlacesPinWarV2Experiment.LabelRenderingMode.Companion.serializer();
            case 24:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_image_width);
            case 25:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_image_height);
            case 26:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_border);
            case 27:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_corner);
            case 28:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size);
            default:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_badge_border);
        }
    }
}
