package xsna;

/* compiled from: ClipsCommentThreadPresenter.kt */
/* loaded from: classes4.dex */
public final class ond extends mdg<bfg<?>> {
    public static final io.reactivex.rxjava3.subjects.f<a> h0 = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: ClipsCommentThreadPresenter.kt */
    public static abstract class a {
        public final iag a;

        /* compiled from: ClipsCommentThreadPresenter.kt */
        /* renamed from: xsna.ond$a$a, reason: collision with other inner class name */
        public static final class C3457a extends a {
        }

        /* compiled from: ClipsCommentThreadPresenter.kt */
        public static final class b extends a {
        }

        /* compiled from: ClipsCommentThreadPresenter.kt */
        public static final class c extends a {
        }

        public a(iag iagVar) {
            this.a = iagVar;
        }
    }

    @Override // xsna.mdg
    public final void M7(iag iagVar) {
        h0.onNext(new a.C3457a(iagVar));
    }

    @Override // xsna.mdg
    public final void N7(iag iagVar) {
        h0.onNext(new a.b(iagVar));
    }

    @Override // xsna.mdg
    public final void O7(iag iagVar) {
        h0.onNext(new a.c(iagVar));
    }
}
