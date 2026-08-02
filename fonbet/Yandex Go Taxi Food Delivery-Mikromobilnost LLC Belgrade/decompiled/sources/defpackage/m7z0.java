package defpackage;

import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramDivViewHolder;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class m7z0 implements jms {
    public final /* synthetic */ TimeSlotHistogramDivViewHolder a;

    public m7z0(TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder) {
        this.a = timeSlotHistogramDivViewHolder;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m7z0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, TimeSlotHistogramDivViewHolder.class, "onSlotItemClicked", "onSlotItemClicked(ILcom/yandex/go/feed/global/div/custom/time_slot_histogram/TimeSlotHistogramProperties$SlotProperties;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
