package xsna;

import android.graphics.Bitmap;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.Good;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.PaidReaction;
import com.vk.im.ui.components.common.DndPeriodAndSound;
import com.vk.metrics.logging.PerfLogger;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.core.api.models.SignUpField;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bsb;
import xsna.dd9;
import xsna.dug0;
import xsna.fks;
import xsna.gm50;
import xsna.ig3;
import xsna.oj8;
import xsna.p66;
import xsna.qvq;
import xsna.usc;
import xsna.x3b;
import xsna.xn50;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class fb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r1v54, types: [xsna.ne8] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r4;
        ArrayList arrayList;
        PaidReaction paidReaction;
        s3q0 invoke$lambda$2;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) obj2;
                fks fksVar = (fks) obj;
                int i3 = AbsFriendsAndFollowersTabFragment.X;
                if (fksVar instanceof fks.a) {
                    xn50.a.c(absFriendsAndFollowersTabFragment, new als(((fks.a) fksVar).a));
                }
                break;
            case 1:
                break;
            case 2:
                rz2 rz2Var = (rz2) obj2;
                NewsfeedGetResponse newsfeedGetResponse = (NewsfeedGetResponse) obj;
                com.vk.newsfeed.common.util.j jVar = new com.vk.newsfeed.common.util.j();
                String str = newsfeedGetResponse.j() ? rz2Var.c : rz2Var.d;
                HashMap hashMap = new HashMap();
                Iterator<NewsEntry> it = newsfeedGetResponse.iterator();
                while (it.hasNext()) {
                    NewsEntry next = it.next();
                    ArrayList arrayList2 = new ArrayList();
                    com.vk.newsfeed.common.util.j.h(jVar, next, (s1c0) rz2Var.f.getValue(), "news", str, arrayList2, null, 96);
                    hashMap.put(next, new k0d0(arrayList2));
                }
                new PerfLogger().a(PerfLogger.Event.NEWSFEED_CACHE_RENDERED);
                break;
            case 3:
                ((nj3) obj2).d.invoke(new ig3.h(((y7a0) obj).a));
                break;
            case 4:
                bn40.c((Throwable) obj, new Object[0]);
                ((rx4) obj2).invoke();
                break;
            case 5:
                ((v080) ((hy5) obj2).getActivity()).x();
                break;
            case 6:
                ((Float) obj).floatValue();
                break;
            case 7:
                c37 c37Var = (c37) obj2;
                c37Var.E.getClass();
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.EMAIL_SUCCESS_VERIFICATION, null, null, null, null, null, null, 254);
                com.vk.auth.main.e eVar = c37Var.o;
                com.vk.auth.main.e eVar2 = eVar != null ? eVar : null;
                String str2 = c37Var.z;
                String str3 = c37Var.x.c;
                p66.c cVar = c37Var.w;
                SignUpDataHolder signUpDataHolder = eVar2.b;
                signUpDataHolder.o = str2;
                signUpDataHolder.d = str3;
                signUpDataHolder.t.add(SignUpField.EMAIL);
                eVar2.j(SignUpRouter.DataScreen.EMAIL, cVar);
                break;
            case 8:
                lj8 lj8Var = (lj8) obj2;
                oj8.a aVar = (oj8.a) obj;
                lj8Var.a((p5h0) lj8Var.l.getValue());
                gm50.a.a(lj8Var, aVar.a, new tm0(lj8Var, 15));
                gm50.a.a(lj8Var, aVar.b, new g60(lj8Var, 12));
                break;
            case 9:
                ((id9) obj2).e.onNext((dd9.a) obj);
                break;
            case 10:
                lh9.d(((dl9) obj2).d, (Bitmap) obj);
                break;
            case 11:
                com.vk.cameraui.impl.a aVar2 = (com.vk.cameraui.impl.a) obj2;
                aVar2.h.a.c = String.valueOf((Integer) obj);
                ?? r1 = aVar2.r;
                if (r1 != 0) {
                    ActionLinks actionLinks = aVar2.l0;
                    if (actionLinks == null || (arrayList = actionLinks.d) == null) {
                        r4 = EmptyList.b;
                    } else {
                        r4 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ActionLinkSnippet actionLinkSnippet = ((ActionLink) it2.next()).f;
                            Good good = actionLinkSnippet != null ? actionLinkSnippet.j : null;
                            if (good != null) {
                                r4.add(good);
                            }
                        }
                    }
                    r1.I(r4);
                }
                break;
            case 12:
                ((zs9) obj2).i.vn();
                break;
            case 13:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) obj2;
                break;
            case 14:
                vwa vwaVar = (vwa) obj2;
                swa swaVar = vwaVar.q;
                if (swaVar != null) {
                    vwaVar.l.o(swaVar);
                }
                break;
            case 15:
                ((k4b) obj2).d.invoke(x3b.e.b);
                break;
            case 16:
                Object obj3 = ((wpp) obj).c.get(Integer.valueOf(((kab) obj2).g));
                MsgFromChannel msgFromChannel = obj3 instanceof MsgFromChannel ? (MsgFromChannel) obj3 : null;
                if (msgFromChannel != null && (paidReaction = msgFromChannel.I.o) != null) {
                    i2 = paidReaction.c;
                }
                break;
            case 17:
                g2v.c().getClass();
                ((adb) obj2).b();
                break;
            case 18:
                bsb.b bVar2 = ((isb) obj2).p;
                if (bVar2 != null) {
                    bsb bsbVar = bsb.this;
                    LinkButton linkButton = bsbVar.l.b.k;
                    Action action = linkButton != null ? linkButton.c : null;
                    if (action != null) {
                        qex0.a().a(bsbVar.i, action);
                    } else {
                        bsb.X0(bsbVar);
                    }
                }
                break;
            case 19:
                pwb pwbVar = (pwb) obj2;
                break;
            case 20:
                ((com.vk.im.ui.components.chat_profile.a) obj2).t(new zxd0.p((DndPeriodAndSound) obj));
                break;
            case 21:
                invoke$lambda$2 = CleanUpWhenOpportunityExpires.invoke$lambda$2((yok0) obj2, (Throwable) obj);
                break;
            case 22:
                qcy<Object>[] qcyVarArr = isc.t1;
                ((btc) obj2).b(new usc.a.b((List) obj));
                break;
            case 23:
                int i4 = ClipFeedListFragment.a2;
                ((xcd) obj2).invoke((SdkVideoFile) obj);
                break;
            case 24:
                break;
            case 25:
                oed oedVar = (oed) obj2;
                oedVar.d.countDown();
                oedVar.a.getLogger().e("ClipUploadTaskCache", "load uploads cache failed", (Throwable) obj);
                break;
            case 26:
                AudioAudioDto audioAudioDto = (AudioAudioDto) obj2;
                File file = ((dug0.c) obj).c;
                StringBuilder sb = new StringBuilder();
                sb.append(audioAudioDto.q().b);
                sb.append('_');
                sb.append(audioAudioDto.getId());
                break;
            case 27:
                break;
            case 28:
                ((u6e) obj2).C(new qvq.u((xkh0) obj));
                break;
            default:
                ClipsGridHeaderEntry.Author author = (ClipsGridHeaderEntry.Author) obj;
                int i5 = ClipsGridCommonClipsListFragment.q0;
                ((ClipsGridCommonClipsListFragment) obj2).to(author.a, author.d);
                break;
        }
        return s3q0.a;
    }
}
