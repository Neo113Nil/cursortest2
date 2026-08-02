package xsna;

import java.util.function.Consumer;

/* compiled from: DoubleCounterBuilder.java */
/* loaded from: classes8.dex */
public interface i6o {
    h6o build();

    jq70 buildWithCallback(Consumer<lq70> consumer);

    i6o setDescription(String str);

    i6o setUnit(String str);
}
