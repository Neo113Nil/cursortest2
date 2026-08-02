package com.ybsdk.feature.educations.api;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationDivKitContentDto;
import com.ybsdk.feature.educations.api.data.EducationDivkitContentPositionDto;
import com.ybsdk.feature.educations.api.data.EducationFullscreenContentDto;
import com.ybsdk.feature.educations.api.data.EducationGlowDto;
import com.ybsdk.feature.educations.api.data.EducationScrollBehaviourDto;
import com.ybsdk.feature.educations.api.data.EducationScrollToScreenEdgeDto;
import com.ybsdk.feature.educations.api.data.EducationScrollToScreenItemDto;
import com.ybsdk.feature.educations.api.data.EducationStepDto;
import com.ybsdk.feature.educations.api.data.EducationTooltipContentDto;
import com.ybsdk.feature.educations.api.data.EducationVideoContentDto;
import com.ybsdk.feature.educations.api.data.EducationsShadowDrawRuleDto;
import com.ybsdk.feature.educations.api.data.EducationsShadowDto;
import com.ybsdk.feature.educations.api.data.EducationsTooltipDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.educations.api.data.MarginsDto;
import com.ybsdk.feature.educations.api.domain.EducationDivkitContentPositionEntity;
import com.ybsdk.feature.educations.api.domain.EducationScrollScreenEdgeEntity;
import com.ybsdk.feature.educations.api.domain.EducationScrollSnapPreferenceEntity;
import com.ybsdk.feature.educations.api.domain.EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipAlignment;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipBehaviour;
import defpackage.epn;
import defpackage.gpn;
import defpackage.hpn;
import defpackage.ipn;
import defpackage.jpn;
import defpackage.kp50;
import defpackage.kpn;
import defpackage.lvy0;
import defpackage.lw00;
import defpackage.mon;
import defpackage.non;
import defpackage.ny61;
import defpackage.oon;
import defpackage.pon;
import defpackage.qon;
import defpackage.ron;
import defpackage.rr51;
import defpackage.son;
import defpackage.tcc;
import defpackage.ton;
import defpackage.ung0;
import defpackage.uon;
import defpackage.von;
import defpackage.w511;
import defpackage.xvq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    public static final mon a(EducationDivkitContentPositionDto educationDivkitContentPositionDto) {
        EducationDivkitContentPositionEntity educationDivkitContentPositionEntity;
        int i = epn.b[educationDivkitContentPositionDto.getType().ordinal()];
        if (i == 1) {
            educationDivkitContentPositionEntity = EducationDivkitContentPositionEntity.TOP;
        } else if (i == 2) {
            educationDivkitContentPositionEntity = EducationDivkitContentPositionEntity.BOTTOM;
        } else if (i == 3) {
            educationDivkitContentPositionEntity = EducationDivkitContentPositionEntity.CONTENT_RELATED_TOP;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            educationDivkitContentPositionEntity = EducationDivkitContentPositionEntity.CONTENT_RELATED_BOTTOM;
        }
        return new mon(educationDivkitContentPositionEntity, educationDivkitContentPositionDto.getViewId());
    }

    public static final ron b(EducationScrollBehaviourDto educationScrollBehaviourDto) {
        EducationScrollToScreenItemDto scrollToScreenItem;
        int i = epn.f[educationScrollBehaviourDto.getScrollType().ordinal()];
        if (i == 1) {
            EducationScrollToScreenEdgeDto scrollToScreenEdge = educationScrollBehaviourDto.getScrollToScreenEdge();
            if (scrollToScreenEdge != null) {
                int i2 = epn.g[scrollToScreenEdge.getScreenEdge().ordinal()];
                return new oon(i2 != 1 ? i2 != 2 ? EducationScrollScreenEdgeEntity.UNKNOWN : EducationScrollScreenEdgeEntity.BOTTOM : EducationScrollScreenEdgeEntity.TOP);
            }
        } else if (i == 2 && (scrollToScreenItem = educationScrollBehaviourDto.getScrollToScreenItem()) != null) {
            String itemId = scrollToScreenItem.getItemId();
            int i3 = epn.h[scrollToScreenItem.getSnapPreference().ordinal()];
            return new pon(itemId, i3 != 1 ? i3 != 2 ? EducationScrollSnapPreferenceEntity.UNKNOWN : EducationScrollSnapPreferenceEntity.BOTTOM : EducationScrollSnapPreferenceEntity.TOP, scrollToScreenItem.getOffset());
        }
        return qon.a;
    }

    public static final hpn c(EducationsShadowDto educationsShadowDto) {
        EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;
        List<EducationsShadowDrawRuleDto> drawRules = educationsShadowDto.getDrawRules();
        ArrayList arrayList = new ArrayList(tcc.n(drawRules, 10));
        for (EducationsShadowDrawRuleDto educationsShadowDrawRuleDto : drawRules) {
            String viewId = educationsShadowDrawRuleDto.getViewId();
            int i = epn.c[educationsShadowDrawRuleDto.getDrawType().ordinal()];
            lw00 lw00Var = null;
            if (i == 1) {
                educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType = EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType.HIGHLIGHT;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType = EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType.SHADOW;
            }
            Integer cornersRadius = educationsShadowDrawRuleDto.getCornersRadius();
            Integer valueOf = cornersRadius != null ? Integer.valueOf(kp50.r(cornersRadius.intValue())) : null;
            MarginsDto margins = educationsShadowDrawRuleDto.getMargins();
            if (margins != null) {
                lw00Var = new lw00(margins.getLeft(), margins.getTop(), margins.getRight(), margins.getBottom());
            }
            arrayList.add(new gpn(viewId, educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType, valueOf, lw00Var));
        }
        return new hpn(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ca, code lost:
    
        r3 = new defpackage.ton((defpackage.rr51) r0, r3);
        r15 = r13;
        r0 = r14;
        r6 = r4;
        r4 = r10;
        r13 = r11;
        r14 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038f  */
    /* JADX WARN: Type inference failed for: r10v6, types: [son] */
    /* JADX WARN: Type inference failed for: r5v13, types: [von] */
    /* JADX WARN: Type inference failed for: r6v11, types: [ton] */
    /* JADX WARN: Type inference failed for: r6v13, types: [ton] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01b1 -> B:13:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x039f -> B:19:0x03a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(EducationsV2Dto educationsV2Dto, ContinuationImpl continuationImpl) {
        EducationsMapperKt$toEntity$1 educationsMapperKt$toEntity$1;
        int i;
        com.ybsdk.feature.divkit.api.domain.a aVar;
        Iterator it;
        Collection collection;
        EducationsV2Dto educationsV2Dto2;
        String str;
        String str2;
        String str3;
        Iterator it2;
        EducationsV2Dto educationsV2Dto3;
        ron ronVar;
        EducationTooltipContentDto educationTooltipContentDto;
        EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment;
        EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour;
        ipn ipnVar;
        Object obj;
        hpn hpnVar;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        Collection collection2;
        String str4;
        String str5;
        boolean z;
        EducationsTooltipDto educationsTooltipDto;
        CoroutineSingletons coroutineSingletons;
        EducationScrollBehaviourDto scrollBehaviour;
        uon uonVar;
        Collection collection3;
        Iterator it3;
        mon monVar;
        hpn hpnVar2;
        boolean z2;
        EducationDivKitContentDto educationDivKitContentDto;
        String str6;
        EducationsV2Dto educationsV2Dto4;
        com.ybsdk.feature.divkit.api.domain.a aVar3;
        String str7;
        String str8;
        Object obj2;
        ColorModel a;
        EducationsV2Dto educationsV2Dto5;
        com.ybsdk.feature.divkit.api.domain.a aVar4;
        Collection collection4;
        Iterator it4;
        String str9;
        String str10;
        boolean z3;
        Object obj3;
        EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour2;
        EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment2;
        if (continuationImpl instanceof EducationsMapperKt$toEntity$1) {
            educationsMapperKt$toEntity$1 = (EducationsMapperKt$toEntity$1) continuationImpl;
            int i2 = educationsMapperKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                educationsMapperKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = educationsMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = educationsMapperKt$toEntity$1.label;
                if (i != 0) {
                    b.b(obj4);
                    com.ybsdk.feature.divkit.api.domain.a aVar5 = new com.ybsdk.feature.divkit.api.domain.a(null);
                    String name = educationsV2Dto.getName();
                    String eventId = educationsV2Dto.getEventId();
                    String defaultsGroup = educationsV2Dto.getDefaultsGroup();
                    List<EducationStepDto> steps = educationsV2Dto.getSteps();
                    ArrayList arrayList = new ArrayList();
                    aVar = aVar5;
                    it = steps.iterator();
                    collection = arrayList;
                    educationsV2Dto2 = educationsV2Dto;
                    str = defaultsGroup;
                    str2 = eventId;
                    str3 = name;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    z = educationsMapperKt$toEntity$1.Z$0;
                    str5 = (String) educationsMapperKt$toEntity$1.L$12;
                    str2 = (String) educationsMapperKt$toEntity$1.L$11;
                    str4 = (String) educationsMapperKt$toEntity$1.L$10;
                    hpnVar = (hpn) educationsMapperKt$toEntity$1.L$9;
                    ipn ipnVar2 = (ipn) educationsMapperKt$toEntity$1.L$8;
                    EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour3 = (EducationsTooltipEntity$EducationsTooltipBehaviour) educationsMapperKt$toEntity$1.L$7;
                    EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment3 = (EducationsTooltipEntity$EducationsTooltipAlignment) educationsMapperKt$toEntity$1.L$6;
                    EducationsTooltipDto educationsTooltipDto2 = (EducationsTooltipDto) educationsMapperKt$toEntity$1.L$5;
                    EducationTooltipContentDto educationTooltipContentDto2 = (EducationTooltipContentDto) educationsMapperKt$toEntity$1.L$4;
                    Iterator it5 = (Iterator) educationsMapperKt$toEntity$1.L$3;
                    collection2 = (Collection) educationsMapperKt$toEntity$1.L$2;
                    aVar2 = (com.ybsdk.feature.divkit.api.domain.a) educationsMapperKt$toEntity$1.L$1;
                    EducationsV2Dto educationsV2Dto6 = (EducationsV2Dto) educationsMapperKt$toEntity$1.L$0;
                    b.b(obj4);
                    Object value = ((Result) obj4).getValue();
                    educationsV2Dto3 = educationsV2Dto6;
                    coroutineSingletons = coroutineSingletons2;
                    educationsTooltipDto = educationsTooltipDto2;
                    educationsTooltipEntity$EducationsTooltipAlignment = educationsTooltipEntity$EducationsTooltipAlignment3;
                    educationsTooltipEntity$EducationsTooltipBehaviour = educationsTooltipEntity$EducationsTooltipBehaviour3;
                    ipnVar = ipnVar2;
                    obj = value;
                    educationTooltipContentDto = educationTooltipContentDto2;
                    it2 = it5;
                    ronVar = null;
                    if (obj instanceof Result.Failure) {
                    }
                    jpn jpnVar = new jpn(ipnVar, educationsTooltipEntity$EducationsTooltipBehaviour, educationsTooltipEntity$EducationsTooltipAlignment, (rr51) obj, educationsTooltipDto.getMargin());
                    scrollBehaviour = educationTooltipContentDto.getScrollBehaviour();
                    if (scrollBehaviour == null) {
                    }
                    if (uonVar != null) {
                    }
                    coroutineSingletons2 = coroutineSingletons;
                    educationsV2Dto2 = educationsV2Dto3;
                    if (!it.hasNext()) {
                    }
                } else if (i == 2) {
                    boolean z4 = educationsMapperKt$toEntity$1.Z$0;
                    str7 = (String) educationsMapperKt$toEntity$1.L$9;
                    String str11 = (String) educationsMapperKt$toEntity$1.L$8;
                    String str12 = (String) educationsMapperKt$toEntity$1.L$7;
                    hpn hpnVar3 = (hpn) educationsMapperKt$toEntity$1.L$6;
                    mon monVar2 = (mon) educationsMapperKt$toEntity$1.L$5;
                    EducationDivKitContentDto educationDivKitContentDto2 = (EducationDivKitContentDto) educationsMapperKt$toEntity$1.L$4;
                    Iterator it6 = (Iterator) educationsMapperKt$toEntity$1.L$3;
                    Collection collection5 = (Collection) educationsMapperKt$toEntity$1.L$2;
                    aVar3 = (com.ybsdk.feature.divkit.api.domain.a) educationsMapperKt$toEntity$1.L$1;
                    educationsV2Dto4 = (EducationsV2Dto) educationsMapperKt$toEntity$1.L$0;
                    b.b(obj4);
                    obj2 = ((Result) obj4).getValue();
                    str6 = str12;
                    educationDivKitContentDto = educationDivKitContentDto2;
                    it3 = it6;
                    collection3 = collection5;
                    monVar = monVar2;
                    hpnVar2 = hpnVar3;
                    z2 = z4;
                    str8 = str11;
                    if (obj2 instanceof Result.Failure) {
                    }
                    rr51 rr51Var = (rr51) obj2;
                    EducationGlowDto glow = educationDivKitContentDto.getGlow();
                    a = lvy0.a(glow.getColor(), new ColorModel.Attr(ung0.ybColor_fill_color8_300), new xvq(29));
                    non nonVar = new non(kp50.r(glow.getRadius()), a);
                    EducationScrollBehaviourDto scrollBehaviour2 = educationDivKitContentDto.getScrollBehaviour();
                    ?? sonVar = new son(z2, hpnVar2, monVar, rr51Var, nonVar, scrollBehaviour2 == null ? b(scrollBehaviour2) : null);
                    aVar = aVar3;
                    EducationsV2Dto educationsV2Dto7 = educationsV2Dto4;
                    it = it3;
                    collection = collection3;
                    str2 = str8;
                    str = str7;
                    str3 = str6;
                    educationsV2Dto3 = educationsV2Dto7;
                    coroutineSingletons = coroutineSingletons2;
                    uonVar = sonVar;
                    if (uonVar != null) {
                    }
                    coroutineSingletons2 = coroutineSingletons;
                    educationsV2Dto2 = educationsV2Dto3;
                    if (!it.hasNext()) {
                    }
                } else if (i == 3) {
                    z3 = educationsMapperKt$toEntity$1.Z$0;
                    str10 = (String) educationsMapperKt$toEntity$1.L$6;
                    String str13 = (String) educationsMapperKt$toEntity$1.L$5;
                    str9 = (String) educationsMapperKt$toEntity$1.L$4;
                    it4 = (Iterator) educationsMapperKt$toEntity$1.L$3;
                    collection4 = (Collection) educationsMapperKt$toEntity$1.L$2;
                    aVar4 = (com.ybsdk.feature.divkit.api.domain.a) educationsMapperKt$toEntity$1.L$1;
                    educationsV2Dto5 = (EducationsV2Dto) educationsMapperKt$toEntity$1.L$0;
                    b.b(obj4);
                    obj3 = ((Result) obj4).getValue();
                    str2 = str13;
                    if (obj3 instanceof Result.Failure) {
                    }
                    uonVar = new ton((rr51) null, z3);
                    aVar = aVar4;
                    educationsV2Dto2 = educationsV2Dto5;
                    str = str10;
                    str3 = str9;
                    it = it4;
                    collection = collection4;
                    educationsV2Dto3 = educationsV2Dto2;
                    coroutineSingletons = coroutineSingletons2;
                    if (uonVar != null) {
                    }
                    coroutineSingletons2 = coroutineSingletons;
                    educationsV2Dto2 = educationsV2Dto3;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean showCross = educationsMapperKt$toEntity$1.Z$0;
                    String str14 = (String) educationsMapperKt$toEntity$1.L$7;
                    String str15 = (String) educationsMapperKt$toEntity$1.L$6;
                    String str16 = (String) educationsMapperKt$toEntity$1.L$5;
                    String url = (String) educationsMapperKt$toEntity$1.L$4;
                    it = (Iterator) educationsMapperKt$toEntity$1.L$3;
                    collection = (Collection) educationsMapperKt$toEntity$1.L$2;
                    aVar = (com.ybsdk.feature.divkit.api.domain.a) educationsMapperKt$toEntity$1.L$1;
                    EducationsV2Dto educationsV2Dto8 = (EducationsV2Dto) educationsMapperKt$toEntity$1.L$0;
                    b.b(obj4);
                    Object obj5 = ((Result) obj4).getValue();
                    if (obj5 instanceof Result.Failure) {
                        obj5 = null;
                    }
                    ?? vonVar = new von(showCross, url, (rr51) obj5);
                    educationsV2Dto2 = educationsV2Dto8;
                    uonVar = vonVar;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    educationsV2Dto3 = educationsV2Dto2;
                    coroutineSingletons = coroutineSingletons2;
                    if (uonVar != null) {
                        collection.add(uonVar);
                    }
                    coroutineSingletons2 = coroutineSingletons;
                    educationsV2Dto2 = educationsV2Dto3;
                    if (!it.hasNext()) {
                        EducationStepDto educationStepDto = (EducationStepDto) it.next();
                        int i3 = epn.a[educationStepDto.getContentType().ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                EducationDivKitContentDto divkitContent = educationStepDto.getDivkitContent();
                                if (divkitContent != null) {
                                    boolean showCross2 = educationStepDto.getShowCross();
                                    hpn c = c(divkitContent.getShadow());
                                    mon a2 = a(divkitContent.getPosition());
                                    DivDataDto divkitData = divkitContent.getDivkitData();
                                    educationsMapperKt$toEntity$1.L$0 = educationsV2Dto2;
                                    educationsMapperKt$toEntity$1.L$1 = aVar;
                                    educationsMapperKt$toEntity$1.L$2 = collection;
                                    educationsMapperKt$toEntity$1.L$3 = it;
                                    educationsMapperKt$toEntity$1.L$4 = divkitContent;
                                    educationsMapperKt$toEntity$1.L$5 = a2;
                                    educationsMapperKt$toEntity$1.L$6 = c;
                                    educationsMapperKt$toEntity$1.L$7 = str3;
                                    educationsMapperKt$toEntity$1.L$8 = str2;
                                    educationsMapperKt$toEntity$1.L$9 = str;
                                    educationsMapperKt$toEntity$1.L$10 = null;
                                    educationsMapperKt$toEntity$1.L$11 = null;
                                    educationsMapperKt$toEntity$1.L$12 = null;
                                    educationsMapperKt$toEntity$1.Z$0 = showCross2;
                                    educationsMapperKt$toEntity$1.label = 2;
                                    Object b = aVar.b(divkitData, educationsMapperKt$toEntity$1);
                                    if (b != coroutineSingletons2) {
                                        String str17 = str;
                                        educationsV2Dto4 = educationsV2Dto2;
                                        obj2 = b;
                                        educationDivKitContentDto = divkitContent;
                                        str6 = str3;
                                        str7 = str17;
                                        it3 = it;
                                        collection3 = collection;
                                        monVar = a2;
                                        hpnVar2 = c;
                                        z2 = showCross2;
                                        str8 = str2;
                                        aVar3 = aVar;
                                        if (obj2 instanceof Result.Failure) {
                                            obj2 = null;
                                        }
                                        rr51 rr51Var2 = (rr51) obj2;
                                        EducationGlowDto glow2 = educationDivKitContentDto.getGlow();
                                        a = lvy0.a(glow2.getColor(), new ColorModel.Attr(ung0.ybColor_fill_color8_300), new xvq(29));
                                        non nonVar2 = new non(kp50.r(glow2.getRadius()), a);
                                        EducationScrollBehaviourDto scrollBehaviour22 = educationDivKitContentDto.getScrollBehaviour();
                                        ?? sonVar2 = new son(z2, hpnVar2, monVar, rr51Var2, nonVar2, scrollBehaviour22 == null ? b(scrollBehaviour22) : null);
                                        aVar = aVar3;
                                        EducationsV2Dto educationsV2Dto72 = educationsV2Dto4;
                                        it = it3;
                                        collection = collection3;
                                        str2 = str8;
                                        str = str7;
                                        str3 = str6;
                                        educationsV2Dto3 = educationsV2Dto72;
                                        coroutineSingletons = coroutineSingletons2;
                                        uonVar = sonVar2;
                                        if (uonVar != null) {
                                        }
                                        coroutineSingletons2 = coroutineSingletons;
                                        educationsV2Dto2 = educationsV2Dto3;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                } else {
                                    educationsV2Dto3 = educationsV2Dto2;
                                    coroutineSingletons = coroutineSingletons2;
                                    uonVar = null;
                                    if (uonVar != null) {
                                    }
                                    coroutineSingletons2 = coroutineSingletons;
                                    educationsV2Dto2 = educationsV2Dto3;
                                    if (!it.hasNext()) {
                                    }
                                }
                            } else {
                                if (i3 == 3) {
                                    EducationFullscreenContentDto fullscreenContent = educationStepDto.getFullscreenContent();
                                    if (fullscreenContent != null) {
                                        z3 = educationStepDto.getShowCross();
                                        DivDataDto divkitData2 = fullscreenContent.getDivkitData();
                                        educationsMapperKt$toEntity$1.L$0 = educationsV2Dto2;
                                        educationsMapperKt$toEntity$1.L$1 = aVar;
                                        educationsMapperKt$toEntity$1.L$2 = collection;
                                        educationsMapperKt$toEntity$1.L$3 = it;
                                        educationsMapperKt$toEntity$1.L$4 = str3;
                                        educationsMapperKt$toEntity$1.L$5 = str2;
                                        educationsMapperKt$toEntity$1.L$6 = str;
                                        educationsMapperKt$toEntity$1.L$7 = null;
                                        educationsMapperKt$toEntity$1.L$8 = null;
                                        educationsMapperKt$toEntity$1.L$9 = null;
                                        educationsMapperKt$toEntity$1.L$10 = null;
                                        educationsMapperKt$toEntity$1.L$11 = null;
                                        educationsMapperKt$toEntity$1.L$12 = null;
                                        educationsMapperKt$toEntity$1.Z$0 = z3;
                                        educationsMapperKt$toEntity$1.label = 3;
                                        Object b2 = aVar.b(divkitData2, educationsMapperKt$toEntity$1);
                                        if (b2 != coroutineSingletons2) {
                                            str9 = str3;
                                            str10 = str;
                                            it4 = it;
                                            collection4 = collection;
                                            aVar4 = aVar;
                                            educationsV2Dto5 = educationsV2Dto2;
                                            obj3 = b2;
                                            if (obj3 instanceof Result.Failure) {
                                            }
                                            uonVar = new ton((rr51) null, z3);
                                            aVar = aVar4;
                                            educationsV2Dto2 = educationsV2Dto5;
                                            str = str10;
                                            str3 = str9;
                                            it = it4;
                                            collection = collection4;
                                            educationsV2Dto3 = educationsV2Dto2;
                                            coroutineSingletons = coroutineSingletons2;
                                        }
                                    } else {
                                        uonVar = null;
                                        educationsV2Dto3 = educationsV2Dto2;
                                        coroutineSingletons = coroutineSingletons2;
                                    }
                                } else {
                                    if (i3 != 4) {
                                        w511.b();
                                        return null;
                                    }
                                    EducationVideoContentDto videoContent = educationStepDto.getVideoContent();
                                    if (videoContent != null) {
                                        showCross = educationStepDto.getShowCross();
                                        url = videoContent.getUrl();
                                        DivDataDto divkitData3 = videoContent.getDivkitData();
                                        educationsMapperKt$toEntity$1.L$0 = educationsV2Dto2;
                                        educationsMapperKt$toEntity$1.L$1 = aVar;
                                        educationsMapperKt$toEntity$1.L$2 = collection;
                                        educationsMapperKt$toEntity$1.L$3 = it;
                                        educationsMapperKt$toEntity$1.L$4 = url;
                                        educationsMapperKt$toEntity$1.L$5 = str3;
                                        educationsMapperKt$toEntity$1.L$6 = str2;
                                        educationsMapperKt$toEntity$1.L$7 = str;
                                        educationsMapperKt$toEntity$1.L$8 = null;
                                        educationsMapperKt$toEntity$1.L$9 = null;
                                        educationsMapperKt$toEntity$1.L$10 = null;
                                        educationsMapperKt$toEntity$1.L$11 = null;
                                        educationsMapperKt$toEntity$1.L$12 = null;
                                        educationsMapperKt$toEntity$1.Z$0 = showCross;
                                        educationsMapperKt$toEntity$1.label = 4;
                                        Object b3 = aVar.b(divkitData3, educationsMapperKt$toEntity$1);
                                        if (b3 != coroutineSingletons2) {
                                            str16 = str3;
                                            str15 = str2;
                                            str14 = str;
                                            educationsV2Dto8 = educationsV2Dto2;
                                            obj5 = b3;
                                            if (obj5 instanceof Result.Failure) {
                                            }
                                            ?? vonVar2 = new von(showCross, url, (rr51) obj5);
                                            educationsV2Dto2 = educationsV2Dto8;
                                            uonVar = vonVar2;
                                            str = str14;
                                            str2 = str15;
                                            str3 = str16;
                                            educationsV2Dto3 = educationsV2Dto2;
                                            coroutineSingletons = coroutineSingletons2;
                                        }
                                    } else {
                                        uonVar = null;
                                        educationsV2Dto3 = educationsV2Dto2;
                                        coroutineSingletons = coroutineSingletons2;
                                    }
                                }
                                if (uonVar != null) {
                                }
                                coroutineSingletons2 = coroutineSingletons;
                                educationsV2Dto2 = educationsV2Dto3;
                                if (!it.hasNext()) {
                                }
                            }
                            return coroutineSingletons2;
                        }
                        EducationTooltipContentDto tooltipContent = educationStepDto.getTooltipContent();
                        if (tooltipContent != null) {
                            z = educationStepDto.getShowCross();
                            hpnVar = c(tooltipContent.getShadow());
                            EducationsTooltipDto tooltip = tooltipContent.getTooltip();
                            ipn ipnVar3 = new ipn(tooltip.getAnchor().getViewId());
                            int i4 = epn.d[tooltip.getBehaviour().ordinal()];
                            if (i4 == 1) {
                                educationsTooltipEntity$EducationsTooltipBehaviour2 = EducationsTooltipEntity$EducationsTooltipBehaviour.ABOVE_ANCHOR;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                educationsTooltipEntity$EducationsTooltipBehaviour2 = EducationsTooltipEntity$EducationsTooltipBehaviour.UNDER_ANCHOR;
                            }
                            int i5 = epn.e[tooltip.getAlignment().ordinal()];
                            CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                            if (i5 == 1) {
                                ronVar = null;
                                educationsTooltipEntity$EducationsTooltipAlignment2 = EducationsTooltipEntity$EducationsTooltipAlignment.TOP;
                            } else {
                                if (i5 != 2) {
                                    w511.b();
                                    return null;
                                }
                                educationsTooltipEntity$EducationsTooltipAlignment2 = EducationsTooltipEntity$EducationsTooltipAlignment.BOTTOM;
                                ronVar = null;
                            }
                            DivDataDto divkitData4 = tooltip.getDivkitData();
                            educationsMapperKt$toEntity$1.L$0 = educationsV2Dto2;
                            educationsMapperKt$toEntity$1.L$1 = aVar;
                            educationsMapperKt$toEntity$1.L$2 = collection;
                            educationsMapperKt$toEntity$1.L$3 = it;
                            educationsMapperKt$toEntity$1.L$4 = tooltipContent;
                            educationsMapperKt$toEntity$1.L$5 = tooltip;
                            educationsMapperKt$toEntity$1.L$6 = educationsTooltipEntity$EducationsTooltipAlignment2;
                            educationsMapperKt$toEntity$1.L$7 = educationsTooltipEntity$EducationsTooltipBehaviour2;
                            educationsMapperKt$toEntity$1.L$8 = ipnVar3;
                            educationsMapperKt$toEntity$1.L$9 = hpnVar;
                            educationsMapperKt$toEntity$1.L$10 = str3;
                            educationsMapperKt$toEntity$1.L$11 = str2;
                            educationsMapperKt$toEntity$1.L$12 = str;
                            educationsMapperKt$toEntity$1.Z$0 = z;
                            educationsV2Dto3 = educationsV2Dto2;
                            educationsMapperKt$toEntity$1.label = 1;
                            Object b4 = aVar.b(divkitData4, educationsMapperKt$toEntity$1);
                            coroutineSingletons = coroutineSingletons3;
                            if (b4 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            String str18 = str;
                            str4 = str3;
                            str5 = str18;
                            educationTooltipContentDto = tooltipContent;
                            it2 = it;
                            collection2 = collection;
                            educationsTooltipEntity$EducationsTooltipAlignment = educationsTooltipEntity$EducationsTooltipAlignment2;
                            educationsTooltipEntity$EducationsTooltipBehaviour = educationsTooltipEntity$EducationsTooltipBehaviour2;
                            ipnVar = ipnVar3;
                            obj = b4;
                            educationsTooltipDto = tooltip;
                            aVar2 = aVar;
                            if (obj instanceof Result.Failure) {
                                obj = ronVar;
                            }
                            jpn jpnVar2 = new jpn(ipnVar, educationsTooltipEntity$EducationsTooltipBehaviour, educationsTooltipEntity$EducationsTooltipAlignment, (rr51) obj, educationsTooltipDto.getMargin());
                            scrollBehaviour = educationTooltipContentDto.getScrollBehaviour();
                            if (scrollBehaviour == null) {
                                uon uonVar2 = new uon(z, hpnVar, jpnVar2, b(scrollBehaviour));
                                String str19 = str4;
                                str = str5;
                                str3 = str19;
                                collection = collection2;
                                aVar = aVar2;
                                uonVar = uonVar2;
                                it = it2;
                            } else {
                                uon uonVar3 = new uon(z, hpnVar, jpnVar2, ronVar);
                                String str20 = str4;
                                str = str5;
                                str3 = str20;
                                collection = collection2;
                                aVar = aVar2;
                                uonVar = uonVar3;
                                it = it2;
                            }
                            if (uonVar != null) {
                            }
                            coroutineSingletons2 = coroutineSingletons;
                            educationsV2Dto2 = educationsV2Dto3;
                            if (!it.hasNext()) {
                                return new kpn(str3, str2, str, (List) collection, educationsV2Dto2.getShowingDelay());
                            }
                        } else {
                            educationsV2Dto3 = educationsV2Dto2;
                            coroutineSingletons = coroutineSingletons2;
                            uonVar = null;
                            if (uonVar != null) {
                            }
                            coroutineSingletons2 = coroutineSingletons;
                            educationsV2Dto2 = educationsV2Dto3;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        educationsMapperKt$toEntity$1 = new EducationsMapperKt$toEntity$1(continuationImpl);
        Object obj42 = educationsMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = educationsMapperKt$toEntity$1.label;
        if (i != 0) {
        }
    }
}
