package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vkontakte.android.R;
import java.util.Calendar;

/* compiled from: VoipScheduleCallRepeatPicker.kt */
/* loaded from: classes7.dex */
public final class zww0 extends s770 {
    public final /* synthetic */ bxw0 c;
    public final /* synthetic */ Calendar d;

    public zww0(bxw0 bxw0Var, Calendar calendar) {
        this.c = bxw0Var;
        this.d = calendar;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        ScheduledCallRecurrence scheduledCallRecurrence = (ScheduledCallRecurrence) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        bxw0 bxw0Var = this.c;
        textView.setText(bxw0Var.c.a(scheduledCallRecurrence, this.d));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, scheduledCallRecurrence == bxw0Var.a ? R.drawable.vk_icon_check_circle_on_24 : 0, 0);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        return hkpVar;
    }
}
