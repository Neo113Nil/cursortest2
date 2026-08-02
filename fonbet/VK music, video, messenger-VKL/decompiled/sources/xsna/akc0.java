package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: PostingPhotoMarketTagsHelper.kt */
/* loaded from: classes4.dex */
public final class akc0 {
    public final o2o0 a = new o2o0();

    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(Photo photo) {
        io.reactivex.rxjava3.core.q E;
        if (photo.m) {
            E = io.reactivex.rxjava3.core.q.T(photo.x);
        } else {
            String h = Tag.ContentType.PHOTO.h();
            UserId userId = photo.e;
            io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.y0(yfb.x(this.a.b(photo.c, userId, h, photo.v)), null, null, 3).U(new com.vk.movika.sdk.base.model.n(new leq(26), 24));
            b8v b8vVar = new b8v(new kn20(photo, 26), 18);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            E = U.E(b8vVar, lVar, kVar, kVar);
        }
        return E.U(new ac20(new q8w(16), 12));
    }
}
