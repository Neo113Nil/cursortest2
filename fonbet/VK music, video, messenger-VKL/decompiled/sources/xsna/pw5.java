package xsna;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: BackgroundLimitCounter.kt */
/* loaded from: classes3.dex */
public final class pw5 implements w8i {
    public long b;
    public long c;
    public long d;
    public boolean e = true;
    public final bpn0 f = new bpn0(new kd(this, 10));

    public final long a() {
        bpn0 bpn0Var = this.f;
        long min = (Math.min(this.d, this.c) / 1000) + ((com.vk.music.pref.a) bpn0Var.getValue()).O0();
        Date date = new Date(System.currentTimeMillis());
        Date date2 = new Date(((com.vk.music.pref.a) bpn0Var.getValue()).o0());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        simpleDateFormat.setTimeZone(Calendar.getInstance().getTimeZone());
        bn40.b(y57.a("today date = ", simpleDateFormat.format(date), ", last played date = ", simpleDateFormat.format(date2)));
        if (!epx.f(simpleDateFormat.format(date), simpleDateFormat.format(date2))) {
            min = 0;
        }
        this.d = 0L;
        ((com.vk.music.pref.a) bpn0Var.getValue()).x0(System.currentTimeMillis());
        ((com.vk.music.pref.a) bpn0Var.getValue()).H(min);
        return min;
    }
}
