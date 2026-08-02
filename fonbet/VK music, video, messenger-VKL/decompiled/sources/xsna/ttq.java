package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vk.core.preference.Preference;
import com.vk.fcmerrorhandler.taostutils.EventType;
import org.chromium.base.TimeUtils;
import xsna.rtq;

/* compiled from: FcmHandlerDelegate.kt */
/* loaded from: classes18.dex */
public final class ttq {
    public static void a() {
        long m = Preference.m(-1L, "fcm_action_last_time", "last_time_key");
        if (m != -1 && SystemClock.elapsedRealtime() - m <= TimeUtils.MILLISECONDS_PER_DAY) {
            return;
        }
        Preference.B("fcm_toast");
    }

    public static ztq b(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (drm0.D(message, "FIS_AUTH_ERROR", false)) {
            c63 c63Var = c63.a;
            return new stq(th, c63.b());
        }
        if (drm0.D(message, "AUTHENTICATION_FAILED", false)) {
            c63 c63Var2 = c63.a;
            return new ktq(th, c63.b());
        }
        if (drm0.D(message, "PHONE_REGISTRATION_ERROR", false)) {
            c63 c63Var3 = c63.a;
            return new xtq(th, c63.b());
        }
        if (drm0.D(message, "SERVICE_NOT_AVAILABLE", false)) {
            c63 c63Var4 = c63.a;
            return new ytq(th, c63.b());
        }
        c63 c63Var5 = c63.a;
        return new ztq(c63.b(), th);
    }

    public final void c(EventType eventType) {
        String s;
        s = Preference.s("fcm_toast", rtq.a.$EnumSwitchMapping$0[eventType.ordinal()] == 1 ? "fcm_error_key_notification" : "fcm_error_key_cold", new String());
        Throwable th = s.length() == 0 ? null : new Throwable(s);
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (th == null || b == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new v8e(b, this, th, eventType));
    }
}
