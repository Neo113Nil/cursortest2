package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: VkAssetManagerImpl.kt */
/* loaded from: classes15.dex */
public final class ibu0 implements gbu0 {
    public final ConcurrentHashMap<String, m6v0> a = new ConcurrentHashMap<>(jgp.b);
    public final hpj b = zvj.a(hqu0.b());

    @Override // xsna.gbu0
    public final void a(String str, aos0 aos0Var, xx40 xx40Var) {
        m6v0 m6v0Var = this.a.get(str);
        if (m6v0Var != null) {
            aos0Var.a(m6v0Var);
        } else {
            myc0.h(this.b, null, null, new hbu0(str, xx40Var, this, aos0Var, null), 3);
        }
    }
}
