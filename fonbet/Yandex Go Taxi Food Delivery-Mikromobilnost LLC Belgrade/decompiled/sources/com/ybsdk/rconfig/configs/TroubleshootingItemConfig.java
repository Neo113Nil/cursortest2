package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/TroubleshootingItemConfig;", "", "order", "", "title", "", "<init>", "(ILjava/lang/String;)V", "getOrder", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TroubleshootingItemConfig {

    @Json(name = "order")
    private final int order;

    @Json(name = "title")
    private final String title;

    public TroubleshootingItemConfig(int i, String str) {
        this.order = i;
        this.title = str;
    }

    public static /* synthetic */ TroubleshootingItemConfig copy$default(TroubleshootingItemConfig troubleshootingItemConfig, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = troubleshootingItemConfig.order;
        }
        if ((i2 & 2) != 0) {
            str = troubleshootingItemConfig.title;
        }
        return troubleshootingItemConfig.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final TroubleshootingItemConfig copy(int order, String title) {
        return new TroubleshootingItemConfig(order, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TroubleshootingItemConfig)) {
            return false;
        }
        TroubleshootingItemConfig troubleshootingItemConfig = (TroubleshootingItemConfig) other;
        return this.order == troubleshootingItemConfig.order && jl40.l(this.title, troubleshootingItemConfig.title);
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.order) * 31);
    }

    public String toString() {
        return oyr.l(this.order, "TroubleshootingItemConfig(order=", ", title=", this.title, Extension.C_BRAKE);
    }
}
