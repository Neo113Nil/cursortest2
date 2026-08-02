package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.NewsfeedData;
import java.util.List;

/* compiled from: FeedCacheManager.kt */
/* loaded from: classes3.dex */
public interface hxq {
    io.reactivex.rxjava3.internal.operators.completable.y a(UserId userId);

    io.reactivex.rxjava3.core.a b(int i, String str, boolean z, List list);

    io.reactivex.rxjava3.core.x<NewsfeedData> c(int i, boolean z);
}
