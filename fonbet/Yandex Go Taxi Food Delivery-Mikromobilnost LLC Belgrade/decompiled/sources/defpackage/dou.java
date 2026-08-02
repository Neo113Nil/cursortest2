package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class dou implements xyl0 {
    public final int a;
    public final hou b;
    public int c = -1;

    public dou(hou houVar, int i) {
        this.b = houVar;
        this.a = i;
    }

    public final void a() {
        d6z.l(this.c == -1);
        hou houVar = this.b;
        houVar.q();
        houVar.f0.getClass();
        int[] iArr = houVar.f0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (houVar.e0.contains(houVar.d0.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = houVar.i0;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.c = i2;
    }

    @Override // defpackage.xyl0
    public final void b() {
        int i = this.c;
        hou houVar = this.b;
        if (i == -2) {
            houVar.q();
            throw new SampleQueueMappingException(oyr.p("Unable to bind a sample queue to TrackGroup with MIME type ", houVar.d0.a(this.a).d[0].n, Extension.DOT_CHAR));
        }
        if (i == -1) {
            houVar.D();
        } else if (i != -3) {
            houVar.D();
            houVar.O[i].v();
        }
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.c;
        hou houVar = this.b;
        return !houVar.z() && houVar.O[i].t(houVar.o0);
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        a aVar;
        if (this.c == -3) {
            nygVar.a(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            hou houVar = this.b;
            ArrayList arrayList = houVar.G;
            if (!houVar.z()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((lnu) arrayList.get(i4)).D;
                        int length = houVar.O.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (houVar.i0[i6] && houVar.O[i6].x() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    tw21.b0(0, i4, arrayList);
                    lnu lnuVar = (lnu) arrayList.get(0);
                    a aVar2 = lnuVar.w;
                    if (!aVar2.equals(houVar.b0)) {
                        houVar.D.b(houVar.b, aVar2, lnuVar.x, lnuVar.y, lnuVar.z);
                    }
                    houVar.b0 = aVar2;
                }
                if (arrayList.isEmpty() || ((lnu) arrayList.get(0)).f0) {
                    int y = houVar.O[i2].y(o7sVar, nygVar, i, houVar.o0);
                    if (y == -5) {
                        a aVar3 = o7sVar.b;
                        aVar3.getClass();
                        if (i2 == houVar.U) {
                            int b = com.google.common.primitives.a.b(houVar.O[i2].x());
                            while (i3 < arrayList.size() && ((lnu) arrayList.get(i3)).D != b) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                aVar = ((lnu) arrayList.get(i3)).w;
                            } else {
                                aVar = houVar.a0;
                                aVar.getClass();
                            }
                            aVar3 = aVar3.d(aVar);
                        }
                        o7sVar.b = aVar3;
                    }
                    return y;
                }
            }
        }
        return -3;
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i = this.c;
        hou houVar = this.b;
        if (houVar.z()) {
            return 0;
        }
        gou gouVar = houVar.O[i];
        int r = gouVar.r(j, houVar.o0);
        ArrayList arrayList = houVar.G;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = unr0.k(1, arrayList);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        lnu lnuVar = (lnu) obj;
        if (lnuVar != null && !lnuVar.f0) {
            r = Math.min(r, lnuVar.f(i) - gouVar.p());
        }
        gouVar.D(r);
        return r;
    }
}
