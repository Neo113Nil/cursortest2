package xsna;

import java.util.function.Consumer;

/* compiled from: LongUpDownCounterBuilder.java */
/* loaded from: classes8.dex */
public interface d600 {
    c600 build();

    rq70 buildWithCallback(Consumer<qq70> consumer);

    l7o ofDoubles();

    d600 setDescription(String str);

    d600 setUnit(String str);
}
