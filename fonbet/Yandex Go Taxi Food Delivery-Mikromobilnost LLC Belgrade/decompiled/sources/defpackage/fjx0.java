package defpackage;

import com.yandex.go.zone.dto.objects.SummaryStyle;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.styling.c;

/* loaded from: classes6.dex */
public final class fjx0 {
    public final yow0 a;
    public final c b;
    public final dqe0 c;

    public fjx0(yow0 yow0Var, c cVar, dqe0 dqe0Var) {
        this.a = yow0Var;
        this.b = cVar;
        this.c = dqe0Var;
    }

    public final bj70 a(mi31 mi31Var) {
        pex0 pex0Var = mi31Var.a;
        m37 m37Var = this.b.c(pex0Var, mi31Var.b, this.c.c()).a;
        if (pex0Var.e0.c) {
            SummaryStyle summaryStyle = pex0Var.v0;
            return this.a.a(summaryStyle != null ? summaryStyle.b : null, m37Var);
        }
        j37 a = m37Var.a(ButtonType.DEFAULT);
        return a != null ? xcb1.b(a) : bj70.d;
    }
}
