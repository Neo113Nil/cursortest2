package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundChargeItemDto;", "", "id", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "title", "subtitle", "value", "subvalue", "action", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "getSubtitle", "getValue", "getSubvalue", "getAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BudgetFoundChargeItemDto {
    private final String action;
    private final String id;
    private final Themes<String> image;
    private final String subtitle;
    private final String subvalue;
    private final String title;
    private final String value;

    public BudgetFoundChargeItemDto(@Json(name = "id") String str, @Json(name = "image") Themes<String> themes, @Json(name = "title") String str2, @Json(name = "subtitle") String str3, @Json(name = "value") String str4, @Json(name = "subvalue") String str5, @Json(name = "action") String str6) {
        this.id = str;
        this.image = themes;
        this.title = str2;
        this.subtitle = str3;
        this.value = str4;
        this.subvalue = str5;
        this.action = str6;
    }

    public static /* synthetic */ BudgetFoundChargeItemDto copy$default(BudgetFoundChargeItemDto budgetFoundChargeItemDto, String str, Themes themes, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = budgetFoundChargeItemDto.id;
        }
        if ((i & 2) != 0) {
            themes = budgetFoundChargeItemDto.image;
        }
        if ((i & 4) != 0) {
            str2 = budgetFoundChargeItemDto.title;
        }
        if ((i & 8) != 0) {
            str3 = budgetFoundChargeItemDto.subtitle;
        }
        if ((i & 16) != 0) {
            str4 = budgetFoundChargeItemDto.value;
        }
        if ((i & 32) != 0) {
            str5 = budgetFoundChargeItemDto.subvalue;
        }
        if ((i & 64) != 0) {
            str6 = budgetFoundChargeItemDto.action;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return budgetFoundChargeItemDto.copy(str, themes, str10, str3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Themes<String> component2() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubvalue() {
        return this.subvalue;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final BudgetFoundChargeItemDto copy(@Json(name = "id") String id, @Json(name = "image") Themes<String> image, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "value") String value, @Json(name = "subvalue") String subvalue, @Json(name = "action") String action) {
        return new BudgetFoundChargeItemDto(id, image, title, subtitle, value, subvalue, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BudgetFoundChargeItemDto)) {
            return false;
        }
        BudgetFoundChargeItemDto budgetFoundChargeItemDto = (BudgetFoundChargeItemDto) other;
        return jl40.l(this.id, budgetFoundChargeItemDto.id) && jl40.l(this.image, budgetFoundChargeItemDto.image) && jl40.l(this.title, budgetFoundChargeItemDto.title) && jl40.l(this.subtitle, budgetFoundChargeItemDto.subtitle) && jl40.l(this.value, budgetFoundChargeItemDto.value) && jl40.l(this.subvalue, budgetFoundChargeItemDto.subvalue) && jl40.l(this.action, budgetFoundChargeItemDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getId() {
        return this.id;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubvalue() {
        return this.subvalue;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int b = unr0.b(nnm.c(this.image, this.id.hashCode() * 31, 31), 31, this.title);
        String str = this.subtitle;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.value);
        String str2 = this.subvalue;
        return this.action.hashCode() + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        Themes<String> themes = this.image;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.value;
        String str5 = this.subvalue;
        String str6 = this.action;
        StringBuilder sb = new StringBuilder("BudgetFoundChargeItemDto(id=");
        sb.append(str);
        sb.append(", image=");
        sb.append(themes);
        sb.append(", title=");
        g8e.D(sb, str2, ", subtitle=", str3, ", value=");
        g8e.D(sb, str4, ", subvalue=", str5, ", action=");
        return oyr.t(sb, str6, Extension.C_BRAKE);
    }
}
