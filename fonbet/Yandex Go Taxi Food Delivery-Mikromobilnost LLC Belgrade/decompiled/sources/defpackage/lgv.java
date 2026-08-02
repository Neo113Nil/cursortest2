package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class lgv {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final kgv j;
    public boolean k;

    public lgv(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? ldc.m : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        kgv kgvVar = new kgv(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = kgvVar;
        arrayList.add(kgvVar);
    }

    public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        if (this.k) {
            ixv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.i.add(new kgv(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, ml6 ml6Var, ml6 ml6Var2, String str, List list) {
        if (this.k) {
            ixv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((kgv) unr0.k(1, this.i)).j.add(new e531(f, f2, f3, f4, f5, f6, f7, i, i2, i3, ml6Var, ml6Var2, str, list));
    }

    public final mgv d() {
        if (this.k) {
            ixv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.i.size() > 1) {
            e();
        }
        kgv kgvVar = this.j;
        mgv mgvVar = new mgv(this.a, this.b, this.c, this.d, this.e, new b531(kgvVar.a, kgvVar.b, kgvVar.c, kgvVar.d, kgvVar.e, kgvVar.f, kgvVar.g, kgvVar.h, kgvVar.i, kgvVar.j), this.f, this.g, this.h);
        this.k = true;
        return mgvVar;
    }

    public final void e() {
        if (this.k) {
            ixv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.i;
        kgv kgvVar = (kgv) arrayList.remove(arrayList.size() - 1);
        ((kgv) unr0.k(1, arrayList)).j.add(new b531(kgvVar.a, kgvVar.b, kgvVar.c, kgvVar.d, kgvVar.e, kgvVar.f, kgvVar.g, kgvVar.h, kgvVar.i, kgvVar.j));
    }
}
