package androidx.compose.ui.input.pointer;

import defpackage.e530;
import defpackage.ee60;
import defpackage.gy40;
import defpackage.jl40;
import defpackage.rnz;
import defpackage.rzx;
import defpackage.sls;
import defpackage.tis0;
import defpackage.wz40;
import defpackage.xd60;
import defpackage.xy40;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public final rzx a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final xy40 f = new xy40((Object) null);
    public final ee60 g = new ee60();
    public final gy40 h = new gy40(10);

    public a(rzx rzxVar) {
        this.a = rzxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(boolean z, long j, List list) {
        gy40 gy40Var;
        long[] jArr;
        long[] jArr2;
        int i;
        xd60 xd60Var;
        xd60 xd60Var2;
        int size = list.size();
        ee60 ee60Var = this.g;
        ee60 ee60Var2 = ee60Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            gy40Var = this.h;
            if (i2 >= size) {
                break;
            }
            final e530 e530Var = (e530) list.get(i2);
            if (e530Var.isAttached()) {
                e530Var.setDetachedListener$ui(new sls() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        a.this.d(e530Var);
                        return zy11.a;
                    }
                });
                if (z2) {
                    wz40 wz40Var = ee60Var2.a;
                    ?? r15 = wz40Var.a;
                    int i3 = wz40Var.c;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            xd60Var2 = 0;
                            break;
                        }
                        xd60Var2 = r15[i4];
                        if (jl40.l(((xd60) xd60Var2).c, e530Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    xd60Var = xd60Var2;
                    if (xd60Var != null) {
                        xd60Var.i = true;
                        xd60Var.d.a(j);
                        if (z) {
                            Object e = gy40Var.e(j);
                            if (e == null) {
                                e = new xy40((Object) null);
                                gy40Var.h(j, e);
                            }
                            ((xy40) e).g(xd60Var);
                        }
                        ee60Var2 = xd60Var;
                    } else {
                        z2 = false;
                    }
                }
                xd60Var = new xd60(e530Var);
                xd60Var.d.a(j);
                if (z) {
                    Object e2 = gy40Var.e(j);
                    if (e2 == null) {
                        e2 = new xy40((Object) null);
                        gy40Var.h(j, e2);
                    }
                    ((xy40) e2).g(xd60Var);
                }
                ee60Var2.a.b(xd60Var);
                ee60Var2 = xd60Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = gy40Var.b;
            Object[] objArr = gy40Var.c;
            long[] jArr4 = gy40Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                xy40 xy40Var = (xy40) objArr[i9];
                                wz40 wz40Var2 = ee60Var.a;
                                i = i6;
                                Object[] objArr2 = wz40Var2.a;
                                int i10 = wz40Var2.c;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((xd60) objArr2[i11]).f(j3, xy40Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        gy40Var.a();
    }

    public final boolean b(tis0 tis0Var, boolean z) {
        rnz L = tis0Var.L();
        rzx rzxVar = this.a;
        ee60 ee60Var = this.g;
        boolean a = ee60Var.a(L, rzxVar, tis0Var, z);
        wz40 wz40Var = ee60Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((xd60) objArr[i2]).e(tis0Var, z) || z3;
        }
        Object[] objArr2 = wz40Var.a;
        int i3 = wz40Var.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((xd60) objArr2[i4]).d(tis0Var) || z4;
        }
        ee60Var.b(tis0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            xy40 xy40Var = this.f;
            int i5 = xy40Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((e530) xy40Var.b(i6));
            }
            xy40Var.j();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            ee60Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        ee60 ee60Var = this.g;
        wz40 wz40Var = ee60Var.a;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((xd60) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            ee60Var.a.g();
        }
    }

    public final void d(e530 e530Var) {
        if (this.b) {
            this.e = true;
            this.f.g(e530Var);
            return;
        }
        ee60 ee60Var = this.g;
        xy40 xy40Var = ee60Var.b;
        xy40Var.j();
        xy40Var.g(ee60Var);
        while (xy40Var.e()) {
            ee60 ee60Var2 = (ee60) xy40Var.m(xy40Var.b - 1);
            int i = 0;
            while (true) {
                wz40 wz40Var = ee60Var2.a;
                if (i < wz40Var.c) {
                    xd60 xd60Var = (xd60) wz40Var.a[i];
                    if (jl40.l(xd60Var.c, e530Var)) {
                        ee60Var2.a.j(xd60Var);
                        xd60Var.c();
                    } else {
                        xy40Var.g(xd60Var);
                        i++;
                    }
                }
            }
        }
    }
}
