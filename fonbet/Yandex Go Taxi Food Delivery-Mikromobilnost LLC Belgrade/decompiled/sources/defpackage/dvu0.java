package defpackage;

/* loaded from: classes4.dex */
public final class dvu0 extends zi9 {
    public int a;
    public final /* synthetic */ CharSequence b;

    public dvu0(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // defpackage.zi9
    public final char a() {
        int i = this.a;
        this.a = i + 1;
        return this.b.charAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.length();
    }
}
