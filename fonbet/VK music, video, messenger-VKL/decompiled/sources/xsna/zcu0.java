package xsna;

import xsna.n7r0;

/* compiled from: VkAuthValidationHandlerDecorator.kt */
/* loaded from: classes.dex */
public final class zcu0 implements w8i, n7r0 {
    public final jql b;
    public final bpn0 c = new bpn0(new xsa(this, 12));

    /* compiled from: VkAuthValidationHandlerDecorator.kt */
    /* loaded from: classes15.dex */
    public static final class a extends n7r0.a<n7r0.c> {
        public final /* synthetic */ n7r0.a<n7r0.c> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n7r0.a<n7r0.c> aVar, n7r0.e eVar) {
            super(eVar);
            this.c = aVar;
        }

        @Override // xsna.n7r0.a
        public final void a() {
            this.c.a();
            com.vk.registration.funnels.b.a.getClass();
            qro0.c(new f550(new uqf0(false), 22));
        }

        @Override // xsna.n7r0.a
        public final void d(n7r0.c cVar) {
            this.c.d(cVar);
            com.vk.registration.funnels.b.a.getClass();
            qro0.c(new f550(new uqf0(true), 22));
        }
    }

    public zcu0(jql jqlVar) {
        this.b = jqlVar;
    }

    @Override // xsna.n7r0
    public final void a(n7r0.b bVar, n7r0.a<n7r0.c> aVar) {
        qro0.c(new ltb0(16));
        a aVar2 = new a(aVar, aVar.b());
        bpn0 bpn0Var = this.c;
        wzg0 wzg0Var = (wzg0) bpn0Var.getValue();
        r55 r55Var = r55.a;
        wzg0Var.a(r55.a(), bVar);
        yhr0.a();
        n7r0.c b = ((wzg0) bpn0Var.getValue()).b();
        if ((b != null ? b.a() : null) != null) {
            aVar2.d(((wzg0) bpn0Var.getValue()).b());
        } else {
            aVar2.a();
        }
    }

    @Override // xsna.n7r0
    public final void b(String str, n7r0.a<Boolean> aVar) {
        this.b.b(str, aVar);
    }

    @Override // xsna.n7r0
    public final void c(String str, n7r0.a<n7r0.d> aVar) {
        this.b.c(str, aVar);
    }
}
