package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockChannel;
import com.vk.catalog2.common.ui.holders.channel.CatalogChannelViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.clipchecker.impl.di.ClipCheckerComponentImpl;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.music.snippet.player.di.AudioSnippetComponentImpl;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.posting.presentation.articlepicker.ArticlePickerFragment;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vkontakte.android.R;
import org.json.JSONObject;
import ru.ok.media.AsyncDNSResolver;
import xsna.g9h;
import xsna.ikv0;
import xsna.mxa;
import xsna.npf;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class oo implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Handler workerHandler_delegate$lambda$2;
        int i = this.b;
        int i2 = 4;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((AccountInfo) obj).C;
                if (str != null) {
                    return new JSONObject(str);
                }
                return null;
            case 1:
                return (com.vk.feed.design.view.newsfeed.ads_action_button.c) ((rf0) obj).itemView;
            case 2:
                AlbumsFragment albumsFragment = (AlbumsFragment) obj;
                return new ln1(albumsFragment.b0, (kdg0) albumsFragment.Z.getValue(), (el1) albumsFragment.V.getValue(), albumsFragment.c0);
            case 3:
                int i4 = ArticlePickerFragment.V;
                z1h0 parentFragment = ((ArticlePickerFragment) obj).getParentFragment();
                gia0 gia0Var = parentFragment instanceof gia0 ? (gia0) parentFragment : null;
                if (gia0Var != null) {
                    gia0Var.kh();
                }
                return s3q0.a;
            case 4:
                workerHandler_delegate$lambda$2 = AsyncDNSResolver.workerHandler_delegate$lambda$2((AsyncDNSResolver) obj);
                return workerHandler_delegate$lambda$2;
            case 5:
                return new nx4(((AudioSnippetComponentImpl) obj).a, new bq4(), new kx4());
            case 6:
                AvatarView avatarView = (AvatarView) obj;
                AvatarView.a aVar = AvatarView.y;
                avatarView.getContext();
                return new qmm(avatarView.w);
            case 7:
                j96 j96Var = (j96) obj;
                return new vam0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) j96Var.e.invoke(), j96Var.d.b, new px0(j96Var, i2));
            case 8:
                o48 o48Var = (o48) obj;
                wh50 wh50Var = o48Var.k;
                wh50 wh50Var2 = o48Var.l;
                VkBottomBar vkBottomBar = (VkBottomBar) ((zak0) wh50Var).getValue();
                if (vkBottomBar != null) {
                    ikv0 ikv0Var = (ikv0) ((zak0) wh50Var2).getValue();
                    if (ikv0Var != null) {
                        ikv0Var.a();
                    }
                    ikv0.a aVar2 = new ikv0.a(vkBottomBar.getContext());
                    aVar2.o = Integer.valueOf(e3m.a(R.dimen.vk_ui_spacing_size_m, vkBottomBar.getContext()));
                    aVar2.n = Integer.valueOf(e3m.a(R.dimen.vk_ui_spacing_size_m, vkBottomBar.getContext()));
                    aVar2.u = new ikv0.d(new ikv0.d.c("Snackbar in BottomBar"), new ikv0.d.b("Subtitle text"), (ikv0.d.a) null, 4);
                    aVar2.w = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    aVar2.e = -1L;
                    ((zak0) wh50Var2).setValue(aVar2.o(vkBottomBar.getSnackbarSlot()));
                }
                return s3q0.a;
            case 9:
                is8 is8Var = ((kt8) obj).i;
                if (is8Var != null) {
                    is8Var.c();
                }
                return s3q0.a;
            case 10:
                gdb gdbVar = ((CatalogChannelViewHolder) obj).b;
                UIBlockChannel uIBlockChannel = gdbVar.e;
                if (uIBlockChannel != null) {
                    gdbVar.b.j(new d3a(uIBlockChannel.y, uIBlockChannel.z));
                }
                return s3q0.a;
            case 11:
                ViewGroup viewGroup = (ViewGroup) ((ViewStub) ((ViewGroup) obj).findViewById(R.id.deactivated_container_stub)).inflate();
                viewGroup.setOutlineProvider(new mxa.a());
                return viewGroup;
            case 12:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                a1w a1wVar = channelFragment.V;
                int i5 = channelFragment.isPostponed() ? 150 : 6;
                f9w b = e9w.b("ChannelMessageHistoryLoader");
                long mo = channelFragment.mo();
                boolean isPostponed = channelFragment.isPostponed();
                return new w920(new duz(mo, a1wVar, isPostponed), new puf0(mo, a1wVar, isPostponed), new e0b(mo, a1wVar, isPostponed), new f0b(mo, a1wVar, isPostponed), i5, 15, new i2b(mo, a1wVar), b, new ci7(5), isPostponed);
            case 13:
                return new bzb0(((w9b) obj).b);
            case 14:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new unb((ynb) obj, i3));
                return ofFloat;
            case 15:
                return new ymc(((ClipCheckerComponentImpl) obj).a.getExperiments());
            case 16:
                int i6 = ClipFeedListFragment.a2;
                return new z5e(((ClipFeedListFragment) obj).Ka());
            case 17:
                int i7 = ClipsEntryPointsFragment.i0;
                return ((ClipsConfigAuthorsComponent) m7m.d((ClipsEntryPointsFragment) obj).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 18:
                ?? r2 = ((ClipsFavoritesComponentImpl) obj).a;
                return new n9x0(((NewsfeedMappersComponent) r2.getValue()).a9(), ((NewsfeedMappersComponent) r2.getValue()).xc());
            case 19:
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return ((BridgeComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(BridgeComponent.class))).O();
            case 20:
                return ((ClipsUploadVkComponent) ((k7m) m7m.c((dee) obj)).a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
            case 21:
                int i8 = ClipsInterestsFragment.Y;
                return (ClipsInterestsComponentImpl) m7m.d((ClipsInterestsFragment) obj).a(fpf0.a(ClipsInterestsComponent.class));
            case 22:
                return ((BridgeComponent) ((g8m) obj).a(fpf0.a(BridgeComponent.class))).x();
            case 23:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                urf Of = clipsViewerComponentImpl.Of();
                nwy nwyVar = clipsViewerComponentImpl.m0;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[51];
                return new toe(Of, (bpe) nwyVar.c(), clipsViewerComponentImpl.Y());
            case 24:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i9 = ClipsWrapperFragment.Q0;
                npf.d.a aVar3 = npf.d.a.b;
                clipsWrapperFragment.getClass();
                xn50.a.c(clipsWrapperFragment, aVar3);
                return s3q0.a;
            case 25:
                return new c1g((Context) obj);
            case 26:
                ((CommunitiesCatalogRootVh) obj).y.d();
                return s3q0.a;
            case 27:
                ((d3h) obj).g();
                return s3q0.a;
            case 28:
                ((g9h.a) obj).d = false;
                return s3q0.a;
            default:
                return (TabbarSettingsComponent) ((h7m) obj).a(fpf0.a(TabbarSettingsComponent.class));
        }
    }
}
