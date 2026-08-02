package defpackage;

import android.os.SystemClock;
import java.util.Calendar;

/* loaded from: classes9.dex */
public final class cqd0 implements b7z0 {
    public final bqd0 a;

    public cqd0(bqd0 bqd0Var) {
        this.a = bqd0Var;
    }

    @Override // defpackage.b7z0
    public final long a() {
        return this.a.a.getLong("time_delta", 0L) + System.currentTimeMillis();
    }

    @Override // defpackage.b7z0
    public final Calendar b() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.a.a.getLong("time_delta", 0L) + calendar.getTimeInMillis());
        return calendar;
    }

    @Override // defpackage.b7z0
    public final long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
