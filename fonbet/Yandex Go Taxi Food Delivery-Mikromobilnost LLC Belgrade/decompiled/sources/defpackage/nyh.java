package defpackage;

import com.yandex.go.logistics.cargo_flow.a;

/* loaded from: classes3.dex */
public final class nyh implements sy60 {
    public final /* synthetic */ a a;
    public final /* synthetic */ nde b;

    public nyh(a aVar, nde ndeVar) {
        this.a = aVar;
        this.b = ndeVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        nde ndeVar = this.b;
        if (ndeVar.g == null) {
            s9e Q = a.Q(this.a, ndeVar.i, null);
            if (Q != null) {
                ndeVar.h.invoke(Q);
            }
        }
    }
}
