package defpackage;

/* loaded from: classes4.dex */
public final class ow61 implements uv61 {
    public Object a;
    public Object b;
    public long c;

    @Override // defpackage.uv61
    public final boolean a(long j) {
        boolean z = j <= this.c;
        if (!z) {
            a();
        }
        return z;
    }

    @Override // defpackage.uv61
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.uv61
    public final Object c() {
        return this.b;
    }

    @Override // defpackage.uv61
    public final void a() {
        this.a = null;
        this.b = null;
        this.c = -1L;
    }
}
