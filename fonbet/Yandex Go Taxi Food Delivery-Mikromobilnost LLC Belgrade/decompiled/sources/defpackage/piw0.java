package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes14.dex */
public final class piw0 {
    public final lx4 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public piw0(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static String a(String str, String str2) {
        return b64.l("SupportSuggests.", str, Extension.DOT_CHAR, str2);
    }

    public final void b(String str, Pair... pairArr) {
        i d = ((j) this.a).d(str);
        d.h(b.u(pairArr));
        d.m();
    }
}
