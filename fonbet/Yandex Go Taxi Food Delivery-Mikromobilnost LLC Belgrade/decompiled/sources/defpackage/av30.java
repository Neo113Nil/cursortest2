package defpackage;

import ru.yandex.taxi.masstransit.trains.schedule.e;

/* loaded from: classes6.dex */
public final class av30 implements za40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pgd b;

    public /* synthetic */ av30(pgd pgdVar, int i) {
        this.a = i;
        this.b = pgdVar;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.za40
    public final void C(CharSequence charSequence, String str) {
        int i = this.a;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                cv30 cv30Var = (cv30) pgdVar;
                ((mg21) ((lg21) cv30Var.L.get())).c(str);
                cv30Var.M.a(charSequence);
                cv30Var.r(new qu(9));
                break;
            default:
                e eVar = (e) pgdVar;
                ((mg21) ((lg21) eVar.Q.get())).c(str);
                eVar.R.a(charSequence);
                eVar.r(new qu(9));
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
    }
}
