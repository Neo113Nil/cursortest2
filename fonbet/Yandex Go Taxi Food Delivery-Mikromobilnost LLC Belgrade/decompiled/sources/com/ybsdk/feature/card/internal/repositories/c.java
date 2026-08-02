package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.card.internal.entities.SetCardStatusScreenEntity$SetResultState$StateType;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingInputCheckSumResponse;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingInputRuleNonEmptyResponse;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingInputRuleRangeResponse;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingPrefixResponse;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingStaticInfoResponse;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingTheme;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$Deeplink;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$DivKit;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusSuccessData$SetResultState;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.cn8;
import defpackage.d6w;
import defpackage.g2r0;
import defpackage.h2r0;
import defpackage.i2r0;
import defpackage.j2r0;
import defpackage.l2r0;
import defpackage.lc8;
import defpackage.lvy0;
import defpackage.mrp0;
import defpackage.ny61;
import defpackage.p98;
import defpackage.qxy0;
import defpackage.rr51;
import defpackage.ung0;
import defpackage.w511;
import defpackage.wk8;
import defpackage.x4c;
import defpackage.xvq;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class c {
    public static final p98 a(CardClaimingStaticInfoResponse cardClaimingStaticInfoResponse) {
        ColorModel colorModel;
        ColorModel colorModel2;
        ColorModel colorModel3;
        ColorModel colorModel4;
        ColorModel a;
        ColorModel a2;
        CardClaimingTheme dark;
        CardClaimingTheme light;
        String hintCvv = cardClaimingStaticInfoResponse.getHintCvv();
        String hintPan = cardClaimingStaticInfoResponse.getHintPan();
        CardClaimingPrefixResponse prefix = cardClaimingStaticInfoResponse.getPan().getPrefix();
        ColorModel colorModel5 = null;
        String value = prefix != null ? prefix.getValue() : null;
        CardClaimingInputRuleNonEmptyResponse ruleNonEmpty = cardClaimingStaticInfoResponse.getCvv().getRuleNonEmpty();
        String violationMessage = ruleNonEmpty != null ? ruleNonEmpty.getViolationMessage() : null;
        CardClaimingInputRuleRangeResponse ruleRange = cardClaimingStaticInfoResponse.getCvv().getRuleRange();
        String violationMessage2 = ruleRange != null ? ruleRange.getViolationMessage() : null;
        CardClaimingInputRuleRangeResponse ruleRange2 = cardClaimingStaticInfoResponse.getCvv().getRuleRange();
        lc8 lc8Var = new lc8(violationMessage, violationMessage2, ruleRange2 != null ? new d6w(ruleRange2.getLowerLimit(), ruleRange2.getUpperLimit(), 1) : null);
        CardClaimingInputRuleNonEmptyResponse ruleNonEmpty2 = cardClaimingStaticInfoResponse.getPan().getRuleNonEmpty();
        String violationMessage3 = ruleNonEmpty2 != null ? ruleNonEmpty2.getViolationMessage() : null;
        CardClaimingInputRuleRangeResponse ruleRange3 = cardClaimingStaticInfoResponse.getPan().getRuleRange();
        String violationMessage4 = ruleRange3 != null ? ruleRange3.getViolationMessage() : null;
        CardClaimingInputCheckSumResponse checksum = cardClaimingStaticInfoResponse.getPan().getChecksum();
        String violationMessage5 = checksum != null ? checksum.getViolationMessage() : null;
        CardClaimingInputRuleRangeResponse ruleRange4 = cardClaimingStaticInfoResponse.getPan().getRuleRange();
        wk8 wk8Var = new wk8(violationMessage3, violationMessage4, violationMessage5, ruleRange4 != null ? new d6w(ruleRange4.getLowerLimit(), ruleRange4.getUpperLimit(), 1) : null);
        Themes<CardClaimingTheme> themes = cardClaimingStaticInfoResponse.getThemes();
        String cardSkin = (themes == null || (light = themes.getLight()) == null) ? null : light.getCardSkin();
        Themes<CardClaimingTheme> themes2 = cardClaimingStaticInfoResponse.getThemes();
        String cardSkin2 = (themes2 == null || (dark = themes2.getDark()) == null) ? null : dark.getCardSkin();
        Themes<CardClaimingTheme> themes3 = cardClaimingStaticInfoResponse.getThemes();
        if (themes3 != null) {
            CardClaimingTheme light2 = themes3.getLight();
            String inputTextColorFocus = light2 != null ? light2.getInputTextColorFocus() : null;
            CardClaimingTheme dark2 = themes3.getDark();
            colorModel = lvy0.c(new Themes(inputTextColorFocus, dark2 != null ? dark2.getInputTextColorFocus() : null));
        } else {
            colorModel = null;
        }
        Themes<CardClaimingTheme> themes4 = cardClaimingStaticInfoResponse.getThemes();
        if (themes4 != null) {
            CardClaimingTheme light3 = themes4.getLight();
            String inputPlaceholderColor = light3 != null ? light3.getInputPlaceholderColor() : null;
            CardClaimingTheme dark3 = themes4.getDark();
            a2 = lvy0.a(new Themes(inputPlaceholderColor, dark3 != null ? dark3.getInputPlaceholderColor() : null), new ColorModel.Attr(ung0.ybColor_textIcon_secondary), new xvq(29));
            colorModel2 = a2;
        } else {
            colorModel2 = null;
        }
        Themes<CardClaimingTheme> themes5 = cardClaimingStaticInfoResponse.getThemes();
        if (themes5 != null) {
            CardClaimingTheme light4 = themes5.getLight();
            String inputBackgroundColor = light4 != null ? light4.getInputBackgroundColor() : null;
            CardClaimingTheme dark4 = themes5.getDark();
            a = lvy0.a(new Themes(inputBackgroundColor, dark4 != null ? dark4.getInputBackgroundColor() : null), new ColorModel.Attr(ung0.ybColor_fill_default_100), new xvq(29));
            colorModel3 = a;
        } else {
            colorModel3 = null;
        }
        Themes<CardClaimingTheme> themes6 = cardClaimingStaticInfoResponse.getThemes();
        if (themes6 != null) {
            CardClaimingTheme light5 = themes6.getLight();
            String inputTextColorUnfocus = light5 != null ? light5.getInputTextColorUnfocus() : null;
            CardClaimingTheme dark5 = themes6.getDark();
            colorModel4 = lvy0.a(new Themes(inputTextColorUnfocus, dark5 != null ? dark5.getInputTextColorUnfocus() : null), new ColorModel.Attr(ung0.ybColor_fill_default_100), new xvq(29));
        } else {
            colorModel4 = null;
        }
        Themes<CardClaimingTheme> themes7 = cardClaimingStaticInfoResponse.getThemes();
        if (themes7 != null) {
            CardClaimingTheme light6 = themes7.getLight();
            String inputHeaderColor = light6 != null ? light6.getInputHeaderColor() : null;
            CardClaimingTheme dark6 = themes7.getDark();
            colorModel5 = lvy0.a(new Themes(inputHeaderColor, dark6 != null ? dark6.getInputHeaderColor() : null), new ColorModel.Attr(ung0.ybColor_textIcon_secondary), new xvq(29));
        }
        return new p98(hintCvv, hintPan, value, lc8Var, wk8Var, cardSkin, cardSkin2, colorModel, colorModel4, colorModel2, colorModel5, colorModel3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l2r0 l2r0Var, ContinuationImpl continuationImpl) {
        CardRepositoryKt$toEntity$12 cardRepositoryKt$toEntity$12;
        int i;
        SetCardStatusScreenEntity$SetResultState$StateType setCardStatusScreenEntity$SetResultState$StateType;
        rr51 rr51Var;
        if (continuationImpl instanceof CardRepositoryKt$toEntity$12) {
            cardRepositoryKt$toEntity$12 = (CardRepositoryKt$toEntity$12) continuationImpl;
            int i2 = cardRepositoryKt$toEntity$12.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepositoryKt$toEntity$12.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepositoryKt$toEntity$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepositoryKt$toEntity$12.label;
                mrp0 mrp0Var = mrp0.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (l2r0Var instanceof SetCardStatusSuccessData$Deeplink) {
                        SetCardStatusSuccessData$Deeplink setCardStatusSuccessData$Deeplink = (SetCardStatusSuccessData$Deeplink) l2r0Var;
                        String action = setCardStatusSuccessData$Deeplink.getAction();
                        if (action != null) {
                            return new h2r0(action, setCardStatusSuccessData$Deeplink.getCloseAction());
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("action is required for DEEPLINK action_type");
                        x4c.g("SetCardStatus mapping error", illegalStateException, null, Collections.singletonList(mrp0Var), 4);
                        return new Result.Failure(illegalStateException);
                    }
                    if (!(l2r0Var instanceof SetCardStatusSuccessData$DivKit)) {
                        if (!(l2r0Var instanceof SetCardStatusSuccessData$SetResultState)) {
                            w511.b();
                            return null;
                        }
                        SetCardStatusSuccessData$SetResultState setCardStatusSuccessData$SetResultState = (SetCardStatusSuccessData$SetResultState) l2r0Var;
                        int i3 = cn8.b[setCardStatusSuccessData$SetResultState.getStateType().ordinal()];
                        if (i3 == 1) {
                            setCardStatusScreenEntity$SetResultState$StateType = SetCardStatusScreenEntity$SetResultState$StateType.SUCCESS;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            setCardStatusScreenEntity$SetResultState$StateType = SetCardStatusScreenEntity$SetResultState$StateType.FAIL;
                        }
                        SetCardStatusScreenEntity$SetResultState$StateType setCardStatusScreenEntity$SetResultState$StateType2 = setCardStatusScreenEntity$SetResultState$StateType;
                        String title = setCardStatusSuccessData$SetResultState.getTitle();
                        String subtitle = setCardStatusSuccessData$SetResultState.getSubtitle();
                        SetCardStatusSuccessData$SetResultState.ButtonData primaryButton = setCardStatusSuccessData$SetResultState.getPrimaryButton();
                        g2r0 g2r0Var = primaryButton != null ? new g2r0(primaryButton.getTitle(), primaryButton.getAction(), qxy0.c(primaryButton.getStartIcon(), null)) : null;
                        SetCardStatusSuccessData$SetResultState.ButtonData secondaryButton = setCardStatusSuccessData$SetResultState.getSecondaryButton();
                        return new j2r0(setCardStatusScreenEntity$SetResultState$StateType2, title, subtitle, g2r0Var, secondaryButton != null ? new g2r0(secondaryButton.getTitle(), secondaryButton.getAction(), qxy0.c(secondaryButton.getStartIcon(), null)) : null, setCardStatusSuccessData$SetResultState.getCloseAction());
                    }
                    DivDataDto divkitMainBlock = ((SetCardStatusSuccessData$DivKit) l2r0Var).getDivkitMainBlock();
                    if (divkitMainBlock == null) {
                        rr51Var = null;
                        if (rr51Var != null) {
                            return new i2r0(rr51Var, ((SetCardStatusSuccessData$DivKit) l2r0Var).getCloseAction());
                        }
                        IllegalStateException illegalStateException2 = new IllegalStateException("divkit_main_block is null or failed to parse");
                        x4c.g("SetCardStatus mapping error", illegalStateException2, null, Collections.singletonList(mrp0Var), 4);
                        return new Result.Failure(illegalStateException2);
                    }
                    cardRepositoryKt$toEntity$12.L$0 = l2r0Var;
                    cardRepositoryKt$toEntity$12.label = 1;
                    obj = com.ybsdk.feature.divkit.internal.a.a(divkitMainBlock, new com.ybsdk.feature.divkit.api.domain.a(null), cardRepositoryKt$toEntity$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l2r0Var = (l2r0) cardRepositoryKt$toEntity$12.L$0;
                    kotlin.b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (rr51Var != null) {
                }
            }
        }
        cardRepositoryKt$toEntity$12 = new CardRepositoryKt$toEntity$12(continuationImpl);
        Object obj2 = cardRepositoryKt$toEntity$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepositoryKt$toEntity$12.label;
        mrp0 mrp0Var2 = mrp0.b;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        if (rr51Var != null) {
        }
    }
}
