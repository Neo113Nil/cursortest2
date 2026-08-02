package defpackage;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;

/* loaded from: classes14.dex */
public final class lxg {
    public final dqe0 a;
    public final b0j b;

    public lxg(dqe0 dqe0Var, b0j b0jVar) {
        this.a = dqe0Var;
        this.b = b0jVar;
    }

    public final tb80 a() {
        AddressDTO address;
        tb80 tb80Var;
        Address e = this.a.e();
        if (e != null && (address = e.getAddress()) != null && (tb80Var = (tb80) address.b(tb80.class)) != null) {
            return tb80Var;
        }
        tb80.Companion.getClass();
        return tb80.c;
    }
}
