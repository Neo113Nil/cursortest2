package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import xsna.a1n0;

/* compiled from: LegacySubtitleUtil.java */
/* loaded from: classes12.dex */
public final class i1z {
    public static void a(m0n0 m0n0Var, int i, j7j<wkk> j7jVar) {
        long eventTime = m0n0Var.getEventTime(i);
        List<rkk> cues = m0n0Var.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == m0n0Var.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = m0n0Var.getEventTime(i + 1) - m0n0Var.getEventTime(i);
        if (eventTime2 > 0) {
            j7jVar.accept(new wkk(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(m0n0 m0n0Var, a1n0.b bVar, j7j<wkk> j7jVar) {
        int nextEventTimeIndex;
        boolean z;
        int i;
        long j = bVar.a;
        if (j == C.TIME_UNSET) {
            nextEventTimeIndex = 0;
        } else {
            nextEventTimeIndex = m0n0Var.getNextEventTimeIndex(j);
            if (nextEventTimeIndex == -1) {
                nextEventTimeIndex = m0n0Var.getEventTimeCount();
            }
            if (nextEventTimeIndex > 0 && m0n0Var.getEventTime(nextEventTimeIndex - 1) == j) {
                nextEventTimeIndex--;
            }
        }
        if (j != C.TIME_UNSET && nextEventTimeIndex < m0n0Var.getEventTimeCount()) {
            List<rkk> cues = m0n0Var.getCues(j);
            long eventTime = m0n0Var.getEventTime(nextEventTimeIndex);
            if (!cues.isEmpty()) {
                long j2 = bVar.a;
                if (j2 < eventTime) {
                    j7jVar.accept(new wkk(cues, j2, eventTime - j2));
                    z = true;
                    for (i = nextEventTimeIndex; i < m0n0Var.getEventTimeCount(); i++) {
                        a(m0n0Var, i, j7jVar);
                    }
                    if (bVar.b) {
                        return;
                    }
                    if (z) {
                        nextEventTimeIndex--;
                    }
                    for (int i2 = 0; i2 < nextEventTimeIndex; i2++) {
                        a(m0n0Var, i2, j7jVar);
                    }
                    if (z) {
                        j7jVar.accept(new wkk(m0n0Var.getCues(j), m0n0Var.getEventTime(nextEventTimeIndex), j - m0n0Var.getEventTime(nextEventTimeIndex)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < m0n0Var.getEventTimeCount()) {
        }
        if (bVar.b) {
        }
    }
}
