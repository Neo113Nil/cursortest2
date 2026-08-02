package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;", "", "server", "", "", "pcidss", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getServer", "()Ljava/util/List;", "getPcidss", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcPinsEnvironment {

    @Json(name = "pcidss_pins")
    private final List<String> pcidss;

    @Json(name = "server_pins")
    private final List<String> server;

    public NfcPinsEnvironment(List<String> list, List<String> list2) {
        this.server = list;
        this.pcidss = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcPinsEnvironment copy$default(NfcPinsEnvironment nfcPinsEnvironment, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nfcPinsEnvironment.server;
        }
        if ((i & 2) != 0) {
            list2 = nfcPinsEnvironment.pcidss;
        }
        return nfcPinsEnvironment.copy(list, list2);
    }

    public final List<String> component1() {
        return this.server;
    }

    public final List<String> component2() {
        return this.pcidss;
    }

    public final NfcPinsEnvironment copy(List<String> server, List<String> pcidss) {
        return new NfcPinsEnvironment(server, pcidss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPinsEnvironment)) {
            return false;
        }
        NfcPinsEnvironment nfcPinsEnvironment = (NfcPinsEnvironment) other;
        return jl40.l(this.server, nfcPinsEnvironment.server) && jl40.l(this.pcidss, nfcPinsEnvironment.pcidss);
    }

    public final List<String> getPcidss() {
        return this.pcidss;
    }

    public final List<String> getServer() {
        return this.server;
    }

    public int hashCode() {
        return this.pcidss.hashCode() + (this.server.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("NfcPinsEnvironment(server=", this.server, ", pcidss=", this.pcidss, Extension.C_BRAKE);
    }
}
