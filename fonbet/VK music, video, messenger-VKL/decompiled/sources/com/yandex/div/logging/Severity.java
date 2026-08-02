package com.yandex.div.logging;

/* compiled from: Severity.kt */
/* loaded from: classes7.dex */
public enum Severity {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    public final boolean isAtLeast(Severity severity) {
        return ordinal() >= severity.ordinal();
    }
}
