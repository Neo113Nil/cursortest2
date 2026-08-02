package androidx.compose.foundation.lazy.layout;

import defpackage.b64;
import defpackage.by40;
import defpackage.d6w;
import defpackage.kp60;
import defpackage.lxv;
import defpackage.p9b1;
import defpackage.qy40;
import defpackage.suw;
import defpackage.tls;
import defpackage.wz40;

/* loaded from: classes10.dex */
public final class h {
    public final qy40 a;
    public final Object[] b;
    public final int c;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (r9 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(d6w d6wVar, a aVar) {
        Object defaultLazyKey;
        by40 d = aVar.d();
        int i = d6wVar.a;
        if (i < 0) {
            lxv.c("negative nearestRange.first");
        }
        int min = Math.min(d6wVar.b, d.b - 1);
        if (min < i) {
            this.a = kp60.a;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        qy40 qy40Var = new qy40(i2);
        wz40 wz40Var = d.a;
        if (i < 0 || i >= d.b) {
            StringBuilder t = b64.t(i, "Index ", ", size ");
            t.append(d.b);
            lxv.e(t.toString());
        }
        if (min < 0 || min >= d.b) {
            StringBuilder t2 = b64.t(min, "Index ", ", size ");
            t2.append(d.b);
            lxv.e(t2.toString());
        }
        if (min < i) {
            lxv.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int e = p9b1.e(i, wz40Var);
        int i3 = ((suw) wz40Var.a[e]).a;
        while (i3 <= min) {
            suw suwVar = (suw) wz40Var.a[e];
            tls key = suwVar.c.getKey();
            int i4 = suwVar.a;
            int max = Math.max(i, i4);
            int min2 = Math.min(min, (suwVar.b + i4) - 1);
            if (max <= min2) {
                while (true) {
                    if (key != null) {
                        defaultLazyKey = key.invoke(Integer.valueOf(max - i4));
                    }
                    defaultLazyKey = new DefaultLazyKey(max);
                    qy40Var.g(defaultLazyKey, max);
                    this.b[max - this.c] = defaultLazyKey;
                    max = max != min2 ? max + 1 : max;
                }
            }
            i3 += suwVar.b;
            e++;
        }
        this.a = qy40Var;
    }

    public final int a(Object obj) {
        qy40 qy40Var = this.a;
        int d = qy40Var.d(obj);
        if (d >= 0) {
            return qy40Var.c[d];
        }
        return -1;
    }

    public final Object b(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }
}
