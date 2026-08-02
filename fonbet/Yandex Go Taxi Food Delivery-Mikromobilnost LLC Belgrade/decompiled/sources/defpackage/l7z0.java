package defpackage;

import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramDivViewHolder;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class l7z0 implements Runnable {
    public final /* synthetic */ TimeSlotHistogramDivViewHolder a;

    public l7z0(TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder) {
        this.a = timeSlotHistogramDivViewHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        r7z0 r7z0Var;
        boolean z;
        r7z0 r7z0Var2;
        TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder = this.a;
        i = timeSlotHistogramDivViewHolder.pendingCenteredPosition;
        if (i == -1) {
            return;
        }
        i2 = timeSlotHistogramDivViewHolder.pendingCenteredPosition;
        i3 = timeSlotHistogramDivViewHolder.pendingClickTargetPosition;
        if (i3 == -1 || i2 == i3) {
            r7z0Var = timeSlotHistogramDivViewHolder.recyclerViewAdapter;
            r7z0Var.f(i2, false);
            z = timeSlotHistogramDivViewHolder.onScrollActionEnabled;
            if (z) {
                r7z0Var2 = timeSlotHistogramDivViewHolder.recyclerViewAdapter;
                p7z0 p7z0Var = (p7z0) a.S(i2, r7z0Var2.w);
                if (p7z0Var != null) {
                    timeSlotHistogramDivViewHolder.fireAction(p7z0Var);
                }
            }
        }
    }
}
