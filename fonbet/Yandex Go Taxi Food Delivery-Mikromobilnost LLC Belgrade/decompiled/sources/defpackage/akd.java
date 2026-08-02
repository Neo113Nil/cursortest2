package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class akd implements kgz {
    public final List a;

    public akd(List list) {
        this.a = list;
    }

    @Override // defpackage.kgz
    public final void a(String str, String str2, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kgz) it.next()).a(str, str2, th);
        }
    }

    @Override // defpackage.kgz
    public final void b(RuntimeException runtimeException, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kgz) it.next()).a("PlusWebSdkComponent", str, runtimeException);
        }
    }
}
