package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import android.util.Log;
import kotlin.Lazy;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import xsna.bpn0;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TracerLiteFacade.kt */
/* loaded from: classes9.dex */
public final class TracerLiteFacade {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_AUDIOMANAGER_VERSION = "calls-audiomanager-version";
    private final Lazy crashReport$delegate = new bpn0(new gzs<TracerCrashReportLite>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade$crashReport$2
        {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final TracerCrashReportLite invoke() {
            TracerLite tracerLite;
            tracerLite = TracerLiteFacade.this.getTracerLite();
            return new TracerCrashReportLite(tracerLite, null, 2, 0 == true ? 1 : 0);
        }
    });
    private final Lazy tracerLite$delegate;

    /* compiled from: TracerLiteFacade.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TracerLiteFacade(final Context context) {
        this.tracerLite$delegate = new bpn0(new gzs<TracerLite>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade$tracerLite$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public final TracerLite invoke() {
                TracerLite tracerLite = new TracerLite(context.getApplicationContext(), "one.video.calls.externcalls.sdk.audio", TracerLite.Configuration.Companion.build(new izs<TracerLite.Configuration.Builder, s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade$tracerLite$2.1
                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(TracerLite.Configuration.Builder builder) {
                        invoke2(builder);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TracerLite.Configuration.Builder builder) {
                        builder.setOverrideLibToken("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
                    }
                }));
                tracerLite.setKey(TracerLiteFacade.KEY_AUDIOMANAGER_VERSION, "0.1.2");
                return tracerLite;
            }
        });
    }

    private final TracerCrashReportLite getCrashReport() {
        return (TracerCrashReportLite) this.crashReport$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TracerLite getTracerLite() {
        return (TracerLite) this.tracerLite$delegate.getValue();
    }

    public static /* synthetic */ void reportCrash$default(TracerLiteFacade tracerLiteFacade, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerLiteFacade.reportCrash(th, str);
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
