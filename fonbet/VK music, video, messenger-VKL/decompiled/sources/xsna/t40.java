package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.shortVideo.dto.ShortVideoPopularHashtagDto;
import com.vk.channels.impl.list.e;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.clips.playlists.folders.root.ClipsPlaylistsFoldersRootFragment;
import com.vk.clips.playlists.folders.root.g;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.utils.ClipVideoPixelExecutorDelegate;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.entities.OrdData;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.h;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import xsna.aiq0;
import xsna.cce;
import xsna.d4e;
import xsna.gm50;
import xsna.jj1;
import xsna.lbf;
import xsna.n7b;
import xsna.pta;
import xsna.w5f;
import xsna.wzd;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((zak0) ((z40) obj2).d).setValue((tho0) obj);
                return s3q0.a;
            case 1:
                return ((com.vk.superapp.advertisement.a) obj).a((AdvertisementType) obj2);
            case 2:
                jj1.a aVar = (jj1.a) obj2;
                aVar.o.a((PhotoAlbum) aVar.m);
                return s3q0.a;
            case 3:
                mp5 mp5Var = (mp5) obj2;
                mp5Var.e2(new aiq0.d.a(new pta.a.C3530a((ir5) obj)));
                mp5Var.l.set(false);
                return s3q0.a;
            case 4:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj2;
                int i3 = BasePhotoListFragment.l0;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    basePhotoListFragment.lo().notifyItemChanged(((Number) ((Pair) it.next()).i()).intValue());
                }
                return s3q0.a;
            case 5:
                return new va7((ViewGroup) obj, ((ja7) obj2).i);
            case 6:
                int i4 = BroadcastScheduledFragment.U;
                ((pd8) ((BroadcastScheduledFragment) obj2).T.getValue()).a((qd8) ((it80) obj).a);
                return s3q0.a;
            case 7:
                ((VkButton) obj).setLoading(((Boolean) ((wh50) obj2).getValue()).booleanValue());
                return s3q0.a;
            case 8:
                g3a g3aVar = (g3a) obj2;
                hda hdaVar = (hda) obj;
                if (g3aVar.h) {
                    String t = g3aVar.b.t();
                    g3aVar.o.c(t, hdaVar);
                    g3aVar.p.c(t, hdaVar);
                }
                return s3q0.a;
            case 9:
                oe5 oe5Var = ((kea) obj2).J;
                if (oe5Var != null) {
                    oe5Var.invoke();
                }
                return s3q0.a;
            case 10:
                ((f8b) obj2).d.invoke(n7b.c.b);
                return s3q0.a;
            case 11:
                ((ubb) obj2).u((Throwable) obj, false);
                return s3q0.a;
            case 12:
                ((com.vk.channels.impl.list.f) obj2).O(new e.s((Set) obj));
                return s3q0.a;
            case 13:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) obj2;
                h.c cVar = (h.c) obj;
                int i5 = ChatClipsReplyFragment.T;
                gm50.a.a(chatClipsReplyFragment, cVar.a, new qm1(cVar, chatClipsReplyFragment));
                return s3q0.a;
            case 14:
                ((qrb) obj2).a.c();
                return s3q0.a;
            case 15:
                ((a8c) obj2).getClass();
                a8c.f((tr90) obj);
                return s3q0.a;
            case 16:
                fcn fcnVar = (fcn) obj;
                Activity c = g2u0.c(((l0d) obj2).a);
                ey50 ey50Var = c instanceof ey50 ? (ey50) c : null;
                ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                if (Y != null) {
                    Y.H(fcnVar);
                }
                return s3q0.a;
            case 17:
                o1d o1dVar = (o1d) obj2;
                ClipItemAction.v vVar = new ClipItemAction.v(false, false);
                o1dVar.getClass();
                xn50.a.c(o1dVar, vVar);
                return s3q0.a;
            case 18:
                ((x6d) obj2).e.a.a(j5d.b);
                return s3q0.a;
            case 19:
                ClipVideoPixelExecutorDelegate clipVideoPixelExecutorDelegate = (ClipVideoPixelExecutorDelegate) obj2;
                List<StatPixel> list = clipVideoPixelExecutorDelegate.e;
                list.addAll((List) obj);
                clipVideoPixelExecutorDelegate.f.set(true);
                clipVideoPixelExecutorDelegate.b.t(list);
                return s3q0.a;
            case 20:
                und undVar = (und) obj2;
                vqt vqtVar = (vqt) obj;
                com.vk.lists.c cVar2 = undVar.i;
                int i6 = vqtVar.c;
                int i7 = vqtVar.b;
                VKList<NewsComment> vKList = vqtVar.a;
                cVar2.q(i6 > 0 ? vKList.size() + i6 : vKList.size());
                undVar.m.e(Math.max(0, i7 - vqtVar.c));
                if (cVar2.i() >= i7) {
                    cVar2.r(false);
                }
                String j = cVar2.j();
                if (j == null || j.length() == 0 || vKList.isEmpty()) {
                    cVar2.r(false);
                }
                return s3q0.a;
            case 21:
                ((szd) obj2).e((com.vk.clips.editor.state.model.a) obj, Collections.singletonList(new wzd.c(0)));
                return s3q0.a;
            case 22:
                com.vk.clips.favorites.impl.ui.folders.content.b bVar = (com.vk.clips.favorites.impl.ui.folders.content.b) obj2;
                d4e.a.b bVar2 = (d4e.a.b) obj;
                FavoriteFolderId favoriteFolderId = bVar2.a;
                FavoriteFolderId favoriteFolderId2 = bVar2.b;
                ArrayList arrayList = bVar2.c;
                com.vk.clips.favorites.impl.ui.folders.content.c cVar3 = bVar.f;
                if (favoriteFolderId.equals(cVar3.b())) {
                    bVar.T(new d.b(arrayList));
                    bVar.T(d.InterfaceC0593d.a.b);
                }
                if (epx.f(favoriteFolderId2, cVar3.b())) {
                    bVar.U();
                }
                return s3q0.a;
            case 23:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar3 = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) obj2;
                cce.a aVar2 = (cce.a) obj;
                if (aVar2.a) {
                    awt0.q(bVar3.getRootView());
                }
                View contentView = bVar3.getContentView();
                tlo0 tlo0Var = aVar2.b;
                contentView.setContentDescription(tlo0Var != null ? tlo0Var.a(bVar3.getContext()) : null);
                return s3q0.a;
            case 24:
                gu80 gu80Var = (gu80) obj;
                OrdData ordData = new OrdData(gu80Var.a, gu80Var.b, gu80Var.c);
                izs<? super OrdData, s3q0> izsVar = ((rne) obj2).a;
                if (izsVar != null) {
                    izsVar.invoke(ordData);
                }
                return s3q0.a;
            case 25:
                ClipsPlaylistsFoldersRootFragment clipsPlaylistsFoldersRootFragment = (ClipsPlaylistsFoldersRootFragment) obj2;
                ClipsPlaylistsFoldersRootFragment.a aVar3 = ClipsPlaylistsFoldersRootFragment.S;
                gm50.a.a(clipsPlaylistsFoldersRootFragment, ((g.a) obj).a, new x2e(clipsPlaylistsFoldersRootFragment, i2));
                return s3q0.a;
            case 26:
                w5f w5fVar = (w5f) obj2;
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    w5fVar.e(w5f.a.HASHTAG);
                }
                efe efeVar = w5fVar.g;
                List<ShortVideoPopularHashtagDto> list3 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (ShortVideoPopularHashtagDto shortVideoPopularHashtagDto : list3) {
                    arrayList2.add(new o5f(shortVideoPopularHashtagDto.d(), shortVideoPopularHashtagDto.e()));
                }
                efeVar.b(arrayList2);
                return s3q0.a;
            case 27:
                hjf hjfVar = (hjf) obj2;
                String str = ClipsUploadFragmentImpl.a0;
                List list4 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(i740.a((MultipickerProduct) it2.next()));
                }
                hjfVar.b(new lbf.c.l.b(arrayList3));
                return s3q0.a;
            case 28:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj2;
                gfx gfxVar = (gfx) obj;
                int i8 = ClipsWrapperFragment.Q0;
                if (clipsWrapperFragment.isResumed()) {
                    gfxVar.a(clipsWrapperFragment.requireContext());
                }
                return s3q0.a;
            default:
                return new CommunityEventsState((UserId) obj2, CommunityEventsState.Content.c.a);
        }
    }
}
