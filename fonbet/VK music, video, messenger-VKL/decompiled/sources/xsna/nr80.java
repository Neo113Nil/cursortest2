package xsna;

import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.stat.scheme.MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt;
import com.vk.stat.scheme.MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.max;

/* compiled from: OpenMessagesHistoryReporterImpl.kt */
/* loaded from: classes5.dex */
public final class nr80 extends wn6<OpenMessagesHistoryReporter.Span, OpenMessagesHistoryReporter.MeasuringPoint> implements OpenMessagesHistoryReporter {
    public static final AtomicBoolean n = new AtomicBoolean(true);
    public static final AtomicBoolean o = new AtomicBoolean(true);
    public final gzs<ReporterType> i;
    public final max j;
    public final ExecutorService k;
    public final jhg l;
    public final bpn0 m;

    /* compiled from: OpenMessagesHistoryReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OpenMessagesHistoryReporter.Span.values().length];
            try {
                iArr[OpenMessagesHistoryReporter.Span.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReporterType.values().length];
            try {
                iArr2[ReporterType.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ReporterType.GROUP_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ReporterType.CHANNEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public nr80(String str, gzs gzsVar, max maxVar, ExecutorService executorService, jhg jhgVar) {
        super(str);
        this.i = gzsVar;
        this.j = maxVar;
        this.k = executorService;
        this.l = jhgVar;
        this.m = new bpn0(new k7z(this, 15));
    }

    @Override // xsna.wn6
    public final void t(mdz<OpenMessagesHistoryReporter.Span> mdzVar, Object obj) {
        if (a.$EnumSwitchMapping$0[mdzVar.b.ordinal()] == 1 && h() && this.d.compareAndSet(false, true)) {
            this.k.execute(new r0a(this, obj, mdzVar, 6));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean] */
    public final void x(mdz<OpenMessagesHistoryReporter.Span> mdzVar, pr80 pr80Var) {
        bpn0 bpn0Var;
        AtomicReference<String> atomicReference;
        int i;
        Long l;
        vto0 vto0Var;
        PerformanceEventType performanceEventType;
        wto0 wto0Var;
        Long a2;
        Long l2;
        Long l3;
        PerformanceEventType performanceEventType2;
        String str;
        Long l4;
        Long l5;
        ?? r13;
        vto0 vto0Var2;
        int i2 = pr80Var.c;
        int i3 = pr80Var.b;
        OpenMessagesHistoryReporter.Span span = mdzVar.b;
        OpenMessagesHistoryReporter.Span span2 = OpenMessagesHistoryReporter.Span.ROOT;
        mdz<OpenMessagesHistoryReporter.Span> mdzVar2 = span == span2 ? mdzVar : null;
        if (mdzVar2 != null) {
            ConcurrentHashMap concurrentHashMap = this.c;
            wto0 wto0Var2 = (wto0) concurrentHashMap.get(mdzVar2);
            if (wto0Var2 == null) {
                return;
            }
            String str2 = this.f.get();
            if (str2 == null) {
                str2 = this.a;
            }
            max.a a3 = this.j.a(str2, wto0Var2.a);
            if ((a3 != null ? a3.a : null) != null) {
                concurrentHashMap.put(mdzVar, new wto0(a3.a, wto0Var2.b));
            }
            bpn0 bpn0Var2 = this.m;
            ReporterType reporterType = (ReporterType) bpn0Var2.getValue();
            int[] iArr = a.$EnumSwitchMapping$1;
            int i4 = iArr[reporterType.ordinal()];
            AtomicBoolean atomicBoolean = n;
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                atomicBoolean = o;
            }
            boolean andSet = atomicBoolean.getAndSet(false);
            mdz<OpenMessagesHistoryReporter.Span> mdzVar3 = span == span2 ? mdzVar : null;
            AtomicReference<String> atomicReference2 = this.e;
            if (mdzVar3 == null || (wto0Var = (wto0) concurrentHashMap.get(mdzVar3)) == null || (a2 = wto0Var.a()) == null) {
                bpn0Var = bpn0Var2;
                atomicReference = atomicReference2;
                i = 4;
            } else {
                long longValue = a2.longValue();
                i = 4;
                vto0 vto0Var3 = (vto0) this.b.get(OpenMessagesHistoryReporter.MeasuringPoint.RESUMED);
                Long d = vto0Var3 != null ? vto0Var3.d(wto0Var.a) : null;
                LinkedHashMap r = r();
                Long m = pli.m((Collection) r.get(OpenMessagesHistoryReporter.Span.ON_CREATE));
                Long m2 = pli.m((Collection) r.get(OpenMessagesHistoryReporter.Span.ON_CREATE_VIEW));
                Long l6 = d;
                Long m3 = pli.m((Collection) r.get(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES));
                Long m4 = pli.m((Collection) r.get(OpenMessagesHistoryReporter.Span.LOAD_PROFILES));
                Long m5 = pli.m((Collection) r.get(OpenMessagesHistoryReporter.Span.LOAD_MUTUAL_FRIENDS));
                Long m6 = pli.m((Collection) r.get(OpenMessagesHistoryReporter.Span.BUILD_ADAPTER_ENTRY_LIST));
                List list = (List) r.get(OpenMessagesHistoryReporter.Span.MESSAGES_ADAPTER_RENDER);
                wto0 wto0Var3 = list != null ? (wto0) j5g.a0(list) : null;
                Long a4 = wto0Var3 != null ? wto0Var3.a() : null;
                bpn0Var = bpn0Var2;
                Long m7 = pli.m((Collection) r.get(OpenMessagesHistoryReporter.Span.LOADER_SPINNER));
                List list2 = (List) r.get(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES_HISTORY_TOTAL);
                wto0 wto0Var4 = list2 != null ? (wto0) j5g.a0(list2) : null;
                Long a5 = wto0Var4 != null ? wto0Var4.a() : null;
                if (wto0Var3 == null || (vto0Var2 = wto0Var3.a) == null) {
                    l2 = null;
                } else {
                    l2 = vto0Var2.d(wto0Var4 != null ? wto0Var4.a : null);
                }
                Boolean valueOf = a3 != null ? Boolean.valueOf(a3.b) : null;
                Long l7 = l2;
                Boolean bool = Boolean.TRUE;
                if (epx.f(valueOf, bool)) {
                    atomicReference = atomicReference2;
                    l3 = a3.c.a();
                } else {
                    atomicReference = atomicReference2;
                    l3 = null;
                }
                String str3 = epx.f(valueOf, bool) ? "cold_start" : epx.f(valueOf, Boolean.FALSE) ? "warm_start" : "regular";
                int i5 = iArr[((ReporterType) bpn0Var.getValue()).ordinal()];
                Long l8 = l3;
                if (i5 == 1) {
                    performanceEventType2 = PerformanceEventType.CHAT_OPEN_TO_RENDER;
                } else if (i5 == 2) {
                    performanceEventType2 = PerformanceEventType.GROUP_CHAT_OPEN_TO_RENDER;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    performanceEventType2 = PerformanceEventType.CHANNEL_OPEN_TO_RENDER;
                }
                String h = performanceEventType2.h();
                if (((Boolean) this.l.invoke()).booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    str = str3;
                    sb.append(" | ");
                    sb.append(i3);
                    sb.append(" msgs | ");
                    l4 = a5;
                    l5 = m;
                    sb.append(longValue / 1000);
                    sb.append(UcumUtils.UCUM_MILLISECODS);
                    r13 = 0;
                    cvk.w(sb.toString(), false);
                } else {
                    str = str3;
                    l4 = a5;
                    l5 = m;
                    r13 = 0;
                }
                s3w0 s3w0Var = new s3w0(h, r13);
                Long[] lArr = s3w0Var.j;
                lArr[r13] = a2;
                lArr[1] = l5;
                lArr[2] = m2;
                lArr[3] = l6;
                lArr[4] = m3;
                lArr[5] = m4;
                lArr[6] = m5;
                lArr[7] = m6;
                lArr[8] = l4;
                lArr[9] = l7;
                lArr[10] = a4;
                lArr[11] = m7;
                lArr[13] = l8;
                lArr[15] = Long.valueOf(andSet ? 1L : 0L);
                String str4 = atomicReference.get();
                String[] strArr = s3w0Var.i;
                strArr[1] = str4;
                strArr[2] = str;
                strArr[3] = String.valueOf(i2);
                strArr[5] = String.valueOf(i3);
                s3w0Var.q();
            }
            if ((span == span2 ? mdzVar : null) != null) {
                mdz b = mdzVar.b(OpenMessagesHistoryReporter.Span.APP_CREATE);
                if (b != null) {
                    concurrentHashMap.put(b, epx.f(a3 != null ? Boolean.valueOf(a3.b) : null, Boolean.TRUE) ? a3.c : new wto0(0));
                }
                q(rl3.C(OpenMessagesHistoryReporter.Span.values()), mdzVar);
                int i6 = iArr[((ReporterType) bpn0Var.getValue()).ordinal()];
                if (i6 == 1) {
                    performanceEventType = PerformanceEventType.CHAT_OPEN_TO_RENDER;
                } else if (i6 == 2) {
                    performanceEventType = PerformanceEventType.GROUP_CHAT_OPEN_TO_RENDER;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    performanceEventType = PerformanceEventType.CHANNEL_OPEN_TO_RENDER;
                }
                String h2 = performanceEventType.h();
                Boolean valueOf2 = a3 != null ? Boolean.valueOf(a3.b) : null;
                String str5 = epx.f(valueOf2, Boolean.TRUE) ? "cold_start" : epx.f(valueOf2, Boolean.FALSE) ? "warm_start" : "regular";
                gd5 gd5Var = new gd5(span2, h2, or80.b, 2);
                MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr = new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(1, str5);
                String str6 = atomicReference.get();
                if (str6 == null) {
                    str6 = "";
                }
                wn6.w(this, mdzVar, gd5Var, e43.l(mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr, new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(2, str6)), e43.l(new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt(1, andSet ? 1 : 0), new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt(3, i3), new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt(i, i2)), 28);
            }
            LinkedHashMap r2 = r();
            Long m8 = pli.m((Collection) r2.get(OpenMessagesHistoryReporter.Span.ON_CREATE));
            Long m9 = pli.m((Collection) r2.get(OpenMessagesHistoryReporter.Span.ON_CREATE_VIEW));
            Long m10 = pli.m((Collection) r2.get(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES));
            Long m11 = pli.m((Collection) r2.get(OpenMessagesHistoryReporter.Span.LOAD_PROFILES));
            Long m12 = pli.m((Collection) r2.get(OpenMessagesHistoryReporter.Span.LOAD_MUTUAL_FRIENDS));
            Long m13 = pli.m((Collection) r2.get(OpenMessagesHistoryReporter.Span.BUILD_ADAPTER_ENTRY_LIST));
            List list3 = (List) r2.get(OpenMessagesHistoryReporter.Span.MESSAGES_ADAPTER_RENDER);
            wto0 wto0Var5 = list3 != null ? (wto0) j5g.a0(list3) : null;
            Long a6 = wto0Var5 != null ? wto0Var5.a() : null;
            Long m14 = pli.m((Collection) r2.get(OpenMessagesHistoryReporter.Span.LOADER_SPINNER));
            List list4 = (List) r2.get(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES_HISTORY_TOTAL);
            wto0 wto0Var6 = list4 != null ? (wto0) j5g.a0(list4) : null;
            Long a7 = wto0Var6 != null ? wto0Var6.a() : null;
            if (wto0Var5 == null || (vto0Var = wto0Var5.a) == null) {
                l = null;
            } else {
                l = vto0Var.d(wto0Var6 != null ? wto0Var6.a : null);
            }
            s(m8, "chat_create_time");
            s(m9, "chat_view_create_time");
            s(m10, "chat_messages_load_time");
            s(m11, "chat_profiles_load_time");
            s(m12, "chat_mutual_friends_load_time");
            s(m13, "chat_adapter_entry_list_build_time");
            s(a6, "chat_adapter_render_time");
            s(m14, "chat_loader_spinner_time");
            s(a7, "chat_message_history_load_time");
            s(l, "chat_message_history_load_time_and_move_to_adapter_time");
        }
    }
}
