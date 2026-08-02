package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/OpenEsiaIdentificationParams;", "", "", "esiaStartDeeplink", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/OpenEsiaIdentificationParams;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEsiaStartDeeplink", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OpenEsiaIdentificationParams {

    @Json(name = "esia_start_deeplink")
    private final String esiaStartDeeplink;

    public OpenEsiaIdentificationParams(String str) {
        this.esiaStartDeeplink = str;
    }

    public static /* synthetic */ OpenEsiaIdentificationParams copy$default(OpenEsiaIdentificationParams openEsiaIdentificationParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openEsiaIdentificationParams.esiaStartDeeplink;
        }
        return openEsiaIdentificationParams.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEsiaStartDeeplink() {
        return this.esiaStartDeeplink;
    }

    public final OpenEsiaIdentificationParams copy(String esiaStartDeeplink) {
        return new OpenEsiaIdentificationParams(esiaStartDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenEsiaIdentificationParams) && jl40.l(this.esiaStartDeeplink, ((OpenEsiaIdentificationParams) other).esiaStartDeeplink);
    }

    public final String getEsiaStartDeeplink() {
        return this.esiaStartDeeplink;
    }

    public int hashCode() {
        String str = this.esiaStartDeeplink;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return oyr.p("OpenEsiaIdentificationParams(esiaStartDeeplink=", this.esiaStartDeeplink, Extension.C_BRAKE);
    }
}
