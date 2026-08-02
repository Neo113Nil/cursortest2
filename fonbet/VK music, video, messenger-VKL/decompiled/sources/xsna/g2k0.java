package xsna;

import java.util.Iterator;
import java.util.List;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class g2k0 implements uki0<List<Object>> {
    public final /* synthetic */ uki0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public g2k0(uki0 uki0Var, int i, int i2) {
        this.a = uki0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.uki0
    public final Iterator<List<Object>> iterator() {
        return f2k0.b(this.a.iterator(), this.b, this.c, true, false);
    }
}
