package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010$\u0012\u000e\b\u0001\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0014\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010$HÆ\u0003J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020&0\u0014HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010(HÆ\u0003J¦\u0002\u0010h\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0003\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0003\u0010\u001f\u001a\u00020\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$2\u000e\b\u0003\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00142\n\b\u0003\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0002\u0010iJ\u0013\u0010j\u001a\u00020\u000e2\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010l\u001a\u00020mHÖ\u0001J\t\u0010n\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\b\n\u0000\u001a\u0004\bE\u0010>R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0014¢\u0006\b\n\u0000\u001a\u0004\bN\u0010>R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006o"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountInfoResponse;", "", "title", "", "subtitle", "divSubtitle", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "accountType", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountTypeDto;", "balance", "Lcom/ybsdk/core/common/data/network/dto/Money;", "interest", "interestHint", "interestLocked", "", "interestPaymentTerm", "target", "buttonGroup", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDto;", "layout", "", "detailsDataWidget", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountDetailsDataDto;", "documentsWidget", "Lcom/ybsdk/feature/savings/internal/network/dto/DocumentsWidgetDto;", "closeAccountWidget", "Lcom/ybsdk/feature/savings/internal/network/dto/CloseAccountButtonDto;", "divkitWidgets", "Lcom/ybsdk/feature/savings/internal/network/dto/DivkitWidgetDto;", "interestDataWidget", "Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDto;", "selectedThemeId", "supportUrl", "incomeWidget", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomeWidgetDto;", "fundIncomeWidget", "Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomeDto;", "themes", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountThemeDto;", "plusSubscriptionStatus", "Lcom/ybsdk/feature/savings/internal/network/dto/PlusSubscriptionStatusDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/AccountTypeDto;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDto;Ljava/util/List;Lcom/ybsdk/feature/savings/internal/network/dto/AccountDetailsDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/DocumentsWidgetDto;Lcom/ybsdk/feature/savings/internal/network/dto/CloseAccountButtonDto;Ljava/util/List;Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomeWidgetDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomeDto;Ljava/util/List;Lcom/ybsdk/feature/savings/internal/network/dto/PlusSubscriptionStatusDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDivSubtitle", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getAccountType", "()Lcom/ybsdk/feature/savings/internal/network/dto/AccountTypeDto;", "getBalance", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getInterest", "getInterestHint", "getInterestLocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInterestPaymentTerm", "getTarget", "getButtonGroup", "()Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDto;", "getLayout", "()Ljava/util/List;", "getDetailsDataWidget", "()Lcom/ybsdk/feature/savings/internal/network/dto/AccountDetailsDataDto;", "getDocumentsWidget", "()Lcom/ybsdk/feature/savings/internal/network/dto/DocumentsWidgetDto;", "getCloseAccountWidget", "()Lcom/ybsdk/feature/savings/internal/network/dto/CloseAccountButtonDto;", "getDivkitWidgets", "getInterestDataWidget", "()Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDto;", "getSelectedThemeId", "getSupportUrl", "getIncomeWidget", "()Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomeWidgetDto;", "getFundIncomeWidget", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomeDto;", "getThemes", "getPlusSubscriptionStatus", "()Lcom/ybsdk/feature/savings/internal/network/dto/PlusSubscriptionStatusDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/AccountTypeDto;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDto;Ljava/util/List;Lcom/ybsdk/feature/savings/internal/network/dto/AccountDetailsDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/DocumentsWidgetDto;Lcom/ybsdk/feature/savings/internal/network/dto/CloseAccountButtonDto;Ljava/util/List;Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomeWidgetDto;Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomeDto;Ljava/util/List;Lcom/ybsdk/feature/savings/internal/network/dto/PlusSubscriptionStatusDto;)Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountInfoResponse;", "equals", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountInfoResponse {
    private final AccountTypeDto accountType;
    private final Money balance;
    private final AccountActionButtonGroupDto buttonGroup;
    private final CloseAccountButtonDto closeAccountWidget;
    private final AccountDetailsDataDto detailsDataWidget;
    private final DivDataDto divSubtitle;
    private final List<DivkitWidgetDto> divkitWidgets;
    private final DocumentsWidgetDto documentsWidget;
    private final FundsIncomeDto fundIncomeWidget;
    private final SavingsIncomeWidgetDto incomeWidget;
    private final Money interest;
    private final InterestDataDto interestDataWidget;
    private final String interestHint;
    private final Boolean interestLocked;
    private final String interestPaymentTerm;
    private final List<String> layout;
    private final PlusSubscriptionStatusDto plusSubscriptionStatus;
    private final String selectedThemeId;
    private final String subtitle;
    private final String supportUrl;
    private final Money target;
    private final List<SavingsAccountThemeDto> themes;
    private final String title;

    public SavingsAccountInfoResponse(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "div_subtitle") DivDataDto divDataDto, @Json(name = "account_type") AccountTypeDto accountTypeDto, @Json(name = "balance") Money money, @Json(name = "interest") Money money2, @Json(name = "interest_hint") String str3, @Json(name = "interest_locked") Boolean bool, @Json(name = "interest_payment_term") String str4, @Json(name = "target") Money money3, @Json(name = "button_group") AccountActionButtonGroupDto accountActionButtonGroupDto, @Json(name = "layout") List<String> list, @Json(name = "details_data") AccountDetailsDataDto accountDetailsDataDto, @Json(name = "documents") DocumentsWidgetDto documentsWidgetDto, @Json(name = "close_account") CloseAccountButtonDto closeAccountButtonDto, @Json(name = "divkit_widgets") List<DivkitWidgetDto> list2, @Json(name = "interest_data") InterestDataDto interestDataDto, @Json(name = "theme_id") String str5, @Json(name = "support_url") String str6, @Json(name = "income_data") SavingsIncomeWidgetDto savingsIncomeWidgetDto, @Json(name = "fund_income_data") FundsIncomeDto fundsIncomeDto, @Json(name = "themes") List<SavingsAccountThemeDto> list3, @Json(name = "plus_subscription_status") PlusSubscriptionStatusDto plusSubscriptionStatusDto) {
        this.title = str;
        this.subtitle = str2;
        this.divSubtitle = divDataDto;
        this.accountType = accountTypeDto;
        this.balance = money;
        this.interest = money2;
        this.interestHint = str3;
        this.interestLocked = bool;
        this.interestPaymentTerm = str4;
        this.target = money3;
        this.buttonGroup = accountActionButtonGroupDto;
        this.layout = list;
        this.detailsDataWidget = accountDetailsDataDto;
        this.documentsWidget = documentsWidgetDto;
        this.closeAccountWidget = closeAccountButtonDto;
        this.divkitWidgets = list2;
        this.interestDataWidget = interestDataDto;
        this.selectedThemeId = str5;
        this.supportUrl = str6;
        this.incomeWidget = savingsIncomeWidgetDto;
        this.fundIncomeWidget = fundsIncomeDto;
        this.themes = list3;
        this.plusSubscriptionStatus = plusSubscriptionStatusDto;
    }

    public static /* synthetic */ SavingsAccountInfoResponse copy$default(SavingsAccountInfoResponse savingsAccountInfoResponse, String str, String str2, DivDataDto divDataDto, AccountTypeDto accountTypeDto, Money money, Money money2, String str3, Boolean bool, String str4, Money money3, AccountActionButtonGroupDto accountActionButtonGroupDto, List list, AccountDetailsDataDto accountDetailsDataDto, DocumentsWidgetDto documentsWidgetDto, CloseAccountButtonDto closeAccountButtonDto, List list2, InterestDataDto interestDataDto, String str5, String str6, SavingsIncomeWidgetDto savingsIncomeWidgetDto, FundsIncomeDto fundsIncomeDto, List list3, PlusSubscriptionStatusDto plusSubscriptionStatusDto, int i, Object obj) {
        PlusSubscriptionStatusDto plusSubscriptionStatusDto2;
        List list4;
        String str7 = (i & 1) != 0 ? savingsAccountInfoResponse.title : str;
        String str8 = (i & 2) != 0 ? savingsAccountInfoResponse.subtitle : str2;
        DivDataDto divDataDto2 = (i & 4) != 0 ? savingsAccountInfoResponse.divSubtitle : divDataDto;
        AccountTypeDto accountTypeDto2 = (i & 8) != 0 ? savingsAccountInfoResponse.accountType : accountTypeDto;
        Money money4 = (i & 16) != 0 ? savingsAccountInfoResponse.balance : money;
        Money money5 = (i & 32) != 0 ? savingsAccountInfoResponse.interest : money2;
        String str9 = (i & 64) != 0 ? savingsAccountInfoResponse.interestHint : str3;
        Boolean bool2 = (i & 128) != 0 ? savingsAccountInfoResponse.interestLocked : bool;
        String str10 = (i & 256) != 0 ? savingsAccountInfoResponse.interestPaymentTerm : str4;
        Money money6 = (i & 512) != 0 ? savingsAccountInfoResponse.target : money3;
        AccountActionButtonGroupDto accountActionButtonGroupDto2 = (i & 1024) != 0 ? savingsAccountInfoResponse.buttonGroup : accountActionButtonGroupDto;
        List list5 = (i & 2048) != 0 ? savingsAccountInfoResponse.layout : list;
        AccountDetailsDataDto accountDetailsDataDto2 = (i & 4096) != 0 ? savingsAccountInfoResponse.detailsDataWidget : accountDetailsDataDto;
        DocumentsWidgetDto documentsWidgetDto2 = (i & 8192) != 0 ? savingsAccountInfoResponse.documentsWidget : documentsWidgetDto;
        String str11 = str7;
        CloseAccountButtonDto closeAccountButtonDto2 = (i & 16384) != 0 ? savingsAccountInfoResponse.closeAccountWidget : closeAccountButtonDto;
        List list6 = (i & 32768) != 0 ? savingsAccountInfoResponse.divkitWidgets : list2;
        InterestDataDto interestDataDto2 = (i & 65536) != 0 ? savingsAccountInfoResponse.interestDataWidget : interestDataDto;
        String str12 = (i & 131072) != 0 ? savingsAccountInfoResponse.selectedThemeId : str5;
        String str13 = (i & 262144) != 0 ? savingsAccountInfoResponse.supportUrl : str6;
        SavingsIncomeWidgetDto savingsIncomeWidgetDto2 = (i & 524288) != 0 ? savingsAccountInfoResponse.incomeWidget : savingsIncomeWidgetDto;
        FundsIncomeDto fundsIncomeDto2 = (i & 1048576) != 0 ? savingsAccountInfoResponse.fundIncomeWidget : fundsIncomeDto;
        List list7 = (i & 2097152) != 0 ? savingsAccountInfoResponse.themes : list3;
        if ((i & SelfTester_JCP.ENCRYPT_CBC) != 0) {
            list4 = list7;
            plusSubscriptionStatusDto2 = savingsAccountInfoResponse.plusSubscriptionStatus;
        } else {
            plusSubscriptionStatusDto2 = plusSubscriptionStatusDto;
            list4 = list7;
        }
        return savingsAccountInfoResponse.copy(str11, str8, divDataDto2, accountTypeDto2, money4, money5, str9, bool2, str10, money6, accountActionButtonGroupDto2, list5, accountDetailsDataDto2, documentsWidgetDto2, closeAccountButtonDto2, list6, interestDataDto2, str12, str13, savingsIncomeWidgetDto2, fundsIncomeDto2, list4, plusSubscriptionStatusDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Money getTarget() {
        return this.target;
    }

    /* renamed from: component11, reason: from getter */
    public final AccountActionButtonGroupDto getButtonGroup() {
        return this.buttonGroup;
    }

    public final List<String> component12() {
        return this.layout;
    }

    /* renamed from: component13, reason: from getter */
    public final AccountDetailsDataDto getDetailsDataWidget() {
        return this.detailsDataWidget;
    }

    /* renamed from: component14, reason: from getter */
    public final DocumentsWidgetDto getDocumentsWidget() {
        return this.documentsWidget;
    }

    /* renamed from: component15, reason: from getter */
    public final CloseAccountButtonDto getCloseAccountWidget() {
        return this.closeAccountWidget;
    }

    public final List<DivkitWidgetDto> component16() {
        return this.divkitWidgets;
    }

    /* renamed from: component17, reason: from getter */
    public final InterestDataDto getInterestDataWidget() {
        return this.interestDataWidget;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSelectedThemeId() {
        return this.selectedThemeId;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component20, reason: from getter */
    public final SavingsIncomeWidgetDto getIncomeWidget() {
        return this.incomeWidget;
    }

    /* renamed from: component21, reason: from getter */
    public final FundsIncomeDto getFundIncomeWidget() {
        return this.fundIncomeWidget;
    }

    public final List<SavingsAccountThemeDto> component22() {
        return this.themes;
    }

    /* renamed from: component23, reason: from getter */
    public final PlusSubscriptionStatusDto getPlusSubscriptionStatus() {
        return this.plusSubscriptionStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getDivSubtitle() {
        return this.divSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountTypeDto getAccountType() {
        return this.accountType;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getBalance() {
        return this.balance;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getInterest() {
        return this.interest;
    }

    /* renamed from: component7, reason: from getter */
    public final String getInterestHint() {
        return this.interestHint;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getInterestLocked() {
        return this.interestLocked;
    }

    /* renamed from: component9, reason: from getter */
    public final String getInterestPaymentTerm() {
        return this.interestPaymentTerm;
    }

    public final SavingsAccountInfoResponse copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "div_subtitle") DivDataDto divSubtitle, @Json(name = "account_type") AccountTypeDto accountType, @Json(name = "balance") Money balance, @Json(name = "interest") Money interest, @Json(name = "interest_hint") String interestHint, @Json(name = "interest_locked") Boolean interestLocked, @Json(name = "interest_payment_term") String interestPaymentTerm, @Json(name = "target") Money target, @Json(name = "button_group") AccountActionButtonGroupDto buttonGroup, @Json(name = "layout") List<String> layout, @Json(name = "details_data") AccountDetailsDataDto detailsDataWidget, @Json(name = "documents") DocumentsWidgetDto documentsWidget, @Json(name = "close_account") CloseAccountButtonDto closeAccountWidget, @Json(name = "divkit_widgets") List<DivkitWidgetDto> divkitWidgets, @Json(name = "interest_data") InterestDataDto interestDataWidget, @Json(name = "theme_id") String selectedThemeId, @Json(name = "support_url") String supportUrl, @Json(name = "income_data") SavingsIncomeWidgetDto incomeWidget, @Json(name = "fund_income_data") FundsIncomeDto fundIncomeWidget, @Json(name = "themes") List<SavingsAccountThemeDto> themes, @Json(name = "plus_subscription_status") PlusSubscriptionStatusDto plusSubscriptionStatus) {
        return new SavingsAccountInfoResponse(title, subtitle, divSubtitle, accountType, balance, interest, interestHint, interestLocked, interestPaymentTerm, target, buttonGroup, layout, detailsDataWidget, documentsWidget, closeAccountWidget, divkitWidgets, interestDataWidget, selectedThemeId, supportUrl, incomeWidget, fundIncomeWidget, themes, plusSubscriptionStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountInfoResponse)) {
            return false;
        }
        SavingsAccountInfoResponse savingsAccountInfoResponse = (SavingsAccountInfoResponse) other;
        return jl40.l(this.title, savingsAccountInfoResponse.title) && jl40.l(this.subtitle, savingsAccountInfoResponse.subtitle) && jl40.l(this.divSubtitle, savingsAccountInfoResponse.divSubtitle) && this.accountType == savingsAccountInfoResponse.accountType && jl40.l(this.balance, savingsAccountInfoResponse.balance) && jl40.l(this.interest, savingsAccountInfoResponse.interest) && jl40.l(this.interestHint, savingsAccountInfoResponse.interestHint) && jl40.l(this.interestLocked, savingsAccountInfoResponse.interestLocked) && jl40.l(this.interestPaymentTerm, savingsAccountInfoResponse.interestPaymentTerm) && jl40.l(this.target, savingsAccountInfoResponse.target) && jl40.l(this.buttonGroup, savingsAccountInfoResponse.buttonGroup) && jl40.l(this.layout, savingsAccountInfoResponse.layout) && jl40.l(this.detailsDataWidget, savingsAccountInfoResponse.detailsDataWidget) && jl40.l(this.documentsWidget, savingsAccountInfoResponse.documentsWidget) && jl40.l(this.closeAccountWidget, savingsAccountInfoResponse.closeAccountWidget) && jl40.l(this.divkitWidgets, savingsAccountInfoResponse.divkitWidgets) && jl40.l(this.interestDataWidget, savingsAccountInfoResponse.interestDataWidget) && jl40.l(this.selectedThemeId, savingsAccountInfoResponse.selectedThemeId) && jl40.l(this.supportUrl, savingsAccountInfoResponse.supportUrl) && jl40.l(this.incomeWidget, savingsAccountInfoResponse.incomeWidget) && jl40.l(this.fundIncomeWidget, savingsAccountInfoResponse.fundIncomeWidget) && jl40.l(this.themes, savingsAccountInfoResponse.themes) && this.plusSubscriptionStatus == savingsAccountInfoResponse.plusSubscriptionStatus;
    }

    public final AccountTypeDto getAccountType() {
        return this.accountType;
    }

    public final Money getBalance() {
        return this.balance;
    }

    public final AccountActionButtonGroupDto getButtonGroup() {
        return this.buttonGroup;
    }

    public final CloseAccountButtonDto getCloseAccountWidget() {
        return this.closeAccountWidget;
    }

    public final AccountDetailsDataDto getDetailsDataWidget() {
        return this.detailsDataWidget;
    }

    public final DivDataDto getDivSubtitle() {
        return this.divSubtitle;
    }

    public final List<DivkitWidgetDto> getDivkitWidgets() {
        return this.divkitWidgets;
    }

    public final DocumentsWidgetDto getDocumentsWidget() {
        return this.documentsWidget;
    }

    public final FundsIncomeDto getFundIncomeWidget() {
        return this.fundIncomeWidget;
    }

    public final SavingsIncomeWidgetDto getIncomeWidget() {
        return this.incomeWidget;
    }

    public final Money getInterest() {
        return this.interest;
    }

    public final InterestDataDto getInterestDataWidget() {
        return this.interestDataWidget;
    }

    public final String getInterestHint() {
        return this.interestHint;
    }

    public final Boolean getInterestLocked() {
        return this.interestLocked;
    }

    public final String getInterestPaymentTerm() {
        return this.interestPaymentTerm;
    }

    public final List<String> getLayout() {
        return this.layout;
    }

    public final PlusSubscriptionStatusDto getPlusSubscriptionStatus() {
        return this.plusSubscriptionStatus;
    }

    public final String getSelectedThemeId() {
        return this.selectedThemeId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final Money getTarget() {
        return this.target;
    }

    public final List<SavingsAccountThemeDto> getThemes() {
        return this.themes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivDataDto divDataDto = this.divSubtitle;
        int hashCode3 = (hashCode2 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        AccountTypeDto accountTypeDto = this.accountType;
        int c = tse0.c(this.interest, tse0.c(this.balance, (hashCode3 + (accountTypeDto == null ? 0 : accountTypeDto.hashCode())) * 31, 31), 31);
        String str2 = this.interestHint;
        int hashCode4 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.interestLocked;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.interestPaymentTerm;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Money money = this.target;
        int hashCode7 = (hashCode6 + (money == null ? 0 : money.hashCode())) * 31;
        AccountActionButtonGroupDto accountActionButtonGroupDto = this.buttonGroup;
        int c2 = unr0.c((hashCode7 + (accountActionButtonGroupDto == null ? 0 : accountActionButtonGroupDto.hashCode())) * 31, 31, this.layout);
        AccountDetailsDataDto accountDetailsDataDto = this.detailsDataWidget;
        int hashCode8 = (c2 + (accountDetailsDataDto == null ? 0 : accountDetailsDataDto.hashCode())) * 31;
        DocumentsWidgetDto documentsWidgetDto = this.documentsWidget;
        int hashCode9 = (hashCode8 + (documentsWidgetDto == null ? 0 : documentsWidgetDto.hashCode())) * 31;
        CloseAccountButtonDto closeAccountButtonDto = this.closeAccountWidget;
        int c3 = unr0.c((hashCode9 + (closeAccountButtonDto == null ? 0 : closeAccountButtonDto.hashCode())) * 31, 31, this.divkitWidgets);
        InterestDataDto interestDataDto = this.interestDataWidget;
        int b = unr0.b((c3 + (interestDataDto == null ? 0 : interestDataDto.hashCode())) * 31, 31, this.selectedThemeId);
        String str4 = this.supportUrl;
        int hashCode10 = (b + (str4 == null ? 0 : str4.hashCode())) * 31;
        SavingsIncomeWidgetDto savingsIncomeWidgetDto = this.incomeWidget;
        int hashCode11 = (hashCode10 + (savingsIncomeWidgetDto == null ? 0 : savingsIncomeWidgetDto.hashCode())) * 31;
        FundsIncomeDto fundsIncomeDto = this.fundIncomeWidget;
        int c4 = unr0.c((hashCode11 + (fundsIncomeDto == null ? 0 : fundsIncomeDto.hashCode())) * 31, 31, this.themes);
        PlusSubscriptionStatusDto plusSubscriptionStatusDto = this.plusSubscriptionStatus;
        return c4 + (plusSubscriptionStatusDto != null ? plusSubscriptionStatusDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        DivDataDto divDataDto = this.divSubtitle;
        AccountTypeDto accountTypeDto = this.accountType;
        Money money = this.balance;
        Money money2 = this.interest;
        String str3 = this.interestHint;
        Boolean bool = this.interestLocked;
        String str4 = this.interestPaymentTerm;
        Money money3 = this.target;
        AccountActionButtonGroupDto accountActionButtonGroupDto = this.buttonGroup;
        List<String> list = this.layout;
        AccountDetailsDataDto accountDetailsDataDto = this.detailsDataWidget;
        DocumentsWidgetDto documentsWidgetDto = this.documentsWidget;
        CloseAccountButtonDto closeAccountButtonDto = this.closeAccountWidget;
        List<DivkitWidgetDto> list2 = this.divkitWidgets;
        InterestDataDto interestDataDto = this.interestDataWidget;
        String str5 = this.selectedThemeId;
        String str6 = this.supportUrl;
        SavingsIncomeWidgetDto savingsIncomeWidgetDto = this.incomeWidget;
        FundsIncomeDto fundsIncomeDto = this.fundIncomeWidget;
        List<SavingsAccountThemeDto> list3 = this.themes;
        PlusSubscriptionStatusDto plusSubscriptionStatusDto = this.plusSubscriptionStatus;
        StringBuilder v = b64.v("SavingsAccountInfoResponse(title=", str, ", subtitle=", str2, ", divSubtitle=");
        v.append(divDataDto);
        v.append(", accountType=");
        v.append(accountTypeDto);
        v.append(", balance=");
        v.append(money);
        v.append(", interest=");
        v.append(money2);
        v.append(", interestHint=");
        tse0.A(v, str3, ", interestLocked=", bool, ", interestPaymentTerm=");
        v.append(str4);
        v.append(", target=");
        v.append(money3);
        v.append(", buttonGroup=");
        v.append(accountActionButtonGroupDto);
        v.append(", layout=");
        v.append(list);
        v.append(", detailsDataWidget=");
        v.append(accountDetailsDataDto);
        v.append(", documentsWidget=");
        v.append(documentsWidgetDto);
        v.append(", closeAccountWidget=");
        v.append(closeAccountButtonDto);
        v.append(", divkitWidgets=");
        v.append(list2);
        v.append(", interestDataWidget=");
        v.append(interestDataDto);
        v.append(", selectedThemeId=");
        v.append(str5);
        v.append(", supportUrl=");
        v.append(str6);
        v.append(", incomeWidget=");
        v.append(savingsIncomeWidgetDto);
        v.append(", fundIncomeWidget=");
        v.append(fundsIncomeDto);
        v.append(", themes=");
        v.append(list3);
        v.append(", plusSubscriptionStatus=");
        v.append(plusSubscriptionStatusDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
