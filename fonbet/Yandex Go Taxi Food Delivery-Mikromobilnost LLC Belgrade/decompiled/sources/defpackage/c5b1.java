package defpackage;

import android.media.ImageReader;
import android.view.View;
import com.yandex.go.summary.ui.model.common.basetariffinfo.TariffOrderFlowUiState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes4.dex */
public abstract class c5b1 {
    public static tis0 a(int i, int i2, int i3, int i4) {
        return new tis0(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static final String b(View view) {
        while (view != null) {
            Object tag = view.getTag(nah0.ybsdk_screen_tag_id);
            String str = tag instanceof String ? (String) tag : null;
            if (str != null) {
                return str;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static final void c(View view, String str) {
        view.setTag(nah0.ybsdk_screen_tag_id, str);
    }

    public static final ob5 d(kb5 kb5Var) {
        return new ob5(kb5Var.a, kb5Var.b, kb5Var.c, e(kb5Var.d));
    }

    public static final TariffOrderFlowUiState e(TariffOrderFlow tariffOrderFlow) {
        switch (pb5.a[tariffOrderFlow.ordinal()]) {
            case 1:
                return TariffOrderFlowUiState.DRIVE_FLOW;
            case 2:
                return TariffOrderFlowUiState.TAXI_FLOW;
            case 3:
                return TariffOrderFlowUiState.SHUTTLE_FLOW;
            case 4:
                return TariffOrderFlowUiState.DELIVERY_FLOW;
            case 5:
                return TariffOrderFlowUiState.COPTER_FLOW;
            case 6:
                return TariffOrderFlowUiState.COPTER_CITY_TOUR_FLOW;
            default:
                w511.b();
                return null;
        }
    }
}
