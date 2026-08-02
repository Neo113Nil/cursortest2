package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class e231 implements f231 {
    public final f231 a;
    public final uxd b;

    public e231(f231 f231Var, uxd uxdVar) {
        this.a = f231Var;
        this.b = uxdVar;
    }

    @Override // defpackage.f231
    public final f1k e(List list, tls tlsVar) {
        return f1k.O1;
    }

    @Override // defpackage.f231
    public final f1k g(ArrayList arrayList, tls tlsVar) {
        return this.a.g(arrayList, tlsVar);
    }

    @Override // defpackage.o231
    public final Object get(String str) {
        Object obj = this.b.a.get(str);
        if (obj instanceof Uri) {
            obj = new rg21(obj.toString());
        }
        return obj == null ? this.a.get(str) : obj;
    }

    @Override // defpackage.f231
    public final void h(rvo rvoVar, tls tlsVar) {
        this.a.h(rvoVar, tlsVar);
    }

    @Override // defpackage.f231
    public final void i() {
    }

    @Override // defpackage.f231
    public final void j() {
    }

    @Override // defpackage.f231
    public final c231 k(String str) {
        return this.a.k(str);
    }

    @Override // defpackage.f231
    public final f1k l(String str, l6o l6oVar, boolean z, tls tlsVar) {
        return this.a.l(str, l6oVar, z, tlsVar);
    }

    @Override // defpackage.f231
    public final void m(c231 c231Var) {
        this.a.m(c231Var);
    }
}
