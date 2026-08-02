package org.jsoup;

import java.io.IOException;

/* loaded from: classes8.dex */
public class UnsupportedMimeTypeException extends IOException {
    private final String mimeType;
    private final String url;

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ". Mimetype=" + this.mimeType + ", URL=" + this.url;
    }
}
