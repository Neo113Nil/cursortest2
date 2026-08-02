package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/FpsPayReturnDeeplink;", "", "", AppSettingsContract$Setting.COLUMN_PREFIX, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/FpsPayReturnDeeplink;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrefix", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FpsPayReturnDeeplink {

    @Json(name = AppSettingsContract$Setting.COLUMN_PREFIX)
    private final String prefix;

    public FpsPayReturnDeeplink(String str) {
        this.prefix = str;
    }

    public static /* synthetic */ FpsPayReturnDeeplink copy$default(FpsPayReturnDeeplink fpsPayReturnDeeplink, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fpsPayReturnDeeplink.prefix;
        }
        return fpsPayReturnDeeplink.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    public final FpsPayReturnDeeplink copy(String prefix) {
        return new FpsPayReturnDeeplink(prefix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FpsPayReturnDeeplink) && jl40.l(this.prefix, ((FpsPayReturnDeeplink) other).prefix);
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        return this.prefix.hashCode();
    }

    public String toString() {
        return oyr.p("FpsPayReturnDeeplink(prefix=", this.prefix, Extension.C_BRAKE);
    }
}
