package ru.rustore.sdk.metrics.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;
import xsna.adn;
import xsna.bpn0;
import xsna.emb;
import xsna.eoo;
import xsna.fwj0;
import xsna.gwj0;
import xsna.gzs;
import xsna.h6z0;
import xsna.iuj0;
import xsna.jl20;
import xsna.odz0;
import xsna.owu;
import xsna.s3q0;
import xsna.slv;
import xsna.swx;
import xsna.tib;
import xsna.zno;

/* renamed from: ru.rustore.sdk.metrics.internal.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5391m extends Lambda implements gzs<s3q0> {
    public final /* synthetic */ h6z0 a;
    public final /* synthetic */ jl20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5391m(h6z0 h6z0Var, jl20 jl20Var) {
        super(0);
        this.a = h6z0Var;
        this.b = jl20Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        h6z0 h6z0Var = this.a;
        if (!h6z0Var.f) {
            iuj0 iuj0Var = new iuj0(new C5390h(h6z0Var));
            bpn0 bpn0Var = adn.a;
            new gwj0(iuj0Var, adn.a()).a(new fwj0(new j(h6z0Var), new l(h6z0Var)));
            Context context = h6z0Var.c.a;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (!(allPendingJobs instanceof Collection) || !allPendingJobs.isEmpty()) {
                Iterator<T> it = allPendingJobs.iterator();
                while (it.hasNext()) {
                    if (((JobInfo) it.next()).getId() == 88123556) {
                        break;
                    }
                }
            }
            JobInfo.Builder builder = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
            zno.a aVar = zno.c;
            jobScheduler.schedule(builder.setPeriodic(zno.e(eoo.e(1440, DurationUnit.MINUTES))).setPersisted(true).build());
            h6z0Var.f = true;
        }
        tib tibVar = this.a.b;
        jl20 jl20Var = this.b;
        owu owuVar = (owu) tibVar.a;
        new M(jl20Var);
        String uuid = UUID.randomUUID().toString();
        byte[] bytes = odz0.a(jl20Var).getBytes(emb.b);
        final swx swxVar = new swx(uuid, bytes);
        bpn0 bpn0Var2 = ((slv) owuVar.a).b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", uuid);
        contentValues.put("metrics_event", bytes);
        try {
            ((SQLiteDatabase) bpn0Var2.getValue()).beginTransactionNonExclusive();
            long insert = ((SQLiteDatabase) bpn0Var2.getValue()).insert("metrics_event_table", null, contentValues);
            ((SQLiteDatabase) bpn0Var2.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) bpn0Var2.getValue()).endTransaction();
            if (insert != -1) {
                new gzs<String>() { // from class: ru.rustore.sdk.metrics.internal.I$b
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public final String invoke() {
                        StringBuilder sb = new StringBuilder("Create row in storage ");
                        sb.append((Object) ("MetricsEventUuid(value=" + swx.this.a + ')'));
                        return sb.toString();
                    }
                };
                return s3q0.a;
            }
            StringBuilder sb = new StringBuilder("Saving error ");
            sb.append((Object) ("MetricsEventUuid(value=" + uuid + ')'));
            final String sb2 = sb.toString();
            new gzs<String>() { // from class: ru.rustore.sdk.metrics.internal.I$a
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public final String invoke() {
                    return sb2;
                }
            };
            throw new MetricsException.SaveMetricsEventError(sb2);
        } finally {
        }
    }
}
