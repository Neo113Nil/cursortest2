package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class gjt implements agn0 {
    @Override // xsna.agn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(String str, String str2) {
        if ((4 & 1) != 0) {
            str = null;
        }
        if ((4 & 2) != 0) {
            str2 = null;
        }
        bx2 e = e370.e(bhu.l(str, str2, null));
        e370.a(e);
        return rdx0.u(e).U(new mj1(new oj(29), 22));
    }

    @Override // xsna.agn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(String str, String str2) {
        ufx ufxVar = new ufx("utils.guessUserSex", new gub0(4), new alb0(8));
        if (str != null) {
            ufx.n(ufxVar, "first_name", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "last_name", str2, 0, 12);
        }
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.u(e).U(new com.vk.movika.sdk.base.hooks.k(new nj(24), 27));
    }

    @Override // xsna.agn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(String str) {
        if ((3 & 4) != 0) {
            str = null;
        }
        bx2 e = e370.e(bhu.l(null, null, str));
        e370.a(e);
        return rdx0.u(e).U(new q40(new pe1(26), 17));
    }
}
