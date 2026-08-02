package xsna;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: CuesWithTimingSubtitle.java */
/* loaded from: classes12.dex */
public final class xkk implements m0n0 {
    public static final lt8 d;
    public final ImmutableList<ImmutableList<rkk>> b;
    public final long[] c;

    static {
        hw50 hw50Var = hw50.b;
        iq iqVar = new iq(7);
        hw50Var.getClass();
        d = new lt8(iqVar, hw50Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xkk(com.google.common.collect.g gVar) {
        int i = gVar.e;
        int i2 = 0;
        if (i == 1) {
            ImmutableList.b listIterator = gVar.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && listIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                    i2++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            wkk wkkVar = (wkk) next;
            long j = wkkVar.b;
            ImmutableList<rkk> immutableList = wkkVar.a;
            long j2 = wkkVar.c;
            long j3 = j == C.TIME_UNSET ? 0L : j;
            if (j2 == C.TIME_UNSET) {
                this.b = ImmutableList.p(immutableList);
                this.c = new long[]{j3};
                return;
            } else {
                ImmutableList.b bVar = ImmutableList.c;
                this.b = ImmutableList.q(immutableList, com.google.common.collect.g.f);
                this.c = new long[]{j3, j2 + j3};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.c = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        com.google.common.collect.g u = ImmutableList.u(d, gVar);
        int i3 = 0;
        while (i2 < u.e) {
            wkk wkkVar2 = (wkk) u.get(i2);
            long j4 = wkkVar2.b;
            long j5 = wkkVar2.c;
            ImmutableList<rkk> immutableList2 = wkkVar2.a;
            j4 = j4 == C.TIME_UNSET ? 0L : j4;
            long j6 = j4 + j5;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j7 = this.c[i4];
                if (j7 >= j4) {
                    if (j7 == j4 && ((ImmutableList) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, immutableList2);
                    } else {
                        ahn.F("Truncating unsupported overlapping cues.");
                        this.c[i4] = j4;
                        arrayList.set(i4, immutableList2);
                    }
                    if (j5 == C.TIME_UNSET) {
                        this.c[i3] = j6;
                        arrayList.add(com.google.common.collect.g.f);
                        i3++;
                    }
                    i2++;
                }
            }
            this.c[i3] = j4;
            arrayList.add(immutableList2);
            i3++;
            if (j5 == C.TIME_UNSET) {
            }
            i2++;
        }
        this.b = ImmutableList.m(arrayList);
    }

    @Override // xsna.m0n0
    public final List getCues(long j) {
        int f = y2r0.f(this.c, j, false);
        if (f != -1) {
            return this.b.get(f);
        }
        ImmutableList.b bVar = ImmutableList.c;
        return com.google.common.collect.g.f;
    }

    @Override // xsna.m0n0
    public final long getEventTime(int i) {
        fxc0.p(i < this.b.size());
        return this.c[i];
    }

    @Override // xsna.m0n0
    public final int getEventTimeCount() {
        return this.b.size();
    }

    @Override // xsna.m0n0
    public final int getNextEventTimeIndex(long j) {
        int b = y2r0.b(this.c, j, false);
        if (b < this.b.size()) {
            return b;
        }
        return -1;
    }
}
