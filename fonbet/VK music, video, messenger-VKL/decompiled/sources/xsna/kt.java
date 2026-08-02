package xsna;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.music.Playlist;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.log.L;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.b;
import com.vk.voip.dto.type.StartCallType;
import java.io.File;
import java.io.IOException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.b9a0;
import xsna.d8a0;
import xsna.hud0;
import xsna.ixe;
import xsna.zmw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kt implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kt(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                hud0.e eVar = (hud0.e) this.d;
                izsVar.invoke(new ixe.u((ClipsAuthor) eVar.b().a, (String) this.e, eVar instanceof hud0.b));
                return s3q0.a;
            case 1:
                iiv iivVar = (iiv) this.c;
                zcx zcxVar = (zcx) this.d;
                rej rejVar = (rej) this.e;
                if (!iivVar.a.h) {
                    return null;
                }
                try {
                    riv rivVar = new riv(new File(com.vk.core.files.a.j(), "http_cache_statistics"), r0.i * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, zcxVar);
                    rivVar.c();
                    rejVar.invoke(new tbh(rivVar, 22));
                    return rivVar;
                } catch (IOException e) {
                    L.j(e, "HttpCacheInterceptor");
                    return null;
                }
            case 2:
                ((vh40) this.c).g((Context) this.d, (Playlist) this.e);
                return s3q0.a;
            case 3:
                CallId callId = (CallId) this.c;
                fqw0 fqw0Var = (fqw0) this.d;
                b.d dVar = (b.d) this.e;
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                oKVoipEngine.getClass();
                L.e("calls-sdk-version: 0.2.3");
                OKVoipEngine.F = callId;
                dhw0 a = ehw0.a(fqw0Var.a);
                OKVoipEngine.B = a;
                OKVoipEngine.C = OKVoipEngine.C.b(StartCallType.INCOMING);
                ConversationFactory conversationFactory = OKVoipEngine.x;
                if (conversationFactory == null) {
                    conversationFactory = null;
                }
                conversationFactory.setEnabledDnsResolver(dVar.b);
                ConversationFactory conversationFactory2 = OKVoipEngine.x;
                if (conversationFactory2 == null) {
                    conversationFactory2 = null;
                }
                conversationFactory2.setForceRelayPolicy(dVar.a);
                ConversationFactory conversationFactory3 = OKVoipEngine.x;
                if (conversationFactory3 == null) {
                    conversationFactory3 = null;
                }
                conversationFactory3.setVideoTracksCount(dVar.c);
                ConversationFactory conversationFactory4 = OKVoipEngine.x;
                if (conversationFactory4 == null) {
                    conversationFactory4 = null;
                }
                conversationFactory4.setScreenCapturePermissionProvider(dVar.d);
                try {
                } catch (Exception e2) {
                    dhw0 a2 = ehw0.a(fqw0Var.a);
                    L.f("OKVoipEngine", "error while executing incoming call", e2);
                    cnw0 cnw0Var = OKVoipEngine.v;
                    cnw0 cnw0Var2 = cnw0Var != null ? cnw0Var : null;
                    OKVoipEngine.o.getClass();
                    String d = g620.d(e2);
                    CallId E = oKVoipEngine.E();
                    StartCallType startCallType = (StartCallType) OKVoipEngine.C.b;
                    ulp ulpVar = OKVoipEngine.k;
                    cnw0Var2.e(new zmw0.a(a2, e2, -1, d, E, startCallType, null, new o1g(1, ulpVar.c, usw.class, "onIncomingCallFailed", "onIncomingCallFailed(Lcom/vk/voip/dependencies/EngineCallErrorInfo;)V", 0, 6)));
                    ulpVar.d.b(a2, true, e2);
                }
                if (!oKVoipEngine.w()) {
                    throw new OKVoipEngine.EngineNotInitializedException();
                }
                OKVoipEngine.b bVar = new OKVoipEngine.b(oKVoipEngine.getVideoController());
                ConversationFactory conversationFactory5 = OKVoipEngine.x;
                if (conversationFactory5 == null) {
                    conversationFactory5 = null;
                }
                Conversation answer = conversationFactory5.answer(new jwi(fqw0Var, callId, bVar, a, 2));
                answer.getNetworkConnectionManager().plusAssign(bVar);
                answer.getMediaConnectionManager().addListener(bVar);
                wrj wrjVar = OKVoipEngine.E;
                wrjVar.getClass();
                wrjVar.a.getAndSet(answer);
                return s3q0.a;
            default:
                ((com.vk.photos.root.photoflow.presentation.j) this.c).e.invoke(new a.s.f((d8a0.b) this.d, ((b9a0.c.e) this.e).a));
                return s3q0.a;
        }
    }
}
