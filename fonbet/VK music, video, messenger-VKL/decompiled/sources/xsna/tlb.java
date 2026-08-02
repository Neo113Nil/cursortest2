package xsna;

import java.util.Iterator;

/* compiled from: Progressions.kt */
/* loaded from: classes8.dex */
public class tlb implements Iterable<Character>, gcy {
    public final char b;
    public final char c;
    public final int d = 1;

    public tlb(char c, char c2) {
        this.b = c;
        this.c = (char) tyx.b(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new ulb(this.b, this.c, this.d);
    }
}
