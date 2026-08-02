package ru.ok.android.webrtc.protocol.screenshare;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes9.dex */
public class DataChannelUtils {
    public static void releaseHandlerThread(HandlerThread handlerThread, Handler handler, Runnable runnable) {
        handler.removeCallbacksAndMessages(null);
        if (runnable != null) {
            handler.post(runnable);
        }
        handlerThread.quitSafely();
    }
}
