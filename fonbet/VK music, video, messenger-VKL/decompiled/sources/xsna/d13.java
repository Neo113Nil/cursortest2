package xsna;

import com.vk.api.sdk.utils.log.Logger;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import java.util.List;
import kotlin.Lazy;

/* compiled from: AppApiLogger.kt */
/* loaded from: classes11.dex */
public final class d13 implements Logger {
    public final String a;
    public final s000 b;

    /* compiled from: AppApiLogger.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Logger.LogLevel.values().length];
            try {
                iArr[Logger.LogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d13(String str) {
        this.a = str;
        o2l.a.getClass();
        this.b = new s000(Preference.j().getInt("__dbg_api_max_length", 0));
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public final void a(Logger.LogLevel logLevel, String str, Throwable th) {
        L.LogType logType;
        int i;
        if (((Logger.LogLevel) ((bpn0) getLogLevel()).getValue()).ordinal() > logLevel.ordinal()) {
            return;
        }
        if (str == null && th == null) {
            return;
        }
        int i2 = a.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i2 == 1) {
            logType = L.LogType.v;
        } else if (i2 == 2) {
            logType = L.LogType.d;
        } else if (i2 == 3) {
            logType = L.LogType.w;
        } else if (i2 != 4) {
            return;
        } else {
            logType = L.LogType.e;
        }
        List<String> list = p2i0.b;
        String a2 = p2i0.c.a(str);
        s000 s000Var = this.b;
        s000Var.getClass();
        if (s000.b.matcher(a2).find() && (i = s000Var.a) > 0) {
            a2 = erm0.D0(i, a2);
        }
        String str2 = this.a;
        if (th == null) {
            L.r(logType, str2, a2);
        } else {
            L.s(logType, str2, a2, th);
        }
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public final Lazy<Logger.LogLevel> getLogLevel() {
        return new bpn0(new c13(0));
    }
}
