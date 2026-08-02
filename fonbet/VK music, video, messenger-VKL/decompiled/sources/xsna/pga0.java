package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.bridges.ImageViewer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumEntryPoint;
import com.vk.photos.ui.postingpicker.PostingPickerPhotosFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;
import xsna.gd60;
import xsna.m8a0;
import xsna.sw50;

/* compiled from: PhotosRouterImpl.kt */
/* loaded from: classes.dex */
public final class pga0 implements oga0 {
    public final sw50 a;
    public final gd60 b;
    public final ImageViewer c;

    public pga0(sw50 sw50Var, gd60 gd60Var, ImageViewer imageViewer) {
        this.a = sw50Var;
        this.b = gd60Var;
        this.c = imageViewer;
    }

    public static void t(pga0 pga0Var, Context context, UserId userId, String str, String str2, boolean z, String str3, boolean z2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            str = null;
        }
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        if ((i3 & 256) != 0) {
            z2 = false;
        }
        if ((i3 & 512) != 0) {
            i = -1;
        }
        if ((i3 & 1024) != 0) {
            i2 = -1;
        }
        if (!fkq0.d(userId)) {
            new ProfileMainPhotosFragment.a(userId, str2, str3, z, z2).k(context);
            return;
        }
        cga0 cga0Var = new cga0();
        cga0Var.B(userId);
        cga0Var.y(str);
        cga0Var.z(i);
        cga0Var.A(i2);
        cga0Var.D();
        cga0Var.k(context);
    }

    @Override // xsna.oga0
    public final void b(Context context, qba0 qba0Var) {
        String Cb = qba0Var.b().Cb();
        String str = qba0Var.b().v;
        gd60.a aVar = gd60.a;
        this.b.K(context, Cb, str);
    }

    @Override // xsna.oga0
    public final void c(Context context, qba0 qba0Var) {
        UserId uid;
        Owner a = qba0Var.a();
        if (a == null || (uid = a.getUid()) == null) {
            return;
        }
        gd60.Z0(this.b, context, uid, null, null, 12);
    }

    @Override // xsna.oga0
    public final void d(Context context, UserId userId, boolean z) {
        vh3 vh3Var = new vh3();
        vh3Var.z(userId);
        vh3Var.y(z);
        vh3Var.k(context);
    }

    @Override // xsna.oga0
    public final void e(Fragment fragment, GalleryPickerSourceConfiguration.EntryPoint entryPoint) {
        this.a.g().d(fragment, 23, 500, new sw50.f.a(null, entryPoint, 2));
    }

    @Override // xsna.oga0
    public final void f(Context context, PhotoAlbum photoAlbum) {
        if (fkq0.d(photoAlbum.c)) {
            xg1 xg1Var = new xg1();
            xg1Var.B(photoAlbum.c);
            xg1Var.y(photoAlbum);
            xg1Var.A();
            xg1Var.k(context);
        }
    }

    @Override // xsna.oga0
    public final void g(Context context, ExtendedUserProfile extendedUserProfile, boolean z) {
        t(this, context, extendedUserProfile.a.c, extendedUserProfile.b, extendedUserProfile.c, bwd0.g(extendedUserProfile) && extendedUserProfile.Z0.containsKey("user_photos") && extendedUserProfile.b("user_photos") > 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, z, extendedUserProfile.b("new_photo_tags"), extendedUserProfile.b("new_recognition_tags"), 4);
    }

    @Override // xsna.oga0
    public final void h(FragmentActivity fragmentActivity) {
        this.b.h1(fragmentActivity);
    }

    @Override // xsna.oga0
    public final void i(FragmentActivity fragmentActivity, UserId userId, List list) {
        m6k m6kVar = new m6k();
        m6kVar.A(list);
        m6kVar.C(userId);
        UiTracker uiTracker = UiTracker.a;
        m6kVar.z(new CreateAlbumEntryPoint(UiTracker.c()));
        m6kVar.B();
        m6kVar.h(fragmentActivity, 3239);
    }

    @Override // xsna.oga0
    public final void j(int i, Context context, UserId userId) {
        if (fkq0.d(userId)) {
            xg1 xg1Var = new xg1();
            xg1Var.B(userId);
            xg1Var.z(i);
            xg1Var.k(context);
        }
    }

    @Override // xsna.oga0
    public final PostingPickerPhotosFragment.a k(UserId userId, boolean z) {
        return new PostingPickerPhotosFragment.a(userId, z);
    }

    @Override // xsna.oga0
    public final void l(Context context) {
        new m8a0.a(context).I0(null);
    }

    @Override // xsna.oga0
    public final void m(Context context, UserId userId, String str, String str2) {
        if (!fkq0.d(userId)) {
            AlbumsListFragment.a aVar = new AlbumsListFragment.a(userId);
            aVar.y(str);
            aVar.k(context);
        } else {
            cga0 cga0Var = new cga0();
            cga0Var.B(userId);
            cga0Var.y(str2);
            cga0Var.C();
            cga0Var.k(context);
        }
    }

    @Override // xsna.oga0
    public final ImageViewer.c n(Context context, int i, ArrayList arrayList, ImageViewer.a aVar) {
        ImageViewer.c g;
        g = this.c.g(i, arrayList, context, aVar, o25.a().c());
        return g;
    }

    @Override // xsna.oga0
    public final void o(Context context, UserId userId) {
        t(this, context, userId, null, null, true, "link", false, 0, 0, 1820);
    }

    @Override // xsna.oga0
    public final void q(Context context, PhotoAlbum photoAlbum, String str, boolean z) {
        if (!fkq0.d(photoAlbum.c)) {
            PhotoAlbumFragment.a aVar = new PhotoAlbumFragment.a(photoAlbum.c, photoAlbum, z);
            aVar.y(str);
            aVar.k(context);
        } else {
            xg1 xg1Var = new xg1();
            xg1Var.B(photoAlbum.c);
            xg1Var.y(photoAlbum);
            xg1Var.k(context);
        }
    }

    @Override // xsna.oga0
    public final void r(AlbumsFragment albumsFragment, UserId userId, List list) {
        m6k m6kVar = new m6k();
        m6kVar.A(list);
        m6kVar.C(userId);
        UiTracker uiTracker = UiTracker.a;
        m6kVar.z(new CreateAlbumEntryPoint(UiTracker.c()));
        m6kVar.B();
        m6kVar.g(3241, albumsFragment);
    }

    @Override // xsna.oga0
    public final void s(Context context, UserId userId) {
        cga0 cga0Var = new cga0();
        cga0Var.B(userId);
        cga0Var.D();
        cga0Var.k(context);
    }
}
