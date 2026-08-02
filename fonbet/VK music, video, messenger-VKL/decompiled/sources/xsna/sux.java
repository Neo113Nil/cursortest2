package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRemoveAudiosResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesSaveCustomCoverResponseDto;
import com.vk.api.generated.video.dto.VideoVideoBookmakerAdStateDto;
import com.vk.api.generated.video.dto.VideoVideoBookmakerBetLineDto;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.posting.domain.model.PostingStateCacheKey;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.b;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.reefton.Reef;
import com.vk.repository.internal.repos.stickers.database.converters.dto.VmojiConstructorOpenParamsModelDto;
import com.vk.stickers.views.RLottieImageView;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import xsna.bi40;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class sux implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ sux(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x02fc, code lost:
    
        if (((com.vk.newsfeed.api.data.NewsComment) r0).G == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0332, code lost:
    
        if (((com.vk.newsfeed.api.data.NewsComment) r0).G == false) goto L137;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        CharSequence string$lambda$0;
        int i2 = 5;
        int i3 = 2;
        boolean z = true;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.c(tgi0Var);
                qgi0.r(tgi0Var, "ItemTags.SELECT_STATE");
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return b.a.a;
            case 3:
                return ((KidsCollectionRemoveAudiosResponseDto) obj).d();
            case 4:
                com.vk.im.ui.components.msg_list.a.P0.a((Throwable) obj);
                return s3q0.a;
            case 5:
                return new tt70(5, 0L, rli0.A(rli0.y(rli0.t(new i5g((List) obj), new d230(i3)), 2)));
            case 6:
                bi40 bi40Var = (bi40) obj;
                if (bi40Var.equals(bi40.a.a)) {
                    i = R.string.music_talkback_delete_downloaded_album;
                } else if (bi40Var.equals(bi40.c.a)) {
                    i = R.string.music_talkback_download_album;
                } else if (bi40Var.equals(bi40.d.a)) {
                    i = R.string.music_talkback_pending_downloading_album;
                } else {
                    if (!(bi40Var instanceof bi40.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_downloading_album;
                }
                return Integer.valueOf(i);
            case 7:
                NarrativesSaveCustomCoverResponseDto narrativesSaveCustomCoverResponseDto = (NarrativesSaveCustomCoverResponseDto) obj;
                return narrativesSaveCustomCoverResponseDto.d() == null ? io.reactivex.rxjava3.internal.operators.observable.g0.b : io.reactivex.rxjava3.core.q.T(narrativesSaveCustomCoverResponseDto);
            case 8:
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                if (e0Var instanceof v0c0) {
                    iag iagVar = (iag) ((v0c0) e0Var).m;
                    if (iagVar instanceof NewsComment) {
                        break;
                    }
                    z = false;
                    z2 = z;
                } else if (e0Var instanceof u0c0) {
                    u0c0 u0c0Var = (u0c0) e0Var;
                    iag iagVar2 = (iag) u0c0Var.m;
                    if (iagVar2 instanceof NewsComment) {
                        u0c0Var.a0.getClass();
                        z2 = ((NewsComment) iagVar2).G;
                    }
                } else if (e0Var instanceof l7c0) {
                    iag iagVar3 = (iag) ((l7c0) e0Var).m;
                    if (iagVar3 instanceof NewsComment) {
                        if (iagVar3 != null) {
                            break;
                        }
                        z = false;
                        z2 = z;
                    }
                } else if (e0Var instanceof k7c0) {
                    k7c0 k7c0Var = (k7c0) e0Var;
                    iag iagVar4 = (iag) k7c0Var.m;
                    if (iagVar4 instanceof NewsComment) {
                        k7c0Var.W.getClass();
                        z2 = ((NewsComment) iagVar4).G;
                    }
                } else if (e0Var instanceof o0c0) {
                    o0c0 o0c0Var = (o0c0) e0Var;
                    iag iagVar5 = (iag) o0c0Var.m;
                    if (iagVar5 instanceof NewsComment) {
                        o0c0Var.e0.getClass();
                        z2 = ((NewsComment) iagVar5).G;
                    }
                } else if (e0Var instanceof p0c0) {
                    p0c0 p0c0Var = (p0c0) e0Var;
                    iag iagVar6 = (iag) p0c0Var.m;
                    if (iagVar6 instanceof NewsComment) {
                        p0c0Var.e0.getClass();
                        z2 = ((NewsComment) iagVar6).G;
                    }
                }
                return Boolean.valueOf(z2);
            case 9:
                float f = tv80.a;
                return null;
            case 10:
                return a.d.a;
            case 11:
                qgi0.r((tgi0) obj, "pin_review_community_subscription_count");
                return s3q0.a;
            case 12:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                float f2 = 32;
                eg10.c(ggjVar, true, f2);
                eg10.c(ggjVar, false, f2);
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((l3b0) obj).j);
            case 14:
                Group group = (Group) obj;
                if (group == null) {
                    return null;
                }
                UserProfile userProfile = new UserProfile();
                userProfile.c = fkq0.e(group.c);
                userProfile.e = group.d;
                userProfile.g = group.f;
                userProfile.h = group.e;
                return userProfile;
            case 15:
                return ((PostingState.Editing) obj).i.e;
            case 16:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    wmi0.a.c(((PostingStateCacheKey) it.next()).b);
                }
                wmi0.a.c("PostingStateCacheKeys");
                return s3q0.a;
            case 17:
                Post post = (Post) obj;
                ce60.b.getClass();
                p870.f().e(125, post);
                if (post != null && post.gc()) {
                    ArrayList<EntryAttachment> arrayList = post.z;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator<T> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((EntryAttachment) it2.next()).b);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (next instanceof VideoAttachment) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        wjs0.a(new fyr0(((VideoAttachment) it4.next()).k));
                    }
                }
                cvk.u(R.string.post_removed_from_archive, false);
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "PrivacySettingsToolbarTitle");
                return s3q0.a;
            case 19:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `stickers_promo`.`id` AS `id`, `stickers_promo`.`newStickersItems` AS `newStickersItems`, `stickers_promo`.`globalPromotes` AS `globalPromotes`, `stickers_promo`.`vmojiPromoCounter` AS `vmojiPromoCounter`, `stickers_promo`.`vmojiPromoCounterColor` AS `vmojiPromoCounterColor`, `stickers_promo`.`vmojiPromoDotColor` AS `vmojiPromoDotColor`, `stickers_promo`.`vmojiPromoOpenParams` AS `vmojiPromoOpenParams` FROM stickers_promo");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.step()) {
                        long j = V0.getLong(0);
                        int i4 = (int) V0.getLong(1);
                        int i5 = (int) V0.getLong(2);
                        int i6 = (int) V0.getLong(3);
                        String l2 = V0.isNull(4) ? null : V0.l2(4);
                        PromoColor promoColor = l2 == null ? null : (PromoColor) psj.a.fromJson(l2, PromoColor.class);
                        String l22 = V0.isNull(i2) ? null : V0.l2(i2);
                        PromoColor promoColor2 = l22 == null ? null : (PromoColor) psj.a.fromJson(l22, PromoColor.class);
                        VmojiConstructorOpenParamsModelDto vmojiConstructorOpenParamsModelDto = (VmojiConstructorOpenParamsModelDto) psj.a.fromJson(V0.l2(6), VmojiConstructorOpenParamsModelDto.class);
                        arrayList4.add(new lbl0(j, i4, i5, i6, promoColor, promoColor2, new VmojiConstructorOpenParamsModel(vmojiConstructorOpenParamsModelDto.c(), vmojiConstructorOpenParamsModelDto.a(), vmojiConstructorOpenParamsModelDto.b())));
                        i2 = 5;
                    }
                    return arrayList4;
                } finally {
                    V0.close();
                }
            case 20:
                int i7 = RLottieImageView.l;
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 21:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? R.raw.shuffle_default_to_dot_outline_24 : R.raw.shuffle_dot_to_default_outline_24);
            case 22:
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                return Boolean.valueOf(((it80) obj).a());
            case 25:
                Object obj2 = (RecyclerView.e0) obj;
                t1b0 t1b0Var = obj2 instanceof t1b0 ? (t1b0) obj2 : null;
                if (t1b0Var != null) {
                    return t1b0Var.getAttachedPlayer();
                }
                return null;
            case 26:
                string$lambda$0 = SdkMetricStatEvent.toString$lambda$0((Map.Entry) obj);
                return string$lambda$0;
            case 27:
                qgi0.r((tgi0) obj, "search_filters_top_bar_close");
                return s3q0.a;
            case 28:
                VideoVideoBookmakerAdStateDto videoVideoBookmakerAdStateDto = (VideoVideoBookmakerAdStateDto) obj;
                VideoVideoBookmakerBetLineDto videoVideoBookmakerBetLineDto = (VideoVideoBookmakerBetLineDto) j5g.a0(videoVideoBookmakerAdStateDto.f().d());
                Map<String, String> d = videoVideoBookmakerBetLineDto != null ? videoVideoBookmakerBetLineDto.d() : null;
                String str = d != null ? d.get("1") : null;
                String str2 = d != null ? d.get("2") : null;
                String str3 = d != null ? d.get("X") : null;
                zzf zzfVar = (str == null || str3 == null || str2 == null) ? null : new zzf(str, str2, str3);
                String d2 = videoVideoBookmakerAdStateDto.d();
                if (d2.length() == 0) {
                    String g = videoVideoBookmakerAdStateDto.g();
                    d2 = g.length() == 0 ? null : g;
                }
                if (d2 == null) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                String X = drm0.X(d2);
                it80.a aVar = it80.b;
                g08 g08Var = new g08(X, videoVideoBookmakerAdStateDto.e().f(), videoVideoBookmakerAdStateDto.e().g(), videoVideoBookmakerAdStateDto.e().e(), videoVideoBookmakerAdStateDto.e().d(), zzfVar, videoVideoBookmakerAdStateDto.i());
                aVar.getClass();
                return new it80(g08Var);
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ sux(Object obj, int i) {
        this.b = i;
    }
}
