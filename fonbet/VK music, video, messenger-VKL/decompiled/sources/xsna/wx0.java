package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cameraui.widgets.CameraGridView;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogBannerVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookOfflineVh;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.polls.Poll;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.api.menu.PodcastMenuItem;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bsd0;
import xsna.f3u0;
import xsna.vx70;
import xsna.wqs0;
import xsna.xn60;
import xsna.yo60;
import xsna.zm30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wx0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wx0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c5, code lost:
    
        if (xsna.drm0.e0(r1, r7) != false) goto L106;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        String str;
        s3q0 loadSuccess$lambda$2;
        int i = this.b;
        com.vk.im.ui.components.viewcontrollers.msg_list_empty.b kVar = null;
        boolean z = true;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return new fot((Context) obj3, new my0(((com.vk.clips.sdk.shared.item.ads.c) obj2).B), null);
            case 1:
                AudioBookOfflineVh audioBookOfflineVh = (AudioBookOfflineVh) obj3;
                AudioBook audioBook = (AudioBook) obj2;
                VkRichCell vkRichCell = audioBookOfflineVh.d;
                if (vkRichCell == null) {
                    vkRichCell = null;
                }
                Activity b = enj.b(vkRichCell);
                if (b != null) {
                    ic40 w = audioBookOfflineVh.b.w();
                    AudioBookBottomSheetLaunchPoint.AudioBookListPoint.AudioBookOfflineList audioBookOfflineList = new AudioBookBottomSheetLaunchPoint.AudioBookListPoint.AudioBookOfflineList(audioBook.b, audioBook.r, audioBook.t);
                    UIBlockAudioBookItem uIBlockAudioBookItem = audioBookOfflineVh.c;
                    w.o(b, audioBook, audioBookOfflineList, MusicPlaybackLaunchContext.Fb(uIBlockAudioBookItem != null ? uIBlockAudioBookItem.f : null), false);
                }
                return s3q0.a;
            case 2:
                CameraUIView cameraUIView = (CameraUIView) obj3;
                CameraGridView cameraGridView = (CameraGridView) obj2;
                float f = CameraUIView.w1;
                iz8 Q = cameraUIView.Q(false);
                f4m.t((int) Q.c, cameraGridView);
                float a = Q.a();
                float f2 = cameraUIView.A;
                if (a <= f2) {
                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                f4m.q((int) f2, cameraGridView);
                return s3q0.a;
            case 3:
                CatalogBannerVh catalogBannerVh = (CatalogBannerVh) obj3;
                catalogBannerVh.f.k();
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) ((UIBlock) obj2);
                Iterator<T> it = uIBlockPlaceholder.G.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (obj instanceof UIBlockHideBlockButton) {
                        }
                    } else {
                        obj = null;
                    }
                }
                if (!(obj instanceof UIBlockHideBlockButton)) {
                    obj = null;
                }
                UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) obj;
                if (uIBlockHideBlockButton != null && (str = uIBlockHideBlockButton.A) != null) {
                    itg0.k(rsg0.W(yfb.x(catalogBannerVh.b.m(str, null)), 7), null, null, 3);
                }
                catalogBannerVh.c.b(new xxf0(uIBlockPlaceholder.z), false);
                catalogBannerVh.d.c(null);
                return s3q0.a;
            case 4:
                ((k530) ((qkc) obj2).k.getValue()).a((Context) obj3, false);
                return s3q0.a;
            case 5:
                ((d3h) obj3).i((String) obj2);
                return s3q0.a;
            case 6:
                cih cihVar = (cih) obj3;
                return new ofh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) obj2, false);
            case 7:
                ((com.vk.profile.community.impl.ui.profile.actions.e) obj3).b.i(((d.b.c) ((d.b) obj2)).a);
                return s3q0.a;
            case 8:
                ((oaj) obj3).l.w((t8j) obj2, true);
                return s3q0.a;
            case 9:
                nyu nyuVar = (nyu) obj3;
                RectF o = zjq.o(nyuVar.getTitleRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                List<String> list = ((VkMediaPicker.a) obj2).a;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                nyuVar.getContext();
                e.c cVar = new e.c(null, rect, nyuVar, l, 1);
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                int i2 = 0;
                for (Object obj4 : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList.add(new VkContextMenu.a((String) obj4, null, null, false, false, new k44(nyuVar, i2, true ? 1 : 0), 30));
                    i2 = i3;
                }
                cVar.h(arrayList);
                cVar.m = cn70.b(8);
                cVar.e = nyuVar.getContext();
                cVar.l(false);
                return s3q0.a;
            case 10:
                ukv ukvVar = (ukv) obj3;
                mkx mkxVar = ukvVar.b;
                tkv tkvVar = ukvVar.c;
                vx70.a aVar = (vx70.a) vhk0.h(mkxVar.j, "OkHttpExecutor", new gom(ukvVar.e, mkxVar, new qob(tkvVar), 2), 4);
                a9v.b((zqa) obj2, aVar.b, a9v.a(tkvVar.a));
                return aVar;
            case 11:
                loadSuccess$lambda$2 = LegacyLoadUseCase.loadSuccess$lambda$2((LegacyLoadUseCase) obj3, (AdObject) obj2);
                return loadSuccess$lambda$2;
            case 12:
                bpn0 bpn0Var = (bpn0) obj3;
                String str2 = (String) obj2;
                if (qu20.b((CharSequence) bpn0Var.getValue())) {
                    CharSequence subSequence = ((CharSequence) bpn0Var.getValue()).subSequence(1, ((CharSequence) bpn0Var.getValue()).length());
                    boolean b2 = qu20.b(str2);
                    CharSequence charSequence = str2;
                    if (b2) {
                        charSequence = str2.subSequence(1, str2.length());
                    }
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 13:
                DialogTheme dialogTheme = (DialogTheme) obj2;
                tk30 tk30Var = ((com.vk.im.ui.components.msg_list.c) obj3).o.d;
                tk30Var.x(dialogTheme);
                tk30Var.C(dialogTheme.b.a() && c4g0.w(dialogTheme));
                return s3q0.a;
            case 14:
                zm30 zm30Var = (zm30) obj3;
                User user = (User) obj2;
                zm30Var.getClass();
                int i4 = user.z;
                SocialButtonType socialButtonType = user.R;
                if (e43.l(0, 2).contains(Integer.valueOf(i4))) {
                    int i5 = zm30.a.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                    if (i5 == 1) {
                        kVar = new b.a(user, FriendsAddApiCmd.Source.IM, FriendsAddApiCmd.BlockType.PRIVATE_USER_BUTTON);
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kVar = new b.c(user, FriendsAddApiCmd.Source.IM, FriendsAddApiCmd.BlockType.PRIVATE_USER_BUTTON);
                    }
                } else if (e43.l(1, 3).contains(Integer.valueOf(i4))) {
                    int i6 = zm30.a.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                    if (i6 == 1) {
                        kVar = new b.k(user);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kVar = new b.m(user);
                    }
                }
                if (kVar != null) {
                    zm30Var.a.a(kVar);
                }
                return s3q0.a;
            case 15:
                ((wo60) obj3).a.a(new xn60.b.g(((yo60.e.i) obj2).a));
                return s3q0.a;
            case 16:
                ((wh50) obj2).setValue(Boolean.valueOf(ub70.e((Activity) obj3)));
                return s3q0.a;
            case 17:
                VkTopBar vkTopBar = (VkTopBar) obj3;
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) obj2;
                int i7 = PodcastEpisodeFragment.u0;
                Rect n = zjq.n(vkTopBar.getRightMainRect());
                int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                vkTopBar.getContext();
                e.c cVar2 = new e.c(null, n, vkTopBar, l2, 1);
                Iterator<PodcastMenuItem> it2 = podcastEpisodeFragment.Z.iterator();
                while (it2.hasNext()) {
                    PodcastMenuItem next = it2.next();
                    if (podcastEpisodeFragment.a0.contains(next)) {
                        switch (PodcastEpisodeFragment.b.$EnumSwitchMapping$0[next.ordinal()]) {
                            case 1:
                                s3q0 s3q0Var = s3q0.a;
                                break;
                            case 2:
                                VkContextMenu.c.c(cVar2, R.string.podcasts_goto_post, null, false, null, new y1i(podcastEpisodeFragment), 30);
                                break;
                            case 3:
                                VkContextMenu.c.c(cVar2, R.string.podcast_page_go_to_author, null, false, null, new vgb0(podcastEpisodeFragment), 30);
                                break;
                            case 4:
                                VkContextMenu.c.c(cVar2, R.string.podcast_page_subscribe_to_author, null, false, null, new orf(podcastEpisodeFragment), 30);
                                break;
                            case 5:
                                VkContextMenu.c.c(cVar2, R.string.share, null, false, null, new prf(podcastEpisodeFragment), 30);
                                break;
                            case 6:
                                VkContextMenu.c.c(cVar2, R.string.copy_link, null, false, null, new qyt(podcastEpisodeFragment), 30);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                cVar2.j();
                return s3q0.a;
            case 18:
                hpb0 hpb0Var = (hpb0) obj2;
                long j = ((Poll) obj3).k;
                Long valueOf = hpb0Var.o().b.isChecked() ? Long.valueOf(hpb0Var.p().getUnixTime()) : null;
                if (valueOf == null) {
                    valueOf = 0L;
                }
                return Boolean.valueOf(j != valueOf.longValue());
            case 19:
                ((yh1) obj3).a((lm50) obj2);
                return s3q0.a;
            case 20:
                iai0 iai0Var = (iai0) obj3;
                kei0 kei0Var = ((lei0) obj2).b;
                q530 q530Var = iai0Var.m;
                if (!(BuildInfo.q() ? false : q530Var.b(kei0Var.d, q530Var.a(kei0Var.d)))) {
                    iai0Var.l.a(new bsd0.b(kei0Var.a));
                }
                return s3q0.a;
            case 21:
                ((izs) obj3).invoke(Boolean.valueOf(!((zzi0) obj2).c));
                return s3q0.a;
            case 22:
                rlq0 rlq0Var = (rlq0) obj3;
                rlq0Var.d((ExtendedUserProfile) obj2);
                rlq0Var.f.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FRIEND_OUT);
                return s3q0.a;
            case 23:
                ((qvm0) obj3).invoke((f3u0.b) obj2);
                return s3q0.a;
            case 24:
                ((izs) obj3).invoke(new wqs0.f.c((BlockId.CompositeId) obj2));
                return s3q0.a;
            case 25:
                return new bd7(((nat0) obj3).f, ((csp) obj2).d);
            case 26:
                View view = (View) obj2;
                ((f9h) obj3).invoke(Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight()));
                return s3q0.a;
            case 27:
                Throwable th = (Throwable) obj2;
                Iterator<T> it3 = ((VkMainTracker) obj3).p().iterator();
                while (it3.hasNext()) {
                    ((ohp0) it3.next()).a(th);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            default:
                myc0.h((yvj) obj3, null, null, new ztv0((fuv0) obj2, null), 3);
                return s3q0.a;
        }
    }

    public /* synthetic */ wx0(String str, qu20 qu20Var, bpn0 bpn0Var) {
        this.b = 12;
        this.c = bpn0Var;
        this.d = str;
    }

    public /* synthetic */ wx0(qkc qkcVar, Context context) {
        this.b = 4;
        this.d = qkcVar;
        this.c = context;
    }
}
