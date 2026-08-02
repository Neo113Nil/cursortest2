package xsna;

import android.content.Context;
import com.vk.dto.common.Source;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: CallListDurationFormatter.kt */
/* loaded from: classes7.dex */
public final class v49 implements yuk {
    public final Object b;
    public final Object c;

    public /* synthetic */ v49(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public String a(long j) {
        Context context = (Context) this.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int hours = (int) timeUnit.toHours(j);
        int minutes = ((int) timeUnit.toMinutes(j)) % 60;
        int seconds = ((int) timeUnit.toSeconds(j)) % 60;
        if (hours > 0 && minutes > 0) {
            return context.getString(R.string.voip_history_past_call_details_past_call_duration_hours, Integer.valueOf(hours)) + ' ' + context.getString(R.string.voip_history_past_call_details_past_call_duration_minutes, Integer.valueOf(minutes));
        }
        if (hours > 0) {
            return context.getString(R.string.voip_history_past_call_details_past_call_duration_hours, Integer.valueOf(hours));
        }
        if (minutes <= 0 || seconds <= 0) {
            return minutes > 0 ? context.getString(R.string.voip_history_past_call_details_past_call_duration_minutes, Integer.valueOf(minutes)) : context.getString(R.string.voip_history_past_call_details_past_call_duration_seconds, Integer.valueOf(seconds));
        }
        return context.getString(R.string.voip_history_past_call_details_past_call_duration_minutes, Integer.valueOf(minutes)) + ' ' + context.getString(R.string.voip_history_past_call_details_past_call_duration_seconds, Integer.valueOf(seconds));
    }

    @Override // xsna.yuk
    public io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        return new io.reactivex.rxjava3.internal.operators.single.r(((lzv) this.b).b(this, ((mjg) this.c).a(new i5w((wy1) obj, i, Source.NETWORK, true))), new oq80(new zl20(this, 27), 4)).l(new xq70(new amp(24), 8));
    }

    public v49(Context context, owa0 owa0Var) {
        this.b = owa0Var;
        c0a c0aVar = new c0a(context, (gzs) new com.vk.movika.sdk.base.ui.f(this, 13));
        this.c = c0aVar;
        fbr0 fbr0Var = (fbr0) c0aVar.c;
        if (fbr0Var != null) {
            fbr0Var.e();
        }
    }

    public v49(Context context) {
        this.b = context;
        this.c = new coo(context);
    }
}
