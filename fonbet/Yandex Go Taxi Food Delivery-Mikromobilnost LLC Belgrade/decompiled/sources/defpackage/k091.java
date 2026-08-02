package defpackage;

/* loaded from: classes7.dex */
public final class k091 extends wr71 {
    public boolean a;
    public final /* synthetic */ Object b;

    public k091(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            ny61.p();
            return null;
        }
        this.a = true;
        return this.b;
    }
}
