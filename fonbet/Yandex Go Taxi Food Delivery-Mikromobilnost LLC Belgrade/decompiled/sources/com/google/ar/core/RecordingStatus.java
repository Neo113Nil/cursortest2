package com.google.ar.core;

import defpackage.yx61;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);

    final int nativeCode;

    RecordingStatus(int i) {
        this.nativeCode = i;
    }

    public static RecordingStatus forNumber(int i) {
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i) {
                return recordingStatus;
            }
        }
        yx61.f(a0.a(Alerts.alert_decrypt_error, i, "Unexpected value for native RecordingStatus, value="));
        return null;
    }
}
