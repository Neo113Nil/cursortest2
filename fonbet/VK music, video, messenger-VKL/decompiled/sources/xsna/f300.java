package xsna;

import java.util.function.Consumer;

/* compiled from: LongCounterBuilder.java */
/* loaded from: classes8.dex */
public interface f300 {
    e300 build();

    oq70 buildWithCallback(Consumer<qq70> consumer);

    i6o ofDoubles();

    f300 setDescription(String str);

    f300 setUnit(String str);
}
