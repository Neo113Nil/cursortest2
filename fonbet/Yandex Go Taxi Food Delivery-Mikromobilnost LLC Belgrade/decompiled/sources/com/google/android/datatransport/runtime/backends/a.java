package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes.dex */
public final class a extends BackendResponse {
    public final BackendResponse.Status a;
    public final long b;

    public a(BackendResponse.Status status, long j) {
        if (status == null) {
            ny61.t("Null status");
            throw null;
        }
        this.a = status;
        this.b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.a.equals(backendResponse.b()) && this.b == backendResponse.a();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return oyr.n(this.b, "}", sb);
    }
}
