package defpackage;

/* loaded from: classes.dex */
public final class izv implements s1b0 {
    public boolean a;
    public final /* synthetic */ jzv b;

    public izv(jzv jzvVar) {
        this.b = jzvVar;
    }

    @Override // defpackage.s1b0
    public final void a() {
        jzv jzvVar = this.b;
        jzvVar.b = false;
        if (this.a) {
            return;
        }
        jzvVar.a = null;
    }

    @Override // defpackage.s1b0
    public final void b() {
        this.b.b = true;
        this.a = false;
    }
}
