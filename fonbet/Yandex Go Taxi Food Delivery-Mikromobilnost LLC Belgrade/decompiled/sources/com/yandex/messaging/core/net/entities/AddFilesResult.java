package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.g8e;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/AddFilesResult;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", ACSPConstants.STATUS, "", "fileId", "text", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/String;", "getFileId", "getText", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/AddFilesResult;", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddFilesResult {
    private final Integer code;
    private final String fileId;
    private final String status;
    private final String text;

    public AddFilesResult(@Json(name = "code") Integer num, @Json(name = "status") String str, @Json(name = "id") String str2, @Json(name = "text") String str3) {
        this.code = num;
        this.status = str;
        this.fileId = str2;
        this.text = str3;
    }

    public static /* synthetic */ AddFilesResult copy$default(AddFilesResult addFilesResult, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = addFilesResult.code;
        }
        if ((i & 2) != 0) {
            str = addFilesResult.status;
        }
        if ((i & 4) != 0) {
            str2 = addFilesResult.fileId;
        }
        if ((i & 8) != 0) {
            str3 = addFilesResult.text;
        }
        return addFilesResult.copy(num, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final AddFilesResult copy(@Json(name = "code") Integer code, @Json(name = "status") String status, @Json(name = "id") String fileId, @Json(name = "text") String text) {
        return new AddFilesResult(code, status, fileId, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddFilesResult)) {
            return false;
        }
        AddFilesResult addFilesResult = (AddFilesResult) other;
        return jl40.l(this.code, addFilesResult.code) && jl40.l(this.status, addFilesResult.status) && jl40.l(this.fileId, addFilesResult.fileId) && jl40.l(this.text, addFilesResult.text);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.code;
        String str = this.status;
        String str2 = this.fileId;
        String str3 = this.text;
        StringBuilder sb = new StringBuilder("AddFilesResult(code=");
        sb.append(num);
        sb.append(", status=");
        sb.append(str);
        sb.append(", fileId=");
        return g8e.r(sb, str2, ", text=", str3, Extension.C_BRAKE);
    }
}
