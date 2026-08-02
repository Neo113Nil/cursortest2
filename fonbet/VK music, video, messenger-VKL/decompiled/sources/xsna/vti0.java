package xsna;

/* compiled from: SessionIdStorageImpl.kt */
/* loaded from: classes6.dex */
public final class vti0 implements uti0 {
    public Long a;

    @Override // xsna.uti0
    public final void a(Long l) {
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis());
        }
        this.a = l;
    }

    @Override // xsna.uti0
    public final void b() {
        this.a = null;
    }

    @Override // xsna.uti0
    public final Long getId() {
        return this.a;
    }
}
