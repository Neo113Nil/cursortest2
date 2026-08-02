package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerProgressbarFragment;
import com.vk.newsfeed.posting.mediapicker.photovk.album.VkPhotoAlbumFragment;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class doc0 extends FunctionReferenceImpl implements izs<jv5, s3q0> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(jv5 jv5Var) {
        FragmentImpl f;
        enc0 enc0Var = (enc0) this.receiver;
        FragmentContainerView fragmentContainerView = enc0Var.t;
        ?? r2 = enc0Var.m0;
        VkTopBar vkTopBar = enc0Var.v;
        VkTabLayout vkTabLayout = enc0Var.s;
        ViewPager2 viewPager2 = enc0Var.u;
        mlc0 mlc0Var = (mlc0) j5g.k0(jv5Var.a);
        PostingStepScreen postingStepScreen = mlc0Var != null ? mlc0Var.a : null;
        FragmentManager fragmentManager = enc0Var.b.In().a;
        Fragment H = fragmentManager.H("current_media_picker_fragment");
        if (postingStepScreen == null) {
            viewPager2.setVisibility(0);
            bwt0.p0(vkTabLayout, true);
            bwt0.p0(vkTopBar, true);
            fragmentContainerView.setVisibility(8);
            if (H != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.q(H);
                aVar.k(true);
            }
        } else {
            if ((postingStepScreen instanceof PostingStepScreen.VkPhotoAlbum) && !(H instanceof VkPhotoAlbumFragment)) {
                com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a aVar2 = (com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a) r2.getValue();
                PhotoAlbum photoAlbum = ((PostingStepScreen.VkPhotoAlbum) postingStepScreen).b;
                UserId userId = (UserId) aVar2.a.invoke();
                if (userId == null) {
                    f = new MediaPickerProgressbarFragment.a(MediaPickerProgressbarFragment.class, null, null).f();
                } else {
                    VkPhotoAlbumFragment.a aVar3 = new VkPhotoAlbumFragment.a(userId, VkPhotoAlbumFragment.class);
                    aVar3.j.putParcelable("album", photoAlbum);
                    f = aVar3.f();
                }
            } else if ((postingStepScreen instanceof PostingStepScreen.VkPhotoAlbumsList) && !(H instanceof VkAlbumsFragment)) {
                UserId userId2 = (UserId) ((com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a) r2.getValue()).a.invoke();
                if (userId2 == null) {
                    f = new MediaPickerProgressbarFragment.a(MediaPickerProgressbarFragment.class, null, null).f();
                } else {
                    VkAlbumsFragment.a aVar4 = new VkAlbumsFragment.a(VkAlbumsFragment.class, null, null);
                    aVar4.j.putParcelable("uid", userId2);
                    f = aVar4.f();
                }
            }
            viewPager2.setVisibility(8);
            bwt0.p0(vkTabLayout, false);
            fragmentContainerView.setVisibility(0);
            bwt0.p0(vkTopBar, true);
            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(fragmentManager);
            aVar5.g(R.id.media_picker_navigation_host, f, "current_media_picker_fragment");
            aVar5.k(true);
        }
        return s3q0.a;
    }
}
