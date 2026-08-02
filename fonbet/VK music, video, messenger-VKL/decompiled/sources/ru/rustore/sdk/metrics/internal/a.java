package ru.rustore.sdk.metrics.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* loaded from: classes9.dex */
public final class a extends Lambda implements izs<Byte, CharSequence> {
    public static final a i = new a();

    public a() {
        super(1);
    }

    @Override // xsna.izs
    public final CharSequence invoke(Byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
    }
}
