package com.cloudwebrtc.webrtc.utils;

import org.webrtc.EglBase;

/* loaded from: classes10.dex */
public class EglUtils {
    private static EglBase rootEglBase;

    public static synchronized EglBase getRootEglBase() {
        EglBase eglBase;
        synchronized (EglUtils.class) {
            try {
                if (rootEglBase == null) {
                    rootEglBase = EglBase.create();
                }
                eglBase = rootEglBase;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eglBase;
    }

    public static EglBase.Context getRootEglBaseContext() {
        EglBase rootEglBase2 = getRootEglBase();
        if (rootEglBase2 == null) {
            return null;
        }
        return rootEglBase2.getEglBaseContext();
    }
}
