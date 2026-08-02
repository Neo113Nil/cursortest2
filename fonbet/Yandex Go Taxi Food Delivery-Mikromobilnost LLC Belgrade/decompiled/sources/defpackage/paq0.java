package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes8.dex */
public final class paq0 {
    public final wiq0 a;
    public final c4r0 b;

    public paq0(wiq0 wiq0Var, c4r0 c4r0Var) {
        this.a = wiq0Var;
        this.b = c4r0Var;
    }

    public final void a() {
        fnx0 l = ((k) this.a).l();
        if (l == null) {
            return;
        }
        this.b.a(new gnx0(new fnx0(l.c, l.d, SelectionOrigin.SHORTCUT), true));
    }
}
