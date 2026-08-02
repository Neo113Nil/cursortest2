package defpackage;

import android.view.ViewGroup;
import com.yandex.go.chargers.design.components.ChargersGeoButtonIconComponent;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.yandex.taxi.widget.SlideableBindingModalView;

/* loaded from: classes14.dex */
public abstract class fhb1 {
    public static ChargersGeoButtonIconComponent a(SlideableBindingModalView slideableBindingModalView, Runnable runnable) {
        ChargersGeoButtonIconComponent chargersGeoButtonIconComponent = new ChargersGeoButtonIconComponent(slideableBindingModalView.getContext(), null, 0, 0, 14, null);
        chargersGeoButtonIconComponent.setDebounceClickListener(runnable);
        chargersGeoButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, chargersGeoButtonIconComponent.getContext())));
        slideableBindingModalView.addFloatButton(chargersGeoButtonIconComponent, 8388613);
        return chargersGeoButtonIconComponent;
    }

    public static final boolean b(evz evzVar) {
        try {
            return new BigDecimal(evzVar.a()).signum() > 0;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final String c(String str) {
        return unr0.l(OpenList.CHAR_QUOTE, "\"", str);
    }
}
