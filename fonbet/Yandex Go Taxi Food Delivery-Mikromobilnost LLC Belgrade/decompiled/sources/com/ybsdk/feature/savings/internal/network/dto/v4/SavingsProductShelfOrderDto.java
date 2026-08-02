package com.ybsdk.feature.savings.internal.network.dto.v4;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsProductShelfOrderDto;", "", "shelfId", "", "agreementsList", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getShelfId", "()Ljava/lang/String;", "getAgreementsList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsProductShelfOrderDto {

    @Json(name = "agreements_list")
    private final List<String> agreementsList;

    @Json(name = "shelf_id")
    private final String shelfId;

    public SavingsProductShelfOrderDto(String str, List<String> list) {
        this.shelfId = str;
        this.agreementsList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavingsProductShelfOrderDto copy$default(SavingsProductShelfOrderDto savingsProductShelfOrderDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsProductShelfOrderDto.shelfId;
        }
        if ((i & 2) != 0) {
            list = savingsProductShelfOrderDto.agreementsList;
        }
        return savingsProductShelfOrderDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getShelfId() {
        return this.shelfId;
    }

    public final List<String> component2() {
        return this.agreementsList;
    }

    public final SavingsProductShelfOrderDto copy(String shelfId, List<String> agreementsList) {
        return new SavingsProductShelfOrderDto(shelfId, agreementsList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsProductShelfOrderDto)) {
            return false;
        }
        SavingsProductShelfOrderDto savingsProductShelfOrderDto = (SavingsProductShelfOrderDto) other;
        return jl40.l(this.shelfId, savingsProductShelfOrderDto.shelfId) && jl40.l(this.agreementsList, savingsProductShelfOrderDto.agreementsList);
    }

    public final List<String> getAgreementsList() {
        return this.agreementsList;
    }

    public final String getShelfId() {
        return this.shelfId;
    }

    public int hashCode() {
        return this.agreementsList.hashCode() + (this.shelfId.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("SavingsProductShelfOrderDto(shelfId=", this.shelfId, ", agreementsList=", Extension.C_BRAKE, this.agreementsList);
    }
}
