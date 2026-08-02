package xsna;

import androidx.annotation.NonNull;
import androidx.work.Data;
import kotlin.NoWhenBranchMatchedException;
import xsna.hyx0;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class qxx0 extends upp<fxx0> {
    @Override // xsna.s140
    @NonNull
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // xsna.upp
    public final void i(@NonNull zin0 zin0Var, @NonNull fxx0 fxx0Var) {
        int i;
        fxx0 fxx0Var2 = fxx0Var;
        int i2 = 1;
        zin0Var.bindString(1, fxx0Var2.a);
        zin0Var.bindLong(2, hyx0.i(fxx0Var2.b));
        zin0Var.bindString(3, fxx0Var2.c);
        zin0Var.bindString(4, fxx0Var2.d);
        Data data = fxx0Var2.e;
        Data data2 = Data.b;
        zin0Var.bindBlob(5, Data.b.b(data));
        zin0Var.bindBlob(6, Data.b.b(fxx0Var2.f));
        zin0Var.bindLong(7, fxx0Var2.g);
        zin0Var.bindLong(8, fxx0Var2.h);
        zin0Var.bindLong(9, fxx0Var2.i);
        zin0Var.bindLong(10, fxx0Var2.k);
        int i3 = hyx0.a.$EnumSwitchMapping$1[fxx0Var2.l.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        zin0Var.bindLong(11, i);
        zin0Var.bindLong(12, fxx0Var2.m);
        zin0Var.bindLong(13, fxx0Var2.n);
        zin0Var.bindLong(14, fxx0Var2.o);
        zin0Var.bindLong(15, fxx0Var2.p);
        zin0Var.bindLong(16, fxx0Var2.q ? 1L : 0L);
        int i4 = hyx0.a.$EnumSwitchMapping$3[fxx0Var2.r.ordinal()];
        if (i4 == 1) {
            i2 = 0;
        } else if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        zin0Var.bindLong(17, i2);
        zin0Var.bindLong(18, fxx0Var2.s);
        zin0Var.bindLong(19, fxx0Var2.t);
        zin0Var.bindLong(20, fxx0Var2.u);
        zin0Var.bindLong(21, fxx0Var2.v);
        zin0Var.bindLong(22, fxx0Var2.w);
        String str = fxx0Var2.x;
        if (str == null) {
            zin0Var.bindNull(23);
        } else {
            zin0Var.bindString(23, str);
        }
        p6j p6jVar = fxx0Var2.j;
        zin0Var.bindLong(24, hyx0.g(p6jVar.a));
        zin0Var.bindBlob(25, hyx0.b(p6jVar.b));
        zin0Var.bindLong(26, p6jVar.c ? 1L : 0L);
        zin0Var.bindLong(27, p6jVar.d ? 1L : 0L);
        zin0Var.bindLong(28, p6jVar.e ? 1L : 0L);
        zin0Var.bindLong(29, p6jVar.f ? 1L : 0L);
        zin0Var.bindLong(30, p6jVar.g);
        zin0Var.bindLong(31, p6jVar.h);
        zin0Var.bindBlob(32, hyx0.h(p6jVar.i));
    }
}
