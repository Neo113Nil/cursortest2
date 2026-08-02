package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.ho8;

/* loaded from: classes8.dex */
public class Response {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private final Map e;
    private final Throwable f;
    private final String g;

    public Response(@Nullable Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.d;
    }

    @Nullable
    public Throwable getException() {
        return this.f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.c;
    }

    @Nullable
    public String getUrl() {
        return this.g;
    }

    public boolean isCompleted() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response{completed=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", responseDataLength=");
        sb.append(this.c.length);
        sb.append(", errorDataLength=");
        sb.append(this.d.length);
        sb.append(", headers=");
        sb.append(this.e);
        sb.append(", exception=");
        sb.append(this.f);
        sb.append(", url=");
        return ho8.a(sb, this.g, '}');
    }

    public Response(boolean z, int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th) {
        this(z, i, bArr, bArr2, map, th, null);
    }

    public Response(boolean z, int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th, @Nullable String str) {
        Map a;
        this.a = z;
        this.b = i;
        this.c = bArr;
        this.d = bArr2;
        if (map == null) {
            a = Collections.EMPTY_MAP;
        } else {
            a = e.a(map);
        }
        this.e = a;
        this.f = th;
        this.g = str;
    }
}
