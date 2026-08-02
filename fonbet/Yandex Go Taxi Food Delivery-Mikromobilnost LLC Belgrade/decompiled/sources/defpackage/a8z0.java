package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramDivViewHolder;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes.dex */
public final class a8z0 implements plk {
    public final gtk b;
    public final wa90 c;
    public final i3y d = a.b(LazyThreadSafetyMode.NONE, new pyy0(8));

    public a8z0(gtk gtkVar, wa90 wa90Var) {
        this.b = gtkVar;
        this.c = wa90Var;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder = view instanceof TimeSlotHistogramDivViewHolder ? (TimeSlotHistogramDivViewHolder) view : null;
        if (timeSlotHistogramDivViewHolder == null) {
            return;
        }
        timeSlotHistogramDivViewHolder.bind(upb1.c(((TimeSlotHistogramDivViewHolder) view).getContext(), clkVar.i, (u2l) this.d.getValue(), this.c));
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        return new TimeSlotHistogramDivViewHolder(div2View, rvoVar, this.b);
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, "time_slot_histogram");
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder = view instanceof TimeSlotHistogramDivViewHolder ? (TimeSlotHistogramDivViewHolder) view : null;
        if (timeSlotHistogramDivViewHolder != null) {
            timeSlotHistogramDivViewHolder.release();
        }
    }
}
