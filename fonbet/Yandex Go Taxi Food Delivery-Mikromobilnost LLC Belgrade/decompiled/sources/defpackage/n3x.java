package defpackage;

/* loaded from: classes.dex */
public final class n3x extends h221 {
    public final Object b;
    public boolean c;

    public n3x(Object obj) {
        super(0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            ny61.p();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
