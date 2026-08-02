package defpackage;

/* loaded from: classes15.dex */
public final class bk3 extends ck3 {
    public final String k;
    public final /* synthetic */ sls l;
    public final /* synthetic */ sls m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk3(zj3 zj3Var, sls slsVar, sls slsVar2, pk3 pk3Var, jn3 jn3Var, oo90 oo90Var, zm90 zm90Var) {
        super(zj3Var, pk3Var, jn3Var, oo90Var, zm90Var);
        this.l = slsVar;
        this.m = slsVar2;
        this.k = "android_messenger_write_to_chat";
    }

    @Override // defpackage.ck3
    public final void a() {
        this.m.invoke();
    }

    @Override // defpackage.ck3
    public final void b() {
        this.l.invoke();
    }

    @Override // defpackage.ck3
    public final String d() {
        return this.k;
    }
}
