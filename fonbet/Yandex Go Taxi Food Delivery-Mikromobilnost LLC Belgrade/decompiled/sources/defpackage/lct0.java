package defpackage;

import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.design.sourcedestination.SourceTrailMode;

/* loaded from: classes14.dex */
public final class lct0 {
    public String a;
    public String b;
    public String d;
    public String e;
    public String h;
    public String i;
    public String j;
    public pqk0 k;
    public int l;
    public SourceTrailMode c = SourceTrailMode.NONE;
    public DestinationTrailMode f = DestinationTrailMode.NONE;
    public CharSequence g = "";

    public final mct0 a() {
        return new mct0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final void b(String str) {
        this.d = str;
        this.l = 1;
    }
}
