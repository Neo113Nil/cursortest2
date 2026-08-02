package xsna;

import com.vk.dto.common.id.UserId;
import xsna.gy70;

/* compiled from: AnonymousOkHttpMethodCall.kt */
/* loaded from: classes.dex */
public class vu2 extends gy70 {
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final UserId t;

    /* compiled from: AnonymousOkHttpMethodCall.kt */
    public static class a extends gy70.a {
        public String o;
        public String p;
        public boolean q;
        public boolean r;
        public UserId s;

        @Override // xsna.gy70.a
        public /* bridge */ /* synthetic */ gy70.a c(com.vk.api.sdk.a aVar) {
            throw null;
        }

        public void g(String str) {
            this.o = str;
        }

        @Override // xsna.gy70.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public vu2 b() {
            return new vu2(this);
        }

        public void i(boolean z) {
            this.q = z;
        }

        public a j(com.vk.api.sdk.a aVar) {
            super.c(aVar);
            if (aVar instanceof nhx) {
                nhx nhxVar = (nhx) aVar;
                g(nhxVar.q);
                this.s = nhxVar.t;
                k(nhxVar.r);
                i(nhxVar.s);
                e(aVar.a);
                this.r = aVar.k;
            }
            return this;
        }

        public void k(String str) {
            this.p = str;
        }

        @Override // xsna.gy70.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(String str) {
            this.a = str;
            return this;
        }
    }

    public vu2(a aVar) {
        super(aVar);
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.s;
    }
}
