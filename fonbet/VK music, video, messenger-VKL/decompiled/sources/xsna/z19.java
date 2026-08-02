package xsna;

import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;
import ru.ok.android.externcalls.sdk.dev.CallsSDKException;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.webrtc.Call;
import xsna.a7f0;
import xsna.f29;
import xsna.h4g;
import xsna.q29;
import xsna.w19;

/* compiled from: CallDebugMenuFeature.kt */
/* loaded from: classes7.dex */
public final class z19 extends wk50<p29, a29, w19, f29> {
    public final c29 f;
    public final ea9 g;
    public final r29 h;
    public final com.vk.movika.sdk.base.ui.g0 i;
    public final i4g j;
    public final f4z k;

    public z19(c29 c29Var, ea9 ea9Var, r29 r29Var, com.vk.movika.sdk.base.ui.g0 g0Var, i4g i4gVar) {
        super(w19.e.b, new h29());
        this.f = c29Var;
        this.g = ea9Var;
        this.h = r29Var;
        this.i = g0Var;
        this.j = i4gVar;
        this.k = new f4z();
    }

    @Override // xsna.wk50
    public final void N(a29 a29Var, w19 w19Var) {
        Call underlyingCall;
        DebugManager debugManager;
        ia9 e;
        boolean z;
        oa9 a;
        boolean z2;
        b49 d;
        boolean z3;
        b49 d2;
        boolean z4;
        b49 d3;
        boolean z5;
        DebugManager debugManager2;
        w19 w19Var2 = w19Var;
        boolean z6 = w19Var2 instanceof w19.e;
        c29 c29Var = this.f;
        r29 r29Var = this.h;
        if (z6) {
            if (c29Var == null) {
                this.k.b(x19.b);
                return;
            }
            T(new f29.b(c29Var.c()));
            a7f0.a.e(this, c29Var.a(), null, new tl0(this, 17), new zj(7), null, 9);
            a7f0.a.e(this, this.g.b(), null, new v9(this, 12), new pl2(3), null, 9);
            if (r29Var != null) {
                a7f0.a.e(this, r29Var.c(), null, new com.vk.movika.sdk.base.hooks.p(this, 18), new c2(5), null, 9);
                a7f0.a.e(this, r29Var.f(), null, new s6(this, 15), new y40(8), null, 9);
                a7f0.a.e(this, r29Var.b(), null, new wl0(this, 10), new ci7(3), null, 9);
                return;
            }
            return;
        }
        if (w19Var2 instanceof w19.c) {
            ConversationAnalyticsSender conversationAnalyticsSender = (ConversationAnalyticsSender) this.i.invoke();
            if (conversationAnalyticsSender != null) {
                conversationAnalyticsSender.forceSendScheduledEvents();
                return;
            }
            return;
        }
        if (w19Var2 instanceof w19.a) {
            i0q0.j(new y19(0));
            return;
        }
        if (w19Var2 instanceof w19.g) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            CallsSDKException callsSDKException = new CallsSDKException("It's test application crash... Please don't worry!", null, 2, null);
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null || (debugManager2 = conversation.getDebugManager()) == null) {
                return;
            }
            debugManager2.reportError(callsSDKException);
            return;
        }
        if (w19Var2 instanceof w19.h) {
            w19.h hVar = (w19.h) w19Var2;
            if (c29Var != null) {
                c29Var.b(hVar.b);
                return;
            }
            return;
        }
        if (w19Var2 instanceof w19.j) {
            w19.j jVar = (w19.j) w19Var2;
            if (r29Var == null || (d3 = r29Var.d()) == null || d3.c == (z5 = jVar.b)) {
                return;
            }
            d3.c = z5;
            d3.a.a("enable_join_as_group", z5);
            d3.b.onNext(new q29.a(d3.c, d3.d, d3.e));
            return;
        }
        if (w19Var2 instanceof w19.i) {
            w19.i iVar = (w19.i) w19Var2;
            if (r29Var == null || (d2 = r29Var.d()) == null || d2.d == (z4 = iVar.b)) {
                return;
            }
            d2.d = z4;
            d2.a.a("enable_join_as_anonym", z4);
            d2.b.onNext(new q29.a(d2.c, d2.d, d2.e));
            return;
        }
        if (w19Var2 instanceof w19.k) {
            w19.k kVar = (w19.k) w19Var2;
            if (r29Var == null || (d = r29Var.d()) == null || d.e == (z3 = kVar.b)) {
                return;
            }
            d.e = z3;
            d.a.a("enable_join_with_changed_name", z3);
            d.b.onNext(new q29.a(d.c, d.d, d.e));
            return;
        }
        if (w19Var2 instanceof w19.l) {
            w19.l lVar = (w19.l) w19Var2;
            if (r29Var == null || (a = r29Var.a()) == null || a.c == (z2 = lVar.b)) {
                return;
            }
            a.c = z2;
            a.a.a("enable_open_call_with_stereo_ui", z2);
            a.b.onNext(new q29.c(a.c));
            return;
        }
        if (w19Var2 instanceof w19.f) {
            i4g i4gVar = this.j;
            if (i4gVar != null) {
                h4g.a aVar = new h4g.a(i4gVar.a, null);
                aVar.c(new cpo(false, 0, 7));
                aVar.I(true);
                aVar.O();
                aVar.J();
                aVar.d.Y = 0;
                aVar.v0(R.string.voip_dump_dialog_title);
                aVar.I0("CollectDumpFragment");
                return;
            }
            return;
        }
        if (!(w19Var2 instanceof w19.b)) {
            if (!(w19Var2 instanceof w19.d)) {
                throw new NoWhenBranchMatchedException();
            }
            OKVoipEngine.b.getClass();
            Conversation conversation2 = OKVoipEngine.E.getConversation();
            if (conversation2 == null || (underlyingCall = conversation2.getUnderlyingCall()) == null) {
                return;
            }
            underlyingCall.forceP2PRelay();
            return;
        }
        w19.b bVar = (w19.b) w19Var2;
        if (r29Var != null && (e = r29Var.e()) != null && e.c != (z = bVar.b)) {
            e.c = z;
            e.b.onNext(new q29.b(z));
        }
        OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
        com.vk.movika.sdk.base.logic.interactor.d dVar = new com.vk.movika.sdk.base.logic.interactor.d(bVar, 19);
        oKVoipEngine2.getClass();
        Conversation conversation3 = OKVoipEngine.E.getConversation();
        if (conversation3 == null || (debugManager = conversation3.getDebugManager()) == null) {
            return;
        }
        debugManager.updateCameraToggles(new e2s(dVar, 20));
    }
}
