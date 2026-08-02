package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.facebook.common.internal.ImmutableMap;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.clips.design.view.floatingbutton.FloatingButtonView;
import com.vk.clips.edit.impl.deps.features.ClipEditVkFeatures;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStart$Response;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.ok.android.externcalls.sdk.ml.delegate.NSFeatureDelegate;
import xsna.b78;
import xsna.hc50;
import xsna.rv9;
import xsna.sx40;
import xsna.t44;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ww implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ww(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        Float d;
        NSFeatureDelegate nsFeatureDelegate_delegate$lambda$0;
        ProfilesSimpleInfo a;
        qtd0 zb;
        PostingAction postingAction;
        boolean z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                ActionButton actionButton = (ActionButton) ((wh50) this.d).getValue();
                if (actionButton != null) {
                    izsVar.invoke(actionButton);
                }
                return s3q0.a;
            case 1:
                uc2 uc2Var = (uc2) this.c;
                wco0 wco0Var = (wco0) this.d;
                tny invoke = uc2Var.c.invoke();
                tny tnyVar = invoke.e() ? invoke : null;
                return tnyVar == null ? zhf0.e : wco0Var.K1(tnyVar).j(tnyVar.D(0L));
            case 2:
                ((izs) this.c).invoke(((AudioBookChapter) this.d).b);
                return s3q0.a;
            case 3:
                ((izs) this.c).invoke(new rv9.a.d(((CartItem.b) this.d).c));
                return s3q0.a;
            case 4:
                ((izs) this.c).invoke(new rv9.e(((CartItem.c.b.C0921b) this.d).g));
                return s3q0.a;
            case 5:
                ((cxb) this.c).x.a((DialogMember) this.d);
                return s3q0.a;
            case 6:
                ((izs) this.c).invoke(new t44.c.a(((kfd) this.d).a));
                return s3q0.a;
            case 7:
                uvd uvdVar = (uvd) this.c;
                Set set = (Set) this.d;
                nne nneVar = (nne) uvdVar.b.getValue();
                if (!set.contains(ClipEditVkFeatures.All) && !set.contains(ClipEditVkFeatures.Ord)) {
                    z = false;
                }
                return new kvd(nneVar, z);
            case 8:
                ComposeHeaderVh composeHeaderVh = (ComposeHeaderVh) this.c;
                UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) this.d;
                qcy<Object>[] qcyVarArr = ComposeHeaderVh.n;
                VkGroupHeader a2 = composeHeaderVh.a();
                Rect rect = new Rect();
                composeHeaderVh.a().getGlobalVisibleRect(rect);
                int a3 = iah0.a(24);
                int a4 = iah0.a(22);
                int i2 = (rect.right - a3) - a4;
                int height = ((rect.height() - a3) / 2) + rect.top;
                int i3 = rect.right - a4;
                int height2 = rect.bottom - ((rect.height() - a3) / 2);
                if (i2 <= i3 && height <= height2) {
                    rect = new Rect(i2, height, i3, height2);
                }
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                a2.getContext();
                e.c cVar = new e.c(null, rect, a2, l, 1);
                VkContextMenu.c.c(cVar, R.string.video_catalog_hide_block, null, false, null, new com.vk.catalog2.common.ui.holders.a(i, composeHeaderVh, uIBlockHideBlockButton), 28);
                cVar.j();
                return s3q0.a;
            case 9:
                gbn gbnVar = (gbn) this.c;
                hbn hbnVar = (hbn) this.d;
                r3q r3qVar = hbnVar.c;
                evb0 evb0Var = hbnVar.b;
                Map map = (Map) gbnVar.e.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new ym8((y7r) entry.getValue(), evb0Var.b(hbnVar.e), evb0Var.c(), r3qVar.b(), r3qVar.c(), hbnVar.d));
                }
                return new ImmutableMap(linkedHashMap);
            case 10:
                gzs gzsVar = (gzs) this.c;
                b7q b7qVar = (b7q) this.d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                b7qVar.f = false;
                b7qVar.k();
                return s3q0.a;
            case 11:
                ((FriendsItemSearchListVh) this.c).b((UIBlockProfile) this.d);
                return s3q0.a;
            case 12:
                DeviceMotionStart$Parameters deviceMotionStart$Parameters = (DeviceMotionStart$Parameters) this.c;
                e4y e4yVar = (e4y) this.d;
                svp svpVar = e4yVar.c;
                String e = deviceMotionStart$Parameters != null ? deviceMotionStart$Parameters.e() : null;
                try {
                    context = ((x6y) e4yVar.d.c).l;
                } catch (Throwable th) {
                    svpVar.f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), e, 1, null));
                }
                if (context == null) {
                    throw new IllegalStateException("The bridge has no context");
                }
                if (!uvg0.a(1, context) || !uvg0.a(2, context)) {
                    svpVar.f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), e, 1, null));
                    return s3q0.a;
                }
                Integer valueOf = (deviceMotionStart$Parameters == null || (d = deviceMotionStart$Parameters.d()) == null) ? null : Integer.valueOf((int) d.floatValue());
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if ((20 <= intValue && intValue < 1001) == false) {
                        svpVar.f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), e, 1, null));
                        return s3q0.a;
                    }
                }
                e4yVar.t(context, valueOf, new mq2(6), new jp5(15, e4yVar, e));
                com.vk.superapp.base.js.bridge.b.p(e4yVar.b.a, new JsMethod("VKWebAppDeviceMotionStart"), new DeviceMotionStart$Response(null, new DeviceMotionStart$Response.Data(true, e), e, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 13:
                nsFeatureDelegate_delegate$lambda$0 = MLFeaturesManagerImpl.nsFeatureDelegate_delegate$lambda$0((MLFeaturesManagerImpl) this.c, (RemoteSettings) this.d);
                return nsFeatureDelegate_delegate$lambda$0;
            case 14:
                uk30 uk30Var = (uk30) this.c;
                Attach attach = (Attach) this.d;
                rxd0 rxd0Var = uk30Var.S;
                return (rxd0Var == null || (a = rxd0Var.a()) == null || (zb = a.zb(com.vk.dto.common.a.a(attach.q()))) == null) ? uk30Var.e.Bb(com.vk.dto.common.a.a(attach.q())) : zb;
            case 15:
                z5a z5aVar = (z5a) this.c;
                FloatingButtonView floatingButtonView = (FloatingButtonView) this.d;
                MusicClipsSelectorCatalogRootVh.a aVar = MusicClipsSelectorCatalogRootVh.J;
                z5aVar.invoke(floatingButtonView);
                return s3q0.a;
            case 16:
                b78 b78Var = (b78) this.c;
                vtu vtuVar = (vtu) this.d;
                if (!(b78Var instanceof b78.f)) {
                    vtuVar.a(0);
                    b78Var.a().invoke(new sx40.t(PlayerContext.MINI_STANDALONE, null));
                }
                return s3q0.a;
            case 17:
                jz50 jz50Var = (jz50) this.c;
                jz50Var.b.i0.getDependencies().f.Q(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, jz50Var.b.i0.getViewEntryPoint(), (StoryEntry) this.d, jz50Var.b.i0.P0());
                return s3q0.a;
            case 18:
                ubb0 ubb0Var = (ubb0) this.c;
                UserId userId = (UserId) this.d;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.i, new Object[]{"OfflineDbConn", efz.b(userId.b, " query playlists", new StringBuilder("uid="))});
                }
                List<uab0> l3 = ubb0Var.c.l(String.valueOf(userId.b));
                ArrayList arrayList = new ArrayList(c5g.u(l3, 10));
                for (uab0 uab0Var : l3) {
                    Playlist playlist = new Playlist(new JSONObject(uab0Var.e));
                    playlist.H = uab0Var.d;
                    arrayList.add(playlist);
                }
                return arrayList;
            case 19:
                w3c0 w3c0Var = (w3c0) this.c;
                w3c0Var.D.sa(new NewsfeedExternalAction.c.a.C1438c(w3c0Var.itemView.getContext(), (NewsEntry) this.d, w3c0Var.u, MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_MODAL_PHOTO, w3c0.e7(w3c0Var.J)));
                return s3q0.a;
            case 20:
                u6c0 u6c0Var = (u6c0) this.c;
                s6c0 s6c0Var = (s6c0) this.d;
                u6c0.a(u6c0Var, 5);
                q9q0 q9q0Var = (q9q0) u6c0Var.h.getValue();
                bp7 bp7Var = new bp7(29, u6c0Var, s6c0Var);
                com.vk.movika.sdk.base.ui.r rVar = new com.vk.movika.sdk.base.ui.r(13, u6c0Var, s6c0Var);
                synchronized (q9q0Var) {
                    n9q0 n9q0Var = new n9q0(o25.a().c());
                    if (o25.a().b() && q9q0Var.b == null) {
                        q9q0Var.b = vre0.e((vre0) q9q0Var.c.getValue(), n9q0Var, "wallpost_upload_attachment", new mll0(rVar, 8), new pod0(bp7Var, 18), null, null, 100);
                    }
                }
                return s3q0.a;
            case 21:
                Pair pair = (Pair) this.d;
                izs izsVar2 = (izs) this.c;
                if (pair != null && (postingAction = (PostingAction) pair.j()) != null) {
                    izsVar2.invoke(postingAction);
                }
                return s3q0.a;
            case 22:
                List<hc50> v = ((qgp0) this.c).b.v(String.valueOf(((UserId) this.d).b));
                ArrayList arrayList2 = new ArrayList(c5g.u(v, 10));
                Iterator<T> it = v.iterator();
                while (it.hasNext()) {
                    arrayList2.add(hc50.a.a((hc50) it.next()));
                }
                return arrayList2;
            case 23:
                Context context2 = (Context) this.c;
                VideoItemListLargeVh videoItemListLargeVh = (VideoItemListLargeVh) this.d;
                VideoAutoPlaySeekBarLayout2 videoAutoPlaySeekBarLayout2 = new VideoAutoPlaySeekBarLayout2(context2, null, 0, 14, 0);
                videoAutoPlaySeekBarLayout2.setImageLoader(new jl80());
                videoAutoPlaySeekBarLayout2.setSeekArea(VideoAutoPlaySeekBarLayout2.SeekArea.Large);
                bwt0.d0(videoAutoPlaySeekBarLayout2, true);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                VideoTextureView videoTextureView = videoItemListLargeVh.H;
                if (videoTextureView == null) {
                    videoTextureView = null;
                }
                if (videoTextureView.isLaidOut()) {
                    VideoItemListLargeVh.j(videoItemListLargeVh, iArr, iArr2, videoAutoPlaySeekBarLayout2);
                }
                VideoTextureView videoTextureView2 = videoItemListLargeVh.H;
                bwt0.h(videoTextureView2 != null ? videoTextureView2 : null, new ura(videoItemListLargeVh, iArr, iArr2, videoAutoPlaySeekBarLayout2, 3));
                return videoAutoPlaySeekBarLayout2;
            case 24:
                ((izs) this.c).invoke(new wqs0.e((BlockId.CompositeId) this.d));
                return s3q0.a;
            default:
                View view = (View) this.c;
                VkFormField vkFormField = (VkFormField) this.d;
                List<Class<? extends View>> list = VkFormField.C;
                if (view instanceof q80) {
                    vkFormField.f();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ww(Pair pair, izs izsVar) {
        this.b = 21;
        this.d = pair;
        this.c = izsVar;
    }
}
