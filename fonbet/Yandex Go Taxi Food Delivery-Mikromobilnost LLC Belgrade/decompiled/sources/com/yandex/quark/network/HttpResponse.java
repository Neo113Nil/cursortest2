package com.yandex.quark.network;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.unr0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/yandex/quark/network/HttpResponse;", "", Constants.INTENT_PARAM_RESPONSE_CODE, "", "body", "", ErrorResponseData.JSON_ERROR_CODE, "Lcom/yandex/quark/network/HttpErrorCode;", "<init>", "(I[BLcom/yandex/quark/network/HttpErrorCode;)V", "getResponseCode", "()I", "getBody", "()[B", "getErrorCode", "()Lcom/yandex/quark/network/HttpErrorCode;", "equals", "", "other", "hashCode", "component1", "component2", "component3", "copy", "toString", "", "quark-core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HttpResponse {
    private final byte[] body;
    private final HttpErrorCode errorCode;
    private final int responseCode;

    public HttpResponse(int i, byte[] bArr, HttpErrorCode httpErrorCode) {
        this.responseCode = i;
        this.body = bArr;
        this.errorCode = httpErrorCode;
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, int i, byte[] bArr, HttpErrorCode httpErrorCode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = httpResponse.responseCode;
        }
        if ((i2 & 2) != 0) {
            bArr = httpResponse.body;
        }
        if ((i2 & 4) != 0) {
            httpErrorCode = httpResponse.errorCode;
        }
        return httpResponse.copy(i, bArr, httpErrorCode);
    }

    /* renamed from: component1, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final HttpErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final HttpResponse copy(int responseCode, byte[] body, HttpErrorCode errorCode) {
        return new HttpResponse(responseCode, body, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!HttpResponse.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return this.responseCode == httpResponse.responseCode && Arrays.equals(this.body, httpResponse.body) && this.errorCode == httpResponse.errorCode;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final HttpErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public int hashCode() {
        return this.errorCode.hashCode() + ((Arrays.hashCode(this.body) + (this.responseCode * 31)) * 31);
    }

    public String toString() {
        int i = this.responseCode;
        String arrays = Arrays.toString(this.body);
        HttpErrorCode httpErrorCode = this.errorCode;
        StringBuilder v = unr0.v(i, "HttpResponse(responseCode=", ", body=", arrays, ", errorCode=");
        v.append(httpErrorCode);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ HttpResponse(int i, byte[] bArr, HttpErrorCode httpErrorCode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bArr, (i2 & 4) != 0 ? HttpErrorCode.NONE : httpErrorCode);
    }
}
