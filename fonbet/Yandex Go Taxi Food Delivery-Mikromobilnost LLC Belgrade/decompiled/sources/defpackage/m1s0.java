package defpackage;

import com.yandex.go.taxi.main.shortcuts.interactors.c;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes13.dex */
public final class m1s0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ bov0 b;
    public final /* synthetic */ String c;

    public m1s0(c cVar, bov0 bov0Var, String str) {
        this.a = cVar;
        this.b = bov0Var;
        this.c = str;
    }

    public final void a() {
        h1s0 h1s0Var = this.a.d;
        fcj0 fcj0Var = new fcj0(this.b);
        fcj0Var.d = this.c;
        fcj0Var.e = SelectionOrigin.ACTION;
        h1s0Var.b(new k9s0(fcj0Var));
    }

    public final void b(String str, String str2) {
        h1s0 h1s0Var = this.a.d;
        fcj0 fcj0Var = new fcj0(this.b);
        fcj0Var.b = str;
        fcj0Var.c = str2;
        fcj0Var.d = this.c;
        fcj0Var.e = SelectionOrigin.ACTION;
        h1s0Var.b(new k9s0(fcj0Var));
    }
}
