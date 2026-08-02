package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class pce extends xij {
    public final /* synthetic */ int a;
    public final List b;
    public final Object c;

    public pce(gjj gjjVar, List list) {
        this.a = 2;
        this.c = gjjVar;
        this.b = list;
    }

    public static boolean f(cxk cxkVar, cxk cxkVar2) {
        if (cxkVar != null) {
            rvo rvoVar = cxkVar.b;
            if (cxkVar2 != null) {
                rvo rvoVar2 = cxkVar2.b;
                tvo y = bvf0.y(rvoVar);
                if (y != null) {
                    y.k = true;
                }
                tvo y2 = bvf0.y(rvoVar2);
                if (y2 != null) {
                    y2.k = true;
                }
                boolean a = cxkVar.a.a(cxkVar2.a, rvoVar, rvoVar2);
                tvo y3 = bvf0.y(rvoVar);
                if (y3 != null) {
                    y3.k = false;
                }
                tvo y4 = bvf0.y(rvoVar2);
                if (y4 == null) {
                    return a;
                }
                y4.k = false;
                return a;
            }
        }
        return jl40.l(cxkVar, cxkVar2);
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        int i3 = this.a;
        List list = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                return jl40.l(list.get(i), ((ArrayList) obj).get(i2));
            case 1:
                return f((cxk) a.S(i, list), (cxk) a.S(i2, (ArrayList) obj));
            default:
                gjj gjjVar = (gjj) obj;
                Object S = a.S(i, list);
                if (S == null) {
                    z83.i();
                }
                if (S != null) {
                    Object S2 = a.S(i2, gjjVar.c);
                    if (S2 == null) {
                        z83.i();
                    }
                    if (S2 != null) {
                        return gjjVar.a.a(S, S2);
                    }
                }
                return false;
        }
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        m3k m3kVar;
        egk d;
        Expression g;
        m3k m3kVar2;
        egk d2;
        Expression g2;
        int i3 = this.a;
        List list = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                fde fdeVar = (fde) list.get(i);
                fde fdeVar2 = (fde) ((ArrayList) obj).get(i2);
                return ((fdeVar instanceof dde) && (fdeVar2 instanceof dde) && jl40.l(((dde) fdeVar).a, ((dde) fdeVar2).a)) || ((fdeVar instanceof ede) && (fdeVar2 instanceof ede) && jl40.l(((ede) fdeVar).a, ((ede) fdeVar2).a));
            case 1:
                cxk cxkVar = (cxk) a.S(i, list);
                cxk cxkVar2 = (cxk) a.S(i2, (ArrayList) obj);
                String str = null;
                String str2 = (cxkVar == null || (m3kVar2 = cxkVar.a) == null || (d2 = m3kVar2.d()) == null || (g2 = d2.g()) == null) ? null : (String) g2.a(cxkVar.b);
                if (cxkVar2 != null && (m3kVar = cxkVar2.a) != null && (d = m3kVar.d()) != null && (g = d.g()) != null) {
                    str = (String) g.a(cxkVar2.b);
                }
                return (str2 == null && str == null) ? f(cxkVar, cxkVar2) : jl40.l(str2, str);
            default:
                gjj gjjVar = (gjj) obj;
                Object S = a.S(i, list);
                if (S == null) {
                    z83.i();
                }
                if (S == null) {
                    return false;
                }
                Object S2 = a.S(i2, gjjVar.c);
                if (S2 == null) {
                    z83.i();
                }
                if (S2 == null) {
                    return false;
                }
                return gjjVar.a.b(S, S2);
        }
    }

    @Override // defpackage.xij
    public Object c(int i, int i2) {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.c(i, i2);
        }
    }

    @Override // defpackage.xij
    public final int d() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ArrayList) obj).size();
            case 1:
                return ((ArrayList) obj).size();
            default:
                return ((gjj) obj).c.size();
        }
    }

    @Override // defpackage.xij
    public final int e() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public /* synthetic */ pce(List list, ArrayList arrayList, int i) {
        this.a = i;
        this.b = list;
        this.c = arrayList;
    }
}
