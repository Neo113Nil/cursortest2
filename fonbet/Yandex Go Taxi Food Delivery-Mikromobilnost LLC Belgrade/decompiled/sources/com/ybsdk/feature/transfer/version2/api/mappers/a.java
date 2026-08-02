package com.ybsdk.feature.transfer.version2.api.mappers;

import com.ybsdk.core.common.data.network.dto.AdditionalButtonDto;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.api.dto.AftTopupPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.transfer.version2.api.dto.BottomSheetPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.Me2MeTopupPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.SectionsSheetPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.SelfTopupPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.SelfTransferPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.TransferSheetItemDto;
import com.ybsdk.feature.transfer.version2.api.dto.TransferSheetSectionDto;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.BottomSheetPayloadSectionEntity$Type;
import defpackage.di01;
import defpackage.f0z0;
import defpackage.hg6;
import defpackage.ig6;
import defpackage.j5a0;
import defpackage.jg6;
import defpackage.jl40;
import defpackage.job1;
import defpackage.lu01;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.r6q0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.sxg0;
import defpackage.t910;
import defpackage.tcc;
import defpackage.txg0;
import defpackage.v24;
import defpackage.xmq0;
import defpackage.yi1;
import defpackage.ymq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class a {
    public static final rbv a(ThemedImageUrlEntity themedImageUrlEntity) {
        rbv f;
        return (themedImageUrlEntity == null || (f = job1.f(themedImageUrlEntity, new f0z0(28))) == null) ? new nbv(sxg0.ybsdk_ic_generic_card, null) : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(DivDataDto divDataDto, ContinuationImpl continuationImpl) {
        TransferCommonMapperKt$toDivData$1 transferCommonMapperKt$toDivData$1;
        int i;
        Object b;
        if (continuationImpl instanceof TransferCommonMapperKt$toDivData$1) {
            transferCommonMapperKt$toDivData$1 = (TransferCommonMapperKt$toDivData$1) continuationImpl;
            int i2 = transferCommonMapperKt$toDivData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferCommonMapperKt$toDivData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferCommonMapperKt$toDivData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferCommonMapperKt$toDivData$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    transferCommonMapperKt$toDivData$1.label = 1;
                    b = aVar.b(divDataDto, transferCommonMapperKt$toDivData$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    return b;
                }
                return null;
            }
        }
        transferCommonMapperKt$toDivData$1 = new TransferCommonMapperKt$toDivData$1(continuationImpl);
        Object obj2 = transferCommonMapperKt$toDivData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferCommonMapperKt$toDivData$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
    }

    public static final yi1 c(AftTopupPayloadDto aftTopupPayloadDto) {
        String title = aftTopupPayloadDto.getTitle();
        String description = aftTopupPayloadDto.getDescription();
        Boolean descriptionSpoilerEnabled = aftTopupPayloadDto.getDescriptionSpoilerEnabled();
        return new yi1(title, description, descriptionSpoilerEnabled != null ? descriptionSpoilerEnabled.booleanValue() : true, qxy0.c(aftTopupPayloadDto.getImage(), null), aftTopupPayloadDto.getCardId(), aftTopupPayloadDto.getYbId());
    }

    public static final ig6 d(TransferSheetItemDto transferSheetItemDto, di01 di01Var) {
        String id = transferSheetItemDto.getId();
        SelfTransferPayloadDto selfTransferPayload = transferSheetItemDto.getSelfTransferPayload();
        ymq0 g = selfTransferPayload != null ? g(selfTransferPayload) : null;
        SelfTopupPayloadDto selfTopupPayload = transferSheetItemDto.getSelfTopupPayload();
        xmq0 f = selfTopupPayload != null ? f(selfTopupPayload) : null;
        String title = transferSheetItemDto.getTitle();
        String description = transferSheetItemDto.getDescription();
        ThemedImageUrlEntity c = qxy0.c(transferSheetItemDto.getThemedImage(), null);
        String action = transferSheetItemDto.getAction();
        String onSelectedAction = transferSheetItemDto.getOnSelectedAction();
        String action2 = transferSheetItemDto.getAction();
        TransferDeeplink a = action2 != null ? ((lu01) di01Var).a(action2) : null;
        Me2MeTopupPayloadDto me2meTopupPayload = transferSheetItemDto.getMe2meTopupPayload();
        t910 e = me2meTopupPayload != null ? e(me2meTopupPayload) : null;
        AftTopupPayloadDto aftTopupPayload = transferSheetItemDto.getAftTopupPayload();
        return new ig6(id, g, f, title, description, c, action, onSelectedAction, a, e, aftTopupPayload != null ? c(aftTopupPayload) : null);
    }

    public static final t910 e(Me2MeTopupPayloadDto me2MeTopupPayloadDto) {
        String title = me2MeTopupPayloadDto.getTitle();
        String description = me2MeTopupPayloadDto.getDescription();
        Boolean descriptionSpoilerEnabled = me2MeTopupPayloadDto.getDescriptionSpoilerEnabled();
        boolean booleanValue = descriptionSpoilerEnabled != null ? descriptionSpoilerEnabled.booleanValue() : true;
        ThemedImageUrlEntity c = qxy0.c(me2MeTopupPayloadDto.getImage(), null);
        String ybId = me2MeTopupPayloadDto.getYbId();
        AutoTopupWidgetDto autoTopupWidgetData = me2MeTopupPayloadDto.getAutoTopupWidgetData();
        return new t910(title, description, booleanValue, c, ybId, autoTopupWidgetData != null ? new v24(autoTopupWidgetData.getShouldShowWidget()) : new v24(false), me2MeTopupPayloadDto.getOnM2mSelectedAction());
    }

    public static final xmq0 f(SelfTopupPayloadDto selfTopupPayloadDto) {
        String sourceAgreementId = selfTopupPayloadDto.getSourceAgreementId();
        String title = selfTopupPayloadDto.getTitle();
        String description = selfTopupPayloadDto.getDescription();
        Boolean descriptionSpoilerEnabled = selfTopupPayloadDto.getDescriptionSpoilerEnabled();
        boolean booleanValue = descriptionSpoilerEnabled != null ? descriptionSpoilerEnabled.booleanValue() : true;
        ThemedImageUrlEntity c = qxy0.c(selfTopupPayloadDto.getThemedImage(), null);
        AutoTopupWidgetDto autoTopupWidgetData = selfTopupPayloadDto.getAutoTopupWidgetData();
        return new xmq0(sourceAgreementId, title, description, booleanValue, c, autoTopupWidgetData != null ? new v24(autoTopupWidgetData.getShouldShowWidget()) : new v24(false));
    }

    public static final ymq0 g(SelfTransferPayloadDto selfTransferPayloadDto) {
        String targetAgreementId = selfTransferPayloadDto.getTargetAgreementId();
        String title = selfTransferPayloadDto.getTitle();
        String description = selfTransferPayloadDto.getDescription();
        Boolean descriptionSpoilerEnabled = selfTransferPayloadDto.getDescriptionSpoilerEnabled();
        return new ymq0(targetAgreementId, title, description, qxy0.c(selfTransferPayloadDto.getThemedImage(), null), descriptionSpoilerEnabled != null ? descriptionSpoilerEnabled.booleanValue() : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[LOOP:0: B:12:0x0084->B:14:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(BottomSheetPayloadDto bottomSheetPayloadDto, di01 di01Var, ContinuationImpl continuationImpl) {
        TransferCommonMapperKt$toEntity$1 transferCommonMapperKt$toEntity$1;
        int i;
        String subtitle;
        String str;
        di01 di01Var2;
        String str2;
        BottomSheetPayloadDto bottomSheetPayloadDto2;
        String str3;
        Iterator it;
        List<AdditionalButtonDto> additionalButtons;
        List list;
        if (continuationImpl instanceof TransferCommonMapperKt$toEntity$1) {
            transferCommonMapperKt$toEntity$1 = (TransferCommonMapperKt$toEntity$1) continuationImpl;
            int i2 = transferCommonMapperKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferCommonMapperKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferCommonMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferCommonMapperKt$toEntity$1.label;
                rr51 rr51Var = null;
                if (i != 0) {
                    b.b(obj);
                    String title = bottomSheetPayloadDto.getTitle();
                    subtitle = bottomSheetPayloadDto.getSubtitle();
                    DivDataDto divkitWidget = bottomSheetPayloadDto.getDivkitWidget();
                    if (divkitWidget == null) {
                        str = title;
                        List<TransferSheetItemDto> items = bottomSheetPayloadDto.getItems();
                        ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                        it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(d((TransferSheetItemDto) it.next(), di01Var));
                        }
                        additionalButtons = bottomSheetPayloadDto.getAdditionalButtons();
                        if (additionalButtons != null) {
                            List<AdditionalButtonDto> list2 = additionalButtons;
                            list = new ArrayList(tcc.n(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                list.add(j5a0.c((AdditionalButtonDto) it2.next()));
                            }
                        } else {
                            list = EmptyList.a;
                        }
                        return new hg6(str, subtitle, rr51Var, arrayList, list);
                    }
                    transferCommonMapperKt$toEntity$1.L$0 = bottomSheetPayloadDto;
                    transferCommonMapperKt$toEntity$1.L$1 = di01Var;
                    transferCommonMapperKt$toEntity$1.L$2 = title;
                    transferCommonMapperKt$toEntity$1.L$3 = subtitle;
                    transferCommonMapperKt$toEntity$1.label = 1;
                    Object b = b(divkitWidget, transferCommonMapperKt$toEntity$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    di01Var2 = di01Var;
                    str2 = title;
                    obj = b;
                    bottomSheetPayloadDto2 = bottomSheetPayloadDto;
                    str3 = subtitle;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) transferCommonMapperKt$toEntity$1.L$3;
                    str2 = (String) transferCommonMapperKt$toEntity$1.L$2;
                    di01Var2 = (di01) transferCommonMapperKt$toEntity$1.L$1;
                    bottomSheetPayloadDto2 = (BottomSheetPayloadDto) transferCommonMapperKt$toEntity$1.L$0;
                    b.b(obj);
                }
                rr51Var = (rr51) obj;
                di01 di01Var3 = di01Var2;
                str = str2;
                di01Var = di01Var3;
                subtitle = str3;
                bottomSheetPayloadDto = bottomSheetPayloadDto2;
                List<TransferSheetItemDto> items2 = bottomSheetPayloadDto.getItems();
                ArrayList arrayList2 = new ArrayList(tcc.n(items2, 10));
                it = items2.iterator();
                while (it.hasNext()) {
                }
                additionalButtons = bottomSheetPayloadDto.getAdditionalButtons();
                if (additionalButtons != null) {
                }
                return new hg6(str, subtitle, rr51Var, arrayList2, list);
            }
        }
        transferCommonMapperKt$toEntity$1 = new TransferCommonMapperKt$toEntity$1(continuationImpl);
        Object obj2 = transferCommonMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferCommonMapperKt$toEntity$1.label;
        rr51 rr51Var2 = null;
        if (i != 0) {
        }
        rr51Var2 = (rr51) obj2;
        di01 di01Var32 = di01Var2;
        str = str2;
        di01Var = di01Var32;
        subtitle = str3;
        bottomSheetPayloadDto = bottomSheetPayloadDto2;
        List<TransferSheetItemDto> items22 = bottomSheetPayloadDto.getItems();
        ArrayList arrayList22 = new ArrayList(tcc.n(items22, 10));
        it = items22.iterator();
        while (it.hasNext()) {
        }
        additionalButtons = bottomSheetPayloadDto.getAdditionalButtons();
        if (additionalButtons != null) {
        }
        return new hg6(str, subtitle, rr51Var2, arrayList22, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005d, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(SectionsSheetPayloadDto sectionsSheetPayloadDto, di01 di01Var, ContinuationImpl continuationImpl) {
        TransferCommonMapperKt$toEntity$4 transferCommonMapperKt$toEntity$4;
        int i;
        rr51 rr51Var;
        DivDataDto headerWidgetDiv;
        rr51 rr51Var2;
        rr51 rr51Var3;
        SectionsSheetPayloadDto sectionsSheetPayloadDto2;
        rr51 rr51Var4;
        Object obj;
        if (continuationImpl instanceof TransferCommonMapperKt$toEntity$4) {
            transferCommonMapperKt$toEntity$4 = (TransferCommonMapperKt$toEntity$4) continuationImpl;
            int i2 = transferCommonMapperKt$toEntity$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferCommonMapperKt$toEntity$4.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transferCommonMapperKt$toEntity$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferCommonMapperKt$toEntity$4.label;
                if (i != 0) {
                    b.b(obj2);
                    DivDataDto emptyStateDiv = sectionsSheetPayloadDto.getEmptyStateDiv();
                    if (emptyStateDiv == null) {
                        rr51Var = null;
                        headerWidgetDiv = sectionsSheetPayloadDto.getHeaderWidgetDiv();
                        if (headerWidgetDiv == null) {
                            rr51Var2 = rr51Var;
                            rr51Var3 = null;
                            List<TransferSheetSectionDto> sections = sectionsSheetPayloadDto.getSections();
                            ArrayList arrayList = new ArrayList(tcc.n(sections, 10));
                            while (r10.hasNext()) {
                            }
                            return new r6q0(rr51Var2, rr51Var3, arrayList);
                        }
                        transferCommonMapperKt$toEntity$4.L$0 = sectionsSheetPayloadDto;
                        transferCommonMapperKt$toEntity$4.L$1 = di01Var;
                        transferCommonMapperKt$toEntity$4.L$2 = rr51Var;
                        transferCommonMapperKt$toEntity$4.label = 2;
                        Object b = b(headerWidgetDiv, transferCommonMapperKt$toEntity$4);
                        if (b != coroutineSingletons) {
                            sectionsSheetPayloadDto2 = sectionsSheetPayloadDto;
                            rr51Var4 = rr51Var;
                            obj2 = b;
                            rr51Var3 = (rr51) obj2;
                            SectionsSheetPayloadDto sectionsSheetPayloadDto3 = sectionsSheetPayloadDto2;
                            rr51Var2 = rr51Var4;
                            sectionsSheetPayloadDto = sectionsSheetPayloadDto3;
                            List<TransferSheetSectionDto> sections2 = sectionsSheetPayloadDto.getSections();
                            ArrayList arrayList2 = new ArrayList(tcc.n(sections2, 10));
                            while (r10.hasNext()) {
                            }
                            return new r6q0(rr51Var2, rr51Var3, arrayList2);
                        }
                        return coroutineSingletons;
                    }
                    transferCommonMapperKt$toEntity$4.L$0 = sectionsSheetPayloadDto;
                    transferCommonMapperKt$toEntity$4.L$1 = di01Var;
                    transferCommonMapperKt$toEntity$4.label = 1;
                    obj2 = b(emptyStateDiv, transferCommonMapperKt$toEntity$4);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rr51Var4 = (rr51) transferCommonMapperKt$toEntity$4.L$2;
                        di01Var = (di01) transferCommonMapperKt$toEntity$4.L$1;
                        sectionsSheetPayloadDto2 = (SectionsSheetPayloadDto) transferCommonMapperKt$toEntity$4.L$0;
                        b.b(obj2);
                        rr51Var3 = (rr51) obj2;
                        SectionsSheetPayloadDto sectionsSheetPayloadDto32 = sectionsSheetPayloadDto2;
                        rr51Var2 = rr51Var4;
                        sectionsSheetPayloadDto = sectionsSheetPayloadDto32;
                        List<TransferSheetSectionDto> sections22 = sectionsSheetPayloadDto.getSections();
                        ArrayList arrayList22 = new ArrayList(tcc.n(sections22, 10));
                        for (TransferSheetSectionDto transferSheetSectionDto : sections22) {
                            Iterator<E> it = BottomSheetPayloadSectionEntity$Type.getEntries().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (jl40.l(((BottomSheetPayloadSectionEntity$Type) obj).name(), transferSheetSectionDto.getType())) {
                                    break;
                                }
                            }
                            BottomSheetPayloadSectionEntity$Type bottomSheetPayloadSectionEntity$Type = (BottomSheetPayloadSectionEntity$Type) obj;
                            String title = transferSheetSectionDto.getTitle();
                            List<TransferSheetItemDto> items = transferSheetSectionDto.getItems();
                            ArrayList arrayList3 = new ArrayList(tcc.n(items, 10));
                            Iterator<T> it2 = items.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(d((TransferSheetItemDto) it2.next(), di01Var));
                            }
                            arrayList22.add(new jg6(bottomSheetPayloadSectionEntity$Type, title, arrayList3));
                        }
                        return new r6q0(rr51Var2, rr51Var3, arrayList22);
                    }
                    di01Var = (di01) transferCommonMapperKt$toEntity$4.L$1;
                    sectionsSheetPayloadDto = (SectionsSheetPayloadDto) transferCommonMapperKt$toEntity$4.L$0;
                    b.b(obj2);
                }
                rr51Var = (rr51) obj2;
                headerWidgetDiv = sectionsSheetPayloadDto.getHeaderWidgetDiv();
                if (headerWidgetDiv == null) {
                }
            }
        }
        transferCommonMapperKt$toEntity$4 = new TransferCommonMapperKt$toEntity$4(continuationImpl);
        Object obj22 = transferCommonMapperKt$toEntity$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferCommonMapperKt$toEntity$4.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj22;
        headerWidgetDiv = sectionsSheetPayloadDto.getHeaderWidgetDiv();
        if (headerWidgetDiv == null) {
        }
    }

    public static final rbv j(ThemedImageUrlEntity themedImageUrlEntity) {
        rbv f;
        return (themedImageUrlEntity == null || (f = job1.f(themedImageUrlEntity, new f0z0(29))) == null) ? new nbv(txg0.ybsdk_ic_yb_placeholder, null) : f;
    }
}
