package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jd50;

/* compiled from: MusicTrackMenuModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc50 extends FunctionReferenceImpl implements izs<jd50.a.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(jd50.a.b bVar) {
        hd50 hd50Var = (hd50) this.receiver;
        Context context = hd50Var.b;
        Long l = bVar.a;
        TextView textView = hd50Var.f;
        textView.setVisibility(l != null ? 0 : 8);
        hd50Var.g.setVisibility(l != null ? 0 : 8);
        if (l != null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int hours = (int) timeUnit.toHours(l.longValue());
            int minutes = (int) timeUnit.toMinutes(l.longValue());
            textView.setText(context.getString(R.string.music_sleep_timer_remaining_time, hours > 0 ? enj.f(R.plurals.music_hours, hours, context) : minutes > 0 ? enj.f(R.plurals.music_minutes, minutes, context) : enj.f(R.plurals.music_seconds, (int) timeUnit.toSeconds(l.longValue()), context)));
        }
        return s3q0.a;
    }
}
