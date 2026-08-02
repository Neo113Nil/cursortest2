package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PhotoFlowInteractor.kt */
/* loaded from: classes4.dex */
public interface x7a0 {
    io.reactivex.rxjava3.core.x a(UserId userId, List list);

    io.reactivex.rxjava3.core.a b(Photo photo, UserId userId);

    io.reactivex.rxjava3.core.x c(ArrayList arrayList, int i, UserId userId);

    io.reactivex.rxjava3.core.q<VKList<Photo>> d(UserId userId, String str);

    io.reactivex.rxjava3.core.a e(Photo photo);

    io.reactivex.rxjava3.core.a f(Photo photo);

    io.reactivex.rxjava3.internal.operators.observable.j1 g(UserId userId);
}
