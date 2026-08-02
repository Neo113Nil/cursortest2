package defpackage;

import com.yandex.go.scooters.api.domain.model.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.search.SuggestItem;
import kotlin.Triple;
import ru.yandex.taxi.scooters.a;

/* loaded from: classes14.dex */
public final class av0 implements tls {
    public final /* synthetic */ int a;
    public static final av0 b = new av0(0);
    public static final av0 c = new av0(1);
    public static final av0 w = new av0(2);
    public static final av0 x = new av0(3);
    public static final av0 y = new av0(4);
    public static final av0 z = new av0(5);
    public static final av0 A = new av0(6);
    public static final av0 B = new av0(7);
    public static final av0 C = new av0(8);
    public static final av0 D = new av0(9);
    public static final av0 E = new av0(10);
    public static final av0 F = new av0(11);
    public static final av0 G = new av0(12);
    public static final av0 H = new av0(13);
    public static final av0 I = new av0(14);
    public static final av0 J = new av0(15);
    public static final av0 K = new av0(16);
    public static final av0 L = new av0(17);
    public static final av0 M = new av0(18);
    public static final av0 N = new av0(19);
    public static final av0 O = new av0(20);
    public static final av0 P = new av0(21);
    public static final av0 Q = new av0(22);
    public static final av0 R = new av0(23);

    public /* synthetic */ av0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        char c2 = 1;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((SuggestItem) obj).getUri() != null);
            case 1:
                ((zca) obj).K0();
                return zy11.a;
            case 2:
                return ((pex0) obj).u0;
            case 3:
                return null;
            case 4:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 5:
                return zy11.a;
            case 6:
                ((Number) obj).intValue();
                return null;
            case 7:
                ((Number) obj).intValue();
                return null;
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                return ((o2y0) obj).c();
            case 10:
                return ((TaxiOrder) obj).V().i;
            case 11:
                return ((TaxiOrder) obj).i.e();
            case 12:
                return ((TaxiOrder) obj).o();
            case 13:
                return zy11.a;
            case 14:
                a aVar = ((m6o0) obj).a;
                aVar.P(new j6o0(aVar, c2 == true ? 1 : 0));
                return zy11.a;
            case 15:
                return zy11.a;
            case 16:
                return Boolean.valueOf(b.a(((b) obj).a));
            case 17:
                return Boolean.valueOf(((c2t) obj) instanceof a2t);
            case 18:
                return new xdx0((xlj0) obj);
            case 19:
                return new wdx0((qn40) obj);
            case 20:
                return new tdx0((edu) obj);
            case 21:
                return new zdx0((kmq0) obj);
            case 22:
                return new sdx0((fx8) obj);
            case 23:
                xkp xkpVar = (xkp) obj;
                return g8e.p(xkpVar.a, " - ", xkpVar.b);
            default:
                rsn rsnVar = (rsn) obj;
                Object obj2 = rsnVar.a;
                return Long.valueOf(((Triple) obj2) != null ? 100L : 0L);
        }
    }
}
