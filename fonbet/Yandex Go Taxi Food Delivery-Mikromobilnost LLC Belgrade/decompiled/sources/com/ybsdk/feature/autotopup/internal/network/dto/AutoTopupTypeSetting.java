package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeSetting;", "", "selected", "", "autotopupType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeDto;", "title", "", "moneyFields", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupMoneyDto;", "<init>", "(ZLcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeDto;Ljava/lang/String;Ljava/util/List;)V", "getSelected", "()Z", "getAutotopupType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeDto;", "getTitle", "()Ljava/lang/String;", "getMoneyFields", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupTypeSetting {
    private final AutoTopupTypeDto autotopupType;
    private final List<AutoTopupMoneyDto> moneyFields;
    private final boolean selected;
    private final String title;

    public AutoTopupTypeSetting(@Json(name = "selected") boolean z, @Json(name = "autotopup_type") AutoTopupTypeDto autoTopupTypeDto, @Json(name = "title") String str, @Json(name = "money_fields") List<AutoTopupMoneyDto> list) {
        this.selected = z;
        this.autotopupType = autoTopupTypeDto;
        this.title = str;
        this.moneyFields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoTopupTypeSetting copy$default(AutoTopupTypeSetting autoTopupTypeSetting, boolean z, AutoTopupTypeDto autoTopupTypeDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoTopupTypeSetting.selected;
        }
        if ((i & 2) != 0) {
            autoTopupTypeDto = autoTopupTypeSetting.autotopupType;
        }
        if ((i & 4) != 0) {
            str = autoTopupTypeSetting.title;
        }
        if ((i & 8) != 0) {
            list = autoTopupTypeSetting.moneyFields;
        }
        return autoTopupTypeSetting.copy(z, autoTopupTypeDto, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupTypeDto getAutotopupType() {
        return this.autotopupType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<AutoTopupMoneyDto> component4() {
        return this.moneyFields;
    }

    public final AutoTopupTypeSetting copy(@Json(name = "selected") boolean selected, @Json(name = "autotopup_type") AutoTopupTypeDto autotopupType, @Json(name = "title") String title, @Json(name = "money_fields") List<AutoTopupMoneyDto> moneyFields) {
        return new AutoTopupTypeSetting(selected, autotopupType, title, moneyFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupTypeSetting)) {
            return false;
        }
        AutoTopupTypeSetting autoTopupTypeSetting = (AutoTopupTypeSetting) other;
        return this.selected == autoTopupTypeSetting.selected && this.autotopupType == autoTopupTypeSetting.autotopupType && jl40.l(this.title, autoTopupTypeSetting.title) && jl40.l(this.moneyFields, autoTopupTypeSetting.moneyFields);
    }

    public final AutoTopupTypeDto getAutotopupType() {
        return this.autotopupType;
    }

    public final List<AutoTopupMoneyDto> getMoneyFields() {
        return this.moneyFields;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b((this.autotopupType.hashCode() + (Boolean.hashCode(this.selected) * 31)) * 31, 31, this.title);
        List<AutoTopupMoneyDto> list = this.moneyFields;
        return b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z = this.selected;
        AutoTopupTypeDto autoTopupTypeDto = this.autotopupType;
        String str = this.title;
        List<AutoTopupMoneyDto> list = this.moneyFields;
        StringBuilder sb = new StringBuilder("AutoTopupTypeSetting(selected=");
        sb.append(z);
        sb.append(", autotopupType=");
        sb.append(autoTopupTypeDto);
        sb.append(", title=");
        return tse0.j(str, ", moneyFields=", Extension.C_BRAKE, sb, list);
    }
}
