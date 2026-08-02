package defpackage;

import com.yandex.go.perf.api.screen.SourceScreen;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes8.dex */
public final class iwx0 {
    public final c a;
    public final com.yandex.go.navigation.screen.c b;

    public iwx0(c cVar, com.yandex.go.navigation.screen.c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    public final void a(ye0 ye0Var) {
        SourceScreen sourceScreen;
        switch (hwx0.a[this.b.b().ordinal()]) {
            case 1:
                sourceScreen = SourceScreen.SUPERAPP_MAIN;
                break;
            case 2:
                sourceScreen = SourceScreen.MAIN;
                break;
            case 3:
                sourceScreen = SourceScreen.TAXI_MAIN;
                break;
            case 4:
                sourceScreen = SourceScreen.MULTIORDER;
                break;
            case 5:
                sourceScreen = SourceScreen.SELECT_DESTINATION_POINT;
                break;
            case 6:
                sourceScreen = SourceScreen.SUPERAPP_SUGGEST;
                break;
            case 7:
                sourceScreen = SourceScreen.ROUTE_SELECTOR;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                sourceScreen = SourceScreen.UNKNOWN;
                break;
            default:
                w511.b();
                return;
        }
        this.a.f(new cwa0(PerformanceScreenName.TaxiMain, sourceScreen.getAnalyticsName(), ye0Var, null, 56));
    }
}
