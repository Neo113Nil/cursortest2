package yads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class oy1 extends sy1 {
    public final /* synthetic */ Comparator a;

    public oy1(a92 a92Var) {
        this.a = a92Var;
    }

    @Override // yads.sy1
    public final Map b() {
        return new TreeMap(this.a);
    }
}
