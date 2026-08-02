package defpackage;

/* loaded from: classes.dex */
public final class ee11 extends de11 {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new mh00(objArr[i], objArr[i + 1]);
    }
}
