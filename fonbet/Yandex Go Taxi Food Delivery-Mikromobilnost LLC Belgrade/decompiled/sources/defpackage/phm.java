package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.drive.vertical.router.a;
import java.util.function.Consumer;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.order.f;

/* loaded from: classes12.dex */
public final class phm implements k41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ h55 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ phm(Object obj, h55 h55Var, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = h55Var;
        this.w = obj2;
    }

    private final void n1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                ((a) this.c).P((mhm) this.w);
                break;
        }
    }

    @Override // defpackage.k41
    public final void d(Address address) {
        int i = this.a;
        Object obj = this.w;
        h55 h55Var = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a aVar = (a) h55Var;
                int i2 = ohm.a[((m41) obj2).c.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        break;
                    } else {
                        aVar.F.l(address);
                    }
                }
                aVar.P((mhm) obj);
                break;
            default:
                ((Consumer) obj2).accept(address);
                i d = ((j) ((f) h55Var).I.a).d(((String) obj).concat(".pickLocation"));
                d.d("method", "other");
                d.m();
                break;
        }
    }
}
