package xsna;

import android.net.Uri;
import android.util.ArrayMap;
import android.view.View;
import com.vk.api.generated.calls.dto.CallsGetConversationByCallResponseDto;
import com.vk.api.generated.messages.dto.MessagesCallInProgressDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsPhotoDto;
import com.vk.api.generated.messages.dto.MessagesConversationDto;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionPerformClick;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.k;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.io.Serializable;
import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.akv;
import xsna.bjw0;
import xsna.gm50;
import xsna.kow0;
import xsna.nmw0;
import xsna.pmw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ozk0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ozk0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object remove;
        Boolean d;
        String title;
        String e;
        int i = 1;
        switch (this.b) {
            case 0:
                LinkButton linkButton = (LinkButton) this.c;
                pzk0 pzk0Var = (pzk0) this.d;
                View view = (View) obj;
                Action action = linkButton.c;
                if (action instanceof ActionPerformClick) {
                    izs<? super LinkButton, s3q0> izsVar = pzk0Var.l;
                    if (izsVar != null) {
                        izsVar.invoke(linkButton);
                    } else {
                        View.OnClickListener onClickListener = pzk0Var.k;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    }
                } else {
                    com.vk.extensions.a.b(action, pzk0Var.getContext(), null, null, null, null, null, null, null, 254);
                    View.OnClickListener onClickListener2 = pzk0Var.k;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                }
                return s3q0.a;
            case 1:
                dhl0 dhl0Var = (dhl0) this.c;
                Serializable serializable = (Serializable) this.d;
                synchronized (dhl0Var.g) {
                    remove = dhl0Var.g.remove(serializable);
                }
                return remove;
            case 2:
                kkm0 kkm0Var = (kkm0) this.c;
                Uri uri = (Uri) this.d;
                akv.a aVar = new akv.a();
                aVar.a = (String) obj;
                aVar.c(uri, "photo", "image.jpg");
                aVar.f = true;
                aVar.e = kkm0Var.b.getConfig().v;
                aVar.d = 3;
                return new akv(aVar);
            case 3:
                rlq0.h((ExtendedUserProfile) this.c, (rlq0) this.d, true);
                return s3q0.a;
            case 4:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) this.c;
                VideoRelatedVideosFragment.b bVar = (VideoRelatedVideosFragment.b) this.d;
                int i2 = VideoRelatedVideosFragment.n0;
                gm50.a.a(videoRelatedVideosFragment, ((k.a) obj).a, new fgm0(2, videoRelatedVideosFragment, bVar));
                return s3q0.a;
            case 5:
                n5u0 n5u0Var = (n5u0) this.c;
                io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) this.d;
                ArrayMap arrayMap = new ArrayMap();
                for (Msg msg : (List) obj) {
                    arrayMap.put(Integer.valueOf(msg.d), msg);
                }
                io.reactivex.rxjava3.disposables.c cVar = n5u0Var.d;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.internal.operators.completable.y q = ((io.reactivex.rxjava3.core.a) n5u0Var.a.invoke(arrayMap.values())).g(new ctb(n5u0Var, i)).q(asu0.a.c());
                int i3 = kwg0.a;
                io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new jwg0("VisibleMsgsUpdater"));
                bVar2.b(subscribe);
                n5u0Var.d = subscribe;
                return s3q0.a;
            case 6:
                VoipCallServiceFragment.c cVar2 = (VoipCallServiceFragment.c) this.c;
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) this.d;
                int i4 = VoipCallServiceFragment.Y;
                sp.g(cVar2.a, 1);
                gm50.a.a(voipCallServiceFragment, ((bjw0.a) obj).a, new tzq0(voipCallServiceFragment, 8));
                return s3q0.a;
            case 7:
                pmw0.a.b bVar3 = (pmw0.a.b) this.c;
                pmw0 pmw0Var = (pmw0) this.d;
                MessagesConversationDto d2 = ((CallsGetConversationByCallResponseDto) obj).d();
                if (d2 != null) {
                    StringBuilder sb = new StringBuilder("Request to load chat info for ");
                    CallId callId = bVar3.a;
                    SessionRoomId sessionRoomId = bVar3.b;
                    sb.append(callId);
                    sb.append(':');
                    sb.append(sessionRoomId);
                    sb.append(" completed");
                    L.e("VoipChatInfoLoader", sb.toString());
                    nmw0.a aVar2 = pmw0Var.b;
                    MessagesChatSettingsDto f = d2.f();
                    MessagesChatSettingsPhotoDto e2 = f != null ? f.e() : null;
                    String str = (e2 == null || ((e = e2.e()) == null && (e = e2.d()) == null && (e = e2.f()) == null)) ? "" : e;
                    long j = d2.g().d().b;
                    MessagesChatSettingsDto f2 = d2.f();
                    String str2 = (f2 == null || (title = f2.getTitle()) == null) ? "" : title;
                    MessagesCallInProgressDto d3 = d2.d();
                    Boolean valueOf = Boolean.valueOf((d3 == null || (d = d3.d()) == null) ? false : d.booleanValue());
                    Integer valueOf2 = sessionRoomId instanceof SessionRoomId.Room ? Integer.valueOf(((SessionRoomId.Room) sessionRoomId).getId()) : null;
                    MessagesChatSettingsDto f3 = d2.f();
                    aVar2.invoke(new VoipChatInfo(j, str2, str, valueOf, valueOf2, f3 != null ? f3.f() : null), bVar3.a, sessionRoomId);
                } else {
                    pmw0Var.h.onNext(pmw0.a.C3519a.a);
                    StringBuilder sb2 = new StringBuilder("Request to load chat info for ");
                    CallId callId2 = bVar3.a;
                    SessionRoomId sessionRoomId2 = bVar3.b;
                    sb2.append(callId2);
                    sb2.append(':');
                    sb2.append(sessionRoomId2);
                    sb2.append(" dialog not found");
                    L.e("VoipChatInfoLoader", sb2.toString());
                    pmw0Var.c.invoke(bVar3.a, sessionRoomId2);
                }
                return s3q0.a;
            default:
                ((kow0.b) this.c).l.c(((low0) this.d).b);
                return s3q0.a;
        }
    }
}
