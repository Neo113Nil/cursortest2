package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.fragment.MapFragment;

/* loaded from: classes12.dex */
public final class eep extends MapFragment.a {
    public final /* synthetic */ fc9 a;

    public eep(fc9 fc9Var) {
        this.a = fc9Var;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        this.a.r(new yd0(address, 12));
    }

    @Override // defpackage.si00
    public final void d() {
        this.a.r(new qu(9));
    }
}
