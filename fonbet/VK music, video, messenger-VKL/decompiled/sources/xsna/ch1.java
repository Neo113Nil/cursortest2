package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: AlbumDetailsInteractor.kt */
/* loaded from: classes4.dex */
public interface ch1 {
    io.reactivex.rxjava3.core.x<Integer> a(UserId userId, List<? extends Photo> list);

    io.reactivex.rxjava3.internal.operators.completable.w b();

    io.reactivex.rxjava3.core.x<Integer> c(UserId userId, int i, List<? extends Photo> list);

    io.reactivex.rxjava3.internal.operators.observable.l2 d(int i, UserId userId, int i2, String str);
}
