package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import com.vkontakte.android.attachments.StoryAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: StoriesRepoImpl.kt */
/* loaded from: classes6.dex */
public final class jul0 implements iul0 {
    public final xsl0 a;
    public final bpn0 b = new bpn0(new gwd0(8));
    public final bpn0 c = new bpn0(new vqf0(4));
    public final boolean d = true;
    public final boolean e = true;

    public jul0(xsl0 xsl0Var) {
        this.a = xsl0Var;
    }

    @Override // xsna.iul0
    public final boolean a() {
        return o25.a().i().m;
    }

    @Override // xsna.iul0
    public final boolean b(int i, StickerItem stickerItem, String str, y6m0 y6m0Var) {
        ncm0 ncm0Var = (ncm0) this.b.getValue();
        ncm0Var.getClass();
        r6m.a.getClass();
        if (!r6m.j() || i <= 0) {
            return false;
        }
        List B = rli0.B(rli0.m(new ulp0(new i5g(Collections.singletonList(new StoryAttachment(y6m0Var.c, null, 2, null))), new udk0(2))));
        ((ArrayList) B).add(new AttachSticker(stickerItem.b, i, stickerItem, str == null ? "" : str));
        ncm0Var.c.D(ncm0Var, new pz30(com.vk.dto.common.a.a(y6m0Var.a), "", null, null, null, null, null, "stories_comment", B, null, null, null, null, 15996));
        return true;
    }

    @Override // xsna.iul0
    public final boolean c(WebStickerType webStickerType) {
        return o0m0.e(webStickerType);
    }

    @Override // xsna.iul0
    public final io.reactivex.rxjava3.subjects.f d() {
        return (io.reactivex.rxjava3.subjects.f) this.c.getValue();
    }

    @Override // xsna.iul0
    public final void e() {
        bzu.c = true;
    }

    @Override // xsna.iul0
    public final boolean f(String str, y6m0 y6m0Var) {
        ncm0 ncm0Var = (ncm0) this.b.getValue();
        ncm0Var.getClass();
        r6m.a.getClass();
        if (!r6m.j()) {
            return false;
        }
        ocw ocwVar = ocw.a;
        UserId userId = y6m0Var.a;
        StoryEntry storyEntry = y6m0Var.c;
        ocw.b(ncm0Var, userId.b, str, Collections.singletonList(new StoryAttachment(storyEntry, null, 2, null)), 16);
        anm0 anm0Var = (anm0) ncm0Var.b.getValue();
        StoryViewAction storyViewAction = StoryViewAction.COMMENT_SEND;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = y6m0Var.b;
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint == null) {
            mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST;
        }
        anm0Var.t(storyViewAction, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, y6m0Var.d, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), null);
        return true;
    }

    @Override // xsna.iul0
    public final boolean g() {
        return this.e;
    }

    @Override // xsna.iul0
    public final io.reactivex.rxjava3.internal.operators.single.o h(UserId userId, String str, boolean z) {
        io.reactivex.rxjava3.core.x l = this.a.l(userId, str, z);
        n240 n240Var = new n240(new lmu(z, userId, this, 2), 17);
        l.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.o(l, n240Var);
    }

    @Override // xsna.iul0
    public final boolean i(AttachAudioMsg attachAudioMsg, y6m0 y6m0Var) {
        ncm0 ncm0Var = (ncm0) this.b.getValue();
        ncm0Var.getClass();
        r6m.a.getClass();
        if (!r6m.j()) {
            return false;
        }
        List B = rli0.B(rli0.m(new ulp0(new i5g(Collections.singletonList(new StoryAttachment(y6m0Var.c, null, 2, null))), new av70(17))));
        ((ArrayList) B).add(attachAudioMsg);
        ocw ocwVar = ocw.a;
        Set singleton = Collections.singleton(Long.valueOf(y6m0Var.a.b));
        HashSet hashSet = new HashSet();
        Iterator it = singleton.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            hashSet.add(Peer.a.b(longValue));
        }
        itg0.n(ocw.b.E(ncm0Var, new oy30(hashSet, B, "stories_comment")));
        return true;
    }

    @Override // xsna.iul0
    public final void j(Object obj, UserId userId, String str, Collection<? extends Attachment> collection) {
        ocw ocwVar = ocw.a;
        ocw.b(obj, userId.b, str, collection, 16);
    }

    @Override // xsna.iul0
    public final void k(Context context, String str, StoryEntry storyEntry, List<StoryQuestionEntry> list, xkm0 xkm0Var) {
        ClickableSticker clickableSticker;
        List<ClickableSticker> list2;
        Object obj;
        o0m0 o0m0Var = o0m0.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                UserId userId = storyEntry.d;
                StoryOwner storyOwner = storyEntry.l0;
                String Db = storyOwner != null ? storyOwner.Db() : null;
                StoryOwner storyOwner2 = storyEntry.l0;
                String Bb = storyOwner2 != null ? storyOwner2.Bb() : null;
                ArrayList arrayList2 = new ArrayList();
                ms i = o25.a().i();
                if (g620.f().getExperiments().c()) {
                    arrayList2.add(StoryCameraMode.CLIPS);
                }
                arrayList2.add(StoryCameraMode.STORY);
                arrayList2.add(StoryCameraMode.STORY_VIDEO);
                if (i.l) {
                    arrayList2.add(StoryCameraMode.PING_PONG);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList3.remove(StoryCameraMode.CLIPS);
                com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(str, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.QUESTION_STICKER);
                aVar.q(userId, Db, Bb);
                aVar.x = arrayList;
                aVar.g = arrayList3;
                aVar.I = true;
                aVar.e0 = Boolean.valueOf(!fkq0.b(userId));
                aVar.d0 = Boolean.FALSE;
                aVar.C(context);
                return;
            }
            StoryQuestionEntry storyQuestionEntry = (StoryQuestionEntry) it.next();
            o0m0 o0m0Var2 = o0m0.b;
            bpn0 bpn0Var = o0m0.e;
            ((anm0) bpn0Var.getValue()).R(storyQuestionEntry.e);
            ((anm0) bpn0Var.getValue()).J(StoryViewAction.QUESTION_SHARE, storyQuestionEntry, xkm0Var);
            ClickableStickers clickableStickers = storyEntry.X;
            if (clickableStickers == null || (list2 = clickableStickers.d) == null) {
                clickableSticker = null;
            } else {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((ClickableSticker) obj).Cb() == WebStickerType.QUESTION) {
                            break;
                        }
                    }
                }
                clickableSticker = (ClickableSticker) obj;
            }
            ClickableQuestion clickableQuestion = clickableSticker instanceof ClickableQuestion ? (ClickableQuestion) clickableSticker : null;
            if (clickableQuestion == null) {
                return;
            }
            WebActionQuestion webActionQuestion = clickableQuestion.e;
            String str2 = webActionQuestion.b;
            UserProfile userProfile = storyQuestionEntry.i ? storyQuestionEntry.g : null;
            arrayList.add(new StoryAnswer(storyEntry.d, storyEntry.c, storyQuestionEntry.b, str2, storyQuestionEntry.d, userProfile, webActionQuestion.e, userProfile == null, storyQuestionEntry.e, storyEntry.l0));
        }
    }

    @Override // xsna.iul0
    public final boolean l() {
        return this.d;
    }

    @Override // xsna.iul0
    public final void m() {
        bzu.c = false;
    }

    @Override // xsna.iul0
    public final boolean n() {
        o2l.a.getClass();
        return o2l.b("__dbg_clickable_sticker_border", false);
    }
}
