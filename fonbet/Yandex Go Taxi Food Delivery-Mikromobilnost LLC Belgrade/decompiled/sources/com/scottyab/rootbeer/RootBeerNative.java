package com.scottyab.rootbeer;

import defpackage.zba1;

/* loaded from: classes11.dex */
public class RootBeerNative {
    public static final boolean a;

    static {
        try {
            System.loadLibrary("toolChecker");
            a = true;
        } catch (UnsatisfiedLinkError e) {
            zba1.b(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
