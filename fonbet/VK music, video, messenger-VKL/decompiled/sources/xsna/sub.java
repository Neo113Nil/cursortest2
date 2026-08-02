package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import xsna.d1x0;
import xsna.gm50;
import xsna.h8w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sub implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sub(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r10.getSizeMode() == com.vk.libvideo.design.view.overlay.VideoOverlayView.VideoRestrictionSize.MEDIUM) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.view.MotionEvent] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List<PrivacySetting.PrivacyRule> c;
        x7w x7wVar;
        int i = this.b;
        boolean z = true;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                irb irbVar = (irb) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                tub tubVar = (tub) obj2;
                ?? r1 = (MotionEvent) obj;
                irbVar.c(r1);
                T t = ref$ObjectRef.element;
                if (t != 0) {
                    float rawY = ((MotionEvent) t).getRawY() - r1.getRawY();
                    if (rawY > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        tubVar.getClass();
                        if (rawY < irbVar.f) {
                            irbVar.b(rawY);
                        } else {
                            irbVar.d();
                        }
                    }
                } else {
                    ref$ObjectRef.element = r1;
                }
                return s3q0.a;
            case 1:
                nad nadVar = (nad) obj4;
                Boolean bool = (Boolean) obj3;
                Boolean bool2 = (Boolean) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (fkq0.b(nadVar.f.I0())) {
                    Object obj5 = ywe.a;
                    c = !bool.booleanValue() ? Collections.singletonList(PrivacyRules.c) : booleanValue ? Collections.singletonList(PrivacyRules.d) : Collections.singletonList(PrivacyRules.a);
                } else {
                    Object obj6 = ywe.a;
                    c = ywe.c(true ^ bool.booleanValue(), booleanValue);
                }
                PrivacySetting privacySetting = nadVar.n;
                privacySetting.e = c;
                nadVar.W0(privacySetting, bool, bool2);
                return s3q0.a;
            case 2:
                f1o f1oVar = (f1o) obj3;
                Article article = (Article) obj2;
                LinkButton linkButton = ((ArticleDonut.Placeholder) obj4).d;
                di60.w(linkButton != null ? linkButton.c : null, f1oVar.getContext(), null, null, null, null, 62);
                UserId userId = article.c;
                b.d dVar = new b.d("donut_click_pay");
                dVar.b("article_placeholder", "source");
                dVar.b(userId, "owner_id");
                dVar.e();
                return s3q0.a;
            case 3:
                w2w w2wVar = (w2w) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                h8w.a.C2980a c2980a = (h8w.a.C2980a) obj2;
                com.vk.im.engine.models.im_item.a meta = w2wVar.I0().j().getMeta();
                if (meta != null) {
                    h8w.q(w2wVar, meta, arrayList);
                    Collection<eeb> collection = c2980a.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : collection) {
                        if (((eeb) obj7).a.e.d) {
                            arrayList2.add(obj7);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Long.valueOf(((eeb) it.next()).a.a));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj8 : arrayList) {
                        if (arrayList3.contains(Long.valueOf(((v7w) obj8).a.a))) {
                            arrayList4.add(obj8);
                        }
                    }
                    Iterator it2 = arrayList4.iterator();
                    if (it2.hasNext()) {
                        x7wVar = ((v7w) it2.next()).b;
                        while (it2.hasNext()) {
                            x7w x7wVar2 = ((v7w) it2.next()).b;
                            x7wVar.getClass();
                            if (x7wVar.compareTo(x7wVar2) > 0) {
                                x7wVar = x7wVar2;
                            }
                        }
                    } else {
                        x7wVar = null;
                    }
                    if (x7wVar != null) {
                        x7w x7wVar3 = meta.b;
                        if (x7wVar3 == null) {
                            x7wVar3 = x7w.g;
                        }
                        if (x7wVar3.compareTo(x7wVar) > 0) {
                            w2wVar.I0().j().f(com.vk.im.engine.models.im_item.a.a(meta, null, null, 111));
                        }
                    }
                }
                w2wVar.I0().j().e(arrayList);
                return s3q0.a;
            case 4:
                dhw0 dhw0Var = (dhw0) obj4;
                OKVoipEngine.c cVar = (OKVoipEngine.c) obj2;
                StartCallParams.Builder payload = ((StartCallParams.Builder) obj).setOpponentId(ParticipantId.authorized(String.valueOf(dhw0Var.b))).setPayload(((JSONObject) obj3).toString());
                OKVoipEngine.b.getClass();
                b2p0 F = OKVoipEngine.F();
                UserId userId2 = dhw0Var.M;
                StartCallParams.Builder myId = payload.setTokenInfoProvider(new vxb((c2p0) F, userId2)).setMyId(ParticipantId.authorized(String.valueOf(userId2.b)));
                OKVoipEngine.d dVar2 = cVar.h;
                return myId.setOnPrepared(dVar2.a).setOnError(dVar2.b).setStartWithVideo(cVar.d).setEventListener((ConversationEventsListener) dVar2.c).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).build();
            case 5:
                bxp0.a(new qbh0((ymj0) obj4, (zzl0) obj3, obj, (hwi0) obj2, 1));
                return s3q0.a;
            case 6:
                Activity activity = (Activity) obj4;
                Pair pair = (Pair) obj3;
                yp80 yp80Var = (yp80) obj2;
                VideoFile videoFile = (VideoFile) obj;
                if (videoFile != null) {
                    fxc0.B().Y().i(activity, videoFile, new VideoFeedDialogParams.Playlist(null, null, ((Number) pair.j()).intValue(), (UserId) pair.i(), EmptyList.b, null, 0, null, 0, null, false, null, 4000, null));
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                    }
                } else if (yp80Var != null) {
                    yp80Var.U();
                }
                return s3q0.a;
            case 7:
                VideoItemListSmallVh videoItemListSmallVh = (VideoItemListSmallVh) obj4;
                VideoFile videoFile2 = (VideoFile) obj3;
                Context context = (Context) obj2;
                com.vk.libvideo.design.view.overlay.b bVar = (com.vk.libvideo.design.view.overlay.b) obj;
                Object obj9 = VideoItemListSmallVh.c0;
                boolean z2 = bVar.d;
                boolean z3 = bVar.c;
                if (!z2 && videoItemListSmallVh.q) {
                    VideoOverlayView videoOverlayView = videoItemListSmallVh.J;
                    if (videoOverlayView == null) {
                        videoOverlayView = null;
                    }
                    break;
                }
                z = false;
                com.vk.libvideo.design.view.overlay.a a = ((s290) videoItemListSmallVh.S.getValue()).a(z3 ? videoFile2.w2() : null);
                if (z2 && !z3) {
                    return new VideoOverlayView.c.k(bVar);
                }
                if (z3) {
                    VideoOverlayView videoOverlayView2 = videoItemListSmallVh.J;
                    if ((videoOverlayView2 != null ? videoOverlayView2 : null).getSizeMode() == VideoOverlayView.VideoRestrictionSize.SMALL) {
                        if (!z) {
                            bVar = com.vk.libvideo.design.view.overlay.b.a(bVar, 463);
                        }
                        return new VideoOverlayView.c.f(bVar, a, new u14(21, videoItemListSmallVh, videoFile2));
                    }
                }
                com.vk.libvideo.design.view.overlay.b a2 = z ? com.vk.libvideo.design.view.overlay.b.a(bVar, 447) : com.vk.libvideo.design.view.overlay.b.a(bVar, 399);
                return new VideoOverlayView.c.i(a2, a, false, new xo00(videoItemListSmallVh, context, videoFile2, a2));
            default:
                int i2 = VoipVideoListFragment.S;
                gm50.a.a((VoipVideoListFragment) obj4, ((d1x0.a) obj).a, new uwi0(9, (uzw0) obj3, (SwipeRefreshLayout) obj2));
                return s3q0.a;
        }
    }

    public /* synthetic */ sub(w2w w2wVar, ArrayList arrayList, h8w h8wVar, h8w.a.C2980a c2980a) {
        this.b = 3;
        this.c = w2wVar;
        this.d = arrayList;
        this.e = c2980a;
    }
}
