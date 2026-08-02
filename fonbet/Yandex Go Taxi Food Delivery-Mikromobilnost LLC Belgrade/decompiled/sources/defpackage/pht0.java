package defpackage;

import com.yandex.go.preorder.navigation.n;

/* loaded from: classes13.dex */
public final class pht0 implements gx30 {
    public final /* synthetic */ n a;
    public final /* synthetic */ bov0 b;
    public final /* synthetic */ qht0 c;
    public final /* synthetic */ String w;

    public pht0(qht0 qht0Var, bov0 bov0Var, n nVar, String str) {
        this.a = nVar;
        this.b = bov0Var;
        this.c = qht0Var;
        this.w = str;
    }

    @Override // defpackage.sy60
    public final void a() {
        n.W(this.a, this.b);
    }

    @Override // defpackage.gx30
    public final void b(String str) {
        qht0.a(this.c, str, this.b, this.w);
    }

    @Override // defpackage.gx30
    public final void e() {
        n.V(this.a, this.b);
    }
}
