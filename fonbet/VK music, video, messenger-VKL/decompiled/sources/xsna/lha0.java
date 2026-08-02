package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.oap;

/* compiled from: PickVKPhotoPresenter.kt */
/* loaded from: classes3.dex */
public final class lha0 extends vj6<hha0> {
    public final boolean l;
    public boolean m;
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

    public lha0(PickVKPhotoFragmentNew pickVKPhotoFragmentNew) {
        super(pickVKPhotoFragmentNew);
        this.l = true;
        this.n = msy.a(LazyThreadSafetyMode.NONE, new t9b(12, pickVKPhotoFragmentNew, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fj6
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i) {
        if (!(oapVar instanceof oap.a)) {
            throw new IllegalStateException("You must use pagination with offset or change paginationType");
        }
        io.reactivex.rxjava3.internal.operators.observable.b0 F = rsg0.y0(new zea0(this.f, ((Number) ((oap.a) oapVar).a).intValue(), i), null, null, 3).F((io.reactivex.rxjava3.functions.f) this.n.getValue());
        fsq fsqVar = new fsq(new jjx(this, 25), 16);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return F.E(fsqVar, lVar, kVar, kVar);
    }

    @Override // xsna.vj6, xsna.fj6
    public final boolean Q6() {
        return this.l;
    }

    @Override // xsna.vj6, xsna.fj6
    public final boolean X6() {
        return false;
    }

    @Override // xsna.vj6, xsna.gm6
    public final void d() {
        super.d();
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        eq0 eq0Var = new eq0(24);
        fVar.getClass();
        a(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, eq0Var).a0(asu0.a.d()).subscribe(new j3z(this, 9)));
        io.reactivex.rxjava3.disposables.c subscribe = v7().subscribe(new eiy(new m360(this, 7), 13), new ubq(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 22));
        if (subscribe != null) {
            a(subscribe);
        }
    }

    @Override // xsna.vj6, xsna.fj6
    public final void h() {
        this.m = true;
        io.reactivex.rxjava3.disposables.c subscribe = v7().subscribe(new o330(new xc50(this, 6), 9), new cp50(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 5));
        if (subscribe != null) {
            a(subscribe);
        }
    }

    @Override // xsna.vj6, xsna.fj6
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserId userId = this.f;
        PhotoAlbum photoAlbum = new PhotoAlbum();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        photoAlbum.g = context.getString(R.string.all_photos);
        photoAlbum.b = -9002;
        photoAlbum.c = userId;
        this.g = photoAlbum;
    }

    public final io.reactivex.rxjava3.core.q<PhotosGetAlbums.a> v7() {
        LinkedHashMap linkedHashMap = qt1.a;
        UserId userId = this.f;
        r6m.a.getClass();
        return qt1.a(userId, new yea0(R.string.user_photos_title, R.string.all_photos, r6m.k()));
    }
}
