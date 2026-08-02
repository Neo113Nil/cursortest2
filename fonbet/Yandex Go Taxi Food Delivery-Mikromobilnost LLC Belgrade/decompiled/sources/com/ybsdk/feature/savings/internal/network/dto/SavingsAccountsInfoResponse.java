package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponse;", "", "accountCells", "", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsCellResponse;", "<init>", "(Ljava/util/List;)V", "getAccountCells", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountsInfoResponse {
    private final List<SavingsCellResponse> accountCells;

    public SavingsAccountsInfoResponse(@Json(name = "items") @SkipFailingElements List<SavingsCellResponse> list) {
        this.accountCells = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavingsAccountsInfoResponse copy$default(SavingsAccountsInfoResponse savingsAccountsInfoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = savingsAccountsInfoResponse.accountCells;
        }
        return savingsAccountsInfoResponse.copy(list);
    }

    public final List<SavingsCellResponse> component1() {
        return this.accountCells;
    }

    public final SavingsAccountsInfoResponse copy(@Json(name = "items") @SkipFailingElements List<SavingsCellResponse> accountCells) {
        return new SavingsAccountsInfoResponse(accountCells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SavingsAccountsInfoResponse) && jl40.l(this.accountCells, ((SavingsAccountsInfoResponse) other).accountCells);
    }

    public final List<SavingsCellResponse> getAccountCells() {
        return this.accountCells;
    }

    public int hashCode() {
        return this.accountCells.hashCode();
    }

    public String toString() {
        return tse0.k("SavingsAccountsInfoResponse(accountCells=", Extension.C_BRAKE, this.accountCells);
    }
}
