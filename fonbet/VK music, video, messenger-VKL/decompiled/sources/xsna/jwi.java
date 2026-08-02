package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockConcert;
import com.vk.catalog2.feature.music.holders.concert.ConcertVh;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import xsna.saj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jwi implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jwi(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ConcertVh concertVh = (ConcertVh) this.c;
                UIBlock uIBlock = (UIBlock) this.d;
                ActionOpenUrl actionOpenUrl = (ActionOpenUrl) this.e;
                Context context = (Context) this.f;
                concertVh.a(CommonAudioStat$TypeAudioArtistClickItem.EventType.BUY_CLICK, ((UIBlockConcert) uIBlock).z.d);
                concertVh.e.a(new cfp0(uIBlock, actionOpenUrl.c));
                concertVh.c.e().e(context, actionOpenUrl, uIBlock.f, null, Bundle.EMPTY);
                return s3q0.a;
            case 1:
                saj sajVar = (saj) this.c;
                LayoutInflater layoutInflater = (LayoutInflater) this.d;
                RecyclerView.u uVar = (RecyclerView.u) this.e;
                saj.a aVar = (saj.a) this.f;
                ViewGroup viewGroup = (ViewGroup) obj;
                if (sajVar.i) {
                    View inflate = layoutInflater.inflate(R.layout.vkim_contacts_selection_preview_vh, viewGroup, false);
                    int i = sajVar.g;
                    sajVar.g = i + 1;
                    return new iei0(inflate, layoutInflater, uVar, i, aVar);
                }
                View inflate2 = layoutInflater.inflate(R.layout.vkim_contacts_selection_preview_vh_old, viewGroup, false);
                int i2 = sajVar.g;
                sajVar.g = i2 + 1;
                return new jei0(inflate2, layoutInflater, uVar, i2, aVar);
            default:
                fqw0 fqw0Var = (fqw0) this.c;
                CallId callId = (CallId) this.d;
                OKVoipEngine.b bVar = (OKVoipEngine.b) this.e;
                dhw0 dhw0Var = (dhw0) this.f;
                AnswerCallParams.Builder opponentId = ((AnswerCallParams.Builder) obj).setConversationParams(fqw0Var.e).setConversationId(callId.b).setOpponentId(ParticipantId.authorized(fqw0Var.c));
                String str = fqw0Var.g;
                if (str.length() > 0) {
                    OKVoipEngine.b.getClass();
                    opponentId.setTokenInfoProvider(new hoi0((c2p0) OKVoipEngine.F(), str));
                    opponentId.setMyId(ParticipantId.authorized(str));
                    opponentId.setAnswerAsContact(true);
                } else {
                    opponentId.setMyId(ParticipantId.authorized(fqw0Var.b));
                }
                return opponentId.setStartWithVideo(false).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).setEventListener((ConversationEventsListener) bVar).setOnPrepared((izs<? super Conversation, s3q0>) new c3b(fqw0Var, dhw0Var, callId, 3)).setOnError((izs<? super Throwable, s3q0>) new z5a(21, fqw0Var, dhw0Var)).build();
        }
    }
}
