package xsna;

import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.stat.scheme.MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.max;

/* compiled from: OpenChatListReporterImpl.kt */
/* loaded from: classes5.dex */
public final class fq80 extends wn6<OpenChatListReporter.Span, OpenChatListReporter.MeasuringPoint> implements OpenChatListReporter {
    public final ReporterType i;
    public final max j;
    public final ExecutorService k;
    public final cau0 l;

    /* compiled from: OpenChatListReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OpenChatListReporter.Span.values().length];
            try {
                iArr[OpenChatListReporter.Span.ROOT.ordinal()] = 1;
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

    public fq80(String str, ReporterType reporterType, max maxVar, ExecutorService executorService, cau0 cau0Var) {
        super(str);
        this.i = reporterType;
        this.j = maxVar;
        this.k = executorService;
        this.l = cau0Var;
    }

    @Override // xsna.wn6
    public final void t(mdz<OpenChatListReporter.Span> mdzVar, Object obj) {
        if (a.$EnumSwitchMapping$0[mdzVar.b.ordinal()] == 1 && h() && this.d.compareAndSet(false, true)) {
            this.k.execute(new hc3(9, this, mdzVar));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void x(mdz<OpenChatListReporter.Span> mdzVar) {
        int i;
        String str;
        int i2;
        PerformanceEventType performanceEventType;
        wto0 wto0Var;
        Long a2;
        PerformanceEventType performanceEventType2;
        Long l;
        Long l2;
        Long l3;
        OpenChatListReporter.Span span = OpenChatListReporter.Span.ROOT;
        OpenChatListReporter.Span span2 = mdzVar.b;
        mdz<OpenChatListReporter.Span> mdzVar2 = span2 == span ? mdzVar : null;
        if (mdzVar2 != null) {
            ConcurrentHashMap concurrentHashMap = this.c;
            wto0 wto0Var2 = (wto0) concurrentHashMap.get(mdzVar2);
            if (wto0Var2 == null) {
                return;
            }
            vto0 vto0Var = wto0Var2.a;
            String str2 = this.f.get();
            if (str2 == null) {
                str2 = this.a;
            }
            max.a a3 = this.j.a(str2, vto0Var);
            if ((a3 != null ? a3.a : null) != null) {
                concurrentHashMap.put(mdzVar, new wto0(a3.a, wto0Var2.b));
            }
            mdz<OpenChatListReporter.Span> mdzVar3 = span2 == span ? mdzVar : null;
            cau0 cau0Var = this.l;
            ReporterType reporterType = this.i;
            if (mdzVar3 == null || (wto0Var = (wto0) concurrentHashMap.get(mdzVar3)) == null || (a2 = wto0Var.a()) == null) {
                i = 1;
                str = "regular";
                i2 = 2;
            } else {
                int i3 = a.$EnumSwitchMapping$1[reporterType.ordinal()];
                if (i3 == 1) {
                    i2 = 2;
                    performanceEventType2 = cau0Var.n() ? PerformanceEventType.IM_ITEM_LIST_OPEN_TO_RENDER : PerformanceEventType.CHAT_LIST_OPEN_TO_RENDER;
                } else if (i3 != 2) {
                    i2 = 2;
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    performanceEventType2 = PerformanceEventType.CHANNEL_LIST_OPEN_TO_RENDER;
                } else {
                    i2 = 2;
                    performanceEventType2 = PerformanceEventType.GROUP_CHAT_LIST_OPEN_TO_RENDER;
                }
                String h = performanceEventType2.h();
                i = 1;
                vto0 vto0Var2 = (vto0) this.b.get(OpenChatListReporter.MeasuringPoint.RESUMED);
                Long d = vto0Var2 != null ? vto0Var2.d(wto0Var.a) : null;
                LinkedHashMap r = r();
                List list = (List) r.get(OpenChatListReporter.Span.ON_CREATE);
                Long m = list != null ? pli.m(list) : null;
                Long l4 = d;
                List list2 = (List) r.get(OpenChatListReporter.Span.ON_CREATE_VIEW);
                Long m2 = list2 != null ? pli.m(list2) : null;
                List list3 = (List) r.get(OpenChatListReporter.Span.LOAD_FOLDERS);
                Long m3 = list3 != null ? pli.m(list3) : null;
                List list4 = (List) r.get(OpenChatListReporter.Span.LOAD_DIALOGS);
                Long m4 = list4 != null ? pli.m(list4) : null;
                List list5 = (List) r.get(OpenChatListReporter.Span.DIALOGS_ADAPTER_RENDER);
                Long m5 = list5 != null ? pli.m(list5) : null;
                List list6 = (List) r.get(OpenChatListReporter.Span.LOADER_SPINNER);
                Long m6 = list6 != null ? pli.m(list6) : null;
                Boolean valueOf = a3 != null ? Boolean.valueOf(a3.b) : null;
                Long l5 = m6;
                Boolean bool = Boolean.TRUE;
                if (epx.f(valueOf, bool)) {
                    str = "regular";
                    l = a3.c.a();
                } else {
                    str = "regular";
                    l = null;
                }
                if (epx.f(valueOf, bool)) {
                    l2 = l;
                    l3 = vto0Var.d(a3.a);
                } else {
                    l2 = l;
                    l3 = null;
                }
                String str3 = epx.f(valueOf, bool) ? "cold_start" : epx.f(valueOf, Boolean.FALSE) ? "warm_start" : str;
                s3w0 s3w0Var = new s3w0(h, false);
                Long[] lArr = s3w0Var.j;
                lArr[0] = a2;
                lArr[1] = m;
                lArr[i2] = m2;
                lArr[3] = l4;
                lArr[4] = m3;
                lArr[5] = m4;
                lArr[6] = m5;
                lArr[7] = l5;
                lArr[8] = l3;
                lArr[9] = l2;
                s3w0Var.i[i2] = str3;
                s3w0Var.q();
            }
            if ((span2 == span ? mdzVar : null) != null) {
                mdz b = mdzVar.b(OpenChatListReporter.Span.APP_CREATE);
                if (b != null) {
                    concurrentHashMap.put(b, epx.f(a3 != null ? Boolean.valueOf(a3.b) : null, Boolean.TRUE) ? a3.c : new wto0(0));
                }
                q(rl3.C(OpenChatListReporter.Span.values()), mdzVar);
                int i4 = a.$EnumSwitchMapping$1[reporterType.ordinal()];
                if (i4 == i) {
                    performanceEventType = cau0Var.n() ? PerformanceEventType.IM_ITEM_LIST_OPEN_TO_RENDER : PerformanceEventType.CHAT_LIST_OPEN_TO_RENDER;
                } else if (i4 == i2) {
                    performanceEventType = PerformanceEventType.GROUP_CHAT_LIST_OPEN_TO_RENDER;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    performanceEventType = PerformanceEventType.CHANNEL_LIST_OPEN_TO_RENDER;
                }
                String h2 = performanceEventType.h();
                Boolean valueOf2 = a3 != null ? Boolean.valueOf(a3.b) : null;
                String str4 = epx.f(valueOf2, Boolean.TRUE) ? "cold_start" : epx.f(valueOf2, Boolean.FALSE) ? "warm_start" : str;
                gd5 gd5Var = new gd5(span, h2, gq80.b, 2);
                ListBuilder e = e43.e();
                e.add(new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(1, str4));
                s3q0 s3q0Var = s3q0.a;
                wn6.w(this, mdzVar, gd5Var, e.g(), null, 92);
            }
            LinkedHashMap r2 = r();
            List list7 = (List) r2.get(OpenChatListReporter.Span.ON_CREATE);
            Long m7 = list7 != null ? pli.m(list7) : null;
            List list8 = (List) r2.get(OpenChatListReporter.Span.ON_CREATE_VIEW);
            Long m8 = list8 != null ? pli.m(list8) : null;
            List list9 = (List) r2.get(OpenChatListReporter.Span.LOAD_FOLDERS);
            Long m9 = list9 != null ? pli.m(list9) : null;
            List list10 = (List) r2.get(OpenChatListReporter.Span.LOAD_DIALOGS);
            Long m10 = list10 != null ? pli.m(list10) : null;
            List list11 = (List) r2.get(OpenChatListReporter.Span.DIALOGS_ADAPTER_RENDER);
            Long m11 = list11 != null ? pli.m(list11) : null;
            List list12 = (List) r2.get(OpenChatListReporter.Span.LOADER_SPINNER);
            Long m12 = list12 != null ? pli.m(list12) : null;
            s(m7, "chat_list_fragment_create_time");
            s(m8, "chat_list_fragment_create_view_time");
            s(m9, "chat_list_load_folders_time");
            s(m10, "chat_list_load_dialogs_time");
            s(m11, "chat_list_adapter_render_time");
            s(m12, "chat_list_loader_spinner_time");
        }
    }
}
