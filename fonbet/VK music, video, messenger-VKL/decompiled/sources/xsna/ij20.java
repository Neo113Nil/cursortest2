package xsna;

import java.util.Map;
import xsna.nhx;

/* compiled from: MethodCall.kt */
/* loaded from: classes.dex */
public class ij20 extends nhx {
    public final boolean u;
    public final l8g0 v;
    public final boolean w;
    public Long x;

    /* compiled from: MethodCall.kt */
    public static class a extends nhx.a {
        public boolean u;
        public l8g0 v;
        public boolean w;

        public a() {
            q("5.285");
        }

        @Override // com.vk.api.sdk.a.C0374a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z) {
            this.k = z;
            return this;
        }

        public a h(Object obj, String str) {
            this.f.put(str, obj.toString());
            return this;
        }

        @Override // com.vk.api.sdk.a.C0374a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(String str, String str2) {
            super.b(str, str2);
            return this;
        }

        public a j(String str, boolean z) {
            this.f.put(str, z ? "1" : "0");
            return this;
        }

        public a k(Map<String, String> map) {
            this.f.putAll(map);
            return this;
        }

        public a l(boolean z) {
            this.i = z;
            return this;
        }

        @Override // xsna.nhx.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public ij20 c() {
            return new ij20(this);
        }

        @Override // xsna.nhx.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a f(boolean z) {
            this.o = z;
            return this;
        }

        @Override // com.vk.api.sdk.a.C0374a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a d(String str) {
            this.c = str;
            return this;
        }

        public a p(int i) {
            this.g = i;
            return this;
        }

        public a q(String str) {
            this.d = str;
            return this;
        }
    }

    public ij20(a aVar) {
        super(aVar);
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
    }
}
