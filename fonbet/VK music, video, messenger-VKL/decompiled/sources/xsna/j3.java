package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.core.snackbar.HideReason;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.search.ExpandableActionVkSearchView;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.impl.catalog.SearchGroupsFeatureCatalogFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStop$Response;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.permissions.PictureInPicturePermissionFragment;
import com.vkontakte.android.R;
import java.util.Collection;
import kotlin.Pair;
import xsna.eeh;
import xsna.egm;
import xsna.q610;
import xsna.sx40;
import xsna.u0;
import xsna.u4a;
import xsna.vmu;
import xsna.vp1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 bannerLeftApplication$lambda$4;
        Intent intent;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                izsVar.invoke(u0.d.b);
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                break;
            case 1:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.c;
                Collection<CallMemberId> collection = (Collection) this.d;
                accessibilityEvents.c("usersStopRecording(" + collection.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.RECORD_STOPPED, AccessibilityEvents.Event.RECORD_STARTED, collection);
                break;
            case 2:
                ((cq1) this.c).C(new vp1.b((PhotoAlbum) this.d));
                break;
            case 3:
                mc90 mc90Var = (mc90) this.c;
                bc90 bc90Var = (bc90) this.d;
                break;
            case 4:
                qr6 qr6Var = (qr6) this.c;
                String str = (String) this.d;
                StringBuilder sb = new StringBuilder("UPLOAD_TRACE doUpload: starting upload for attach ");
                jax0.a(qr6Var.o, ", uploadUrl=", str, ", sessionId=", sb);
                ResumableAttachUploadInfo resumableAttachUploadInfo = qr6Var.p;
                sb.append((resumableAttachUploadInfo != null ? resumableAttachUploadInfo : null).k());
                break;
            case 5:
                break;
            case 6:
                ((d3h) this.c).i((String) this.d);
                break;
            case 7:
                ((eeh.b) this.c).n.invoke(((e11) this.d).c);
                break;
            case 8:
                utj utjVar = (utj) this.c;
                HideReason hideReason = (HideReason) this.d;
                Object obj = flv0.a;
                flv0.d(utjVar.r);
                izs<? super HideReason, s3q0> izsVar2 = utjVar.p;
                if (izsVar2 != null) {
                    izsVar2.invoke(hideReason);
                }
                utjVar.n = null;
                utjVar.d();
                break;
            case 9:
                hgm hgmVar = (hgm) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_error_circle_12), Integer.valueOf(R.attr.vk_ui_icon_negative));
                omw.d(vkImageSimple, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vkImageSimple.setContentDescription(null);
                egm.b bVar = hgmVar.m;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).h, 0, 0, 0, 56));
                viewGroup.addView(vkImageSimple);
                break;
            case 10:
                com.vk.notifications.dnd.impl.a aVar = (com.vk.notifications.dnd.impl.a) this.c;
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.d;
                aVar.b.onNext(Boolean.FALSE);
                rVar.onError(new Throwable());
                break;
            case 11:
                n8q n8qVar = (n8q) this.c;
                MenuItem menuItem = (MenuItem) this.d;
                n8qVar.f.setBackground(null);
                ExpandableActionVkSearchView expandableActionVkSearchView = n8qVar.e;
                expandableActionVkSearchView.setExpandFractionListener(null);
                menuItem.collapseActionView();
                mhy.b(expandableActionVkSearchView.getContext());
                break;
            case 12:
                GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = (GlobalSearchGroupsCatalogRootVh) this.c;
                VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) this.d;
                bpn0 bpn0Var = globalSearchGroupsCatalogRootVh.z;
                SearchGroupsFeatureCatalogFragment searchGroupsFeatureCatalogFragment = globalSearchGroupsCatalogRootVh.u;
                Activity activity = globalSearchGroupsCatalogRootVh.b;
                if (((Boolean) bpn0Var.getValue()).booleanValue()) {
                    ((xsh0) globalSearchGroupsCatalogRootVh.A.getValue()).a(activity.getBaseContext(), searchGroupsFeatureCatalogFragment.getChildFragmentManager(), vkGroupsSearchParams);
                } else {
                    xg5.a().c(activity, searchGroupsFeatureCatalogFragment.getChildFragmentManager(), vkGroupsSearchParams);
                }
                break;
            case 13:
                izs izsVar3 = (izs) this.c;
                umu umuVar = (umu) this.d;
                izsVar3.invoke(vmu.a.b);
                umuVar.getClass();
                break;
            case 14:
                c1y c1yVar = (c1y) this.c;
                String str2 = (String) this.d;
                try {
                    io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) c1yVar.a;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    c1yVar.a = null;
                    com.vk.superapp.base.js.bridge.b.p(c1yVar.b.a, new JsMethod("VKWebAppAccelerometerStop"), new AccelerometerStop$Response(null, new AccelerometerStop$Response.Data(true, str2), str2, 1, null), null, null, false, null, 60);
                } catch (Throwable th) {
                    c1yVar.c.b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str2, 1, null));
                }
                break;
            case 15:
                bannerLeftApplication$lambda$4 = LegacyShowUseCase.bannerLeftApplication$lambda$4((Listeners) this.c, (String) this.d);
                break;
            case 16:
                izs izsVar4 = (izs) this.c;
                u710 u710Var = (u710) this.d;
                izsVar4.invoke(new q610.a(u710Var.d, u710Var.c, 0, true, false, 4));
                break;
            case 17:
                WebApiApplication webApiApplication = (WebApiApplication) this.c;
                com.vk.superapp.pip.impl.overlay.b bVar2 = (com.vk.superapp.pip.impl.overlay.b) this.d;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null && (intent = b.getIntent()) != null) {
                    intent.addFlags(805306368);
                    bVar2.a.startActivity(intent);
                }
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                Activity b2 = c63.b();
                String str3 = webApiApplication.D;
                if (str3 == null) {
                    str3 = "";
                }
                SuperappUiRouterBridge.b.b(superappUiRouterBridge2, b2, webApiApplication, new nex0(str3, "https://" + a0a.d + "/app" + webApiApplication.b), null, null, null, null, 248);
                com.vk.superapp.pip.impl.overlay.b.c(SchemeStat$TypeMiniAppItem.Type.PIP_EXPAND, webApiApplication.b);
                break;
            case 18:
                ((RecyclerView) this.c).post(new d0((com.vk.movika.sdk.base.logic.processor.actions.e) this.d, 8));
                break;
            case 19:
                break;
            case 20:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                kbj0 kbj0Var = (kbj0) this.d;
                ?? r2 = musicArtistCatalogRootVh.u;
                zc40 zc40Var = (zc40) r2.getValue();
                u4a u4aVar = musicArtistCatalogRootVh.m;
                if (zc40Var != null && musicArtistCatalogRootVh.p) {
                    u4a.a aVar2 = u4aVar.b;
                    break;
                }
                break;
            case 21:
                d5 d5Var = (d5) this.c;
                PictureInPicturePermissionFragment pictureInPicturePermissionFragment = (PictureInPicturePermissionFragment) this.d;
                int i = PictureInPicturePermissionFragment.S;
                d5Var.invoke();
                pictureInPicturePermissionFragment.tn();
                break;
            case 22:
                View view = (View) this.d;
                izs izsVar5 = (izs) this.c;
                cl40.a(view, MusicHapticEvent.LIGHT);
                izsVar5.invoke(new sx40.h0(PlayerContext.FULL));
                break;
            case 23:
                Context context = (Context) this.c;
                hqc0 hqc0Var = (hqc0) this.d;
                new ProfileFriendsFragment.a(FriendsListParams.BestFriendsList.b, FriendsListPrivacyType.POST, null, null, false, 60).k(context);
                ((jbc0) hqc0Var.b.getValue()).a(MobileOfficialAppsCoreNavStat$EventScreen.POSTING);
                break;
            case 24:
                ((uhj0) this.c).e0((com.vkontakte.android.actionlinks.a) this.d);
                break;
            case 25:
                arl0 arl0Var = (arl0) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                arl0Var.t.b();
                mzp0 mzp0Var = arl0Var.G;
                if (mzp0Var != null) {
                    mzp0Var.e(recyclerView);
                }
                break;
            case 26:
                ((izs) this.c).invoke((AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget) this.d);
                break;
            case 27:
                ((izs) this.c).invoke(((fze) this.d).a);
                break;
            default:
                com.vk.libvideo.autoplay.background.controller.e eVar = (com.vk.libvideo.autoplay.background.controller.e) this.c;
                yg5 yg5Var = (yg5) this.d;
                eVar.getClass();
                if (!yg5Var.A().W9()) {
                    eVar.D();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j3(View view, izs izsVar) {
        this.b = 22;
        this.d = view;
        this.c = izsVar;
    }
}
