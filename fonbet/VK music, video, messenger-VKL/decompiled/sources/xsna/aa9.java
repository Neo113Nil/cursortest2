package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Peer;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.calls.CallStartAction;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.t3c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aa9(StoryEntry storyEntry, ClickableApp clickableApp, qkc qkcVar, Context context) {
        this.b = 2;
        this.c = storyEntry;
        this.e = clickableApp;
        this.f = qkcVar;
        this.d = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                kyv kyvVar = (kyv) obj5;
                Context context = (Context) obj4;
                VoipCallSource voipCallSource = (VoipCallSource) obj3;
                Set<? extends CallStartAction> set = (Set) obj2;
                if (((Boolean) obj).booleanValue()) {
                    kyvVar.m(context, voipCallSource, set);
                } else {
                    kyvVar.c(context, voipCallSource, set);
                }
                break;
            case 1:
                yvj yvjVar = (yvj) obj4;
                xvy xvyVar = (xvy) obj3;
                l5c l5cVar = (l5c) obj2;
                h8c h8cVar = (h8c) obj;
                Integer g = i7o0.g(((v8s) obj5).a, new t9(h8cVar, 21));
                if (g == null) {
                    break;
                } else {
                    myc0.h(yvjVar, null, null, new t3c.a(xvyVar, g.intValue(), h8cVar, l5cVar, null), 3);
                    break;
                }
            case 2:
                StoryEntry storyEntry = (StoryEntry) obj5;
                ClickableApp clickableApp = (ClickableApp) obj3;
                qkc qkcVar = (qkc) obj2;
                Context context2 = (Context) obj4;
                if (((Boolean) obj).booleanValue()) {
                    ((p870) qkcVar.h.getValue()).e(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, new axl0(storyEntry.c, clickableApp.b));
                } else {
                    cmf0.d(context2, s200.y(context2), context2.getString(R.string.error), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
                    L.l("Can't update mark notification");
                }
                break;
            case 3:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj5;
                linkedHashMap.put(Integer.valueOf(((c.l) obj4).b), txh.a((txh) obj3, ((LikesDeleteResponseDto) obj).l1(), false, false, false, null, false, 2097055));
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) obj2).T(new e.s(linkedHashMap));
                break;
            case 4:
                g0z g0zVar = (g0z) obj5;
                Bundle bundle = (Bundle) obj3;
                List<MusicTrack> list = (List) obj;
                MusicTrack musicTrack = (MusicTrack) j5g.a0(list);
                bn40.f("Playlist's track successfully loaded");
                g0zVar.f((String) obj4, list, bundle);
                g0zVar.g(musicTrack, list, (MusicPlaybackLaunchContext) obj2, bundle);
                break;
            default:
                w2w w2wVar = (w2w) obj5;
                si30 si30Var = (si30) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj2;
                gtx0 L = w2wVar.I0().o().L(si30Var.c);
                if (!(L instanceof MsgFromUser) || !((com.vk.im.engine.models.messages.a) L).D3(AttachAudioMsg.class, false)) {
                    break;
                } else {
                    MsgFromUser msgFromUser = (MsgFromUser) L;
                    rmg rmgVar = new rmg(si30Var, 26);
                    msgFromUser.getClass();
                    Attach Q7 = com.vk.im.engine.models.messages.a.Q7(msgFromUser, rmgVar, true);
                    if (Q7 instanceof AttachAudioMsg) {
                        AttachAudioMsg attachAudioMsg = (AttachAudioMsg) Q7;
                        if (attachAudioMsg.J3()) {
                            List<Peer.Type> list2 = com.vk.im.engine.utils.a.b;
                            if (!com.vk.im.engine.utils.a.i(attachAudioMsg.f)) {
                                break;
                            } else {
                                ref$BooleanRef.element = true;
                                ref$LongRef.element = msgFromUser.c;
                                attachAudioMsg.m = 0;
                                w2wVar.I0().o().s0(Q7);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ aa9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
