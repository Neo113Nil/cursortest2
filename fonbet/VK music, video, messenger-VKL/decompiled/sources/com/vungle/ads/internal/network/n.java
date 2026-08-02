package com.vungle.ads.internal.network;

/* loaded from: classes7.dex */
public abstract class n {
    public static o a(Object obj, okhttp3.u uVar) {
        if (uVar.t()) {
            return new o(uVar, obj, 0);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static o a(okhttp3.u uVar) {
        if (!uVar.t()) {
            return new o(uVar, null, 0);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }
}
