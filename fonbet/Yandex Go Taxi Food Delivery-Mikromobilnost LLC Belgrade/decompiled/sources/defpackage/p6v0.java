package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class p6v0 implements zo31 {
    public final LinearLayoutCompat a;
    public final RobotoTextView b;
    public final ho4 c;
    public final eob0 d;
    public final m6v0 e;
    public final m2y f;

    public p6v0(LinearLayoutCompat linearLayoutCompat, RobotoTextView robotoTextView, ho4 ho4Var, eob0 eob0Var, m6v0 m6v0Var, m2y m2yVar) {
        this.a = linearLayoutCompat;
        this.b = robotoTextView;
        this.c = ho4Var;
        this.d = eob0Var;
        this.e = m6v0Var;
        this.f = m2yVar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
