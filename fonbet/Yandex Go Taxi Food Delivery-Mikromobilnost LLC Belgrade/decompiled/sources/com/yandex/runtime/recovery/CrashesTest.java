package com.yandex.runtime.recovery;

/* loaded from: classes2.dex */
public class CrashesTest {
    public static native void causeAssertFail();

    public static native void causeRequireFail();

    public static native void causeSegfault();

    public static native void causeSwallowedException();
}
