package xsna;

import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes18.dex */
public final class tmk<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Integer.valueOf(((BookingServiceModel) t).m), Integer.valueOf(((BookingServiceModel) t2).m));
    }
}
