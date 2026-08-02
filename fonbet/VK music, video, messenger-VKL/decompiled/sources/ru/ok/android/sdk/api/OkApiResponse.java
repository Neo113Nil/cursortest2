package ru.ok.android.sdk.api;

import xsna.epx;
import xsna.so;

/* compiled from: OkApiInterceptor.kt */
/* loaded from: classes9.dex */
public final class OkApiResponse {
    private final Object response;

    public OkApiResponse(Object obj) {
        this.response = obj;
    }

    public static /* synthetic */ OkApiResponse copy$default(OkApiResponse okApiResponse, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = okApiResponse.response;
        }
        return okApiResponse.copy(obj);
    }

    public final Object component1() {
        return this.response;
    }

    public final OkApiResponse copy(Object obj) {
        return new OkApiResponse(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OkApiResponse) && epx.f(this.response, ((OkApiResponse) obj).response);
    }

    public final Object getResponse() {
        return this.response;
    }

    public int hashCode() {
        Object obj = this.response;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return so.a(this.response, "OkApiResponse(response=", ")");
    }
}
