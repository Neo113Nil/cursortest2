package defpackage;

import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class hlv implements d9i0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.d9i0
    public final dyg a(String str, InputStream inputStream, tls tlsVar) {
        dyg dygVar = (dyg) tlsVar.invoke(inputStream);
        if (dygVar instanceof cyg) {
            this.a.put(new fe7(str), ((cyg) dygVar).a);
        }
        return dygVar;
    }

    public final void b(Object obj, String str) {
        this.a.put(new fe7(str), obj);
    }

    @Override // defpackage.d9i0
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.d9i0
    public final void e(String str) {
        this.a.remove(new fe7(str));
    }

    @Override // defpackage.d9i0
    public final Object i(tls tlsVar, String str) {
        Object obj = this.a.get(new fe7(str));
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
