package defpackage;

import okhttp3.internal.connection.RealConnection;

/* loaded from: classes9.dex */
public final class o2k0 implements f7l0 {
    public final RealConnection a;

    public o2k0(RealConnection realConnection) {
        this.a = realConnection;
    }

    @Override // defpackage.f7l0
    public final RealConnection a() {
        return this.a;
    }

    @Override // defpackage.f7l0
    public final e7l0 c() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.f7l0, defpackage.ojo
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.f7l0
    public final e7l0 d() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.f7l0
    public final f7l0 f() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.f7l0
    public final boolean isReady() {
        return true;
    }
}
