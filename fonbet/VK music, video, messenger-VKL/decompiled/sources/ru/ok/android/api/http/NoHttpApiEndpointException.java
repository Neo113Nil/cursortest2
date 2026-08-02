package ru.ok.android.api.http;

import java.util.NoSuchElementException;

/* compiled from: NoHttpApiEndpointException.kt */
/* loaded from: classes9.dex */
public final class NoHttpApiEndpointException extends NoSuchElementException {
    public NoHttpApiEndpointException(String str) {
        super("No endpoint for authority ".concat(str));
    }
}
