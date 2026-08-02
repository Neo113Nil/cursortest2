package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class hyf<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Integer.valueOf(((Msg) t).d), Integer.valueOf(((Msg) t2).d));
    }
}
