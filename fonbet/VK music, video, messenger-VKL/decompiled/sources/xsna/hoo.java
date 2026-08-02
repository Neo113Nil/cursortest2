package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: DurationSlotsAdapter.kt */
/* loaded from: classes7.dex */
public final class hoo extends RecyclerView.Adapter<a> {
    public final xau0 c;
    public List<? extends VoipScheduledCallDuration> d = EmptyList.b;
    public int e = -1;

    /* compiled from: DurationSlotsAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public final AppCompatTextView l;

        /* compiled from: DurationSlotsAdapter.kt */
        /* renamed from: xsna.hoo$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3014a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VoipScheduledCallDuration.values().length];
                try {
                    iArr[VoipScheduledCallDuration.DAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VoipScheduledCallDuration.MINUTES_30.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VoipScheduledCallDuration.MINUTES_45.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VoipScheduledCallDuration.HOUR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VoipScheduledCallDuration.HOURS_2.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[VoipScheduledCallDuration.HOURS_4.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(View view) {
            super(view);
            bwt0.i0(view, new a5(8, hoo.this, this));
            this.l = (AppCompatTextView) view.findViewById(R.id.tv_duration);
        }
    }

    public hoo(xau0 xau0Var) {
        this.c = xau0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        int i2;
        a aVar2 = aVar;
        VoipScheduledCallDuration voipScheduledCallDuration = this.d.get(i);
        AppCompatTextView appCompatTextView = aVar2.l;
        Context context = aVar2.itemView.getContext();
        switch (a.C3014a.$EnumSwitchMapping$0[voipScheduledCallDuration.ordinal()]) {
            case 1:
                i2 = R.string.voip_schedule_call_option_duration_1_day;
                break;
            case 2:
                i2 = R.string.voip_schedule_call_option_duration_30_min;
                break;
            case 3:
                i2 = R.string.voip_schedule_call_option_duration_45_min;
                break;
            case 4:
                i2 = R.string.voip_schedule_call_option_duration_1_hour;
                break;
            case 5:
                i2 = R.string.voip_schedule_call_option_duration_2_hour;
                break;
            case 6:
                i2 = R.string.voip_schedule_call_option_duration_4_hour;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatTextView.setText(context.getString(i2));
        appCompatTextView.setBackgroundResource(hoo.this.e == aVar2.getBindingAdapterPosition() ? R.drawable.voip_scheduled_call_duration_button_selected_background : R.drawable.voip_scheduled_call_duration_button_background);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(bwt0.I(R.layout.voip_schedule_call_duration_item, viewGroup, false));
    }
}
