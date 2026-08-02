package defpackage;

import java.util.List;

/* loaded from: classes8.dex */
public final class oot {
    public final h3y a;

    public oot(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final List a(String str) {
        List b = ((kl20) this.a.get()).d().b(str);
        if (b.isEmpty()) {
            b = twl.W1.a(str);
        }
        return b;
    }
}
