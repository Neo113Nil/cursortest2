package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class at00 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah00 b;

    public /* synthetic */ at00(ah00 ah00Var, int i) {
        this.a = i;
        this.b = ah00Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ah00 ah00Var = this.b;
        switch (i) {
            case 0:
                ThemeType themeType = (ThemeType) obj;
                TaxiMapView h = ((gh00) ah00Var).h();
                if (h != null) {
                    h.applyThemeType(themeType);
                    break;
                }
                break;
            default:
                wl0 wl0Var = (wl0) obj;
                int a = wl0Var.a();
                String b = wl0Var.b();
                TaxiMapView h2 = ((gh00) ah00Var).h();
                if (h2 != null) {
                    h2.applyMapStyle(a, b);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
