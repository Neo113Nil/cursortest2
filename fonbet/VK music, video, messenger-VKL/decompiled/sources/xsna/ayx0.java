package xsna;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.fxx0;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class ayx0 implements gxx0 {
    public final WorkDatabase_Impl a;
    public final qxx0 b;
    public final sxx0 c;
    public final txx0 d;
    public final uxx0 e;
    public final vxx0 f;
    public final wxx0 g;
    public final xxx0 h;
    public final yxx0 i;
    public final zxx0 j;
    public final hxx0 k;
    public final jxx0 l;
    public final kxx0 m;
    public final lxx0 n;
    public final oxx0 o;

    public ayx0(@NonNull WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new qxx0(workDatabase_Impl);
        this.c = new sxx0(workDatabase_Impl);
        this.d = new txx0(workDatabase_Impl);
        this.e = new uxx0(workDatabase_Impl);
        this.f = new vxx0(workDatabase_Impl);
        this.g = new wxx0(workDatabase_Impl);
        this.h = new xxx0(workDatabase_Impl);
        this.i = new yxx0(workDatabase_Impl);
        this.j = new zxx0(workDatabase_Impl);
        this.k = new hxx0(workDatabase_Impl);
        new ixx0(workDatabase_Impl);
        this.l = new jxx0(workDatabase_Impl);
        this.m = new kxx0(workDatabase_Impl);
        this.n = new lxx0(workDatabase_Impl);
        new mxx0(workDatabase_Impl);
        new nxx0(workDatabase_Impl);
        this.o = new oxx0(workDatabase_Impl);
    }

    @Override // xsna.gxx0
    public final ArrayList A(String str) {
        dmg0 c = dmg0.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                String string = h.getString(0);
                WorkInfo.State f = hyx0.f(h.getInt(1));
                fxx0.b bVar = new fxx0.b();
                bVar.a = string;
                bVar.b = f;
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.gxx0
    public final FlowUtil$createFlow$$inlined$map$1 B() {
        rxx0 rxx0Var = new rxx0(this, dmg0.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"));
        return fwj.a(this.a, new String[]{"workspec"}, rxx0Var);
    }

    @Override // xsna.gxx0
    public final ArrayList C(int i) {
        dmg0 dmg0Var;
        int b;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        dmg0 c = dmg0.c(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        c.bindLong(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            b = dmk.b(h, "id");
            b2 = dmk.b(h, "state");
            b3 = dmk.b(h, "worker_class_name");
            b4 = dmk.b(h, "input_merger_class_name");
            b5 = dmk.b(h, "input");
            b6 = dmk.b(h, "output");
            b7 = dmk.b(h, "initial_delay");
            b8 = dmk.b(h, "interval_duration");
            b9 = dmk.b(h, "flex_duration");
            b10 = dmk.b(h, "run_attempt_count");
            b11 = dmk.b(h, "backoff_policy");
            b12 = dmk.b(h, "backoff_delay_duration");
            b13 = dmk.b(h, "last_enqueue_time");
            dmg0Var = c;
        } catch (Throwable th) {
            th = th;
            dmg0Var = c;
        }
        try {
            int b14 = dmk.b(h, "minimum_retention_duration");
            int b15 = dmk.b(h, "schedule_requested_at");
            int b16 = dmk.b(h, "run_in_foreground");
            int b17 = dmk.b(h, "out_of_quota_policy");
            int b18 = dmk.b(h, "period_count");
            int b19 = dmk.b(h, "generation");
            int b20 = dmk.b(h, "next_schedule_time_override");
            int b21 = dmk.b(h, "next_schedule_time_override_generation");
            int b22 = dmk.b(h, "stop_reason");
            int b23 = dmk.b(h, "trace_tag");
            int b24 = dmk.b(h, "required_network_type");
            int b25 = dmk.b(h, "required_network_request");
            int b26 = dmk.b(h, "requires_charging");
            int b27 = dmk.b(h, "requires_device_idle");
            int b28 = dmk.b(h, "requires_battery_not_low");
            int b29 = dmk.b(h, "requires_storage_not_low");
            int b30 = dmk.b(h, "trigger_content_update_delay");
            int b31 = dmk.b(h, "trigger_max_content_delay");
            int b32 = dmk.b(h, "content_uri_triggers");
            int i2 = b14;
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                String string = h.getString(b);
                WorkInfo.State f = hyx0.f(h.getInt(b2));
                String string2 = h.getString(b3);
                String string3 = h.getString(b4);
                Data a = Data.a(h.getBlob(b5));
                Data a2 = Data.a(h.getBlob(b6));
                long j = h.getLong(b7);
                long j2 = h.getLong(b8);
                long j3 = h.getLong(b9);
                int i3 = h.getInt(b10);
                BackoffPolicy c2 = hyx0.c(h.getInt(b11));
                long j4 = h.getLong(b12);
                long j5 = h.getLong(b13);
                int i4 = i2;
                long j6 = h.getLong(i4);
                int i5 = b12;
                int i6 = b15;
                long j7 = h.getLong(i6);
                b15 = i6;
                int i7 = b16;
                boolean z = h.getInt(i7) != 0;
                b16 = i7;
                int i8 = b17;
                OutOfQuotaPolicy e = hyx0.e(h.getInt(i8));
                b17 = i8;
                int i9 = b18;
                int i10 = h.getInt(i9);
                b18 = i9;
                int i11 = b19;
                int i12 = h.getInt(i11);
                b19 = i11;
                int i13 = b20;
                long j8 = h.getLong(i13);
                b20 = i13;
                int i14 = b21;
                int i15 = h.getInt(i14);
                b21 = i14;
                int i16 = b22;
                int i17 = h.getInt(i16);
                b22 = i16;
                int i18 = b23;
                String string4 = h.isNull(i18) ? null : h.getString(i18);
                b23 = i18;
                int i19 = b24;
                NetworkType d = hyx0.d(h.getInt(i19));
                b24 = i19;
                int i20 = b25;
                b560 j9 = hyx0.j(h.getBlob(i20));
                b25 = i20;
                int i21 = b26;
                boolean z2 = h.getInt(i21) != 0;
                b26 = i21;
                int i22 = b27;
                boolean z3 = h.getInt(i22) != 0;
                b27 = i22;
                int i23 = b28;
                boolean z4 = h.getInt(i23) != 0;
                b28 = i23;
                int i24 = b29;
                boolean z5 = h.getInt(i24) != 0;
                b29 = i24;
                int i25 = b30;
                long j10 = h.getLong(i25);
                b30 = i25;
                int i26 = b31;
                long j11 = h.getLong(i26);
                b31 = i26;
                int i27 = b32;
                b32 = i27;
                arrayList.add(new fxx0(string, f, string2, string3, a, a2, j, j2, j3, new p6j(j9, d, z2, z3, z4, z5, j10, j11, hyx0.a(h.getBlob(i27))), i3, c2, j4, j5, j6, j7, z, e, i10, i12, j8, i15, i17, string4));
                b12 = i5;
                i2 = i4;
            }
            h.close();
            dmg0Var.n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            h.close();
            dmg0Var.n();
            throw th;
        }
    }

    @Override // xsna.gxx0
    public final int D(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        zxx0 zxx0Var = this.j;
        zin0 a = zxx0Var.a();
        a.bindString(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int executeUpdateDelete = a.executeUpdateDelete();
                workDatabase_Impl.w();
                return executeUpdateDelete;
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            zxx0Var.d(a);
        }
    }

    public final void a(@NonNull HashMap<String, ArrayList<Data>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            fto0.q(hashMap, new a2e(this, 2));
            return;
        }
        StringBuilder e = fw3.e("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        e370.c(size, e);
        e.append(")");
        dmg0 c = dmg0.c(size, e.toString());
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            c.bindString(i, it.next());
            i++;
        }
        Cursor h = u370.h(this.a, c, false);
        try {
            int a = dmk.a(h, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (h.moveToNext()) {
                ArrayList<Data> arrayList = hashMap.get(h.getString(a));
                if (arrayList != null) {
                    arrayList.add(Data.a(h.getBlob(0)));
                }
            }
        } finally {
            h.close();
        }
    }

    public final void b(@NonNull HashMap<String, ArrayList<String>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            fto0.q(hashMap, new gq40(this, 2));
            return;
        }
        StringBuilder e = fw3.e("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        e370.c(size, e);
        e.append(")");
        dmg0 c = dmg0.c(size, e.toString());
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            c.bindString(i, it.next());
            i++;
        }
        Cursor h = u370.h(this.a, c, false);
        try {
            int a = dmk.a(h, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (h.moveToNext()) {
                ArrayList<String> arrayList = hashMap.get(h.getString(a));
                if (arrayList != null) {
                    arrayList.add(h.getString(0));
                }
            }
        } finally {
            h.close();
        }
    }

    @Override // xsna.gxx0
    public final void c(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        oxx0 oxx0Var = this.o;
        zin0 a = oxx0Var.a();
        a.bindLong(1, i);
        a.bindString(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            oxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final WorkInfo.State d(String str) {
        dmg0 c = dmg0.c(1, "SELECT state FROM workspec WHERE id=?");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            WorkInfo.State state = null;
            if (h.moveToFirst()) {
                Integer valueOf = h.isNull(0) ? null : Integer.valueOf(h.getInt(0));
                if (valueOf != null) {
                    state = hyx0.f(valueOf.intValue());
                }
            }
            return state;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.gxx0
    public final void delete(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        txx0 txx0Var = this.d;
        zin0 a = txx0Var.a();
        a.bindString(1, str);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            txx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        vxx0 vxx0Var = this.f;
        zin0 a = vxx0Var.a();
        a.bindString(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int executeUpdateDelete = a.executeUpdateDelete();
                workDatabase_Impl.w();
                return executeUpdateDelete;
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            vxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final ArrayList f(String str) {
        dmg0 c = dmg0.c(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                arrayList.add(Data.a(h.getBlob(0)));
            }
            return arrayList;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.gxx0
    public final void g(fxx0 fxx0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(fxx0Var);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.q();
        }
    }

    @Override // xsna.gxx0
    public final int h(WorkInfo.State state, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        uxx0 uxx0Var = this.e;
        zin0 a = uxx0Var.a();
        a.bindLong(1, hyx0.i(state));
        a.bindString(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int executeUpdateDelete = a.executeUpdateDelete();
                workDatabase_Impl.w();
                return executeUpdateDelete;
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            uxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final int i(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        hxx0 hxx0Var = this.k;
        zin0 a = hxx0Var.a();
        a.bindString(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int executeUpdateDelete = a.executeUpdateDelete();
                workDatabase_Impl.w();
                return executeUpdateDelete;
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            hxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final fxx0 j(String str) {
        dmg0 dmg0Var;
        dmg0 c = dmg0.c(1, "SELECT * FROM workspec WHERE id=?");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            int b = dmk.b(h, "id");
            int b2 = dmk.b(h, "state");
            int b3 = dmk.b(h, "worker_class_name");
            int b4 = dmk.b(h, "input_merger_class_name");
            int b5 = dmk.b(h, "input");
            int b6 = dmk.b(h, "output");
            int b7 = dmk.b(h, "initial_delay");
            int b8 = dmk.b(h, "interval_duration");
            int b9 = dmk.b(h, "flex_duration");
            int b10 = dmk.b(h, "run_attempt_count");
            int b11 = dmk.b(h, "backoff_policy");
            int b12 = dmk.b(h, "backoff_delay_duration");
            int b13 = dmk.b(h, "last_enqueue_time");
            dmg0Var = c;
            try {
                int b14 = dmk.b(h, "minimum_retention_duration");
                int b15 = dmk.b(h, "schedule_requested_at");
                int b16 = dmk.b(h, "run_in_foreground");
                int b17 = dmk.b(h, "out_of_quota_policy");
                int b18 = dmk.b(h, "period_count");
                int b19 = dmk.b(h, "generation");
                int b20 = dmk.b(h, "next_schedule_time_override");
                int b21 = dmk.b(h, "next_schedule_time_override_generation");
                int b22 = dmk.b(h, "stop_reason");
                int b23 = dmk.b(h, "trace_tag");
                int b24 = dmk.b(h, "required_network_type");
                int b25 = dmk.b(h, "required_network_request");
                int b26 = dmk.b(h, "requires_charging");
                int b27 = dmk.b(h, "requires_device_idle");
                int b28 = dmk.b(h, "requires_battery_not_low");
                int b29 = dmk.b(h, "requires_storage_not_low");
                int b30 = dmk.b(h, "trigger_content_update_delay");
                int b31 = dmk.b(h, "trigger_max_content_delay");
                int b32 = dmk.b(h, "content_uri_triggers");
                fxx0 fxx0Var = null;
                if (h.moveToFirst()) {
                    fxx0Var = new fxx0(h.getString(b), hyx0.f(h.getInt(b2)), h.getString(b3), h.getString(b4), Data.a(h.getBlob(b5)), Data.a(h.getBlob(b6)), h.getLong(b7), h.getLong(b8), h.getLong(b9), new p6j(hyx0.j(h.getBlob(b25)), hyx0.d(h.getInt(b24)), h.getInt(b26) != 0, h.getInt(b27) != 0, h.getInt(b28) != 0, h.getInt(b29) != 0, h.getLong(b30), h.getLong(b31), hyx0.a(h.getBlob(b32))), h.getInt(b10), hyx0.c(h.getInt(b11)), h.getLong(b12), h.getLong(b13), h.getLong(b14), h.getLong(b15), h.getInt(b16) != 0, hyx0.e(h.getInt(b17)), h.getInt(b18), h.getInt(b19), h.getLong(b20), h.getInt(b21), h.getInt(b22), h.isNull(b23) ? null : h.getString(b23));
                }
                h.close();
                dmg0Var.n();
                return fxx0Var;
            } catch (Throwable th) {
                th = th;
                h.close();
                dmg0Var.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dmg0Var = c;
        }
    }

    @Override // xsna.gxx0
    public final int k() {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        lxx0 lxx0Var = this.n;
        zin0 a = lxx0Var.a();
        try {
            workDatabase_Impl.c();
            try {
                int executeUpdateDelete = a.executeUpdateDelete();
                workDatabase_Impl.w();
                return executeUpdateDelete;
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            lxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final void l(String str, Data data) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        xxx0 xxx0Var = this.h;
        zin0 a = xxx0Var.a();
        Data data2 = Data.b;
        a.bindBlob(1, Data.b.b(data));
        a.bindString(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            xxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final ArrayList m() {
        dmg0 dmg0Var;
        dmg0 c = dmg0.c(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            int b = dmk.b(h, "id");
            int b2 = dmk.b(h, "state");
            int b3 = dmk.b(h, "worker_class_name");
            int b4 = dmk.b(h, "input_merger_class_name");
            int b5 = dmk.b(h, "input");
            int b6 = dmk.b(h, "output");
            int b7 = dmk.b(h, "initial_delay");
            int b8 = dmk.b(h, "interval_duration");
            int b9 = dmk.b(h, "flex_duration");
            int b10 = dmk.b(h, "run_attempt_count");
            int b11 = dmk.b(h, "backoff_policy");
            int b12 = dmk.b(h, "backoff_delay_duration");
            int b13 = dmk.b(h, "last_enqueue_time");
            dmg0Var = c;
            try {
                int b14 = dmk.b(h, "minimum_retention_duration");
                int b15 = dmk.b(h, "schedule_requested_at");
                int b16 = dmk.b(h, "run_in_foreground");
                int b17 = dmk.b(h, "out_of_quota_policy");
                int b18 = dmk.b(h, "period_count");
                int b19 = dmk.b(h, "generation");
                int b20 = dmk.b(h, "next_schedule_time_override");
                int b21 = dmk.b(h, "next_schedule_time_override_generation");
                int b22 = dmk.b(h, "stop_reason");
                int b23 = dmk.b(h, "trace_tag");
                int b24 = dmk.b(h, "required_network_type");
                int b25 = dmk.b(h, "required_network_request");
                int b26 = dmk.b(h, "requires_charging");
                int b27 = dmk.b(h, "requires_device_idle");
                int b28 = dmk.b(h, "requires_battery_not_low");
                int b29 = dmk.b(h, "requires_storage_not_low");
                int b30 = dmk.b(h, "trigger_content_update_delay");
                int b31 = dmk.b(h, "trigger_max_content_delay");
                int b32 = dmk.b(h, "content_uri_triggers");
                int i = b14;
                ArrayList arrayList = new ArrayList(h.getCount());
                while (h.moveToNext()) {
                    String string = h.getString(b);
                    WorkInfo.State f = hyx0.f(h.getInt(b2));
                    String string2 = h.getString(b3);
                    String string3 = h.getString(b4);
                    Data a = Data.a(h.getBlob(b5));
                    Data a2 = Data.a(h.getBlob(b6));
                    long j = h.getLong(b7);
                    long j2 = h.getLong(b8);
                    long j3 = h.getLong(b9);
                    int i2 = h.getInt(b10);
                    BackoffPolicy c2 = hyx0.c(h.getInt(b11));
                    long j4 = h.getLong(b12);
                    long j5 = h.getLong(b13);
                    int i3 = i;
                    long j6 = h.getLong(i3);
                    int i4 = b13;
                    int i5 = b15;
                    long j7 = h.getLong(i5);
                    b15 = i5;
                    int i6 = b16;
                    boolean z = h.getInt(i6) != 0;
                    b16 = i6;
                    int i7 = b17;
                    OutOfQuotaPolicy e = hyx0.e(h.getInt(i7));
                    b17 = i7;
                    int i8 = b18;
                    int i9 = h.getInt(i8);
                    b18 = i8;
                    int i10 = b19;
                    int i11 = h.getInt(i10);
                    b19 = i10;
                    int i12 = b20;
                    long j8 = h.getLong(i12);
                    b20 = i12;
                    int i13 = b21;
                    int i14 = h.getInt(i13);
                    b21 = i13;
                    int i15 = b22;
                    int i16 = h.getInt(i15);
                    b22 = i15;
                    int i17 = b23;
                    String string4 = h.isNull(i17) ? null : h.getString(i17);
                    b23 = i17;
                    int i18 = b24;
                    NetworkType d = hyx0.d(h.getInt(i18));
                    b24 = i18;
                    int i19 = b25;
                    b560 j9 = hyx0.j(h.getBlob(i19));
                    b25 = i19;
                    int i20 = b26;
                    boolean z2 = h.getInt(i20) != 0;
                    b26 = i20;
                    int i21 = b27;
                    boolean z3 = h.getInt(i21) != 0;
                    b27 = i21;
                    int i22 = b28;
                    boolean z4 = h.getInt(i22) != 0;
                    b28 = i22;
                    int i23 = b29;
                    boolean z5 = h.getInt(i23) != 0;
                    b29 = i23;
                    int i24 = b30;
                    long j10 = h.getLong(i24);
                    b30 = i24;
                    int i25 = b31;
                    long j11 = h.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    b32 = i26;
                    arrayList.add(new fxx0(string, f, string2, string3, a, a2, j, j2, j3, new p6j(j9, d, z2, z3, z4, z5, j10, j11, hyx0.a(h.getBlob(i26))), i2, c2, j4, j5, j6, j7, z, e, i9, i11, j8, i14, i16, string4));
                    b13 = i4;
                    i = i3;
                }
                h.close();
                dmg0Var.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                h.close();
                dmg0Var.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dmg0Var = c;
        }
    }

    @Override // xsna.gxx0
    public final ArrayList n(String str) {
        dmg0 c = dmg0.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                arrayList.add(h.getString(0));
            }
            return arrayList;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.gxx0
    public final ArrayList o(String str) {
        dmg0 c = dmg0.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        c.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                arrayList.add(h.getString(0));
            }
            return arrayList;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.gxx0
    public final void p(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        yxx0 yxx0Var = this.i;
        zin0 a = yxx0Var.a();
        a.bindLong(1, j);
        a.bindString(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            yxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final ArrayList q() {
        dmg0 dmg0Var;
        dmg0 c = dmg0.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            int b = dmk.b(h, "id");
            int b2 = dmk.b(h, "state");
            int b3 = dmk.b(h, "worker_class_name");
            int b4 = dmk.b(h, "input_merger_class_name");
            int b5 = dmk.b(h, "input");
            int b6 = dmk.b(h, "output");
            int b7 = dmk.b(h, "initial_delay");
            int b8 = dmk.b(h, "interval_duration");
            int b9 = dmk.b(h, "flex_duration");
            int b10 = dmk.b(h, "run_attempt_count");
            int b11 = dmk.b(h, "backoff_policy");
            int b12 = dmk.b(h, "backoff_delay_duration");
            int b13 = dmk.b(h, "last_enqueue_time");
            dmg0Var = c;
            try {
                int b14 = dmk.b(h, "minimum_retention_duration");
                int b15 = dmk.b(h, "schedule_requested_at");
                int b16 = dmk.b(h, "run_in_foreground");
                int b17 = dmk.b(h, "out_of_quota_policy");
                int b18 = dmk.b(h, "period_count");
                int b19 = dmk.b(h, "generation");
                int b20 = dmk.b(h, "next_schedule_time_override");
                int b21 = dmk.b(h, "next_schedule_time_override_generation");
                int b22 = dmk.b(h, "stop_reason");
                int b23 = dmk.b(h, "trace_tag");
                int b24 = dmk.b(h, "required_network_type");
                int b25 = dmk.b(h, "required_network_request");
                int b26 = dmk.b(h, "requires_charging");
                int b27 = dmk.b(h, "requires_device_idle");
                int b28 = dmk.b(h, "requires_battery_not_low");
                int b29 = dmk.b(h, "requires_storage_not_low");
                int b30 = dmk.b(h, "trigger_content_update_delay");
                int b31 = dmk.b(h, "trigger_max_content_delay");
                int b32 = dmk.b(h, "content_uri_triggers");
                int i = b14;
                ArrayList arrayList = new ArrayList(h.getCount());
                while (h.moveToNext()) {
                    String string = h.getString(b);
                    WorkInfo.State f = hyx0.f(h.getInt(b2));
                    String string2 = h.getString(b3);
                    String string3 = h.getString(b4);
                    Data a = Data.a(h.getBlob(b5));
                    Data a2 = Data.a(h.getBlob(b6));
                    long j = h.getLong(b7);
                    long j2 = h.getLong(b8);
                    long j3 = h.getLong(b9);
                    int i2 = h.getInt(b10);
                    BackoffPolicy c2 = hyx0.c(h.getInt(b11));
                    long j4 = h.getLong(b12);
                    long j5 = h.getLong(b13);
                    int i3 = i;
                    long j6 = h.getLong(i3);
                    int i4 = b13;
                    int i5 = b15;
                    long j7 = h.getLong(i5);
                    b15 = i5;
                    int i6 = b16;
                    boolean z = h.getInt(i6) != 0;
                    b16 = i6;
                    int i7 = b17;
                    OutOfQuotaPolicy e = hyx0.e(h.getInt(i7));
                    b17 = i7;
                    int i8 = b18;
                    int i9 = h.getInt(i8);
                    b18 = i8;
                    int i10 = b19;
                    int i11 = h.getInt(i10);
                    b19 = i10;
                    int i12 = b20;
                    long j8 = h.getLong(i12);
                    b20 = i12;
                    int i13 = b21;
                    int i14 = h.getInt(i13);
                    b21 = i13;
                    int i15 = b22;
                    int i16 = h.getInt(i15);
                    b22 = i15;
                    int i17 = b23;
                    String string4 = h.isNull(i17) ? null : h.getString(i17);
                    b23 = i17;
                    int i18 = b24;
                    NetworkType d = hyx0.d(h.getInt(i18));
                    b24 = i18;
                    int i19 = b25;
                    b560 j9 = hyx0.j(h.getBlob(i19));
                    b25 = i19;
                    int i20 = b26;
                    boolean z2 = h.getInt(i20) != 0;
                    b26 = i20;
                    int i21 = b27;
                    boolean z3 = h.getInt(i21) != 0;
                    b27 = i21;
                    int i22 = b28;
                    boolean z4 = h.getInt(i22) != 0;
                    b28 = i22;
                    int i23 = b29;
                    boolean z5 = h.getInt(i23) != 0;
                    b29 = i23;
                    int i24 = b30;
                    long j10 = h.getLong(i24);
                    b30 = i24;
                    int i25 = b31;
                    long j11 = h.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    b32 = i26;
                    arrayList.add(new fxx0(string, f, string2, string3, a, a2, j, j2, j3, new p6j(j9, d, z2, z3, z4, z5, j10, j11, hyx0.a(h.getBlob(i26))), i2, c2, j4, j5, j6, j7, z, e, i9, i11, j8, i14, i16, string4));
                    b13 = i4;
                    i = i3;
                }
                h.close();
                dmg0Var.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                h.close();
                dmg0Var.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dmg0Var = c;
        }
    }

    @Override // xsna.gxx0
    public final ulg0 r(List list) {
        StringBuilder e = fw3.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        e370.c(size, e);
        e.append(")");
        dmg0 c = dmg0.c(size, e.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            c.bindString(i, (String) it.next());
            i++;
        }
        androidx.room.e eVar = this.a.g;
        if (eVar == null) {
            eVar = null;
        }
        String[] strArr = {"WorkTag", "WorkProgress", "workspec"};
        pxx0 pxx0Var = new pxx0(this, c);
        eVar.c.g(strArr);
        pkg pkgVar = eVar.h;
        return new ulg0((RoomDatabase) pkgVar.b, pkgVar, strArr, pxx0Var);
    }

    @Override // xsna.gxx0
    public final int s() {
        dmg0 c = dmg0.c(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            return h.moveToFirst() ? h.getInt(0) : 0;
        } finally {
            h.close();
            c.n();
        }
    }

    @Override // xsna.gxx0
    public final void t(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        wxx0 wxx0Var = this.g;
        zin0 a = wxx0Var.a();
        a.bindString(1, str);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            wxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final int u(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        kxx0 kxx0Var = this.m;
        zin0 a = kxx0Var.a();
        a.bindLong(1, j);
        a.bindString(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int executeUpdateDelete = a.executeUpdateDelete();
                workDatabase_Impl.w();
                return executeUpdateDelete;
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            kxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final ArrayList v(long j) {
        dmg0 dmg0Var;
        int b;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        dmg0 c = dmg0.c(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c.bindLong(1, j);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            b = dmk.b(h, "id");
            b2 = dmk.b(h, "state");
            b3 = dmk.b(h, "worker_class_name");
            b4 = dmk.b(h, "input_merger_class_name");
            b5 = dmk.b(h, "input");
            b6 = dmk.b(h, "output");
            b7 = dmk.b(h, "initial_delay");
            b8 = dmk.b(h, "interval_duration");
            b9 = dmk.b(h, "flex_duration");
            b10 = dmk.b(h, "run_attempt_count");
            b11 = dmk.b(h, "backoff_policy");
            b12 = dmk.b(h, "backoff_delay_duration");
            b13 = dmk.b(h, "last_enqueue_time");
            dmg0Var = c;
        } catch (Throwable th) {
            th = th;
            dmg0Var = c;
        }
        try {
            int b14 = dmk.b(h, "minimum_retention_duration");
            int b15 = dmk.b(h, "schedule_requested_at");
            int b16 = dmk.b(h, "run_in_foreground");
            int b17 = dmk.b(h, "out_of_quota_policy");
            int b18 = dmk.b(h, "period_count");
            int b19 = dmk.b(h, "generation");
            int b20 = dmk.b(h, "next_schedule_time_override");
            int b21 = dmk.b(h, "next_schedule_time_override_generation");
            int b22 = dmk.b(h, "stop_reason");
            int b23 = dmk.b(h, "trace_tag");
            int b24 = dmk.b(h, "required_network_type");
            int b25 = dmk.b(h, "required_network_request");
            int b26 = dmk.b(h, "requires_charging");
            int b27 = dmk.b(h, "requires_device_idle");
            int b28 = dmk.b(h, "requires_battery_not_low");
            int b29 = dmk.b(h, "requires_storage_not_low");
            int b30 = dmk.b(h, "trigger_content_update_delay");
            int b31 = dmk.b(h, "trigger_max_content_delay");
            int b32 = dmk.b(h, "content_uri_triggers");
            int i = b14;
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                String string = h.getString(b);
                WorkInfo.State f = hyx0.f(h.getInt(b2));
                String string2 = h.getString(b3);
                String string3 = h.getString(b4);
                Data a = Data.a(h.getBlob(b5));
                Data a2 = Data.a(h.getBlob(b6));
                long j2 = h.getLong(b7);
                long j3 = h.getLong(b8);
                long j4 = h.getLong(b9);
                int i2 = h.getInt(b10);
                BackoffPolicy c2 = hyx0.c(h.getInt(b11));
                long j5 = h.getLong(b12);
                long j6 = h.getLong(b13);
                int i3 = i;
                long j7 = h.getLong(i3);
                int i4 = b12;
                int i5 = b15;
                long j8 = h.getLong(i5);
                b15 = i5;
                int i6 = b16;
                boolean z = h.getInt(i6) != 0;
                b16 = i6;
                int i7 = b17;
                OutOfQuotaPolicy e = hyx0.e(h.getInt(i7));
                b17 = i7;
                int i8 = b18;
                int i9 = h.getInt(i8);
                b18 = i8;
                int i10 = b19;
                int i11 = h.getInt(i10);
                b19 = i10;
                int i12 = b20;
                long j9 = h.getLong(i12);
                b20 = i12;
                int i13 = b21;
                int i14 = h.getInt(i13);
                b21 = i13;
                int i15 = b22;
                int i16 = h.getInt(i15);
                b22 = i15;
                int i17 = b23;
                String string4 = h.isNull(i17) ? null : h.getString(i17);
                b23 = i17;
                int i18 = b24;
                NetworkType d = hyx0.d(h.getInt(i18));
                b24 = i18;
                int i19 = b25;
                b560 j10 = hyx0.j(h.getBlob(i19));
                b25 = i19;
                int i20 = b26;
                boolean z2 = h.getInt(i20) != 0;
                b26 = i20;
                int i21 = b27;
                boolean z3 = h.getInt(i21) != 0;
                b27 = i21;
                int i22 = b28;
                boolean z4 = h.getInt(i22) != 0;
                b28 = i22;
                int i23 = b29;
                boolean z5 = h.getInt(i23) != 0;
                b29 = i23;
                int i24 = b30;
                long j11 = h.getLong(i24);
                b30 = i24;
                int i25 = b31;
                long j12 = h.getLong(i25);
                b31 = i25;
                int i26 = b32;
                b32 = i26;
                arrayList.add(new fxx0(string, f, string2, string3, a, a2, j2, j3, j4, new p6j(j10, d, z2, z3, z4, z5, j11, j12, hyx0.a(h.getBlob(i26))), i2, c2, j5, j6, j7, j8, z, e, i9, i11, j9, i14, i16, string4));
                b12 = i4;
                i = i3;
            }
            h.close();
            dmg0Var.n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            h.close();
            dmg0Var.n();
            throw th;
        }
    }

    @Override // xsna.gxx0
    public final void w(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        jxx0 jxx0Var = this.l;
        zin0 a = jxx0Var.a();
        a.bindString(1, str);
        a.bindLong(2, i);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            jxx0Var.d(a);
        }
    }

    @Override // xsna.gxx0
    public final ArrayList x() {
        dmg0 dmg0Var;
        dmg0 c = dmg0.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            int b = dmk.b(h, "id");
            int b2 = dmk.b(h, "state");
            int b3 = dmk.b(h, "worker_class_name");
            int b4 = dmk.b(h, "input_merger_class_name");
            int b5 = dmk.b(h, "input");
            int b6 = dmk.b(h, "output");
            int b7 = dmk.b(h, "initial_delay");
            int b8 = dmk.b(h, "interval_duration");
            int b9 = dmk.b(h, "flex_duration");
            int b10 = dmk.b(h, "run_attempt_count");
            int b11 = dmk.b(h, "backoff_policy");
            int b12 = dmk.b(h, "backoff_delay_duration");
            int b13 = dmk.b(h, "last_enqueue_time");
            dmg0Var = c;
            try {
                int b14 = dmk.b(h, "minimum_retention_duration");
                int b15 = dmk.b(h, "schedule_requested_at");
                int b16 = dmk.b(h, "run_in_foreground");
                int b17 = dmk.b(h, "out_of_quota_policy");
                int b18 = dmk.b(h, "period_count");
                int b19 = dmk.b(h, "generation");
                int b20 = dmk.b(h, "next_schedule_time_override");
                int b21 = dmk.b(h, "next_schedule_time_override_generation");
                int b22 = dmk.b(h, "stop_reason");
                int b23 = dmk.b(h, "trace_tag");
                int b24 = dmk.b(h, "required_network_type");
                int b25 = dmk.b(h, "required_network_request");
                int b26 = dmk.b(h, "requires_charging");
                int b27 = dmk.b(h, "requires_device_idle");
                int b28 = dmk.b(h, "requires_battery_not_low");
                int b29 = dmk.b(h, "requires_storage_not_low");
                int b30 = dmk.b(h, "trigger_content_update_delay");
                int b31 = dmk.b(h, "trigger_max_content_delay");
                int b32 = dmk.b(h, "content_uri_triggers");
                int i = b14;
                ArrayList arrayList = new ArrayList(h.getCount());
                while (h.moveToNext()) {
                    String string = h.getString(b);
                    WorkInfo.State f = hyx0.f(h.getInt(b2));
                    String string2 = h.getString(b3);
                    String string3 = h.getString(b4);
                    Data a = Data.a(h.getBlob(b5));
                    Data a2 = Data.a(h.getBlob(b6));
                    long j = h.getLong(b7);
                    long j2 = h.getLong(b8);
                    long j3 = h.getLong(b9);
                    int i2 = h.getInt(b10);
                    BackoffPolicy c2 = hyx0.c(h.getInt(b11));
                    long j4 = h.getLong(b12);
                    long j5 = h.getLong(b13);
                    int i3 = i;
                    long j6 = h.getLong(i3);
                    int i4 = b13;
                    int i5 = b15;
                    long j7 = h.getLong(i5);
                    b15 = i5;
                    int i6 = b16;
                    boolean z = h.getInt(i6) != 0;
                    b16 = i6;
                    int i7 = b17;
                    OutOfQuotaPolicy e = hyx0.e(h.getInt(i7));
                    b17 = i7;
                    int i8 = b18;
                    int i9 = h.getInt(i8);
                    b18 = i8;
                    int i10 = b19;
                    int i11 = h.getInt(i10);
                    b19 = i10;
                    int i12 = b20;
                    long j8 = h.getLong(i12);
                    b20 = i12;
                    int i13 = b21;
                    int i14 = h.getInt(i13);
                    b21 = i13;
                    int i15 = b22;
                    int i16 = h.getInt(i15);
                    b22 = i15;
                    int i17 = b23;
                    String string4 = h.isNull(i17) ? null : h.getString(i17);
                    b23 = i17;
                    int i18 = b24;
                    NetworkType d = hyx0.d(h.getInt(i18));
                    b24 = i18;
                    int i19 = b25;
                    b560 j9 = hyx0.j(h.getBlob(i19));
                    b25 = i19;
                    int i20 = b26;
                    boolean z2 = h.getInt(i20) != 0;
                    b26 = i20;
                    int i21 = b27;
                    boolean z3 = h.getInt(i21) != 0;
                    b27 = i21;
                    int i22 = b28;
                    boolean z4 = h.getInt(i22) != 0;
                    b28 = i22;
                    int i23 = b29;
                    boolean z5 = h.getInt(i23) != 0;
                    b29 = i23;
                    int i24 = b30;
                    long j10 = h.getLong(i24);
                    b30 = i24;
                    int i25 = b31;
                    long j11 = h.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    b32 = i26;
                    arrayList.add(new fxx0(string, f, string2, string3, a, a2, j, j2, j3, new p6j(j9, d, z2, z3, z4, z5, j10, j11, hyx0.a(h.getBlob(i26))), i2, c2, j4, j5, j6, j7, z, e, i9, i11, j8, i14, i16, string4));
                    b13 = i4;
                    i = i3;
                }
                h.close();
                dmg0Var.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                h.close();
                dmg0Var.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dmg0Var = c;
        }
    }

    @Override // xsna.gxx0
    public final ArrayList y() {
        dmg0 dmg0Var;
        int b;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        dmg0 c = dmg0.c(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c.bindLong(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor h = u370.h(workDatabase_Impl, c, false);
        try {
            b = dmk.b(h, "id");
            b2 = dmk.b(h, "state");
            b3 = dmk.b(h, "worker_class_name");
            b4 = dmk.b(h, "input_merger_class_name");
            b5 = dmk.b(h, "input");
            b6 = dmk.b(h, "output");
            b7 = dmk.b(h, "initial_delay");
            b8 = dmk.b(h, "interval_duration");
            b9 = dmk.b(h, "flex_duration");
            b10 = dmk.b(h, "run_attempt_count");
            b11 = dmk.b(h, "backoff_policy");
            b12 = dmk.b(h, "backoff_delay_duration");
            b13 = dmk.b(h, "last_enqueue_time");
            dmg0Var = c;
        } catch (Throwable th) {
            th = th;
            dmg0Var = c;
        }
        try {
            int b14 = dmk.b(h, "minimum_retention_duration");
            int b15 = dmk.b(h, "schedule_requested_at");
            int b16 = dmk.b(h, "run_in_foreground");
            int b17 = dmk.b(h, "out_of_quota_policy");
            int b18 = dmk.b(h, "period_count");
            int b19 = dmk.b(h, "generation");
            int b20 = dmk.b(h, "next_schedule_time_override");
            int b21 = dmk.b(h, "next_schedule_time_override_generation");
            int b22 = dmk.b(h, "stop_reason");
            int b23 = dmk.b(h, "trace_tag");
            int b24 = dmk.b(h, "required_network_type");
            int b25 = dmk.b(h, "required_network_request");
            int b26 = dmk.b(h, "requires_charging");
            int b27 = dmk.b(h, "requires_device_idle");
            int b28 = dmk.b(h, "requires_battery_not_low");
            int b29 = dmk.b(h, "requires_storage_not_low");
            int b30 = dmk.b(h, "trigger_content_update_delay");
            int b31 = dmk.b(h, "trigger_max_content_delay");
            int b32 = dmk.b(h, "content_uri_triggers");
            int i = b14;
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                String string = h.getString(b);
                WorkInfo.State f = hyx0.f(h.getInt(b2));
                String string2 = h.getString(b3);
                String string3 = h.getString(b4);
                Data a = Data.a(h.getBlob(b5));
                Data a2 = Data.a(h.getBlob(b6));
                long j = h.getLong(b7);
                long j2 = h.getLong(b8);
                long j3 = h.getLong(b9);
                int i2 = h.getInt(b10);
                BackoffPolicy c2 = hyx0.c(h.getInt(b11));
                long j4 = h.getLong(b12);
                long j5 = h.getLong(b13);
                int i3 = i;
                long j6 = h.getLong(i3);
                int i4 = b12;
                int i5 = b15;
                long j7 = h.getLong(i5);
                b15 = i5;
                int i6 = b16;
                boolean z = h.getInt(i6) != 0;
                b16 = i6;
                int i7 = b17;
                OutOfQuotaPolicy e = hyx0.e(h.getInt(i7));
                b17 = i7;
                int i8 = b18;
                int i9 = h.getInt(i8);
                b18 = i8;
                int i10 = b19;
                int i11 = h.getInt(i10);
                b19 = i10;
                int i12 = b20;
                long j8 = h.getLong(i12);
                b20 = i12;
                int i13 = b21;
                int i14 = h.getInt(i13);
                b21 = i13;
                int i15 = b22;
                int i16 = h.getInt(i15);
                b22 = i15;
                int i17 = b23;
                String string4 = h.isNull(i17) ? null : h.getString(i17);
                b23 = i17;
                int i18 = b24;
                NetworkType d = hyx0.d(h.getInt(i18));
                b24 = i18;
                int i19 = b25;
                b560 j9 = hyx0.j(h.getBlob(i19));
                b25 = i19;
                int i20 = b26;
                boolean z2 = h.getInt(i20) != 0;
                b26 = i20;
                int i21 = b27;
                boolean z3 = h.getInt(i21) != 0;
                b27 = i21;
                int i22 = b28;
                boolean z4 = h.getInt(i22) != 0;
                b28 = i22;
                int i23 = b29;
                boolean z5 = h.getInt(i23) != 0;
                b29 = i23;
                int i24 = b30;
                long j10 = h.getLong(i24);
                b30 = i24;
                int i25 = b31;
                long j11 = h.getLong(i25);
                b31 = i25;
                int i26 = b32;
                b32 = i26;
                arrayList.add(new fxx0(string, f, string2, string3, a, a2, j, j2, j3, new p6j(j9, d, z2, z3, z4, z5, j10, j11, hyx0.a(h.getBlob(i26))), i2, c2, j4, j5, j6, j7, z, e, i9, i11, j8, i14, i16, string4));
                b12 = i4;
                i = i3;
            }
            h.close();
            dmg0Var.n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            h.close();
            dmg0Var.n();
            throw th;
        }
    }

    @Override // xsna.gxx0
    public final void z(fxx0 fxx0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.c.j(fxx0Var);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.q();
        }
    }
}
