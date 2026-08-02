package com.yandex.messaging.internal.net.file;

import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class FileProgressObservable$Listener$Status {
    private static final /* synthetic */ FileProgressObservable$Listener$Status[] $VALUES;
    public static final FileProgressObservable$Listener$Status CANCELED;
    public static final FileProgressObservable$Listener$Status ERROR;
    public static final FileProgressObservable$Listener$Status FINISHED;
    public static final FileProgressObservable$Listener$Status STARTED;
    public static final FileProgressObservable$Listener$Status UNKNOWN;

    static {
        FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status = new FileProgressObservable$Listener$Status("UNKNOWN", 0);
        UNKNOWN = fileProgressObservable$Listener$Status;
        FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status2 = new FileProgressObservable$Listener$Status("STARTED", 1);
        STARTED = fileProgressObservable$Listener$Status2;
        FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status3 = new FileProgressObservable$Listener$Status(TlsConstants.TLS_FINISHED, 2);
        FINISHED = fileProgressObservable$Listener$Status3;
        FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status4 = new FileProgressObservable$Listener$Status("CANCELED", 3);
        CANCELED = fileProgressObservable$Listener$Status4;
        FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status5 = new FileProgressObservable$Listener$Status("ERROR", 4);
        ERROR = fileProgressObservable$Listener$Status5;
        $VALUES = new FileProgressObservable$Listener$Status[]{fileProgressObservable$Listener$Status, fileProgressObservable$Listener$Status2, fileProgressObservable$Listener$Status3, fileProgressObservable$Listener$Status4, fileProgressObservable$Listener$Status5};
    }

    public static FileProgressObservable$Listener$Status valueOf(String str) {
        return (FileProgressObservable$Listener$Status) Enum.valueOf(FileProgressObservable$Listener$Status.class, str);
    }

    public static FileProgressObservable$Listener$Status[] values() {
        return (FileProgressObservable$Listener$Status[]) $VALUES.clone();
    }
}
