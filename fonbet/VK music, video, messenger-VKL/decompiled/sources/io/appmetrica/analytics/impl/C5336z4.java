package io.appmetrica.analytics.impl;

import xsna.vu5;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5336z4 extends C5003m3 {
    public final int b;

    public C5336z4(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.C5003m3
    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.b);
        sb.append(", bytesTruncated=");
        return vu5.b(sb, this.a, '}');
    }
}
