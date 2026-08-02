package ru.ok.android.internal.tracer;

import android.content.Context;
import android.util.Log;
import kotlin.Lazy;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import xsna.bpn0;
import xsna.ghn0;
import xsna.kpr;
import xsna.s3q0;
import xsna.wme0;
import xsna.zcl;

/* compiled from: TracerLiteFacade.kt */
/* loaded from: classes9.dex */
public final class TracerLiteFacade {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_SDK_VERSION = "calls-sdk-version";
    private final Lazy crashReport$delegate = new bpn0(new ghn0(this, 1));
    private final Lazy tracerLite$delegate;

    /* compiled from: TracerLiteFacade.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TracerLiteFacade(Context context) {
        this.tracerLite$delegate = new bpn0(new wme0(context, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final TracerCrashReportLite crashReport_delegate$lambda$0(TracerLiteFacade tracerLiteFacade) {
        return new TracerCrashReportLite(tracerLiteFacade.getTracerLite(), null, 2, 0 == true ? 1 : 0);
    }

    private final TracerCrashReportLite getCrashReport() {
        return (TracerCrashReportLite) this.crashReport$delegate.getValue();
    }

    private final TracerLite getTracerLite() {
        return (TracerLite) this.tracerLite$delegate.getValue();
    }

    public static /* synthetic */ void reportCrash$default(TracerLiteFacade tracerLiteFacade, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerLiteFacade.reportCrash(th, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TracerLite tracerLite_delegate$lambda$0(Context context) {
        TracerLite tracerLite = new TracerLite(context.getApplicationContext(), "one.video.calls.externcalls", TracerLite.Configuration.Companion.build(new kpr(29)));
        tracerLite.setKey(KEY_SDK_VERSION, "0.2.3");
        return tracerLite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 tracerLite_delegate$lambda$0$0(TracerLite.Configuration.Builder builder) {
        builder.setOverrideLibToken("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
        return s3q0.a;
    }

    public final void reportCrash(Throwable th) {
        reportCrash$default(this, th, null, 2, null);
    }

    public final void reportCrash(Throwable th, String str) {
        try {
            getCrashReport().report(th, str);
        } catch (Throwable th2) {
            Log.e("TracerLiteFacade", "Crash report failed", th2);
        }
    }
}
