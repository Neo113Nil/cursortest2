package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class jr50 implements jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ vpu b;

    public /* synthetic */ jr50(vpu vpuVar, int i) {
        this.a = i;
        this.b = vpuVar;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof jr50) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof jr50) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof jr50) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(0, this.b, vpu.class, "getGraphqlGatewayWeblink", "getGraphqlGatewayWeblink()Landroid/net/Uri;", 0);
            case 1:
                return new FunctionReferenceImpl(0, this.b, vpu.class, "getRestGatewayWeblink", "getRestGatewayWeblink()Landroid/net/Uri;", 0);
            default:
                return new FunctionReferenceImpl(0, this.b, vpu.class, "getHomeWebViewWeblink", "getHomeWebViewWeblink()Landroid/net/Uri;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
