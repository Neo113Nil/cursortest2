package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVkTicket;
import com.vk.dto.stories.model.clickable.SeanceInfo;
import com.vk.ecomm.clipproductattaches.models.GoodBadge;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.smc;
import xsna.vrv0;

/* compiled from: ClipVideoHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class dfd implements gn60<mds0, wm60> {

    /* compiled from: ClipVideoHolderTransformer.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
        
            if (r3.b == true) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static rmc a(ClipVideoFile clipVideoFile) {
            ?? r4;
            ?? r2;
            List<ClickableSticker> list;
            List<ClickableSticker> list2;
            Iterator it;
            c5u c5uVar;
            boolean z;
            p7u p7uVar;
            String str;
            boolean z2;
            j5u j5uVar;
            ArrayList arrayList;
            j5u j5uVar2;
            long j;
            dly dlyVar;
            boolean z3;
            ClickableStickers clickableStickers = clipVideoFile.C1;
            Integer num = null;
            if (clickableStickers == null || (list2 = clickableStickers.d) == null) {
                r4 = EmptyList.b;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof ClickableMarketItem) {
                        arrayList2.add(obj);
                    }
                }
                r4 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ClickableMarketItem clickableMarketItem = (ClickableMarketItem) it2.next();
                    Good good = clickableMarketItem.j;
                    if (good != null) {
                        Price price = good.h;
                        long j2 = good.b;
                        UserId userId = good.c;
                        String str2 = good.d;
                        int i = price.g;
                        boolean z4 = good.V;
                        Image image = good.n;
                        c530 b = e530.b(good, num);
                        String str3 = clickableMarketItem.l;
                        it = it2;
                        d5u d5uVar = new d5u(price.e, price.f, price.i);
                        boolean z5 = good.J;
                        MarketRejectInfo marketRejectInfo = good.e0;
                        boolean z6 = marketRejectInfo != null ? marketRejectInfo.g : false;
                        boolean Bb = good.Bb();
                        MarketItemRating marketItemRating = good.t;
                        if (marketItemRating != null) {
                            z = z5;
                            p7uVar = new p7u(marketItemRating.b, marketItemRating.d);
                        } else {
                            z = z5;
                            p7uVar = null;
                        }
                        Owner owner = good.M;
                        if (owner != null) {
                            UserId userId2 = owner.b;
                            str = str3;
                            String str4 = owner.c;
                            if (str4 == null) {
                                str4 = "";
                            }
                            VerifyInfo verifyInfo = owner.f;
                            if (verifyInfo != null) {
                                z2 = z4;
                                z3 = true;
                            } else {
                                z2 = z4;
                            }
                            z3 = false;
                            j5uVar = new j5u(userId2, str4, z3);
                        } else {
                            str = str3;
                            z2 = z4;
                            j5uVar = null;
                        }
                        List<GoodBadge> list3 = good.O;
                        if (list3 != null) {
                            arrayList = new ArrayList();
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                GoodBadge goodBadge = (GoodBadge) it3.next();
                                GoodBadge.BadgeType.a aVar = GoodBadge.BadgeType.Companion;
                                GoodBadge.BadgeType badgeType = goodBadge.c;
                                Integer valueOf = badgeType != null ? Integer.valueOf(badgeType.i()) : null;
                                aVar.getClass();
                                GoodBadge.BadgeType a = GoodBadge.BadgeType.a.a(valueOf);
                                String str5 = goodBadge.b;
                                List<BaseImageDto> list4 = goodBadge.h;
                                Iterator it4 = it3;
                                if (list4 != null) {
                                    Serializer.c<com.vk.dto.market.GoodBadge> cVar = com.vk.dto.market.GoodBadge.CREATOR;
                                    j5uVar2 = j5uVar;
                                    j = j2;
                                    dlyVar = new dly(GoodBadge.a.c(list4), GoodBadge.a.a(list4), GoodBadge.a.d(list4), GoodBadge.a.b(list4));
                                } else {
                                    j5uVar2 = j5uVar;
                                    j = j2;
                                    dlyVar = null;
                                }
                                arrayList.add(new com.vk.ecomm.clipproductattaches.models.GoodBadge(a, str5, dlyVar));
                                it3 = it4;
                                j5uVar = j5uVar2;
                                j2 = j;
                            }
                        } else {
                            arrayList = null;
                        }
                        c5uVar = new c5u(j2, userId, str2, d5uVar, i, z2, image, b, str, z, z6, Bb, p7uVar, j5uVar, arrayList);
                    } else {
                        it = it2;
                        c5uVar = null;
                    }
                    if (c5uVar != null) {
                        r4.add(c5uVar);
                    }
                    it2 = it;
                    num = null;
                }
            }
            if (clickableStickers == null || (list = clickableStickers.d) == null) {
                r2 = EmptyList.b;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ClickableVkTicket) {
                        arrayList3.add(obj2);
                    }
                }
                r2 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    ClickableVkTicket clickableVkTicket = (ClickableVkTicket) it5.next();
                    String str6 = clickableVkTicket.e;
                    String str7 = clickableVkTicket.f;
                    String str8 = clickableVkTicket.h;
                    String str9 = clickableVkTicket.g;
                    SeanceInfo seanceInfo = clickableVkTicket.i;
                    r2.add(new vrv0(str6, str7, str9, str8, new vrv0.a(seanceInfo != null ? seanceInfo.b : null, seanceInfo != null ? seanceInfo.c : null, seanceInfo != null ? seanceInfo.d : null, seanceInfo != null ? seanceInfo.e : null)));
                }
            }
            return new rmc(r4, r2, new tmc(clipVideoFile.c, clipVideoFile.b, smc.h.a, true, true, new k64(12, 12), false));
        }
    }

    @Override // xsna.gn60
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List x(mds0 mds0Var, wm60 wm60Var) {
        VideoFile videoFile;
        NewsEntry newsEntry = mds0Var.a;
        NewsEntry newsEntry2 = mds0Var.b;
        VideoAttachment videoAttachment = mds0Var.c;
        int i = mds0Var.d;
        VideoFile videoFile2 = videoAttachment.k;
        float width = videoFile2.getWidth() / videoFile2.getHeight();
        ClipVideoFile clipVideoFile = videoFile2 instanceof ClipVideoFile ? (ClipVideoFile) videoFile2 : null;
        jq6 G = alk.G(newsEntry, newsEntry2, videoAttachment);
        boolean z = false;
        if (clipVideoFile != null) {
            Boolean bool = clipVideoFile.P1;
            Boolean bool2 = Boolean.TRUE;
            if (!epx.f(bool, bool2) && !di60.y(newsEntry)) {
                VideoAttachment l = di60.l(newsEntry);
                if (((l == null || (videoFile = l.k) == null) ? null : videoFile.p1()) == null) {
                    VideoAttachment l2 = di60.l(newsEntry);
                    VideoFile videoFile3 = l2 != null ? l2.k : null;
                    ClipVideoFile clipVideoFile2 = videoFile3 instanceof ClipVideoFile ? (ClipVideoFile) videoFile3 : null;
                    if (!(clipVideoFile2 != null ? epx.f(clipVideoFile2.P1, bool2) : false)) {
                        z = true;
                    }
                }
            }
        }
        return Collections.singletonList(new efd(newsEntry, newsEntry2, G, width, z, i, clipVideoFile != null ? clipVideoFile.W : null, clipVideoFile != null ? a.a(clipVideoFile) : null));
    }
}
