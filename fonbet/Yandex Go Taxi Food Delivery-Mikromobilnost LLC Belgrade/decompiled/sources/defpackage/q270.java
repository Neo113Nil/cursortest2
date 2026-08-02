package defpackage;

/* loaded from: classes.dex */
public final class q270 extends aa51 {
    @Override // defpackage.aa51
    public final ba51 b() {
        if (!this.a || !this.c.j.d) {
            return new r270(this.b, this.c, this.d);
        }
        ny61.g("Cannot set backoff criteria on an idle mode job");
        return null;
    }

    @Override // defpackage.aa51
    public final aa51 c() {
        return this;
    }
}
