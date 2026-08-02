package ru.rustore.sdk.metrics.internal.presentation;

import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.jvm.internal.Lambda;
import xsna.adn;
import xsna.bpn0;
import xsna.fwj0;
import xsna.gwj0;
import xsna.gzs;
import xsna.iuj0;
import xsna.izs;
import xsna.qtj0;
import xsna.r3y0;
import xsna.s3q0;

/* loaded from: classes11.dex */
public final class SendMetricsEventJobService extends JobService {
    public final bpn0 b = new bpn0(new a());
    public fwj0 c;
    public volatile boolean d;

    public static final class a extends Lambda implements gzs<r3y0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final r3y0 invoke() {
            return r3y0.c.a(SendMetricsEventJobService.this);
        }
    }

    public static final class b extends Lambda implements gzs<s3q0> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((r3y0) SendMetricsEventJobService.this.b.getValue()).a.a();
            return s3q0.a;
        }
    }

    public static final class c extends Lambda implements gzs<s3q0> {
        public final /* synthetic */ JobParameters b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JobParameters jobParameters) {
            super(0);
            this.b = jobParameters;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.b;
            if (!sendMetricsEventJobService.d) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return s3q0.a;
        }
    }

    public static final class d extends Lambda implements izs<Throwable, s3q0> {
        public final /* synthetic */ JobParameters b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JobParameters jobParameters) {
            super(1);
            this.b = jobParameters;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.b;
            if (!sendMetricsEventJobService.d) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return s3q0.a;
        }
    }

    public static final class e extends Lambda implements izs<s3q0, s3q0> {
        public final /* synthetic */ JobParameters b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JobParameters jobParameters) {
            super(1);
            this.b = jobParameters;
        }

        @Override // xsna.izs
        public final s3q0 invoke(s3q0 s3q0Var) {
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.b;
            if (!sendMetricsEventJobService.d) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return s3q0.a;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        iuj0 iuj0Var = new iuj0(new b());
        bpn0 bpn0Var = adn.a;
        qtj0 qtj0Var = new qtj0(new gwj0(iuj0Var, adn.a()), new c(jobParameters));
        fwj0 fwj0Var = new fwj0(new d(jobParameters), new e(jobParameters));
        qtj0Var.a(fwj0Var);
        this.c = fwj0Var;
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.d = true;
        fwj0 fwj0Var = this.c;
        if (fwj0Var != null) {
            fwj0Var.dispose();
        }
        return true;
    }
}
