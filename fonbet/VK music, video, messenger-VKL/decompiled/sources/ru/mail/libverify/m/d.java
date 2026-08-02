package ru.mail.libverify.m;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class d extends ru.mail.libverify.k0.a<d, ru.mail.libverify.requests.d> {
    private InputStream content;
    private String eTag = "";
    private boolean isLoadedFromCache;

    public final void a(ByteArrayInputStream byteArrayInputStream) {
        this.content = byteArrayInputStream;
    }

    public final InputStream d() {
        return this.content;
    }

    public final void e() {
        this.isLoadedFromCache = true;
    }

    public final void a(String str) {
        this.eTag = str;
    }
}
