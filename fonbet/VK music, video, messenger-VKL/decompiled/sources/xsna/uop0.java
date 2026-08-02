package xsna;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
public final class uop0 implements top0 {
    public final Set<ijp> a;
    public final eo5 b;
    public final zop0 c;

    public uop0(Set set, eo5 eo5Var, zop0 zop0Var) {
        this.a = set;
        this.b = eo5Var;
        this.c = zop0Var;
    }

    @Override // xsna.top0
    public final vop0 a(String str, ijp ijpVar, plp0 plp0Var) {
        Set<ijp> set = this.a;
        if (set.contains(ijpVar)) {
            return new vop0(this.b, str, ijpVar, plp0Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", ijpVar, set));
    }
}
