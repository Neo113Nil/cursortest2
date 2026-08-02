package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes6.dex */
public final class p9n0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Double.valueOf(((SuperAppWidget) t2).f()), Double.valueOf(((SuperAppWidget) t).f()));
    }
}
