package com.google.ar.core;

import defpackage.yx61;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);

    final int nativeCode;

    PlaybackStatus(int i) {
        this.nativeCode = i;
    }

    public static PlaybackStatus forNumber(int i) {
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i) {
                return playbackStatus;
            }
        }
        yx61.f(a0.a(Alerts.alert_decode_error, i, "Unexpected value for native PlaybackStatus, value="));
        return null;
    }
}
