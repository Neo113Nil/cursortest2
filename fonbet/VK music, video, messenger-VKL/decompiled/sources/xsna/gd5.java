package xsna;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.ComposeHeaderClearBlocksVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistToolbarVh;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.instantjobs.InstantJob;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.lists.DefaultErrorView;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gd5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gd5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v17 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 1;
        r5 = null;
        h9x h9xVar = null;
        boolean z = false;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                UserId userId = (UserId) obj4;
                jd5 jd5Var = (jd5) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                Boolean bool = (Boolean) obj;
                if (!epx.f(bool, Boolean.TRUE)) {
                    if (epx.f(bool, Boolean.FALSE)) {
                        return io.reactivex.rxjava3.core.q.T(AboutVideoItem.d.b.C1214b.a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!fkq0.b(userId)) {
                    return io.reactivex.rxjava3.core.q.T(com.vk.libvideo.bottomsheet.about.delegate.p.a);
                }
                io.reactivex.rxjava3.core.q<VideoNotificationsStatus> d = jd5Var.a.d(userId);
                VideoNotificationsStatus o8 = videoFile.o8();
                if (o8 == null) {
                    o8 = VideoNotificationsStatus.PREFERRED;
                }
                return d.n0(io.reactivex.rxjava3.core.q.T(o8)).U(new q9(new cj1(1), i2));
            case 1:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Fragment fragment = (Fragment) obj;
                String b = str != null ? air.b('&', "aid=", str) : "";
                StringBuilder sb = new StringBuilder("vkpay&hash=");
                StringBuilder b2 = ho8.b(b, "action=");
                if (str2 == null) {
                    str2 = "";
                }
                b2.append(str2);
                if (str3 == null) {
                    str3 = "";
                }
                b2.append(str3);
                sb.append(Uri.encode(b2.toString()));
                String sb2 = sb.toString();
                Bundle bundle = new Bundle();
                long j = InternalMiniApps.VK_PAY.h().a;
                wdx0 wdx0Var = e370.f;
                String j2 = (wdx0Var != null ? wdx0Var : null).h().j();
                if (sb2 == null || sb2.length() == 0) {
                    sb2 = j2;
                } else if (brm0.B(sb2, "vkpay", false)) {
                    sb2 = Uri.parse(brm0.A(sb2, "vkpay", j2)).buildUpon().toString();
                }
                if (j != 0) {
                    bundle.putString("key_url", sb2);
                    bundle.putLong("key_application_id", j);
                } else {
                    bundle.putString("key_url", sb2);
                    InternalMiniApps.Companion.getClass();
                    bundle.putLong("key_application_id", InternalMiniApps.VK_PAY_OLD.h().a);
                }
                bundle.putBoolean("for_result", true);
                int i3 = VkDelegatingActivity.f;
                VkDelegatingActivity.a.a(fragment, VkBrowserActivity.class, ker0.class, bundle, 104);
                return s3q0.a;
            case 2:
                String str4 = (String) obj3;
                izs izsVar = (izs) obj2;
                Name name = ((mdz) obj).b;
                return epx.f(name, obj4) ? str4 : (String) izsVar.invoke(name);
            case 3:
                int i4 = ClipsFavoriteFoldersListFragment.U;
                ((SwipeRefreshLayout) obj4).setVisibility(8);
                ((ProgressBar) obj3).setVisibility(8);
                ((DefaultErrorView) obj2).setVisibility(0);
                return s3q0.a;
            case 4:
                nye.l((sxe) obj, (izs) obj4, (hud0) ((List) obj3).get(((rg50) obj2).getIntValue()));
                return s3q0.a;
            case 5:
                ComposeHeaderClearBlocksVh composeHeaderClearBlocksVh = (ComposeHeaderClearBlocksVh) obj3;
                UIBlockActionClearRecent uIBlockActionClearRecent = (UIBlockActionClearRecent) obj2;
                int i5 = ComposeHeaderClearBlocksVh.r;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj4).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                composeHeaderClearBlocksVh.d(uIBlockActionClearRecent);
                return s3q0.a;
            case 6:
                klr klrVar = (klr) obj4;
                List list = (List) obj;
                ((StoryViewerRouter) klrVar.a0.getValue()).h((Activity) obj3, list, ((StoriesContainer) list.get(0)).Ob(), null, (r42 & 16) != 0, MobileOfficialAppsConStoriesStat$ViewEntryPoint.COMMENT_AVATAR, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, klrVar.X, null, (r42 & 512) != 0 ? null : null, new q40((View) obj2, 26), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
                return s3q0.a;
            case 7:
                PostingUserMessageButton postingUserMessageButton = (PostingUserMessageButton) obj4;
                PostingAction postingAction = (PostingAction) obj3;
                ud20 ud20Var = (ud20) obj2;
                ikv0 ikv0Var = (ikv0) obj;
                boolean z2 = postingUserMessageButton.e;
                PostingAction postingAction2 = postingUserMessageButton.c;
                if (z2) {
                    postingAction2 = com.vk.newsfeed.posting.impl.domain.model.d.a(postingAction, postingAction2);
                }
                if (postingAction2 != null) {
                    ud20Var.a.invoke(postingAction2);
                }
                ikv0Var.a();
                return s3q0.a;
            case 8:
                final m2g0 m2g0Var = (m2g0) obj2;
                return new j4g0(new eig0() { // from class: xsna.p2g0
                    @Override // xsna.eig0
                    public final void a(Object obj5) {
                        t2g0 b3 = a3g0.b((d4g0) obj5);
                        if (b3 != null) {
                            m2g0.this.a(b3);
                        }
                    }
                }, (ViewGroup) obj, (bbb0) obj4, (fa60) obj3, 32);
            case 9:
                vyi0 vyi0Var = (vyi0) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                InstantJob instantJob = (InstantJob) obj;
                boolean z3 = instantJob instanceof aii0;
                aii0 aii0Var = z3 ? (aii0) instantJob : null;
                if (aii0Var != null && aii0Var.e == vyi0Var.d) {
                    z = true;
                }
                if (z) {
                    aii0 aii0Var2 = z3 ? (aii0) instantJob : null;
                    ref$ObjectRef.element = aii0Var2 != null ? aii0Var2.g : 0;
                    ref$BooleanRef.element = true;
                }
                return Boolean.valueOf(z);
            case 10:
                VideoAlbum videoAlbum = (VideoAlbum) obj4;
                VideoPlaylistToolbarVh videoPlaylistToolbarVh = (VideoPlaylistToolbarVh) obj3;
                videoPlaylistToolbarVh.c.a(new cfp0((UIBlockVideoAlbum) obj2, new VideoAlbumAnalyticsInfo(videoAlbum.l ? VideoAlbumAnalyticsInfo.ClickTarget.Unsubscribe : VideoAlbumAnalyticsInfo.ClickTarget.Subscribe, null)));
                videoPlaylistToolbarVh.e.c(videoAlbum);
                return s3q0.a;
            default:
                LayoutDirection layoutDirection = (LayoutDirection) obj2;
                azl azlVar = (azl) obj;
                Object value = ((mtk0) obj4).getValue();
                Object value2 = ((mtk0) obj3).getValue();
                if (value != null && value2 != null) {
                    h9xVar = new h9x((((int) psu0.f((ljo0) value, (ljo0) value2, layoutDirection, azlVar.I0(gsu0.b))) << 32) | (0 & 4294967295L));
                }
                return new h9x(h9xVar != null ? h9xVar.a : 0L);
        }
    }

    public /* synthetic */ gd5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
