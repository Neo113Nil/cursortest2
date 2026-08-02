package defpackage;

import com.google.protobuf.n;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class dlu extends n implements elu {
    public final void c(ArrayList arrayList) {
        copyOnWrite();
        ((blu) this.instance).addAllBucket(arrayList);
    }

    public final void d(long j) {
        copyOnWrite();
        ((blu) this.instance).setFiniteSum(j);
    }

    public final void e(String str) {
        copyOnWrite();
        ((blu) this.instance).setName(str);
    }

    public final void f(long j) {
        copyOnWrite();
        ((blu) this.instance).setNameHash(j);
    }

    public final void g(long j) {
        copyOnWrite();
        ((blu) this.instance).setSum(j);
    }

    public final String getName() {
        return ((blu) this.instance).getName();
    }
}
