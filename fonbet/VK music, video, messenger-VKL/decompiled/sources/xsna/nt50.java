package xsna;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.analytics.device.audio.output.model.VoipAudioOutputTypeAnalytics;
import com.vk.voip.api.id.CallId;
import kotlin.NoWhenBranchMatchedException;
import xsna.e49;

/* compiled from: MyTrackerVoipProdStatHelper.kt */
/* loaded from: classes11.dex */
public final class nt50 implements pvw0 {
    @Override // xsna.e49
    public final void E(e49.j jVar) {
        el3 el3Var = Event.b;
        Event.a b = h5s.b("join_call");
        OKVoipEngine.b.getClass();
        b.b("login", Integer.valueOf(OKVoipEngine.x().a() == null ? 1 : 0));
        b.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        com.vk.metrics.eventtracking.b.a.k(b.e());
    }

    @Override // xsna.e49
    public final void h(e49.n nVar) {
        String str;
        boolean e = nVar.e();
        if (e) {
            str = "start_group_call";
        } else {
            if (e) {
                throw new NoWhenBranchMatchedException();
            }
            str = "start_p2p_call";
        }
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        com.vk.metrics.eventtracking.b.a.k(aVar.e());
    }

    @Override // xsna.e49
    public final void v(e49.f fVar) {
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("accept_call");
        aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        com.vk.metrics.eventtracking.b.a.k(aVar.e());
    }

    @Override // xsna.pvw0
    public final void A0() {
    }

    @Override // xsna.pvw0
    public final void B() {
    }

    @Override // xsna.pvw0
    public final void D() {
    }

    @Override // xsna.pvw0
    public final void E0() {
    }

    @Override // xsna.pvw0
    public final void F() {
    }

    @Override // xsna.pvw0
    public final void G0() {
    }

    @Override // xsna.pvw0
    public final void H() {
    }

    @Override // xsna.pvw0
    public final void I() {
    }

    @Override // xsna.pvw0
    public final void L() {
    }

    @Override // xsna.pvw0
    public final void N() {
    }

    @Override // xsna.pvw0
    public final void N0() {
    }

    @Override // xsna.c8j
    public final void O() {
    }

    @Override // xsna.pvw0
    public final void O0() {
    }

    @Override // xsna.pvw0
    public final void P() {
    }

    @Override // xsna.pvw0
    public final void P0() {
    }

    @Override // xsna.pvw0
    public final void S() {
    }

    @Override // xsna.pvw0
    public final void W() {
    }

    @Override // xsna.pvw0
    public final void X() {
    }

    @Override // xsna.pvw0
    public final void Y() {
    }

    @Override // xsna.pvw0
    public final void Z() {
    }

    @Override // xsna.pvw0
    public final void a0() {
    }

    @Override // xsna.pvw0
    public final void b() {
    }

    @Override // xsna.pvw0
    public final void c() {
    }

    @Override // xsna.c8j
    public final void c0() {
    }

    @Override // xsna.pvw0, xsna.ubx0
    public final void d() {
    }

    @Override // xsna.pvw0
    public final void d0() {
    }

    @Override // xsna.pvw0
    public final void e() {
    }

    @Override // xsna.pvw0
    public final void g() {
    }

    @Override // xsna.pvw0
    public final void g0() {
    }

    @Override // xsna.pvw0
    public final void h0() {
    }

    @Override // xsna.pvw0
    public final void i() {
    }

    @Override // xsna.pvw0
    public final void i0() {
    }

    @Override // xsna.pvw0
    public final void k() {
    }

    @Override // xsna.pvw0
    public final void k0() {
    }

    @Override // xsna.pvw0
    public final void l() {
    }

    @Override // xsna.pvw0
    public final void l0() {
    }

    @Override // xsna.pvw0
    public final void m0() {
    }

    @Override // xsna.pvw0
    public final void o() {
    }

    @Override // xsna.pvw0
    public final void o0() {
    }

    @Override // xsna.dew0
    public final void p() {
    }

    @Override // xsna.c8j
    public final void q() {
    }

