package defpackage;

import com.yandex.go.cartech.sdk.CartechDynamicApi;

/* loaded from: classes12.dex */
public final class l19 implements t7n {
    public final /* synthetic */ zsa a;
    public final /* synthetic */ z09 b;

    public l19(zsa zsaVar, z09 z09Var) {
        this.a = zsaVar;
        this.b = z09Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.t7n
    public final void u() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.t7n
    public final void v(h7n h7nVar) {
        zsa zsaVar = this.a;
        zsaVar.A((m950) ((pw) zsaVar.F).get(), new h19((CartechDynamicApi) h7nVar, this.b.a), new bb0(zsaVar, 15));
    }
}
