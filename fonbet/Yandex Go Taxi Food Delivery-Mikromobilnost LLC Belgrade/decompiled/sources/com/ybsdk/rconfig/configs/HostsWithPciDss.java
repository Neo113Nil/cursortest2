package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/HostsWithPciDss;", "", "regular", "", "pciDss", "uz", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRegular", "()Ljava/lang/String;", "getPciDss", "getUz", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HostsWithPciDss {

    @Json(name = "pci_dss")
    private final String pciDss;

    @Json(name = "regular")
    private final String regular;

    @Json(name = "uz")
    private final String uz;

    public HostsWithPciDss(String str, String str2, String str3) {
        this.regular = str;
        this.pciDss = str2;
        this.uz = str3;
    }

    public static /* synthetic */ HostsWithPciDss copy$default(HostsWithPciDss hostsWithPciDss, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hostsWithPciDss.regular;
        }
        if ((i & 2) != 0) {
            str2 = hostsWithPciDss.pciDss;
        }
        if ((i & 4) != 0) {
            str3 = hostsWithPciDss.uz;
        }
        return hostsWithPciDss.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRegular() {
        return this.regular;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPciDss() {
        return this.pciDss;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUz() {
        return this.uz;
    }

    public final HostsWithPciDss copy(String regular, String pciDss, String uz) {
        return new HostsWithPciDss(regular, pciDss, uz);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostsWithPciDss)) {
            return false;
        }
        HostsWithPciDss hostsWithPciDss = (HostsWithPciDss) other;
        return jl40.l(this.regular, hostsWithPciDss.regular) && jl40.l(this.pciDss, hostsWithPciDss.pciDss) && jl40.l(this.uz, hostsWithPciDss.uz);
    }

    public final String getPciDss() {
        return this.pciDss;
    }

    public final String getRegular() {
        return this.regular;
    }

    public final String getUz() {
        return this.uz;
    }

    public int hashCode() {
        int b = unr0.b(this.regular.hashCode() * 31, 31, this.pciDss);
        String str = this.uz;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.regular;
        String str2 = this.pciDss;
        return oyr.t(b64.v("HostsWithPciDss(regular=", str, ", pciDss=", str2, ", uz="), this.uz, Extension.C_BRAKE);
    }
}
