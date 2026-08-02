package xsna;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes13.dex */
public final class g740<V> implements zhn0<List<V>>, Serializable {
    private final int expectedValuesPerKey;

    public g740() {
        k15.h(2, "expectedValuesPerKey");
        this.expectedValuesPerKey = 2;
    }

    @Override // xsna.zhn0
    public final Object get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
