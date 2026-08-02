package ru.ok.tracer.utils;

import android.util.Log;
import ru.ok.tracer.base.stacktrace.ThrowableUtils;
import ru.ok.tracer.utils.TracerLoggerDelegate;
import xsna.zcl;

/* compiled from: DefaultTracerLoggerDelegate.kt */
/* loaded from: classes11.dex */
public final class DefaultTracerLoggerDelegate implements TracerLoggerDelegate {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ru.ok.tracer";
    private final /* synthetic */ Companion $$delegate_0;
    private final int minLogPriority;

    /* compiled from: DefaultTracerLoggerDelegate.kt */
    public static final class Companion implements TracerLoggerDelegate {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        @Override // ru.ok.tracer.utils.TracerLoggerDelegate
        public int getMinLogPriority() {
            return TracerLoggerDelegate.DefaultImpls.getMinLogPriority(this);
        }

        @Override // ru.ok.tracer.utils.TracerLoggerDelegate
        public void println(int i, String str, Throwable th) {
            if (str == null) {
                if (th == null) {
                    str = "null";
                } else {
                    StringBuilder sb = new StringBuilder();
                    ThrowableUtils.appendStackTraceTo(th, sb);
                    str = sb.toString();
                }
            } else if (th != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('\n');
                ThrowableUtils.appendStackTraceTo(th, sb2);
                str = sb2.toString();
            }
            Log.println(i, "ru.ok.tracer", str);
        }

        private Companion() {
        }
    }

    public DefaultTracerLoggerDelegate() {
        this(0, 1, null);
    }

    @Override // ru.ok.tracer.utils.TracerLoggerDelegate
    public int getMinLogPriority() {
        return this.minLogPriority;
    }

    @Override // ru.ok.tracer.utils.TracerLoggerDelegate
    public void println(int i, String str, Throwable th) {
        this.$$delegate_0.println(i, str, th);
    }

    public DefaultTracerLoggerDelegate(int i) {
        this.minLogPriority = i;
        this.$$delegate_0 = Companion;
    }

    public /* synthetic */ DefaultTracerLoggerDelegate(int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}
