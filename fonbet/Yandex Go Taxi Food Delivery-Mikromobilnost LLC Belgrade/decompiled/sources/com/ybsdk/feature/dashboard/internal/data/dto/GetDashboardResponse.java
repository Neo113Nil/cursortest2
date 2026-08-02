package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u008b\u0001\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardResponse;", "", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "screenItems", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItem;", "fullScreens", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardFullScreenResponse;", "agreementId", "", "balance", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBalanceModel;", "navigationItem", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardNavigationItemModel;", "topButtons", "Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsResponse;", "cursor", "cardInfo", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardInfo;", "bottomButton", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBottomButton;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBalanceModel;Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardNavigationItemModel;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/CardInfo;Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBottomButton;)V", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getScreenItems", "()Ljava/util/List;", "getFullScreens", "getAgreementId", "()Ljava/lang/String;", "getBalance", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBalanceModel;", "getNavigationItem", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardNavigationItemModel;", "getTopButtons", "getCursor", "getCardInfo", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CardInfo;", "getBottomButton", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBottomButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetDashboardResponse {
    private final String agreementId;
    private final DashboardBalanceModel balance;
    private final DashboardBottomButton bottomButton;
    private final CardInfo cardInfo;
    private final DivDataDto commonDivData;
    private final String cursor;
    private final List<DashboardFullScreenResponse> fullScreens;
    private final DashboardNavigationItemModel navigationItem;
    private final List<ScreenItem> screenItems;
    private final List<HeaderTopButtonsResponse> topButtons;

    public /* synthetic */ GetDashboardResponse(DivDataDto divDataDto, List list, List list2, String str, DashboardBalanceModel dashboardBalanceModel, DashboardNavigationItemModel dashboardNavigationItemModel, List list3, String str2, CardInfo cardInfo, DashboardBottomButton dashboardBottomButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(divDataDto, list, list2, (i & 8) != 0 ? null : str, dashboardBalanceModel, dashboardNavigationItemModel, list3, str2, cardInfo, dashboardBottomButton);
    }

    public static /* synthetic */ GetDashboardResponse copy$default(GetDashboardResponse getDashboardResponse, DivDataDto divDataDto, List list, List list2, String str, DashboardBalanceModel dashboardBalanceModel, DashboardNavigationItemModel dashboardNavigationItemModel, List list3, String str2, CardInfo cardInfo, DashboardBottomButton dashboardBottomButton, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = getDashboardResponse.commonDivData;
        }
        if ((i & 2) != 0) {
            list = getDashboardResponse.screenItems;
        }
        if ((i & 4) != 0) {
            list2 = getDashboardResponse.fullScreens;
        }
        if ((i & 8) != 0) {
            str = getDashboardResponse.agreementId;
        }
        if ((i & 16) != 0) {
            dashboardBalanceModel = getDashboardResponse.balance;
        }
        if ((i & 32) != 0) {
            dashboardNavigationItemModel = getDashboardResponse.navigationItem;
        }
        if ((i & 64) != 0) {
            list3 = getDashboardResponse.topButtons;
        }
        if ((i & 128) != 0) {
            str2 = getDashboardResponse.cursor;
        }
        if ((i & 256) != 0) {
            cardInfo = getDashboardResponse.cardInfo;
        }
        if ((i & 512) != 0) {
            dashboardBottomButton = getDashboardResponse.bottomButton;
        }
        CardInfo cardInfo2 = cardInfo;
        DashboardBottomButton dashboardBottomButton2 = dashboardBottomButton;
        List list4 = list3;
        String str3 = str2;
        DashboardBalanceModel dashboardBalanceModel2 = dashboardBalanceModel;
        DashboardNavigationItemModel dashboardNavigationItemModel2 = dashboardNavigationItemModel;
        return getDashboardResponse.copy(divDataDto, list, list2, str, dashboardBalanceModel2, dashboardNavigationItemModel2, list4, str3, cardInfo2, dashboardBottomButton2);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    /* renamed from: component10, reason: from getter */
    public final DashboardBottomButton getBottomButton() {
        return this.bottomButton;
    }

    public final List<ScreenItem> component2() {
        return this.screenItems;
    }

    public final List<DashboardFullScreenResponse> component3() {
        return this.fullScreens;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final DashboardBalanceModel getBalance() {
        return this.balance;
    }

    /* renamed from: component6, reason: from getter */
    public final DashboardNavigationItemModel getNavigationItem() {
        return this.navigationItem;
    }

    public final List<HeaderTopButtonsResponse> component7() {
        return this.topButtons;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component9, reason: from getter */
    public final CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public final GetDashboardResponse copy(@Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "screen_items") List<ScreenItem> screenItems, @Json(name = "fullscreens") List<DashboardFullScreenResponse> fullScreens, @Json(name = "agreement_id") String agreementId, @Json(name = "balance") DashboardBalanceModel balance, @Json(name = "navigation_item") DashboardNavigationItemModel navigationItem, @Json(name = "header_top_buttons") List<HeaderTopButtonsResponse> topButtons, @Json(name = "cursor") String cursor, @Json(name = "card") CardInfo cardInfo, @Json(name = "bottom_button") DashboardBottomButton bottomButton) {
        return new GetDashboardResponse(commonDivData, screenItems, fullScreens, agreementId, balance, navigationItem, topButtons, cursor, cardInfo, bottomButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDashboardResponse)) {
            return false;
        }
        GetDashboardResponse getDashboardResponse = (GetDashboardResponse) other;
        return jl40.l(this.commonDivData, getDashboardResponse.commonDivData) && jl40.l(this.screenItems, getDashboardResponse.screenItems) && jl40.l(this.fullScreens, getDashboardResponse.fullScreens) && jl40.l(this.agreementId, getDashboardResponse.agreementId) && jl40.l(this.balance, getDashboardResponse.balance) && jl40.l(this.navigationItem, getDashboardResponse.navigationItem) && jl40.l(this.topButtons, getDashboardResponse.topButtons) && jl40.l(this.cursor, getDashboardResponse.cursor) && jl40.l(this.cardInfo, getDashboardResponse.cardInfo) && jl40.l(this.bottomButton, getDashboardResponse.bottomButton);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final DashboardBalanceModel getBalance() {
        return this.balance;
    }

    public final DashboardBottomButton getBottomButton() {
        return this.bottomButton;
    }

    public final CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<DashboardFullScreenResponse> getFullScreens() {
        return this.fullScreens;
    }

    public final DashboardNavigationItemModel getNavigationItem() {
        return this.navigationItem;
    }

    public final List<ScreenItem> getScreenItems() {
        return this.screenItems;
    }

    public final List<HeaderTopButtonsResponse> getTopButtons() {
        return this.topButtons;
    }

    public int hashCode() {
        int c = unr0.c(this.commonDivData.hashCode() * 31, 31, this.screenItems);
        List<DashboardFullScreenResponse> list = this.fullScreens;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.agreementId;
        int hashCode2 = (this.balance.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        DashboardNavigationItemModel dashboardNavigationItemModel = this.navigationItem;
        int c2 = unr0.c((hashCode2 + (dashboardNavigationItemModel == null ? 0 : dashboardNavigationItemModel.hashCode())) * 31, 31, this.topButtons);
        String str2 = this.cursor;
        int hashCode3 = (c2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CardInfo cardInfo = this.cardInfo;
        int hashCode4 = (hashCode3 + (cardInfo == null ? 0 : cardInfo.hashCode())) * 31;
        DashboardBottomButton dashboardBottomButton = this.bottomButton;
        return hashCode4 + (dashboardBottomButton != null ? dashboardBottomButton.hashCode() : 0);
    }

    public String toString() {
        DivDataDto divDataDto = this.commonDivData;
        List<ScreenItem> list = this.screenItems;
        List<DashboardFullScreenResponse> list2 = this.fullScreens;
        String str = this.agreementId;
        DashboardBalanceModel dashboardBalanceModel = this.balance;
        DashboardNavigationItemModel dashboardNavigationItemModel = this.navigationItem;
        List<HeaderTopButtonsResponse> list3 = this.topButtons;
        String str2 = this.cursor;
        CardInfo cardInfo = this.cardInfo;
        DashboardBottomButton dashboardBottomButton = this.bottomButton;
        StringBuilder sb = new StringBuilder("GetDashboardResponse(commonDivData=");
        sb.append(divDataDto);
        sb.append(", screenItems=");
        sb.append(list);
        sb.append(", fullScreens=");
        oyr.D(", agreementId=", str, ", balance=", sb, list2);
        sb.append(dashboardBalanceModel);
        sb.append(", navigationItem=");
        sb.append(dashboardNavigationItemModel);
        sb.append(", topButtons=");
        oyr.D(", cursor=", str2, ", cardInfo=", sb, list3);
        sb.append(cardInfo);
        sb.append(", bottomButton=");
        sb.append(dashboardBottomButton);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public GetDashboardResponse(@Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "screen_items") List<ScreenItem> list, @Json(name = "fullscreens") List<DashboardFullScreenResponse> list2, @Json(name = "agreement_id") String str, @Json(name = "balance") DashboardBalanceModel dashboardBalanceModel, @Json(name = "navigation_item") DashboardNavigationItemModel dashboardNavigationItemModel, @Json(name = "header_top_buttons") List<HeaderTopButtonsResponse> list3, @Json(name = "cursor") String str2, @Json(name = "card") CardInfo cardInfo, @Json(name = "bottom_button") DashboardBottomButton dashboardBottomButton) {
        this.commonDivData = divDataDto;
        this.screenItems = list;
        this.fullScreens = list2;
        this.agreementId = str;
        this.balance = dashboardBalanceModel;
        this.navigationItem = dashboardNavigationItemModel;
        this.topButtons = list3;
        this.cursor = str2;
        this.cardInfo = cardInfo;
        this.bottomButton = dashboardBottomButton;
    }
}
