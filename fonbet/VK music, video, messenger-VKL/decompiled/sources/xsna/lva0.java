package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.ConnectivityManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.unity3d.services.core.misc.JsonStorage;
import com.vk.core.serialize.Serializer;
import com.vk.dto.user.ImageStatus;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.im.engine.models.users.User;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.settings.PostingSettingsFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vk.qrcode.QRStatsTracker;
import com.vk.stickers.di.StickersComponentImpl;
import com.vk.stories.StoriesFilterListFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase_Impl;
import com.vkontakte.android.R;
import one.video.ad.ux.playpause.PlayPauseFrameView;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.m5u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class lva0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lva0(com.vk.profile.core.scheduled_clips.a aVar, j0i j0iVar) {
        this.b = 12;
        this.c = aVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JsonStorage privateJsonStorage;
        UpdateAdQualitySessionToken initialize$lambda$220$lambda$127;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new x4u0(((PlayPauseFrameView) obj).c.b);
            case 1:
                return Boolean.valueOf(((double) ((Number) ((mtk0) obj).getValue()).floatValue()) <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            case 2:
                return (wg40) ((rhb0) obj).itemView.findViewById(R.id.download_indicator);
            case 3:
                return ((Posting2Component) ((k7m) m7m.f((xzb0) obj)).mo408a(fpf0.a(Posting2Component.class))).C9(xzb0.A);
            case 4:
                e1c0 e1c0Var = (e1c0) obj;
                View view = e1c0Var.w;
                if (view != null) {
                    view.setContentDescription(e1c0Var.x.getVisibleText());
                }
                return s3q0.a;
            case 5:
                xlc0 xlc0Var = ((PostingSettingsFragment) obj).T;
                if (xlc0Var != null) {
                    ptj ptjVar = xlc0Var.e;
                    FragmentActivity activity = xlc0Var.b.getActivity();
                    if (activity != null) {
                        ptjVar.a(activity, xlc0Var.j);
                        String str = xlc0Var.j;
                        boolean z = !(str == null || str.length() == 0);
                        TextView textView = ptjVar.d;
                        if (textView != null) {
                            textView.setEnabled(z);
                        }
                    }
                }
                return s3q0.a;
            case 6:
                return ((NewsFeedComponent) ((k7m) m7m.f((hqc0) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 7:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                return m7m.d((PostsFromNotificationsFragment) obj);
            case 8:
                ((lbe) obj).invoke(m5u.d.b);
                return s3q0.a;
            case 9:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) obj;
                int i2 = ProfileMainPhotosFragment.F0;
                return new dm1(((PhotosComponent) profileMainPhotosFragment.x0.getValue()).d3(), new z7w(17), new h630(profileMainPhotosFragment, 23));
            case 10:
                ((com.vk.qrcode.c) obj).a();
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK);
                return s3q0.a;
            case 11:
                return (ImageView) ((rsf0) obj).c.findViewById(R.id.related_user_pin_logo);
            case 12:
                ((com.vk.profile.core.scheduled_clips.a) obj).a(CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER);
                return s3q0.a;
            case 13:
                cxr cxrVar = ((androidx.compose.foundation.gestures.l) obj).Q;
                if (!cxrVar.z().o) {
                    return null;
                }
                FocusStateImpl k0 = cxrVar.k0();
                if (!k0.s0()) {
                    return null;
                }
                if (k0.h()) {
                    return ((dxr) cxrVar).l2(null);
                }
                dxr b = itl.g(cxrVar).getFocusOwner().b();
                if (b != null) {
                    return b.l2(itl.e(cxrVar));
                }
                return null;
            case 14:
                Drawable e = enj.e(R.drawable.vk_icon_lock_16, R.attr.vk_ui_icon_secondary, ((p6i0) obj).itemView.getContext());
                e.setBounds(0, 0, e.getIntrinsicWidth(), e.getIntrinsicHeight());
                int b2 = cn70.b(2);
                int b3 = cn70.b(6);
                InsetDrawable insetDrawable = new InsetDrawable(e, b3, 0, 0, b2);
                insetDrawable.setBounds(0, 0, e.getIntrinsicWidth() + b3, e.getIntrinsicHeight() + b2);
                return insetDrawable;
            case 15:
                privateJsonStorage = ((UnityAdsModule) obj).privateJsonStorage();
                return privateJsonStorage;
            case 16:
                initialize$lambda$220$lambda$127 = ServiceProvider.initialize$lambda$220$lambda$127((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$127;
            case 17:
                return (ImageButton) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_comment_input_wall_post_clear_button);
            case 18:
                szk0.c("show_popup", (ImageStatus) obj);
                return s3q0.a;
            case 19:
                i2l0 i2l0Var = (i2l0) obj;
                return new c5l0(i2l0Var.a.getContext(), new jod(i2l0Var.b));
            case 20:
                StickersComponentImpl stickersComponentImpl = (StickersComponentImpl) obj;
                return new t5m0(stickersComponentImpl.a, stickersComponentImpl.b.p().a());
            case 21:
                dw20 dw20Var = ((jfl0) obj).x;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 22:
                return ((CartComponent) ((k7m) m7m.f((wjl0) obj)).a(fpf0.a(CartComponent.class))).f8();
            case 23:
                return ((arl0) obj).D;
            case 24:
                int i3 = StoriesFilterListFragment.T0;
                return ((StoriesComponent) m7m.d((StoriesFilterListFragment) obj).a(fpf0.a(StoriesComponent.class))).b();
            case 25:
                return new ggm0((StoryStatisticsDatabase_Impl) obj);
            case 26:
                qcy<Object>[] qcyVarArr2 = SuggestedPostsFragment.r0;
                return ((SuggestedPostsFragment) obj).getActivity();
            case 27:
                return (ConnectivityManager) ((Context) obj).getSystemService("connectivity");
            case 28:
                User user = (User) obj;
                Serializer.c<User> cVar = User.CREATOR;
                return user.o + ' ' + user.p;
            default:
                return ((vxq0) obj).n();
        }
    }

    public /* synthetic */ lva0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
