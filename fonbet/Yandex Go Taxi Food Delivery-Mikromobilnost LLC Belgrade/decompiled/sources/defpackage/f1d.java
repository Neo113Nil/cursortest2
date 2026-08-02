package defpackage;

import kotlin.collections.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class f1d implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1d b;

    public /* synthetic */ f1d(g1d g1dVar, int i) {
        this.a = i;
        this.b = g1dVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        g1d g1dVar = this.b;
        switch (i) {
            case 0:
                return new stv(new jln(26, ((kmm0) g1dVar.a).a()), (etb) g1dVar.f.getValue());
            case 1:
                return new lvg((etb) g1dVar.f.getValue());
            default:
                return new llz(a.J0(((ndd0) g1dVar.b).b.d), new krl0(g1dVar.c.a(), (xkz) g1dVar.g.getValue()), (etb) g1dVar.f.getValue());
        }
    }
}
