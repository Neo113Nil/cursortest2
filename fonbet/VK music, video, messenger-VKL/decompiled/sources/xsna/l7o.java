package xsna;

import java.util.function.Consumer;

/* compiled from: DoubleUpDownCounterBuilder.java */
/* loaded from: classes8.dex */
public interface l7o {
    k7o build();

    mq70 buildWithCallback(Consumer<lq70> consumer);

    l7o setDescription(String str);

    l7o setUnit(String str);
}
