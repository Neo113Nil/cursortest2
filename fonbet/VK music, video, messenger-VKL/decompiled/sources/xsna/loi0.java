package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ServiceBookingService.kt */
/* loaded from: classes2.dex */
public interface loi0 {
    static /* synthetic */ xy2 e(loi0 loi0Var, UserId userId, Integer num, ArrayList arrayList, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            arrayList = null;
        }
        return loi0Var.j(userId, num, arrayList);
    }

    static /* synthetic */ xy2 k(loi0 loi0Var, UserId userId, Integer num, ArrayList arrayList, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            arrayList = null;
        }
        return loi0Var.o(userId, num, arrayList);
    }

    default tfx a(UserId userId, String str, List list) {
        tfx tfxVar = new tfx("serviceBooking.getStaff", new j8(24), new jh(21));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (str != null) {
            tfx.o(tfxVar, "datetime", str, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("service_ids", list);
        }
        return tfxVar;
    }

    default tfx b(int i, UserId userId, String str, String str2, String str3) {
        tfx tfxVar = new tfx("serviceBooking.moveRecord", new l4(29), new nq(22));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "record_id", i, 1, 0, 8);
        tfx.o(tfxVar, "record_hash", str, 0, 0, 12);
        tfx.o(tfxVar, "datetime", str2, 0, 0, 12);
        if (str3 != null) {
            tfx.o(tfxVar, "comment", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx c(UserId userId, Integer num, List list) {
        tfx tfxVar = new tfx("serviceBooking.getDates", new yq(28), new io.reactivex.rxjava3.internal.operators.mixed.j(24));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (num != null) {
            tfx.l(tfxVar, "staff_id", num.intValue(), 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("service_ids", list);
        }
        return tfxVar;
    }

    default tfx d(UserId userId, List list) {
        tfx tfxVar = new tfx("serviceBooking.activitySearchServices", new qq(20), new rq(23));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (list != null) {
            tfxVar.i("staff_ids", list);
        }
        return tfxVar;
    }

    default tfx f(UserId userId, Integer num, String str, List list) {
        tfx tfxVar = new tfx("serviceBooking.getTimes", new kq(28), new lq(28));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "date", str, 0, 0, 12);
        if (num != null) {
            tfx.l(tfxVar, "staff_id", num.intValue(), 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("service_ids", list);
        }
        return tfxVar;
    }

    default tfx g(UserId userId, String str, String str2, List list, ArrayList arrayList) {
        tfx tfxVar = new tfx("serviceBooking.activitySearchActivities", new joi0(0), new hq(26));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "date_from", str, 0, 0, 12);
        tfx.o(tfxVar, "date_to", str2, 0, 0, 12);
        if (list != null) {
            tfxVar.i("staff_ids", list);
        }
        tfxVar.i("service_ids", arrayList);
        return tfxVar;
    }

    default tfx h(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("serviceBooking.getRecordById", new oq(26), new pq(18));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "record_id", i, 1, 0, 8);
        tfx.o(tfxVar, "record_hash", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx i(UserId userId, List list, String str, String str2, Boolean bool, Integer num, String str3, Boolean bool2) {
        tfx tfxVar = new tfx("serviceBooking.createRecords", new zjh0(1), new bkh0(1));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "appointments", GsonHolder.a().toJson(list), 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar, "name", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "phone", str2, 0, 0, 12);
        }
        tfxVar.j("fill_contact_from_profile", bool.booleanValue());
        tfx.l(tfxVar, "notify_in_hours", num.intValue(), 0, 0, 12);
        if (str3 != null) {
            tfx.o(tfxVar, "comment", str3, 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar.j("is_newsletter_allowed", bool2.booleanValue());
        }
        return tfxVar;
    }

    default tfx j(UserId userId, Integer num, List list) {
        tfx tfxVar = new tfx("serviceBooking.getServices", new sq(21), new tq(22));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (num != null) {
            tfx.l(tfxVar, "staff_id", num.intValue(), 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("service_ids", list);
        }
        return tfxVar;
    }

    default tfx l(UserId userId) {
        tfx tfxVar = new tfx("serviceBooking.getSettings", new iq(27), new koi0(0));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        return tfxVar;
    }

    default tfx m(UserId userId, int i, String str, String str2, Boolean bool, Integer num, String str3, Boolean bool2) {
        tfx tfxVar = new tfx("serviceBooking.activityCreateRecord", new com.vk.movika.sdk.base.model.history.b(26), new fq(26));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "activity_id", i, 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar, "name", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "phone", str2, 0, 0, 12);
        }
        tfxVar.j("fill_contact_from_profile", bool.booleanValue());
        tfx.l(tfxVar, "notify_in_hours", num.intValue(), 0, 0, 12);
        if (str3 != null) {
            tfx.o(tfxVar, "comment", str3, 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar.j("is_newsletter_allowed", bool2.booleanValue());
        }
        return tfxVar;
    }

    default tfx n(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("serviceBooking.deleteRecord", new com.vk.movika.sdk.base.model.n(25), new eq(28));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "record_id", i, 1, 0, 8);
        tfx.o(tfxVar, "record_hash", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx o(UserId userId, Integer num, List list) {
        tfx tfxVar = new tfx("serviceBooking.searchServices", new dq(26), new mq(28));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (num != null) {
            tfx.l(tfxVar, "staff_id", num.intValue(), 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("service_ids", list);
        }
        return tfxVar;
    }

    default tfx p(UserId userId, Integer num, Integer num2) {
        tfx tfxVar = new tfx("serviceBooking.getRecords", new io.reactivex.rxjava3.internal.operators.mixed.k(29), new io.reactivex.rxjava3.internal.operators.mixed.n(27));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfxVar.f(num.intValue(), 1, 30, SignalingProtocol.KEY_LIMIT);
        tfx.l(tfxVar, "page", num2.intValue(), 1, 0, 8);
        return tfxVar;
    }

    default tfx q(List list, UserId userId, String str, String str2, List list2) {
        tfx tfxVar = new tfx("serviceBooking.activitySearchDates", new uq(25), new vq(29));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "date_from", str, 0, 0, 12);
        tfx.o(tfxVar, "date_to", str2, 0, 0, 12);
        if (list != null) {
            tfxVar.i("staff_ids", list);
        }
        if (list2 != null) {
            tfxVar.i("service_ids", list2);
        }
        return tfxVar;
    }
}
