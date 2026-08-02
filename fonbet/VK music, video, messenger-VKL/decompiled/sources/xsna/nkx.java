package xsna;

import xsna.gy70;
import xsna.vu2;

/* compiled from: InternalOkHttpMethodCall.kt */
/* loaded from: classes.dex */
public class nkx extends vu2 {
    public final boolean u;
    public final int[] v;
    public final boolean w;

    /* compiled from: InternalOkHttpMethodCall.kt */
    public static class a extends vu2.a {
        public boolean t;
        public int[] u;
        public boolean v;

        @Override // xsna.vu2.a, xsna.gy70.a
        public final /* bridge */ /* synthetic */ gy70.a c(com.vk.api.sdk.a aVar) {
            throw null;
        }

        @Override // xsna.gy70.a
        public final void d(String str) {
            this.c = str;
        }

        @Override // xsna.vu2.a, xsna.gy70.a
        public final void e(String str) {
            this.a = str;
        }

        @Override // xsna.gy70.a
        public final void f(String str) {
            this.d = str;
        }

        @Override // xsna.vu2.a
        public final void g(String str) {
            this.o = str;
        }

        @Override // xsna.vu2.a
        public final void i(boolean z) {
            this.q = z;
        }

        @Override // xsna.vu2.a
        public final void k(String str) {
            this.p = str;
        }

        @Override // xsna.vu2.a
        /* renamed from: l */
        public final vu2.a e(String str) {
            this.a = str;
            return this;
        }

        @Override // xsna.vu2.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public nkx b() {
            return new nkx(this);
        }

        public final void n(com.vk.api.sdk.a aVar) {
            super.j(aVar);
            if (aVar instanceof ij20) {
                ij20 ij20Var = (ij20) aVar;
                this.t = ij20Var.u;
                this.u = aVar.l;
                this.h = ij20Var.v;
                this.v = ij20Var.w;
            }
        }
    }

    public nkx(a aVar) {
        super(aVar);
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
    }
}
