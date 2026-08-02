package xsna;

import java.util.Iterator;

/* compiled from: SerialDescriptor.kt */
/* loaded from: classes8.dex */
public final class ami0 implements Iterator<String>, gcy {
    public int b;
    public final /* synthetic */ yrp c;

    public ami0(yrp yrpVar) {
        this.c = yrpVar;
        this.b = yrpVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        yrp yrpVar = this.c;
        int i = yrpVar.c;
        int i2 = this.b;
        this.b = i2 - 1;
        return yrpVar.e[i - i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
