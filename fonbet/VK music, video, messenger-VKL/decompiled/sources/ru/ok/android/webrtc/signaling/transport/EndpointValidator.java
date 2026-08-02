package ru.ok.android.webrtc.signaling.transport;

import kotlin.text.Regex;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class EndpointValidator {
    public static final Companion Companion = new Companion(null);
    public static final Regex a = new Regex("^[a-zA-Z][a-zA-Z0-9+.-]*://\\S+$");

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public final boolean isEndpointValid(String str) {
        return a.f(str);
    }
}
