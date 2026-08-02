package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class n2k<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Integer.valueOf(((ImageUrl) t2).f), Integer.valueOf(((ImageUrl) t).f));
    }
}
