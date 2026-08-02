package ru.ok.android.commons.http;

import xsna.brm0;
import xsna.pzl;

/* compiled from: HttpHeader.kt */
/* loaded from: classes9.dex */
public final class HttpHeader {
    private final String name;
    private final String value;

    public HttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean nameMatches(String str) {
        return brm0.w(this.name, str, true);
    }

    public String toString() {
        return pzl.b(this.name, ": ", this.value);
    }
}
