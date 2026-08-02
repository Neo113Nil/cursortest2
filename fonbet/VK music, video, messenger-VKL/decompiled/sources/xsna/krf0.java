package xsna;

import java.security.GeneralSecurityException;
import java.util.Set;
import xsna.mrf0;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public final class krf0 implements mrf0.a {
    public final /* synthetic */ hey a;

    public krf0(hey heyVar) {
        this.a = heyVar;
    }

    @Override // xsna.mrf0.a
    public final Class<?> a() {
        return this.a.getClass();
    }

    @Override // xsna.mrf0.a
    public final Set<Class<?>> b() {
        return this.a.b.keySet();
    }

    @Override // xsna.mrf0.a
    public final pdy c() {
        hey heyVar = this.a;
        return new pdy(heyVar, heyVar.c);
    }

    @Override // xsna.mrf0.a
    public final pdy d(Class cls) throws GeneralSecurityException {
        try {
            return new pdy(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
