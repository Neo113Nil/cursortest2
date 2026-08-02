package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: PhotosRepository.kt */
/* loaded from: classes4.dex */
public interface aga0 {
    io.reactivex.rxjava3.core.x<Integer> a(UserId userId, List<? extends Photo> list);

    io.reactivex.rxjava3.core.x<Integer> b(UserId userId, int i, List<? extends Photo> list);
}
