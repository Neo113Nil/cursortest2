package xsna;

import com.vk.dto.common.ImageSize;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class u8z<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Integer.valueOf(((ImageSize) t).d.b), Integer.valueOf(((ImageSize) t2).d.b));
    }
}
