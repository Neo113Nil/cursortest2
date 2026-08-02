package defpackage;

import android.graphics.Paint;
import com.yandex.go.information.data.dto.ServiceDto$$serializer;
import com.yandex.go.information.data.dto.ServicesResponse;
import com.yandex.go.information.data.dto.d;
import com.yandex.go.morphlex.action.route_address.SetRouteAddressAction;
import com.yandex.go.settings.presentation.c;
import com.yandex.go.shortcuts.dto.response.Shape;
import com.yandex.go.slot.dto.n;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.sequences.a;
import kotlin.sequences.b;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings;
import ru.yandex.taxi.plus.design.view.ShaderClipFrameLayout;
import ru.yandex.taxi.scooters.data.model.EvolveState;
import ru.yandex.taxi.scooters.data.model.SessionOfferType;
import ru.yandex.taxi.settings.api.dto.settings.types.SetSettingType;

/* loaded from: classes10.dex */
public final /* synthetic */ class iwq0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ iwq0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        Paint paint;
        switch (this.a) {
            case 0:
                try {
                    return vng.L(b.s(a.b(Arrays.asList(new lw60()).iterator())));
                } finally {
                }
            case 1:
                try {
                    return vng.L(b.s(a.b(Arrays.asList(new mgt()).iterator())));
                } finally {
                }
            case 2:
                qwq0 qwq0Var = rwq0.Companion;
                return new p53(auu0.a, 0);
            case 3:
                d dVar = ServicesResponse.Companion;
                return new p53(ServiceDto$$serializer.INSTANCE, 0);
            case 4:
                return vez0.g("ru.yandex.taxi.scooters.data.model.SessionOfferType", SessionOfferType.values(), new String[]{"standart_offer", "fix_point"}, new Annotation[][]{null, null});
            case 5:
                z0r0 z0r0Var = a1r0.Companion;
                return new p53(tws0.a, 0);
            case 6:
                c1r0 c1r0Var = d1r0.Companion;
                return EvolveState.Companion.serializer();
            case 7:
                l1r0 l1r0Var = m1r0.Companion;
                return new p53(b0t.a, 0);
            case 8:
                l1r0 l1r0Var2 = m1r0.Companion;
                return SessionOfferType.Companion.serializer();
            case 9:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 10:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 11:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 12:
                com.yandex.go.morphlex.action.route_address.a aVar = SetRouteAddressAction.Companion;
                return SetRouteAddressAction.PointType.Companion.serializer();
            case 13:
                return vez0.g("com.yandex.go.morphlex.action.route_address.SetRouteAddressAction.PointType", SetRouteAddressAction.PointType.values(), new String[]{"source", "destination"}, new Annotation[][]{null, null});
            case 14:
                i4r0 i4r0Var = j4r0.Companion;
                return SetSettingType.Companion.serializer();
            case 15:
                return vez0.g("ru.yandex.taxi.settings.api.dto.settings.types.SetSettingType", SetSettingType.values(), new String[]{"push_settings", null}, new Annotation[][]{null, null});
            case 16:
                return new o4o("com.yandex.go.slot.dto.SettingsModalContentItemDto.Unknown", n.INSTANCE, new Annotation[0]);
            case 17:
                return new p53(auu0.a, 1);
            case 18:
                qwd qwdVar = c.a;
                return null;
            case 19:
                qwd qwdVar2 = c.a;
                return 0;
            case 20:
                return new ghe(0);
            case 21:
                paint = ShaderClipFrameLayout.topRenderPaint_delegate$lambda$0();
                return paint;
            case 22:
                return vez0.g("com.yandex.go.shortcuts.dto.response.Shape", Shape.values(), new String[]{null, "sticker", "bubble", "corner_image", "trail_icon", "corner_text", "poi", "bottom_right", "label", "trail_label", "car", "afisha", "advertisement", "top_right", "button", "button_badge", "battery"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 23:
                ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.c cVar = ShapeSettings.CornerSettings.Companion;
                return ShapeSettings.CornerSettings.Type.Companion.serializer();
            case 24:
                return vez0.g("ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings.CornerSettings.Type", ShapeSettings.CornerSettings.Type.values(), new String[]{"fix", "half_height"}, new Annotation[][]{null, null});
            case 25:
                return new xir0(0);
            case 26:
                return Integer.valueOf(SelfTester_JCP.DECRYPT_CFB);
            case 27:
                return new p53(djr0.a, 0);
            case 28:
                kjr0 kjr0Var = ljr0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            default:
                return new p53(auu0.a, 0);
        }
    }
}
