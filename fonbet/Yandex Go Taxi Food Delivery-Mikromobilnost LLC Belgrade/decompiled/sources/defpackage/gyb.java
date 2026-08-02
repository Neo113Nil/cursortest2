package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgyb;", "", "Companion", "eyb", "fyb", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class gyb {
    public static final fyb Companion = new fyb();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(27)), null, null, null, null};
    public final RoutePointType a;
    public final int b;
    public final Double c;
    public final String d;
    public final String e;

    public /* synthetic */ gyb(int i, RoutePointType routePointType, int i2, Double d, String str, String str2) {
        this.a = (i & 1) == 0 ? RoutePointType.POINT_A : routePointType;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    public gyb() {
        this.a = RoutePointType.POINT_A;
        this.b = 0;
        this.c = null;
        this.d = "";
        this.e = "";
    }
}
