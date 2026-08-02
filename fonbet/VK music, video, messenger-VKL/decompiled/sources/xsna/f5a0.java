package xsna;

import android.os.Bundle;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.c;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.LinkedHashMap;
import xsna.oap;

/* compiled from: PhotoAlbumPresenter.kt */
/* loaded from: classes3.dex */
public final class f5a0 extends vj6<u4a0> {
    public boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fj6
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0;
        if (!(oapVar instanceof oap.a)) {
            throw new IllegalStateException("You must use pagination with offset or change paginationType");
        }
        PhotoAlbum photoAlbum = this.g;
        if (photoAlbum == null) {
            return io.reactivex.rxjava3.core.q.T(new VKList());
        }
        int i2 = photoAlbum.b;
        if (i2 == -9000) {
            y0 = rsg0.y0(new ifa0(((Number) ((oap.a) oapVar).a).intValue(), i, this.f, !this.l), null, null, 3);
        } else {
            y0 = rsg0.y0(new vea0(this.f, i2, ((Number) ((oap.a) oapVar).a).intValue(), i, this.l), null, null, 3);
        }
        a8v a8vVar = new a8v(new rm0(23, photoAlbum, this), 7);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(a8vVar, lVar, kVar, kVar);
    }

    @Override // xsna.vj6, xsna.gm6
    public final void d() {
        super.d();
        ((u4a0) this.c).C1(this.g);
    }

    @Override // xsna.vj6, xsna.fj6
    public final void h() {
        super.h();
        v7();
    }

    @Override // xsna.vj6, xsna.fj6
    public final void onCreate(Bundle bundle) {
        UserId userId;
        super.onCreate(bundle);
        this.g = (PhotoAlbum) bundle.getParcelable("album");
        if (bundle.getBoolean("isNeedUpdateGroupAlbumInfo", false)) {
            v7();
        }
        String string = bundle.getString("source");
        this.l = bundle.getBoolean("is_reversed");
        PhotoAlbum photoAlbum = this.g;
        if (photoAlbum == null || (userId = photoAlbum.c) == null) {
            userId = UserId.d;
        }
        String str = userId.b >= 0 ? "photo_album_user" : "photo_album_community";
        b.d dVar = new b.d("open_screen");
        dVar.b(str, "name");
        dVar.b(userId, "owner_id");
        dVar.b(string, "source");
        dVar.e();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vj6
    public final c.h u7() {
        c.h u7 = super.u7();
        u7.f = (c.i) this.j.getValue();
        return u7;
    }

    public final void v7() {
        PhotoAlbum photoAlbum = this.g;
        if (photoAlbum == null) {
            return;
        }
        r6m.a.getClass();
        yea0 yea0Var = new yea0(R.string.user_photos_title, R.string.all_photos, r6m.k());
        LinkedHashMap linkedHashMap = qt1.a;
        ver0.b(((u4a0) this.c).getContext(), qt1.a(photoAlbum.c, yea0Var).subscribe(new zyu(new d5a0(1, this, f5a0.class, "handleRefreshAlbumInfoResponse", "handleRefreshAlbumInfoResponse(Lcom/vk/api/photos/PhotosGetAlbums$Result;)V", 0), 16), new o060(new ee8(1, this, f5a0.class, "handleRefreshAlbumInfoFailed", "handleRefreshAlbumInfoFailed(Ljava/lang/Throwable;)V", 0, 13), 3)));
    }
}
