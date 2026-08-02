package xsna;

import android.view.MenuItem;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.voip.OKVoipEngine;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import xsna.ej90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix50 implements izs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ix50(Post post, String str, ej90.b bVar, eax0 eax0Var) {
        this.d = post;
        this.c = str;
        this.e = eax0Var;
        this.f = bVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                nx50 nx50Var = (nx50) this.d;
                View view = (View) this.e;
                MenuItem menuItem = (MenuItem) this.f;
                s38 s38Var = (s38) nx50Var.n0.getValue();
                int itemId = menuItem.getItemId();
                String str = this.c;
                VkContextMenu a = s38Var.a(view, new o720(itemId, str, (List) obj, null), new com.vk.movika.tools.controls.seekbar.f(16, str, nx50Var), new kn20(nx50Var, 10));
                nx50Var.L0 = a;
                if (a != null) {
                    ((com.vk.core.view.components.context.menu.e) a).q = new w8q(nx50Var, 27);
                    a.i(false);
                }
                return s3q0.a;
            case 1:
                JSONObject jSONObject = (JSONObject) this.d;
                dhw0 dhw0Var = (dhw0) this.e;
                OKVoipEngine.c cVar = (OKVoipEngine.c) this.f;
                JoinByLinkParams.Builder payload = ((JoinByLinkParams.Builder) obj).setLink(this.c).setPayload(jSONObject.toString());
                OKVoipEngine.b.getClass();
                b2p0 F = OKVoipEngine.F();
                UserId userId = dhw0Var.M;
                JoinByLinkParams.Builder startWithVideo = payload.setTokenInfoProvider(new vxb((c2p0) F, userId)).setMyId(ParticipantId.authorized(String.valueOf(userId.b))).setStartWithVideo(cVar.d);
                OKVoipEngine.d dVar = cVar.h;
                return startWithVideo.setOnPrepared(dVar.a).setOnError(dVar.b).setEventListener((ConversationEventsListener) dVar.c).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).build();
            default:
                Post post = (Post) this.d;
                eax0 eax0Var = (eax0) this.e;
                ej90.b bVar = (ej90.b) this.f;
                max0 max0Var = new max0();
                StringBuilder sb = new StringBuilder();
                sb.append(post.m);
                sb.append('_');
                sb.append(post.n);
                io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(yfb.x(lax0.c(max0Var, Collections.singletonList(sb.toString()), null, null, 62)));
                String str2 = this.c;
                return new io.reactivex.rxjava3.internal.operators.single.d0(w0.l(new e4t(new sx4(post, str2, bVar, eax0Var), 22)), new l21(post, str2, bVar, eax0Var), null);
        }
    }

    public /* synthetic */ ix50(String str, JSONObject jSONObject, dhw0 dhw0Var, OKVoipEngine.c cVar) {
        this.c = str;
        this.d = jSONObject;
        this.e = dhw0Var;
        this.f = cVar;
    }

    public /* synthetic */ ix50(nx50 nx50Var, View view, MenuItem menuItem, String str) {
        this.d = nx50Var;
        this.e = view;
        this.f = menuItem;
        this.c = str;
    }
}
