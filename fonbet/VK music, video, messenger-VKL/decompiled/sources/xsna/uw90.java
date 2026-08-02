package xsna;

import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.reporters.api.channel.ChannelStubAttachesReporter;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import com.vk.im.reporters.api.msg.MessagesEmptyHistoryMergeReporter;
import com.vk.im.reporters.api.msg.MessagesHistoryMergeReporter;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.im.reporters.api.util.PerformanceReporters;
import xsna.x1b;

/* compiled from: PerformanceReportersStub.kt */
/* loaded from: classes2.dex */
public final class uw90 implements PerformanceReporters {
    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final xhz b() {
        return new c();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final ChannelStubAttachesReporter c(String str) {
        return new a();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final x1b d() {
        return new b();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final MessagesHistoryMergeReporter e(String str, ReporterType reporterType, int i2) {
        return new e();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenMessagesHistoryReporter f(String str) {
        return new g();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenChatListReporter g(String str) {
        return new h();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final LongPollExpiredReporter h() {
        return new d();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenMessagesHistoryReporter i(String str, f5 f5Var) {
        return new ww90();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final MessagesEmptyHistoryMergeReporter k(String str, ReporterType reporterType) {
        return new vw90();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final OpenChatListReporter l(String str) {
        return new i();
    }

    @Override // com.vk.im.reporters.api.util.PerformanceReporters
    public final LongPollHistoryReporter m(String str, PerformanceReporters.ChatType chatType) {
        return new f();
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class a implements ChannelStubAttachesReporter {
        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void c(Object obj) {
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void f(mdz<ChannelStubAttachesReporter.Span> mdzVar, Object obj) {
        }

        @Override // xsna.eik0
        public final boolean h() {
            return false;
        }

        @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
        public final void a() {
        }

        @Override // xsna.eik0
        public final void b() {
        }

        @Override // xsna.eik0
        public final void d(Object obj) {
        }

        @Override // xsna.eik0
        public final void g(String str) {
        }

        @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
        public final void j(int i) {
        }

        @Override // xsna.eik0
        public final void m(String str) {
        }

        @Override // xsna.eik0
        public final void n(Object obj) {
        }

        @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
        public final void o(MsgFromChannel msgFromChannel) {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class b implements x1b {
        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void c(Object obj) {
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void f(mdz<x1b.b> mdzVar, Object obj) {
        }

        @Override // xsna.eik0
        public final boolean h() {
            return false;
        }

        @Override // xsna.eik0
        public final void b() {
        }

        @Override // xsna.eik0
        public final void d(Object obj) {
        }

        @Override // xsna.x1b
        public final void e(String str) {
        }

        @Override // xsna.eik0
        public final void g(String str) {
        }

        @Override // xsna.x1b
        public final void l(String str) {
        }

        @Override // xsna.eik0
        public final void m(String str) {
        }

        @Override // xsna.eik0
        public final void n(Object obj) {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class c implements xhz {
        @Override // xsna.xhz
        public final void a() {
        }

        @Override // xsna.xhz
        public final void b() {
        }

        @Override // xsna.xhz
        public final void c() {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class e implements MessagesHistoryMergeReporter {
        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void c(Object obj) {
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void f(mdz<MessagesHistoryMergeReporter.Span> mdzVar, Object obj) {
        }

        @Override // xsna.eik0
        public final boolean h() {
            return false;
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void n(Object obj) {
        }

        @Override // xsna.eik0
        public final void b() {
        }

        @Override // xsna.eik0
        public final void d(Object obj) {
        }

        @Override // xsna.eik0
        public final void g(String str) {
        }

        @Override // xsna.eik0
        public final void m(String str) {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class f implements LongPollHistoryReporter {
        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void c(Object obj) {
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void f(mdz<LongPollHistoryReporter.Span> mdzVar, Object obj) {
        }

        @Override // xsna.eik0
        public final boolean h() {
            return false;
        }

        @Override // xsna.eik0
        public final void b() {
        }

        @Override // xsna.eik0
        public final void d(Object obj) {
        }

        @Override // xsna.eik0
        public final void g(String str) {
        }

        @Override // xsna.eik0
        public final void m(String str) {
        }

        @Override // xsna.eik0
        public final void n(Object obj) {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class g implements OpenMessagesHistoryReporter {
        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void c(Object obj) {
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void f(mdz<OpenMessagesHistoryReporter.Span> mdzVar, Object obj) {
        }

        @Override // xsna.eik0
        public final boolean h() {
            return false;
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void n(Object obj) {
        }

        @Override // xsna.eik0
        public final void b() {
        }

        @Override // xsna.eik0
        public final void d(Object obj) {
        }

        @Override // xsna.eik0
        public final void g(String str) {
        }

        @Override // xsna.eik0
        public final void m(String str) {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class h implements OpenChatListReporter {
        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void c(Object obj) {
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void f(mdz<OpenChatListReporter.Span> mdzVar, Object obj) {
        }

        @Override // xsna.eik0
        public final boolean h() {
            return false;
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void n(Object obj) {
        }

        @Override // xsna.eik0
        public final void b() {
        }

        @Override // xsna.eik0
        public final void d(Object obj) {
        }

        @Override // xsna.eik0
        public final void g(String str) {
        }

        @Override // xsna.eik0
        public final void m(String str) {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class i implements OpenChatListReporter {
        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void c(Object obj) {
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void f(mdz<OpenChatListReporter.Span> mdzVar, Object obj) {
        }

        @Override // xsna.eik0
        public final boolean h() {
            return false;
        }

        @Override // xsna.eik0
        public final /* bridge */ /* synthetic */ void n(Object obj) {
        }

        @Override // xsna.eik0
        public final void b() {
        }

        @Override // xsna.eik0
        public final void d(Object obj) {
        }

        @Override // xsna.eik0
        public final void g(String str) {
        }

        @Override // xsna.eik0
        public final void m(String str) {
        }
    }

    /* compiled from: PerformanceReportersStub.kt */
    public static final class d implements LongPollExpiredReporter {
        @Override // com.vk.im.reporters.api.engine.LongPollExpiredReporter
        public final void a(LongPollType longPollType, LongPollExpiredReporter.Reason reason) {
        }
    }
}
