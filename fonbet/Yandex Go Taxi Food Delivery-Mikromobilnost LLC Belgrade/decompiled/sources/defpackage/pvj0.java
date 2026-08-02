package defpackage;

/* loaded from: classes9.dex */
public final class pvj0 extends rvj0 {
    public final /* synthetic */ wg10 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ qq6 c;

    public pvj0(wg10 wg10Var, long j, qq6 qq6Var) {
        this.a = wg10Var;
        this.b = j;
        this.c = qq6Var;
    }

    @Override // defpackage.rvj0
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.rvj0
    public final wg10 contentType() {
        return this.a;
    }

    @Override // defpackage.rvj0
    public final qq6 source() {
        return this.c;
    }
}
