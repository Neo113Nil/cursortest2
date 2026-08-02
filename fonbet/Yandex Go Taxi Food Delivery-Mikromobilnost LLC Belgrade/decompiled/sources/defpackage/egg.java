package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes10.dex */
public class egg implements o5r {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<pxa0> periods;
    public final lhf0 programInformation;
    public final long publishTimeMs;
    public final kvq0 serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    public final kw21 utcTiming;

    public egg(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lhf0 lhf0Var, kw21 kw21Var, kvq0 kvq0Var, Uri uri, List list) {
        this.availabilityStartTimeMs = j;
        this.durationMs = j2;
        this.minBufferTimeMs = j3;
        this.dynamic = z;
        this.minUpdatePeriodMs = j4;
        this.timeShiftBufferDepthMs = j5;
        this.suggestedPresentationDelayMs = j6;
        this.publishTimeMs = j7;
        this.programInformation = lhf0Var;
        this.utcTiming = kw21Var;
        this.location = uri;
        this.serviceDescription = kvq0Var;
        this.periods = list;
    }

    @Override // defpackage.o5r
    public final egg copy(List<StreamKey> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= getPeriodCount()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i) {
                long periodDurationMs = getPeriodDurationMs(i);
                if (periodDurationMs != -9223372036854775807L) {
                    j2 += periodDurationMs;
                }
            } else {
                pxa0 period = getPeriod(i);
                List list2 = period.c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.periodIndex;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.groupIndex;
                    a70 a70Var = (a70) list2.get(i3);
                    List list3 = a70Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((s4j0) list3.get(streamKey.streamIndex));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.periodIndex != i2) {
                            break;
                        }
                    } while (streamKey.groupIndex == i3);
                    j = j2;
                    arrayList2.add(new a70(a70Var.a, a70Var.b, arrayList3, a70Var.d, a70Var.e, a70Var.f));
                    if (streamKey.periodIndex != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new pxa0(period.a, period.b - j, arrayList2, period.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.durationMs;
        return new egg(this.availabilityStartTimeMs, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }

    public final pxa0 getPeriod(int i) {
        return this.periods.get(i);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i) {
        long j;
        long j2;
        if (i == this.periods.size() - 1) {
            j = this.durationMs;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = this.periods.get(i).b;
        } else {
            j = this.periods.get(i + 1).b;
            j2 = this.periods.get(i).b;
        }
        return j - j2;
    }

    public final long getPeriodDurationUs(int i) {
        return tw21.W(getPeriodDurationMs(i));
    }

    @Override // defpackage.o5r
    public /* bridge */ /* synthetic */ Object copy(List list) {
        return copy((List<StreamKey>) list);
    }
}
