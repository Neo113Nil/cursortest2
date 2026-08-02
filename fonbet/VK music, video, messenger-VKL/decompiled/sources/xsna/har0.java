package xsna;

import com.vk.api.sdk.a;
import java.util.Map;
import xsna.ij20;
import xsna.nhx;

/* compiled from: VKBatchMethodCall.kt */
/* loaded from: classes.dex */
public final class har0 extends ij20 {
    public final boolean A;
    public final Integer B;
    public final Map<String, com.vk.api.sdk.a> y;
    public final boolean z;

    /* compiled from: VKBatchMethodCall.kt */
    /* loaded from: classes15.dex */
    public static final class a extends ij20.a {
        public Object x;

        @Override // xsna.ij20.a, com.vk.api.sdk.a.C0374a
        public final a.C0374a a(boolean z) {
            this.k = z;
            return this;
        }

        @Override // xsna.ij20.a, com.vk.api.sdk.a.C0374a
        public final a.C0374a b(String str, String str2) {
            super.b(str, str2);
            return this;
        }

        @Override // xsna.ij20.a, xsna.nhx.a, com.vk.api.sdk.a.C0374a
        public final com.vk.api.sdk.a c() {
            return new har0(this);
        }

        @Override // xsna.ij20.a, com.vk.api.sdk.a.C0374a
        public final a.C0374a d(String str) {
            this.c = str;
            return this;
        }

        @Override // xsna.ij20.a, xsna.nhx.a
        /* renamed from: e */
        public final nhx c() {
            return new har0(this);
        }

        @Override // xsna.ij20.a, xsna.nhx.a
        public final nhx.a f(boolean z) {
            this.o = z;
            return this;
        }

        @Override // xsna.ij20.a
        /* renamed from: g */
        public final ij20.a a(boolean z) {
            this.k = z;
            return this;
        }

        @Override // xsna.ij20.a
        public final ij20.a h(Object obj, String str) {
            super.h(obj, str);
            return this;
        }

        @Override // xsna.ij20.a
        /* renamed from: i */
        public final ij20.a b(String str, String str2) {
            super.b(str, str2);
            return this;
        }

        @Override // xsna.ij20.a
        public final ij20.a j(String str, boolean z) {
            throw null;
        }

        @Override // xsna.ij20.a
        public final ij20.a k(Map map) {
            super.k(map);
            return this;
        }

        @Override // xsna.ij20.a
        public final ij20.a l(boolean z) {
            this.i = z;
            return this;
        }

        @Override // xsna.ij20.a
        /* renamed from: m */
        public final ij20 c() {
            return new har0(this);
        }

        @Override // xsna.ij20.a
        /* renamed from: n */
        public final ij20.a f(boolean z) {
            this.o = z;
            return this;
        }

        @Override // xsna.ij20.a
        /* renamed from: o */
        public final ij20.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // xsna.ij20.a
        public final ij20.a p(int i) {
            this.g = i;
            return this;
        }

        @Override // xsna.ij20.a
        public final ij20.a q(String str) {
            this.d = str;
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, com.vk.api.sdk.a>] */
        public final Map<String, com.vk.api.sdk.a> r() {
            return this.x;
        }
    }

    public har0(a aVar) {
        super(aVar);
        if (drm0.N(aVar.d)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.y = aVar.r();
        this.z = false;
        this.A = false;
        this.B = null;
    }

    @Override // com.vk.api.sdk.a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!har0.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        har0 har0Var = (har0) obj;
        return this.z == har0Var.z && this.A == har0Var.A && epx.f(this.B, har0Var.B) && epx.f(this.y, har0Var.y);
    }

    @Override // com.vk.api.sdk.a
    public final int hashCode() {
        int b = qoy.b(qoy.b(super.hashCode() * 31, 31, this.z), 31, this.A);
        Integer num = this.B;
        return this.y.hashCode() + ((b + (num != null ? num.intValue() : 0)) * 31);
    }

    @Override // com.vk.api.sdk.a
    public final String toString() {
        StringBuilder sb = new StringBuilder("VKBatchMethodCall(calls=");
        sb.append(this.y);
        sb.append(", sequential=");
        sb.append(this.z);
        sb.append(", stopOnError=");
        sb.append(this.A);
        sb.append(", timeout=");
        return uqi.b(sb, this.B, ')');
    }
}
