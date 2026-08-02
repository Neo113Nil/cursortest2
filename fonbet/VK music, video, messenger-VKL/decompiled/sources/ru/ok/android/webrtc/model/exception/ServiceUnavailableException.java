package ru.ok.android.webrtc.model.exception;

import xsna.ozl;

@ozl
/* loaded from: classes9.dex */
public class ServiceUnavailableException extends RuntimeException {
    public ServiceUnavailableException() {
        super("The server is unavailable");
    }
}
