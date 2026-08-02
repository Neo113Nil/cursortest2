package xsna;

import xsna.d4c0;
import xsna.du;

/* compiled from: PostInteractorRxExt.kt */
/* loaded from: classes4.dex */
public final class m6z implements io.reactivex.rxjava3.core.a0<d4c0.a> {
    public final d4c0 b;
    public final l6z c;
    public final p870 d;

    /* compiled from: PostInteractorRxExt.kt */
    public static final class a implements bd70<du> {
        public final /* synthetic */ mm1 b;
        public final /* synthetic */ m6z c;

        public a(mm1 mm1Var, m6z m6zVar) {
            this.b = mm1Var;
            this.c = m6zVar;
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, du duVar) {
            du duVar2 = duVar;
            du.b bVar = duVar2 instanceof du.b ? (du.b) duVar2 : null;
            if (bVar == null) {
                return;
            }
            this.b.invoke(bVar.b);
            this.c.d.g(this);
        }
    }

    public m6z(d4c0 d4c0Var, l6z l6zVar, p870 p870Var) {
        this.b = d4c0Var;
        this.c = l6zVar;
        this.d = p870Var;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public final void subscribe(io.reactivex.rxjava3.core.y<d4c0.a> yVar) {
        mm1 mm1Var = new mm1(16, yVar, this);
        this.d.b(142, new a(mm1Var, this));
        try {
            this.b.x(this.c, mm1Var, new d9j(yVar, 21));
        } catch (Exception e) {
            yVar.b(e);
        }
    }
}
