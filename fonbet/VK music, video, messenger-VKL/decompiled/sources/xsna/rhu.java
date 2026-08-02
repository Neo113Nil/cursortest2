package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.qiu;

/* compiled from: GroupCallGridViewPagerMeasurer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class rhu implements qiu.a, g0t {
    public final /* synthetic */ qhu b;

    public rhu(qhu qhuVar) {
        this.b = qhuVar;
    }

    @Override // xsna.qiu.a
    public final void c() {
        qhu.a(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qiu.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.b, qhu.class, "onTopIndentChanged", "onTopIndentChanged()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
