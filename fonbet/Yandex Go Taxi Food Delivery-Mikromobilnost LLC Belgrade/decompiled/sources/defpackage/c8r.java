package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.List;

/* loaded from: classes8.dex */
public final class c8r {
    public final ck31 a;
    public final urw b;

    public c8r(ck31 ck31Var, urw urwVar) {
        this.a = ck31Var;
        this.b = urwVar;
    }

    public static /* synthetic */ mi31 b(c8r c8rVar, String str, String str2, List list, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return c8rVar.a(str, str2, list);
    }

    public final mi31 a(String str, String str2, List list) {
        if (list == null) {
            list = ((k) this.a).j().a;
        }
        return this.b.c(str, str2, list);
    }
}
