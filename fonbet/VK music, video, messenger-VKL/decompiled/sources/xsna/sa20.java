package xsna;

import com.vk.pushes.dto.PushMessage;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class sa20<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Integer.valueOf(((PushMessage) t).b), Integer.valueOf(((PushMessage) t2).b));
    }
}
