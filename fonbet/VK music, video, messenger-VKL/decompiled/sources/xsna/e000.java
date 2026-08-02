package xsna;

import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;
import xsna.g49;
import xsna.il90;

/* compiled from: LogEngineEventsListener.kt */
/* loaded from: classes11.dex */
public final class e000 implements ah8, g49, tsw, il90, ncx0, f39, SessionRoomsManager.OwnRoomsListener, ffq0 {
    @Override // xsna.g49
    public final void a(String str, boolean z, CallId callId) {
        L.e("onCallAccepted peerId=" + str + " isVideo=" + z + " callId=" + callId);
    }

    @Override // xsna.g49
    public final void b(dhw0 dhw0Var, boolean z, Throwable th) {
        L.e(zhy0.a("onUnexpectedCallStartError isIncoming=", z));
        L.e("onUnexpectedCallStartError", th);
    }

    @Override // xsna.il90
    public final void d(il90.a aVar) {
        StringBuilder sb = new StringBuilder("onParticipantsAdded added size: ");
        sb.append(aVar.a().size());
        sb.append("; all size: ");
        L.e(uq.b((ArrayList) aVar.b(), sb));
    }

    @Override // xsna.ah8
    public final void e(hd8 hd8Var) {
        L.e("onBroadcastUpdated broadcast=" + hd8Var);
    }

    @Override // xsna.g49
    public final void f(g49.b bVar) {
        L.e("onJoinToGroupScheduled");
    }

    @Override // xsna.ah8
    public final void g(whr0 whr0Var) {
        L.e("onBroadcastFinished stoppedBy=" + whr0Var);
    }

    @Override // xsna.il90
    public final void h(il90.c cVar) {
        StringBuilder sb = new StringBuilder("onParticipantsDeAnoned deanonymied size: ");
        sb.append(((ArrayList) cVar.c()).size());
        sb.append("; all size: ");
        L.e(uq.b((ArrayList) cVar.a(), sb));
    }

    @Override // xsna.g49
    public final void i(g49.a aVar) {
        L.e("onCallFinished callId=" + aVar.a() + " peerId=" + aVar.b() + " isBusy=" + aVar.c() + " isTimeout=" + aVar.e() + " isObsoleteClient=" + aVar.d());
    }

    @Override // xsna.f39
    public final void j(ArrayList arrayList) {
        L.e("onFeedbackRemoved: " + arrayList.size() + " events");
    }

    @Override // xsna.g49
    public final void k(CallId callId, String str) {
        L.e("onCallConnected peerId=" + str + " callId=" + callId);
    }

    @Override // xsna.g49
    public final void l(int i, boolean z, boolean z2, CallId callId) {
        L.e("onOutgoingCallScheduled callMembersCount=" + i + " isVideo=" + z + " isGroupCall=" + z2 + " callId=" + callId);
    }

    @Override // xsna.tsw
    public final void m(com.vk.voip.b bVar, String str, dhw0 dhw0Var, CallId callId, boolean z) {
        L.e("onIncomingCall");
    }

    @Override // xsna.f39
    public final void n(ArrayList arrayList) {
        L.e("onFeedbackAdded: " + arrayList.size() + " events");
    }

    @Override // xsna.tsw
    public final void o(mlp mlpVar) {
        L.e("onIncomingCallFailed " + mlpVar);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        L.e("onAssignedToRoom " + sessionRoomInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        L.e("onAddedToRoom " + sessionRoomInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        L.e("onMyRoomRemoved " + sessionRoomInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        L.e("onMyRoomUpdated " + sessionRoomInfo);
    }

    @Override // xsna.ffq0
    public final void onUrlSharingStarted(UrlSharingInfo urlSharingInfo) {
        L.e("onUrlSharingStarted " + urlSharingInfo);
    }

    @Override // xsna.ffq0
    public final void onUrlSharingStopped() {
        L.e("onUrlSharingStopped");
    }

    @Override // xsna.ncx0
    public final void onVideoStarted(MovieStartedData movieStartedData) {
        L.e("onVideoStarted " + movieStartedData);
    }

    @Override // xsna.ncx0
    public final void onVideoStatesChanged(MovieStates movieStates) {
        L.e("onVideoStatesChanged " + movieStates);
    }

    @Override // xsna.ncx0
    public final void onVideoStopped(MovieStoppedData movieStoppedData) {
        L.e("onVideoStopped " + movieStoppedData);
    }

    @Override // xsna.g49
    public final void p(CallId callId, boolean z) {
        L.e("onOutgoingCallStartedSuccessfully callId=" + callId + " isVideo=" + z);
    }

    @Override // xsna.g49
    public final void q() {
        L.e("onRingingOnRemoteSide");
    }

    @Override // xsna.g49
    public final void r(boolean z) {
        L.e(zhy0.a("onMigrateToGroupCall ", z));
    }

    @Override // xsna.il90
    public final void s(il90.d dVar) {
        StringBuilder sb = new StringBuilder("onParticipantsRemoved removed size: ");
        sb.append(dVar.c().size());
        sb.append("; all size: ");
        L.e(uq.b((ArrayList) dVar.a(), sb));
    }

    @Override // xsna.il90
    public final void t(il90.e eVar) {
        L.e(uq.b((ArrayList) eVar.a(), new StringBuilder("onParticipantsUpdated all size: ")));
    }

    @Override // xsna.g49
    public final void u(CallId callId, boolean z, boolean z2) {
        L.e("onJoinedToGroupCallSuccessfully callId=" + callId + " isAudio=" + z2);
    }

    @Override // xsna.g49
    public final void v(CallId callId, String str) {
        L.e("onCallDisconnected peerId=" + str + " callId=" + callId);
    }

    @Override // xsna.g49
    public final void w(mlp mlpVar) {
        L.e("onCallStartError " + mlpVar);
        L.e("onCallStartError", mlpVar.b());
    }

    @Override // xsna.il90
    public final void x(il90.b bVar) {
        StringBuilder sb = new StringBuilder("onParticipantsChanged changed size: ");
        sb.append(bVar.b().size());
        sb.append("; all size: ");
        L.e(uq.b((ArrayList) bVar.a(), sb));
    }

    @Override // xsna.f39
    public final void c(String str) {
    }

    @Override // xsna.f39
    public final void onFeedbackEnabledChanged(boolean z) {
    }
}
