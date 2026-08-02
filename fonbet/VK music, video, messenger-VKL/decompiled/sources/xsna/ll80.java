package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: OneVideoLegacySubtitleUtil.java */
/* loaded from: classes8.dex */
public final class ll80 {
    public static void a(fo80 fo80Var, int i, j7j j7jVar) {
        long eventTime = fo80Var.getEventTime(i);
        List<rkk> cues = fo80Var.getCues(eventTime);
        if (((ArrayList) cues).isEmpty()) {
            return;
        }
        if (i == fo80Var.d.length - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = fo80Var.getEventTime(i + 1) - fo80Var.getEventTime(i);
        if (eventTime2 > 0) {
            j7jVar.accept(new wkk(cues, eventTime, eventTime2));
        }
    }
}
