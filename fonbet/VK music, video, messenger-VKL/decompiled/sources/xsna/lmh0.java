package xsna;

import com.vk.ecomm.cart.impl.search_address.feature.state.UnableToLoadSuggestionsException;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.kmh0;
import xsna.n6n0;
import xsna.ulp0;

/* compiled from: SearchAddressReducer.kt */
/* loaded from: classes18.dex */
public final class lmh0 extends dm50<rmh0, kmh0, omh0> {
    public final bmh0 d;

    public lmh0(omh0 omh0Var) {
        super(omh0Var);
        this.d = new bmh0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20, types: [kotlin.collections.EmptyList] */
    @Override // xsna.dm50
    public final omh0 c(omh0 omh0Var, kmh0 kmh0Var) {
        List b;
        omh0 omh0Var2 = omh0Var;
        kmh0 kmh0Var2 = kmh0Var;
        if (kmh0Var2 instanceof kmh0.a) {
            return omh0.a(omh0Var2, null, null, znk0.D(omh0Var2.b), null, 47);
        }
        if (kmh0Var2 instanceof kmh0.d) {
            String str = ((kmh0.d) kmh0Var2).b;
            return omh0.a(omh0Var2, str, null, znk0.D(str), null, 14);
        }
        if (kmh0Var2 instanceof kmh0.b) {
            return omh0.a(omh0Var2, null, null, true, null, 15);
        }
        if (!(kmh0Var2 instanceof kmh0.c)) {
            return omh0Var2;
        }
        n6n0 n6n0Var = ((kmh0.c) kmh0Var2).b;
        if (!(n6n0Var instanceof n6n0.b)) {
            if (n6n0Var instanceof n6n0.a) {
                return omh0.a(omh0Var2, null, EmptyList.b, false, new UnableToLoadSuggestionsException(), 11);
            }
            throw new NoWhenBranchMatchedException();
        }
        ulp0 ulp0Var = new ulp0(new i5g(((n6n0.b) n6n0Var).a), new zos(26));
        ehn ehnVar = new ehn(new ulp0.a(ulp0Var), new z410(20));
        if (ehnVar.hasNext()) {
            Object next = ehnVar.next();
            if (ehnVar.hasNext()) {
                b = y57.b(next);
                while (ehnVar.hasNext()) {
                    b.add(ehnVar.next());
                }
            } else {
                b = Collections.singletonList(next);
            }
        } else {
            b = EmptyList.b;
        }
        return omh0.a(omh0Var2, null, b, false, null, 11);
    }

    @Override // xsna.dm50
    public final rmh0 d() {
        return new rmh0(e(new f6w(22)), e(new fo20(16)), e(new e2s(this, 26)), e(new k220(19)));
    }

    @Override // xsna.dm50
    public final void h(omh0 omh0Var, rmh0 rmh0Var) {
        omh0 omh0Var2 = omh0Var;
        rmh0 rmh0Var2 = rmh0Var;
        f(rmh0Var2.b, omh0Var2);
        if (omh0Var2.f) {
            f(rmh0Var2.d, omh0Var2);
        } else if (omh0Var2.g != null || (znk0.D(omh0Var2.b) && omh0Var2.d.isEmpty())) {
            f(rmh0Var2.c, omh0Var2);
        } else {
            f(rmh0Var2.a, omh0Var2);
        }
    }
}
