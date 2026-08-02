package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jd50;

/* compiled from: MusicTrackMenuModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd50 extends FunctionReferenceImpl implements izs<jd50.a.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(jd50.a.b bVar) {
        vte0 vte0Var = (vte0) this.receiver;
        vte0Var.getClass();
        Long l = bVar.a;
        TextView textView = vte0Var.e;
        textView.setVisibility(l != null ? 0 : 8);
        vte0Var.f.setVisibility(l != null ? 0 : 8);
        if (l != null) {
            Context context = vte0Var.b;
            long longValue = l.longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int hours = (int) timeUnit.toHours(longValue);
            int minutes = (int) timeUnit.toMinutes(longValue);
            textView.setText(context.getString(R.string.music_sleep_timer_remaining_time, hours > 0 ? enj.f(R.plurals.music_hours, hours, context) : minutes > 0 ? enj.f(R.plurals.music_minutes, minutes, context) : enj.f(R.plurals.music_seconds, (int) timeUnit.toSeconds(longValue), context)));
        }
        return s3q0.a;
    }
}
