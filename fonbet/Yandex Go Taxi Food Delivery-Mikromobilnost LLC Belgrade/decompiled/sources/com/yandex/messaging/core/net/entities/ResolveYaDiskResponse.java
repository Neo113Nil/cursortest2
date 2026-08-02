package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ResolveYaDiskResponse;", "", "files", "", "Lcom/yandex/messaging/core/net/entities/ResolvedYaDiskFile;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", Constants.KEY_MESSAGE, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getFiles", "()Ljava/util/List;", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ResolveYaDiskResponse {
    private final String code;
    private final List<ResolvedYaDiskFile> files;
    private final String message;

    public ResolveYaDiskResponse(@Json(name = "files") List<ResolvedYaDiskFile> list, @Json(name = "code") String str, @Json(name = "message") String str2) {
        this.files = list;
        this.code = str;
        this.message = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolveYaDiskResponse copy$default(ResolveYaDiskResponse resolveYaDiskResponse, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = resolveYaDiskResponse.files;
        }
        if ((i & 2) != 0) {
            str = resolveYaDiskResponse.code;
        }
        if ((i & 4) != 0) {
            str2 = resolveYaDiskResponse.message;
        }
        return resolveYaDiskResponse.copy(list, str, str2);
    }

    public final List<ResolvedYaDiskFile> component1() {
        return this.files;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ResolveYaDiskResponse copy(@Json(name = "files") List<ResolvedYaDiskFile> files, @Json(name = "code") String code, @Json(name = "message") String message) {
        return new ResolveYaDiskResponse(files, code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveYaDiskResponse)) {
            return false;
        }
        ResolveYaDiskResponse resolveYaDiskResponse = (ResolveYaDiskResponse) other;
        return jl40.l(this.files, resolveYaDiskResponse.files) && jl40.l(this.code, resolveYaDiskResponse.code) && jl40.l(this.message, resolveYaDiskResponse.message);
    }

    public final String getCode() {
        return this.code;
    }

    public final List<ResolvedYaDiskFile> getFiles() {
        return this.files;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        List<ResolvedYaDiskFile> list = this.files;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<ResolvedYaDiskFile> list = this.files;
        String str = this.code;
        return oyr.t(xvz.s("ResolveYaDiskResponse(files=", list, ", code=", str, ", message="), this.message, Extension.C_BRAKE);
    }
}
