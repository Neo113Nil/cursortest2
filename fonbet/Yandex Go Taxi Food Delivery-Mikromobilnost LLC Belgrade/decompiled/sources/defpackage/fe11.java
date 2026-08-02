package defpackage;

/* loaded from: classes10.dex */
public final class fe11 extends de11 {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        return this.a[i];
    }
}
