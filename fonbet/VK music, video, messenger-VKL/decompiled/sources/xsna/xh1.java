package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: AlbumDetailsRepository.kt */
/* loaded from: classes4.dex */
public interface xh1 {
    io.reactivex.rxjava3.core.x<Integer> a(UserId userId, List<? extends Photo> list);

    io.reactivex.rxjava3.core.x<Integer> b(UserId userId, int i, List<? extends Photo> list);

    io.reactivex.rxjava3.internal.operators.observable.j1 c(UserId userId, int i, int i2, String str, boolean z);
}
