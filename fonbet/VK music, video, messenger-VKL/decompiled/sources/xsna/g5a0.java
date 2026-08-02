package xsna;

import android.app.Activity;
import android.os.Bundle;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.c;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.LinkedHashMap;
import xsna.oap;

/* compiled from: PhotoAlbumPresenter.kt */
/* loaded from: classes4.dex */
public final class g5a0 extends wj6<v4a0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gj6
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0;
        if (!(oapVar instanceof oap.a)) {
            throw new IllegalStateException("You must use pagination with offset or change paginationType");
        }
        PhotoAlbum photoAlbum = this.h;
        if (photoAlbum == null) {
            return io.reactivex.rxjava3.core.q.T(new VKList());
        }
        int i2 = photoAlbum.b;
        if (i2 == -9000) {
            y0 = rsg0.y0(new ifa0(((Number) ((oap.a) oapVar).a).intValue(), i, this.g, true), null, null, 3);
        } else {
            y0 = rsg0.y0(new vea0(this.g, i2, ((Number) ((oap.a) oapVar).a).intValue(), i, false), null, null, 3);
        }
        ux00 ux00Var = new ux00(new g86(16, photoAlbum, this), 10);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(ux00Var, lVar, kVar, kVar);
    }

    @Override // xsna.wj6, xsna.gm6
    public final void d() {
        super.d();
        ((v4a0) this.c).C1(this.h);
    }

    @Override // xsna.gj6
    public final void h() {
        com.vk.lists.c cVar = this.e;
        if (cVar == null) {
            cVar = null;
        }
        cVar.p(true);
        PhotoAlbum photoAlbum = this.h;
        if (photoAlbum == null) {
            return;
        }
        r6m.a.getClass();
        yea0 yea0Var = new yea0(R.string.media_picker_user_photos_title, R.string.media_picker_all_photos, r6m.k());
        LinkedHashMap linkedHashMap = pt1.a;
        io.reactivex.rxjava3.core.q a = pt1.a(photoAlbum.c, yea0Var);
        y730 y730Var = new y730(new e5a0(1, this, g5a0.class, "handleRefreshAlbumInfoResponse", "handleRefreshAlbumInfoResponse(Lcom/vk/api/photos/PhotosGetAlbums$Result;)V", 0), 7);
        androidx.lifecycle.f fVar = this.c;
        ver0.b(((v4a0) fVar).getContext(), a.subscribe(y730Var, new jsv(new gy(1, fVar, v4a0.class, "showErrorSnackbar", "showErrorSnackbar(Ljava/lang/Throwable;)V", 0, 13), 13)));
    }

    @Override // xsna.gj6
    public final void i6(Bundle bundle, Bundle bundle2) {
        UserId userId = (UserId) bundle.getParcelable("uid");
        if (userId == null) {
            userId = UserId.d;
        }
        this.g = userId;
        bundle.getBoolean("select", false);
        this.h = (PhotoAlbum) bundle.getParcelable("album");
    }

    @Override // xsna.wj6
    public final String v7() {
        String string;
        Activity context = ((v4a0) this.c).getContext();
        return (context == null || (string = context.getString(R.string.empty_list)) == null) ? "" : string;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wj6
    public final c.h w7() {
        c.h w7 = super.w7();
        w7.f = (c.i) this.j.getValue();
        return w7;
    }
}
