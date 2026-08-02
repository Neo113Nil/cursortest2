package defpackage;

/* loaded from: classes11.dex */
public final class me91 extends z591 {
    public static final Object c = new Object();
    public Object b;

    public me91(Object obj) {
        super(1);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        ny61.p();
        return null;
    }
}
