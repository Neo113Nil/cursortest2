package ru.mail.libverify.y;

import android.os.Process;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.mail.libverify.o.f;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.tracer.base.ucum.UcumUtils;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes9.dex */
public final class a {
    private final ru.mail.libverify.i0.a a;
    private final f b;

    public a(ru.mail.libverify.i0.a aVar, f fVar) {
        this.a = aVar;
        this.b = fVar;
    }

    public final void a() {
        long b = this.a.b();
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = b - uptimeMillis;
        long startUptimeMillis = Process.getStartUptimeMillis();
        FileLog.d(a.class.getName(), "uptime: " + uptimeMillis + UcumUtils.UCUM_MILLISECODS);
        String name = a.class.getName();
        StringBuilder sb = new StringBuilder("bootTime: ");
        Locale locale = Locale.US;
        sb.append(new SimpleDateFormat(AppUpdateInfo.Factory.UPDATED_FORMAT, locale).format(Long.valueOf(j)));
        FileLog.d(name, sb.toString());
        FileLog.d(a.class.getName(), "appStartTime: " + startUptimeMillis + UcumUtils.UCUM_MILLISECODS);
        long j2 = j + startUptimeMillis;
        long j3 = b - j2;
        FileLog.d(a.class.getName(), "appRealStartTime: " + new SimpleDateFormat(AppUpdateInfo.Factory.UPDATED_FORMAT, locale).format(Long.valueOf(j2)));
        FileLog.d(a.class.getName(), "currentTime: " + new SimpleDateFormat(AppUpdateInfo.Factory.UPDATED_FORMAT, locale).format(Long.valueOf(b)));
        FileLog.d(a.class.getName(), "startTime: " + j3 + UcumUtils.UCUM_MILLISECODS);
        f fVar = this.b;
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.INIT_TIME;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fVar.a(aVar, j3, new Pair[0]);
    }
}
