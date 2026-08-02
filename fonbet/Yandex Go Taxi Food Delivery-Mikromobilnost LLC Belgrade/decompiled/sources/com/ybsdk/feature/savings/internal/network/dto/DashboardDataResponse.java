package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003Js\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\f\u001a\u00020\r2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DashboardDataResponse;", "", "totalBalance", "Lcom/ybsdk/core/common/data/network/dto/Money;", "title", "", "icon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "interestHints", "", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsInterestHintResponse;", "supportUrl", "savingsAccountsInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponse;", "layout", "divkitWidgets", "Lcom/ybsdk/feature/savings/internal/network/dto/DivkitWidgetDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponse;Ljava/util/List;Ljava/util/List;)V", "getTotalBalance", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getInterestHints", "()Ljava/util/List;", "getSupportUrl", "getSavingsAccountsInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponse;", "getLayout", "getDivkitWidgets", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardDataResponse {
    private final List<DivkitWidgetDto> divkitWidgets;
    private final Themes<String> icon;
    private final List<SavingsInterestHintResponse> interestHints;
    private final List<String> layout;
    private final SavingsAccountsInfoResponse savingsAccountsInfo;
    private final String supportUrl;
    private final String title;
    private final Money totalBalance;

    public DashboardDataResponse(@Json(name = "total_balance") Money money, @Json(name = "title") String str, @Json(name = "icon") Themes<String> themes, @Json(name = "interest_hints") List<SavingsInterestHintResponse> list, @Json(name = "support_url") String str2, @Json(name = "savings_accounts_info") SavingsAccountsInfoResponse savingsAccountsInfoResponse, @Json(name = "layout") List<String> list2, @Json(name = "divkit_widgets") List<DivkitWidgetDto> list3) {
        this.totalBalance = money;
        this.title = str;
        this.icon = themes;
        this.interestHints = list;
        this.supportUrl = str2;
        this.savingsAccountsInfo = savingsAccountsInfoResponse;
        this.layout = list2;
        this.divkitWidgets = list3;
    }

    public static /* synthetic */ DashboardDataResponse copy$default(DashboardDataResponse dashboardDataResponse, Money money, String str, Themes themes, List list, String str2, SavingsAccountsInfoResponse savingsAccountsInfoResponse, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            money = dashboardDataResponse.totalBalance;
        }
        if ((i & 2) != 0) {
            str = dashboardDataResponse.title;
        }
        if ((i & 4) != 0) {
            themes = dashboardDataResponse.icon;
        }
        if ((i & 8) != 0) {
            list = dashboardDataResponse.interestHints;
        }
        if ((i & 16) != 0) {
            str2 = dashboardDataResponse.supportUrl;
        }
        if ((i & 32) != 0) {
            savingsAccountsInfoResponse = dashboardDataResponse.savingsAccountsInfo;
        }
        if ((i & 64) != 0) {
            list2 = dashboardDataResponse.layout;
        }
        if ((i & 128) != 0) {
            list3 = dashboardDataResponse.divkitWidgets;
        }
        List list4 = list2;
        List list5 = list3;
        String str3 = str2;
        SavingsAccountsInfoResponse savingsAccountsInfoResponse2 = savingsAccountsInfoResponse;
        return dashboardDataResponse.copy(money, str, themes, list, str3, savingsAccountsInfoResponse2, list4, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getTotalBalance() {
        return this.totalBalance;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component3() {
        return this.icon;
    }

    public final List<SavingsInterestHintResponse> component4() {
        return this.interestHints;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final SavingsAccountsInfoResponse getSavingsAccountsInfo() {
        return this.savingsAccountsInfo;
    }

    public final List<String> component7() {
        return this.layout;
    }

    public final List<DivkitWidgetDto> component8() {
        return this.divkitWidgets;
    }

    public final DashboardDataResponse copy(@Json(name = "total_balance") Money totalBalance, @Json(name = "title") String title, @Json(name = "icon") Themes<String> icon, @Json(name = "interest_hints") List<SavingsInterestHintResponse> interestHints, @Json(name = "support_url") String supportUrl, @Json(name = "savings_accounts_info") SavingsAccountsInfoResponse savingsAccountsInfo, @Json(name = "layout") List<String> layout, @Json(name = "divkit_widgets") List<DivkitWidgetDto> divkitWidgets) {
        return new DashboardDataResponse(totalBalance, title, icon, interestHints, supportUrl, savingsAccountsInfo, layout, divkitWidgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardDataResponse)) {
            return false;
        }
        DashboardDataResponse dashboardDataResponse = (DashboardDataResponse) other;
        return jl40.l(this.totalBalance, dashboardDataResponse.totalBalance) && jl40.l(this.title, dashboardDataResponse.title) && jl40.l(this.icon, dashboardDataResponse.icon) && jl40.l(this.interestHints, dashboardDataResponse.interestHints) && jl40.l(this.supportUrl, dashboardDataResponse.supportUrl) && jl40.l(this.savingsAccountsInfo, dashboardDataResponse.savingsAccountsInfo) && jl40.l(this.layout, dashboardDataResponse.layout) && jl40.l(this.divkitWidgets, dashboardDataResponse.divkitWidgets);
    }

    public final List<DivkitWidgetDto> getDivkitWidgets() {
        return this.divkitWidgets;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public final List<SavingsInterestHintResponse> getInterestHints() {
        return this.interestHints;
    }

    public final List<String> getLayout() {
        return this.layout;
    }

    public final SavingsAccountsInfoResponse getSavingsAccountsInfo() {
        return this.savingsAccountsInfo;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Money getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        int c = unr0.c(nnm.c(this.icon, unr0.b(this.totalBalance.hashCode() * 31, 31, this.title), 31), 31, this.interestHints);
        String str = this.supportUrl;
        return this.divkitWidgets.hashCode() + unr0.c((this.savingsAccountsInfo.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.layout);
    }

    public String toString() {
        Money money = this.totalBalance;
        String str = this.title;
        Themes<String> themes = this.icon;
        List<SavingsInterestHintResponse> list = this.interestHints;
        String str2 = this.supportUrl;
        SavingsAccountsInfoResponse savingsAccountsInfoResponse = this.savingsAccountsInfo;
        List<String> list2 = this.layout;
        List<DivkitWidgetDto> list3 = this.divkitWidgets;
        StringBuilder sb = new StringBuilder("DashboardDataResponse(totalBalance=");
        sb.append(money);
        sb.append(", title=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(themes);
        sb.append(", interestHints=");
        sb.append(list);
        sb.append(", supportUrl=");
        sb.append(str2);
        sb.append(", savingsAccountsInfo=");
        sb.append(savingsAccountsInfoResponse);
        sb.append(", layout=");
        return vfc.p(sb, list2, ", divkitWidgets=", list3, Extension.C_BRAKE);
    }
}
