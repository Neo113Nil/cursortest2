package xsna;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.abi0;

/* compiled from: SelectedMessagesMediator.kt */
/* loaded from: classes2.dex */
public final class bbi0 implements abi0 {
    public final ArrayList a = new ArrayList();
    public Set<Integer> b = EmptySet.b;

    @Override // xsna.abi0
    public final void a(abi0.a aVar) {
        this.a.add(aVar);
    }

    @Override // xsna.abi0
    public final boolean b() {
        return !this.b.isEmpty();
    }

    @Override // xsna.abi0
    public final void c(abi0.a aVar) {
        this.a.remove(aVar);
    }

    @Override // xsna.abi0
    public final boolean d(Integer num) {
        return j5g.P(this.b, num);
    }
}
