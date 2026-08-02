package org.webrtc;

import android.content.Context;

/* loaded from: classes9.dex */
public class ApplicationContextProvider {
    @CalledByNative
    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }
}
