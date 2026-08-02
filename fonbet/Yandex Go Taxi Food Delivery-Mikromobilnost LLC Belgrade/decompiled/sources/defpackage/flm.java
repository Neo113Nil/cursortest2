package defpackage;

import com.yandex.go.navigator.alt_select.new_summary.a;
import com.yandex.go.navigator.main_screen.o;

/* loaded from: classes12.dex */
public final /* synthetic */ class flm implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ flm(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public void a() {
    }

    public final void n1(o8g0 o8g0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((mlm) h55Var).S(new gfl0(o8g0Var));
                break;
            case 1:
                ((o) h55Var).S(new gfl0(o8g0Var));
                break;
            default:
                a aVar = (a) h55Var;
                aVar.I.n(new gfl0(o8g0Var));
                aVar.S((dg50) aVar.n(), true);
                break;
        }
    }
}
