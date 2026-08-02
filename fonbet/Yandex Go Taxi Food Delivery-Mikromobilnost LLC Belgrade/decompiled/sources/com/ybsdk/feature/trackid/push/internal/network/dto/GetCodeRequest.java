package com.ybsdk.feature.trackid.push.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/trackid/push/internal/network/dto/GetCodeRequest;", "", "trackId", "", "<init>", "(Ljava/lang/String;)V", "getTrackId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trackid-push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetCodeRequest {

    @Json(name = "track_id")
    private final String trackId;

    public GetCodeRequest(String str) {
        this.trackId = str;
    }

    public static /* synthetic */ GetCodeRequest copy$default(GetCodeRequest getCodeRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCodeRequest.trackId;
        }
        return getCodeRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    public final GetCodeRequest copy(String trackId) {
        return new GetCodeRequest(trackId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetCodeRequest) && jl40.l(this.trackId, ((GetCodeRequest) other).trackId);
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return this.trackId.hashCode();
    }

    public String toString() {
        return oyr.p("GetCodeRequest(trackId=", this.trackId, Extension.C_BRAKE);
    }
}
