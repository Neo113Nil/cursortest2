package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomeDto;", "", "layoutId", "", "title", "infoAction", "periods", "", "Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLayoutId", "()Ljava/lang/String;", "getTitle", "getInfoAction", "getPeriods", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundsIncomeDto {
    private final String infoAction;
    private final String layoutId;
    private final List<FundsIncomePeriodDto> periods;
    private final String title;

    public FundsIncomeDto(@Json(name = "layout_id") String str, @Json(name = "title") String str2, @Json(name = "info_action") String str3, @Json(name = "periods") List<FundsIncomePeriodDto> list) {
        this.layoutId = str;
        this.title = str2;
        this.infoAction = str3;
        this.periods = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FundsIncomeDto copy$default(FundsIncomeDto fundsIncomeDto, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundsIncomeDto.layoutId;
        }
        if ((i & 2) != 0) {
            str2 = fundsIncomeDto.title;
        }
        if ((i & 4) != 0) {
            str3 = fundsIncomeDto.infoAction;
        }
        if ((i & 8) != 0) {
            list = fundsIncomeDto.periods;
        }
        return fundsIncomeDto.copy(str, str2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInfoAction() {
        return this.infoAction;
    }

    public final List<FundsIncomePeriodDto> component4() {
        return this.periods;
    }

    public final FundsIncomeDto copy(@Json(name = "layout_id") String layoutId, @Json(name = "title") String title, @Json(name = "info_action") String infoAction, @Json(name = "periods") List<FundsIncomePeriodDto> periods) {
        return new FundsIncomeDto(layoutId, title, infoAction, periods);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundsIncomeDto)) {
            return false;
        }
        FundsIncomeDto fundsIncomeDto = (FundsIncomeDto) other;
        return jl40.l(this.layoutId, fundsIncomeDto.layoutId) && jl40.l(this.title, fundsIncomeDto.title) && jl40.l(this.infoAction, fundsIncomeDto.infoAction) && jl40.l(this.periods, fundsIncomeDto.periods);
    }

    public final String getInfoAction() {
        return this.infoAction;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final List<FundsIncomePeriodDto> getPeriods() {
        return this.periods;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.periods.hashCode() + unr0.b(unr0.b(this.layoutId.hashCode() * 31, 31, this.title), 31, this.infoAction);
    }

    public String toString() {
        String str = this.layoutId;
        String str2 = this.title;
        return tse0.j(this.infoAction, ", periods=", Extension.C_BRAKE, b64.v("FundsIncomeDto(layoutId=", str, ", title=", str2, ", infoAction="), this.periods);
    }
}
