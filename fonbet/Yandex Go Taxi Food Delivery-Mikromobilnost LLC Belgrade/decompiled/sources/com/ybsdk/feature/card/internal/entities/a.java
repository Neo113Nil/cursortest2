package com.ybsdk.feature.card.internal.entities;

import com.ybsdk.core.common.data.network.dto.Snackbar;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.network.dto.CardProductType;
import com.ybsdk.feature.card.internal.network.dto.SingleCarDetailsResponse;
import com.ybsdk.feature.card.internal.network.dto.SingleCardDetailsHeaderDto;
import com.ybsdk.feature.card.internal.network.dto.SingleCardDetailsSettingsSectionResponse;
import com.ybsdk.feature.card.internal.network.dto.SingleCardHeaderResponse;
import com.ybsdk.feature.card.internal.network.dto.SingleCardResponse;
import com.ybsdk.feature.card.internal.network.dto.SingleCardSettingResponse;
import com.ybsdk.feature.card.internal.network.dto.Snackbars;
import com.ybsdk.feature.card.internal.network.dto.YbCardTypeResponse;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.fob1;
import defpackage.g8e;
import defpackage.hgs0;
import defpackage.igs0;
import defpackage.j9r0;
import defpackage.jbv;
import defpackage.jgs0;
import defpackage.jq51;
import defpackage.lvy0;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.pfb1;
import defpackage.pgs0;
import defpackage.qgs0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.ukr0;
import defpackage.ung0;
import defpackage.w511;
import defpackage.xvq;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(SingleCardResponse singleCardResponse, ContinuationImpl continuationImpl) {
        SingleCardDetailsEntityKt$toDomain$1 singleCardDetailsEntityKt$toDomain$1;
        int i;
        ColorModel a;
        ColorModel a2;
        qgs0 qgs0Var;
        String title;
        String title2;
        CardProductTypeEntity cardProductTypeEntity;
        YbCardTypeResponse cardType;
        SingleCardResponse singleCardResponse2;
        pgs0 pgs0Var;
        CardProductTypeEntity cardProductTypeEntity2;
        rr51 rr51Var;
        Object a3;
        ThemedParameter<String> image;
        ArrayList arrayList;
        ArrayList arrayList2;
        DivDataDto bottomNotification;
        rr51 rr51Var2;
        rr51 rr51Var3;
        CardProductTypeEntity cardProductTypeEntity3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        String str2;
        qgs0 qgs0Var2;
        SingleCardResponse singleCardResponse3;
        pgs0 pgs0Var2;
        Object a4;
        rr51 rr51Var4;
        CardProductTypeEntity cardProductTypeEntity4;
        ?? r7;
        ?? r8;
        String str3;
        String str4;
        qgs0 qgs0Var3;
        pgs0 pgs0Var3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        SingleCardDetailsSettingsSectionResponse cardAdditionalSetting;
        ArrayList arrayList7;
        Snackbars snackbars;
        jgs0 jgs0Var;
        List<SingleCardSettingResponse> settings;
        if (continuationImpl instanceof SingleCardDetailsEntityKt$toDomain$1) {
            singleCardDetailsEntityKt$toDomain$1 = (SingleCardDetailsEntityKt$toDomain$1) continuationImpl;
            int i2 = singleCardDetailsEntityKt$toDomain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleCardDetailsEntityKt$toDomain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleCardDetailsEntityKt$toDomain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleCardDetailsEntityKt$toDomain$1.label;
                n0t0 n0t0Var = null;
                if (i != 0) {
                    b.b(obj);
                    SingleCardHeaderResponse header = singleCardResponse.getHeader();
                    String text = header.getTitle().getText();
                    a = lvy0.a(header.getTitle().getThemedColor(), new ColorModel.Attr(ung0.ybColor_textIcon_primary), new xvq(29));
                    String text2 = header.getSubtitle().getText();
                    a2 = lvy0.a(header.getSubtitle().getThemedColor(), new ColorModel.Attr(ung0.ybColor_textIcon_primary), new xvq(29));
                    jq51 c = pfb1.c(header.getSkin());
                    jbv b = fob1.b(header.getNfcBadge());
                    jbv b2 = header.getBadgeImage() != null ? fob1.b(header.getBadgeImage()) : null;
                    SingleCardDetailsHeaderDto renameAction = header.getRenameAction();
                    jbv b3 = (renameAction == null || (image = renameAction.getImage()) == null) ? null : fob1.b(image);
                    SingleCardDetailsHeaderDto renameAction2 = header.getRenameAction();
                    pgs0 pgs0Var4 = new pgs0(text, a, text2, a2, c, b, b2, b3, renameAction2 != null ? renameAction2.getAction() : null);
                    SingleCarDetailsResponse cardDetails = singleCardResponse.getCardDetails();
                    qgs0Var = new qgs0(cardDetails.getLastPanDigits(), cardDetails.getExpirationDate(), cardDetails.getStatus());
                    title = singleCardResponse.getSettings().getTitle();
                    title2 = singleCardResponse.getManagementSettings().getTitle();
                    List<SingleCardSettingResponse> settings2 = singleCardResponse.getManagementSettings().getSettings();
                    ArrayList arrayList8 = new ArrayList();
                    for (SingleCardSettingResponse singleCardSettingResponse : settings2) {
                        o8r0 a5 = j9r0.a(singleCardSettingResponse.getSetting(), b(singleCardSettingResponse.getImage()));
                        if (a5 != null) {
                            arrayList8.add(a5);
                        }
                    }
                    List<SingleCardSettingResponse> settings3 = singleCardResponse.getSettings().getSettings();
                    ArrayList arrayList9 = new ArrayList();
                    for (SingleCardSettingResponse singleCardSettingResponse2 : settings3) {
                        o8r0 a6 = j9r0.a(singleCardSettingResponse2.getSetting(), b(singleCardSettingResponse2.getImage()));
                        if (a6 != null) {
                            arrayList9.add(a6);
                        }
                    }
                    int i3 = igs0.a[singleCardResponse.getCardDetails().getProductType().ordinal()];
                    if (i3 == 1) {
                        cardProductTypeEntity = CardProductTypeEntity.WALLET;
                    } else if (i3 == 2) {
                        cardProductTypeEntity = CardProductTypeEntity.PRO;
                    } else if (i3 == 3) {
                        cardProductTypeEntity = CardProductTypeEntity.CREDIT_LIMIT;
                    } else if (i3 == 4) {
                        cardProductTypeEntity = CardProductTypeEntity.SPLIT;
                    } else {
                        if (i3 != 5) {
                            w511.b();
                            return null;
                        }
                        cardProductTypeEntity = CardProductTypeEntity.UNKNOWN;
                    }
                    cardType = singleCardResponse.getCardDetails().getCardType();
                    DivDataDto notificationDivData = singleCardResponse.getNotificationDivData();
                    singleCardResponse2 = singleCardResponse;
                    if (notificationDivData != null) {
                        singleCardDetailsEntityKt$toDomain$1.L$0 = singleCardResponse2;
                        singleCardDetailsEntityKt$toDomain$1.L$1 = pgs0Var4;
                        singleCardDetailsEntityKt$toDomain$1.L$2 = qgs0Var;
                        singleCardDetailsEntityKt$toDomain$1.L$3 = title;
                        singleCardDetailsEntityKt$toDomain$1.L$4 = title2;
                        singleCardDetailsEntityKt$toDomain$1.L$5 = arrayList8;
                        singleCardDetailsEntityKt$toDomain$1.L$6 = arrayList9;
                        singleCardDetailsEntityKt$toDomain$1.L$7 = cardProductTypeEntity;
                        singleCardDetailsEntityKt$toDomain$1.L$8 = cardType;
                        singleCardDetailsEntityKt$toDomain$1.label = 1;
                        a3 = com.ybsdk.feature.divkit.internal.a.a(notificationDivData, new com.ybsdk.feature.divkit.api.domain.a(null), singleCardDetailsEntityKt$toDomain$1);
                        if (a3 != coroutineSingletons) {
                            cardProductTypeEntity2 = cardProductTypeEntity;
                            obj = a3;
                            pgs0Var = pgs0Var4;
                            arrayList6 = arrayList9;
                            arrayList5 = arrayList8;
                        }
                        return coroutineSingletons;
                    }
                    pgs0Var = pgs0Var4;
                    cardProductTypeEntity2 = cardProductTypeEntity;
                    rr51Var = null;
                    arrayList2 = arrayList9;
                    arrayList = arrayList8;
                    bottomNotification = singleCardResponse2.getBottomNotification();
                    if (bottomNotification == null) {
                        rr51Var2 = rr51Var;
                        rr51Var3 = null;
                        cardProductTypeEntity3 = cardProductTypeEntity2;
                        arrayList3 = arrayList2;
                        arrayList4 = arrayList;
                        str = title2;
                        str2 = title;
                        qgs0Var2 = qgs0Var;
                        singleCardResponse3 = singleCardResponse2;
                        pgs0Var2 = pgs0Var;
                        YbCardTypeResponse ybCardTypeResponse = cardType;
                        SingleCardDetailsSettingsSectionResponse cardAdditionalSetting2 = singleCardResponse3.getCardAdditionalSetting();
                        if (cardAdditionalSetting2 != null) {
                        }
                        cardAdditionalSetting = singleCardResponse3.getCardAdditionalSetting();
                        if (cardAdditionalSetting != null) {
                        }
                        arrayList7 = null;
                        Boolean showRequisites = singleCardResponse3.getShowRequisites();
                        if (showRequisites != null) {
                        }
                        snackbars = singleCardResponse3.getSnackbars();
                        if (snackbars != null) {
                        }
                        return new hgs0(pgs0Var2, qgs0Var2, str2, str, arrayList3, arrayList4, cardProductTypeEntity3, ybCardTypeResponse, rr51Var2, rr51Var3, r24, arrayList7, r26, jgs0Var);
                    }
                    singleCardDetailsEntityKt$toDomain$1.L$0 = singleCardResponse2;
                    singleCardDetailsEntityKt$toDomain$1.L$1 = pgs0Var;
                    singleCardDetailsEntityKt$toDomain$1.L$2 = qgs0Var;
                    singleCardDetailsEntityKt$toDomain$1.L$3 = title;
                    singleCardDetailsEntityKt$toDomain$1.L$4 = title2;
                    singleCardDetailsEntityKt$toDomain$1.L$5 = arrayList;
                    singleCardDetailsEntityKt$toDomain$1.L$6 = arrayList2;
                    singleCardDetailsEntityKt$toDomain$1.L$7 = cardProductTypeEntity2;
                    singleCardDetailsEntityKt$toDomain$1.L$8 = cardType;
                    singleCardDetailsEntityKt$toDomain$1.L$9 = rr51Var;
                    singleCardDetailsEntityKt$toDomain$1.label = 2;
                    a4 = com.ybsdk.feature.divkit.internal.a.a(bottomNotification, new com.ybsdk.feature.divkit.api.domain.a(null), singleCardDetailsEntityKt$toDomain$1);
                    if (a4 != coroutineSingletons) {
                        rr51Var4 = rr51Var;
                        obj = a4;
                        cardProductTypeEntity4 = cardProductTypeEntity2;
                        r7 = arrayList2;
                        r8 = arrayList;
                        str3 = title2;
                        str4 = title;
                        qgs0Var3 = qgs0Var;
                        pgs0Var3 = pgs0Var;
                        singleCardResponse3 = singleCardResponse2;
                        rr51Var3 = (rr51) obj;
                        rr51Var2 = rr51Var4;
                        cardProductTypeEntity3 = cardProductTypeEntity4;
                        arrayList3 = r7;
                        arrayList4 = r8;
                        str = str3;
                        str2 = str4;
                        qgs0Var2 = qgs0Var3;
                        pgs0Var2 = pgs0Var3;
                        YbCardTypeResponse ybCardTypeResponse2 = cardType;
                        SingleCardDetailsSettingsSectionResponse cardAdditionalSetting22 = singleCardResponse3.getCardAdditionalSetting();
                        if (cardAdditionalSetting22 != null) {
                        }
                        cardAdditionalSetting = singleCardResponse3.getCardAdditionalSetting();
                        if (cardAdditionalSetting != null) {
                        }
                        arrayList7 = null;
                        Boolean showRequisites2 = singleCardResponse3.getShowRequisites();
                        if (showRequisites2 != null) {
                        }
                        snackbars = singleCardResponse3.getSnackbars();
                        if (snackbars != null) {
                        }
                        return new hgs0(pgs0Var2, qgs0Var2, str2, str, arrayList3, arrayList4, cardProductTypeEntity3, ybCardTypeResponse2, rr51Var2, rr51Var3, r24, arrayList7, r26, jgs0Var);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rr51Var4 = (rr51) singleCardDetailsEntityKt$toDomain$1.L$9;
                    cardType = (YbCardTypeResponse) singleCardDetailsEntityKt$toDomain$1.L$8;
                    cardProductTypeEntity4 = (CardProductTypeEntity) singleCardDetailsEntityKt$toDomain$1.L$7;
                    r7 = (List) singleCardDetailsEntityKt$toDomain$1.L$6;
                    r8 = (List) singleCardDetailsEntityKt$toDomain$1.L$5;
                    str3 = (String) singleCardDetailsEntityKt$toDomain$1.L$4;
                    str4 = (String) singleCardDetailsEntityKt$toDomain$1.L$3;
                    qgs0Var3 = (qgs0) singleCardDetailsEntityKt$toDomain$1.L$2;
                    pgs0Var3 = (pgs0) singleCardDetailsEntityKt$toDomain$1.L$1;
                    singleCardResponse3 = (SingleCardResponse) singleCardDetailsEntityKt$toDomain$1.L$0;
                    b.b(obj);
                    rr51Var3 = (rr51) obj;
                    rr51Var2 = rr51Var4;
                    cardProductTypeEntity3 = cardProductTypeEntity4;
                    arrayList3 = r7;
                    arrayList4 = r8;
                    str = str3;
                    str2 = str4;
                    qgs0Var2 = qgs0Var3;
                    pgs0Var2 = pgs0Var3;
                    YbCardTypeResponse ybCardTypeResponse22 = cardType;
                    SingleCardDetailsSettingsSectionResponse cardAdditionalSetting222 = singleCardResponse3.getCardAdditionalSetting();
                    String title3 = cardAdditionalSetting222 != null ? cardAdditionalSetting222.getTitle() : null;
                    cardAdditionalSetting = singleCardResponse3.getCardAdditionalSetting();
                    if (cardAdditionalSetting != null || (settings = cardAdditionalSetting.getSettings()) == null) {
                        arrayList7 = null;
                    } else {
                        ArrayList arrayList10 = new ArrayList();
                        for (SingleCardSettingResponse singleCardSettingResponse3 : settings) {
                            o8r0 a7 = j9r0.a(singleCardSettingResponse3.getSetting(), b(singleCardSettingResponse3.getImage()));
                            if (a7 != null) {
                                arrayList10.add(a7);
                            }
                        }
                        arrayList7 = arrayList10;
                    }
                    Boolean showRequisites22 = singleCardResponse3.getShowRequisites();
                    boolean booleanValue = showRequisites22 != null ? showRequisites22.booleanValue() : singleCardResponse3.getCardDetails().getProductType() != CardProductType.CORP_CARD;
                    snackbars = singleCardResponse3.getSnackbars();
                    if (snackbars != null) {
                        Snackbar error2fa = snackbars.getError2fa();
                        if (error2fa != null) {
                            Text.Constant constant = new Text.Constant(error2fa.getTitle());
                            String subtitle = error2fa.getSubtitle();
                            n0t0Var = new n0t0(constant, subtitle != null ? g8e.i(Text.Companion, subtitle) : Text.Empty.INSTANCE);
                        }
                        jgs0Var = new jgs0(n0t0Var);
                    } else {
                        jgs0Var = null;
                    }
                    return new hgs0(pgs0Var2, qgs0Var2, str2, str, arrayList3, arrayList4, cardProductTypeEntity3, ybCardTypeResponse22, rr51Var2, rr51Var3, title3, arrayList7, booleanValue, jgs0Var);
                }
                cardType = (YbCardTypeResponse) singleCardDetailsEntityKt$toDomain$1.L$8;
                cardProductTypeEntity2 = (CardProductTypeEntity) singleCardDetailsEntityKt$toDomain$1.L$7;
                ?? r82 = (List) singleCardDetailsEntityKt$toDomain$1.L$6;
                ?? r9 = (List) singleCardDetailsEntityKt$toDomain$1.L$5;
                title2 = (String) singleCardDetailsEntityKt$toDomain$1.L$4;
                title = (String) singleCardDetailsEntityKt$toDomain$1.L$3;
                qgs0Var = (qgs0) singleCardDetailsEntityKt$toDomain$1.L$2;
                pgs0Var = (pgs0) singleCardDetailsEntityKt$toDomain$1.L$1;
                singleCardResponse2 = (SingleCardResponse) singleCardDetailsEntityKt$toDomain$1.L$0;
                b.b(obj);
                arrayList6 = r82;
                arrayList5 = r9;
                rr51Var = (rr51) obj;
                arrayList2 = arrayList6;
                arrayList = arrayList5;
                bottomNotification = singleCardResponse2.getBottomNotification();
                if (bottomNotification == null) {
                }
            }
        }
        singleCardDetailsEntityKt$toDomain$1 = new SingleCardDetailsEntityKt$toDomain$1(continuationImpl);
        Object obj2 = singleCardDetailsEntityKt$toDomain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleCardDetailsEntityKt$toDomain$1.label;
        n0t0 n0t0Var2 = null;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        arrayList2 = arrayList6;
        arrayList = arrayList5;
        bottomNotification = singleCardResponse2.getBottomNotification();
        if (bottomNotification == null) {
        }
    }

    public static rbv b(ThemedParameter themedParameter) {
        return fob1.c((String) themedParameter.getLight(), (String) themedParameter.getDark(), new ukr0(16));
    }
}
