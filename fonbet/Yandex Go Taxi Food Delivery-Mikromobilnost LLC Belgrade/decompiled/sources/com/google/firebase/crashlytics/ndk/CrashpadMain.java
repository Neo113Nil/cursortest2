package com.google.firebase.crashlytics.ndk;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class CrashpadMain {
    public static native void crashpadMain(String[] strArr);

    public static void main(String[] strArr) {
        try {
            System.load(strArr[1] + "libcrashlytics-handler.so");
            crashpadMain(strArr);
        } catch (UnsatisfiedLinkError e) {
            ny61.j(e);
        }
    }
}
