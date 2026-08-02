package xsna;

import xsna.lm6;

/* compiled from: SearchParamsDelegateFactory.kt */
/* loaded from: classes5.dex */
public final class ywh0 {
    public final lm6.b a;
    public final f0i0 b;
    public final arh0 c;

    public ywh0(lm6.b bVar, f0i0 f0i0Var, arh0 arh0Var) {
        this.a = bVar;
        this.b = f0i0Var;
        this.c = arh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywh0)) {
            return false;
        }
        ywh0 ywh0Var = (ywh0) obj;
        return epx.f(this.a, ywh0Var.a) && epx.f(this.b, ywh0Var.b) && epx.f(this.c, ywh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MenuIntegrationDelegateCreateParams(ownerCallback=" + this.a + ", searchViewStateController=" + this.b + ", searchFeatureControllerFactory=" + this.c + ')';
    }
}
