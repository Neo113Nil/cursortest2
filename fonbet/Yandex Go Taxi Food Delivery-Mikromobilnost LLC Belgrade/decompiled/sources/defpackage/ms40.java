package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class ms40 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ ms40(int i, wg6 wg6Var, tls tlsVar) {
        this.a = i;
        this.b = wg6Var;
        this.c = tlsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        wg6 wg6Var = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) obj).booleanValue() && rfb1.b(wg6Var) == -2) {
                    tlsVar.invoke(ps40.a);
                    break;
                }
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                if (rfb1.b(wg6Var) != -2 && rfb1.b(wg6Var) != -1 && !rfb1.g(wg6Var)) {
                    tlsVar.invoke(new Integer(intValue));
                    break;
                }
                break;
            case 2:
                if (!((Boolean) obj).booleanValue() && rfb1.b(wg6Var) == -2) {
                    tlsVar.invoke(w911.a);
                    break;
                }
                break;
            case 3:
                int intValue2 = ((Number) obj).intValue();
                if (rfb1.b(wg6Var) != -2 && rfb1.b(wg6Var) != -1 && !rfb1.g(wg6Var)) {
                    tlsVar.invoke(new Integer(intValue2));
                    break;
                }
                break;
            default:
                int intValue3 = ((Number) obj).intValue();
                if (rfb1.b(wg6Var) != -2 && rfb1.b(wg6Var) != -1 && !rfb1.g(wg6Var)) {
                    tlsVar.invoke(new Integer(intValue3));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
