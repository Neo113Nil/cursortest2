package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.ui.postingpicker.PostingPickerPhotosFragment;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PhotosRouter.kt */
/* loaded from: classes.dex */
public interface oga0 {
    static /* synthetic */ void a(oga0 oga0Var, Context context, PhotoAlbum photoAlbum, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        oga0Var.q(context, photoAlbum, str, (i & 16) == 0);
    }

    void b(Context context, qba0 qba0Var);

    void c(Context context, qba0 qba0Var);

    void d(Context context, UserId userId, boolean z);

    void e(Fragment fragment, GalleryPickerSourceConfiguration.EntryPoint entryPoint);

    void f(Context context, PhotoAlbum photoAlbum);

    void g(Context context, ExtendedUserProfile extendedUserProfile, boolean z);

    void h(FragmentActivity fragmentActivity);

    void i(FragmentActivity fragmentActivity, UserId userId, List list);

    void j(int i, Context context, UserId userId);

    PostingPickerPhotosFragment.a k(UserId userId, boolean z);

    void l(Context context);

    void m(Context context, UserId userId, String str, String str2);

    ImageViewer.c n(Context context, int i, ArrayList arrayList, ImageViewer.a aVar);

    void o(Context context, UserId userId);

    void q(Context context, PhotoAlbum photoAlbum, String str, boolean z);

    void r(AlbumsFragment albumsFragment, UserId userId, List list);

    void s(Context context, UserId userId);
}
