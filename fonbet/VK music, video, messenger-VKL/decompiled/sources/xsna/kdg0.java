package xsna;

import android.content.Context;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import java.util.List;
import kotlin.Pair;

/* compiled from: RestrictionsUtils.kt */
/* loaded from: classes5.dex */
public interface kdg0 {
    baf0 a(PhotoRestriction photoRestriction);

    io.reactivex.rxjava3.disposables.c b(List<? extends Photo> list, Photo photo, izs<? super List<? extends Pair<Integer, ? extends Photo>>, s3q0> izsVar);

    void c(zjt zjtVar, Photo photo);

    void d(zjt<?> zjtVar, PhotoRestriction photoRestriction, boolean z, boolean z2, gzs<String> gzsVar);

    io.reactivex.rxjava3.disposables.c e(List<? extends Photo> list, Photo photo, izs<? super List<? extends Pair<Integer, ? extends Photo>>, s3q0> izsVar);

    void f(zjt<?> zjtVar);

    void g(Photo photo);

    void h(Context context, Photo photo);

    void i(zjt<?> zjtVar, Photo photo, boolean z, yzs<? super Photo, ? super Integer, ? super Integer, String> yzsVar);
}
