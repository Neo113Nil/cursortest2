package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView$State$WeekDay;
import io.flutter.plugins.webviewflutter.WebViewProxyApi$WebViewPlatformView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes3.dex */
public final /* synthetic */ class js41 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ js41(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 saveClickAction$lambda$0;
        zy11 onWeekDaySelectCallback$lambda$1;
        ull0 T0;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        zy11 linkClickListener$lambda$1;
        switch (this.a) {
            case 0:
                return hs41.a;
            case 1:
                return gs41.a;
            case 2:
                return WebViewProxyApi$WebViewPlatformView.lambda$onScrollChanged$0((Result) obj);
            case 3:
                return vt41.a;
            case 4:
                return au41.a;
            case 5:
                return yt41.a;
            case 6:
                saveClickAction$lambda$0 = WeekDayChooserView.saveClickAction$lambda$0((vw41) obj);
                return saveClickAction$lambda$0;
            case 7:
                onWeekDaySelectCallback$lambda$1 = WeekDayChooserView.onWeekDaySelectCallback$lambda$1((WeekDayChooserView$State$WeekDay) obj);
                return onWeekDaySelectCallback$lambda$1;
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
                Object obj3 = list.get(1);
                Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
                return new c(booleanValue, num != null ? num.intValue() : 0);
            case 9:
                return ((a) obj).g;
            case 10:
                return ((a) obj).b;
            case 11:
                return ((a) obj).f;
            case 12:
                return ((a) obj).c;
            case 13:
                return ((a) obj).e;
            case 14:
                return (y751) obj;
            case 15:
                T0 = ((oll0) obj).T0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
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
                        int i3 = r;
                        int i4 = r14;
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
                        int i5 = (int) T0.getLong(r10);
                        BackoffPolicy p = gtq0.p((int) T0.getLong(r11));
                        long j4 = T0.getLong(r12);
                        long j5 = T0.getLong(r13);
                        long j6 = T0.getLong(i4);
                        int i6 = r15;
                        long j7 = T0.getLong(i6);
                        int i7 = r13;
                        int i8 = r16;
                        boolean z = ((int) T0.getLong(i8)) != 0;
                        int i9 = r2;
                        int i10 = r17;
                        int i11 = r3;
                        OutOfQuotaPolicy r34 = gtq0.r((int) T0.getLong(i10));
                        int i12 = r18;
                        int i13 = (int) T0.getLong(i12);
                        int i14 = r19;
                        int i15 = (int) T0.getLong(i14);
                        int i16 = r20;
                        long j8 = T0.getLong(i16);
                        int i17 = r21;
                        int i18 = (int) T0.getLong(i17);
                        int i19 = r22;
                        int i20 = (int) T0.getLong(i19);
                        int i21 = r23;
                        String Y14 = T0.isNull(i21) ? null : T0.Y1(i21);
                        int i22 = r24;
                        if (T0.isNull(i22)) {
                            i = i21;
                            i2 = i19;
                            valueOf = null;
                        } else {
                            i = i21;
                            i2 = i19;
                            valueOf = Integer.valueOf((int) T0.getLong(i22));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i23 = r25;
                        NetworkType q = gtq0.q((int) T0.getLong(i23));
                        int i24 = r26;
                        jz50 U = gtq0.U(T0.getBlob(i24));
                        int i25 = r27;
                        boolean z2 = ((int) T0.getLong(i25)) != 0;
                        int i26 = r28;
                        boolean z3 = ((int) T0.getLong(i26)) != 0;
                        int i27 = r29;
                        boolean z4 = ((int) T0.getLong(i27)) != 0;
                        r29 = i27;
                        int i28 = r30;
                        int i29 = r31;
                        int i30 = r32;
                        r31 = i29;
                        int i31 = r33;
                        r33 = i31;
                        arrayList.add(new fa51(Y1, s, Y12, Y13, l, l2, j, j2, j3, new k8e(U, q, z2, z3, z4, ((int) T0.getLong(i28)) != 0, T0.getLong(i29), T0.getLong(i30), gtq0.d(T0.getBlob(i31))), i5, p, j4, j5, j6, j7, z, r34, i13, i15, j8, i18, i20, Y14, bool));
                        r32 = i30;
                        r30 = i28;
                        r2 = i9;
                        r20 = i16;
                        r27 = i25;
                        r = i3;
                        r14 = i4;
                        r28 = i26;
                        r3 = i11;
                        r17 = i10;
                        r18 = i12;
                        r19 = i14;
                        r21 = i17;
                        r22 = i2;
                        r23 = i;
                        r24 = i22;
                        r25 = i23;
                        r26 = i24;
                        r13 = i7;
                        r15 = i6;
                        r16 = i8;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 16:
                T0 = ((oll0) obj).T0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i32 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(i32);
                } finally {
                    T0.close();
                }
            case 17:
                return new s621();
            case 18:
                return new cu2();
            case 19:
                return new qwu0();
            case 20:
                return new twu0();
            case 21:
                return p59.a;
            case 22:
                return new gj3();
            case 23:
                return new h3d0();
            case 24:
                return new i7u();
            case 25:
                return ((Zone) obj).D;
            case 26:
                linkClickListener$lambda$1 = YbButtonViewGroup.linkClickListener$lambda$1((String) obj);
                return linkClickListener$lambda$1;
            case 27:
                jst.e.k(new IllegalStateException(), "YbSdk is not activated");
                ((ev51) obj).getClass();
                return zy11.a;
            case 28:
                return oyr.p("YbWebComponentHolder with instanceId=", (String) obj, " is not initialized");
            default:
                return ((PlusPayCompositeOfferDetails.PaymentMethodsGroup) obj).getPaymentMethods();
        }
    }
}
