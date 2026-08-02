package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcFailScreenData;", "", "", "title", "subtitle", "Lcom/ybsdk/rconfig/configs/NfcFailButtonData;", "primary", "secondary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/rconfig/configs/NfcFailButtonData;Lcom/ybsdk/rconfig/configs/NfcFailButtonData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/rconfig/configs/NfcFailButtonData;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/rconfig/configs/NfcFailButtonData;Lcom/ybsdk/rconfig/configs/NfcFailButtonData;)Lcom/ybsdk/rconfig/configs/NfcFailScreenData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/ybsdk/rconfig/configs/NfcFailButtonData;", "getPrimary", "getSecondary", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcFailScreenData {

    @Json(name = "primary")
    private final NfcFailButtonData primary;

    @Json(name = "secondary")
    private final NfcFailButtonData secondary;

    @Json(name = "subtitle")
    private final String subtitle;

    @Json(name = "title")
    private final String title;

    public NfcFailScreenData(String str, String str2, NfcFailButtonData nfcFailButtonData, NfcFailButtonData nfcFailButtonData2) {
        this.title = str;
        this.subtitle = str2;
        this.primary = nfcFailButtonData;
        this.secondary = nfcFailButtonData2;
    }

    public static /* synthetic */ NfcFailScreenData copy$default(NfcFailScreenData nfcFailScreenData, String str, String str2, NfcFailButtonData nfcFailButtonData, NfcFailButtonData nfcFailButtonData2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nfcFailScreenData.title;
        }
        if ((i & 2) != 0) {
            str2 = nfcFailScreenData.subtitle;
        }
        if ((i & 4) != 0) {
            nfcFailButtonData = nfcFailScreenData.primary;
        }
        if ((i & 8) != 0) {
            nfcFailButtonData2 = nfcFailScreenData.secondary;
        }
        return nfcFailScreenData.copy(str, str2, nfcFailButtonData, nfcFailButtonData2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcFailButtonData getPrimary() {
        return this.primary;
    }

    /* renamed from: component4, reason: from getter */
    public final NfcFailButtonData getSecondary() {
        return this.secondary;
    }

    public final NfcFailScreenData copy(String title, String subtitle, NfcFailButtonData primary, NfcFailButtonData secondary) {
        return new NfcFailScreenData(title, subtitle, primary, secondary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcFailScreenData)) {
            return false;
        }
        NfcFailScreenData nfcFailScreenData = (NfcFailScreenData) other;
        return jl40.l(this.title, nfcFailScreenData.title) && jl40.l(this.subtitle, nfcFailScreenData.subtitle) && jl40.l(this.primary, nfcFailScreenData.primary) && jl40.l(this.secondary, nfcFailScreenData.secondary);
    }

    public final NfcFailButtonData getPrimary() {
        return this.primary;
    }

    public final NfcFailButtonData getSecondary() {
        return this.secondary;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (this.primary.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        NfcFailButtonData nfcFailButtonData = this.secondary;
        return hashCode2 + (nfcFailButtonData != null ? nfcFailButtonData.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        NfcFailButtonData nfcFailButtonData = this.primary;
        NfcFailButtonData nfcFailButtonData2 = this.secondary;
        StringBuilder v = b64.v("NfcFailScreenData(title=", str, ", subtitle=", str2, ", primary=");
        v.append(nfcFailButtonData);
        v.append(", secondary=");
        v.append(nfcFailButtonData2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
