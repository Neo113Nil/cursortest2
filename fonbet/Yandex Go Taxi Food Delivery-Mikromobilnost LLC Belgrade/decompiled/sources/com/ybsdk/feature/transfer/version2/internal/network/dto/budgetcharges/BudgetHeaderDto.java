package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;", "", "title", "", "button", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderButtonDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderButtonDto;)V", "getTitle", "()Ljava/lang/String;", "getButton", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderButtonDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BudgetHeaderDto {
    private final BudgetHeaderButtonDto button;
    private final String title;

    public BudgetHeaderDto(@Json(name = "title") String str, @Json(name = "button") BudgetHeaderButtonDto budgetHeaderButtonDto) {
        this.title = str;
        this.button = budgetHeaderButtonDto;
    }

    public static /* synthetic */ BudgetHeaderDto copy$default(BudgetHeaderDto budgetHeaderDto, String str, BudgetHeaderButtonDto budgetHeaderButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = budgetHeaderDto.title;
        }
        if ((i & 2) != 0) {
            budgetHeaderButtonDto = budgetHeaderDto.button;
        }
        return budgetHeaderDto.copy(str, budgetHeaderButtonDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BudgetHeaderButtonDto getButton() {
        return this.button;
    }

    public final BudgetHeaderDto copy(@Json(name = "title") String title, @Json(name = "button") BudgetHeaderButtonDto button) {
        return new BudgetHeaderDto(title, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BudgetHeaderDto)) {
            return false;
        }
        BudgetHeaderDto budgetHeaderDto = (BudgetHeaderDto) other;
        return jl40.l(this.title, budgetHeaderDto.title) && jl40.l(this.button, budgetHeaderDto.button);
    }

    public final BudgetHeaderButtonDto getButton() {
        return this.button;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "BudgetHeaderDto(title=" + this.title + ", button=" + this.button + Extension.C_BRAKE;
    }
}
