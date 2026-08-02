package com.ybsdk.feature.savings.internal.mapper;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.entities.CellType;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import com.ybsdk.feature.savings.internal.network.dto.ClosingAccountInfoResponse;
import com.ybsdk.feature.savings.internal.network.dto.CreateAccountInfoResponse;
import com.ybsdk.feature.savings.internal.network.dto.DivSavingsAccountResponse;
import com.ybsdk.feature.savings.internal.network.dto.ExistingAccountInfoResponse;
import com.ybsdk.feature.savings.internal.network.dto.NoAccountsInfoResponse;
import com.ybsdk.feature.savings.internal.network.dto.OpeningAccountInfoResponse;
import com.ybsdk.feature.savings.internal.network.dto.SavingsCellResponse;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import defpackage.bam0;
import defpackage.bob1;
import defpackage.cam0;
import defpackage.dam0;
import defpackage.eam0;
import defpackage.fam0;
import defpackage.fob1;
import defpackage.g5b1;
import defpackage.g69;
import defpackage.g8e;
import defpackage.jdm0;
import defpackage.jv8;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.scm0;
import defpackage.ung0;
import defpackage.w511;
import defpackage.w530;
import defpackage.x4c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final w530 a;

    public a(w530 w530Var) {
        this.a = w530Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ClosingAccountInfoResponse closingAccountInfoResponse, ContinuationImpl continuationImpl) {
        CellMapper$toDomain$8 cellMapper$toDomain$8;
        int i;
        boolean z;
        String str;
        Text.Constant constant;
        Text.Constant constant2;
        Text.Constant constant3;
        Text text;
        MoneyEntity moneyEntity;
        Text.Constant constant4;
        bam0 bam0Var;
        String str2;
        CellType cellType;
        int i2;
        rr51 rr51Var;
        Object a;
        Text.Constant constant5;
        Text.Constant constant6;
        CellType cellType2;
        Text text2;
        Text.Constant constant7;
        bam0 bam0Var2;
        String str3;
        Text.Constant constant8;
        String str4;
        MoneyEntity moneyEntity2;
        if (continuationImpl instanceof CellMapper$toDomain$8) {
            cellMapper$toDomain$8 = (CellMapper$toDomain$8) continuationImpl;
            int i3 = cellMapper$toDomain$8.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cellMapper$toDomain$8.label = i3 - Integer.MIN_VALUE;
                Object obj = cellMapper$toDomain$8.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cellMapper$toDomain$8.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ColorModel a2 = qxy0.a(closingAccountInfoResponse.getCardBackground(), ung0.ybColor_product_savingsBgTheme1);
                    ColorModel a3 = qxy0.a(closingAccountInfoResponse.getTitleTextColor(), ung0.ybColor_textIcon_tertiary);
                    ColorModel a4 = qxy0.a(closingAccountInfoResponse.getSubtitleTextColor(), ung0.ybColor_textIcon_primary);
                    ColorModel a5 = qxy0.a(closingAccountInfoResponse.getBalanceTextColor(), ung0.ybColor_textIcon_tertiary);
                    ColorModel a6 = qxy0.a(closingAccountInfoResponse.getInterestTextColor(), ung0.ybColor_textIcon_primaryInverted);
                    ColorModel a7 = qxy0.a(closingAccountInfoResponse.getInterestBackground(), ung0.ybColor_fill_color7_400);
                    Themes<String> backgroundImage = closingAccountInfoResponse.getBackgroundImage();
                    ThemedImageUrlEntity c = backgroundImage != null ? qxy0.c(backgroundImage, null) : null;
                    com.ybsdk.core.utils.text.b bVar = Text.Companion;
                    Money balance = closingAccountInfoResponse.getBalance();
                    w530 w530Var = this.a;
                    String formattedAmount = bob1.g(balance, w530Var).getFormattedAmount();
                    bVar.getClass();
                    Text.Constant constant9 = new Text.Constant(formattedAmount);
                    Text.Constant constant10 = new Text.Constant(w530.a(this.a, closingAccountInfoResponse.getInterest().getAmount(), closingAccountInfoResponse.getInterest().getCurrency(), true, null, false, 56));
                    Boolean interestLocked = closingAccountInfoResponse.getInterestLocked();
                    boolean booleanValue = interestLocked != null ? interestLocked.booleanValue() : false;
                    Text.Constant constant11 = new Text.Constant(closingAccountInfoResponse.getTitle());
                    String subtitle = closingAccountInfoResponse.getSubtitle();
                    Text constant12 = subtitle != null ? new Text.Constant(subtitle) : Text.Empty.INSTANCE;
                    Money target = closingAccountInfoResponse.getTarget();
                    MoneyEntity g = target != null ? bob1.g(target, w530Var) : null;
                    String textUnderAmount = closingAccountInfoResponse.getTextUnderAmount();
                    Text.Constant constant13 = textUnderAmount != null ? new Text.Constant(textUnderAmount) : null;
                    String action = closingAccountInfoResponse.getAction();
                    if (action == null) {
                        action = null;
                    }
                    String agreementId = closingAccountInfoResponse.getAgreementId();
                    boolean z2 = booleanValue;
                    CellType cellType3 = CellType.CLOSING;
                    Text.Constant constant14 = constant13;
                    String str5 = action;
                    bam0 bam0Var3 = new bam0(a2, a5, a6, a7, a3, a4, c, closingAccountInfoResponse.getImageScaleTypeDto(), a5);
                    DivDataDto divSubtitle = closingAccountInfoResponse.getDivSubtitle();
                    if (divSubtitle == null) {
                        z = true;
                        str = str5;
                        constant = constant9;
                        constant2 = constant14;
                        constant3 = constant10;
                        text = constant12;
                        moneyEntity = g;
                        constant4 = constant11;
                        bam0Var = bam0Var3;
                        str2 = agreementId;
                        cellType = cellType3;
                        i2 = z2 ? 1 : 0;
                        rr51Var = null;
                        return new cam0(constant, constant3, constant4, text, moneyEntity, constant2, str, bam0Var, str2, cellType, i2 != 0 ? z : false, rr51Var);
                    }
                    cellMapper$toDomain$8.L$0 = constant9;
                    cellMapper$toDomain$8.L$1 = constant10;
                    cellMapper$toDomain$8.L$2 = constant11;
                    cellMapper$toDomain$8.L$3 = constant12;
                    cellMapper$toDomain$8.L$4 = g;
                    cellMapper$toDomain$8.L$5 = constant14;
                    cellMapper$toDomain$8.L$6 = str5;
                    cellMapper$toDomain$8.L$7 = agreementId;
                    cellMapper$toDomain$8.L$8 = cellType3;
                    cellMapper$toDomain$8.L$9 = bam0Var3;
                    cellMapper$toDomain$8.I$0 = z2 ? 1 : 0;
                    z = true;
                    cellMapper$toDomain$8.label = 1;
                    a = com.ybsdk.feature.divkit.internal.a.a(divSubtitle, new com.ybsdk.feature.divkit.api.domain.a(null), cellMapper$toDomain$8);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    constant5 = constant9;
                    obj = a;
                    Text text3 = constant12;
                    constant6 = constant10;
                    cellType2 = cellType3;
                    text2 = text3;
                    constant7 = constant14;
                    bam0Var2 = bam0Var3;
                    str3 = str5;
                    i2 = z2 ? 1 : 0;
                    constant8 = constant11;
                    str4 = agreementId;
                    moneyEntity2 = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = cellMapper$toDomain$8.I$0;
                    bam0Var2 = (bam0) cellMapper$toDomain$8.L$9;
                    cellType2 = (CellType) cellMapper$toDomain$8.L$8;
                    str4 = (String) cellMapper$toDomain$8.L$7;
                    str3 = (String) cellMapper$toDomain$8.L$6;
                    constant7 = (Text.Constant) cellMapper$toDomain$8.L$5;
                    moneyEntity2 = (MoneyEntity) cellMapper$toDomain$8.L$4;
                    Text text4 = (Text) cellMapper$toDomain$8.L$3;
                    constant8 = (Text.Constant) cellMapper$toDomain$8.L$2;
                    Text.Constant constant15 = (Text.Constant) cellMapper$toDomain$8.L$1;
                    constant5 = (Text.Constant) cellMapper$toDomain$8.L$0;
                    kotlin.b.b(obj);
                    constant6 = constant15;
                    z = true;
                    text2 = text4;
                }
                rr51Var = (rr51) obj;
                constant = constant5;
                bam0Var = bam0Var2;
                cellType = cellType2;
                constant3 = constant6;
                str2 = str4;
                str = str3;
                constant2 = constant7;
                moneyEntity = moneyEntity2;
                text = text2;
                constant4 = constant8;
                return new cam0(constant, constant3, constant4, text, moneyEntity, constant2, str, bam0Var, str2, cellType, i2 != 0 ? z : false, rr51Var);
            }
        }
        cellMapper$toDomain$8 = new CellMapper$toDomain$8(this, continuationImpl);
        Object obj2 = cellMapper$toDomain$8.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cellMapper$toDomain$8.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        constant = constant5;
        bam0Var = bam0Var2;
        cellType = cellType2;
        constant3 = constant6;
        str2 = str4;
        str = str3;
        constant2 = constant7;
        moneyEntity = moneyEntity2;
        text = text2;
        constant4 = constant8;
        return new cam0(constant, constant3, constant4, text, moneyEntity, constant2, str, bam0Var, str2, cellType, i2 != 0 ? z : false, rr51Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(DivSavingsAccountResponse divSavingsAccountResponse, com.ybsdk.feature.divkit.api.domain.a aVar, boolean z, ContinuationImpl continuationImpl) {
        CellMapper$toDomain$3 cellMapper$toDomain$3;
        int i;
        ColorModel a;
        ThemedImageUrlEntity themedImageUrlEntity;
        boolean z2;
        DivSavingsAccountResponse divSavingsAccountResponse2;
        rr51 rr51Var;
        SavingsDivEntity$ProductType savingsDivEntity$ProductType;
        CellType cellType;
        if (continuationImpl instanceof CellMapper$toDomain$3) {
            cellMapper$toDomain$3 = (CellMapper$toDomain$3) continuationImpl;
            int i2 = cellMapper$toDomain$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cellMapper$toDomain$3.label = i2 - Integer.MIN_VALUE;
                Object obj = cellMapper$toDomain$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cellMapper$toDomain$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Themes<String> backgroundImage = divSavingsAccountResponse.getBackgroundImage();
                    ThemedImageUrlEntity c = backgroundImage != null ? qxy0.c(backgroundImage, null) : null;
                    a = qxy0.a(divSavingsAccountResponse.getBackground(), ung0.ybColor_product_savingsBgTheme1);
                    DivDataDto div = divSavingsAccountResponse.getDiv();
                    cellMapper$toDomain$3.L$0 = divSavingsAccountResponse;
                    cellMapper$toDomain$3.L$1 = c;
                    cellMapper$toDomain$3.L$2 = a;
                    cellMapper$toDomain$3.Z$0 = z;
                    cellMapper$toDomain$3.label = 1;
                    Object a2 = com.ybsdk.feature.divkit.internal.a.a(div, aVar, cellMapper$toDomain$3);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    themedImageUrlEntity = c;
                    obj = a2;
                    z2 = z;
                    divSavingsAccountResponse2 = divSavingsAccountResponse;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = cellMapper$toDomain$3.Z$0;
                    a = (ColorModel) cellMapper$toDomain$3.L$2;
                    ThemedImageUrlEntity themedImageUrlEntity2 = (ThemedImageUrlEntity) cellMapper$toDomain$3.L$1;
                    divSavingsAccountResponse2 = (DivSavingsAccountResponse) cellMapper$toDomain$3.L$0;
                    kotlin.b.b(obj);
                    themedImageUrlEntity = themedImageUrlEntity2;
                }
                ColorModel colorModel = a;
                rr51Var = (rr51) obj;
                if (rr51Var != null) {
                    return null;
                }
                String id = divSavingsAccountResponse2.getId();
                if (id == null) {
                    id = divSavingsAccountResponse2.getAgreementId();
                }
                String str = id;
                String agreementId = divSavingsAccountResponse2.getAgreementId();
                ImageScaleTypeEntity b = g5b1.b(divSavingsAccountResponse2.getImageScaleTypeDto());
                DivSavingsAccountResponse.Type type = divSavingsAccountResponse2.getType();
                int[] iArr = g69.a;
                switch (iArr[type.ordinal()]) {
                    case 1:
                        savingsDivEntity$ProductType = SavingsDivEntity$ProductType.SAVINGS;
                        break;
                    case 2:
                        savingsDivEntity$ProductType = SavingsDivEntity$ProductType.DEPOSIT;
                        break;
                    case 3:
                        savingsDivEntity$ProductType = SavingsDivEntity$ProductType.INVESTMENT;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        savingsDivEntity$ProductType = SavingsDivEntity$ProductType.NONE;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                SavingsDivEntity$ProductType savingsDivEntity$ProductType2 = savingsDivEntity$ProductType;
                switch (iArr[divSavingsAccountResponse2.getType().ordinal()]) {
                    case 1:
                    case 2:
                        cellType = CellType.EXISTING;
                        break;
                    case 3:
                        if (!z2) {
                            cellType = CellType.EXISTING_NON_DRAGGABLE;
                            break;
                        } else {
                            cellType = CellType.EXISTING;
                            break;
                        }
                    case 4:
                        cellType = CellType.OPENING;
                        break;
                    case 5:
                        cellType = CellType.CLOSING;
                        break;
                    case 6:
                        cellType = CellType.BANNER;
                        break;
                    case 7:
                        cellType = CellType.SUGGEST_TO_CREATE;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                return new scm0(str, rr51Var, agreementId, colorModel, themedImageUrlEntity, b, cellType, savingsDivEntity$ProductType2);
            }
        }
        cellMapper$toDomain$3 = new CellMapper$toDomain$3(this, continuationImpl);
        Object obj2 = cellMapper$toDomain$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cellMapper$toDomain$3.label;
        if (i != 0) {
        }
        ColorModel colorModel2 = a;
        rr51Var = (rr51) obj2;
        if (rr51Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ExistingAccountInfoResponse existingAccountInfoResponse, ContinuationImpl continuationImpl) {
        CellMapper$toDomain$5 cellMapper$toDomain$5;
        int i;
        boolean z;
        String str;
        Text.Constant constant;
        Text.Constant constant2;
        Text.Constant constant3;
        Text text;
        MoneyEntity moneyEntity;
        Text.Constant constant4;
        bam0 bam0Var;
        String str2;
        CellType cellType;
        int i2;
        rr51 rr51Var;
        Object a;
        Text.Constant constant5;
        Text.Constant constant6;
        CellType cellType2;
        Text text2;
        Text.Constant constant7;
        bam0 bam0Var2;
        String str3;
        Text.Constant constant8;
        String str4;
        MoneyEntity moneyEntity2;
        if (continuationImpl instanceof CellMapper$toDomain$5) {
            cellMapper$toDomain$5 = (CellMapper$toDomain$5) continuationImpl;
            int i3 = cellMapper$toDomain$5.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cellMapper$toDomain$5.label = i3 - Integer.MIN_VALUE;
                Object obj = cellMapper$toDomain$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cellMapper$toDomain$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ColorModel a2 = qxy0.a(existingAccountInfoResponse.getCardBackground(), ung0.ybColor_product_savingsBgTheme1);
                    ColorModel a3 = qxy0.a(existingAccountInfoResponse.getTitleTextColor(), ung0.ybColor_textIcon_primary);
                    Themes<String> subtitleTextColor = existingAccountInfoResponse.getSubtitleTextColor();
                    if (subtitleTextColor == null) {
                        subtitleTextColor = existingAccountInfoResponse.getTitleTextColor();
                    }
                    ColorModel a4 = qxy0.a(subtitleTextColor, ung0.ybColor_textIcon_primary);
                    ColorModel a5 = qxy0.a(existingAccountInfoResponse.getBalanceTextColor(), ung0.ybColor_textIcon_primary);
                    ColorModel a6 = qxy0.a(existingAccountInfoResponse.getInterestTextColor(), ung0.ybColor_textIcon_primaryInverted);
                    ColorModel a7 = qxy0.a(existingAccountInfoResponse.getInterestBackground(), ung0.ybColor_fill_color7_400);
                    Themes<String> backgroundImage = existingAccountInfoResponse.getBackgroundImage();
                    ThemedImageUrlEntity c = backgroundImage != null ? qxy0.c(backgroundImage, null) : null;
                    Themes<String> targetTextColor = existingAccountInfoResponse.getTargetTextColor();
                    if (targetTextColor == null) {
                        targetTextColor = existingAccountInfoResponse.getTitleTextColor();
                    }
                    ColorModel a8 = qxy0.a(targetTextColor, ung0.ybColor_textIcon_primary);
                    com.ybsdk.core.utils.text.b bVar = Text.Companion;
                    Money balance = existingAccountInfoResponse.getBalance();
                    w530 w530Var = this.a;
                    String formattedAmount = bob1.g(balance, w530Var).getFormattedAmount();
                    bVar.getClass();
                    Text.Constant constant9 = new Text.Constant(formattedAmount);
                    Text.Constant constant10 = new Text.Constant(w530.a(this.a, existingAccountInfoResponse.getInterest().getAmount(), existingAccountInfoResponse.getInterest().getCurrency(), true, null, false, 56));
                    Boolean interestLocked = existingAccountInfoResponse.getInterestLocked();
                    boolean booleanValue = interestLocked != null ? interestLocked.booleanValue() : false;
                    Text.Constant constant11 = new Text.Constant(existingAccountInfoResponse.getTitle());
                    String subtitle = existingAccountInfoResponse.getSubtitle();
                    Text constant12 = subtitle != null ? new Text.Constant(subtitle) : Text.Empty.INSTANCE;
                    Money target = existingAccountInfoResponse.getTarget();
                    MoneyEntity g = target != null ? bob1.g(target, w530Var) : null;
                    String textUnderAmount = existingAccountInfoResponse.getTextUnderAmount();
                    Text.Constant constant13 = textUnderAmount != null ? new Text.Constant(textUnderAmount) : null;
                    String action = existingAccountInfoResponse.getAction();
                    String agreementId = existingAccountInfoResponse.getAgreementId();
                    boolean z2 = booleanValue;
                    CellType cellType3 = CellType.EXISTING;
                    Text.Constant constant14 = constant13;
                    bam0 bam0Var3 = new bam0(a2, a5, a6, a7, a3, a4, c, existingAccountInfoResponse.getImageScaleTypeDto(), a8);
                    DivDataDto divSubtitle = existingAccountInfoResponse.getDivSubtitle();
                    if (divSubtitle == null) {
                        z = true;
                        str = action;
                        constant = constant9;
                        constant2 = constant14;
                        constant3 = constant10;
                        text = constant12;
                        moneyEntity = g;
                        constant4 = constant11;
                        bam0Var = bam0Var3;
                        str2 = agreementId;
                        cellType = cellType3;
                        i2 = z2 ? 1 : 0;
                        rr51Var = null;
                        return new cam0(constant, constant3, constant4, text, moneyEntity, constant2, str, bam0Var, str2, cellType, i2 != 0 ? z : false, rr51Var);
                    }
                    cellMapper$toDomain$5.L$0 = constant9;
                    cellMapper$toDomain$5.L$1 = constant10;
                    cellMapper$toDomain$5.L$2 = constant11;
                    cellMapper$toDomain$5.L$3 = constant12;
                    cellMapper$toDomain$5.L$4 = g;
                    cellMapper$toDomain$5.L$5 = constant14;
                    cellMapper$toDomain$5.L$6 = action;
                    cellMapper$toDomain$5.L$7 = agreementId;
                    cellMapper$toDomain$5.L$8 = cellType3;
                    cellMapper$toDomain$5.L$9 = bam0Var3;
                    cellMapper$toDomain$5.I$0 = z2 ? 1 : 0;
                    z = true;
                    cellMapper$toDomain$5.label = 1;
                    a = com.ybsdk.feature.divkit.internal.a.a(divSubtitle, new com.ybsdk.feature.divkit.api.domain.a(null), cellMapper$toDomain$5);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    constant5 = constant9;
                    obj = a;
                    Text text3 = constant12;
                    constant6 = constant10;
                    cellType2 = cellType3;
                    text2 = text3;
                    constant7 = constant14;
                    bam0Var2 = bam0Var3;
                    str3 = action;
                    i2 = z2 ? 1 : 0;
                    constant8 = constant11;
                    str4 = agreementId;
                    moneyEntity2 = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = cellMapper$toDomain$5.I$0;
                    bam0Var2 = (bam0) cellMapper$toDomain$5.L$9;
                    cellType2 = (CellType) cellMapper$toDomain$5.L$8;
                    str4 = (String) cellMapper$toDomain$5.L$7;
                    str3 = (String) cellMapper$toDomain$5.L$6;
                    constant7 = (Text.Constant) cellMapper$toDomain$5.L$5;
                    moneyEntity2 = (MoneyEntity) cellMapper$toDomain$5.L$4;
                    Text text4 = (Text) cellMapper$toDomain$5.L$3;
                    constant8 = (Text.Constant) cellMapper$toDomain$5.L$2;
                    Text.Constant constant15 = (Text.Constant) cellMapper$toDomain$5.L$1;
                    constant5 = (Text.Constant) cellMapper$toDomain$5.L$0;
                    kotlin.b.b(obj);
                    constant6 = constant15;
                    z = true;
                    text2 = text4;
                }
                rr51Var = (rr51) obj;
                constant = constant5;
                bam0Var = bam0Var2;
                cellType = cellType2;
                constant3 = constant6;
                str2 = str4;
                str = str3;
                constant2 = constant7;
                moneyEntity = moneyEntity2;
                text = text2;
                constant4 = constant8;
                return new cam0(constant, constant3, constant4, text, moneyEntity, constant2, str, bam0Var, str2, cellType, i2 != 0 ? z : false, rr51Var);
            }
        }
        cellMapper$toDomain$5 = new CellMapper$toDomain$5(this, continuationImpl);
        Object obj2 = cellMapper$toDomain$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cellMapper$toDomain$5.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        constant = constant5;
        bam0Var = bam0Var2;
        cellType = cellType2;
        constant3 = constant6;
        str2 = str4;
        str = str3;
        constant2 = constant7;
        moneyEntity = moneyEntity2;
        text = text2;
        constant4 = constant8;
        return new cam0(constant, constant3, constant4, text, moneyEntity, constant2, str, bam0Var, str2, cellType, i2 != 0 ? z : false, rr51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
    
        if (r1 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0209, code lost:
    
        if (r1 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020b, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f8 -> B:14:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0176 -> B:14:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0209 -> B:11:0x020c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0210 -> B:12:0x0212). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        CellMapper$toDomain$1 cellMapper$toDomain$1;
        int i;
        Iterator it;
        Collection collection;
        Object obj;
        SavingsCellResponse savingsCellResponse;
        char c;
        jdm0 jdm0Var;
        eam0 eam0Var;
        if (continuationImpl instanceof CellMapper$toDomain$1) {
            cellMapper$toDomain$1 = (CellMapper$toDomain$1) continuationImpl;
            int i2 = cellMapper$toDomain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cellMapper$toDomain$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cellMapper$toDomain$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cellMapper$toDomain$1.label;
                char c2 = 2;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    savingsCellResponse = (SavingsCellResponse) cellMapper$toDomain$1.L$2;
                    it = (Iterator) cellMapper$toDomain$1.L$1;
                    collection = (Collection) cellMapper$toDomain$1.L$0;
                    kotlin.b.b(obj2);
                    obj = (fam0) obj2;
                    if (obj == null) {
                    }
                    c = 2;
                    if (obj != null) {
                    }
                    c2 = c;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) cellMapper$toDomain$1.L$1;
                    Collection collection2 = (Collection) cellMapper$toDomain$1.L$0;
                    kotlin.b.b(obj2);
                    collection = collection2;
                    it = it2;
                    c = 2;
                    obj = (fam0) obj2;
                    if (obj == null) {
                        x4c.g("All fields of SavingsAccountsInfoResponse is null", null, null, null, 14);
                        obj = null;
                    }
                    if (obj != null) {
                        collection.add(obj);
                    }
                    c2 = c;
                    if (!it.hasNext()) {
                        return (List) collection;
                    }
                    savingsCellResponse = (SavingsCellResponse) it.next();
                    OpeningAccountInfoResponse openingAccountInfo = savingsCellResponse.getOpeningAccountInfo();
                    if (openingAccountInfo != null) {
                        String titleText = openingAccountInfo.getTitleText();
                        Text i3 = titleText != null ? g8e.i(Text.Companion, titleText) : Text.Empty.INSTANCE;
                        Text.Constant i4 = g8e.i(Text.Companion, openingAccountInfo.getMainText());
                        rbv c3 = fob1.c(openingAccountInfo.getImage().getLight(), openingAccountInfo.getImage().getDark(), new jv8(7));
                        if (c3 != null) {
                            Themes<String> backgroundImage = openingAccountInfo.getBackgroundImage();
                            ThemedImageUrlEntity c4 = backgroundImage != null ? qxy0.c(backgroundImage, null) : null;
                            ColorModel a = qxy0.a(openingAccountInfo.getCardBackground(), ung0.ybColor_product_savingsBgTheme1);
                            ColorModel a2 = qxy0.a(openingAccountInfo.getTitleTextColor(), ung0.ybColor_textIcon_secondary);
                            ColorModel a3 = qxy0.a(openingAccountInfo.getMainTextColor(), ung0.ybColor_textIcon_primary);
                            String action = openingAccountInfo.getAction();
                            obj = new eam0(i3, i4, action != null ? action : null, CellType.OPENING, new dam0(c3, a, a2, a3, c4));
                        } else {
                            obj = null;
                        }
                        if (obj != null) {
                            c = c2;
                            if (obj != null) {
                            }
                            c2 = c;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                    CreateAccountInfoResponse createAccountInfoResponse = savingsCellResponse.getCreateAccountInfoResponse();
                    if (createAccountInfoResponse != null) {
                        Text.Constant i5 = g8e.i(Text.Companion, createAccountInfoResponse.getMainText());
                        rbv c5 = fob1.c(createAccountInfoResponse.getCellImage().getLight(), createAccountInfoResponse.getCellImage().getDark(), new jv8(9));
                        if (c5 != null) {
                            Themes<String> backgroundImage2 = createAccountInfoResponse.getBackgroundImage();
                            eam0Var = new eam0(Text.Empty.INSTANCE, i5, createAccountInfoResponse.getAction(), CellType.SUGGEST_TO_CREATE, new dam0(c5, qxy0.a(createAccountInfoResponse.getCardBackground(), ung0.ybColor_fill_default_50), new ColorModel.Attr(ung0.ybColor_textIcon_secondary), qxy0.a(createAccountInfoResponse.getMainTextColor(), ung0.ybColor_textIcon_primary), backgroundImage2 != null ? qxy0.c(backgroundImage2, null) : null));
                        } else {
                            eam0Var = null;
                        }
                        obj = eam0Var;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        ExistingAccountInfoResponse existingAccountInfo = savingsCellResponse.getExistingAccountInfo();
                        if (existingAccountInfo != null) {
                            cellMapper$toDomain$1.L$0 = collection;
                            cellMapper$toDomain$1.L$1 = it;
                            cellMapper$toDomain$1.L$2 = savingsCellResponse;
                            cellMapper$toDomain$1.label = 1;
                            obj2 = c(existingAccountInfo, cellMapper$toDomain$1);
                        } else {
                            obj = null;
                            if (obj == null) {
                                NoAccountsInfoResponse noAccountsInfo = savingsCellResponse.getNoAccountsInfo();
                                if (noAccountsInfo == null) {
                                    obj = null;
                                } else {
                                    rbv c6 = fob1.c(noAccountsInfo.getImage().getLight(), noAccountsInfo.getImage().getDark(), new jv8(8));
                                    if (c6 != null) {
                                        String description = noAccountsInfo.getDescription();
                                        jdm0Var = new jdm0(c6, g8e.i(Text.Companion, noAccountsInfo.getTitle()), description != null ? g8e.i(Text.Companion, description) : Text.Empty.INSTANCE, new Text.Constant(noAccountsInfo.getButtonText()), noAccountsInfo.getAction());
                                    } else {
                                        jdm0Var = null;
                                    }
                                    obj = jdm0Var;
                                }
                                if (obj == null) {
                                    ClosingAccountInfoResponse closingAccountInfo = savingsCellResponse.getClosingAccountInfo();
                                    if (closingAccountInfo != null) {
                                        cellMapper$toDomain$1.L$0 = collection;
                                        cellMapper$toDomain$1.L$1 = it;
                                        cellMapper$toDomain$1.L$2 = null;
                                        c = 2;
                                        cellMapper$toDomain$1.label = 2;
                                        obj2 = a(closingAccountInfo, cellMapper$toDomain$1);
                                    } else {
                                        c = 2;
                                        obj = null;
                                        if (obj == null) {
                                        }
                                        if (obj != null) {
                                        }
                                        c2 = c;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c = 2;
                    if (obj != null) {
                    }
                    c2 = c;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        cellMapper$toDomain$1 = new CellMapper$toDomain$1(this, continuationImpl);
        Object obj22 = cellMapper$toDomain$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cellMapper$toDomain$1.label;
        char c22 = 2;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006e -> B:10:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, DivDataDto divDataDto, boolean z, ContinuationImpl continuationImpl) {
        CellMapper$toDomainV3$2 cellMapper$toDomainV3$2;
        int i;
        Iterator it;
        boolean z2;
        Collection collection;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        if (continuationImpl instanceof CellMapper$toDomainV3$2) {
            cellMapper$toDomainV3$2 = (CellMapper$toDomainV3$2) continuationImpl;
            int i2 = cellMapper$toDomainV3$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cellMapper$toDomainV3$2.label = i2 - Integer.MIN_VALUE;
                Object obj = cellMapper$toDomainV3$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cellMapper$toDomainV3$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(divDataDto);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    z2 = z;
                    collection = arrayList;
                    aVar = aVar2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = cellMapper$toDomainV3$2.Z$0;
                    it = (Iterator) cellMapper$toDomainV3$2.L$2;
                    collection = (Collection) cellMapper$toDomainV3$2.L$1;
                    aVar = (com.ybsdk.feature.divkit.api.domain.a) cellMapper$toDomainV3$2.L$0;
                    kotlin.b.b(obj);
                    scm0 scm0Var = (scm0) obj;
                    if (scm0Var != null) {
                        collection.add(scm0Var);
                    }
                    if (it.hasNext()) {
                        DivSavingsAccountResponse divSavingsAccountResponse = (DivSavingsAccountResponse) it.next();
                        cellMapper$toDomainV3$2.L$0 = aVar;
                        cellMapper$toDomainV3$2.L$1 = collection;
                        cellMapper$toDomainV3$2.L$2 = it;
                        cellMapper$toDomainV3$2.Z$0 = z2;
                        cellMapper$toDomainV3$2.label = 1;
                        obj = b(divSavingsAccountResponse, aVar, z2, cellMapper$toDomainV3$2);
                        if (obj == obj2) {
                            return obj2;
                        }
                        scm0 scm0Var2 = (scm0) obj;
                        if (scm0Var2 != null) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        cellMapper$toDomainV3$2 = new CellMapper$toDomainV3$2(this, continuationImpl);
        Object obj3 = cellMapper$toDomainV3$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cellMapper$toDomainV3$2.label;
        if (i != 0) {
        }
    }
}
