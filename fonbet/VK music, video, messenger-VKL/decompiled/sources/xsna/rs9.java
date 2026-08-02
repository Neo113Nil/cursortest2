package xsna;

import androidx.annotation.NonNull;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: CarTextConstraints.java */
/* loaded from: classes11.dex */
public final class rs9 {

    @NonNull
    public static final rs9 b;
    public final HashSet<Class<? extends CarSpan>> a;

    static {
        new rs9(Collections.EMPTY_LIST);
        new rs9(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new rs9(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        new rs9(Arrays.asList(ForegroundCarColorSpan.class));
        b = new rs9(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        new rs9(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new rs9(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new rs9(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public rs9(List<Class<? extends CarSpan>> list) {
        this.a = new HashSet<>(list);
    }

    public final void a(List<CarText.SpanWrapper> list) {
        Iterator<CarText.SpanWrapper> it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = it.next().getCarSpan().getClass();
            if (!this.a.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
            }
        }
    }
}
