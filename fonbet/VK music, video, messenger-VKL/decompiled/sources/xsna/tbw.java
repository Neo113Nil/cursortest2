package xsna;

import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.reporters.CancelReason;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.reporters.api.engine.LongPollReporter;
import com.vk.im.reporters.api.util.PerformanceReporters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import xsna.mwv;
import xsna.uz30;

/* compiled from: ImReportersStub.kt */
/* loaded from: classes2.dex */
public final class tbw implements pbw {
    @Override // xsna.pbw
    public final ktm a() {
        return new h();
    }

    @Override // xsna.pbw
    public final feb b() {
        return new d();
    }

    @Override // xsna.pbw
    public final bcw c() {
        return new v();
    }

    @Override // xsna.pbw
    public final ry30 d() {
        return new q();
    }

    @Override // xsna.pbw
    public final uz30 e() {
        return new r();
    }

    @Override // xsna.pbw
    public final uim f() {
        return new t();
    }

    @Override // xsna.pbw
    public final n2w g() {
        return new j();
    }

    @Override // xsna.pbw
    public final orw h() {
        return new k();
    }

    @Override // xsna.pbw
    public final t3v0 i() {
        return new m();
    }

    @Override // xsna.pbw
    public final cim j() {
        return new i();
    }

    @Override // xsna.pbw
    public final vok0 k(String str) {
        return new w();
    }

    @Override // xsna.pbw
    public final cxs0 l() {
        return new x();
    }

    @Override // xsna.pbw
    public final jkb m() {
        return new f();
    }

    @Override // xsna.pbw
    public final PerformanceReporters n() {
        return new uw90();
    }

    @Override // xsna.pbw
    public final cb20 o() {
        return new p();
    }

    @Override // xsna.pbw
    public final gxv p() {
        return new b();
    }

    @Override // xsna.pbw
    public final lau0 q() {
        return new s();
    }

    @Override // xsna.pbw
    public final mvw r() {
        return new l();
    }

    @Override // xsna.pbw
    public final e38 s() {
        return new c();
    }

    @Override // xsna.pbw
    public final n2n0 t() {
        return new blk();
    }

    @Override // xsna.pbw
    public final LongPollReporter u() {
        return new n();
    }

    @Override // xsna.pbw
    public final uz30 v() {
        return new e();
    }

    @Override // xsna.pbw
    public final k0w w() {
        return new g();
    }

    @Override // xsna.pbw
    public final mwv<mwv.a> x() {
        return new a();
    }

    @Override // xsna.pbw
    public final yz2 y() {
        return new u();
    }

    @Override // xsna.pbw
    public final m400 z() {
        return new o();
    }

    /* compiled from: ImReportersStub.kt */
    public static final class k implements orw {
        @Override // xsna.orw
        public final void a() {
        }

        @Override // xsna.orw
        public final void b() {
        }

        @Override // xsna.orw
        public final void d(List<? extends Attach> list) {
        }

