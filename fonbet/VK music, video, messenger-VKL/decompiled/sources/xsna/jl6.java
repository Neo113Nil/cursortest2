package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.api.friends.FriendsGetRecommendations;
import com.vk.dto.common.Direction;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.user.RequestUserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import com.vk.qrcode.d;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.data.b;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import xsna.c99;
import xsna.d4c0;
import xsna.g7g0;
import xsna.ikv0;
import xsna.lgs0;
import xsna.lyr0;
import xsna.r7k0;
import xsna.t5e;
import xsna.xaz;
import xsna.ztz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jl6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jl6(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 10;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        lj30 lj30Var;
        Long n;
        hfz aVar;
        int i = this.b;
        int i2 = 10;
        lj30 lj30Var2 = null;
        r5 = null;
        Long l = null;
        int i3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) obj4;
                ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) obj3;
                ol6 ol6Var = (ol6) obj2;
                FriendsGetRecommendations.Result result = (FriendsGetRecommendations.Result) obj;
                String i4 = result.i();
                cVar.s(i4);
                boolean z = (i4 == null || i4.length() == 0 || result.isEmpty()) ? false : true;
                cVar.r(z);
                profilesRecommendations.q.b = result.trackCode;
                profilesRecommendations.k = i4;
                profilesRecommendations.l.addAll(result);
                j1e0 b7 = ol6Var.b7();
                b7.submitList(a1e0.a(profilesRecommendations, z, ol6Var.K));
                return s3q0.a;
            case 1:
                m99 m99Var = (m99) obj4;
                gzs gzsVar = (gzs) obj2;
                String str = ((c99.c0) obj3).c;
                com.vk.voip.ui.c.b.r(true);
                m99Var.f(s99.a(m99Var.j(), null, null, null, new xaz.d((String) obj, str), null, null, null, false, 247));
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                t5e.j jVar = (t5e.j) obj2;
                dhr0 dhr0Var = dhr0.a;
                Context context = ((ikv0.a) obj4).a;
                ((u5e) obj3).b.b(jVar.a, jVar.b, jVar.c, dhr0Var.c(context)).k(context);
                ((ikv0) obj).a();
                return s3q0.a;
            case 3:
                qnl qnlVar = (qnl) obj4;
                Context context2 = (Context) obj3;
                String str2 = (String) obj2;
                eag0 eag0Var = (eag0) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).c0(eag0Var.c, eag0Var.a, new pnl(qnlVar, context2, str2), null, eag0Var.b);
                return s3q0.a;
            case 4:
                MusicTrack musicTrack = (MusicTrack) obj3;
                f1o f1oVar = (f1o) obj2;
                LinkButton linkButton = ((Episode) obj4).j;
                if (linkButton != null) {
                    hd60.a().v(linkButton.c, f1oVar.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                }
                UserId userId = musicTrack.c;
                b.d dVar = new b.d("donut_click_pay");
                dVar.b("podcast_placeholder", "source");
                dVar.b(userId, "owner_id");
                dVar.e();
                return s3q0.a;
            case 5:
                ck30 ck30Var = (ck30) obj4;
                Peer peer = (Peer) obj3;
                gkx0 gkx0Var = (gkx0) obj2;
                ArrayList b = ck30Var.b(peer, gkx0Var, Direction.BEFORE, 2);
                long j = gkx0Var.b;
                ArrayList b2 = ck30Var.b(peer, gkx0Var, Direction.AFTER, 2);
                if (b.isEmpty()) {
                    lj30Var = null;
                } else {
                    lj30Var = (lj30) b.get(0);
                    lj30 lj30Var3 = (lj30) j5g.b0(1, b);
                    if (j == lj30Var.h.b) {
                        lj30Var = lj30Var3;
                    }
                }
                if (!b2.isEmpty()) {
                    lj30 lj30Var4 = (lj30) b2.get(0);
                    lj30Var2 = j == lj30Var4.h.b ? (lj30) j5g.b0(1, b2) : lj30Var4;
                }
                return new uz50(lj30Var, lj30Var2);
            case 6:
                m060 m060Var = (m060) obj4;
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj3;
                hss hssVar = (hss) obj2;
                m060Var.e.a(requestUserProfile);
                requestUserProfile.i0 = Boolean.FALSE;
                if (m060Var.b) {
                    m060Var.f.b(r7k0.a.e.a, requestUserProfile, hssVar);
                }
                return s3q0.a;
            case 7:
                JSONObject jSONObject = (JSONObject) obj3;
                OKVoipEngine.c cVar2 = (OKVoipEngine.c) obj2;
                OKVoipEngine.d dVar2 = cVar2.h;
                CreateConfParams.Builder builder = (CreateConfParams.Builder) obj;
                Set<CallMemberId> set = ((dhw0) obj4).h;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(mnh0.H((CallMemberId) it.next()));
                }
                return builder.setInitialIds(arrayList).setPayload(jSONObject.toString()).setAnonForbidden(false).setWatchTogetherEnabledForAll(cVar2.b.o).setMyId(ParticipantId.withoutDeviceId(cVar2.c, false)).setOnPrepared(dVar2.a).setOnError(dVar2.b).setStartWithVideo(cVar2.d).setEventListener((ConversationEventsListener) dVar2.c).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).build();
            case 8:
                ObjectOutputStream objectOutputStream = (ObjectOutputStream) obj;
                objectOutputStream.writeInt(2);
                objectOutputStream.writeUTF((String) obj4);
                objectOutputStream.writeUTF((String) obj3);
                objectOutputStream.writeUTF((String) obj2);
                return s3q0.a;
            case 9:
                jmb jmbVar = (jmb) obj3;
                izs izsVar = (izs) obj2;
                d4c0.a aVar2 = (d4c0.a) obj;
                c6z c6zVar = ((l6z) obj4).a;
                if (aVar2.d && c6zVar.J() && (c6zVar instanceof NewsEntry)) {
                    iuc0 iuc0Var = iuc0.b;
                    iuc0.e0().getClass();
                    la60.g((Context) jmbVar.invoke(), (NewsEntry) c6zVar);
                }
                if (izsVar != null) {
                }
                return s3q0.a;
            case 10:
                Activity activity = (Activity) obj4;
                com.vk.qrcode.c cVar3 = (com.vk.qrcode.c) obj3;
                d.b bVar = (d.b) obj2;
                Group group = (Group) obj;
                if (group != null) {
                    com.vk.qrcode.d.b.c(activity, cVar3, group, bVar);
                }
                return s3q0.a;
            case 11:
                ma maVar = (ma) obj3;
                l22 l22Var = (l22) obj2;
                g7g0.c cVar4 = (g7g0.c) obj;
                if (((g7g0.a) obj4).f && (cVar4.b instanceof ztz.a)) {
                    ((ztz.a) cVar4.b).getClass();
                    maVar.invoke(new Throwable((Throwable) null));
                    return s3q0.a;
                }
                yfx0 yfx0Var = cVar4.a;
                String str3 = yfx0Var.a;
                String str4 = (String) yfx0Var.b.get(SharedKt.PARAM_EXPIRES_IN);
                if (str4 != null && (n = arm0.n(str4)) != null) {
                    l = Long.valueOf(System.currentTimeMillis() + (n.longValue() * 1000));
                }
                l22Var.invoke(new g7g0.b(str3, l));
                return s3q0.a;
            default:
                yat0 yat0Var = (yat0) obj4;
                lgs0.a aVar3 = (lgs0.a) obj3;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj2;
                VideoFile videoFile = aVar3.a;
                VideoRecommendationVideosType videoRecommendationVideosType = aVar3.c;
                String str5 = aVar3.e;
                sat0 sat0Var = yat0Var.j;
                sat0Var.getClass();
                io.reactivex.rxjava3.internal.operators.observable.j1 U = io.reactivex.rxjava3.core.q.X(qVar, io.reactivex.rxjava3.core.q.m(qVar, wjs0.b, new qat0(new bn7(sat0Var, 16), i3))).L(new cxd0(new lzl0(yat0Var, 9), 14), false).U(new o8c0(new uat0(yat0Var, videoFile, videoRecommendationVideosType, (lyr0.a) obj, str5), i2));
                yat0Var.i.getClass();
                vfs0 vfs0Var = new vfs0();
                if (!gsi0.b().c) {
                    vfs0Var = null;
                }
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    String P = videoFile.P();
                    if (P == null) {
                        P = "";
                    }
                    aVar = new AboutVideoItem.w.a(P);
                } else {
                    aVar = AboutVideoItem.w.c.b;
                }
                return U.d0(rl3.I(new hfz[]{AboutVideoItem.k.b, vfs0Var, aVar, gsi0.b().c ? new pfs0() : null}));
        }
    }

    public /* synthetic */ jl6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
