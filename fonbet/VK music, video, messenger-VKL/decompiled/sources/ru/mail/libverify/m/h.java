package ru.mail.libverify.m;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class h extends ru.mail.libverify.k0.a<h, ru.mail.libverify.requests.g> {
    private final long contentLength;
    private final int httpCode;

    @Nullable
    private final String locationHeader;

    public h(int i, @Nullable String str, long j) {
        this.httpCode = i;
        this.locationHeader = str;
        this.contentLength = j;
    }

    public final int d() {
        return this.httpCode;
    }

    @Nullable
    public final String e() {
        return this.locationHeader;
    }
}
