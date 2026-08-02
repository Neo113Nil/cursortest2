package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class lvf0 implements yyn {
    public static final jcx d = new jcx(2);
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final jcx c = d;

    @Override // defpackage.yyn
    public final yyn a(Class cls, ip60 ip60Var) {
        this.a.put(cls, ip60Var);
        this.b.remove(cls);
        return this;
    }
}
