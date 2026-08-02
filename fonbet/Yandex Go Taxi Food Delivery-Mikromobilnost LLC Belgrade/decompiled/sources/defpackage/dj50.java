package defpackage;

import com.yandex.go.address.models.Address;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class dj50 {
    public final r0 a;

    public dj50(ji50 ji50Var, oh50 oh50Var) {
        Address address = null;
        if (ji50Var.a()) {
            hi50 hi50Var = ji50Var instanceof hi50 ? (hi50) ji50Var : null;
            if (hi50Var != null && oh50Var.a().b) {
                address = hi50Var.e;
            }
        }
        this.a = bvf0.c(address);
    }
}
