package xsna;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.a;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.group.GroupFilterVh;
import com.vk.catalog2.feature.music.holders.MusicDynamicGridVh;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrlInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.dto.user.UserSex;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$SeenMediaInfo;
import com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView;
import com.vk.story.viewer.impl.presentation.stories.StoryViewActivity;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import one.video.player.OneVideoPlayer;
import xsna.loh0;
import xsna.q7r;
import xsna.wae;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w69 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w69(UIBlockGroupFilter uIBlockGroupFilter, GroupFilterVh groupFilterVh) {
        this.b = 6;
        this.c = uIBlockGroupFilter;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        long longValue;
        MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType contentType;
        VideoFile videoFile;
        Object obj3;
        kq9<s3q0> kq9Var = null;
        int i = 9;
        int i2 = -1;
        boolean z = true;
        switch (this.b) {
            case 0:
                qtd0 qtd0Var = (qtd0) this.c;
                UserId userId = (UserId) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (userId == null) {
                    return jnw0.c(qtd0Var, booleanValue);
                }
                if (qtd0Var instanceof Contact) {
                    Long l = ((Contact) qtd0Var).j;
                    longValue = l != null ? l.longValue() : 0L;
                } else {
                    longValue = qtd0Var.getId().longValue();
                }
                long j = longValue;
                UserNameCase userNameCase = UserNameCase.NOM;
                String d6 = qtd0Var.d6(userNameCase);
                String Q2 = qtd0Var.Q2(userNameCase);
                String Db = qtd0Var.C8().Db();
                if (Db == null) {
                    Db = "";
                }
                return new zqk0(null, j, d6, Q2, Db, qtd0Var.B2() == UserSex.FEMALE, qtd0Var.q9().b, Collections.singleton(qtd0Var.getId().toString()), false, userId, null, null, null, 0, false, null, null, null, booleanValue, false, qtd0Var.n9(), 1571585);
            case 1:
                ((Integer) obj2).getClass();
                ((CatalogLegacyBlockImpl) this.c).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                VkText vkText = (VkText) obj;
                rzt0 rzt0Var = (rzt0) obj2;
                float f = 0;
                vkText.setPadding(iah0.a(f), iah0.a(f), e3m.a(R.dimen.vk_ui_spacing_size_xs, ((ClipBadge) this.c).getContext()), iah0.a(f));
                if (rzt0Var instanceof wae.b) {
                    ey2.h(vkText, ((wae.b) rzt0Var).a);
                }
                return s3q0.a;
            case 3:
                loh0.d.b bVar = (loh0.d.b) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-12490114, intValue, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.MembersInfoItem.<anonymous> (CommunityDetailsInfoItem.kt:81)");
                    }
                    UserStackSize userStackSize = UserStackSize.Medium;
                    boolean J = aVar.J(bVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new com.vk.movika.sdk.base.data.a(bVar, 29);
                        aVar.R(x);
                    }
                    hyv0.d(null, userStackSize, null, null, (izs) x, aVar, 48, 13);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) this.c;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ee eeVar = discoverSimilarFeedFragment.e0;
                if (eeVar != null) {
                    eeVar.setVisibility(booleanValue2 ? 0 : 8);
                }
                return s3q0.a;
            case 5:
                q7r q7rVar = (q7r) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                Integer num = (Integer) obj2;
                mkm0 mkm0Var = q7rVar.i0;
                q7rVar.s0.l();
                WeakReference<vrl0> weakReference = q7rVar.m0;
                if (weakReference.get() != null) {
                    vrl0 vrl0Var = weakReference.get();
                    StoryEntry currentStory = mkm0Var.getCurrentStory();
                    boolean z2 = mkm0Var.f;
                    Long b = q7rVar.b();
                    sht0 j2 = oneVideoPlayer.j();
                    if (j2 == null) {
                        contentType = MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.OTHER;
                    } else {
                        int i3 = q7r.g.a[j2.a.ordinal()];
                        if (i3 == 1) {
                            contentType = MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.MP4;
                        } else if (i3 == 2) {
                            contentType = MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.HLS;
                        } else if (i3 != 3) {
                            contentType = MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.OTHER;
                        } else {
                            StoryEntry currentStory2 = mkm0Var.getCurrentStory();
                            if (currentStory2 == null || (videoFile = currentStory2.n) == null) {
                                contentType = MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.DASH;
                            } else {
                                VideoUrlInfo Eb = videoFile.w9().Eb(j2.b.toString());
                                contentType = (Eb == null || !Eb.e) ? MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.DASH : MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.DASH_WEBM;
                            }
                        }
                    }
                    MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType contentType2 = contentType;
                    boolean z3 = q7rVar.k0.getContext() instanceof StoryViewActivity;
                    Integer valueOf = Integer.valueOf(q7rVar.v.a.getVideoHeight());
                    Integer valueOf2 = Integer.valueOf(q7rVar.v.a.getVideoWidth());
                    StoryEntry currentStory3 = mkm0Var.getCurrentStory();
                    if (currentStory3 != null) {
                        String id = currentStory3.getId();
                        String str = c4g0.k;
                        if (str == null || id.equals(str)) {
                            c4g0.k = id;
                            Long l2 = c4g0.l;
                            if (l2 != null) {
                                i2 = (int) (SystemClock.elapsedRealtime() - l2.longValue());
                                L.e("time from open:", Integer.valueOf(i2));
                            }
                        }
                    }
                    vrl0Var.k(currentStory, z2, b, new MobileOfficialAppsConStoriesStat$SeenMediaInfo(contentType2, z3, valueOf, valueOf2, -1, Integer.valueOf(i2)), num);
                }
                return s3q0.a;
            case 6:
                UIBlockGroupFilter uIBlockGroupFilter = (UIBlockGroupFilter) this.c;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                int i4 = 10;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (UIBlock uIBlock : arrayList) {
                    if ((uIBlock instanceof UIBlockList) && epx.f(uIBlockGroupFilter.B, uIBlock.b)) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        ArrayList<UIBlock> arrayList3 = uIBlockList2.y;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof UIBlockGroupFilter) {
                                arrayList4.add(obj4);
                            }
                        }
                        Iterator it = arrayList4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (((UIBlockGroupFilter) obj3).z.e) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        UIBlockGroupFilter uIBlockGroupFilter2 = (UIBlockGroupFilter) obj3;
                        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, i4));
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            UIBlockGroupFilter uIBlockGroupFilter3 = (UIBlockGroupFilter) it2.next();
                            String str2 = uIBlockGroupFilter.b;
                            arrayList5.add(new UIBlockGroupFilter(uIBlockGroupFilter3.y, CatalogFilterData.zb(uIBlockGroupFilter3.z, null, null, epx.f(str2, uIBlockGroupFilter2 != null ? uIBlockGroupFilter2.b : null) ? false : epx.f(str2, uIBlockGroupFilter3.b), 503), CatalogFilterData.zb(uIBlockGroupFilter3.A, null, null, epx.f(str2, uIBlockGroupFilter2 != null ? uIBlockGroupFilter2.b : null), 503), uIBlockGroupFilter3.B, (epx.f(str2, uIBlockGroupFilter2 != null ? uIBlockGroupFilter2.b : null) || epx.f(str2, uIBlockGroupFilter3.b)) ? false : z));
                            z = true;
                        }
                        uIBlock = new UIBlockList(uIBlockList2, arrayList5);
                    }
                    arrayList2.add(uIBlock);
                    i4 = 10;
                    z = true;
                }
                return new UIBlockList(uIBlockList, arrayList2);
            case 7:
                return quv.d((quv) this.c, (StoryBoxPrepared) obj);
            case 8:
                mww mwwVar = (mww) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(471043207, intValue2, -1, "com.vk.ecomm.market.good.ui.holder.InfoWithImageHolder.onBind.<anonymous> (InfoWithImageHolder.kt:38)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1795707902, new yg7(mwwVar, r4), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((b6x) this.c).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                f4g0 f4g0Var = (f4g0) obj2;
                e2g0 e2g0Var = ((MarketItemReviewRepliesFragment) this.c).Y;
                if (e2g0Var != null) {
                    e2g0Var.n(f4g0Var.b, f4g0Var.a, f4g0Var.c);
                }
                return s3q0.a;
            case 11:
                final MusicDynamicGridVh musicDynamicGridVh = (MusicDynamicGridVh) this.c;
                final View view = (View) obj;
                final UIBlockLink uIBlockLink = (UIBlockLink) obj2;
                return new c98(new View.OnClickListener() { // from class: xsna.qj40
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        UIBlockLink uIBlockLink2 = UIBlockLink.this;
                        CatalogLink catalogLink = uIBlockLink2.y;
                        if (catalogLink != null) {
                            maz.c(((qdz) musicDynamicGridVh.b.getValue()).e(), view.getContext(), catalogLink.e, new LaunchContext(false, false, false, null, uIBlockLink2.p.h(), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108847), null, null, 24);
                        }
                    }
                }, 1);
            case 12:
                Recomposer recomposer = (Recomposer) this.c;
                Set set = (Set) obj;
                synchronized (recomposer.c) {
                    try {
                        if (((Recomposer.State) recomposer.u.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                            qh50<Object> qh50Var = recomposer.h;
                            if (set instanceof l5h0) {
                                j5h0<T> j5h0Var = ((l5h0) set).b;
                                Object[] objArr = j5h0Var.b;
                                long[] jArr = j5h0Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j3 = jArr[i5];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((255 & j3) < 128) {
                                                    Object obj5 = objArr[(i5 << 3) + i7];
                                                    if (!(obj5 instanceof nuk0) || ((nuk0) obj5).W(1)) {
                                                        qh50Var.e(obj5);
                                                    }
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i6 != 8) {
                                            }
                                        }
                                        if (i5 != length) {
                                            i5++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj6 : set) {
                                    if (!(obj6 instanceof nuk0) || ((nuk0) obj6).W(1)) {
                                        qh50Var.e(obj6);
                                    }
                                }
                            }
                            kq9Var = recomposer.C();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (kq9Var != null) {
                    ((lq9) kq9Var).resumeWith(s3q0.a);
                }
                return s3q0.a;
            default:
                StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView = (StoryArchiveRecyclerPaginatedView) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i8 = StoryArchiveRecyclerPaginatedView.P;
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-188268599, intValue3, -1, "com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView.createEmptyView.<anonymous> (StoryArchiveRecyclerPaginatedView.kt:43)");
                    }
                    rrv0.d(null, null, null, null, kai.c(402903470, new o85(storyArchiveRecyclerPaginatedView, i), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ w69(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ w69(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
