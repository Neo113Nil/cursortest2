package xsna;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* compiled from: MergingCuesResolver.java */
/* loaded from: classes12.dex */
public final class j920 implements vkk {
    public static final zvi c;
    public final ArrayList b = new ArrayList();

    static {
        hw50 hw50Var = hw50.b;
        io.reactivex.rxjava3.processors.b bVar = new io.reactivex.rxjava3.processors.b(22);
        hw50Var.getClass();
        lt8 lt8Var = new lt8(bVar, hw50Var);
        bgg0 bgg0Var = bgg0.b;
        io.reactivex.rxjava3.subjects.b bVar2 = new io.reactivex.rxjava3.subjects.b(25);
        bgg0Var.getClass();
        c = new zvi(lt8Var, new lt8(bVar2, bgg0Var));
    }

    @Override // xsna.vkk
    public final boolean a(wkk wkkVar, long j) {
        long j2 = wkkVar.b;
        fxc0.p(j2 != C.TIME_UNSET);
        fxc0.p(wkkVar.c != C.TIME_UNSET);
        boolean z = j2 <= j && j < wkkVar.d;
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((wkk) arrayList.get(size)).b) {
                arrayList.add(size + 1, wkkVar);
                return z;
            }
        }
        arrayList.add(0, wkkVar);
        return z;
    }

    @Override // xsna.vkk
    public final ImmutableList<rkk> c(long j) {
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            if (j >= ((wkk) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    wkk wkkVar = (wkk) arrayList.get(i);
                    if (j >= wkkVar.b && j < wkkVar.d) {
                        arrayList2.add(wkkVar);
                    }
                    if (j < wkkVar.b) {
                        break;
                    }
                }
                com.google.common.collect.g u = ImmutableList.u(c, arrayList2);
                ImmutableList.a aVar = new ImmutableList.a();
                for (int i2 = 0; i2 < u.e; i2++) {
                    aVar.e(((wkk) u.get(i2)).a);
                }
                return aVar.g();
            }
        }
        ImmutableList.b bVar = ImmutableList.c;
        return com.google.common.collect.g.f;
    }

    @Override // xsna.vkk
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.vkk
    public final long d(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((wkk) arrayList.get(i)).b;
            long j4 = ((wkk) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == C.TIME_UNSET ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == C.TIME_UNSET ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // xsna.vkk
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((wkk) arrayList.get(i)).b;
            if (j > j2 && j > ((wkk) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // xsna.vkk
    public final long f(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j < ((wkk) arrayList.get(0)).b) {
            return C.TIME_UNSET;
        }
        long j2 = ((wkk) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((wkk) arrayList.get(i)).b;
            long j4 = ((wkk) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }
}
