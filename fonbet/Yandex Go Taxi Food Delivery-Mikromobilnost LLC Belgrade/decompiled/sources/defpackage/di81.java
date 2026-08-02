package defpackage;

import java.util.ArrayList;
import java.util.List;
import yads.po;

/* loaded from: classes7.dex */
public final class di81 {
    public final ca71 a;
    public final mn71 b;
    public final int[] c;
    public final int d;
    public final u871 e;
    public final long f;
    public final int g;
    public final ds81 h;
    public final sj8[] i;
    public gk71 j;
    public dh81 k;
    public int l;
    public po m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [di81, java.lang.Object] */
    public di81(su71 su71Var, ca71 ca71Var, dh81 dh81Var, mn71 mn71Var, int i, int[] iArr, gk71 gk71Var, int i2, u871 u871Var, long j, int i3, boolean z, ArrayList arrayList, ds81 ds81Var) {
        uz71 uz71Var;
        ?? obj = new Object();
        obj.a = ca71Var;
        obj.k = dh81Var;
        obj.b = mn71Var;
        obj.c = iArr;
        obj.j = gk71Var;
        obj.d = i2;
        obj.e = u871Var;
        obj.l = i;
        obj.f = j;
        obj.g = i3;
        obj.h = ds81Var;
        long g = rf71.g(dh81Var.a(i));
        List list = ((ey71) obj.k.m.get(obj.l)).c;
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        for (int i5 : iArr) {
            arrayList2.addAll(((k881) list.get(i5)).c);
        }
        obj.i = new sj8[gk71Var.g()];
        int i6 = 0;
        di81 di81Var = obj;
        while (i6 < di81Var.i.length) {
            x281 x281Var = (x281) arrayList2.get(gk71Var.e(i6));
            ik71 c = mn71Var.c(x281Var.b);
            sj8[] sj8VarArr = di81Var.i;
            ik71 ik71Var = c == null ? (ik71) x281Var.b.get(i4) : c;
            qd81 qd81Var = x281Var.a;
            su71Var.getClass();
            String str = qd81Var.D;
            if (g681.f(str)) {
                uz71Var = null;
            } else {
                uz71Var = new uz71((str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) ? new if81(1) : new dw81(z ? 4 : 0, arrayList, ds81Var), i2, qd81Var);
            }
            sj8VarArr[i6] = new sj8(g, x281Var, ik71Var, uz71Var, 0L, x281Var.e());
            i6++;
            di81Var = this;
            i4 = 0;
        }
    }
}
