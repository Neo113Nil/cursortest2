package xsna;

import com.vk.im.engine.models.c;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.reporters.api.channel.ChannelStubAttachesReporter;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import com.vk.im.reporters.api.msg.MessagesEmptyHistoryMergeReporter;
import com.vk.im.reporters.api.msg.MessagesHistoryMergeReporter;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.im.reporters.api.util.PerformanceReporters;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: PerformanceReportersImpl.kt */
/* loaded from: classes5.dex */
public final class tw90 implements PerformanceReporters, c.b {
    public static final /* synthetic */ qcy<Object>[] n;
    public final cau0 a;
    public final jhg b;
    public final hw90 c;
    public final cpn0 d = new cpn0(new nm60(this, 3));
    public final cpn0 e = new cpn0(new ufk(this, 24));
    public final cpn0 f = new cpn0(new vt30(this, 10));
    public final cpn0 g = new cpn0(new uq50(this, 8));
    public final cpn0 h = new cpn0(new x850(this, 4));
    public final cpn0 i = new cpn0(new l1i(this, 22));
    public final cpn0 j = new cpn0(new wf40(this, 6));
    public final cpn0 k = new cpn0(new lo10(this, 10));
    public final cpn0 l = new cpn0(new ko00(this, 15));
    public final cpn0 m = new cpn0(new p6y(this, 19));

    /* compiled from: PerformanceReportersImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PerformanceReporters.ChatType.values().length];
            try {
                iArr[PerformanceReporters.ChatType.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceReporters.ChatType.GROUP_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(tw90.class, "longPollExpiredReporter", "getLongPollExpiredReporter()Lcom/vk/im/reporters/api/engine/LongPollExpiredReporter;", 0);
        hpf0 hpf0Var = fpf0.a;
        n = new qcy[]{propertyReference1Impl, fp.c(0, tw90.class, "liteSyncReporter", "getLiteSyncReporter()Lcom/vk/im/reporters/api/engine/LiteSyncReporter;", hpf0Var), ep.a(0, tw90.class, "channelMessageSendReporter", "getChannelMessageSendReporter()Lcom/vk/im/reporters/api/channel/ChannelMessageSendReporter;", hpf0Var)};
    }

    public tw90(cau0 cau0Var, jhg jhgVar) {
        this.a = cau0Var;
        this.b = jhgVar;
        this.c = new hw90(cau0Var);
        cau0Var.t(this);
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final xhz b() {
        qcy<Object> qcyVar = n[1];
        return (xhz) this.l.a();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final ChannelStubAttachesReporter c(String str) {
        return ((Boolean) this.j.a()).booleanValue() ? new cdb(str) : ChannelStubAttachesReporter.a.a;
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final x1b d() {
        qcy<Object> qcyVar = n[2];
        return (x1b) this.m.a();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final MessagesHistoryMergeReporter e(String str, ReporterType reporterType, int i) {
        return ((Boolean) this.h.a()).booleanValue() ? new jf20(str, reporterType, i) : MessagesHistoryMergeReporter.a.a;
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenMessagesHistoryReporter f(String str) {
        if (!((Boolean) this.g.a()).booleanValue()) {
            return new mr80(str);
        }
        com.vk.movika.sdk.base.ui.v vVar = new com.vk.movika.sdk.base.ui.v(29);
        sw90 sw90Var = sw90.a;
        asu0.a.getClass();
        return new nr80(str, vVar, sw90Var, asu0.x(), this.b);
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenChatListReporter g(String str) {
        if (!((Boolean) this.e.a()).booleanValue()) {
            return new eq80(str);
        }
        ReporterType reporterType = ReporterType.CHAT;
        sw90 sw90Var = sw90.a;
        asu0.a.getClass();
        return new fui(new fq80(str, reporterType, sw90Var, asu0.x(), this.a), new eq80(str));
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final LongPollExpiredReporter h() {
        qcy<Object> qcyVar = n[0];
        return (LongPollExpiredReporter) this.k.a();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenMessagesHistoryReporter i(String str, f5 f5Var) {
        if (!((Boolean) this.f.a()).booleanValue()) {
            return new mr80(str);
        }
        a040 a040Var = new a040(f5Var, 14);
        sw90 sw90Var = sw90.a;
        asu0.a.getClass();
        return new gui((eik0[]) Arrays.copyOf(new OpenMessagesHistoryReporter[]{new nr80(str, a040Var, sw90Var, asu0.x(), this.b), new mr80(str)}, 2));
    }

    @Override // com.vk.im.engine.models.c.b
    public final void j() {
        this.g.b();
        this.f.b();
        this.d.b();
        this.e.b();
        this.i.b();
        this.h.b();
        this.k.b();
        this.l.b();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final MessagesEmptyHistoryMergeReporter k(String str, ReporterType reporterType) {
        return ((Boolean) this.i.a()).booleanValue() ? new de20(str, reporterType) : MessagesEmptyHistoryMergeReporter.a.a;
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenChatListReporter l(String str) {
        if (!((Boolean) this.e.a()).booleanValue()) {
            return new eq80(str);
        }
        ReporterType reporterType = ReporterType.GROUP_CHAT;
        sw90 sw90Var = sw90.a;
        asu0.a.getClass();
        return new fui(new fq80(str, reporterType, sw90Var, asu0.x(), this.a), new eq80(str));
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final LongPollHistoryReporter m(String str, PerformanceReporters.ChatType chatType) {
        ReporterType reporterType;
        if (!((Boolean) this.d.a()).booleanValue()) {
            return LongPollHistoryReporter.a.a;
        }
        int i = a.$EnumSwitchMapping$0[chatType.ordinal()];
        if (i == 1) {
            reporterType = ReporterType.CHAT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            reporterType = ReporterType.GROUP_CHAT;
        }
        return new h400(str, reporterType);
    }

    @Override // com.vk.im.engine.models.c.b
    public final void a() {
    }
}
