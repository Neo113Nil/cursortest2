package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.clarify_address.a;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.suggest.impl.router.d;

/* loaded from: classes6.dex */
public final class cyh implements k41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cyh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((yn5) obj).r(new qu(9));
                break;
            case 2:
                c cVar = (c) obj;
                cVar.H.n = true;
                cVar.i();
                break;
            case 3:
                ((f9a) obj).Q(null);
                break;
        }
    }

    @Override // defpackage.k41
    public final void d(Address address) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tls) obj).invoke(address);
                break;
            case 1:
                ((yn5) obj).r(new yd0(address, 13));
                break;
            case 2:
                c cVar = (c) obj;
                ((a) cVar.K).c(true, AddressClarificationReason.Map);
                cVar.H.n = true;
                cVar.i();
                break;
            case 3:
                ((f9a) obj).Q(null);
                break;
            default:
                d dVar = (d) obj;
                dVar.K.i(new ZoneAddress(address, 2));
                ((a) dVar.c0).c(true, AddressClarificationReason.Map);
                break;
        }
    }
}
