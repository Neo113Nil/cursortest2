package defpackage;

/* loaded from: classes10.dex */
public final class dl31 implements dq60 {
    public qp7 a;
    public boolean b;

    @Override // defpackage.dq60
    public final void a(Object obj) {
        d6z.y("SourceStreamRequirementObserver can be updated from main thread only", tob1.d());
        boolean equals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b == equals) {
            return;
        }
        this.b = equals;
        qp7 qp7Var = this.a;
        if (qp7Var == null) {
            sgb1.g(3, "VideoCapture");
        } else if (equals) {
            qp7Var.h();
        } else {
            qp7Var.a();
        }
    }

    public final void b() {
        d6z.y("SourceStreamRequirementObserver can be closed from main thread only", tob1.d());
        sgb1.g(3, "VideoCapture");
        qp7 qp7Var = this.a;
        if (qp7Var == null) {
            sgb1.g(3, "VideoCapture");
            return;
        }
        if (this.b) {
            this.b = false;
            if (qp7Var != null) {
                qp7Var.a();
            } else {
                sgb1.g(3, "VideoCapture");
            }
        }
        this.a = null;
    }

    @Override // defpackage.dq60
    public final void onError(Throwable th) {
        sgb1.g(5, "VideoCapture");
    }
}
