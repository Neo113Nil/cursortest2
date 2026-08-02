package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stickers.dto.StickersUnSubscribePackAuthorResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.upload.ClipEditorSizeParams;
import com.vk.dto.common.Peer;
import com.vk.dto.group.GroupChat;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.effect.VideoTransformEffect;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.TimelineException;
import com.vk.music.bottomsheets.promo.presentation.model.LinkButton;
import com.vk.music.navigation.VkMusicNavigationTab;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stickers.settings.StickerSettingsRouter;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.c8f;
import xsna.cb7;
import xsna.e890;
import xsna.e8v0;
import xsna.eqo;
import xsna.f0r;
import xsna.f360;
import xsna.gm50;
import xsna.laf;
import xsna.ldm;
import xsna.o0r0;
import xsna.o4e0;
import xsna.p250;
import xsna.pum;
import xsna.rmw;
import xsna.sx80;
import xsna.wk50;
import xsna.wqs0;
import xsna.xlm;
import xsna.ybb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class na7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ na7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x03b7, code lost:
    
        if ((!r6.isEmpty()) == r2) goto L125;
     */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        AuthorAd authorAd;
        File file;
        Iterator it;
        float[] fArr;
        boolean z;
        boolean z2;
        gkx0 gkx0Var;
        int i = this.b;
        int i2 = -1;
        int i3 = 8;
        int i4 = 3;
        boolean z3 = false;
        r8 = false;
        boolean z4 = false;
        r8 = false;
        boolean z5 = false;
        int i5 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ma7 ma7Var = (ma7) obj3;
                cb7 cb7Var = (cb7) obj;
                int i6 = BirthdaysListFragment.T;
                Context requireContext = ((BirthdaysListFragment) obj2).requireContext();
                if (!(cb7Var instanceof cb7.a)) {
                    ma7Var.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                pa7 pa7Var = ma7Var.g;
                cb7.a aVar = (cb7.a) cb7Var;
                pa7Var.getClass();
                if (aVar instanceof cb7.a.C2654a) {
                    pa7Var.c.m(requireContext, ((cb7.a.C2654a) aVar).a, new o0r0.a(false, pa7Var.e, null, null, null, null, null, false, false, false, false, null, null, null, 65533));
                } else if (aVar instanceof cb7.a.b) {
                    pa7Var.a.h(requireContext, ((cb7.a.b) aVar).a);
                } else if (aVar instanceof cb7.a.c) {
                    pa7Var.d.g(requireContext, pa7Var.e, Collections.singletonList(Long.valueOf(((cb7.a.c) aVar).a.b)));
                } else if (aVar instanceof cb7.a.e) {
                    cb7.a.e eVar = (cb7.a.e) aVar;
                    pa7Var.d.l(requireContext, pa7Var.e, eVar.b, eVar.a.b);
                } else {
                    if (!(aVar instanceof cb7.a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pa7Var.b.b().L(requireContext, pa7Var.e, "birthdays_list", ((cb7.a.d) aVar).a.b);
                }
                return s3q0.a;
            case 1:
                Context context = (Context) obj;
                VkBlurContentView vkBlurContentView = new VkBlurContentView(context, null, 6);
                vkBlurContentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ComposeView composeView = new ComposeView(context, null, 6);
                composeView.setContent(new jai(-1556035158, new w61((o48) obj3, 1), true));
                vkBlurContentView.addView(composeView);
                ((wh50) obj2).setValue(vkBlurContentView);
                return vkBlurContentView;
            case 2:
                StickerStockItem stickerStockItem = (StickerStockItem) obj3;
                kt8 kt8Var = (kt8) obj2;
                View view = (View) obj;
                if (stickerStockItem != null) {
                    int i7 = stickerStockItem.b;
                    tfx tfxVar = new tfx("store.activateProduct", new zyk0(1), new azk0(i5));
                    tfx.o(tfxVar, "type", "stickers", 0, 0, 12);
                    tfx.l(tfxVar, "product_id", i7, 0, 0, 8);
                    hg1.b(view, hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), view.getContext(), 0L, false, 62).subscribe(new f50(new rh4(i4, kt8Var, stickerStockItem), i3)));
                }
                return s3q0.a;
            case 3:
                Boolean bool = (Boolean) obj2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                String str = uIBlockList.M;
                VkMusicNavigationTab.Companion.getClass();
                if (j5g.P(((c1a) obj3).d, VkMusicNavigationTab.a.a(str))) {
                    ArrayList<UIBlock> arrayList = uIBlockList.y;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator<T> it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (epx.f(((UIBlock) it2.next()).b, "synthetic_music_auto_download_banner_block")) {
                                    z5 = true;
                                }
                            }
                        }
                    }
                    z3 = !Boolean.valueOf(z5).equals(bool);
                }
                return Boolean.valueOf(z3);
            case 4:
                g3a g3aVar = (g3a) obj3;
                CatalogViewHolder catalogViewHolder = (CatalogViewHolder) obj2;
                UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) ((Pair) obj).g();
                mzp0 mzp0Var = g3aVar.c.c.g;
                if (mzp0Var != null) {
                    mzp0Var.c(uIBlockCatalog.E);
                }
                catalogViewHolder.N6(uIBlockCatalog);
                zda zdaVar = g3aVar.f;
                if (zdaVar != null) {
                    zdaVar.H(uIBlockCatalog);
                }
                return s3q0.a;
            case 5:
                return laa.s((laa) obj3, (String) obj2, null, null, null, null, (List) obj, null, null, null, 478);
            case 6:
                zbb zbbVar = (zbb) obj3;
                MsgFromChannel msgFromChannel = (MsgFromChannel) obj2;
                Date date = (Date) obj;
                ChannelMsgSendConfig channelMsgSendConfig = zbbVar.p;
                MsgFromChannel.b bVar = msgFromChannel.I;
                PostDonut postDonut = bVar.g;
                Integer num = postDonut != null ? postDonut.d : null;
                boolean z6 = bVar.z;
                Peer peer = bVar.m;
                peer.getClass();
                boolean z7 = !peer.Ab(Peer.Type.UNKNOWN);
                MsgFromChannel.b bVar2 = msgFromChannel.I;
                AttachComments attachComments = bVar2.l;
                boolean z8 = attachComments != null && attachComments.f;
                boolean z9 = bVar2.n;
                String str2 = (!z9 || (authorAd = bVar2.h) == null) ? null : authorAd.c;
                cew.b.getClass();
                ChannelMsgSendConfig a = ChannelMsgSendConfig.a(channelMsgSendConfig, date, z8, false, z7, !msgFromChannel.R, num, str2, null, Boolean.valueOf(z9), false, cew.i(), false, z6, null, 21892);
                com.vk.channels.impl.channel_screen.send_msg.a aVar2 = zbbVar.q;
                zbbVar.O(new ybb.f(msgFromChannel, a, (aVar2 == null ? null : aVar2).I()));
                return s3q0.a;
            case 7:
                ((qrb) obj3).b.a(((MenuItem) obj2).getItemId());
                return s3q0.a;
            case 8:
                ClipsFavoriteFolderContentListFragment.b bVar3 = (ClipsFavoriteFolderContentListFragment.b) obj3;
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                ClipsFavoriteFolderContentListViewState.a aVar3 = (ClipsFavoriteFolderContentListViewState.a) obj;
                int i8 = ClipsFavoriteFolderContentListFragment.W;
                bVar3.c.setVisibility(0);
                bVar3.f.setVisibility(8);
                bVar3.g.setVisibility(8);
                bVar3.h.setVisibility(8);
                List<? extends hfz> a2 = aVar3.b.a();
                if (a2 != null) {
                    ((v2e) clipsFavoriteFolderContentListFragment.U.getValue()).setItems(a2);
                }
                gm50.a.a(clipsFavoriteFolderContentListFragment, aVar3.c, new ha(bVar3, 16));
                gm50.a.a(clipsFavoriteFolderContentListFragment, aVar3.a, new kf1(clipsFavoriteFolderContentListFragment, 19));
                return s3q0.a;
            case 9:
                c8f c8fVar = (c8f) obj3;
                StoryMusicInfo storyMusicInfo = (StoryMusicInfo) obj;
                ArrayList arrayList2 = ((jhd0) obj2).d;
                j7f j7fVar = c8fVar.g;
                c8f.a aVar4 = c8fVar.e;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    int i9 = ((ClipsTemplateEditorVideoItem) it3.next()).c;
                    arrayList3.add(new MediaUtils.d(i9, i9));
                }
                MediaUtils.d a3 = two0.a(arrayList3, 0.5625f);
                lwo0 lwo0Var = new lwo0(((MediaPipelineComponent) j7fVar.f.getValue()).Gd());
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = (ClipsTemplateEditorVideoItem) it4.next();
                    int i10 = clipsTemplateEditorVideoItem.c;
                    int i11 = clipsTemplateEditorVideoItem.d;
                    TrackMediaSource trackMediaSource = new TrackMediaSource(Uri.parse(clipsTemplateEditorVideoItem.b), i2);
                    long j = clipsTemplateEditorVideoItem.f * 1000;
                    c8f.a aVar5 = aVar4;
                    long j2 = clipsTemplateEditorVideoItem.g * 1000;
                    VideoTransform videoTransform = clipsTemplateEditorVideoItem.j;
                    int i12 = clipsTemplateEditorVideoItem.c;
                    if (videoTransform == null) {
                        it = it4;
                        fArr = null;
                    } else {
                        it = it4;
                        Size size = new Size(aVar5.getLayoutWidth(), aVar5.getLayoutHeight());
                        float f = i12;
                        float f2 = i11;
                        laf.a aVar6 = new laf.a(f, f2, size.getWidth(), size.getHeight());
                        laf.a.getClass();
                        Matrix matrix = (Matrix) laf.a(videoTransform, aVar6).d();
                        float max = Math.max(f2 / f2, f / i10);
                        matrix.preScale(max, max);
                        bpn0 bpn0Var = z5l0.a;
                        float[] fArr2 = new float[9];
                        z5l0.c(a3.a, a3.b, size.getWidth(), size.getHeight(), matrix).getValues(fArr2);
                        fArr = fArr2;
                    }
                    VideoEncodedItem videoEncodedItem = new VideoEncodedItem(trackMediaSource, j, j2, 1.0d, new VideoEffect(fArr != null ? new VideoTransformEffect(fArr, a3.a, a3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, null) : null, null));
                    meg megVar = new meg(lwo0Var);
                    megVar.c(videoEncodedItem);
                    megVar.b();
                    it4 = it;
                    aVar4 = aVar5;
                    i2 = -1;
                }
                c8f.a aVar7 = aVar4;
                AudioItem audioItem = new AudioItem(new TrackMediaSource(Uri.fromFile(new File(String.valueOf(storyMusicInfo.g))), -1), storyMusicInfo.d * 1000, storyMusicInfo.e * 1000, 1.0d, 1.0f, null, 32, null);
                ArrayList arrayList4 = new ArrayList();
                long j3 = storyMusicInfo.f * 1000;
                long j4 = audioItem.c;
                if (j4 < 0 || audioItem.d <= j4) {
                    throw new TimelineException("Invalid item: " + audioItem);
                }
                arrayList4.add(new AudioFragmentItem(audioItem, j3));
                ((ArrayList) lwo0Var.c).addAll(arrayList4);
                String str3 = storyMusicInfo.g;
                ClipsEncoderParameters.LicensedMusicInfo licensedMusicInfo = str3 != null ? new ClipsEncoderParameters.LicensedMusicInfo(new File(str3), storyMusicInfo.b.Fb(), storyMusicInfo.c) : null;
                Timeline b = lwo0Var.b();
                ClipEditorSizeParams clipEditorSizeParams = new ClipEditorSizeParams(aVar7.getLayoutWidth(), aVar7.getLayoutHeight());
                ClipsEncoderParameters.VideoOutputSettings videoOutputSettings = new ClipsEncoderParameters.VideoOutputSettings(a3.a, a3.b);
                MediaQuality mediaQuality = MediaQuality.HIGH;
                try {
                    Context context2 = c8fVar.c;
                    ClipsDraftPersistentStore.b.getClass();
                    file = new pwe(context2, ClipsDraftPersistentStore.j(), (MediaPipelineComponent) j7fVar.f.getValue()).a(b, EmptyList.b, new Size(a3.a, a3.b)).c();
                } catch (Exception e) {
                    L.l("ClipsTemplateEditorProcessingDelegateImpl", "preview retrieve failed: " + e);
                    file = null;
                }
                ClipsEncoderParameters clipsEncoderParameters = new ClipsEncoderParameters(b, videoOutputSettings, clipEditorSizeParams, mediaQuality, file, licensedMusicInfo, null, 64, null);
                L.p("ClipsTemplateEditorProcessingDelegateImpl", "encoder params:\n" + b);
                return clipsEncoderParameters;
            case 10:
                mdg mdgVar = (mdg) obj3;
                NewsComment newsComment = (NewsComment) obj2;
                Throwable th = (Throwable) obj;
                mdgVar.M.remove(Integer.valueOf(newsComment.i));
                newsComment.C = false;
                newsComment.p--;
                mdgVar.h1(newsComment);
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 11:
                ofh ofhVar = (ofh) obj3;
                pzb pzbVar = (pzb) obj2;
                List<GroupChat> list = pzbVar.j;
                if (list == null || list.isEmpty()) {
                    ofh.v(ofhVar, pzbVar, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    ofh.v(ofhVar, pzbVar, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
            case 12:
                qgi0.h((tgi0) obj, ((m3k) obj3).c.a((Context) obj2).toString());
                return s3q0.a;
            case 13:
                w2w w2wVar = (w2w) obj3;
                zpm zpmVar = (zpm) obj2;
                pdm c = w2wVar.I0().b().c();
                String str4 = zpmVar.d;
                List<Peer> list2 = zpmVar.f;
                List<Peer> list3 = zpmVar.e;
                int i13 = zpmVar.c;
                if (str4 != null) {
                    ldm i14 = c.i();
                    z = true;
                    i14.b.b().execSQL(xqm0.g("\n            UPDATE " + i14.a.a + " SET " + ldm.a.NAME.getKey() + " = ? WHERE " + ldm.a.ID.getKey() + " = ?\n            "), new Object[]{str4, Integer.valueOf(i13)});
                } else {
                    z = true;
                }
                if (list3 != null) {
                    c.n(i13, list3);
                }
                if (list2 != null) {
                    List<Peer> list4 = list2;
                    xlm d = c.d();
                    d.b.b().f(d.a.a, xlm.a.FOLDER_ID.getKey() + " = " + i13 + " AND " + xlm.a.DIALOG_ID.getKey() + " in " + j5g.g0(list4, null, "(", ")", 0, new py(21), 25), null);
                    c.d.c(list4, i13);
                }
                Integer num2 = zpmVar.g;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    rdm e2 = c.e(i13);
                    ryr ryrVar = e2 != null ? new ryr(e2.d) : null;
                    if (ryrVar == null || ryrVar.a != intValue) {
                        ldm i15 = c.i();
                        i15.b.b().execSQL(xqm0.g("\n            UPDATE " + i15.a.a + " SET " + ldm.a.FLAGS.getKey() + " = ? WHERE " + ldm.a.ID.getKey() + " = ?\n            "), new Integer[]{Integer.valueOf(intValue), Integer.valueOf(i13)});
                    }
                }
                if (list3 != null) {
                    z2 = z;
                    break;
                } else {
                    z2 = z;
                }
                if (list2 == null || (list2.isEmpty() ^ z2) != z2) {
                    return s3q0.a;
                }
                List O0 = j5g.O0(w2wVar.I0().b().c().c(i13));
                hpm c2 = sn.c(w2wVar);
                List list5 = O0;
                ArrayList arrayList5 = new ArrayList(c5g.u(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Long.valueOf(((Peer) it5.next()).b));
                }
                Map J = c2.J(i13, arrayList5);
                if (J.size() != O0.size()) {
                    w2wVar.I0().b().a().a(i13);
                } else {
                    Iterator it6 = J.values().iterator();
                    if (it6.hasNext()) {
                        gkx0Var = ((com.vk.im.engine.models.dialogs.b) it6.next()).f;
                        while (it6.hasNext()) {
                            gkx0 gkx0Var2 = ((com.vk.im.engine.models.dialogs.b) it6.next()).f;
                            gkx0Var.getClass();
                            if (gkx0Var.compareTo(gkx0Var2) > 0) {
                                gkx0Var = gkx0Var2;
                            }
                        }
                    } else {
                        gkx0Var = null;
                    }
                    if (gkx0Var == null) {
                        gkx0Var = gkx0.e;
                    }
                    long j5 = gkx0Var.b;
                    Pair<Integer, Integer> pair = lmm.a;
                    vjm vjmVar = new vjm((int) xo9.j(j5, lmm.a), (int) xo9.j(j5, lmm.c));
                    Iterator it7 = e43.l(new pum.b(i13, DialogsFilter.MAIN), new pum.b(i13, DialogsFilter.UNREAD)).iterator();
                    while (it7.hasNext()) {
                        nrm f3 = w2wVar.I0().b().a().f((pum.b) it7.next());
                        if (f3 != null) {
                            com.vk.im.engine.internal.storage.delegates.dialogs.b a4 = w2wVar.I0().b().a();
                            nrm a5 = nrm.a(f3, null, vjmVar, 13);
                            a4.getClass();
                            a4.i(Collections.singletonList(a5));
                        }
                    }
                }
                return s3q0.a;
            case 14:
                ((fwm) obj3).a.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 15:
                eqo eqoVar = (eqo) obj3;
                jqo<UseCase> jqoVar = eqoVar.c;
                hqo hqoVar = (hqo) obj2;
                Throwable th2 = (Throwable) obj;
                eqoVar.g();
                eqo.a<UseCase> aVar8 = eqoVar.g;
                if (aVar8 != 0) {
                    aVar8.d(hqoVar, th2);
                }
                if (th2 instanceof DynamicException.Cancellation) {
                    return s3q0.a;
                }
                int i16 = 5;
                if (th2 instanceof DynamicException.Queuing) {
                    jqoVar.h(th2, new fk(i16, eqoVar, hqoVar));
                } else {
                    com.vk.metrics.eventtracking.b.a.a(th2);
                    jqoVar.h(th2, new fk(i16, eqoVar, hqoVar));
                }
                return s3q0.a;
            case 16:
                ((f0r.j) obj3).h((wk50.a) obj2, (Throwable) obj);
                return s3q0.a;
            case 17:
                xow xowVar = (xow) obj3;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, ngi.a, 3);
                nvyVar.e(xowVar.size(), null, new a.c(xowVar), new jai(2039820996, new a.d(xowVar, (izs) obj2), true));
                return s3q0.a;
            case 18:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.v(tgi0Var, 1.0f);
                qgi0.h(tgi0Var, (String) obj3);
                qgi0.e(tgi0Var, null, new ww20(0, (gzs) obj2));
                return s3q0.a;
            case 19:
                st30 st30Var = (st30) obj3;
                pk30 pk30Var = (pk30) obj2;
                StickerItem stickerItem = (StickerItem) ((n1l0) obj);
                st30Var.l = stickerItem;
                Msg msg = st30Var.n;
                if (msg != null && pk30Var != null) {
                    pk30Var.T(msg, stickerItem);
                }
                return s3q0.a;
            case 20:
                kr70 kr70Var = (kr70) obj3;
                Throwable th3 = (Throwable) obj;
                int b2 = kr70Var.b((NewsComment) obj2);
                ListDataSet<cbg> listDataSet = kr70Var.a;
                if (b2 >= 0) {
                    listDataSet.c(b2).d = Boolean.FALSE;
                    listDataSet.d(b2);
                }
                if (th3 instanceof VKApiExecutionException) {
                    Context context3 = e43.a;
                    j03.i(context3 != null ? context3 : null, (VKApiExecutionException) th3);
                }
                return s3q0.a;
            case 21:
                nvy nvyVar2 = (nvy) obj;
                nvy.g(nvyVar2, null, null, eji.a, 3);
                List list6 = ((sx80.a.d) obj3).a;
                nvyVar2.e(list6.size(), new pzi(new c220(8), list6), new lu80(new z7w(13), list6), new jai(802480018, new mu80(z3 ? 1 : 0, (izs) obj2, list6), true));
                return s3q0.a;
            case 22:
                e890.a aVar9 = (e890.a) obj3;
                String str5 = (String) obj2;
                List list7 = (List) obj;
                HashMap<String, e890.a> hashMap = e890.a;
                try {
                    PackageInfo f4 = dy2.f(str5, 134217729);
                    if (f4 != null) {
                        z4 = u790.a(f4, list7);
                    }
                } catch (Throwable th4) {
                    com.vk.metrics.eventtracking.b.a.q(th4);
                }
                aVar9.a = z4;
                return Boolean.valueOf(z4);
            case 23:
                y5e0 y5e0Var = (y5e0) obj3;
                p250.b bVar4 = y5e0Var.c;
                int i17 = y5e0Var.d;
                LinkButton linkButton = ((c6e0) obj2).b.d;
                bVar4.invoke(new o4e0.c(i17, linkButton.c, linkButton.d, true));
                return s3q0.a;
            case 24:
                okhttp3.d dVar = (okhttp3.d) obj2;
                f360.a aVar10 = (f360.a) obj;
                Iterator<f360> it8 = ((r9e0) obj3).d.iterator();
                while (it8.hasNext()) {
                    it8.next().p(dVar, aVar10);
                }
                return s3q0.a;
            case 25:
                StickerStockItem stickerStockItem2 = (StickerStockItem) obj3;
                s3l0 s3l0Var = (s3l0) obj2;
                if (!((StickersUnSubscribePackAuthorResponseDto) obj).d().U()) {
                    stickerStockItem2.S = Boolean.FALSE;
                    d790 d790Var = s3l0Var.d;
                    s3l0Var.z(d790Var != null ? d790Var : null, false);
                    y9l0.a(new o690(false));
                    s3l0Var.b.ko(false);
                }
                return s3q0.a;
            case 26:
                mh4 mh4Var = (mh4) obj2;
                brj0 brj0Var = (brj0) obj;
                dw20 dw20Var = ((StickerSettingsRouter) obj3).b;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                int i18 = brj0Var.a;
                if (i18 == 0) {
                    mh4Var.invoke(StickerSettingsRouter.VmojiMenuButton.EDIT);
                } else if (i18 == 1) {
                    mh4Var.invoke(StickerSettingsRouter.VmojiMenuButton.SHOW);
                } else if (i18 == 2) {
                    mh4Var.invoke(StickerSettingsRouter.VmojiMenuButton.HIDE);
                }
                return s3q0.a;
            case 27:
                vcn0 vcn0Var = (vcn0) obj3;
                vcn0Var.r.P4(vcn0.g6(vcn0Var.itemView.getContext(), ((wcn0) obj2).h.o, true));
                return s3q0.a;
            case 28:
                com.vk.im.ui.components.theme_chooser.b bVar5 = (com.vk.im.ui.components.theme_chooser.b) obj3;
                List list8 = (List) obj2;
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                String str6 = themeChooserState.c;
                String Y0 = (themeChooserState.f.isEmpty() || themeChooserState.h.isEmpty()) ? com.vk.im.ui.components.theme_chooser.b.Y0(themeChooserState.b, list8) : str6;
                ThemeChooserState a6 = ThemeChooserState.a(themeChooserState, null, null, Y0, null, false, null, null, list8, 123);
                if (Y0 != str6) {
                    bVar5.o.a(a6);
                }
                return a6;
            default:
                ((izs) obj3).invoke(new wqs0.g((BlockId.CompositeId) obj2, (rmw.e) obj));
                return s3q0.a;
        }
    }
}
