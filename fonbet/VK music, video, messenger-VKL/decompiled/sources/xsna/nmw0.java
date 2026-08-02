package xsna;

import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.type.StartCallType;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.pmw0;

/* compiled from: VoipChatInfoDelegate.kt */
/* loaded from: classes7.dex */
public final class nmw0 {
    public final com.vk.voip.ui.c a;
    public final cd9 b;
    public final kmw0 c;
    public io.reactivex.rxjava3.disposables.c d;
    public pmw0 e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final bpn0 h = new bpn0(new uyq0(this, 10));
    public boolean i;

    /* compiled from: VoipChatInfoDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements yzs<VoipChatInfo, CallId, SessionRoomId, s3q0> {
        @Override // xsna.yzs
        public final s3q0 invoke(VoipChatInfo voipChatInfo, CallId callId, SessionRoomId sessionRoomId) {
            VoipChatInfo voipChatInfo2 = voipChatInfo;
            CallId callId2 = callId;
            SessionRoomId sessionRoomId2 = sessionRoomId;
            nmw0 nmw0Var = (nmw0) this.receiver;
            com.vk.voip.ui.c cVar = nmw0Var.a;
            cVar.getClass();
            if (com.vk.voip.ui.c.K0.h()) {
                nmw0Var.a.getClass();
                com.vk.voip.ui.c.Z0 = false;
                LinkedHashMap linkedHashMap = nmw0Var.g;
                Object obj = linkedHashMap.get(callId2);
                if (obj == null) {
                    obj = new LinkedHashSet();
                    linkedHashMap.put(callId2, obj);
                }
                ((Set) obj).add(Long.valueOf(voipChatInfo2.b));
                nmw0Var.c(callId2, sessionRoomId2);
                dhw0 L = cVar.L();
                cVar.X0(L != null ? L.w(voipChatInfo2) : null);
                com.vk.voip.ui.c.r.getClass();
                io70 x = OKVoipEngine.x();
                x.d.invoke(new com.vk.movika.sdk.base.flow.binding.l(13, x, voipChatInfo2));
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipChatInfoDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<CallId, SessionRoomId, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(CallId callId, SessionRoomId sessionRoomId) {
            nmw0 nmw0Var = (nmw0) this.receiver;
            nmw0Var.getClass();
            com.vk.voip.ui.c cVar = nmw0Var.a;
            L.A("VoipChatInfoDelegate", "Chat info was not loaded...");
            if (nmw0Var.c(callId, sessionRoomId)) {
                nmw0Var.d();
            }
            dhw0 L = cVar.L();
            if (L != null) {
                boolean z = L.b != 0 && L.a == null;
                cVar.getClass();
                com.vk.voip.ui.c.Z0 = z;
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipChatInfoDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<CallId, SessionRoomId, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(CallId callId, SessionRoomId sessionRoomId) {
            CallId callId2 = callId;
            SessionRoomId sessionRoomId2 = sessionRoomId;
            nmw0 nmw0Var = (nmw0) this.receiver;
            nmw0Var.i = true;
            nmw0Var.a.getClass();
            if (epx.f(callId2, com.vk.voip.ui.c.T0)) {
                nmw0Var.a.getClass();
                if (epx.f(sessionRoomId2, com.vk.voip.ui.c.B0.j())) {
                    L.A("VoipChatInfoDelegate", "chat info updated for current call and room, rerequest");
                    LinkedHashMap linkedHashMap = nmw0Var.f;
                    Object obj = linkedHashMap.get(callId2);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        linkedHashMap.put(callId2, obj);
                    }
                    ((Set) obj).add(sessionRoomId2);
                    nmw0Var.d();
                }
            }
            return s3q0.a;
        }
    }

    public nmw0(com.vk.voip.ui.c cVar, cd9 cd9Var, kmw0 kmw0Var) {
        this.a = cVar;
        this.b = cd9Var;
        this.c = kmw0Var;
    }

    public final void a() {
        dhw0 L = this.a.L();
        if (L == null || L.r()) {
            return;
        }
        this.e = new pmw0(this.b, new rd9(), new a(3, this, nmw0.class, "onRequestChatInfoSuccess", "onRequestChatInfoSuccess(Lcom/vk/voip/api/dto/VoipChatInfo;Lcom/vk/voip/api/id/CallId;Lru/ok/android/webrtc/sessionroom/SessionRoomId;)V", 0), new b(2, this, nmw0.class, "onRequestChatInfoError", "onRequestChatInfoError(Lcom/vk/voip/api/id/CallId;Lru/ok/android/webrtc/sessionroom/SessionRoomId;)V", 0), new c(2, this, nmw0.class, "onChatInfoUpdated", "onChatInfoUpdated(Lcom/vk/voip/api/id/CallId;Lru/ok/android/webrtc/sessionroom/SessionRoomId;)V", 0), new yqd0(this, 25));
    }

    public final void b() {
        this.g.clear();
        this.f.clear();
        pmw0 pmw0Var = this.e;
        if (pmw0Var != null) {
            pmw0Var.g.dispose();
            io.reactivex.rxjava3.disposables.c cVar = pmw0Var.f;
            if (cVar != null) {
                cVar.dispose();
            }
            pmw0Var.f = null;
        }
        this.e = null;
        this.i = false;
    }

    public final boolean c(CallId callId, SessionRoomId sessionRoomId) {
        Set set = (Set) this.f.get(callId);
        if (set == null || !set.remove(sessionRoomId)) {
            return false;
        }
        this.a.getClass();
        if (!epx.f(callId, com.vk.voip.ui.c.T0)) {
            return false;
        }
        this.a.getClass();
        return epx.f(sessionRoomId, com.vk.voip.ui.c.B0.j());
    }

    public final void d() {
        dhw0 L;
        Integer num;
        pmw0 pmw0Var = this.e;
        if (pmw0Var == null || (L = this.a.L()) == null) {
            return;
        }
        this.a.getClass();
        CallId callId = com.vk.voip.ui.c.T0;
        this.a.getClass();
        SessionRoomId j = com.vk.voip.ui.c.B0.j();
        if (callId.c || L.r()) {
            return;
        }
        com.vk.voip.ui.c cVar = this.a;
        boolean z = L.D;
        VoipChatInfo voipChatInfo = L.B;
        Object room = (voipChatInfo == null || (num = voipChatInfo.f) == null) ? SessionRoomId.MainCall.INSTANCE : new SessionRoomId.Room(num.intValue());
        boolean z2 = false;
        if (voipChatInfo != null && !epx.f(room, j)) {
            dhw0 L2 = cVar.L();
            Object obj = null;
            cVar.X0(L2 != null ? dhw0.a(L2, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, null, -134217731, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : null);
            com.vk.voip.ui.c.r.getClass();
            io70 x = OKVoipEngine.x();
            x.d.invoke(new com.vk.movika.sdk.base.flow.binding.l(13, x, obj));
        } else if (z && voipChatInfo != null && voipChatInfo.e != null) {
            z2 = true;
        }
        if (!z || z2) {
            return;
        }
        if (!this.i) {
            cVar.getClass();
            com.vk.voip.ui.c.r.getClass();
            if (rpk0.c((StartCallType) OKVoipEngine.C.a)) {
                return;
            }
        }
        pmw0Var.h.onNext(new pmw0.a.b(callId, j));
    }

    public final void e() {
        com.vk.voip.ui.c cVar = this.a;
        dhw0 L = cVar.L();
        if (L == null || L.r() || !com.vk.voip.ui.c.J().d()) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = ysg0.b.a.b0(h3x0.class).U(new je40(new gyo0(this, 21), 22));
        dhw0 L2 = cVar.L();
        io.reactivex.rxjava3.core.q s = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(Long.valueOf(L2 != null ? L2.b : 0L)), U);
        s.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(s, qVar, aVar);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.i0(yVar.a0(asu0Var.c()), new hhj0(new mmw0(0), 10)).s0(new utg0(new ubt0(this, 7), 11));
        s0.getClass();
        this.d = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(s0, qVar, aVar).a0(asu0Var.d()), null, new av70(29), new xau0(this, 6));
    }

    public final void f() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
    }
}
