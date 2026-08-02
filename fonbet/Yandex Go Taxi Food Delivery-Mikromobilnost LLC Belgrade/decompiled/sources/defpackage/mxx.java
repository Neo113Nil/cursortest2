package defpackage;

import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class mxx {
    public final List a;
    public final nsz b;
    public final String c;
    public final long d;
    public final Layer$LayerType e;
    public final long f;
    public final String g;
    public final List h;
    public final ge2 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final ae2 q;
    public final lb7 r;
    public final be2 s;
    public final List t;
    public final Layer$MatteType u;
    public final boolean v;
    public final cot w;
    public final oo2 x;
    public final LBlendMode y;

    public mxx(List list, nsz nszVar, String str, long j, Layer$LayerType layer$LayerType, long j2, String str2, List list2, ge2 ge2Var, int i, int i2, int i3, float f, float f2, float f3, float f4, ae2 ae2Var, lb7 lb7Var, List list3, Layer$MatteType layer$MatteType, be2 be2Var, boolean z, cot cotVar, oo2 oo2Var, LBlendMode lBlendMode) {
        this.a = list;
        this.b = nszVar;
        this.c = str;
        this.d = j;
        this.e = layer$LayerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = ge2Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = ae2Var;
        this.r = lb7Var;
        this.t = list3;
        this.u = layer$MatteType;
        this.s = be2Var;
        this.v = z;
        this.w = cotVar;
        this.x = oo2Var;
        this.y = lBlendMode;
    }

    public final String a(String str) {
        int i;
        StringBuilder t = qv10.t(str);
        t.append(this.c);
        t.append("\n");
        long j = this.f;
        nsz nszVar = this.b;
        mxx mxxVar = (mxx) nszVar.i.c(j);
        if (mxxVar != null) {
            t.append("\t\tParents: ");
            t.append(mxxVar.c);
            for (mxx mxxVar2 = (mxx) nszVar.i.c(mxxVar.f); mxxVar2 != null; mxxVar2 = (mxx) nszVar.i.c(mxxVar2.f)) {
                t.append("->");
                t.append(mxxVar2.c);
            }
            t.append(str);
            t.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            t.append(str);
            t.append("\tMasks: ");
            t.append(list.size());
            t.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            t.append(str);
            t.append("\tBackground: ");
            t.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            t.append(str);
            t.append("\tShapes:\n");
            for (Object obj : list2) {
                t.append(str);
                t.append("\t\t");
                t.append(obj);
                t.append("\n");
            }
        }
        return t.toString();
    }

    public final String toString() {
        return a("");
    }
}
