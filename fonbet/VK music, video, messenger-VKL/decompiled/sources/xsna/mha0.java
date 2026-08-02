package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.oap;

/* compiled from: PickVKPhotoPresenter.kt */
/* loaded from: classes4.dex */
public final class mha0 extends wj6<iha0> {
    public boolean l;
    public final List<Integer> m;
    public final Object n;

    /* compiled from: PickVKPhotoPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: PickVKPhotoPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public mha0(VkPhotoPickerFragment vkPhotoPickerFragment) {
        super(vkPhotoPickerFragment);
        this.m = e43.l(-6, -7, -9000);
        this.n = msy.a(LazyThreadSafetyMode.NONE, new j6(13, vkPhotoPickerFragment, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gj6
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i) {
        if (!(oapVar instanceof oap.a)) {
            throw new IllegalStateException("You must use pagination with offset or change paginationType");
        }
        io.reactivex.rxjava3.internal.operators.observable.b0 F = rsg0.y0(new zea0(this.g, ((Number) ((oap.a) oapVar).a).intValue(), i), null, null, 3).F((io.reactivex.rxjava3.functions.f) this.n.getValue());
        bdz bdzVar = new bdz(new h630(this, 17), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return F.E(bdzVar, lVar, kVar, kVar);
    }

    @Override // xsna.wj6, xsna.gm6
    public final void d() {
        super.d();
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        sr srVar = new sr(25);
        fVar.getClass();
        a(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, srVar).a0(asu0.a.d()).subscribe(new qw40(this, 6)));
        a(x7().subscribe(new n1r(new el30(this, 15), 14), new uu60(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 5)));
    }

    @Override // xsna.gj6
    public final void h() {
        this.l = true;
        a(x7().subscribe(new m330(new ebx(this, 16), 9), new gl30(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 11)));
    }

    @Override // xsna.gj6
    public final void i6(Bundle bundle, Bundle bundle2) {
        UserId userId = (UserId) bundle.getParcelable("uid");
        if (userId == null) {
            userId = UserId.d;
        }
        this.g = userId;
        bundle.getBoolean("select", false);
        UserId userId2 = this.g;
        PhotoAlbum photoAlbum = new PhotoAlbum();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        photoAlbum.g = context.getString(R.string.media_picker_all_photos);
        photoAlbum.b = -9002;
        photoAlbum.c = userId2;
        this.h = photoAlbum;
    }

    @Override // xsna.wj6
    public final String v7() {
        String string;
        Activity context = ((iha0) this.c).getContext();
        return (context == null || (string = context.getString(R.string.media_picker_photo_vk_empty_list)) == null) ? "" : string;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 x7() {
        LinkedHashMap linkedHashMap = pt1.a;
        UserId userId = this.g;
        r6m.a.getClass();
        return pt1.a(userId, new yea0(R.string.media_picker_user_photos_title, R.string.media_picker_all_photos, r6m.k())).U(new i630(new k170(this, 7), 10));
    }
}
