package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class lfc extends skx {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lfc(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        int i;
        float f2;
        int i2;
        switch (this.i) {
            case 0:
                return Integer.valueOf(m(rkxVar, f));
            default:
                Object obj = rkxVar.b;
                if (obj == null) {
                    ny61.r("Missing values for keyframe.");
                    return null;
                }
                Object obj2 = rkxVar.c;
                if (obj2 == null) {
                    if (rkxVar.k == 784923401) {
                        rkxVar.k = ((Integer) obj).intValue();
                    }
                    i = rkxVar.k;
                } else {
                    if (rkxVar.l == 784923401) {
                        rkxVar.l = ((Integer) obj2).intValue();
                    }
                    i = rkxVar.l;
                }
                puz puzVar = this.e;
                if (puzVar != null) {
                    f2 = f;
                    Integer num = (Integer) puzVar.b(rkxVar.g, rkxVar.h.floatValue(), (Integer) obj, Integer.valueOf(i), f2, e(), this.d);
                    if (num != null) {
                        i2 = num.intValue();
                        return Integer.valueOf(i2);
                    }
                } else {
                    f2 = f;
                }
                if (rkxVar.k == 784923401) {
                    rkxVar.k = ((Integer) obj).intValue();
                }
                int i3 = rkxVar.k;
                PointF pointF = ti20.a;
                i2 = (int) ((f2 * (i - i3)) + i3);
                return Integer.valueOf(i2);
        }
    }

    public int m(rkx rkxVar, float f) {
        float f2;
        Float f3;
        Object obj = rkxVar.b;
        Object obj2 = rkxVar.b;
        if (obj == null || rkxVar.c == null) {
            ny61.r("Missing values for keyframe.");
            return 0;
        }
        puz puzVar = this.e;
        if (puzVar == null || (f3 = rkxVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) puzVar.b(rkxVar.g, f3.floatValue(), (Integer) obj2, (Integer) rkxVar.c, f2, e(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return xss.c(ti20.b(f2, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) rkxVar.c).intValue());
    }
}
