package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public abstract class pom0 {
    public static final /* synthetic */ int a = 0;

    static {
        hgz.o("Schedulers");
    }

    public static void a(ia51 ia51Var, n2x0 n2x0Var, List list) {
        if (list.size() > 0) {
            n2x0Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ia51Var.f(currentTimeMillis, ((fa51) it.next()).a);
            }
        }
    }

    public static void b(u0e u0eVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ia51 X0 = workDatabase.X0();
        workDatabase.v0();
        try {
            RoomDatabase roomDatabase = X0.a;
            RoomDatabase roomDatabase2 = X0.a;
            List list2 = (List) a.b(roomDatabase, true, false, new u431(16));
            a(X0, u0eVar.d, list2);
            final int i = u0eVar.m;
            List list3 = (List) a.b(roomDatabase2, true, false, new tls() { // from class: ga51
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i2;
                    Integer valueOf;
                    int i3 = i;
                    ull0 T0 = ((oll0) obj).T0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                    try {
                        T0.b(1, i3);
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
                        ArrayList arrayList = new ArrayList();
                        while (T0.q()) {
                            String Y1 = T0.Y1(r);
                            int i4 = r13;
                            int i5 = r14;
                            WorkInfo$State s = gtq0.s((int) T0.getLong(r2));
                            String Y12 = T0.Y1(r3);
                            String Y13 = T0.Y1(r4);
                            byte[] blob = T0.getBlob(r5);
                            ong ongVar = ong.b;
                            ong l = bb1.l(blob);
                            ong l2 = bb1.l(T0.getBlob(r6));
                            long j = T0.getLong(r7);
                            long j2 = T0.getLong(r8);
                            long j3 = T0.getLong(r9);
                            int i6 = (int) T0.getLong(r10);
                            int i7 = r;
                            int i8 = r2;
                            BackoffPolicy p = gtq0.p((int) T0.getLong(r11));
                            long j4 = T0.getLong(r12);
                            long j5 = T0.getLong(i4);
                            long j6 = T0.getLong(i5);
                            int i9 = r15;
                            long j7 = T0.getLong(i9);
                            r15 = i9;
                            int i10 = r16;
                            int i11 = r3;
                            boolean z = ((int) T0.getLong(i10)) != 0;
                            int i12 = r17;
                            int i13 = r4;
                            OutOfQuotaPolicy r34 = gtq0.r((int) T0.getLong(i12));
                            int i14 = r18;
                            int i15 = (int) T0.getLong(i14);
                            int i16 = r19;
                            int i17 = (int) T0.getLong(i16);
                            int i18 = r20;
                            long j8 = T0.getLong(i18);
                            int i19 = r21;
                            int i20 = (int) T0.getLong(i19);
                            r21 = i19;
                            int i21 = r22;
                            int i22 = (int) T0.getLong(i21);
                            int i23 = r23;
                            Boolean bool = null;
                            String Y14 = T0.isNull(i23) ? null : T0.Y1(i23);
                            int i24 = r24;
                            if (T0.isNull(i24)) {
                                i2 = i23;
                                r22 = i21;
                                valueOf = null;
                            } else {
                                i2 = i23;
                                r22 = i21;
                                valueOf = Integer.valueOf((int) T0.getLong(i24));
                            }
                            if (valueOf != null) {
                                bool = Boolean.valueOf(valueOf.intValue() != 0);
                            }
                            Boolean bool2 = bool;
                            int i25 = r25;
                            NetworkType q = gtq0.q((int) T0.getLong(i25));
                            int i26 = r26;
                            jz50 U = gtq0.U(T0.getBlob(i26));
                            int i27 = r27;
                            boolean z2 = ((int) T0.getLong(i27)) != 0;
                            int i28 = r28;
                            boolean z3 = ((int) T0.getLong(i28)) != 0;
                            int i29 = r29;
                            boolean z4 = ((int) T0.getLong(i29)) != 0;
                            r29 = i29;
                            int i30 = r30;
                            int i31 = r31;
                            int i32 = r32;
                            r31 = i31;
                            int i33 = r33;
                            arrayList.add(new fa51(Y1, s, Y12, Y13, l, l2, j, j2, j3, new k8e(U, q, z2, z3, z4, ((int) T0.getLong(i30)) != 0, T0.getLong(i31), T0.getLong(i32), gtq0.d(T0.getBlob(i33))), i6, p, j4, j5, j6, j7, z, r34, i15, i17, j8, i20, i22, Y14, bool2));
                            r28 = i28;
                            r4 = i13;
                            r17 = i12;
                            r18 = i14;
                            r19 = i16;
                            r20 = i18;
                            r23 = i2;
                            r24 = i24;
                            r25 = i25;
                            r26 = i26;
                            r27 = i27;
                            r33 = i33;
                            r32 = i32;
                            r30 = i30;
                            r = i7;
                            r3 = i11;
                            r13 = i4;
                            r14 = i5;
                            r2 = i8;
                            r16 = i10;
                        }
                        T0.close();
                        return arrayList;
                    } catch (Throwable th) {
                        T0.close();
                        throw th;
                    }
                }
            });
            a(X0, u0eVar.d, list3);
            list3.addAll(list2);
            List list4 = (List) a.b(roomDatabase2, true, false, new u431(18));
            workDatabase.Q0();
            workDatabase.B0();
            if (list3.size() > 0) {
                fa51[] fa51VarArr = (fa51[]) list3.toArray(new fa51[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kom0 kom0Var = (kom0) it.next();
                    if (kom0Var.b()) {
                        kom0Var.a(fa51VarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                fa51[] fa51VarArr2 = (fa51[]) list4.toArray(new fa51[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    kom0 kom0Var2 = (kom0) it2.next();
                    if (!kom0Var2.b()) {
                        kom0Var2.a(fa51VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.B0();
            throw th;
        }
    }
}
