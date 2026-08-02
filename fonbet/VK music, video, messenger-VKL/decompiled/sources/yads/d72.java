package yads;

/* loaded from: classes10.dex */
public final class d72 implements by0, o72 {
    public final f72 a;
    public final ms2 b;
    public final Long c;
    public final lw d;
    public final yv e;

    public d72(f72 f72Var, ms2 ms2Var, Long l, lw lwVar, yv yvVar) {
        this.a = f72Var;
        this.b = ms2Var;
        this.c = l;
        this.d = lwVar;
        this.e = yvVar;
    }

    @Override // yads.o72
    public final void a(long j, long j2) {
        if (this.e.a()) {
            lw lwVar = this.d;
            lwVar.b = j2;
            long j3 = j2 + lwVar.a;
            Long l = this.c;
            if (l == null || j3 < l.longValue()) {
                return;
            }
            this.b.a();
            c();
        }
    }

    @Override // yads.o72
    public final void b() {
        if (this.e.a()) {
            this.b.a();
            c();
        }
    }

    public final void c() {
        this.a.a.remove(this);
    }

    @Override // yads.by0
    public final void invalidate() {
        c();
    }

    @Override // yads.by0
    public final void start() {
        Long l;
        this.a.a.add(this);
        if (!this.e.a() || (l = this.c) == null || this.d.a < l.longValue()) {
            return;
        }
        this.b.a();
        c();
    }

    @Override // yads.o72
    public final void a() {
        this.b.a();
        c();
    }

    @Override // yads.by0
    public final void pause() {
    }

    @Override // yads.by0
    public final void resume() {
    }
}
