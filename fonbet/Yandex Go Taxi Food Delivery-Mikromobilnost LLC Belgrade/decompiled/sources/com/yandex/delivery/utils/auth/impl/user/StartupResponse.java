package com.yandex.delivery.utils.auth.impl.user;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/delivery/utils/auth/impl/user/StartupResponse;", "", "phone", "", "<init>", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "auth"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StartupResponse {
    private final String phone;

    public StartupResponse(@Json(name = "phone") String str) {
        this.phone = str;
    }

    public static /* synthetic */ StartupResponse copy$default(StartupResponse startupResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startupResponse.phone;
        }
        return startupResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final StartupResponse copy(@Json(name = "phone") String phone) {
        return new StartupResponse(phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StartupResponse) && jl40.l(this.phone, ((StartupResponse) other).phone);
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.phone;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return oyr.p("StartupResponse(phone=", this.phone, Extension.C_BRAKE);
    }
}
