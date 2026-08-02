package xsna;

import android.content.Context;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pq4 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            i2x0 i2x0Var = new i2x0(context);
            rq4.j = i2x0Var;
            i2x0Var.a();
            i2x0 i2x0Var2 = rq4.j;
            rq4.a.getClass();
            i2x0.b(i2x0Var2, epx.f(Locale.getDefault().getLanguage(), "ru") ? R.raw.leave_message_ru_din : R.raw.please_record_v2_edited, Boolean.valueOf(rq4.o));
        } catch (Exception e) {
            L.f(rq4.b, "Failed to play record audio message intro", e);
        }
    }
}
