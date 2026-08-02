package xsna;

import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.audio.dto.AudioGetPlaylistsResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vkontakte.android.R;
import com.vkontakte.android.api.DocsGetTypesResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bwd;
import xsna.ek1;
import xsna.gm50;
import xsna.h7u0;
import xsna.kyg;
import xsna.le8;
import xsna.lp3;
import xsna.qv4;
import xsna.rxh;
import xsna.t53;
import xsna.w19;
import xsna.wiw;
import xsna.wt5;
import xsna.y7f;
import xsna.zlv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vs implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        VkPaginationList<Document> vkPaginationList;
        Object obj2;
        qxh qxhVar;
        UserId userId;
        UserId userId2;
        int i = this.b;
        int i2 = 14;
        boolean z = false;
        boolean z2 = false;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                oo8 oo8Var = (oo8) obj3;
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.k().putBoolean("business_notify_config_enabled", oo8Var.a);
                xgl0Var.k().putInt("business_notify_config_phase", oo8Var.b);
                return s3q0.a;
            case 1:
                StoryEntry storyEntry = (StoryEntry) obj3;
                ywm0 ywm0Var = (ywm0) obj;
                boolean z3 = ywm0Var.a;
                UserId userId3 = ywm0Var.b;
                Serializer.StreamParcelableAdapter streamParcelableAdapter = storyEntry != null ? storyEntry.l0 : null;
                StoryOwner.User user = streamParcelableAdapter instanceof StoryOwner.User ? (StoryOwner.User) streamParcelableAdapter : null;
                if (user != null && user.Ib(userId3)) {
                    UserProfile userProfile = user.c;
                    if (userProfile != null) {
                        userProfile.V = z3;
                    }
                    if (userProfile != null) {
                        userProfile.U = true;
                    }
                }
                return s3q0.a;
            case 2:
                dk1 dk1Var = (dk1) obj3;
                gm50.a.a(dk1Var, ((ek1.a) obj).a, new ay0(dk1Var, 2));
                return s3q0.a;
            case 3:
                up1 up1Var = (up1) obj3;
                List<PhotosPhotoAlbumFullDto> d = ((PhotosGetAlbumsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto : d) {
                    ((tfa0) up1Var.c.getValue()).getClass();
                    arrayList.add(tfa0.a(photosPhotoAlbumFullDto));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (up1Var.b.c(((PhotoAlbum) next).b)) {
                        arrayList2.add(next);
                    }
                }
                return new VKList(arrayList2);
            case 4:
                lp3 lp3Var = (lp3) obj3;
                lp3.a aVar = (lp3.a) obj;
                VkContextMenu vkContextMenu = lp3Var.g;
                FragmentActivity fragmentActivity = lp3Var.a;
                lp3.b bVar = lp3Var.f;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                if (aVar instanceof lp3.a.C3282a) {
                    Article a = lp3Var.a();
                    if (a != null) {
                        mhy.a(fragmentActivity, a.i);
                        cvk.u(R.string.link_copied, false);
                    }
                } else if (aVar instanceof lp3.a.b) {
                    Article a2 = lp3Var.a();
                    if (a2 != null) {
                        long j = a2.c.b;
                        int i3 = a2.b;
                        xwk.d().e().l(fragmentActivity, f870.v(InternalVkMiniApps.ARTICLE_EDITOR.h()) + "#owner_id=" + j + "&article_id=" + i3, LaunchContext.A, null, null);
                    }
                } else if (aVar instanceof lp3.a.c) {
                    bVar.d();
                } else if (aVar instanceof lp3.a.d) {
                    Article a3 = lp3Var.a();
                    if (a3 != null && (str = a3.j) != null && str.length() > 0) {
                        bVar.b(str);
                    }
                } else if (aVar instanceof lp3.a.e) {
                    bVar.a();
                } else if (aVar instanceof lp3.a.f) {
                    bVar.e();
                } else if (aVar instanceof lp3.a.g) {
                    bVar.c();
                } else {
                    if (!(aVar instanceof lp3.a.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i4 = h7u0.p;
                    h7u0.a c = h7u0.b.c(fragmentActivity);
                    c.g0(R.string.delete_article_confirm);
                    c.U(R.string.delete_article_description);
                    c.c0(R.string.delete, new kp3(lp3Var, z2 ? 1 : 0));
                    c.W(R.string.cancel, null);
                    c.m();
                }
                return s3q0.a;
            case 5:
                AttachDocumentsFragment attachDocumentsFragment = (AttachDocumentsFragment) obj3;
                DocsGetTypesResult docsGetTypesResult = (DocsGetTypesResult) obj;
                int i5 = AttachDocumentsFragment.R0;
                VkPaginationList<Document> vkPaginationList2 = docsGetTypesResult.a;
                List<Document> list = vkPaginationList2.b;
                int i6 = vkPaginationList2.c;
                ArrayList<T> arrayList3 = attachDocumentsFragment.s0;
                arrayList3.clear();
                arrayList3.addAll(list);
                attachDocumentsFragment.r0 = i6;
                ArrayList arrayList4 = new ArrayList();
                for (DocsGetTypesResult.DocType docType : docsGetTypesResult.b) {
                    int h = docType.a.h();
                    DocsGetTypesResult.DocType.Type type = DocsGetTypesResult.DocType.Type.ALL;
                    int i7 = h == type.h() ? i6 : docType.b;
                    if (h == type.h()) {
                        vkPaginationList = vkPaginationList2;
                    } else {
                        ArrayList arrayList5 = new ArrayList(i7);
                        for (Document document : vkPaginationList2.b) {
                            if (document.i == h) {
                                arrayList5.add(document);
                            }
                        }
                        vkPaginationList = new VkPaginationList<>(arrayList5, i7, arrayList5.size() < i7, 0, 8, null);
                    }
                    arrayList4.add(new Pair(vkPaginationList, docType.a));
                }
                ArrayList arrayList6 = new ArrayList(arrayList4.size());
                ArrayList arrayList7 = new ArrayList(arrayList4.size());
                ArrayList arrayList8 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    AttachDocumentsFragment attachDocumentsFragment2 = attachDocumentsFragment;
                    run runVar = new run(((DocsGetTypesResult.DocType.Type) pair.j()).h(), attachDocumentsFragment.b0, (VkPaginationList) pair.i(), attachDocumentsFragment.c0, attachDocumentsFragment2, attachDocumentsFragment, new AttachDocumentsFragment.d(0, attachDocumentsFragment, AttachDocumentsFragment.class, "onLoadedListener", "onLoadedListener()V", 0), attachDocumentsFragment2, attachDocumentsFragment.j0);
                    attachDocumentsFragment = attachDocumentsFragment2;
                    arrayList6.add(runVar);
                    arrayList7.add(attachDocumentsFragment.getString(((DocsGetTypesResult.DocType.Type) pair.j()).i()));
                    switch (AttachDocumentsFragment.c.$EnumSwitchMapping$0[((DocsGetTypesResult.DocType.Type) pair.j()).ordinal()]) {
                        case 1:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_ALL;
                            break;
                        case 2:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_TEXT;
                            break;
                        case 3:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_ARCHIVES;
                            break;
                        case 4:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_GIFS;
                            break;
                        case 5:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_IMAGES;
                            break;
                        case 6:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_AUDIOS;
                            break;
                        case 7:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_VIDEOS;
                            break;
                        case 8:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_EBOOKS;
                            break;
                        case 9:
                            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.DOCS_OTHERS;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList8.add(mobileOfficialAppsCoreNavStat$EventScreen);
                }
                z1q0 z1q0Var = attachDocumentsFragment.O0;
                z1q0Var.b = arrayList8;
                if (attachDocumentsFragment.getUserVisibleHint()) {
                    VKTabLayout vKTabLayout = attachDocumentsFragment.I0;
                    if (vKTabLayout != null) {
                        vKTabLayout.f(z1q0Var);
                    }
                    VKTabLayout vKTabLayout2 = attachDocumentsFragment.I0;
                    if (vKTabLayout2 != null) {
                        vKTabLayout2.setupWithViewPager(attachDocumentsFragment.F0);
                    }
                }
                nun nunVar = attachDocumentsFragment.E0;
                if (nunVar != null) {
                    nunVar.b.addAll(arrayList6);
                    nunVar.c.addAll(arrayList7);
                    nunVar.notifyDataSetChanged();
                }
                attachDocumentsFragment.zo(1);
                return s3q0.a;
            case 6:
                ((fp4) obj3).b.a = Integer.valueOf(((AudioGetPlaylistsResponseDto) obj).getCount());
                return s3q0.a;
            case 7:
                pv4 pv4Var = (pv4) obj3;
                i330<qv4> i330Var = pv4Var.D;
                zlv.a aVar2 = pv4Var.b;
                if (i330Var.c instanceof qv4.d) {
                    aVar2.f();
                } else {
                    aVar2.e();
                }
                return s3q0.a;
            case 8:
                ((pt5) obj3).T(new wt5.a((ot5) obj));
                return s3q0.a;
            case 9:
                List list2 = (List) obj;
                wo6 wo6Var = ((zo6) obj3).d;
                if (wo6Var != null) {
                    t53 t53Var = wo6Var.l;
                    t53 t53Var2 = t53Var != null ? t53Var : null;
                    ArrayList arrayList9 = t53Var2.e;
                    m.d a4 = androidx.recyclerview.widget.m.a(new t53.h(arrayList9, list2), true);
                    arrayList9.clear();
                    arrayList9.addAll(list2);
                    a4.b(t53Var2);
                }
                return s3q0.a;
            case 10:
                o48 o48Var = (o48) obj3;
                wh50 wh50Var = o48Var.e;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                wh50 wh50Var2 = o48Var.d;
                ((zak0) wh50Var2).setValue(bool);
                if (!((Boolean) ((zak0) wh50Var2).getValue()).booleanValue() && ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                    ((zak0) wh50Var).setValue(Boolean.FALSE);
                }
                return s3q0.a;
            case 11:
                ke8 ke8Var = (ke8) obj3;
                brj0 brj0Var = (brj0) obj;
                dw20 dw20Var = ke8Var.v;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                Object obj4 = brj0Var.o;
                ffw0 ffw0Var = obj4 instanceof ffw0 ? (ffw0) obj4 : null;
                if (ffw0Var != null) {
                    ke8Var.b(new le8.b(ffw0Var));
                }
                return s3q0.a;
            case 12:
                ((o29) obj3).b.invoke(w19.a.b);
                return s3q0.a;
            case 13:
                ((m99) obj3).r();
                return s3q0.a;
            case 14:
                return new m3x((ViewGroup) obj, new ay0((r3a) obj3, i2));
            case 15:
                n9a n9aVar = (n9a) obj3;
                if (((Configuration) obj) != null) {
                    n9aVar.n.getClass();
                }
                return s3q0.a;
            case 16:
                bdb bdbVar = (bdb) obj3;
                xgl0 xgl0Var2 = (xgl0) obj;
                Long l = bdbVar.w;
                long longValue = l != null ? l.longValue() : bdbVar.b;
                bru n = xgl0Var2.n();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Group b = n.b(Peer.a.d(longValue));
                if ((b != null ? b.t : null) == GroupPrivacy.CLOSED) {
                    MemberStatus.a aVar3 = MemberStatus.Companion;
                    Integer valueOf = Integer.valueOf(b.p);
                    aVar3.getClass();
                    if (MemberStatus.a.a(valueOf) == MemberStatus.REQUEST_SENT) {
                        xgl0Var2.n().h(Peer.a.d(longValue), MemberStatus.NO);
                    }
                }
                return s3q0.a;
            case 17:
                ((xyb) obj3).e1();
                return s3q0.a;
            case 18:
                h8c h8cVar = (h8c) obj3;
                k7r k7rVar = (k7r) obj;
                if (k7rVar instanceof x1x) {
                    List<u1x> list3 = ((x1x) k7rVar).d;
                    int size = list3.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            if (epx.f(list3.get(i8).b, h8cVar.a)) {
                                z = true;
                            } else {
                                i8++;
                            }
                        }
                    }
                } else {
                    z = epx.f(k7rVar.getKey(), h8cVar.a);
                }
                return Boolean.valueOf(z);
            case 19:
                ClipSearchRootVh clipSearchRootVh = (ClipSearchRootVh) obj3;
                String str2 = (String) obj;
                clipSearchRootVh.i8(vyh0.a);
                if (drm0.N(str2)) {
                    str2 = "";
                }
                clipSearchRootVh.v = str2;
                clipSearchRootVh.u.a(str2);
                clipSearchRootVh.q.U(clipSearchRootVh.v);
                clipSearchRootVh.E.d(true, true);
                return s3q0.a;
            case 20:
                bwd bwdVar = (bwd) obj3;
                List list4 = (List) obj;
                List<com.vk.clips.editor.state.model.c> list5 = bwdVar.e.o.a.c;
                ArrayList arrayList10 = new ArrayList(c5g.u(list5, 10));
                for (com.vk.clips.editor.state.model.c cVar2 : list5) {
                    Iterator it3 = list4.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            bwd.a aVar4 = (bwd.a) obj2;
                            if (epx.f(aVar4 != null ? aVar4.a : null, cVar2.j)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    bwd.a aVar5 = (bwd.a) obj2;
                    arrayList10.add(com.vk.clips.editor.state.model.c.a(cVar2, null, 0L, 0L, null, null, null, null, null, aVar5 != null ? new fzd(aVar5.b, aVar5.c, aVar5.d) : cVar2.q, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 458751));
                }
                szd szdVar = bwdVar.e;
                szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, arrayList10, null, null, null, null, 123), j5g.V(EmptyList.b));
                return s3q0.a;
            case 21:
                int i9 = ClipsFavoriteFolderContentListFragment.W;
                ((ClipsFavoriteFolderContentListFragment.b) obj3).b.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title((tlo0) obj, null, null, null, null, 30), false ? 1 : 0, false ? 1 : 0, com.vk.core.compose.component.semantics.b.a(null, new oa(i2), 3), 6));
                return s3q0.a;
            case 22:
                ClipsMusicSelectorCatalogEmbeddedTabsVh clipsMusicSelectorCatalogEmbeddedTabsVh = (ClipsMusicSelectorCatalogEmbeddedTabsVh) obj3;
                if (((n3a) obj) instanceof jwp0) {
                    Integer num = clipsMusicSelectorCatalogEmbeddedTabsVh.j;
                    if (num == null) {
                        return s3q0.a;
                    }
                    int intValue = num.intValue();
                    clipsMusicSelectorCatalogEmbeddedTabsVh.m = true;
                    if (clipsMusicSelectorCatalogEmbeddedTabsVh.i != intValue) {
                        clipsMusicSelectorCatalogEmbeddedTabsVh.a(intValue);
                    }
                } else {
                    qcy<Object>[] qcyVarArr = ClipsMusicSelectorCatalogEmbeddedTabsVh.p;
                }
                return s3q0.a;
            case 23:
                o6f o6fVar = (o6f) obj3;
                z8d z8dVar = o6fVar.e;
                z8dVar.e = 0L;
                z8dVar.d(false);
                z7f z7fVar = (z7f) ((Pair) obj).i();
                y7f.e eVar = o6fVar.c;
                eVar.e(z7fVar);
                List<n7f> list6 = z7fVar.d;
                ArrayList arrayList11 = new ArrayList(c5g.u(list6, 10));
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList11.add(fz5.x((n7f) it4.next(), z7fVar.f));
                }
                eVar.d(arrayList11);
                o6fVar.h.u7();
                eVar.a();
                return s3q0.a;
            case 24:
                ClipsVideoAttachmentData clipsVideoAttachmentData = (ClipsVideoAttachmentData) obj3;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(clipsVideoAttachmentData.b, "clip_video_id");
                w9yVar.b(Boolean.valueOf(clipsVideoAttachmentData.c), "publishing");
                w9yVar.d(Long.valueOf(clipsVideoAttachmentData.d.b), "owner_id");
                w9yVar.e(clipsVideoAttachmentData.e, "video_id");
                w9yVar.e(clipsVideoAttachmentData.f, CampaignEx.JSON_KEY_IMAGE_URL);
                w9yVar.e(clipsVideoAttachmentData.g, "title");
                w9yVar.c(clipsVideoAttachmentData.h, "album_id");
                return s3q0.a;
            case 25:
                izs izsVar = (izs) obj3;
                wiw wiwVar = (wiw) obj;
                if (wiwVar instanceof wiw.a) {
                    izsVar.invoke(kyg.d.C3214d.b);
                } else if (wiwVar instanceof wiw.b) {
                    izsVar.invoke(new kyg.d.e(((wiw.b) wiwVar).a));
                } else if (wiwVar instanceof wiw.c) {
                    izsVar.invoke(new kyg.d.f(((wiw.c) wiwVar).a));
                }
                return s3q0.a;
            case 26:
                qgi0.r((tgi0) obj, "priority_block_community_item_".concat(((MarketProductTileConfig) obj3).a));
                return s3q0.a;
            case 27:
                gkh gkhVar = (gkh) obj3;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                iea0 iea0Var = (iea0) gkhVar.t;
                if (iea0Var != null) {
                    zih.a(gkhVar.E, iea0Var, new t4a0(photoAlbum, iea0Var), null, 12);
                }
                return s3q0.a;
            case 28:
                zth zthVar = (zth) obj3;
                ((Integer) obj).intValue();
                if (f4m.h(zthVar.a)) {
                    zthVar.a();
                }
                return s3q0.a;
            default:
                wxh wxhVar = (wxh) obj3;
                qxh qxhVar2 = wxhVar.m;
                if ((qxhVar2 == null || (userId2 = qxhVar2.c) == null || fkq0.c(userId2)) && (qxhVar = wxhVar.m) != null && (userId = qxhVar.c) != null) {
                    wxhVar.l.c(new rxh.j(userId));
                }
                return s3q0.a;
        }
    }
}
