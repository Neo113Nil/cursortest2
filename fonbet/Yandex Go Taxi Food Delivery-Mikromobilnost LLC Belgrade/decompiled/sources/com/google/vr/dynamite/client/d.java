package com.google.vr.dynamite.client;

import defpackage.unr0;

/* loaded from: classes11.dex */
public final class d extends Exception {
    private final int a = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.a != 1 ? "Unknown error" : "Package not available";
        return unr0.r(new StringBuilder(str.length() + 17), "LoaderException{", str, "}");
    }
}
