package defpackage;

import ru.yandex.taxi.am.g;

/* loaded from: classes9.dex */
public final class bfp {
    public final g a;
    public volatile jpb b;

    public bfp(g gVar) {
        this.a = gVar;
    }

    public final ffp a() {
        jpb jpbVar = this.b;
        if (jpbVar == null) {
            return null;
        }
        if (jpbVar.b == this.a.i()) {
            return (ffp) jpbVar.c;
        }
        this.b = null;
        return null;
    }
}