        @Override // xsna.orw
        public final void c(Msg msg, Attach attach, boolean z, View view) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class n implements LongPollReporter {
        @Override // com.vk.im.reporters.api.engine.LongPollReporter
        public final void a() {
        }

        @Override // com.vk.im.reporters.api.engine.LongPollReporter
        public final void b() {
        }

        @Override // com.vk.im.reporters.api.engine.LongPollReporter
        public final void c(LongPollReporter.LongPollTask longPollTask, long j) {
        }

        @Override // com.vk.im.reporters.api.engine.LongPollReporter
        public final void d(LongPollReporter.LongPollTask longPollTask, long j) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class o implements m400 {
        @Override // xsna.m400
        public final void a() {
        }

        @Override // xsna.m400
        public final void b(List<? extends e900> list) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class s implements lau0 {
        @Override // xsna.lau0
        public final void a() {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class v implements bcw {
        @Override // xsna.bcw
        public final void a() {
        }

        @Override // xsna.bcw
        public final void b() {
        }

        @Override // xsna.bcw
        public final void c() {
        }

        @Override // xsna.bcw
        public final void d() {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class a implements mwv<mwv.a> {
        @Override // xsna.mwv
        public final void a(mwv.a aVar) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class b implements gxv {
        @Override // xsna.gxv
        public final void a(long j) {
        }

        @Override // xsna.gxv
        public final void b(String str) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class d implements feb {
        @Override // xsna.feb
        public final void a(long j) {
        }

        @Override // xsna.feb
        public final void b(long j) {
        }

        @Override // xsna.feb
        public final void c(long j) {
        }

        @Override // xsna.feb
        public final void d(long j) {
        }

        @Override // xsna.feb
        public final void e(long j, boolean z) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class e implements uz30 {
        @Override // xsna.uz30
        public final void a(long j) {
        }

        @Override // xsna.uz30
        public final void b(uz30.a aVar) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class f implements jkb {
        @Override // xsna.jkb
        public final void a(long j) {
        }

        @Override // xsna.jkb
        public final void b(Long l) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class g implements k0w {
        @Override // xsna.k0w
        public final void a(String str) {
        }

        @Override // xsna.k0w
        public final void b(long j) {
        }

        @Override // xsna.k0w
        public final void d(long j) {
        }

        @Override // xsna.k0w
        public final void j(long j) {
        }

        @Override // xsna.k0w
        public final void c(Peer peer, String str) {
        }

        @Override // xsna.k0w
        public final void e(long j, ArrayList arrayList) {
        }

        @Override // xsna.k0w
        public final void f(long j, ArrayList arrayList) {
        }

        @Override // xsna.k0w
        public final void g(long j, ArrayList arrayList) {
        }

        @Override // xsna.k0w
        public final void h(long j, long j2) {
        }

        @Override // xsna.k0w
        public final void i(long j, String str) {
        }

        @Override // xsna.k0w
        public final void k(long j, String str) {
        }

        @Override // xsna.k0w
        public final void l(long j, long j2) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class l implements mvw {
        @Override // xsna.mvw
        public final void a(InfoBar infoBar) {
        }

        @Override // xsna.mvw
        public final void b(InfoBar infoBar) {
        }

        @Override // xsna.mvw
        public final void c(String str) {
        }

        @Override // xsna.mvw
        public final void d(long j, InfoBar.ButtonType buttonType) {
        }

        @Override // xsna.mvw
        public final void e(long j, ArrayList arrayList) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class p implements cb20 {
        @Override // xsna.cb20
        public final void a(Dialog dialog) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class q implements ry30 {
        @Override // xsna.ry30
        public final void b(long j) {
        }

        @Override // xsna.ry30
        public final void c(Collection<? extends Msg> collection) {
        }

        @Override // xsna.ry30
        public final void d(xy30 xy30Var) {
        }

        @Override // xsna.ry30
        public final void e(Collection<? extends Msg> collection) {
        }

        @Override // xsna.ry30
        public final void g(ArrayList arrayList) {
        }

        @Override // xsna.ry30
        public final void a(long j, List<? extends Attach> list) {
        }

        @Override // xsna.ry30
        public final void f(int i, long j) {
        }

        @Override // xsna.ry30
        public final void h(int i, long j) {
        }

        @Override // xsna.ry30
        public final void i(Collection<? extends Msg> collection, CancelReason cancelReason) {
        }

        @Override // xsna.ry30
        public final void j(long j, int i, ArrayList arrayList) {
        }

        @Override // xsna.ry30
        public final void k(int i, long j, Throwable th) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class r implements uz30 {
        @Override // xsna.uz30
        public final void a(long j) {
        }

        @Override // xsna.uz30
        public final void b(uz30.a aVar) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class t implements uim {
        @Override // xsna.uim
        public final void a(long j) {
        }

        @Override // xsna.uim
        public final void b(long j) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class c implements e38 {
        @Override // xsna.e38
        public final void a(long j, MsgSendSource msgSendSource) {
        }

        @Override // xsna.e38
        public final void b(int i, long j, String str) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class h implements ktm {
        @Override // xsna.ktm
        public final void b(long j, String str) {
        }

        @Override // xsna.ktm
        public final void a(DialogsFilter dialogsFilter, DialogsFilter dialogsFilter2, DialogsFilterChangeSource dialogsFilterChangeSource) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class j implements n2w {
        @Override // xsna.n2w
        public final void b(long j, long j2) {
        }

        @Override // xsna.n2w
        public final void d(long j, String str) {
        }

        @Override // xsna.n2w
        public final void e(EngineInvalidateSource engineInvalidateSource, boolean z) {
        }

        @Override // xsna.n2w
        public final void a(long j, long j2, String str) {
        }

        @Override // xsna.n2w
        public final void c(long j, String str, String str2) {
        }

        @Override // xsna.n2w
        public final void f(long j, String str, String str2) {
        }

        @Override // xsna.n2w
        public final void g(long j, String str, String str2) {
        }

        @Override // xsna.n2w
        public final void h(long j, long j2, String str) {
        }

        @Override // xsna.n2w
        public final void j(long j, String str, String str2) {
        }

        @Override // xsna.n2w
        public final void i(int i, int i2, int i3, String str) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class x implements cxs0 {
        @Override // xsna.cxs0
        public final void a(Msg msg, AttachVideoMsg attachVideoMsg) {
        }

        @Override // xsna.cxs0
        public final void b(Msg msg, AttachVideoMsg attachVideoMsg) {
        }

        @Override // xsna.cxs0
        public final void c(Msg msg, AttachVideoMsg attachVideoMsg) {
        }

        @Override // xsna.cxs0
        public final void f(Msg msg, AttachVideoMsg attachVideoMsg) {
        }

        @Override // xsna.cxs0
        public final void g(Msg msg, AttachVideoMsg attachVideoMsg) {
        }

        @Override // xsna.cxs0
        public final void i(Msg msg, AttachVideoMsg attachVideoMsg) {
        }

        @Override // xsna.cxs0
        public final void k(Msg msg, AttachVideoMsg attachVideoMsg) {
        }

        @Override // xsna.cxs0
        public final void d(long j, long j2, int i, boolean z) {
        }

        @Override // xsna.cxs0
        public final void e(long j, long j2, int i, boolean z) {
        }

        @Override // xsna.cxs0
        public final void j(long j, long j2, int i, boolean z) {
        }

        @Override // xsna.cxs0
        public final void h(long j, long j2, Integer num, Integer num2, Integer num3, Integer num4) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class i implements cim {
        @Override // xsna.cim
        public final void a(long j, String str, boolean z) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class m implements t3v0 {
        @Override // xsna.t3v0
        public final void a(String str, boolean z, boolean z2) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class w implements vok0 {
        @Override // xsna.vok0
        public final void a(long j, UUID uuid, f0z f0zVar) {
        }
    }

    /* compiled from: ImReportersStub.kt */
    public static final class u implements yz2 {
        @Override // xsna.yz2
        public final void a(int i, int i2, int i3, String str) {
        }
    }
}
