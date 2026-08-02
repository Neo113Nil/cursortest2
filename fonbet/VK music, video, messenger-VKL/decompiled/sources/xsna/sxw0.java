package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VoipScheduledCallDateTimeViewHolder.kt */
/* loaded from: classes7.dex */
public final class sxw0 extends vfz<VoipScheduleCallViewState.ScreenState.Item.b> {
    public final FutureDateTimePickerView l;
    public final FutureDateTimePickerView m;
    public final RecyclerView n;
    public final LinearLayoutManager o;

    public sxw0(ViewGroup viewGroup, hfv0 hfv0Var, xau0 xau0Var, z7t0 z7t0Var) {
        super(R.layout.voip_scheduled_call_datetime_item, viewGroup);
        FutureDateTimePickerView futureDateTimePickerView = (FutureDateTimePickerView) this.itemView.findViewById(R.id.future_start_date_time_picker);
        this.l = futureDateTimePickerView;
        FutureDateTimePickerView futureDateTimePickerView2 = (FutureDateTimePickerView) this.itemView.findViewById(R.id.future_end_date_time_picker);
        this.m = futureDateTimePickerView2;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.rv_date_time_intervals);
        this.n = recyclerView;
        this.itemView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.o = linearLayoutManager;
        futureDateTimePickerView.setTextResources(R.string.voip_schedule_call_invalid_time);
        futureDateTimePickerView.setOnDateUpdateListener(hfv0Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new hoo(xau0Var));
        recyclerView.addItemDecoration(new ufv(cn70.b(8)));
        futureDateTimePickerView2.setTextResources(R.string.voip_schedule_call_invalid_time);
        futureDateTimePickerView2.setOnDateUpdateListener(z7t0Var);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(VoipScheduleCallViewState.ScreenState.Item.b bVar) {
        VoipScheduleCallViewState.ScreenState.Item.b bVar2 = bVar;
        VoipScheduleCallViewState.ScreenState.Item.c cVar = bVar2.b;
        boolean z = cVar.b;
        FutureDateTimePickerView futureDateTimePickerView = this.l;
        futureDateTimePickerView.setEnabledDate(z);
        futureDateTimePickerView.setEnabledTime(cVar.c);
        futureDateTimePickerView.setDateSilently(cVar.a);
        List<VoipScheduledCallDuration> list = bVar2.e;
        int i = bVar2.d;
        futureDateTimePickerView.setDateTimeValidationMethod(new w0k(((VoipScheduledCallDuration) j5g.b0(i, list)) == VoipScheduledCallDuration.DAY, 1));
        RecyclerView.Adapter adapter = this.n.getAdapter();
        if (adapter == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.scheduled.creation.ui.view.content.DurationSlotsAdapter");
        }
        hoo hooVar = (hoo) adapter;
        hooVar.d = list;
        hooVar.notifyDataSetChanged();
        int i2 = hooVar.e;
        if (i2 != -1) {
            hooVar.notifyItemChanged(i2);
        }
        hooVar.e = i;
        hooVar.notifyItemChanged(i);
        int i3 = hooVar.e;
        LinearLayoutManager linearLayoutManager = this.o;
        int s = linearLayoutManager.s();
        int x = linearLayoutManager.x();
        if (s != -1 && x != -1 && (s > i3 || i3 > x)) {
            linearLayoutManager.scrollToPosition(i3);
        }
        VoipScheduleCallViewState.ScreenState.Item.c cVar2 = bVar2.c;
        boolean z2 = cVar2.b;
        FutureDateTimePickerView futureDateTimePickerView2 = this.m;
        futureDateTimePickerView2.setEnabledDate(z2);
        futureDateTimePickerView2.setEnabledTime(cVar2.c);
        futureDateTimePickerView2.setDateSilently(cVar2.a);
    }
}
