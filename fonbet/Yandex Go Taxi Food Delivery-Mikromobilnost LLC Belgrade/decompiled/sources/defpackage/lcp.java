package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public class lcp extends yol0 {
    public final HashMap x = new HashMap();

    @Override // defpackage.yol0
    public final vol0 a(Object obj) {
        return (vol0) this.x.get(obj);
    }

    @Override // defpackage.yol0
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.x.remove(obj);
        return b;
    }
}
