package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/AutoTopupWidgetDto;", "", "shouldShowWidget", "", "<init>", "(Z)V", "getShouldShowWidget", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupWidgetDto {
    private final boolean shouldShowWidget;

    public AutoTopupWidgetDto(@Json(name = "should_show_widget") boolean z) {
        this.shouldShowWidget = z;
    }

    public static /* synthetic */ AutoTopupWidgetDto copy$default(AutoTopupWidgetDto autoTopupWidgetDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoTopupWidgetDto.shouldShowWidget;
        }
        return autoTopupWidgetDto.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldShowWidget() {
        return this.shouldShowWidget;
    }

    public final AutoTopupWidgetDto copy(@Json(name = "should_show_widget") boolean shouldShowWidget) {
        return new AutoTopupWidgetDto(shouldShowWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoTopupWidgetDto) && this.shouldShowWidget == ((AutoTopupWidgetDto) other).shouldShowWidget;
    }

    public final boolean getShouldShowWidget() {
        return this.shouldShowWidget;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowWidget);
    }

    public String toString() {
        return nzs.b("AutoTopupWidgetDto(shouldShowWidget=", Extension.C_BRAKE, this.shouldShowWidget);
    }
}
