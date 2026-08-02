package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class klw {
    public final a a;
    public final r0 b;
    public final r0 c;

    public klw(a aVar) {
        this.a = aVar;
        r0 c = bvf0.c(ilw.a);
        this.b = c;
        this.c = c;
    }

    public final jlw a() {
        return (jlw) this.b.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (defpackage.jl40.l(r4, r6.a.a().g) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(tls tlsVar) {
        r0 r0Var;
        Object value;
        jlw jlwVar;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            jlwVar = (jlw) value;
            jlw jlwVar2 = (jlw) tlsVar.invoke(jlwVar);
            if (jlwVar2 instanceof glw) {
                String str = ((glw) jlwVar2).a;
                if (str == null) {
                    str = null;
                }
            }
            jlwVar = jlwVar2;
        } while (!r0Var.k(value, jlwVar));
    }
}
