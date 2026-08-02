package io.appmetrica.analytics.impl;

import xsna.emb;

/* loaded from: classes8.dex */
public abstract class S9 {
    public static final M9 a(int i, String str) {
        byte[] bArr;
        M9 m9 = new M9();
        m9.a = i;
        if (str == null || (bArr = str.getBytes(emb.b)) == null) {
            bArr = m9.b;
        }
        m9.b = bArr;
        return m9;
    }
}
