package defpackage;

import android.net.wifi.ScanResult;
import android.os.SystemClock;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.room.util.a;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final /* synthetic */ class brd implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ brd(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        is60 is60Var;
        ull0 T0;
        WorkInfo$State workInfo$State;
        fa51 fa51Var;
        Boolean bool;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(jl40.l(((PersonalAccount) obj).a, this.b));
            case 1:
                String str = this.b;
                ju60 ju60Var = prx0.a;
                synchronized (ju60Var.a) {
                    is60Var = new is60(str);
                    ju60Var.a.add(is60Var);
                }
                return is60Var;
            case 2:
                String str2 = this.b;
                T0 = ((oll0) obj).T0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    T0.g1(1, str2);
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                le00 le00Var = new le00(new eot(this.b), qoi0.e(eot.class));
                wy40 wy40Var = ((fe00) obj).a;
                int i = wy40Var.b + 1;
                Object[] objArr = wy40Var.a;
                if (objArr.length < i) {
                    int length = objArr.length;
                    Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    wy40Var.a = objArr2;
                }
                Object[] objArr3 = wy40Var.a;
                int i2 = wy40Var.b;
                objArr3[i2] = le00Var;
                wy40Var.b = i2 + 1;
                return zy11.a;
            case 4:
                le00 le00Var2 = new le00(new bot(this.b), qoi0.e(bot.class));
                wy40 wy40Var2 = ((fe00) obj).a;
                int i3 = wy40Var2.b + 1;
                Object[] objArr4 = wy40Var2.a;
                if (objArr4.length < i3) {
                    int length2 = objArr4.length;
                    Object[] objArr5 = new Object[Math.max(i3, (length2 * 3) / 2)];
                    System.arraycopy(objArr4, 0, objArr5, 0, length2);
                    wy40Var2.a = objArr5;
                }
                Object[] objArr6 = wy40Var2.a;
                int i4 = wy40Var2.b;
                objArr6[i4] = le00Var2;
                wy40Var2.b = i4 + 1;
                return zy11.a;
            case 5:
                return Boolean.valueOf(jl40.l(((mi31) obj).a.b, this.b));
            case 6:
                String str3 = this.b;
                return Boolean.valueOf(jl40.l(((za31) obj).a.a, str3) || jl40.l(str3, ""));
            case 7:
                String str4 = this.b;
                f4c0 f4c0Var = (f4c0) obj;
                Object obj2 = f4c0Var.d;
                if (!(obj2 instanceof pp60)) {
                    obj2 = null;
                }
                pp60 pp60Var = (pp60) obj2;
                if (pp60Var == null) {
                    pp60Var = oyr.c(f4c0Var);
                }
                ym00 d = pp60Var.d();
                return Boolean.valueOf(jl40.l(d != null ? d.e() : null, str4));
            case 8:
                return Boolean.valueOf(!jl40.l((String) obj, this.b));
            case 9:
                ((gm20) obj).c.put("connection_ip", this.b);
                return zy11.a;
            case 10:
                return Boolean.valueOf(jl40.l(((cae0) obj).c(), this.b));
            case 11:
                String str5 = this.b;
                T0 = ((oll0) obj).T0("SELECT long_value FROM Preference where `key`=?");
                try {
                    T0.g1(1, str5);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 12:
                String str6 = this.b;
                ek7 ek7Var = (ek7) obj;
                if (str6 != null) {
                    ek7Var.c.put("connection_ip", str6);
                }
                return zy11.a;
            case 13:
                String str7 = this.b;
                w511 w511Var = fa51.z;
                ia51 X0 = ((WorkDatabase) obj).X0();
                return (List) w511Var.mo104apply((List) a.b(X0.a, true, true, new fgw0(8, str7, X0)));
            case 14:
                String str8 = this.b;
                T0 = ((oll0) obj).T0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    T0.g1(1, str8);
                    T0.q();
                    T0.close();
                    return zy11.a;
                } finally {
                }
            case 15:
                ScanResult scanResult = (ScanResult) obj;
                return new l13(jl40.l(this.b, scanResult.BSSID), scanResult.BSSID, scanResult.SSID, scanResult.level, scanResult.timestamp / 1000, System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - TimeUnit.MICROSECONDS.toNanos(scanResult.timestamp)) / 1000000));
            case 16:
                String str9 = this.b;
                T0 = ((oll0) obj).T0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    T0.g1(1, str9);
                    T0.q();
                    T0.close();
                    return zy11.a;
                } finally {
                }
            case 17:
                String str10 = this.b;
                T0 = ((oll0) obj).T0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    T0.g1(1, str10);
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        String Y1 = T0.Y1(0);
                        WorkInfo$State s = gtq0.s((int) T0.getLong(1));
                        da51 da51Var = new da51();
                        da51Var.a = Y1;
                        da51Var.b = s;
                        arrayList2.add(da51Var);
                    }
                    return arrayList2;
                } finally {
                }
            case 18:
                String str11 = this.b;
                T0 = ((oll0) obj).T0("SELECT state FROM workspec WHERE id=?");
                try {
                    T0.g1(1, str11);
                    if (T0.q()) {
                        Integer valueOf = T0.isNull(0) ? null : Integer.valueOf((int) T0.getLong(0));
                        if (valueOf != null) {
                            workInfo$State = gtq0.s(valueOf.intValue());
                            return workInfo$State;
                        }
                    }
                    workInfo$State = null;
                    return workInfo$State;
                } finally {
                }
            case 19:
                String str12 = this.b;
                T0 = ((oll0) obj).T0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    T0.g1(1, str12);
                    ArrayList arrayList3 = new ArrayList();
                    while (T0.q()) {
                        arrayList3.add(T0.Y1(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 20:
                String str13 = this.b;
                T0 = ((oll0) obj).T0("SELECT * FROM workspec WHERE id=?");
                try {
                    T0.g1(1, str13);
                    int r = eja1.r(T0, "id");
                    int r2 = eja1.r(T0, ClidProvider.STATE);
                    int r3 = eja1.r(T0, "worker_class_name");
                    int r4 = eja1.r(T0, "input_merger_class_name");
                    int r5 = eja1.r(T0, "input");
                    int r6 = eja1.r(T0, "output");
                    int r7 = eja1.r(T0, "initial_delay");
                    int r8 = eja1.r(T0, "interval_duration");
                    int r9 = eja1.r(T0, "flex_duration");
                    int r10 = eja1.r(T0, "run_attempt_count");
                    int r11 = eja1.r(T0, "backoff_policy");
                    int r12 = eja1.r(T0, "backoff_delay_duration");
                    int r13 = eja1.r(T0, "last_enqueue_time");
                    int r14 = eja1.r(T0, "minimum_retention_duration");
                    int r15 = eja1.r(T0, "schedule_requested_at");
                    int r16 = eja1.r(T0, "run_in_foreground");
                    int r17 = eja1.r(T0, "out_of_quota_policy");
                    int r18 = eja1.r(T0, "period_count");
                    int r19 = eja1.r(T0, "generation");
                    int r20 = eja1.r(T0, "next_schedule_time_override");
                    int r21 = eja1.r(T0, "next_schedule_time_override_generation");
                    int r22 = eja1.r(T0, DownloadService.KEY_STOP_REASON);
                    int r23 = eja1.r(T0, "trace_tag");
                    int r24 = eja1.r(T0, "backoff_on_system_interruptions");
                    int r25 = eja1.r(T0, "required_network_type");
                    int r26 = eja1.r(T0, "required_network_request");
                    int r27 = eja1.r(T0, "requires_charging");
                    int r28 = eja1.r(T0, "requires_device_idle");
                    int r29 = eja1.r(T0, "requires_battery_not_low");
                    int r30 = eja1.r(T0, "requires_storage_not_low");
                    int r31 = eja1.r(T0, "trigger_content_update_delay");
                    int r32 = eja1.r(T0, "trigger_max_content_delay");
                    int r33 = eja1.r(T0, "content_uri_triggers");
                    if (T0.q()) {
                        String Y12 = T0.Y1(r);
                        WorkInfo$State s2 = gtq0.s((int) T0.getLong(r2));
                        String Y13 = T0.Y1(r3);
                        String Y14 = T0.Y1(r4);
                        byte[] blob = T0.getBlob(r5);
                        ong ongVar = ong.b;
                        ong l = bb1.l(blob);
                        ong l2 = bb1.l(T0.getBlob(r6));
                        long j = T0.getLong(r7);
                        long j2 = T0.getLong(r8);
                        long j3 = T0.getLong(r9);
                        int i5 = (int) T0.getLong(r10);
                        BackoffPolicy p = gtq0.p((int) T0.getLong(r11));
                        long j4 = T0.getLong(r12);
                        long j5 = T0.getLong(r13);
                        long j6 = T0.getLong(r14);
                        long j7 = T0.getLong(r15);
                        boolean z = ((int) T0.getLong(r16)) != 0;
                        OutOfQuotaPolicy r34 = gtq0.r((int) T0.getLong(r17));
                        int i6 = (int) T0.getLong(r18);
                        int i7 = (int) T0.getLong(r19);
                        long j8 = T0.getLong(r20);
                        int i8 = (int) T0.getLong(r21);
                        int i9 = (int) T0.getLong(r22);
                        String Y15 = T0.isNull(r23) ? null : T0.Y1(r23);
                        Integer valueOf2 = T0.isNull(r24) ? null : Integer.valueOf((int) T0.getLong(r24));
                        if (valueOf2 != null) {
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        fa51Var = new fa51(Y12, s2, Y13, Y14, l, l2, j, j2, j3, new k8e(gtq0.U(T0.getBlob(r26)), gtq0.q((int) T0.getLong(r25)), ((int) T0.getLong(r27)) != 0, ((int) T0.getLong(r28)) != 0, ((int) T0.getLong(r29)) != 0, ((int) T0.getLong(r30)) != 0, T0.getLong(r31), T0.getLong(r32), gtq0.d(T0.getBlob(r33))), i5, p, j4, j5, j6, j7, z, r34, i6, i7, j8, i8, i9, Y15, bool);
                    } else {
                        fa51Var = null;
                    }
                    return fa51Var;
                } finally {
                }
            case 21:
                String str14 = this.b;
                T0 = ((oll0) obj).T0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    T0.g1(1, str14);
                    ArrayList arrayList4 = new ArrayList();
                    while (T0.q()) {
                        byte[] blob2 = T0.getBlob(0);
                        ong ongVar2 = ong.b;
                        arrayList4.add(bb1.l(blob2));
                    }
                    return arrayList4;
                } finally {
                }
            case 22:
                String str15 = this.b;
                T0 = ((oll0) obj).T0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    T0.g1(1, str15);
                    ArrayList arrayList5 = new ArrayList();
                    while (T0.q()) {
                        arrayList5.add(T0.Y1(0));
                    }
                    return arrayList5;
                } finally {
                }
            case 23:
                String str16 = this.b;
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    T0.g1(1, str16);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 24:
                String str17 = this.b;
                T0 = ((oll0) obj).T0("DELETE FROM workspec WHERE id=?");
                try {
                    T0.g1(1, str17);
                    T0.q();
                    T0.close();
                    return zy11.a;
                } finally {
                }
            default:
                String str18 = this.b;
                T0 = ((oll0) obj).T0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    T0.g1(1, str18);
                    ArrayList arrayList6 = new ArrayList();
                    while (T0.q()) {
                        arrayList6.add(T0.Y1(0));
                    }
                    return arrayList6;
                } finally {
                }
        }
    }
}
