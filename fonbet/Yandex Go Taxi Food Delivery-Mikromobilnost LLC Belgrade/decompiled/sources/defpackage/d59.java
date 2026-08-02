package defpackage;

import ru.yandex.taxi.cashback.router.real.home.a;

/* loaded from: classes6.dex */
public final class d59 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ d59(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    public final void a(String str, boolean z) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a46) h55Var).r(new lo1(z, str, 1));
                break;
            case 1:
                ((a46) h55Var).r(new lo1(z, str, 12));
                break;
            default:
                ((a) h55Var).r(new lo1(z, str, 13));
                break;
        }
    }

    public final void b(String str) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((oqd0) ((a46) h55Var).K).b(str, false, true);
                break;
            case 1:
                ((oqd0) ((a46) h55Var).J).b(str, false, true);
                break;
            default:
                ((a) h55Var).P.b(str, false, true);
                break;
        }
    }
}
