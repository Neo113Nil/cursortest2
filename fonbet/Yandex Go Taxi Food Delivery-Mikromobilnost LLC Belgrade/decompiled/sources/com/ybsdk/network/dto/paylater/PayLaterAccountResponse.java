package com.ybsdk.network.dto.paylater;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponse;", "", "preScoreResolution", "Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponse$PreScoreResolution;", "accountUrl", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "descriptionType", "<init>", "(Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponse$PreScoreResolution;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Ljava/lang/String;)V", "getPreScoreResolution", "()Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponse$PreScoreResolution;", "getAccountUrl", "()Ljava/lang/String;", "getDescription", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "getDescriptionType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PreScoreResolution", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PayLaterAccountResponse {
    private final String accountUrl;
    private final ColoredTextDto description;
    private final String descriptionType;
    private final PreScoreResolution preScoreResolution;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/network/dto/paylater/PayLaterAccountResponse$PreScoreResolution;", "", "<init>", "(Ljava/lang/String;I)V", "ALLOW", "DENY", "COMPLETED", "BLOCKED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreScoreResolution {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PreScoreResolution[] $VALUES;
        public static final PreScoreResolution ALLOW = new PreScoreResolution("ALLOW", 0);
        public static final PreScoreResolution DENY = new PreScoreResolution("DENY", 1);
        public static final PreScoreResolution COMPLETED = new PreScoreResolution("COMPLETED", 2);
        public static final PreScoreResolution BLOCKED = new PreScoreResolution("BLOCKED", 3);

        private static final /* synthetic */ PreScoreResolution[] $values() {
            return new PreScoreResolution[]{ALLOW, DENY, COMPLETED, BLOCKED};
        }

        static {
            PreScoreResolution[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PreScoreResolution(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PreScoreResolution valueOf(String str) {
            return (PreScoreResolution) Enum.valueOf(PreScoreResolution.class, str);
        }

        public static PreScoreResolution[] values() {
            return (PreScoreResolution[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PayLaterAccountResponse(PreScoreResolution preScoreResolution, String str, ColoredTextDto coloredTextDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(preScoreResolution, str, (i & 4) != 0 ? null : coloredTextDto, (i & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ PayLaterAccountResponse copy$default(PayLaterAccountResponse payLaterAccountResponse, PreScoreResolution preScoreResolution, String str, ColoredTextDto coloredTextDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            preScoreResolution = payLaterAccountResponse.preScoreResolution;
        }
        if ((i & 2) != 0) {
            str = payLaterAccountResponse.accountUrl;
        }
        if ((i & 4) != 0) {
            coloredTextDto = payLaterAccountResponse.description;
        }
        if ((i & 8) != 0) {
            str2 = payLaterAccountResponse.descriptionType;
        }
        return payLaterAccountResponse.copy(preScoreResolution, str, coloredTextDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PreScoreResolution getPreScoreResolution() {
        return this.preScoreResolution;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountUrl() {
        return this.accountUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final ColoredTextDto getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescriptionType() {
        return this.descriptionType;
    }

    public final PayLaterAccountResponse copy(@Json(name = "resolution") PreScoreResolution preScoreResolution, @Json(name = "url") String accountUrl, @Json(name = "description") ColoredTextDto description, @Json(name = "description_type") String descriptionType) {
        return new PayLaterAccountResponse(preScoreResolution, accountUrl, description, descriptionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayLaterAccountResponse)) {
            return false;
        }
        PayLaterAccountResponse payLaterAccountResponse = (PayLaterAccountResponse) other;
        return this.preScoreResolution == payLaterAccountResponse.preScoreResolution && jl40.l(this.accountUrl, payLaterAccountResponse.accountUrl) && jl40.l(this.description, payLaterAccountResponse.description) && jl40.l(this.descriptionType, payLaterAccountResponse.descriptionType);
    }

    public final String getAccountUrl() {
        return this.accountUrl;
    }

    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final String getDescriptionType() {
        return this.descriptionType;
    }

    public final PreScoreResolution getPreScoreResolution() {
        return this.preScoreResolution;
    }

    public int hashCode() {
        int b = unr0.b(this.preScoreResolution.hashCode() * 31, 31, this.accountUrl);
        ColoredTextDto coloredTextDto = this.description;
        int hashCode = (b + (coloredTextDto == null ? 0 : coloredTextDto.hashCode())) * 31;
        String str = this.descriptionType;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PayLaterAccountResponse(preScoreResolution=" + this.preScoreResolution + ", accountUrl=" + this.accountUrl + ", description=" + this.description + ", descriptionType=" + this.descriptionType + Extension.C_BRAKE;
    }

    public PayLaterAccountResponse(@Json(name = "resolution") PreScoreResolution preScoreResolution, @Json(name = "url") String str, @Json(name = "description") ColoredTextDto coloredTextDto, @Json(name = "description_type") String str2) {
        this.preScoreResolution = preScoreResolution;
        this.accountUrl = str;
        this.description = coloredTextDto;
        this.descriptionType = str2;
    }
}
