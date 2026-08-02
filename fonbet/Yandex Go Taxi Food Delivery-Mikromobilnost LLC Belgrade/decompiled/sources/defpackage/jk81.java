package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class jk81 {
    public static final Object c = new Object();
    public static volatile jk81 d;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final d571 b = new d571();

    public final void a(nl61 nl61Var, Object obj) {
        eyc eycVar = (eyc) this.a.remove(this.b.a(nl61Var));
        if (eycVar != null) {
            ((fyc) eycVar).T(obj);
        }
    }
}
