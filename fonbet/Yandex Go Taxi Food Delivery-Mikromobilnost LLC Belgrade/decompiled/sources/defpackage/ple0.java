package defpackage;

/* loaded from: classes.dex */
public final class ple0 extends y2o {
    public final /* synthetic */ int a;

    public /* synthetic */ ple0(int i) {
        this.a = i;
    }

    @Override // defpackage.y2o
    public final void a(ull0 ull0Var, Object obj) {
        int i;
        int i2 = 1;
        switch (this.a) {
            case 0:
                nle0 nle0Var = (nle0) obj;
                ull0Var.g1(1, nle0Var.a);
                ull0Var.b(2, nle0Var.b.longValue());
                break;
            case 1:
                bku0 bku0Var = (bku0) obj;
                ull0Var.g1(1, bku0Var.a);
                ull0Var.g1(2, bku0Var.b);
                String str = bku0Var.c;
                if (str == null) {
                    ull0Var.p(3);
                } else {
                    ull0Var.g1(3, str);
                }
                ull0Var.g1(4, bku0Var.d);
                ull0Var.b(5, bku0Var.e);
                break;
            case 2:
                ull0Var.g1(1, ((b3x0) obj).a);
                ull0Var.b(2, r9.b);
                ull0Var.b(3, r9.c);
                break;
            case 3:
                u951 u951Var = (u951) obj;
                ull0Var.g1(1, u951Var.a);
                ull0Var.g1(2, u951Var.b);
                break;
            case 4:
                w951 w951Var = (w951) obj;
                ull0Var.g1(1, w951Var.b());
                ong ongVar = ong.b;
                ull0Var.m(2, bb1.O(w951Var.a()));
                break;
            case 5:
                fa51 fa51Var = (fa51) obj;
                ull0Var.g1(1, fa51Var.a);
                ull0Var.b(2, gtq0.R(fa51Var.b));
                ull0Var.g1(3, fa51Var.c);
                ull0Var.g1(4, fa51Var.d);
                ong ongVar2 = ong.b;
                ull0Var.m(5, bb1.O(fa51Var.e));
                ull0Var.m(6, bb1.O(fa51Var.f));
                ull0Var.b(7, fa51Var.g);
                ull0Var.b(8, fa51Var.h);
                ull0Var.b(9, fa51Var.i);
                ull0Var.b(10, fa51Var.k);
                int i3 = la51.b[fa51Var.l.ordinal()];
                if (i3 == 1) {
                    i = 0;
                } else if (i3 != 2) {
                    w511.b();
                    break;
                } else {
                    i = 1;
                }
                ull0Var.b(11, i);
                ull0Var.b(12, fa51Var.m);
                ull0Var.b(13, fa51Var.n);
                ull0Var.b(14, fa51Var.o);
                ull0Var.b(15, fa51Var.p);
                ull0Var.b(16, fa51Var.q ? 1L : 0L);
                int i4 = la51.d[fa51Var.r.ordinal()];
                if (i4 == 1) {
                    i2 = 0;
                } else if (i4 != 2) {
                    w511.b();
                    break;
                }
                ull0Var.b(17, i2);
                ull0Var.b(18, fa51Var.s);
                ull0Var.b(19, fa51Var.t);
                ull0Var.b(20, fa51Var.u);
                ull0Var.b(21, fa51Var.v);
                ull0Var.b(22, fa51Var.w);
                String str2 = fa51Var.x;
                if (str2 == null) {
                    ull0Var.p(23);
                } else {
                    ull0Var.g1(23, str2);
                }
                Boolean bool = fa51Var.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    ull0Var.p(24);
                } else {
                    ull0Var.b(24, r7.intValue());
                }
                k8e k8eVar = fa51Var.j;
                ull0Var.b(25, gtq0.z(k8eVar.a));
                ull0Var.m(26, gtq0.o(k8eVar.b));
                ull0Var.b(27, k8eVar.c ? 1L : 0L);
                ull0Var.b(28, k8eVar.d ? 1L : 0L);
                ull0Var.b(29, k8eVar.e ? 1L : 0L);
                ull0Var.b(30, k8eVar.f ? 1L : 0L);
                ull0Var.b(31, k8eVar.g);
                ull0Var.b(32, k8eVar.h);
                ull0Var.m(33, gtq0.O(k8eVar.i));
                break;
            default:
                ja51 ja51Var = (ja51) obj;
                ull0Var.g1(1, ja51Var.a);
                ull0Var.g1(2, ja51Var.b);
                break;
        }
    }

    @Override // defpackage.y2o
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `stored_experiments` (`source`,`name`,`version`,`value`,`last_update`) VALUES (?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
