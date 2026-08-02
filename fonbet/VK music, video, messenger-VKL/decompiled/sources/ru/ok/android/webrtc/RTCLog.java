package ru.ok.android.webrtc;

import xsna.zcl;

/* compiled from: RTCLog.kt */
/* loaded from: classes9.dex */
public interface RTCLog {

    /* compiled from: RTCLog.kt */
    public static final class NoOp implements RTCLog {
        public static final Companion Companion = new Companion(null);
        public static final NoOp INSTANCE = new NoOp();

        /* compiled from: RTCLog.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            private Companion() {
            }
        }
    }

    default void log(String str, String str2) {
    }

    default void logException(String str, String str2, Throwable th) {
    }

    default void reportException(String str, String str2, Throwable th) {
    }
}
