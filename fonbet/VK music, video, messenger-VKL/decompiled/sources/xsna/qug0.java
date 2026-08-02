package xsna;

import com.squareup.wire.Message;
import com.vk.core.store.entity.models.NotificationMentions;

/* compiled from: RxListPersistentEntityCache.kt */
/* loaded from: classes17.dex */
public interface qug0<T extends Message<?, ?>> {
    io.reactivex.rxjava3.core.k<T> a(String str, io.reactivex.rxjava3.core.w wVar);

    io.reactivex.rxjava3.core.a b(String str, NotificationMentions notificationMentions, io.reactivex.rxjava3.core.w wVar);
}