    @Override // xsna.pvw0
    public final void q0() {
    }

    @Override // xsna.pvw0
    public final void r() {
    }

    @Override // xsna.pvw0
    public final void reset() {
    }

    @Override // xsna.pvw0
    public final void s0() {
    }

    @Override // xsna.pvw0
    public final void t() {
    }

    @Override // xsna.pvw0
    public final void u0() {
    }

    @Override // xsna.pvw0
    public final void v0() {
    }

    @Override // xsna.pvw0
    public final void w() {
    }

    @Override // xsna.pvw0
    public final void w0() {
    }

    @Override // xsna.dew0
    public final void x0() {
    }

    @Override // xsna.pvw0
    public final void z0() {
    }

    @Override // xsna.e49
    public final void B0(e49.e eVar) {
    }

    @Override // xsna.pvw0
    public final void C(CallId callId) {
    }

    @Override // xsna.pvw0
    public final void C0(CallId callId) {
    }

    @Override // xsna.e49
    public final void D0(e49.l lVar) {
    }

    @Override // xsna.pvw0
    public final void F0(int i) {
    }

    @Override // xsna.pvw0
    public final void I0(CallId callId) {
    }

    @Override // xsna.e49
    public final void J(e49.m mVar) {
    }

    @Override // xsna.qew0
    public final void J0(VoipAudioOutputTypeAnalytics voipAudioOutputTypeAnalytics) {
    }

    @Override // xsna.e49
    public final void K0(e49.i iVar) {
    }

    @Override // xsna.pvw0
    public final void L0(boolean z) {
    }

    @Override // xsna.pvw0
    public final void M0(Integer num) {
    }

    @Override // xsna.pvw0
    public final void Q(boolean z) {
    }

    @Override // xsna.pvw0
    public final void R(CallId callId) {
    }

    @Override // xsna.pvw0
    public final void T(CallId callId) {
    }

    @Override // xsna.e49
    public final void U(e49.d dVar) {
    }

    @Override // xsna.e49
    public final void V(e49.a aVar) {
    }

    @Override // xsna.pvw0
    public final void b0(boolean z) {
    }

    @Override // xsna.e49
    public final void f0(e49.g gVar) {
    }

    @Override // xsna.pvw0
    public final void j0(int i) {
    }

    @Override // xsna.pvw0
    public final void m(int i) {
    }

    @Override // xsna.pvw0
    public final void n(CallId callId) {
    }

    @Override // xsna.pvw0
    public final void n0(String str) {
    }

    @Override // xsna.pvw0
    public final void r0(String str) {
    }

    @Override // xsna.pvw0
    public final void s(boolean z) {
    }

    @Override // xsna.e49
    public final void u(e49.h hVar) {
    }

    @Override // xsna.e49
    public final void y(e49.c cVar) {
    }

    @Override // xsna.pvw0
    public final void y0(Mask mask) {
    }

    @Override // xsna.e49
    public final void z(e49.k kVar) {
    }

    @Override // xsna.pvw0
    public final void G(int i, UserId userId) {
    }

    @Override // xsna.pvw0
    public final void H0(String str, String str2) {
    }

    @Override // xsna.e49
    public final void K(String str, e49.b bVar) {
    }

    @Override // xsna.pvw0
    public final void M(int i, boolean z) {
    }

    @Override // xsna.pvw0, xsna.ubx0
    public final void a(int i, UserId userId) {
    }

    @Override // xsna.pvw0
    public final void e0(xw3 xw3Var, cow0 cow0Var) {
    }

    @Override // xsna.pvw0, xsna.ubx0
    public final void f(int i, UserId userId) {
    }

    @Override // xsna.pvw0
    public final void j(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
    }

    @Override // xsna.pvw0
    public final void p0(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
    }

    @Override // xsna.pvw0
    public final void t0(String str, String str2, boolean z) {
    }

    @Override // xsna.pvw0
    public final void x(UserId userId, long j, int i) {
    }

    @Override // xsna.pvw0
    public final void A(int i, String str, String str2, boolean z) {
    }
}
