package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class njy implements Iterator, xfx {
    public String a;
    public boolean b;
    public final /* synthetic */ i73 c;

    public njy(i73 i73Var) {
        this.c = i73Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == null && !this.b) {
            String readLine = ((BufferedReader) this.c.b).readLine();
            this.a = readLine;
            if (readLine == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        String str = this.a;
        this.a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
