package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: ArchiveRepository.kt */
/* loaded from: classes4.dex */
public interface vi3 {
    io.reactivex.rxjava3.internal.operators.single.o a(UserId userId, int i, List list);

    io.reactivex.rxjava3.core.x<Integer> b(List<? extends Photo> list);

    io.reactivex.rxjava3.internal.operators.observable.j1 c(String str);
}
