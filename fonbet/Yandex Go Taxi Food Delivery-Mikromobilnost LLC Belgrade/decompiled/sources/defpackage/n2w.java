package defpackage;

import android.view.Gravity;
import android.view.View;

/* loaded from: classes10.dex */
public final /* synthetic */ class n2w implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ n2w(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.w = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        rtd rtdVar;
        rtd rtdVar2;
        int i;
        int i2 = this.a;
        Object obj2 = this.w;
        int i3 = this.b;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                View view = (View) obj2;
                t1w t1wVar = (t1w) obj;
                Boolean bool = (Boolean) ((p0u) obj3).invoke(t1wVar);
                int absoluteGravity = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
                view.setPadding(Gravity.isVertical(absoluteGravity) | ((absoluteGravity & 3) == 3) ? t1wVar.a : 0, Gravity.isHorizontal(absoluteGravity) | ((absoluteGravity & 48) == 48) ? t1wVar.b : 0, Gravity.isVertical(absoluteGravity) | ((absoluteGravity & 5) == 5) ? t1wVar.c : 0, Gravity.isHorizontal(absoluteGravity) | ((absoluteGravity & 80) == 80) ? t1wVar.g : 0);
                return bool;
            default:
                aii0 aii0Var = (aii0) obj3;
                qy40 qy40Var = (qy40) obj2;
                rtd rtdVar3 = (rtd) obj;
                if (aii0Var.e == i3 && jl40.l(qy40Var, aii0Var.f) && (rtdVar3 instanceof bud)) {
                    long[] jArr = qy40Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8;
                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((255 & j) < 128) {
                                        int i8 = (i4 << 3) + i7;
                                        Object obj4 = qy40Var.b[i8];
                                        boolean z = qy40Var.c[i8] != i3;
                                        if (z) {
                                            bud budVar = (bud) rtdVar3;
                                            i = i5;
                                            hz40 hz40Var = budVar.z;
                                            ooc.z(hz40Var, obj4, aii0Var);
                                            rtdVar2 = rtdVar3;
                                            if (obj4 instanceof qxi) {
                                                qxi qxiVar = (qxi) obj4;
                                                if (!hz40Var.b(qxiVar)) {
                                                    ooc.A(budVar.C, qxiVar);
                                                }
                                                hz40 hz40Var2 = aii0Var.g;
                                                if (hz40Var2 != null) {
                                                    hz40Var2.m(obj4);
                                                }
                                            }
                                        } else {
                                            rtdVar2 = rtdVar3;
                                            i = i5;
                                        }
                                        if (z) {
                                            qy40Var.f(i8);
                                        }
                                    } else {
                                        rtdVar2 = rtdVar3;
                                        i = i5;
                                    }
                                    j >>= i;
                                    i7++;
                                    i5 = i;
                                    rtdVar3 = rtdVar2;
                                }
                                rtdVar = rtdVar3;
                                if (i6 != i5) {
                                }
                            } else {
                                rtdVar = rtdVar3;
                            }
                            if (i4 != length) {
                                i4++;
                                rtdVar3 = rtdVar;
                            }
                        }
                    }
                }
                return zy11.a;
        }
    }
}
