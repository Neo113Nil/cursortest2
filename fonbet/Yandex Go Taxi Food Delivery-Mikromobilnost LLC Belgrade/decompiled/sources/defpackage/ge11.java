package defpackage;

/* loaded from: classes10.dex */
public final class ge11 extends de11 {
    public final xab w;

    public ge11(xab xabVar) {
        this.w = xabVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new jy40(this.w, objArr[i], objArr[i + 1]);
    }
}
