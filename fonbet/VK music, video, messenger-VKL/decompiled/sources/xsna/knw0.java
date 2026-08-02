package xsna;

import android.content.Context;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import java.util.List;
import xsna.fxw0;

/* compiled from: VoipEditScheduledCallContentStateMapper.kt */
/* loaded from: classes7.dex */
public class knw0 extends lnw0 {
    @Override // xsna.lnw0, xsna.kww0
    public List<VoipScheduleCallViewState.ScreenState.Item> a(fxw0.a aVar) {
        return rl3.I(new VoipScheduleCallViewState.ScreenState.Item[]{VoipScheduleCallViewState.ScreenState.Item.d.b, g(aVar), d(aVar), lnw0.e(aVar), c(aVar), b(aVar), h(aVar), new VoipScheduleCallViewState.ScreenState.Item.e()});
    }

    public final VoipScheduleCallViewState.ScreenState.Item.EditText g(fxw0.a aVar) {
        boolean z = aVar.v;
        String str = aVar.d;
        Context context = this.a;
        return new VoipScheduleCallViewState.ScreenState.Item.EditText(context.getString(R.string.voip_schedule_call_name_title), context.getString(R.string.voip_schedule_call_enter_meeting_name), str, context.getString(R.string.voip_schedule_call_name_symbols_count, Integer.valueOf(str.length()), 128), VoipScheduleCallViewState.ScreenState.Item.EditText.Type.NAME, aVar.v, (z || myc0.f(drm0.p0(str).toString())) ? null : context.getString(R.string.voip_schedule_call_name_no_symbols_error));
    }

    public final VoipScheduleCallViewState.ScreenState.Item.Setting h(fxw0.a aVar) {
        return new VoipScheduleCallViewState.ScreenState.Item.Setting(VoipScheduleCallViewState.ScreenState.Item.Setting.Type.REMINDER, R.drawable.vk_icon_notifications_28, R.string.voip_call_by_link_setting_reminder_title, this.a.getString(R.string.voip_call_by_link_setting_reminder_subtitle), aVar.n ? VoipScheduleCallViewState.ScreenState.Item.Setting.a.c.a : VoipScheduleCallViewState.ScreenState.Item.Setting.a.C2072a.a);
    }
}
