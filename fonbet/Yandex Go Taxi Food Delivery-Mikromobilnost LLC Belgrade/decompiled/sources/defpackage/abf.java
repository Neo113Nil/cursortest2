package defpackage;

import com.ybsdk.feature.credit.deposit.internal.screens.deposit.a;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class abf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ abf(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        waf wafVar;
        String str;
        xaf xafVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                j7r j7rVar = (j7r) obj;
                String str2 = j7rVar.g;
                String str3 = j7rVar.a;
                if (str2 == null) {
                    Iterator it = ((waf) aVar.X()).r.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            saf safVar = (saf) obj2;
                            if (!jl40.l(safVar.a, str3)) {
                                raf rafVar = safVar.i;
                                if (jl40.l(rafVar != null ? rafVar.a : null, str3)) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    saf safVar2 = (saf) obj2;
                    if (safVar2 != null) {
                        aVar.l0(safVar2);
                        break;
                    }
                } else {
                    pz40 Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, j7rVar.g, null, false, null, 253951)));
                    aVar.y0();
                    break;
                }
                break;
            default:
                s2e0 s2e0Var = (s2e0) obj;
                aVar.C.m(s2e0Var);
                pz40 Y2 = aVar.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    wafVar = (waf) value2;
                    xaf xafVar2 = (xaf) s2e0Var.a();
                    str = xafVar2 != null ? xafVar2.h : null;
                    xafVar = (xaf) s2e0Var.a();
                } while (!r0Var2.k(value2, waf.a(wafVar, null, null, null, null, null, null, null, null, s2e0Var, str, xafVar != null ? xafVar.j : null, null, null, null, false, null, 258559)));
        }
        return zy11Var;
    }
}
