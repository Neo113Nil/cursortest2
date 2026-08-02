package io.opentelemetry.sdk.common.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.i94;
import xsna.lk3;
import xsna.p94;
import xsna.q94;
import xsna.vu5;

/* loaded from: classes8.dex */
public final class AttributesMap extends HashMap<i94<?>, Object> implements q94 {
    private static final long serialVersionUID = -5072696312123632376L;
    private final long capacity;
    private final int lengthLimit;
    private int totalAddedValues = 0;

    public AttributesMap(long j, int i) {
        this.capacity = j;
        this.lengthLimit = i;
    }

    @Override // xsna.q94
    public final Map<i94<?>, Object> i() {
        return Collections.unmodifiableMap(this);
    }

    public final int l() {
        return this.totalAddedValues;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object put(i94<?> i94Var, Object obj) {
        if (obj == null) {
            return null;
        }
        this.totalAddedValues++;
        if (size() < this.capacity || containsKey(i94Var)) {
            return super.put(i94Var, p94.b(this.lengthLimit, obj));
        }
        return null;
    }

    @Override // xsna.q94
    public final lk3 toBuilder() {
        lk3 lk3Var = new lk3();
        lk3Var.g(this);
        return lk3Var;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.capacity);
        sb.append(", totalAddedValues=");
        return vu5.b(sb, this.totalAddedValues, '}');
    }
}
