package defpackage;

import android.view.View;
import ru.yandex.taxi.preorder.summary.tariffpage.requirements.a;

/* loaded from: classes6.dex */
public final class aov0 implements iqj0 {
    public final h3y a;

    public aov0(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iqj0
    public final void a(View view) {
        boolean z = view instanceof u45;
        h3y h3yVar = this.a;
        if (z) {
            ((a) h3yVar.get()).d.l((u45) view);
            return;
        }
        w030 w030Var = ((a) h3yVar.get()).d;
        u45 e = w030Var.e();
        if (e != null) {
            w030Var.l(e);
        }
    }
}
