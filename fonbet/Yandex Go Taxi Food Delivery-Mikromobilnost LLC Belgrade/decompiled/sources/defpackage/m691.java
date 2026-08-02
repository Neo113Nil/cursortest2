package defpackage;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class m691 implements yyn {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final w591 c = w591.c;

    @Override // defpackage.yyn
    public final /* bridge */ /* synthetic */ yyn a(Class cls, ip60 ip60Var) {
        this.a.put(cls, ip60Var);
        this.b.remove(cls);
        return this;
    }
}
