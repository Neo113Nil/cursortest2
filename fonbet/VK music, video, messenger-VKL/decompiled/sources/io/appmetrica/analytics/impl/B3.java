package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import xsna.zr;

/* loaded from: classes8.dex */
public final class B3 implements K5 {
    @Override // io.appmetrica.analytics.impl.K5, xsna.izs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c = AbstractC5166sb.c(asString);
        if (Pm.a(c)) {
            return c;
        }
        AbstractC5097pj.a(zr.a("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
