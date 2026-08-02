package defpackage;

import kotlin.a;

/* loaded from: classes4.dex */
public final class lui0 implements fw {
    public final /* synthetic */ int a;
    public final i3y b;
    public final Object c;
    public final Object d;

    public lui0(k6x k6xVar, u4x u4xVar) {
        this.a = 1;
        this.c = k6xVar;
        this.d = u4xVar;
        this.b = a.a(new j6m0(10, this));
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar) {
        int i = this.a;
        i3y i3yVar = this.b;
        switch (i) {
            case 0:
                if (krVar instanceof kui0) {
                    return (flex.core.action.remote.a) i3yVar.getValue();
                }
                return null;
            default:
                if (krVar instanceof gmm0) {
                    return (imm0) i3yVar.getValue();
                }
                return null;
        }
    }

    public lui0(xv xvVar, ike ikeVar) {
        this.a = 0;
        this.c = xvVar;
        this.d = ikeVar;
        this.b = a.a(new vyf0(13, this));
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar, klc klcVar) {
        switch (this.a) {
        }
        return handler(krVar);
    }
}
