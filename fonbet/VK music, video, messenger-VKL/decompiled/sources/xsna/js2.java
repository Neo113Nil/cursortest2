package xsna;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.ironsource.B;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.webrtc.participant.CallParticipant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class js2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ js2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        ParticipantCollection participants;
        ConversationParticipant byInternal;
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ms2 ms2Var = (ms2) obj2;
                CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) obj;
                OKVoipEngine.b.getClass();
                Conversation z = OKVoipEngine.z();
                ParticipantId externalId = (z == null || (participants = z.getParticipants()) == null || (byInternal = participants.getByInternal(participantId)) == null) ? null : byInternal.getExternalId();
                if (externalId == null) {
                    ms2Var.d.postDelayed(new ls2(i2, ms2Var, participantId), 500L);
                    break;
                } else {
                    ms2Var.e.put(participantId, externalId);
                    break;
                }
                break;
            case 1:
                B.b((B) obj2, (Map) obj);
                break;
            case 2:
                sal salVar = (sal) obj;
                try {
                    ((Runnable) obj2).run();
                    break;
                } catch (Throwable th) {
                    String name = Thread.currentThread().getName();
                    salVar.b.d("Unhandled error in thread '" + name + '\'', th);
                    return;
                }
            case 3:
                WebView webView = (WebView) obj2;
                ner0 ner0Var = (ner0) obj;
                if (webView.getParent() != null) {
                    webView.destroy();
                    ((ViewGroup) webView.getParent()).removeView(webView);
                    u1u0.b(ner0Var);
                    cvk.u(R.string.default_network_error, false);
                    break;
                }
                break;
            case 4:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) obj2;
                sq60 sq60Var = (sq60) obj;
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                if (!postsFromNotificationsFragment.eo().a().A0(sq60Var.a)) {
                    postsFromNotificationsFragment.n0.d(sq60Var, (tc60) postsFromNotificationsFragment.eo().a.U.getValue(), postsFromNotificationsFragment.go().get());
                }
                postsFromNotificationsFragment.eo().b().l();
                break;
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                ?? r0 = ((l4o0) obj2).h;
                if (r0 != 0) {
                    r0.Z(arrayList);
                    break;
                }
                break;
            case 6:
                ((Runnable) obj).run();
                ((com.vk.attachpicker.screen.p) obj2).I(false);
                break;
            default:
                yads.vl2.a((yads.vl2) obj2, (yads.es2) obj);
                break;
        }
    }
}
