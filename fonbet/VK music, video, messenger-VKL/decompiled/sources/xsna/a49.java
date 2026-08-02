package xsna;

import android.content.Context;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vkontakte.android.R;

/* compiled from: ScheduledUtils.kt */
/* loaded from: classes7.dex */
public final class a49 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final VoipScheduleCallTimeZone e;
    public final String f;

    public a49(String str, String str2, long j, long j2, VoipScheduleCallTimeZone voipScheduleCallTimeZone, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = voipScheduleCallTimeZone;
        this.f = str3;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string = context.getString(R.string.voip_schedule_call_default_title);
        sb.append(context.getString(R.string.voip_schedule_call_user_invite, this.b));
        sb.append('\n');
        String str = this.a;
        if (!drm0.N(str) && !str.equals(string)) {
            sb.append(context.getString(R.string.voip_schedule_call_quotes_text, str));
            sb.append('\n');
        }
        sb.append(y7h0.a(this.c) + '-' + y7h0.a(this.d));
        StringBuilder sb2 = new StringBuilder(" ");
        VoipScheduleCallTimeZone voipScheduleCallTimeZone = this.e;
        sb2.append(voipScheduleCallTimeZone.c);
        sb2.append(", (");
        sb2.append(voipScheduleCallTimeZone.d);
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append("\n\n");
        sb.append(context.getString(R.string.voip_schedule_call_join_by_link));
        sb.append('\n');
        return ho8.a(sb, this.f, '\n');
    }
}
