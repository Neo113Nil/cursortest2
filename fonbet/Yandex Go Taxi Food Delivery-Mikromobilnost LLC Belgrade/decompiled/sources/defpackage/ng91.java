package defpackage;

/* loaded from: classes11.dex */
public final class ng91 extends z591 {
    public final Object b;
    public boolean c;

    public ng91(Object obj) {
        super(2);
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
