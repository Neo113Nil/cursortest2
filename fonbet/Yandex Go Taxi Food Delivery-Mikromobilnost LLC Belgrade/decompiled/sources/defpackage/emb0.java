package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public final class emb0 implements gmb0 {
    public final gmb0 a;
    public final ArrayList b;

    public emb0(gmb0 gmb0Var, tls tlsVar) {
        this.a = gmb0Var;
        List b = gmb0Var.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (((Boolean) tlsVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        this.b = arrayList;
    }

    @Override // defpackage.gmb0
    public final Supplier a() {
        return this.a.a();
    }

    @Override // defpackage.gmb0
    public final List b() {
        return this.b;
    }

    @Override // defpackage.gmb0
    public final gmb0 c() {
        return this.a.c();
    }

    @Override // defpackage.gmb0
    public final String d() {
        return this.a.d();
    }

    @Override // defpackage.gmb0
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }
}
