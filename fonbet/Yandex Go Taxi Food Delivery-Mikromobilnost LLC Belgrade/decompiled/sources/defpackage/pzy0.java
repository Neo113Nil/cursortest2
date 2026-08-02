package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes3.dex */
public final /* synthetic */ class pzy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ pzy0(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        fzy0 fzy0Var;
        ull0 ull0Var;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.b;
        switch (i3) {
            case 0:
                T0 = ((oll0) obj).T0("SELECT messages_view_history_id FROM threads_messages_view WHERE thread_internal_id=?");
                try {
                    T0.b(1, j);
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(Long.valueOf(T0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                T0 = ((oll0) obj).T0("SELECT * FROM threads_view WHERE thread_internal_id=?");
                try {
                    T0.b(1, j);
                    int r = eja1.r(T0, "thread_internal_id");
                    int r2 = eja1.r(T0, "thread_id");
                    int r3 = eja1.r(T0, "unseen");
                    int r4 = eja1.r(T0, "first_unseen_row");
                    int r5 = eja1.r(T0, "is_hidden");
                    int r6 = eja1.r(T0, "is_member");
                    int r7 = eja1.r(T0, "sort_time");
                    int r8 = eja1.r(T0, "parent_internal_id");
                    int r9 = eja1.r(T0, "parent_message_timestamp");
                    if (T0.q()) {
                        fzy0Var = new fzy0(T0.getLong(r), T0.Y1(r2), (int) T0.getLong(r3), T0.isNull(r4) ? null : Integer.valueOf((int) T0.getLong(r4)), ((int) T0.getLong(r5)) != 0, ((int) T0.getLong(r6)) != 0, T0.getLong(r7), T0.getLong(r8), T0.getLong(r9));
                    } else {
                        fzy0Var = null;
                    }
                    return fzy0Var;
                } finally {
                }
            case 2:
                T0 = ((oll0) obj).T0("DELETE FROM threads_view WHERE thread_internal_id=?");
                try {
                    T0.b(1, j);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 3:
                T0 = ((oll0) obj).T0("DELETE FROM threads_messages_view WHERE thread_internal_id=?");
                try {
                    T0.b(1, j);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 4:
                T0 = ((oll0) obj).T0("\n        SELECT COUNT(CASE WHEN unseen > 0 THEN 1 ELSE NULL END) as unread_threads_count\n        FROM threads_view\n        LEFT JOIN chat_organization_cross_ref ON threads_view.parent_internal_id = chat_organization_cross_ref.chat_internal_id\n        WHERE threads_view.is_hidden = 0 AND coalesce(chat_organization_cross_ref.organization_id, 0) = ?\n    ");
                try {
                    T0.b(1, j);
                    if (T0.q()) {
                        return new ezy0((int) T0.getLong(0));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.yandex.messaging.core.db.chats.ThreadViewEntity.ThreadUnseenReadInfo>.");
                } finally {
                }
            case 5:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                qam.t0(c1yVar, this.b, 0L, c1yVar.a.c(), 0.0f, null, 122);
                return zy11Var;
            default:
                ull0 T02 = ((oll0) obj).T0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    T02.b(1, j);
                    int r10 = eja1.r(T02, "id");
                    int r11 = eja1.r(T02, ClidProvider.STATE);
                    int r12 = eja1.r(T02, "worker_class_name");
                    int r13 = eja1.r(T02, "input_merger_class_name");
                    int r14 = eja1.r(T02, "input");
                    int r15 = eja1.r(T02, "output");
                    int r16 = eja1.r(T02, "initial_delay");
                    int r17 = eja1.r(T02, "interval_duration");
                    int r18 = eja1.r(T02, "flex_duration");
                    int r19 = eja1.r(T02, "run_attempt_count");
                    int r20 = eja1.r(T02, "backoff_policy");
                    int r21 = eja1.r(T02, "backoff_delay_duration");
                    int r22 = eja1.r(T02, "last_enqueue_time");
                    int r23 = eja1.r(T02, "minimum_retention_duration");
                    int r24 = eja1.r(T02, "schedule_requested_at");
                    int r25 = eja1.r(T02, "run_in_foreground");
                    int r26 = eja1.r(T02, "out_of_quota_policy");
                    int r27 = eja1.r(T02, "period_count");
                    int r28 = eja1.r(T02, "generation");
                    int r29 = eja1.r(T02, "next_schedule_time_override");
                    int r30 = eja1.r(T02, "next_schedule_time_override_generation");
                    int r31 = eja1.r(T02, DownloadService.KEY_STOP_REASON);
                    int r32 = eja1.r(T02, "trace_tag");
                    int r33 = eja1.r(T02, "backoff_on_system_interruptions");
                    int r34 = eja1.r(T02, "required_network_type");
                    int r35 = eja1.r(T02, "required_network_request");
                    int r36 = eja1.r(T02, "requires_charging");
                    int r37 = eja1.r(T02, "requires_device_idle");
                    int r38 = eja1.r(T02, "requires_battery_not_low");
                    int r39 = eja1.r(T02, "requires_storage_not_low");
                    int r40 = eja1.r(T02, "trigger_content_update_delay");
                    int r41 = eja1.r(T02, "trigger_max_content_delay");
                    int r42 = eja1.r(T02, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (T02.q()) {
                        String Y1 = T02.Y1(r10);
                        int i4 = r23;
                        ArrayList arrayList3 = arrayList2;
                        WorkInfo$State s = gtq0.s((int) T02.getLong(r11));
                        String Y12 = T02.Y1(r12);
                        String Y13 = T02.Y1(r13);
                        byte[] blob = T02.getBlob(r14);
                        ong ongVar = ong.b;
                        ong l = bb1.l(blob);
                        ong l2 = bb1.l(T02.getBlob(r15));
                        long j2 = T02.getLong(r16);
                        long j3 = T02.getLong(r17);
                        long j4 = T02.getLong(r18);
                        int i5 = (int) T02.getLong(r19);
                        int i6 = r11;
                        BackoffPolicy p = gtq0.p((int) T02.getLong(r20));
                        long j5 = T02.getLong(r21);
                        long j6 = T02.getLong(r22);
                        long j7 = T02.getLong(i4);
                        int i7 = r24;
                        long j8 = T02.getLong(i7);
                        int i8 = r10;
                        int i9 = r25;
                        int i10 = r22;
                        boolean z = ((int) T02.getLong(i9)) != 0;
                        int i11 = r26;
                        OutOfQuotaPolicy r43 = gtq0.r((int) T02.getLong(i11));
                        int i12 = r27;
                        int i13 = (int) T02.getLong(i12);
                        int i14 = r28;
                        int i15 = (int) T02.getLong(i14);
                        int i16 = r29;
                        long j9 = T02.getLong(i16);
                        int i17 = r30;
                        int i18 = (int) T02.getLong(i17);
                        int i19 = r31;
                        int i20 = (int) T02.getLong(i19);
                        int i21 = r32;
                        String Y14 = T02.isNull(i21) ? null : T02.Y1(i21);
                        int i22 = r33;
                        if (T02.isNull(i22)) {
                            i = i18;
                            i2 = i19;
                            valueOf = null;
                        } else {
                            i = i18;
                            i2 = i19;
                            valueOf = Integer.valueOf((int) T02.getLong(i22));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i23 = r34;
                        NetworkType q = gtq0.q((int) T02.getLong(i23));
                        int i24 = r35;
                        jz50 U = gtq0.U(T02.getBlob(i24));
                        r34 = i23;
                        r35 = i24;
                        int i25 = r36;
                        boolean z2 = ((int) T02.getLong(i25)) != 0;
                        r36 = i25;
                        int i26 = r37;
                        boolean z3 = ((int) T02.getLong(i26)) != 0;
                        int i27 = r38;
                        boolean z4 = ((int) T02.getLong(i27)) != 0;
                        r38 = i27;
                        int i28 = r39;
                        int i29 = r40;
                        int i30 = r41;
                        int i31 = r42;
                        r42 = i31;
                        ull0Var = T02;
                        try {
                            arrayList3.add(new fa51(Y1, s, Y12, Y13, l, l2, j2, j3, j4, new k8e(U, q, z2, z3, z4, ((int) T02.getLong(i28)) != 0, T02.getLong(i29), T02.getLong(i30), gtq0.d(T02.getBlob(i31))), i5, p, j5, j6, j7, j8, z, r43, i13, i15, j9, i, i20, Y14, bool));
                            r22 = i10;
                            r25 = i9;
                            r29 = i16;
                            r30 = i17;
                            r32 = i21;
                            r37 = i26;
                            arrayList2 = arrayList3;
                            T02 = ull0Var;
                            r40 = i29;
                            r10 = i8;
                            r41 = i30;
                            r24 = i7;
                            r11 = i6;
                            r26 = i11;
                            r28 = i14;
                            r31 = i2;
                            r33 = i22;
                            r27 = i12;
                            r39 = i28;
                            r23 = i4;
                        } catch (Throwable th) {
                            th = th;
                            ull0Var.close();
                            throw th;
                        }
                    }
                    ull0 ull0Var2 = T02;
                    ArrayList arrayList4 = arrayList2;
                    ull0Var2.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    th = th2;
                    ull0Var = T02;
                }
        }
    }
}
