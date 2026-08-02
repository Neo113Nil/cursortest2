package ru.ok.android.externcalls.sdk.api;

/* compiled from: JoinByIdResponse.kt */
/* loaded from: classes9.dex */
public final class JoinByIdResponse {
    private final int deviceIndex;
    private final String endpoint;
    private final boolean p2pForbidden;

    public JoinByIdResponse(boolean z, String str, int i) {
        this.p2pForbidden = z;
        this.endpoint = str;
        this.deviceIndex = i;
    }

    public final int getDeviceIndex() {
        return this.deviceIndex;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final boolean getP2pForbidden() {
        return this.p2pForbidden;
    }
}
