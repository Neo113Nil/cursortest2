package defpackage;

/* loaded from: classes.dex */
public final class n6e0 extends m6e0 {
    public final Object c;

    public n6e0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.m6e0, defpackage.l6e0
    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.m6e0, defpackage.l6e0
    public final boolean a0(Object obj) {
        boolean a0;
        synchronized (this.c) {
            a0 = super.a0(obj);
        }
        return a0;
    }
}
