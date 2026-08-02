package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Lambda;
import xsna.ho8;
import xsna.izs;
import xsna.swx;

/* loaded from: classes9.dex */
public final class G extends Lambda implements izs<swx, CharSequence> {
    public static final G i = new G();

    public G() {
        super(1);
    }

    @Override // xsna.izs
    public final CharSequence invoke(swx swxVar) {
        return ho8.a(new StringBuilder("'"), swxVar.a, '\'');
    }
}
