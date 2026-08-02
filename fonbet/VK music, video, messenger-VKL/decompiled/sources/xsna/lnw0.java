package xsna;

import android.content.Context;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.fxw0;

/* compiled from: VoipEditScheduledCallTimeContentStateMapper.kt */
/* loaded from: classes7.dex */
public class lnw0 extends kww0 {
    public final vxw0 b;
    public final SimpleDateFormat c;

    public lnw0(Context context, vxw0 vxw0Var) {
        super(context);
        this.b = vxw0Var;
        this.c = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
    }

    public static VoipScheduleCallViewState.ScreenState.Item.Setting e(fxw0.a aVar) {
        VoipScheduleCallViewState.ScreenState.Item.Setting.Type type = VoipScheduleCallViewState.ScreenState.Item.Setting.Type.TIME_ZONE;
        VoipScheduleCallTimeZone voipScheduleCallTimeZone = aVar.h;
        return new VoipScheduleCallViewState.ScreenState.Item.Setting(type, R.drawable.vk_icon_globe_outline_28, R.string.voip_schedule_call_utc_title, voipScheduleCallTimeZone.c + ", " + voipScheduleCallTimeZone.d, VoipScheduleCallViewState.ScreenState.Item.Setting.a.b.a);
    }

    public static VoipScheduleCallViewState.ScreenState.Item.b f(fxw0.a aVar, boolean z) {
        Object obj;
        List u0 = rl3.u0(VoipScheduledCallDuration.values());
        Iterator it = u0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((VoipScheduledCallDuration) obj).h() == aVar.g) {
                break;
            }
        }
        VoipScheduledCallDuration voipScheduledCallDuration = (VoipScheduledCallDuration) obj;
        boolean z2 = false;
        boolean z3 = voipScheduledCallDuration != VoipScheduledCallDuration.DAY;
        boolean z4 = !z || aVar.j == ScheduledCallRecurrence.NEVER;
        VoipScheduleCallViewState.ScreenState.Item.c cVar = new VoipScheduleCallViewState.ScreenState.Item.c(new Date(aVar.e), z4, z3);
        Date date = new Date(aVar.e + aVar.g);
        if (z4 && z3) {
            z2 = true;
        }
        return new VoipScheduleCallViewState.ScreenState.Item.b(cVar, new VoipScheduleCallViewState.ScreenState.Item.c(date, z2, z3), u0.indexOf(voipScheduledCallDuration), u0);
    }

    @Override // xsna.kww0
    public List<VoipScheduleCallViewState.ScreenState.Item> a(fxw0.a aVar) {
        return rl3.I(new VoipScheduleCallViewState.ScreenState.Item[]{d(aVar), e(aVar), c(aVar), b(aVar)});
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r10 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VoipScheduleCallViewState.ScreenState.Item.Setting b(fxw0.a aVar) {
        String string;
        if (aVar.j == ScheduledCallRecurrence.NEVER) {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        VoipScheduleCallViewState.ScreenState.Item.Setting.Type type = VoipScheduleCallViewState.ScreenState.Item.Setting.Type.REPEAT_END;
        mvo0 mvo0Var = aVar.k;
        if (mvo0Var != null) {
            string = this.c.format(Long.valueOf(mvo0Var.a));
        }
        string = this.a.getString(R.string.voip_schedule_call_repeat_never);
        return new VoipScheduleCallViewState.ScreenState.Item.Setting(type, R.drawable.vk_icon_stopwatch_outline_28, R.string.voip_schedule_call_repeat_end_title, string, VoipScheduleCallViewState.ScreenState.Item.Setting.a.b.a);
    }

    public final VoipScheduleCallViewState.ScreenState.Item.Setting c(fxw0.a aVar) {
        VoipScheduleCallViewState.ScreenState.Item.Setting.Type type = VoipScheduleCallViewState.ScreenState.Item.Setting.Type.REPEAT;
        ScheduledCallRecurrence scheduledCallRecurrence = aVar.j;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(aVar.e);
        s3q0 s3q0Var = s3q0.a;
        return new VoipScheduleCallViewState.ScreenState.Item.Setting(type, R.drawable.vk_icon_switch_outline_28, R.string.voip_schedule_call_repeat_title, this.b.a(scheduledCallRecurrence, calendar), VoipScheduleCallViewState.ScreenState.Item.Setting.a.b.a);
    }

    public VoipScheduleCallViewState.ScreenState.Item.b d(fxw0.a aVar) {
        return f(aVar, true);
    }
}
