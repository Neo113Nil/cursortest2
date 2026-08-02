package xsna;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.ads.api.di.AdsComponent;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchOwnerVideosCatalogRootVh;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.im.design.view.spoiler.SpoilerView;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.permissions.OverlayPermissionFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.nyd0.e;
import xsna.s7d0;
import xsna.tzp0;
import xsna.vs60;
import xsna.yb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f550 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f550(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        q0c q0cVar;
        MediationDataSource initialize$lambda$220$lambda$54;
        int i = this.b;
        r1 = false;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                MusicSearchCatalogRootVh musicSearchCatalogRootVh = (MusicSearchCatalogRootVh) obj;
                jyh0 jyh0Var = (jyh0) musicSearchCatalogRootVh.u.getValue();
                b5a b5aVar = musicSearchCatalogRootVh.m.b.f;
                w950 w950Var = (w950) musicSearchCatalogRootVh.z.getValue();
                s1v s1vVar = new s1v();
                f5x f5xVar = new f5x(musicSearchCatalogRootVh, 16);
                i2u i2uVar = new i2u(musicSearchCatalogRootVh, 2);
                jw3 jw3Var = new jw3(musicSearchCatalogRootVh);
                ag20 ag20Var = new ag20(musicSearchCatalogRootVh, 7);
                jyh0Var.getClass();
                return new kyh0(b5aVar, w950Var, s1vVar, f5xVar, jyh0Var, jw3Var, i2uVar, ag20Var);
            case 1:
                return (PlayerAnalyticsComponent) m7m.e().a(fpf0.a(PlayerAnalyticsComponent.class));
            case 2:
                return ((ClipsUploadSdkUploaderComponent) j6i.b((h7m) ((yx50) obj).C.getValue(), ClipsUploadSdkUploaderComponent.class)).Zb();
            case 3:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) obj;
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return newsfeedFragment;
            case 4:
                return (CommunityStrikesComponent) ((mo60) obj).c().a(fpf0.a(CommunityStrikesComponent.class));
            case 5:
                ((d070) obj).a.a(new vs60.i.a(true));
                return s3q0.a;
            case 6:
                vx6 vx6Var = (vx6) obj;
                if (vx6Var != null && (q0cVar = (q0c) ((r0c) vx6Var.c).a) != null) {
                    q0cVar.e();
                }
                return s3q0.a;
            case 7:
                return Integer.valueOf(((yb70.f) obj).b.size());
            case 8:
                yn80 yn80Var = (yn80) obj;
                int i2 = yn80Var.b;
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList.add(yn80Var.d[i3]);
                }
                return arrayList;
            case 9:
                OverlayPermissionFragment overlayPermissionFragment = (OverlayPermissionFragment) obj;
                int i4 = OverlayPermissionFragment.S;
                overlayPermissionFragment.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + overlayPermissionFragment.requireContext().getPackageName())), 42902);
                overlayPermissionFragment.R = true;
                return s3q0.a;
            case 10:
                int i5 = PaginatedFriendsListFragment.p0;
                A a = ((PaginatedFriendsListFragment) obj).i0;
                if (a != 0) {
                    return a.e;
                }
                return null;
            case 11:
                ((lv90) obj).lo(0);
                return s3q0.a;
            case 12:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) obj;
                return new com.vk.video.playlist.playlistscreen.catalog.a(playlistScreenFragmentInternalComponent.d.Ze(), playlistScreenFragmentInternalComponent.Ff().J());
            case 13:
                tzp0.c.a aVar = PollEditorModalBottomSheet.o1;
                ((PollEditorModalBottomSheet) obj).hide();
                return s3q0.a;
            case 14:
                ((AdsComponent) ((k7m) m7m.f((xzb0) obj)).mo408a(fpf0.a(AdsComponent.class))).getClass();
                return yv0.a;
            case 15:
                return (NewsfeedOptionalAdsComponent) ((k7m) m7m.f((y1c0) obj)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
            case 16:
                int i6 = PostingFragment.s0;
                return ((BridgeComponent) m7m.d((PostingFragment) obj).a(fpf0.a(BridgeComponent.class))).t();
            case 17:
                ((m8d0) obj).g().invoke(s7d0.c.a);
                return s3q0.a;
            case 18:
                return ((nyd0) obj).new e();
            case 19:
                PublishState publishState = (PublishState) obj;
                if (drm0.p0(publishState.e).toString().length() == 0 && publishState.j() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                ((gbf0) obj).c.invoke();
                return s3q0.a;
            case 21:
                return Integer.valueOf(((gef0) obj).getBindingAdapterPosition());
            case 22:
                uqf0 uqf0Var = (uqf0) obj;
                if (frf0.a.Ab() != null) {
                    uqf0Var.invoke();
                }
                return s3q0.a;
            case 23:
                List<UIBlock> mo78O0 = ((SearchOwnerVideosCatalogRootVh) obj).w.mo78O0();
                if (mo78O0 == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : mo78O0) {
                    if (obj2 instanceof UIBlockVideo) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((UIBlockVideo) it.next()).B);
                }
                return arrayList3;
            case 24:
                ((SearchRequestFactory) obj).o = true;
                return new xga();
            case 25:
                int i7 = yhi0.f1;
                ((View) obj).setEnabled(true);
                return s3q0.a;
            case 26:
                initialize$lambda$220$lambda$54 = ServiceProvider.initialize$lambda$220$lambda$54((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$54;
            case 27:
                return (FrameLayout) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_bottom_sheet);
            case 28:
                return new uej0((ebe) obj);
            default:
                int i8 = SpoilerView.c;
                ((SpoilerView) obj).postInvalidateOnAnimation();
                return s3q0.a;
        }
    }
}
