package defpackage;

import flex.actions.templated.a;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ew implements fw {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ew(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (dw) ((Map) obj).get(qoi0.a(krVar.getClass()));
            default:
                if (krVar instanceof cgy0) {
                    return new a((d0m) obj, seu.A);
                }
                return null;
        }
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar, klc klcVar) {
        switch (this.a) {
        }
        return handler(krVar);
    }
}
