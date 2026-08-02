package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.ob00;

/* compiled from: LyricsContent.kt */
/* loaded from: classes3.dex */
public final class yvo0 extends da00 {
    public final ob00.a a;
    public final ArrayList b;
    public final ob00.b c;

    public yvo0(ob00.a aVar, ArrayList arrayList, ob00.b bVar) {
        this.a = aVar;
        this.b = arrayList;
        this.c = bVar;
    }

    @Override // xsna.da00
    public final void a(int i) {
        ob00.a aVar = this.a;
        if (aVar != null) {
            int i2 = aVar.d;
            int i3 = aVar.e;
            aVar.c = i < i3 && i2 <= i;
            aVar.f = i >= i3;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ob00 ob00Var = (ob00) it.next();
            ob00Var.c = i >= ob00Var.b() && i < ob00Var.a();
        }
        ob00.b bVar = this.c;
        bVar.c = i >= bVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvo0)) {
            return false;
        }
        yvo0 yvo0Var = (yvo0) obj;
        return epx.f(this.a, yvo0Var.a) && epx.f(this.b, yvo0Var.b) && epx.f(this.c, yvo0Var.c);
    }

    public final int hashCode() {
        ob00.a aVar = this.a;
        return this.c.hashCode() + qr.a(this.b, (aVar == null ? 0 : aVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "TimecodesLyricsContent(countdown=" + this.a + ", lines=" + this.b + ", credits=" + this.c + ')';
    }
}
