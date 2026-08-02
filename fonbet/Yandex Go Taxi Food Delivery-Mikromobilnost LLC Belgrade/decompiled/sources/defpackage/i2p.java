package defpackage;

/* loaded from: classes12.dex */
public final class i2p implements skv {
    public final /* synthetic */ gcn a;
    public final /* synthetic */ String b;
    public final /* synthetic */ p2p c;

    public i2p(gcn gcnVar, String str, p2p p2pVar) {
        this.a = gcnVar;
        this.b = str;
        this.c = p2pVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.a(new ck7(Boolean.TRUE, null));
    }

    @Override // defpackage.skv
    public final void u0() {
        gcn gcnVar = this.a;
        String str = this.b;
        if (str == null || evu0.J(str)) {
            gcnVar.a(new ck7(Boolean.FALSE, null));
        } else {
            ((aj7) this.c.K).b(str, false);
            gcnVar.a(new ck7(Boolean.TRUE, null));
        }
    }
}
