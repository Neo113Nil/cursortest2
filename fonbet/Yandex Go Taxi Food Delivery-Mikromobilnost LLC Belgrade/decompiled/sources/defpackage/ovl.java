package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import flex.section.divkit.DivkitSnippet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import just.adapter.sticky.StickyGravity;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class ovl {
    public final zjr a = new zjr(xfz.b(ovl.class.getSimpleName()));

    public static x4t0 a(List list, g0c g0cVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x4t0 x4t0Var = (x4t0) it.next();
            if (qoi0.a(x4t0Var.getClass()).equals(g0cVar)) {
                return x4t0Var;
            }
        }
        return null;
    }

    public static final kr e(w4t0 w4t0Var, t4t0 t4t0Var, StickyGravity stickyGravity, boolean z) {
        int i = mvl.a[stickyGravity.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            if (z) {
                if (t4t0Var != null) {
                    return t4t0Var.a;
                }
            } else if (t4t0Var != null) {
                return t4t0Var.b;
            }
        } else if (z) {
            if (w4t0Var != null) {
                return w4t0Var.a;
            }
        } else if (w4t0Var != null) {
            return w4t0Var.b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aul b(DivkitSnippet divkitSnippet, final pxl pxlVar, final e0q0 e0q0Var, sls slsVar, String str, x1q0 x1q0Var, syp0 syp0Var, mw5 mw5Var, String str2) {
        final pxl pxlVar2;
        final e0q0 e0q0Var2;
        aeu0 aeu0Var;
        boolean z;
        ztl ztlVar;
        xvl d = d(divkitSnippet);
        List list = divkitSnippet.e;
        if (d == null) {
            return null;
        }
        Map map = divkitSnippet.c;
        zrl zrlVar = null;
        if (map != null) {
            pxlVar2 = pxlVar;
            e0q0Var2 = e0q0Var;
            zrlVar = new zrl(new jb7(12, map, pxlVar2, e0q0Var2), null);
        } else {
            pxlVar2 = pxlVar;
            e0q0Var2 = e0q0Var;
        }
        a5t0 a5t0Var = divkitSnippet.d;
        final w4t0 w4t0Var = (w4t0) a(list, qoi0.a(w4t0.class));
        final t4t0 t4t0Var = (t4t0) a(list, qoi0.a(t4t0.class));
        int i = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        if (w4t0Var == null && t4t0Var == null) {
            aeu0Var = null;
        } else {
            boolean z3 = w4t0Var != null;
            boolean z4 = t4t0Var != null;
            final int i2 = 0;
            tls tlsVar = new tls() { // from class: kvl
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    t4t0 t4t0Var2 = t4t0Var;
                    w4t0 w4t0Var2 = w4t0Var;
                    pxl pxlVar3 = pxlVar2;
                    wu wuVar = e0q0Var2;
                    StickyGravity stickyGravity = (StickyGravity) obj;
                    switch (i3) {
                        case 0:
                            rzo.p(wuVar, ovl.e(w4t0Var2, t4t0Var2, stickyGravity, true), pxlVar3);
                            break;
                        default:
                            rzo.p(wuVar, ovl.e(w4t0Var2, t4t0Var2, stickyGravity, false), pxlVar3);
                            break;
                    }
                    return zy11Var;
                }
            };
            final int i3 = 1;
            aeu0Var = new aeu0(z3, z4, tlsVar, new tls() { // from class: kvl
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i32 = i3;
                    zy11 zy11Var = zy11.a;
                    t4t0 t4t0Var2 = t4t0Var;
                    w4t0 w4t0Var2 = w4t0Var;
                    pxl pxlVar3 = pxlVar;
                    wu wuVar = e0q0Var;
                    StickyGravity stickyGravity = (StickyGravity) obj;
                    switch (i32) {
                        case 0:
                            rzo.p(wuVar, ovl.e(w4t0Var2, t4t0Var2, stickyGravity, true), pxlVar3);
                            break;
                        default:
                            rzo.p(wuVar, ovl.e(w4t0Var2, t4t0Var2, stickyGravity, false), pxlVar3);
                            break;
                    }
                    return zy11Var;
                }
            }, new lvl(w4t0Var, t4t0Var, objArr == true ? 1 : 0), new lvl(w4t0Var, t4t0Var, i), new lvl(w4t0Var, t4t0Var, 2));
        }
        if (a(list, qoi0.a(l4t0.class)) != null) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        l4t0 l4t0Var = (l4t0) a(list, qoi0.a(l4t0.class));
        d2t0 d2t0Var = l4t0Var != null ? l4t0Var.a : null;
        l4t0 l4t0Var2 = (l4t0) a(list, qoi0.a(l4t0.class));
        d2t0 d2t0Var2 = l4t0Var2 != null ? l4t0Var2.b : null;
        l4t0 l4t0Var3 = (l4t0) a(list, qoi0.a(l4t0.class));
        t1t0 t1t0Var = l4t0Var3 != null ? l4t0Var3.c : null;
        c4t0 c4t0Var = (c4t0) a(list, qoi0.a(c4t0.class));
        xk7 xk7Var = new xk7(slsVar, zrlVar);
        String str3 = divkitSnippet.k;
        if (str3 == null) {
            str3 = "default";
        }
        String str4 = str3;
        fjj fjjVar = divkitSnippet.l;
        if (fjjVar == null) {
            ztlVar = ztl.e;
        } else {
            Boolean bool = fjjVar.a;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            String str5 = fjjVar.b;
            Boolean bool2 = fjjVar.c;
            if (bool2 != null) {
                z = bool2.booleanValue();
            }
            Boolean bool3 = fjjVar.d;
            ztlVar = new ztl(booleanValue, str5, z, bool3 != null ? bool3.booleanValue() : true);
        }
        mw5 mw5Var2 = divkitSnippet.m;
        return new aul(d, x1q0Var, syp0Var, a5t0Var, aeu0Var, z2, d2t0Var, d2t0Var2, t1t0Var, c4t0Var, xk7Var, str4, ztlVar, str, str2, mw5Var2 == null ? mw5Var : mw5Var2, null);
    }

    public final mds0 c(DivkitSnippet divkitSnippet, pxl pxlVar, wu wuVar) {
        xvl d = d(divkitSnippet);
        if (d == null) {
            return null;
        }
        Map map = divkitSnippet.c;
        return new mds0(d, map != null ? new zrl(new jb7(12, map, pxlVar, wuVar), null) : null);
    }

    public final xvl d(DivkitSnippet divkitSnippet) {
        StackTraceElement stackTraceElement;
        String str;
        n5o n5oVar = divkitSnippet.b;
        if (n5oVar != null) {
            String str2 = divkitSnippet.a;
            String str3 = divkitSnippet.f;
            if (str3 == null) {
                str3 = str2;
            }
            return new xvl(str2, n5oVar, new zmk(str3));
        }
        String type = ErrorTypes.DIVKIT_DIVDATA_DECODING_EMPTY.getType();
        i3y a = a.a(nvl.a);
        zjr zjrVar = this.a;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        i3y a2 = xfz.a(new Pair("errorType", type));
        tjr tjrVar2 = tjrVar;
        zjrVar.d(FlexLogLevel.ERROR, "Trying to render DivCard with empty divData", xfz.c(a, a2), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        return null;
    }
}
