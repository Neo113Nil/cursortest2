package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedClipsBlockItemsGroupsFullResultDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.clips.favorites.impl.ui.folders.renaming.f;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.VkTopBar$Middle$Cell$Middle$Text;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.log.L;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToBookmarks;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.superapp.qr.web2app.modal.errors.QrExpiredException;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.webrtc.VideoFrame;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import xsna.b29;
import xsna.b2d;
import xsna.ca9;
import xsna.d4b;
import xsna.ea6;
import xsna.gm50;
import xsna.ig3;
import xsna.k1c;
import xsna.l1c;
import xsna.le8;
import xsna.npb;
import xsna.nt5;
import xsna.pge;
import xsna.snx;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g20(com.vk.catalog2.common.ui.mvp.util.a aVar, c06 c06Var) {
        this.b = 15;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x033e, code lost:
    
        if (r2 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x036f, code lost:
    
        if (r2 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x060f, code lost:
    
        if (r2.size() > r3.size()) goto L219;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03bb  */
    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Float f;
        dpb dpbVar;
        snx.b cVar;
        String string;
        zji0 zji0Var;
        Dialog Cb;
        String a;
        String message;
        String string2;
        MarketProfileInfoSimpleButtonDto d;
        String url;
        MarketUtmData marketUtmData;
        boolean z = true;
        int i = 0;
        r5 = null;
        String str = null;
        switch (this.b) {
            case 0:
                return com.vk.libvideo.design.view.actionlink.a.e((com.vk.libvideo.design.view.actionlink.a) this.c);
            case 1:
                gzs<s3q0> gzsVar = ((zg1) this.c).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                sr2 sr2Var = (sr2) this.c;
                VideoFrame videoFrame = (VideoFrame) obj;
                VideoDisplayLayout videoDisplayLayout = sr2Var.m;
                if (videoDisplayLayout != null && (f = sr2Var.n) != null) {
                    float floatValue = f.floatValue();
                    float c = sr2Var.a.c();
                    if (videoFrame.getRotatedWidth() >= videoDisplayLayout.getWidth() && videoFrame.getRotatedHeight() >= videoDisplayLayout.getHeight() && c == floatValue) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                ((ki3) this.c).d.invoke(new ig3.d());
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 4:
                AttachmentsEditorView attachmentsEditorView = (AttachmentsEditorView) this.c;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = attachmentsEditorView.s;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                attachmentsEditorView.s = cVar2;
                return s3q0.a;
            case 5:
                rt5 rt5Var = (rt5) this.c;
                int i2 = rt5.r1;
                nt5.d dVar = nt5.d.b;
                rt5Var.getClass();
                xn50.a.c(rt5Var, dVar);
                return s3q0.a;
            case 6:
                ((ea6.b) this.c).c.d((Throwable) obj);
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((oy6) this.c).a.h().contains(((Map.Entry) obj).getKey()));
            case 8:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) this.c;
                int i3 = BonusCatalogFragment.f0;
                bonusCatalogFragment.io();
                com.vk.lists.c cVar4 = bonusCatalogFragment.W;
                (cVar4 == null ? null : cVar4).p(false);
                return s3q0.a;
            case 9:
                ((ke8) this.c).b(le8.d.a);
                return s3q0.a;
            case 10:
                b29.a aVar = new b29.a(((f69) this.c).a, null);
                aVar.c(new cpo(false, 0, 7));
                aVar.I(true);
                aVar.O();
                aVar.J();
                aVar.d.Y = 0;
                aVar.v0(R.string.voip_debug_menu);
                aVar.H0((FragmentManager) obj, null);
                return s3q0.a;
            case 11:
                m99 m99Var = (m99) this.c;
                Map map = (Map) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, null, null, map, null, false, null, null, null, null, false, null, false, null, false, null, -1048577, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 12:
                com.vk.cameraui.impl.a aVar2 = (com.vk.cameraui.impl.a) this.c;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    aVar2.b.q0();
                    com.vk.cameraui.impl.a.k0(aVar2, list, false, false, 8);
                }
                List list2 = aVar2.c.C;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((StoryCameraGalleryData) it.next()).e) {
                            aVar2.h(false);
                            return s3q0.a;
                        }
                    }
                }
                break;
            case 13:
                return CameraUIView.y((CameraUIView) this.c);
            case 14:
                List<Playlist> list4 = (List) obj;
                aq40 aq40Var = ((laa) this.c).r;
                nt70 nt70Var = new nt70(aq40Var.h);
                nt70Var.m = list4;
                CatalogSection h = lu70.h(nt70Var.a(((laa) aq40Var.i.c).h));
                List<Playlist> list5 = list4;
                HashMap hashMap = new HashMap(list5.size());
                for (Playlist playlist : list5) {
                    hashMap.put(playlist.Ib(), playlist);
                }
                return new hda(h, new CatalogExtendedData(null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 7, null), null);
            case 15:
                ((com.vk.catalog2.common.ui.mvp.util.a) this.c).i = null;
                return s3q0.a;
            case 16:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.c;
                bVar.m.clear();
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, com.vk.channels.impl.comments.b.s(bVar, bVar.k.a(), true, 2), null, null, false, 14);
            case 17:
                com.vk.channels.impl.comments.e eVar = (com.vk.channels.impl.comments.e) this.c;
                View view = (View) obj;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view.getContext();
                e.b bVar2 = new e.b(view, null, null, l, 6);
                bVar2.w = R.layout.ds_internal_context_menu_item;
                VkContextMenu.c.c(bVar2, R.string.vkim_channel_comments_cancel_reply, null, false, null, new com.vk.movika.sdk.base.logic.processor.actions.d(eVar, 9), 24);
                VkContextMenu.c.k(bVar2);
                return s3q0.a;
            case 18:
                ((y3b) this.c).k.b(d4b.b.a);
                L.i((Throwable) obj);
                return s3q0.a;
            case 19:
                lpb lpbVar = (lpb) this.c;
                npb.d a2 = ((npb.b) obj).a.a();
                if (a2 != null && (dpbVar = lpbVar.h) != null) {
                    DialogExt dialogExt = a2.a;
                    Msg msg = a2.b;
                    int i4 = a2.c;
                    VkTopBar vkTopBar = dpbVar.e;
                    if (vkTopBar == null) {
                        vkTopBar = null;
                    }
                    zji0 zji0Var2 = dpbVar.c;
                    if (zji0Var2 == null) {
                        zji0Var2 = null;
                    }
                    int i5 = i4 - 1;
                    zji0Var2.getClass();
                    Dialog Cb2 = dialogExt.Cb();
                    ProfilesSimpleInfo Ob = dialogExt.b.Ob();
                    if (Cb2 == null) {
                        cVar = new snx.b.a(new b8g(R.drawable.user_placeholder));
                    } else {
                        if (msg instanceof com.vk.im.engine.models.messages.a) {
                            com.vk.im.engine.models.messages.a aVar3 = (com.vk.im.engine.models.messages.a) msg;
                            if (aVar3.db()) {
                                NestedMsg nestedMsg = (NestedMsg) j5g.b0(i5, aVar3.q7());
                                cVar = zji0Var2.c(nestedMsg != null ? Ob.zb(nestedMsg.f) : null);
                            }
                        }
                        cVar = Cb2.Jc() ? new snx.b.c(new slw(new qmm(iah0.a(36))), null, null, 14) : zji0Var2.c(Ob.Ab(Long.valueOf(msg.getFrom().d)));
                    }
                    com.vk.core.view.components.topbar.b bVar3 = new com.vk.core.view.components.topbar.b(new snx(cVar), null, 6);
                    zji0 zji0Var3 = dpbVar.c;
                    if (zji0Var3 == null) {
                        zji0Var3 = null;
                    }
                    Peer peer = dpbVar.a;
                    Context context = zji0Var3.a;
                    Dialog Cb3 = dialogExt.Cb();
                    ProfilesSimpleInfo Ob2 = dialogExt.b.Ob();
                    if (Cb3 != null) {
                        if (!Cb3.Jc()) {
                            if (msg instanceof com.vk.im.engine.models.messages.a) {
                                com.vk.im.engine.models.messages.a aVar4 = (com.vk.im.engine.models.messages.a) msg;
                                if (aVar4.db()) {
                                    NestedMsg nestedMsg2 = (NestedMsg) j5g.b0(i5, aVar4.q7());
                                    qtd0 zb = nestedMsg2 != null ? Ob2.zb(nestedMsg2.f) : null;
                                    if (epx.f(zb != null ? zb.B7() : null, peer)) {
                                        string = context.getString(R.string.im_chat_clips_from_me);
                                    } else if (zb != null) {
                                        String d6 = zb.d6(UserNameCase.GEN);
                                        if (d6 != null) {
                                            string = context.getString(R.string.im_chat_clips_from_someone, d6);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!msg.Jb(peer)) {
                                qtd0 Ab = Ob2.Ab(Long.valueOf(msg.getFrom().d));
                                if (Ab != null) {
                                    String d62 = Ab.d6(UserNameCase.GEN);
                                    if (d62 != null) {
                                        string = context.getString(R.string.im_chat_clips_from_someone, d62);
                                        break;
                                    }
                                }
                            } else {
                                string = context.getString(R.string.im_chat_clips_from_me);
                            }
                        } else {
                            string = context.getString(R.string.im_chat_clips_from_favorite);
                        }
                        VkTopBar$Middle$Cell$Middle$Text.Title title = new VkTopBar$Middle$Cell$Middle$Text.Title(string, VkTopBar$Middle$Cell$Middle$Text.Title.Overflow.Fade, 28);
                        zji0Var = dpbVar.c;
                        if (zji0Var == null) {
                            zji0Var = null;
                        }
                        Peer peer2 = dpbVar.a;
                        zji0Var.getClass();
                        long j = msg.g + qni0.h;
                        long a3 = qni0.a() - msg.g;
                        Cb = dialogExt.Cb();
                        qtd0 Ab2 = dialogExt.b.Ob().Ab(Long.valueOf(msg.getFrom().d));
                        boolean Jb = msg.Jb(peer2);
                        if (Cb != null) {
                            a = "";
                        } else if ((msg instanceof com.vk.im.engine.models.messages.a) && ((com.vk.im.engine.models.messages.a) msg).db()) {
                            a = zji0Var.a.getString(R.string.im_chat_clips_forwarded_message);
                        } else if (msg.g >= zji0Var.g) {
                            a = zji0Var.a(Ab2, Cb, Jb, zji0Var.a.getString(R.string.im_chat_clips_today_at) + ' ' + zji0Var.b(j));
                        } else if (a3 < TimeUnit.DAYS.toMillis(365L)) {
                            Date date = zji0Var.c;
                            SimpleDateFormat simpleDateFormat = zji0Var.e;
                            date.setTime(j);
                            a = zji0Var.a(Ab2, Cb, Jb, zji0Var.a.getString(R.string.im_chat_clips_date_with_time, simpleDateFormat.format(date), zji0Var.b(j)));
                        } else {
                            Date date2 = zji0Var.c;
                            SimpleDateFormat simpleDateFormat2 = zji0Var.f;
                            date2.setTime(j);
                            a = zji0Var.a(Ab2, Cb, Jb, simpleDateFormat2.format(date2));
                        }
                        vkTopBar.setMiddle(new VkTopBar.Middle.a(bVar3, new VkTopBar$Middle$Cell$Middle$Text(title, new VkTopBar$Middle$Cell$Middle$Text.a(a), 4)));
                    }
                    string = "";
                    VkTopBar$Middle$Cell$Middle$Text.Title title2 = new VkTopBar$Middle$Cell$Middle$Text.Title(string, VkTopBar$Middle$Cell$Middle$Text.Title.Overflow.Fade, 28);
                    zji0Var = dpbVar.c;
                    if (zji0Var == null) {
                    }
                    Peer peer22 = dpbVar.a;
                    zji0Var.getClass();
                    long j2 = msg.g + qni0.h;
                    long a32 = qni0.a() - msg.g;
                    Cb = dialogExt.Cb();
                    qtd0 Ab22 = dialogExt.b.Ob().Ab(Long.valueOf(msg.getFrom().d));
                    boolean Jb2 = msg.Jb(peer22);
                    if (Cb != null) {
                    }
                    vkTopBar.setMiddle(new VkTopBar.Middle.a(bVar3, new VkTopBar$Middle$Cell$Middle$Text(title2, new VkTopBar$Middle$Cell$Middle$Text.a(a), 4)));
                }
                return s3q0.a;
            case 20:
                bsb bsbVar = (bsb) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 15 && (message = vKApiExecutionException.getMessage()) != null && drm0.D(message, "already in", false)) {
                        ChatInviteFragment.b bVar4 = bsbVar.o;
                        if (bVar4 != null) {
                            bVar4.a(bsbVar.l.b.e);
                        }
                        ChatInviteFragment.b bVar5 = bsbVar.o;
                        if (bVar5 != null) {
                            bVar5.b();
                        }
                        return s3q0.a;
                    }
                }
                isb Y0 = bsbVar.Y0();
                View view2 = Y0.l;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setVisibility(8);
                TextView textView = Y0.k;
                (textView != null ? textView : null).setVisibility(0);
                zk70.c(zk70.a(th));
                return s3q0.a;
            case 21:
                b1c b1cVar = ((i1c) this.c).d;
                Throwable th2 = ((k1c.a) obj).b;
                Context context2 = b1cVar.a;
                boolean z2 = th2 instanceof QrExpiredException;
                String string3 = z2 ? context2.getString(R.string.vk_qr_web_to_app_error_sign_in_title) : context2.getString(R.string.vk_qr_web_to_app_error_sign_in_title);
                if (z2) {
                    string2 = context2.getString(R.string.vk_qr_web_to_app_error_sign_in_message);
                } else {
                    String message2 = th2.getMessage();
                    string2 = message2 == null ? context2.getString(R.string.vk_qr_web_to_app_error_sign_in_message) : message2;
                }
                return new l1c.a.C3224a(string3, string2);
            case 22:
                ClassifiedsCatalogRootVh.a aVar5 = ((xfc) this.c).a;
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = ClassifiedsCatalogRootVh.this;
                wfc wfcVar = classifiedsCatalogRootVh.A;
                MarketAnalyticsParams marketAnalyticsParams = classifiedsCatalogRootVh.y;
                wfcVar.getClass();
                String str2 = marketAnalyticsParams != null ? marketAnalyticsParams.j : null;
                CommonMarketStat$TypeAdCampaign a4 = wfc.a(marketAnalyticsParams);
                if (marketAnalyticsParams != null && (marketUtmData = marketAnalyticsParams.b) != null) {
                    str = marketUtmData.h;
                }
                wfc.b(str2, new CommonMarketStat$TypeMarketTransitionToBookmarks(a4, str));
                MarketProfileInfoDto marketProfileInfoDto = classifiedsCatalogRootVh.D;
                if (marketProfileInfoDto != null && (d = marketProfileInfoDto.d()) != null && (url = d.getUrl()) != null) {
                    maz.c(classifiedsCatalogRootVh.J, aVar5.b.getContext(), url, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 23:
                inc incVar = (inc) this.c;
                return new rnc(new snc((gzs) obj, (ClipVideoFile) ((qow) incVar.j1.getValue()).a, (ClipCoauthorsDecisionLaunchType) incVar.k1.getValue(), (qmd) incVar.i1.getValue()));
            case 24:
                u6d u6dVar = (u6d) this.c;
                if (b2d.a.$EnumSwitchMapping$0[((RestrictionOverlayRenderDelegate.RestrictionOverlayAction) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                u6dVar.a(ClipItemViewEvent.m.b);
                return s3q0.a;
            case 25:
                ((sub) this.c).invoke((Boolean) obj);
                return s3q0.a;
            case 26:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) this.c;
                int i6 = ClipsEntryPointsFragment.i0;
                a.i iVar = new a.i((List) obj);
                clipsEntryPointsFragment.getClass();
                xn50.a.c(clipsEntryPointsFragment, iVar);
                return s3q0.a;
            case 27:
                com.vk.clips.favorites.impl.ui.folders.renaming.b bVar6 = (com.vk.clips.favorites.impl.ui.folders.renaming.b) this.c;
                f.b bVar7 = (f.b) obj;
                String str3 = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
                gm50.a.a(bVar6, bVar7.a, new dg(bVar6, 23));
                gm50.a.a(bVar6, bVar7.b, new i4e(bVar6, i));
                gm50.a.a(bVar6, bVar7.c, new zx(bVar6, 24));
                return s3q0.a;
            case 28:
                Iterator it2 = i7o0.a(((qge) this.c).e).iterator();
                while (it2.hasNext()) {
                    ((pge.a) it2.next()).a();
                }
                return s3q0.a;
            default:
                ShortVideoFeedClipsBlockItemsGroupsFullResultDto shortVideoFeedClipsBlockItemsGroupsFullResultDto = (ShortVideoFeedClipsBlockItemsGroupsFullResultDto) obj;
                List e = ums0.e(((ClipsPrefetchHelper) this.c).c, shortVideoFeedClipsBlockItemsGroupsFullResultDto.f(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.i(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.e(), false, 52);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : e) {
                    if (obj2 instanceof ClipVideoFile) {
                        arrayList.add(obj2);
                    }
                }
                String g = shortVideoFeedClipsBlockItemsGroupsFullResultDto.g();
                return new ClipsPrefetchHelper.a.b(arrayList, (g == null || g.length() == 0 || g.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(g), shortVideoFeedClipsBlockItemsGroupsFullResultDto.d());
        }
    }

    public /* synthetic */ g20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
