package defpackage;

import com.yandex.div.core.downloader.a;
import com.yandex.div.json.expressions.Expression;
import flex.section.divkit.DivkitSnippet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = hvl.class)
/* loaded from: classes9.dex */
public final class cvl extends pyp0 implements rr10, h621 {
    public static final bvl Companion = new bvl();
    public final String a;
    public final boolean b;
    public final List c;
    public final DivkitSnippet d;
    public final DivkitSnippet e;
    public final x1q0 f;
    public final syp0 g;
    public final mw5 h;
    public final String i;
    public boolean j;

    public cvl(String str, boolean z, List list, DivkitSnippet divkitSnippet, DivkitSnippet divkitSnippet2, x1q0 x1q0Var, syp0 syp0Var, mw5 mw5Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = divkitSnippet;
        this.e = divkitSnippet2;
        this.f = x1q0Var;
        this.g = syp0Var;
        this.h = mw5Var;
        this.i = str2;
    }

    public static LinkedHashMap e(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            linkedHashMap.put(((DivkitSnippet) obj).a, Integer.valueOf(i));
            i = i2;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    public static cvl f(cvl cvlVar, ArrayList arrayList, DivkitSnippet divkitSnippet, DivkitSnippet divkitSnippet2, mw5 mw5Var, int i) {
        String str = cvlVar.a;
        boolean z = cvlVar.b;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = cvlVar.c;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 8) != 0) {
            divkitSnippet = cvlVar.d;
        }
        DivkitSnippet divkitSnippet3 = divkitSnippet;
        if ((i & 16) != 0) {
            divkitSnippet2 = cvlVar.e;
        }
        DivkitSnippet divkitSnippet4 = divkitSnippet2;
        x1q0 x1q0Var = cvlVar.f;
        syp0 syp0Var = cvlVar.g;
        if ((i & 128) != 0) {
            mw5Var = cvlVar.h;
        }
        return new cvl(str, z, arrayList3, divkitSnippet3, divkitSnippet4, x1q0Var, syp0Var, mw5Var, cvlVar.i);
    }

    @Override // defpackage.h621
    public final pyp0 a(pyp0 pyp0Var) {
        n5o n5oVar;
        omk omkVar;
        omk omkVar2;
        if (!(pyp0Var instanceof cvl)) {
            return this;
        }
        List list = this.c;
        ArrayList arrayList = new ArrayList(list);
        LinkedHashMap e = e(list);
        for (DivkitSnippet divkitSnippet : ((cvl) pyp0Var).c) {
            String str = divkitSnippet.a;
            q5o q5oVar = divkitSnippet.j;
            Integer num = (Integer) e.get(str);
            if (num != null) {
                if ((q5oVar != null ? q5oVar.a : null) != null) {
                    DivkitSnippet divkitSnippet2 = (DivkitSnippet) arrayList.get(num.intValue());
                    int intValue = num.intValue();
                    x1q0 x1q0Var = gvl.a;
                    if (q5oVar != null && (n5oVar = divkitSnippet2.b) != null && (omkVar = n5oVar.a) != null) {
                        g3l g3lVar = new g3l(q5oVar.a);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList g = new a(g3lVar, new rmk(arrayList2, 0)).g(omkVar.c, rvo.a);
                        if (g == null) {
                            omkVar2 = null;
                        } else {
                            String str2 = omkVar.b;
                            List list2 = omkVar.d;
                            Expression expression = omkVar.e;
                            List list3 = omkVar.f;
                            List list4 = omkVar.g;
                            boolean isEmpty = arrayList2.isEmpty();
                            List list5 = omkVar.h;
                            if (!isEmpty) {
                                if (list5 == null) {
                                    list5 = EmptyList.a;
                                }
                                list5 = kotlin.collections.a.m0(arrayList2, list5);
                            }
                            omkVar2 = new omk(null, str2, g, list2, expression, list3, list4, list5, 1);
                        }
                        if (omkVar2 != null) {
                            n5o n5oVar2 = new n5o(omkVar2, new c(b.n(divkitSnippet2.b.b, q5oVar.b)));
                            Map map = divkitSnippet2.c;
                            if (map == null) {
                                map = b.f();
                            }
                            Map map2 = divkitSnippet.c;
                            if (map2 == null) {
                                map2 = b.f();
                            }
                            divkitSnippet2 = DivkitSnippet.a(divkitSnippet2, null, n5oVar2, b.n(map, map2), 8185);
                        }
                    }
                    arrayList.set(intValue, divkitSnippet2);
                } else {
                    arrayList.remove(num.intValue());
                    arrayList.add(num.intValue(), divkitSnippet);
                }
            }
        }
        return f(this, arrayList, null, null, null, 507);
    }

    @Override // defpackage.rr10
    public final pyp0 b(pyp0 pyp0Var) {
        if (!(pyp0Var instanceof cvl)) {
            return this;
        }
        List list = this.c;
        ArrayList arrayList = new ArrayList(list);
        LinkedHashMap e = e(list);
        cvl cvlVar = (cvl) pyp0Var;
        for (DivkitSnippet divkitSnippet : cvlVar.c) {
            Integer num = (Integer) e.get(divkitSnippet.a);
            if (num != null) {
                arrayList.remove(num.intValue());
                arrayList.add(num.intValue(), divkitSnippet);
            } else {
                arrayList.add(divkitSnippet);
            }
        }
        return f(this, arrayList, cvlVar.d, cvlVar.e, cvlVar.h, 355);
    }

    @Override // defpackage.pyp0
    /* renamed from: c */
    public final String getB() {
        return this.a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d */
    public final boolean getC() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cvl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        cvl cvlVar = (cvl) obj;
        return jl40.l(this.a, cvlVar.a) && this.b == cvlVar.b && jl40.l(this.c, cvlVar.c) && jl40.l(this.d, cvlVar.d) && jl40.l(this.e, cvlVar.e) && jl40.l(this.f, cvlVar.f) && jl40.l(this.g, cvlVar.g) && jl40.l(this.h, cvlVar.h) && jl40.l(this.i, cvlVar.i);
    }

    public final cvl g() {
        DivkitSnippet divkitSnippet = this.e;
        if (divkitSnippet == null) {
            return this;
        }
        cvl f = f(this, null, null, DivkitSnippet.a(divkitSnippet, this.a + "_" + System.currentTimeMillis(), null, null, 8190), null, 495);
        f.j = true;
        return f;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        DivkitSnippet divkitSnippet = this.d;
        int hashCode = (c + (divkitSnippet != null ? divkitSnippet.hashCode() : 0)) * 31;
        DivkitSnippet divkitSnippet2 = this.e;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (divkitSnippet2 != null ? divkitSnippet2.hashCode() : 0)) * 31)) * 31)) * 31;
        mw5 mw5Var = this.h;
        int hashCode3 = (hashCode2 + (mw5Var != null ? mw5Var.hashCode() : 0)) * 31;
        String str = this.i;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("DivkitSection(id='", this.a, "', reloadable=", ", content=", this.b);
        l.append(this.c);
        l.append(", loadingSnippet=");
        l.append(this.d);
        l.append(", errorSnippet=");
        l.append(this.e);
        l.append(", layout=");
        l.append(this.f);
        l.append(", appearance=");
        l.append(this.g);
        l.append(", bindingMethod=");
        l.append(this.h);
        l.append(", origType=");
        return oyr.t(l, this.i, Extension.C_BRAKE);
    }
}
