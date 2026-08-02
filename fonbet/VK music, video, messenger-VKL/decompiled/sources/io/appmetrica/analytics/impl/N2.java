package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import xsna.emb;
import xsna.i5s;

/* loaded from: classes8.dex */
public class N2 implements ExternalAttribution {
    public final M9 a;

    public N2(M9 m9) {
        this.a = m9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(W9.a(this.a.a));
        sb.append("`value=`");
        return i5s.a(sb, new String(this.a.b, emb.b), "`)");
    }
}
