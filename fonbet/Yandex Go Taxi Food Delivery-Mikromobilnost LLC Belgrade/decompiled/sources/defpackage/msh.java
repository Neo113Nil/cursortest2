package defpackage;

import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class msh implements Iterator, xfx {
    public int a = -1;
    public int b;
    public int c;
    public d6w w;
    public int x;
    public final /* synthetic */ nsh y;

    public msh(nsh nshVar) {
        this.y = nshVar;
        int d = y6i0.d(0, 0, nshVar.a.length());
        this.b = d;
        this.c = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        nsh nshVar = this.y;
        CharSequence charSequence = nshVar.a;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.w = null;
            return;
        }
        int i2 = nshVar.b;
        if (i2 > 0) {
            int i3 = this.x + 1;
            this.x = i3;
        }
        if (i <= charSequence.length()) {
            Pair pair = (Pair) nshVar.c.invoke(charSequence, Integer.valueOf(this.c));
            if (pair == null) {
                this.w = new d6w(this.b, evu0.C(charSequence), 1);
                this.c = -1;
            } else {
                int intValue = ((Number) pair.getFirst()).intValue();
                int intValue2 = ((Number) pair.getSecond()).intValue();
                this.w = y6i0.n(this.b, intValue);
                int i4 = intValue + intValue2;
                this.b = i4;
                this.c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.a = 1;
        }
        this.w = new d6w(this.b, evu0.C(charSequence), 1);
        this.c = -1;
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            ny61.p();
            return null;
        }
        d6w d6wVar = this.w;
        this.w = null;
        this.a = -1;
        return d6wVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
