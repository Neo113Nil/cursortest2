package xsna;

import android.content.Context;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import com.vk.auth.ui.multiaccount.VkMultiAccountSelectorView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.video.VideoAlbum;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationActionReceiver;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationDeleteReceiver;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stories.design.view.editor.verticalization.VerticalizationPickerView;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vk.voip.ui.share.link.pager.view.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c9w0;
import xsna.mot0;
import xsna.vzw0;
import xsna.x7j0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b8j0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dts0 dts0Var;
        ats0 ats0Var;
        int i = 15;
        byte b = 0;
        switch (this.b) {
            case 0:
                e8j0 e8j0Var = (e8j0) this.c;
                x7j0.m mVar = new x7j0.m(((Integer) obj).intValue());
                e8j0Var.getClass();
                xn50.a.c(e8j0Var, mVar);
                break;
            case 1:
                uhj0 uhj0Var = (uhj0) this.c;
                ActionLinks actionLinks = (ActionLinks) obj;
                uhj0Var.l = actionLinks;
                svx svxVar = uhj0Var.v;
                int i2 = actionLinks.c;
                ArrayList arrayList = actionLinks.d;
                int i3 = actionLinks.b;
                boolean z = i2 >= i3;
                com.vkontakte.android.actionlinks.c cVar = uhj0Var.w;
                cVar.f = z;
                cVar.b = new thj0(z, uhj0Var, i3);
                svxVar.x0(cVar);
                ActionLink actionLink = uhj0Var.o;
                if (actionLink != null) {
                    com.vkontakte.android.actionlinks.a aVar = new com.vkontakte.android.actionlinks.a(actionLink, 4);
                    aVar.b = new fy0(19, uhj0Var, actionLink);
                    aVar.d = uhj0Var.m;
                    svxVar.x0(aVar);
                }
                if (arrayList != null && (!arrayList.isEmpty())) {
                    VKList vKList = new VKList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        vKList.add(new com.vkontakte.android.actionlinks.a((ActionLink) it.next(), 6));
                    }
                    Iterator<T> it2 = vKList.iterator();
                    while (it2.hasNext()) {
                        com.vkontakte.android.actionlinks.a aVar2 = (com.vkontakte.android.actionlinks.a) it2.next();
                        aVar2.f = !uhj0Var.d;
                        aVar2.b = new g4(20, uhj0Var, aVar2);
                        aVar2.c = new h4(i, uhj0Var, aVar2);
                        aVar2.d = uhj0Var.m;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(vKList);
                    svxVar.n0(arrayList2);
                    uhj0Var.h0();
                    ActionLink actionLink2 = uhj0Var.p;
                    if (actionLink2 != null) {
                        uhj0Var.f0(actionLink2);
                    }
                    if (uhj0Var.d) {
                        xhj0 xhj0Var = uhj0Var.k;
                        if (xhj0Var == null) {
                            xhj0Var = null;
                        }
                        xhj0Var.b(uhj0Var.t != null);
                    }
                }
                uhj0Var.i = null;
                break;
            case 2:
                ((cpk0) this.c).f.c();
                break;
            case 3:
                StickerCatalogRootVh stickerCatalogRootVh = (StickerCatalogRootVh) this.c;
                String str = (String) obj;
                stickerCatalogRootVh.i8(vyh0.a);
                stickerCatalogRootVh.x = str;
                SearchResultsVh.cb(stickerCatalogRootVh.A, str, stickerCatalogRootVh.y, null, false, null, false, 60);
                stickerCatalogRootVh.H.b(true, false);
                break;
            case 4:
                ((StickersView) this.c).h(null);
                break;
            case 5:
                n7m0 n7m0Var = (n7m0) this.c;
                String str2 = (String) obj;
                n7m0Var.l = str2;
                break;
            case 6:
                qgi0.h((tgi0) obj, ((zem0) this.c).b);
                break;
            case 7:
                ((bmm0) this.c).c((GetStoriesResponse) obj);
                break;
            case 8:
                UIBlock uIBlock = (UIBlock) obj;
                break;
            case 9:
                com.vk.superapp.ui.a aVar3 = (com.vk.superapp.ui.a) this.c;
                SuperAppFragment superAppFragment = aVar3.b;
                if (((Throwable) ((it80) obj).a) != null) {
                    mzp0 mzp0Var = aVar3.c;
                    if (mzp0Var != null) {
                        mzp0Var.f();
                    }
                    superAppFragment.ro();
                } else {
                    ikv0 ikv0Var = superAppFragment.c0;
                    if (ikv0Var != null) {
                        ikv0Var.a();
                    }
                    superAppFragment.c0 = null;
                }
                break;
            case 10:
                qvn0 qvn0Var = (qvn0) this.c;
                List<GroupsGroupFullDto> e = ((GroupsGetObjectExtendedResponseDto) obj).e();
                new dqu();
                List<GroupsGroupFullDto> list = e;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(dqu.a((GroupsGroupFullDto) it3.next()));
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    qvn0Var.b.h0((Group) it4.next());
                }
                break;
            case 11:
                m5r0 m5r0Var = (m5r0) this.c;
                UxpollsGetResponseDto uxpollsGetResponseDto = (UxpollsGetResponseDto) obj;
                List<UxpollsPollDto> e2 = uxpollsGetResponseDto.e();
                ArrayList arrayList4 = new ArrayList(c5g.u(e2, 10));
                Iterator<T> it5 = e2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(m5r0Var.b.a((UxpollsPollDto) it5.next(), uxpollsGetResponseDto.d()));
                }
                Object a0 = j5g.a0(arrayList4);
                if (a0 == null) {
                    break;
                } else {
                    break;
                }
            case 12:
                VerticalizationPickerView.a aVar4 = ((VerticalizationPickerView) this.c).y;
                if (aVar4 != null) {
                    aVar4.b();
                }
                break;
            case 13:
                com.vk.libvideo.autoplay.background.controller.f fVar = (com.vk.libvideo.autoplay.background.controller.f) this.c;
                yg5 yg5Var = (yg5) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = fVar.t;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                fVar.t = null;
                qys0 qys0Var = fVar.o;
                if (qys0Var != null) {
                    qys0Var.a = null;
                }
                if (qys0Var != null) {
                    fVar.d.j.remove(qys0Var);
                }
                fVar.o = null;
                pys0 pys0Var = fVar.p;
                if (pys0Var != null) {
                    pys0Var.a = null;
                }
                if (pys0Var != null && (dts0Var = fVar.n) != null) {
                    cts0 cts0Var = fVar.h;
                    if (cts0Var.b(dts0Var) && (ats0Var = cts0Var.d) != null) {
                        ats0Var.a.remove(pys0Var);
                    }
                }
                fVar.p = null;
                VideoNotificationActionReceiver videoNotificationActionReceiver = fVar.q;
                if (videoNotificationActionReceiver != null) {
                    videoNotificationActionReceiver.c = null;
                    videoNotificationActionReceiver.d = null;
                    videoNotificationActionReceiver.e = null;
                }
                if (videoNotificationActionReceiver != null) {
                    fVar.b.unregisterReceiver(videoNotificationActionReceiver);
                }
                fVar.q = null;
                VideoNotificationDeleteReceiver videoNotificationDeleteReceiver = fVar.r;
                if (videoNotificationDeleteReceiver != null) {
                    videoNotificationDeleteReceiver.b = null;
                }
                if (videoNotificationDeleteReceiver != null) {
                    fVar.b.unregisterReceiver(videoNotificationDeleteReceiver);
                }
                fVar.r = null;
                nys0 nys0Var = fVar.s;
                if (nys0Var != null) {
                    yg5 yg5Var2 = nys0Var.b;
                    if (yg5Var2 != null) {
                        yg5Var2.T(nys0Var);
                    }
                    nys0Var.b = null;
                    nys0Var.c = null;
                    nys0Var.d = null;
                    nys0Var.e = null;
                }
                fVar.s = null;
                fVar.F(yg5Var);
                break;
            case 14:
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess((rbt0) obj);
                break;
            case 15:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    pzr0 pzr0Var = gVar.b0.i;
                    break;
                }
            case 16:
                com.vk.posting.presentation.video.f fVar2 = (com.vk.posting.presentation.video.f) this.c;
                if (((Boolean) obj).booleanValue()) {
                    fVar2.f.K9();
                } else {
                    fVar2.f.Mk();
                }
                break;
            case 17:
                VideoPlaylistPlaceHolder videoPlaylistPlaceHolder = (VideoPlaylistPlaceHolder) this.c;
                Context context = (Context) obj;
                mot0.a aVar5 = mot0.a.a;
                VideoAlbum videoAlbum = videoPlaylistPlaceHolder.t;
                mot0.b(aVar5, context, videoAlbum.c, videoAlbum.b, null, 24);
                break;
            case 18:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) this.c;
                int i4 = VideoRelatedVideosFragment.n0;
                xn50.a.c(videoRelatedVideosFragment, new b.i(((mbt0) obj).b));
                break;
            case 19:
                atf0 atf0Var = (atf0) obj;
                ((yrj0) this.c).invoke(Double.valueOf(atf0Var.a), Double.valueOf(atf0Var.b));
                break;
            case 20:
                ((ggu0) this.c).d.A(JsApiMethodType.SEND_PAYLOAD, (Throwable) obj);
                break;
            case 21:
                VkMultiAccountSelectorView vkMultiAccountSelectorView = (VkMultiAccountSelectorView) this.c;
                com.vk.superapp.multiaccount.api.f fVar3 = (com.vk.superapp.multiaccount.api.f) j5g.a0((List) obj);
                if (fVar3 != null) {
                    vkMultiAccountSelectorView.setState(new o5v0(fVar3));
                }
                break;
            case 22:
                WebApiApplication webApiApplication = (WebApiApplication) this.c;
                WebSubscriptionInfo webSubscriptionInfo = (WebSubscriptionInfo) obj;
                vdx0 vdx0Var = e370.e;
                zen0 d = (vdx0Var != null ? vdx0Var : null).d();
                long j = webApiApplication.b;
                int i5 = webSubscriptionInfo.b;
                String str3 = webSubscriptionInfo.l;
                if (str3 == null) {
                    str3 = "";
                }
                break;
            case 23:
                ((i9w0) this.c).c.invoke(c9w0.a.b);
                break;
            case 24:
                lcw0 lcw0Var = (lcw0) this.c;
                com.vk.voip.ui.c.b.getClass();
                if (((com.vk.voip.call_effects.a) com.vk.voip.ui.c.Q()).c()) {
                    va9.c(com.vk.voip.ui.c.i0(), lcw0Var.a.getParentFragmentManager());
                    lcw0Var.c.invoke();
                }
                break;
            case 25:
                v79 v79Var = (v79) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    v79Var.b.b();
                }
                break;
            case 26:
                eka0 eka0Var = ((VoipCallActivity) this.c).E;
                eka0Var.a();
                eka0Var.p.b((xja0) obj);
                break;
            case 27:
                ((mjw0) this.c).s();
                break;
            case 28:
                ((wzw0) this.c).l.c(vzw0.b.a);
                break;
            default:
                com.vk.voip.ui.share.link.pager.view.b bVar = ((VoipShareLinkPagerView) this.c).h;
                if (bVar != null) {
                    bVar.a(a.b.a);
                }
                break;
        }
        return s3q0.a;
    }
}
