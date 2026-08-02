package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes11.dex */
public class CustomSchemeResponse {
    private String contentEncoding;
    private String contentType;
    private byte[] data;

    public CustomSchemeResponse(byte[] bArr, String str, String str2) {
        this.data = bArr;
        this.contentType = str;
        this.contentEncoding = str2;
    }

    public static CustomSchemeResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomSchemeResponse((byte[]) map.get(Constants.KEY_DATA), (String) map.get("contentType"), (String) map.get("contentEncoding"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomSchemeResponse customSchemeResponse = (CustomSchemeResponse) obj;
        if (Arrays.equals(this.data, customSchemeResponse.data) && this.contentType.equals(customSchemeResponse.contentType)) {
            return this.contentEncoding.equals(customSchemeResponse.contentEncoding);
        }
        return false;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public String getContentType() {
        return this.contentType;
    }

    public byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        return this.contentEncoding.hashCode() + unr0.b(Arrays.hashCode(this.data) * 31, 31, this.contentType);
    }

    public void setContentEncoding(String str) {
        this.contentEncoding = str;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomSchemeResponse{data=");
        sb.append(Arrays.toString(this.data));
        sb.append(", contentType='");
        sb.append(this.contentType);
        sb.append("', contentEncoding='");
        return oyr.t(sb, this.contentEncoding, "'}");
    }
}
