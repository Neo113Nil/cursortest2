package defpackage;

import com.yandex.messaging.internal.entities.ForwardMessageRef;
import java.util.Comparator;

/* loaded from: classes15.dex */
public final class h1w implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((ForwardMessageRef) obj).timestamp).compareTo(Long.valueOf(((ForwardMessageRef) obj2).timestamp));
    }
}
