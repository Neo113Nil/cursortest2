package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import defpackage.tse0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto;", "", "title", "Lcom/ybsdk/core/utils/text/Text;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto$Status;", "primaryButton", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto$Status;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;)V", "getTitle", "()Lcom/ybsdk/core/utils/text/Text;", "getDescription", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto$Status;", "getPrimaryButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatusDataDto {
    private final Text description;
    private final ThemedParameter<String> logo;
    private final ActionButtonDto primaryButton;
    private final Status status;
    private final Text title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status ERROR = new Status("ERROR", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, ERROR};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public StatusDataDto(@Json(name = "title") Text text, @Json(name = "description") Text text2, @Json(name = "logo") ThemedParameter<String> themedParameter, @Json(name = "status") Status status, @Json(name = "primary_button") ActionButtonDto actionButtonDto) {
        this.title = text;
        this.description = text2;
        this.logo = themedParameter;
        this.status = status;
        this.primaryButton = actionButtonDto;
    }

    public static /* synthetic */ StatusDataDto copy$default(StatusDataDto statusDataDto, Text text, Text text2, ThemedParameter themedParameter, Status status, ActionButtonDto actionButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            text = statusDataDto.title;
        }
        if ((i & 2) != 0) {
            text2 = statusDataDto.description;
        }
        if ((i & 4) != 0) {
            themedParameter = statusDataDto.logo;
        }
        if ((i & 8) != 0) {
            status = statusDataDto.status;
        }
        if ((i & 16) != 0) {
            actionButtonDto = statusDataDto.primaryButton;
        }
        ActionButtonDto actionButtonDto2 = actionButtonDto;
        ThemedParameter themedParameter2 = themedParameter;
        return statusDataDto.copy(text, text2, themedParameter2, status, actionButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getDescription() {
        return this.description;
    }

    public final ThemedParameter<String> component3() {
        return this.logo;
    }

    /* renamed from: component4, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final StatusDataDto copy(@Json(name = "title") Text title, @Json(name = "description") Text description, @Json(name = "logo") ThemedParameter<String> logo, @Json(name = "status") Status status, @Json(name = "primary_button") ActionButtonDto primaryButton) {
        return new StatusDataDto(title, description, logo, status, primaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusDataDto)) {
            return false;
        }
        StatusDataDto statusDataDto = (StatusDataDto) other;
        return jl40.l(this.title, statusDataDto.title) && jl40.l(this.description, statusDataDto.description) && jl40.l(this.logo, statusDataDto.logo) && this.status == statusDataDto.status && jl40.l(this.primaryButton, statusDataDto.primaryButton);
    }

    public final Text getDescription() {
        return this.description;
    }

    public final ThemedParameter<String> getLogo() {
        return this.logo;
    }

    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.primaryButton.hashCode() + ((this.status.hashCode() + tse0.d(this.logo, n.c(this.description, this.title.hashCode() * 31, 31), 31)) * 31);
    }

    public String toString() {
        Text text = this.title;
        Text text2 = this.description;
        ThemedParameter<String> themedParameter = this.logo;
        Status status = this.status;
        ActionButtonDto actionButtonDto = this.primaryButton;
        StringBuilder p = n.p("StatusDataDto(title=", text, ", description=", text2, ", logo=");
        p.append(themedParameter);
        p.append(", status=");
        p.append(status);
        p.append(", primaryButton=");
        p.append(actionButtonDto);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
