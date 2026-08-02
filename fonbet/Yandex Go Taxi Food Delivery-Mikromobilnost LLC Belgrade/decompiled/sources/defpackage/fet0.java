package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.yandex.go.navigator.notifications.cartech.StationType;
import com.yandex.go.shortcuts.dto.request.Status;
import com.yandex.go.shortcuts.impl.ui.feed.StickyView;
import com.yandex.go.splash.data.dto.SplashScreenType;
import com.yandex.go.taxi.order.models.api.response.StateInfoTimer;
import com.yandex.go.taxi.order.models.api.response.t7;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.yandex.taxi.animation.SimpleSpringInterpolator;
import ru.yandex.taxi.layers.api.StateRequirementsFailedType;
import ru.yandex.taxi.shortcuts.dto.response.superapp.StickersStyle;

/* loaded from: classes13.dex */
public final /* synthetic */ class fet0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ fet0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int collapsedHeight$lambda$0;
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return new Rect();
            case 1:
                return new Rect();
            case 2:
                return new PointF();
            case 3:
                return new PointF();
            case 4:
                return new Rect();
            case 5:
                qrq0 v = j73.v(new g720[]{e520.d, y520.d, a720.d, l620.d, h520.d, c620.d, b620.d, f720.d, o620.d, g520.d, o520.d, l520.d, g620.d, q520.d, r420.d, k620.d, i620.d, u620.d, y420.d, w420.d, f620.d, f520.d, w520.d, z420.d, v420.d, d520.d, x420.d, q420.d, x520.d, j520.d, z620.d, s520.d, t520.d, s620.d, c520.d, e620.d, p420.d, a620.d, a520.d, n520.d, c720.d, d720.d, v520.d, z520.d, w620.d, x620.d, y620.d, j620.d, b520.d, b720.d, m620.d, m520.d, t620.d, t420.d, e720.d, u420.d, v620.d, n620.d, i520.d, s420.d, k520.d, p620.d, q620.d, r620.d, d620.d});
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : v) {
                    linkedHashMap.put(((g720) obj).a, obj);
                }
                return linkedHashMap;
            case 6:
                return cmt0.d;
            case 7:
                return new o4o("ru.yandex.taxi.shortcuts.dto.response.superapp.SplashObject.Empty", uqt0.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("ru.yandex.taxi.shortcuts.dto.response.superapp.SplashObject.Spinner", yqt0.INSTANCE, new Annotation[0]);
            case 9:
                return vez0.g("com.yandex.go.splash.data.dto.SplashScreenType", SplashScreenType.values(), new String[]{"dynamic_promo", "instantly_hide"}, new Annotation[][]{null, null});
            case 10:
                return new Object();
            case 11:
                return new ViewGroup.MarginLayoutParams(-2, -2);
            case 12:
                m2u0 m2u0Var = n2u0.Companion;
                return a831.Companion.serializer();
            case 13:
                SimpleSpringInterpolator.Companion.getClass();
                ArrayList arrayList = new ArrayList(59);
                float f = 0.0f;
                arrayList.add(Float.valueOf(0.0f));
                float f2 = 0.0f;
                for (int i = 0; i < 57; i++) {
                    f2 += ((((-12.5f) * f2) + ((f - 1.0f) * (-157.4f))) / 0.5f) * 0.008333334f;
                    f += 0.008333334f * f2;
                    arrayList.add(Float.valueOf(f));
                }
                arrayList.add(Float.valueOf(1.0f));
                return new SimpleSpringInterpolator(arrayList, 480L, null);
            case 14:
                t7 t7Var = StateInfoTimer.Companion;
                return StateInfoTimer.TimeFormat.Companion.serializer();
            case 15:
                t7 t7Var2 = StateInfoTimer.Companion;
                return StateInfoTimer.TimerType.Companion.serializer();
            case 16:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.StateInfoTimer.TimeFormat", StateInfoTimer.TimeFormat.values(), new String[]{"positional", "abbreviated"}, new Annotation[][]{null, null});
            case 17:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.StateInfoTimer.TimerType", StateInfoTimer.TimerType.values(), new String[]{"from", "until"}, new Annotation[][]{null, null});
            case 18:
                l5u0 l5u0Var = m5u0.Companion;
                return StateRequirementsFailedType.Companion.serializer();
            case 19:
                r5u0 r5u0Var = s5u0.Companion;
                return new p53(k5u0.a, 0);
            case 20:
                return vez0.g("ru.yandex.taxi.layers.api.StateRequirementsFailedType", StateRequirementsFailedType.values(), new String[]{"selected_scooter_unavailable"}, new Annotation[][]{null});
            case 21:
                l7u0 l7u0Var = m7u0.Companion;
                return new p53(pmo.a, 0);
            case 22:
                return vez0.g("com.yandex.go.navigator.notifications.cartech.StationType", StationType.values(), new String[]{"fuel", "gas", "carWash", "carWashBooking"}, new Annotation[][]{null, null, null, null});
            case 23:
                return vez0.g("com.yandex.go.shortcuts.dto.request.Status", Status.values(), new String[]{"complete", null}, new Annotation[][]{null, null});
            case 24:
                n9u0 n9u0Var = o9u0.Companion;
                return new p53(xf60.a, 0);
            case 25:
                edu0 edu0Var = fdu0.Companion;
                return StickersStyle.Companion.serializer();
            case 26:
                return vez0.g("ru.yandex.taxi.shortcuts.dto.response.superapp.StickersStyle", StickersStyle.values(), new String[]{"eats_like", "grocery_like", null}, new Annotation[][]{null, null, null});
            case 27:
                collapsedHeight$lambda$0 = StickyView.collapsedHeight$lambda$0();
                return Integer.valueOf(collapsedHeight$lambda$0);
            case 28:
                return new p53(mlu0.a, 0);
            default:
                zy11Var = zy11.a;
                return zy11Var;
        }
    }
}
