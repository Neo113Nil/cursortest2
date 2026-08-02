package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "", "title", "", "subtitle", "bottomDivKitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "closeAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBottomDivKitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getCloseAction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatusScreenData {
    private final DivDataDto bottomDivKitData;
    private final String closeAction;
    private final String subtitle;
    private final String title;

    public StatusScreenData(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "bottom_divkit_data") DivDataDto divDataDto, @Json(name = "close_action") String str3) {
        this.title = str;
        this.subtitle = str2;
        this.bottomDivKitData = divDataDto;
        this.closeAction = str3;
    }

    public static /* synthetic */ StatusScreenData copy$default(StatusScreenData statusScreenData, String str, String str2, DivDataDto divDataDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusScreenData.title;
        }
        if ((i & 2) != 0) {
            str2 = statusScreenData.subtitle;
        }
        if ((i & 4) != 0) {
            divDataDto = statusScreenData.bottomDivKitData;
        }
        if ((i & 8) != 0) {
            str3 = statusScreenData.closeAction;
        }
        return statusScreenData.copy(str, str2, divDataDto, str3);
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
    public final DivDataDto getBottomDivKitData() {
        return this.bottomDivKitData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final StatusScreenData copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "bottom_divkit_data") DivDataDto bottomDivKitData, @Json(name = "close_action") String closeAction) {
        return new StatusScreenData(title, subtitle, bottomDivKitData, closeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusScreenData)) {
            return false;
        }
        StatusScreenData statusScreenData = (StatusScreenData) other;
        return jl40.l(this.title, statusScreenData.title) && jl40.l(this.subtitle, statusScreenData.subtitle) && jl40.l(this.bottomDivKitData, statusScreenData.bottomDivKitData) && jl40.l(this.closeAction, statusScreenData.closeAction);
    }

    public final DivDataDto getBottomDivKitData() {
        return this.bottomDivKitData;
    }

    public final String getCloseAction() {
        return this.closeAction;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivDataDto divDataDto = this.bottomDivKitData;
        int hashCode3 = (hashCode2 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        String str2 = this.closeAction;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        DivDataDto divDataDto = this.bottomDivKitData;
        String str3 = this.closeAction;
        StringBuilder v = b64.v("StatusScreenData(title=", str, ", subtitle=", str2, ", bottomDivKitData=");
        v.append(divDataDto);
        v.append(", closeAction=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
