package xsna;

import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.id.StringId;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: Marker.kt */
/* loaded from: classes2.dex */
public final class do00 extends elb0 {
    public final String j;
    public final long k;
    public final String l;
    public final CharSequence m;
    public final boolean n;

    /* compiled from: Marker.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return this.receiver.getClass();
        }
    }

    public do00(String str, String str2, long j, String str3, CharSequence charSequence, hah0 hah0Var, boolean z) {
        super(str, Coordinate.e(j), Coordinate.f(j), hah0Var);
        this.j = str2;
        this.k = j;
        this.l = str3;
        this.m = charSequence;
        this.n = z;
    }

    @Override // xsna.elb0
    public final elb0 c() {
        return new do00(this.b, this.j, this.k, this.l, this.m, this.e, this.n);
    }

    @Override // xsna.elb0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do00)) {
            return false;
        }
        return epx.f(this.b, ((do00) obj).b);
    }

    @Override // xsna.elb0
    public final int hashCode() {
        return this.b.hashCode() + ((new a(this, tby.class, "javaClass", "getJavaClass(Ljava/lang/Object;)Ljava/lang/Class;", 1).hashCode() + (super.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Marker(title=" + ((Object) this.m) + ", id=" + ((Object) StringId.a(this.b)) + ", coordinate=" + ((Object) Coordinate.i(this.k)) + ')';
    }
}
