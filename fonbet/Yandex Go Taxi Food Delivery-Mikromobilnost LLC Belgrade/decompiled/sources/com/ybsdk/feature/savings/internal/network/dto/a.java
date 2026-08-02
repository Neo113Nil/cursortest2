package com.ybsdk.feature.savings.internal.network.dto;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.entities.AccountType;
import com.ybsdk.feature.savings.internal.entities.PlusSubscriptionStatus;
import defpackage.a3m0;
import defpackage.b3m0;
import defpackage.bob1;
import defpackage.f9m0;
import defpackage.g9m0;
import defpackage.h9m0;
import defpackage.i9m0;
import defpackage.j9m0;
import defpackage.jl40;
import defpackage.k9m0;
import defpackage.l9m0;
import defpackage.lvy0;
import defpackage.m9m0;
import defpackage.n9m0;
import defpackage.ny61;
import defpackage.o9m0;
import defpackage.p9m0;
import defpackage.q9m0;
import defpackage.qxy0;
import defpackage.r9m0;
import defpackage.rr51;
import defpackage.s5m0;
import defpackage.s7m0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.w530;
import defpackage.x6m0;
import defpackage.y6m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final w530 a;

    public a(w530 w530Var) {
        this.a = w530Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r30v2, types: [r9m0] */
    /* JADX WARN: Type inference failed for: r3v47, types: [h9m0] */
    /* JADX WARN: Type inference failed for: r3v53, types: [j9m0] */
    /* JADX WARN: Type inference failed for: r3v62, types: [m9m0] */
    /* JADX WARN: Type inference failed for: r3v72, types: [p9m0] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v29, types: [f9m0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0563 -> B:11:0x0573). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0583 -> B:12:0x05a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SavingsAccountInfoResponse savingsAccountInfoResponse, ContinuationImpl continuationImpl) {
        SavingsAccountInfoMapper$map$1 savingsAccountInfoMapper$map$1;
        int i;
        w530 w530Var;
        String title;
        String subtitle;
        SavingsAccountInfoResponse savingsAccountInfoResponse2;
        rr51 rr51Var;
        Object obj;
        AccountTypeDto accountType;
        AccountType accountType2;
        String interestPaymentTerm;
        AccountActionButtonGroupDto buttonGroup;
        b3m0 b3m0Var;
        String supportUrl;
        String str;
        SavingsAccountInfoResponse savingsAccountInfoResponse3;
        SavingsAccountInfoMapper$map$1 savingsAccountInfoMapper$map$12;
        CoroutineSingletons coroutineSingletons;
        b3m0 b3m0Var2;
        MoneyEntity moneyEntity;
        ArrayList arrayList;
        boolean z;
        MoneyEntity moneyEntity2;
        Iterator it;
        rr51 rr51Var2;
        String str2;
        AccountType accountType3;
        MoneyEntity moneyEntity3;
        boolean z2;
        PlusSubscriptionStatus plusSubscriptionStatus;
        ColorModel c;
        ColorModel c2;
        ColorModel c3;
        ColorModel c4;
        ColorModel c5;
        ColorModel c6;
        s7m0 s7m0Var;
        ArrayList arrayList2;
        String str3;
        MoneyEntity moneyEntity4;
        MoneyEntity moneyEntity5;
        String str4;
        Object obj2;
        i9m0 i9m0Var;
        i9m0 i9m0Var2;
        if (continuationImpl instanceof SavingsAccountInfoMapper$map$1) {
            savingsAccountInfoMapper$map$1 = (SavingsAccountInfoMapper$map$1) continuationImpl;
            int i2 = savingsAccountInfoMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsAccountInfoMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = savingsAccountInfoMapper$map$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsAccountInfoMapper$map$1.label;
                w530Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    title = savingsAccountInfoResponse.getTitle();
                    subtitle = savingsAccountInfoResponse.getSubtitle();
                    DivDataDto divSubtitle = savingsAccountInfoResponse.getDivSubtitle();
                    if (divSubtitle != null) {
                        com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                        savingsAccountInfoMapper$map$1.L$0 = savingsAccountInfoResponse;
                        savingsAccountInfoMapper$map$1.L$1 = title;
                        savingsAccountInfoMapper$map$1.L$2 = subtitle;
                        savingsAccountInfoMapper$map$1.label = 1;
                        Object b = aVar.b(divSubtitle, savingsAccountInfoMapper$map$1);
                        if (b == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        obj = b;
                        savingsAccountInfoResponse2 = savingsAccountInfoResponse;
                    } else {
                        savingsAccountInfoResponse2 = savingsAccountInfoResponse;
                        rr51Var = null;
                        accountType = savingsAccountInfoResponse2.getAccountType();
                        if (accountType != null) {
                            int i3 = b.a[accountType.ordinal()];
                            if (i3 == 1) {
                                accountType2 = AccountType.DEPOSIT;
                            } else if (i3 == 2) {
                                accountType2 = AccountType.SAVINGS;
                            } else {
                                if (i3 != 3) {
                                    w511.b();
                                    return null;
                                }
                                accountType2 = AccountType.INVEST;
                            }
                        } else {
                            accountType2 = null;
                        }
                        MoneyEntity g = bob1.g(savingsAccountInfoResponse2.getInterest(), w530Var);
                        String interestHint = savingsAccountInfoResponse2.getInterestHint();
                        Boolean interestLocked = savingsAccountInfoResponse2.getInterestLocked();
                        boolean booleanValue = interestLocked != null ? interestLocked.booleanValue() : false;
                        interestPaymentTerm = savingsAccountInfoResponse2.getInterestPaymentTerm();
                        Money target = savingsAccountInfoResponse2.getTarget();
                        MoneyEntity g2 = target != null ? bob1.g(target, w530Var) : null;
                        buttonGroup = savingsAccountInfoResponse2.getButtonGroup();
                        if (buttonGroup != null) {
                            a3m0 a = c.a(buttonGroup.getFirstButton());
                            AccountActionButtonDto secondButton = buttonGroup.getSecondButton();
                            b3m0Var = new b3m0(a, secondButton != null ? c.a(secondButton) : null);
                        } else {
                            b3m0Var = null;
                        }
                        MoneyEntity g3 = bob1.g(savingsAccountInfoResponse2.getBalance(), w530Var);
                        supportUrl = savingsAccountInfoResponse2.getSupportUrl();
                        if (supportUrl == null) {
                            supportUrl = null;
                        }
                        List<String> layout = savingsAccountInfoResponse2.getLayout();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = layout.iterator();
                        SavingsAccountInfoMapper$map$1 savingsAccountInfoMapper$map$13 = savingsAccountInfoMapper$map$1;
                        str = subtitle;
                        savingsAccountInfoResponse3 = savingsAccountInfoResponse2;
                        savingsAccountInfoMapper$map$12 = savingsAccountInfoMapper$map$13;
                        coroutineSingletons = coroutineSingletons2;
                        b3m0Var2 = b3m0Var;
                        moneyEntity = g3;
                        arrayList = arrayList3;
                        z = booleanValue;
                        moneyEntity2 = g2;
                        it = it2;
                        rr51Var2 = rr51Var;
                        str2 = interestHint;
                        accountType3 = accountType2;
                        moneyEntity3 = g;
                        if (!it.hasNext()) {
                        }
                    }
                } else if (i == 1) {
                    subtitle = (String) savingsAccountInfoMapper$map$1.L$2;
                    title = (String) savingsAccountInfoMapper$map$1.L$1;
                    savingsAccountInfoResponse2 = (SavingsAccountInfoResponse) savingsAccountInfoMapper$map$1.L$0;
                    kotlin.b.b(obj3);
                    obj = ((Result) obj3).getValue();
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r4 = savingsAccountInfoMapper$map$1.I$0;
                    Iterator it3 = (Iterator) savingsAccountInfoMapper$map$1.L$13;
                    ?? r11 = (Collection) savingsAccountInfoMapper$map$1.L$12;
                    String str5 = (String) savingsAccountInfoMapper$map$1.L$11;
                    MoneyEntity moneyEntity6 = (MoneyEntity) savingsAccountInfoMapper$map$1.L$10;
                    b3m0 b3m0Var3 = (b3m0) savingsAccountInfoMapper$map$1.L$9;
                    MoneyEntity moneyEntity7 = (MoneyEntity) savingsAccountInfoMapper$map$1.L$8;
                    String str6 = (String) savingsAccountInfoMapper$map$1.L$7;
                    String str7 = (String) savingsAccountInfoMapper$map$1.L$6;
                    moneyEntity3 = (MoneyEntity) savingsAccountInfoMapper$map$1.L$5;
                    accountType3 = (AccountType) savingsAccountInfoMapper$map$1.L$4;
                    rr51Var2 = (rr51) savingsAccountInfoMapper$map$1.L$3;
                    String str8 = (String) savingsAccountInfoMapper$map$1.L$2;
                    String str9 = (String) savingsAccountInfoMapper$map$1.L$1;
                    SavingsAccountInfoResponse savingsAccountInfoResponse4 = (SavingsAccountInfoResponse) savingsAccountInfoMapper$map$1.L$0;
                    kotlin.b.b(obj3);
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    String str10 = str7;
                    w530 w530Var2 = w530Var;
                    SavingsAccountInfoResponse savingsAccountInfoResponse5 = savingsAccountInfoResponse4;
                    Object obj4 = obj3;
                    MoneyEntity moneyEntity8 = moneyEntity7;
                    supportUrl = str5;
                    ArrayList arrayList4 = r11;
                    interestPaymentTerm = str6;
                    savingsAccountInfoMapper$map$12 = savingsAccountInfoMapper$map$1;
                    str = str8;
                    boolean z3 = r4;
                    i9m0 i9m0Var3 = (i9m0) obj4;
                    savingsAccountInfoResponse3 = savingsAccountInfoResponse5;
                    String str11 = str10;
                    b3m0 b3m0Var4 = b3m0Var3;
                    moneyEntity = moneyEntity6;
                    arrayList = arrayList4;
                    it = it3;
                    boolean z4 = z3;
                    title = str9;
                    i9m0 i9m0Var4 = i9m0Var3;
                    String str12 = str11;
                    b3m0 b3m0Var5 = b3m0Var4;
                    i9m0 i9m0Var5 = i9m0Var4;
                    z = z4;
                    moneyEntity2 = moneyEntity8;
                    if (i9m0Var5 != null) {
                        arrayList.add(i9m0Var5);
                    }
                    coroutineSingletons = coroutineSingletons3;
                    w530Var = w530Var2;
                    str2 = str12;
                    b3m0Var2 = b3m0Var5;
                    if (!it.hasNext()) {
                        Iterator it4 = it;
                        String str13 = (String) it.next();
                        SavingsIncomeWidgetDto incomeWidget = savingsAccountInfoResponse3.getIncomeWidget();
                        if (incomeWidget != null) {
                            String layoutId = incomeWidget.getLayoutId();
                            arrayList2 = arrayList;
                            str3 = layoutId;
                        } else {
                            arrayList2 = arrayList;
                            str3 = null;
                        }
                        if (jl40.l(str13, str3)) {
                            SavingsIncomeWidgetDto incomeWidget2 = savingsAccountInfoResponse3.getIncomeWidget();
                            String layoutId2 = incomeWidget2.getLayoutId();
                            String title2 = incomeWidget2.getTitle();
                            str4 = supportUrl;
                            List<SavingsIncomePeriodDto> periods = incomeWidget2.getPeriods();
                            moneyEntity5 = moneyEntity;
                            b3m0Var5 = b3m0Var2;
                            moneyEntity4 = moneyEntity2;
                            ArrayList arrayList5 = new ArrayList(tcc.n(periods, 10));
                            Iterator it5 = periods.iterator();
                            while (it5.hasNext()) {
                                SavingsIncomePeriodDto savingsIncomePeriodDto = (SavingsIncomePeriodDto) it5.next();
                                String rate = savingsIncomePeriodDto.getRate();
                                String progressEnd = savingsIncomePeriodDto.getProgressEnd();
                                String progressStart = savingsIncomePeriodDto.getProgressStart();
                                String startDate = savingsIncomePeriodDto.getStartDate();
                                String startYear = savingsIncomePeriodDto.getStartYear();
                                String endDate = savingsIncomePeriodDto.getEndDate();
                                String endYear = savingsIncomePeriodDto.getEndYear();
                                List<SavingsIncomePeriodDateDto> dates = savingsIncomePeriodDto.getDates();
                                Iterator it6 = it5;
                                String str14 = interestPaymentTerm;
                                ArrayList arrayList6 = new ArrayList(tcc.n(dates, 10));
                                for (Iterator it7 = dates.iterator(); it7.hasNext(); it7 = it7) {
                                    SavingsIncomePeriodDateDto savingsIncomePeriodDateDto = (SavingsIncomePeriodDateDto) it7.next();
                                    arrayList6.add(new n9m0(savingsIncomePeriodDateDto.getDate(), savingsIncomePeriodDateDto.getAmount()));
                                }
                                arrayList5.add(new o9m0(rate, progressEnd, progressStart, startDate, startYear, endDate, endYear, arrayList6, savingsIncomePeriodDto.getDateCurrent(), savingsIncomePeriodDto.getShowLock(), savingsIncomePeriodDto.getInteractive()));
                                it5 = it6;
                                interestPaymentTerm = str14;
                            }
                            ?? p9m0Var = new p9m0(layoutId2, title2, arrayList5);
                            it = it4;
                            str12 = str2;
                            coroutineSingletons3 = coroutineSingletons;
                            arrayList = arrayList2;
                            i9m0Var5 = p9m0Var;
                        } else {
                            b3m0Var5 = b3m0Var2;
                            moneyEntity4 = moneyEntity2;
                            String str15 = interestPaymentTerm;
                            moneyEntity5 = moneyEntity;
                            str4 = supportUrl;
                            FundsIncomeDto fundIncomeWidget = savingsAccountInfoResponse3.getFundIncomeWidget();
                            if (jl40.l(str13, fundIncomeWidget != null ? fundIncomeWidget.getLayoutId() : null)) {
                                FundsIncomeDto fundIncomeWidget2 = savingsAccountInfoResponse3.getFundIncomeWidget();
                                String layoutId3 = fundIncomeWidget2.getLayoutId();
                                String title3 = fundIncomeWidget2.getTitle();
                                String infoAction = fundIncomeWidget2.getInfoAction();
                                List<FundsIncomePeriodDto> periods2 = fundIncomeWidget2.getPeriods();
                                ArrayList arrayList7 = new ArrayList(tcc.n(periods2, 10));
                                Iterator it8 = periods2.iterator();
                                while (it8.hasNext()) {
                                    FundsIncomePeriodDto fundsIncomePeriodDto = (FundsIncomePeriodDto) it8.next();
                                    String id = fundsIncomePeriodDto.getId();
                                    String chipTitle = fundsIncomePeriodDto.getChipTitle();
                                    String description = fundsIncomePeriodDto.getDescription();
                                    String income = fundsIncomePeriodDto.getIncome();
                                    String startDate2 = fundsIncomePeriodDto.getStartDate();
                                    String endDate2 = fundsIncomePeriodDto.getEndDate();
                                    List<FundsIncomePeriodPointDto> points = fundsIncomePeriodDto.getPoints();
                                    Iterator it9 = it8;
                                    String str16 = str2;
                                    ArrayList arrayList8 = new ArrayList(tcc.n(points, 10));
                                    for (FundsIncomePeriodPointDto fundsIncomePeriodPointDto : points) {
                                        arrayList8.add(new l9m0(fundsIncomePeriodPointDto.getAmount(), fundsIncomePeriodPointDto.getIncomeText(), fundsIncomePeriodPointDto.getSubtitle(), fundsIncomePeriodPointDto.getDailyIncome()));
                                    }
                                    arrayList7.add(new k9m0(id, chipTitle, description, income, startDate2, endDate2, arrayList8));
                                    it8 = it9;
                                    str2 = str16;
                                }
                                str12 = str2;
                                i9m0Var2 = new m9m0(layoutId3, title3, infoAction, arrayList7);
                            } else {
                                str12 = str2;
                                DocumentsWidgetDto documentsWidget = savingsAccountInfoResponse3.getDocumentsWidget();
                                if (jl40.l(str13, documentsWidget != null ? documentsWidget.getLayoutId() : null)) {
                                    DocumentsWidgetDto documentsWidget2 = savingsAccountInfoResponse3.getDocumentsWidget();
                                    String layoutId4 = documentsWidget2.getLayoutId();
                                    String title4 = documentsWidget2.getTitle();
                                    List<DocumentButtonDto> buttons = documentsWidget2.getButtons();
                                    ArrayList arrayList9 = new ArrayList(tcc.n(buttons, 10));
                                    for (DocumentButtonDto documentButtonDto : buttons) {
                                        arrayList9.add(new s5m0(documentButtonDto.getTitle(), documentButtonDto.getAction(), qxy0.c(documentButtonDto.getIcon(), null)));
                                    }
                                    i9m0Var2 = new j9m0(layoutId4, title4, arrayList9);
                                } else {
                                    AccountDetailsDataDto detailsDataWidget = savingsAccountInfoResponse3.getDetailsDataWidget();
                                    if (jl40.l(str13, detailsDataWidget != null ? detailsDataWidget.getLayoutId() : null)) {
                                        AccountDetailsDataDto detailsDataWidget2 = savingsAccountInfoResponse3.getDetailsDataWidget();
                                        String layoutId5 = detailsDataWidget2.getLayoutId();
                                        String title5 = detailsDataWidget2.getTitle();
                                        String action = detailsDataWidget2.getAction();
                                        List<AccountDetailsElementDto> buttons2 = detailsDataWidget2.getButtons();
                                        ArrayList arrayList10 = new ArrayList(tcc.n(buttons2, 10));
                                        for (AccountDetailsElementDto accountDetailsElementDto : buttons2) {
                                            arrayList10.add(new g9m0(accountDetailsElementDto.getLabel(), accountDetailsElementDto.getValue()));
                                        }
                                        i9m0Var2 = new h9m0(layoutId5, title5, action, arrayList10);
                                    } else {
                                        CloseAccountButtonDto closeAccountWidget = savingsAccountInfoResponse3.getCloseAccountWidget();
                                        if (jl40.l(str13, closeAccountWidget != null ? closeAccountWidget.getLayoutId() : null)) {
                                            CloseAccountButtonDto closeAccountWidget2 = savingsAccountInfoResponse3.getCloseAccountWidget();
                                            String layoutId6 = closeAccountWidget2.getLayoutId();
                                            String title6 = closeAccountWidget2.getTitle();
                                            String action2 = closeAccountWidget2.getAction();
                                            Themes<String> icon = closeAccountWidget2.getIcon();
                                            ?? f9m0Var = new f9m0(layoutId6, title6, action2, icon != null ? qxy0.c(icon, null) : null);
                                            it = it4;
                                            i9m0Var = f9m0Var;
                                            coroutineSingletons3 = coroutineSingletons;
                                            arrayList = arrayList2;
                                            interestPaymentTerm = str15;
                                            i9m0Var5 = i9m0Var;
                                        } else {
                                            InterestDataDto interestDataWidget = savingsAccountInfoResponse3.getInterestDataWidget();
                                            if (jl40.l(str13, interestDataWidget != null ? interestDataWidget.getLayoutId() : null)) {
                                                InterestDataDto interestDataWidget2 = savingsAccountInfoResponse3.getInterestDataWidget();
                                                String layoutId7 = interestDataWidget2.getLayoutId();
                                                String title7 = interestDataWidget2.getTitle();
                                                String subtitle2 = interestDataWidget2.getSubtitle();
                                                MoneyEntity g4 = bob1.g(interestDataWidget2.getTotal(), w530Var);
                                                Themes<String> totalTextColor = interestDataWidget2.getTotalTextColor();
                                                ColorModel c7 = totalTextColor != null ? lvy0.c(totalTextColor) : null;
                                                String action3 = interestDataWidget2.getAction();
                                                List<InterestMonthDataDto> data = interestDataWidget2.getData();
                                                ArrayList arrayList11 = new ArrayList(tcc.n(data, 10));
                                                for (InterestMonthDataDto interestMonthDataDto : data) {
                                                    String text = interestMonthDataDto.getText();
                                                    MoneyEntity g5 = bob1.g(interestMonthDataDto.getAmount(), w530Var);
                                                    Themes<String> textColor = interestMonthDataDto.getTextColor();
                                                    ColorModel c8 = textColor != null ? lvy0.c(textColor) : null;
                                                    Themes<String> amountColor = interestMonthDataDto.getAmountColor();
                                                    ColorModel c9 = amountColor != null ? lvy0.c(amountColor) : null;
                                                    Themes<String> backgroundColor = interestMonthDataDto.getBackgroundColor();
                                                    arrayList11.add(new q9m0(g5, c8, c9, backgroundColor != null ? lvy0.c(backgroundColor) : null, text));
                                                }
                                                ?? r9m0Var = new r9m0(layoutId7, title7, subtitle2, g4, c7, action3, arrayList11);
                                                it = it4;
                                                coroutineSingletons3 = coroutineSingletons;
                                                arrayList = arrayList2;
                                                interestPaymentTerm = str15;
                                                moneyEntity2 = moneyEntity4;
                                                moneyEntity = moneyEntity5;
                                                supportUrl = str4;
                                                i9m0Var5 = r9m0Var;
                                                w530Var2 = w530Var;
                                                if (i9m0Var5 != null) {
                                                }
                                                coroutineSingletons = coroutineSingletons3;
                                                w530Var = w530Var2;
                                                str2 = str12;
                                                b3m0Var2 = b3m0Var5;
                                                if (!it.hasNext()) {
                                                    MoneyEntity moneyEntity9 = moneyEntity2;
                                                    ArrayList arrayList12 = arrayList;
                                                    MoneyEntity moneyEntity10 = moneyEntity;
                                                    b3m0 b3m0Var6 = b3m0Var2;
                                                    String str17 = str2;
                                                    ArrayList arrayList13 = arrayList12;
                                                    List<SavingsAccountThemeDto> themes = savingsAccountInfoResponse3.getThemes();
                                                    ArrayList arrayList14 = new ArrayList();
                                                    Iterator it10 = themes.iterator();
                                                    while (it10.hasNext()) {
                                                        SavingsAccountThemeDto savingsAccountThemeDto = (SavingsAccountThemeDto) it10.next();
                                                        String selectedThemeId = savingsAccountInfoResponse3.getSelectedThemeId();
                                                        String id2 = savingsAccountThemeDto.getId();
                                                        Iterator it11 = it10;
                                                        boolean l = jl40.l(savingsAccountThemeDto.getId(), selectedThemeId);
                                                        ColorModel c10 = lvy0.c(savingsAccountThemeDto.getBackgroundColor());
                                                        if (c10 != null) {
                                                            Themes<String> backgroundImage = savingsAccountThemeDto.getBackgroundImage();
                                                            ThemedImageUrlEntity c11 = backgroundImage != null ? qxy0.c(backgroundImage, null) : null;
                                                            ColorModel c12 = lvy0.c(savingsAccountThemeDto.getBalanceTextColor());
                                                            if (c12 != null && (c = lvy0.c(savingsAccountThemeDto.getInterestPillTextColor())) != null && (c2 = lvy0.c(savingsAccountThemeDto.getInterestPillBackgroundColor())) != null && (c3 = lvy0.c(savingsAccountThemeDto.getInterestMonthBackgroundColor())) != null && (c4 = lvy0.c(savingsAccountThemeDto.getFirstButtonTextColor())) != null) {
                                                                Themes<String> firstButtonSubtitleColor = savingsAccountThemeDto.getFirstButtonSubtitleColor();
                                                                ColorModel c13 = firstButtonSubtitleColor != null ? lvy0.c(firstButtonSubtitleColor) : null;
                                                                ColorModel c14 = lvy0.c(savingsAccountThemeDto.getFirstButtonBackgroundColor());
                                                                if (c14 != null && (c5 = lvy0.c(savingsAccountThemeDto.getSecondButtonTextColor())) != null) {
                                                                    Themes<String> secondButtonSubtitleColor = savingsAccountThemeDto.getSecondButtonSubtitleColor();
                                                                    ColorModel c15 = secondButtonSubtitleColor != null ? lvy0.c(secondButtonSubtitleColor) : null;
                                                                    ColorModel c16 = lvy0.c(savingsAccountThemeDto.getSecondButtonBackgroundColor());
                                                                    if (c16 != null && (c6 = lvy0.c(savingsAccountThemeDto.getTargetTextColor())) != null) {
                                                                        Themes<String> themeSelectorBackgroundImage = savingsAccountThemeDto.getThemeSelectorBackgroundImage();
                                                                        s7m0Var = new s7m0(id2, l, c10, c11, c4, c13, c14, c5, c15, c16, c12, c, c2, c3, c6, themeSelectorBackgroundImage != null ? qxy0.c(themeSelectorBackgroundImage, null) : null);
                                                                        if (s7m0Var == null) {
                                                                            arrayList14.add(s7m0Var);
                                                                        }
                                                                        it10 = it11;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        s7m0Var = null;
                                                        if (s7m0Var == null) {
                                                        }
                                                        it10 = it11;
                                                    }
                                                    PlusSubscriptionStatusDto plusSubscriptionStatus2 = savingsAccountInfoResponse3.getPlusSubscriptionStatus();
                                                    int i4 = plusSubscriptionStatus2 == null ? -1 : y6m0.a[plusSubscriptionStatus2.ordinal()];
                                                    if (i4 != -1) {
                                                        z2 = true;
                                                        if (i4 == 1) {
                                                            plusSubscriptionStatus = PlusSubscriptionStatus.ACTIVE;
                                                        } else if (i4 == 2) {
                                                            plusSubscriptionStatus = PlusSubscriptionStatus.FROZEN;
                                                        } else if (i4 != 3) {
                                                            w511.b();
                                                            return null;
                                                        }
                                                        return new x6m0(title, str, rr51Var2, accountType3, moneyEntity3, str17, !z ? z2 : false, interestPaymentTerm, moneyEntity9, moneyEntity10, supportUrl, b3m0Var6, arrayList13, arrayList14, plusSubscriptionStatus);
                                                    }
                                                    z2 = true;
                                                    plusSubscriptionStatus = PlusSubscriptionStatus.NONE;
                                                    return new x6m0(title, str, rr51Var2, accountType3, moneyEntity3, str17, !z ? z2 : false, interestPaymentTerm, moneyEntity9, moneyEntity10, supportUrl, b3m0Var6, arrayList13, arrayList14, plusSubscriptionStatus);
                                                }
                                            } else {
                                                Iterator it12 = savingsAccountInfoResponse3.getDivkitWidgets().iterator();
                                                while (true) {
                                                    if (!it12.hasNext()) {
                                                        obj2 = null;
                                                        break;
                                                    }
                                                    obj2 = it12.next();
                                                    if (jl40.l(((DivkitWidgetDto) obj2).getLayoutId(), str13)) {
                                                        break;
                                                    }
                                                }
                                                DivkitWidgetDto divkitWidgetDto = (DivkitWidgetDto) obj2;
                                                if (divkitWidgetDto != null) {
                                                    savingsAccountInfoMapper$map$12.L$0 = savingsAccountInfoResponse3;
                                                    savingsAccountInfoMapper$map$12.L$1 = title;
                                                    savingsAccountInfoMapper$map$12.L$2 = str;
                                                    savingsAccountInfoMapper$map$12.L$3 = rr51Var2;
                                                    savingsAccountInfoMapper$map$12.L$4 = accountType3;
                                                    savingsAccountInfoMapper$map$12.L$5 = moneyEntity3;
                                                    str10 = str12;
                                                    savingsAccountInfoMapper$map$12.L$6 = str10;
                                                    interestPaymentTerm = str15;
                                                    savingsAccountInfoMapper$map$12.L$7 = interestPaymentTerm;
                                                    savingsAccountInfoMapper$map$12.L$8 = moneyEntity4;
                                                    b3m0Var3 = b3m0Var5;
                                                    savingsAccountInfoMapper$map$12.L$9 = b3m0Var3;
                                                    moneyEntity6 = moneyEntity5;
                                                    savingsAccountInfoMapper$map$12.L$10 = moneyEntity6;
                                                    supportUrl = str4;
                                                    savingsAccountInfoMapper$map$12.L$11 = supportUrl;
                                                    ArrayList arrayList15 = arrayList2;
                                                    savingsAccountInfoMapper$map$12.L$12 = arrayList15;
                                                    w530Var2 = w530Var;
                                                    savingsAccountInfoMapper$map$12.L$13 = it4;
                                                    savingsAccountInfoMapper$map$12.I$0 = z ? 1 : 0;
                                                    savingsAccountInfoMapper$map$12.label = 2;
                                                    Object b2 = c.b(divkitWidgetDto, savingsAccountInfoMapper$map$12);
                                                    coroutineSingletons3 = coroutineSingletons;
                                                    if (b2 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    SavingsAccountInfoResponse savingsAccountInfoResponse6 = savingsAccountInfoResponse3;
                                                    obj4 = b2;
                                                    savingsAccountInfoResponse5 = savingsAccountInfoResponse6;
                                                    boolean z5 = z;
                                                    str9 = title;
                                                    z3 = z5;
                                                    moneyEntity8 = moneyEntity4;
                                                    arrayList4 = arrayList15;
                                                    it3 = it4;
                                                    i9m0 i9m0Var32 = (i9m0) obj4;
                                                    savingsAccountInfoResponse3 = savingsAccountInfoResponse5;
                                                    String str112 = str10;
                                                    b3m0 b3m0Var42 = b3m0Var3;
                                                    moneyEntity = moneyEntity6;
                                                    arrayList = arrayList4;
                                                    it = it3;
                                                    boolean z42 = z3;
                                                    title = str9;
                                                    i9m0 i9m0Var42 = i9m0Var32;
                                                    String str122 = str112;
                                                    b3m0 b3m0Var52 = b3m0Var42;
                                                    i9m0 i9m0Var52 = i9m0Var42;
                                                    z = z42;
                                                    moneyEntity2 = moneyEntity8;
                                                    if (i9m0Var52 != null) {
                                                    }
                                                    coroutineSingletons = coroutineSingletons3;
                                                    w530Var = w530Var2;
                                                    str2 = str122;
                                                    b3m0Var2 = b3m0Var52;
                                                    if (!it.hasNext()) {
                                                    }
                                                } else {
                                                    coroutineSingletons3 = coroutineSingletons;
                                                    ArrayList arrayList16 = arrayList2;
                                                    interestPaymentTerm = str15;
                                                    supportUrl = str4;
                                                    w530Var2 = w530Var;
                                                    str112 = str122;
                                                    moneyEntity8 = moneyEntity4;
                                                    b3m0Var42 = b3m0Var52;
                                                    it = it4;
                                                    moneyEntity = moneyEntity5;
                                                    arrayList = arrayList16;
                                                    z42 = z;
                                                    i9m0Var42 = null;
                                                    String str1222 = str112;
                                                    b3m0 b3m0Var522 = b3m0Var42;
                                                    i9m0 i9m0Var522 = i9m0Var42;
                                                    z = z42;
                                                    moneyEntity2 = moneyEntity8;
                                                    if (i9m0Var522 != null) {
                                                    }
                                                    coroutineSingletons = coroutineSingletons3;
                                                    w530Var = w530Var2;
                                                    str2 = str1222;
                                                    b3m0Var2 = b3m0Var522;
                                                    if (!it.hasNext()) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            it = it4;
                            i9m0Var = i9m0Var2;
                            coroutineSingletons3 = coroutineSingletons;
                            arrayList = arrayList2;
                            interestPaymentTerm = str15;
                            i9m0Var522 = i9m0Var;
                        }
                        moneyEntity2 = moneyEntity4;
                        moneyEntity = moneyEntity5;
                        supportUrl = str4;
                        w530Var2 = w530Var;
                        if (i9m0Var522 != null) {
                        }
                        coroutineSingletons = coroutineSingletons3;
                        w530Var = w530Var2;
                        str2 = str1222;
                        b3m0Var2 = b3m0Var522;
                        if (!it.hasNext()) {
                        }
                    }
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                rr51Var = (rr51) obj;
                accountType = savingsAccountInfoResponse2.getAccountType();
                if (accountType != null) {
                }
                MoneyEntity g6 = bob1.g(savingsAccountInfoResponse2.getInterest(), w530Var);
                String interestHint2 = savingsAccountInfoResponse2.getInterestHint();
                Boolean interestLocked2 = savingsAccountInfoResponse2.getInterestLocked();
                if (interestLocked2 != null) {
                }
                interestPaymentTerm = savingsAccountInfoResponse2.getInterestPaymentTerm();
                Money target2 = savingsAccountInfoResponse2.getTarget();
                if (target2 != null) {
                }
                buttonGroup = savingsAccountInfoResponse2.getButtonGroup();
                if (buttonGroup != null) {
                }
                MoneyEntity g32 = bob1.g(savingsAccountInfoResponse2.getBalance(), w530Var);
                supportUrl = savingsAccountInfoResponse2.getSupportUrl();
                if (supportUrl == null) {
                }
                List<String> layout2 = savingsAccountInfoResponse2.getLayout();
                ArrayList arrayList32 = new ArrayList();
                Iterator it22 = layout2.iterator();
                SavingsAccountInfoMapper$map$1 savingsAccountInfoMapper$map$132 = savingsAccountInfoMapper$map$1;
                str = subtitle;
                savingsAccountInfoResponse3 = savingsAccountInfoResponse2;
                savingsAccountInfoMapper$map$12 = savingsAccountInfoMapper$map$132;
                coroutineSingletons = coroutineSingletons2;
                b3m0Var2 = b3m0Var;
                moneyEntity = g32;
                arrayList = arrayList32;
                z = booleanValue;
                moneyEntity2 = g2;
                it = it22;
                rr51Var2 = rr51Var;
                str2 = interestHint2;
                accountType3 = accountType2;
                moneyEntity3 = g6;
                if (!it.hasNext()) {
                }
            }
        }
        savingsAccountInfoMapper$map$1 = new SavingsAccountInfoMapper$map$1(this, continuationImpl);
        Object obj32 = savingsAccountInfoMapper$map$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsAccountInfoMapper$map$1.label;
        w530Var = this.a;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        rr51Var = (rr51) obj;
        accountType = savingsAccountInfoResponse2.getAccountType();
        if (accountType != null) {
        }
        MoneyEntity g62 = bob1.g(savingsAccountInfoResponse2.getInterest(), w530Var);
        String interestHint22 = savingsAccountInfoResponse2.getInterestHint();
        Boolean interestLocked22 = savingsAccountInfoResponse2.getInterestLocked();
        if (interestLocked22 != null) {
        }
        interestPaymentTerm = savingsAccountInfoResponse2.getInterestPaymentTerm();
        Money target22 = savingsAccountInfoResponse2.getTarget();
        if (target22 != null) {
        }
        buttonGroup = savingsAccountInfoResponse2.getButtonGroup();
        if (buttonGroup != null) {
        }
        MoneyEntity g322 = bob1.g(savingsAccountInfoResponse2.getBalance(), w530Var);
        supportUrl = savingsAccountInfoResponse2.getSupportUrl();
        if (supportUrl == null) {
        }
        List<String> layout22 = savingsAccountInfoResponse2.getLayout();
        ArrayList arrayList322 = new ArrayList();
        Iterator it222 = layout22.iterator();
        SavingsAccountInfoMapper$map$1 savingsAccountInfoMapper$map$1322 = savingsAccountInfoMapper$map$1;
        str = subtitle;
        savingsAccountInfoResponse3 = savingsAccountInfoResponse2;
        savingsAccountInfoMapper$map$12 = savingsAccountInfoMapper$map$1322;
        coroutineSingletons = coroutineSingletons22;
        b3m0Var2 = b3m0Var;
        moneyEntity = g322;
        arrayList = arrayList322;
        z = booleanValue;
        moneyEntity2 = g2;
        it = it222;
        rr51Var2 = rr51Var;
        str2 = interestHint22;
        accountType3 = accountType2;
        moneyEntity3 = g62;
        if (!it.hasNext()) {
        }
    }
}
