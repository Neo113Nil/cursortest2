package defpackage;

import com.yandex.go.business.impl.router.b;
import com.yandex.go.captcha.f;
import com.yandex.go.vault.router.c;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class h331 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ h331(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((c) h55Var).r(new qu(i2));
                break;
            case 1:
                ((p241) h55Var).r(new qu(i2));
                break;
            case 2:
                ((m541) h55Var).r(new qu(i2));
                break;
            case 3:
                f fVar = (f) h55Var;
                fVar.r(new qu(i2));
                fVar.H.invoke();
                break;
            case 4:
                yn5 yn5Var = (yn5) h55Var;
                yn5Var.r(new qu(i2));
                ((bm50) yn5Var.F).invoke();
                break;
            case 5:
                ((uva) h55Var).r(new qu(i2));
                break;
            default:
                b bVar = (b) h55Var;
                SimpleSpinnerModalView simpleSpinnerModalView = bVar.I;
                if (simpleSpinnerModalView != null) {
                    simpleSpinnerModalView.dismiss();
                }
                bVar.r(new qu(i2));
                break;
        }
    }
}
