package com.ybsdk.feature.status.screen.internal.data;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.bsl;
import defpackage.fxy0;
import defpackage.kpn;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.tcc;
import defpackage.yua1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0088, code lost:
    
        if (r0 == r2) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0148 -> B:12:0x0149). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DivCommonResponse divCommonResponse, ContinuationImpl continuationImpl) {
        DivkitCommonScreenRepositoryKt$toEntity$1 divkitCommonScreenRepositoryKt$toEntity$1;
        int i;
        DivCommonResponse divCommonResponse2;
        rr51 rr51Var;
        Text g;
        DivDataDto toolbarDivData;
        Text text;
        rr51 rr51Var2;
        Object a;
        DivCommonResponse divCommonResponse3;
        Text text2;
        List<FullScreenDto> fullscreens;
        ArrayList arrayList;
        List<EducationsV2Dto> educationsV2;
        rr51 rr51Var3;
        Text text3;
        ArrayList arrayList2;
        fxy0 fxy0Var;
        ArrayList arrayList3;
        rr51 rr51Var4;
        Iterator it;
        rr51 rr51Var5;
        ArrayList arrayList4;
        fxy0 fxy0Var2;
        rr51 rr51Var6;
        Text text4;
        ArrayList arrayList5;
        if (continuationImpl instanceof DivkitCommonScreenRepositoryKt$toEntity$1) {
            divkitCommonScreenRepositoryKt$toEntity$1 = (DivkitCommonScreenRepositoryKt$toEntity$1) continuationImpl;
            int i2 = divkitCommonScreenRepositoryKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divkitCommonScreenRepositoryKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divkitCommonScreenRepositoryKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divkitCommonScreenRepositoryKt$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DivDataDto divData = divCommonResponse.getDivData();
                    divCommonResponse2 = divCommonResponse;
                    divkitCommonScreenRepositoryKt$toEntity$1.L$0 = divCommonResponse2;
                    divkitCommonScreenRepositoryKt$toEntity$1.label = 1;
                    obj = com.ybsdk.feature.divkit.internal.a.a(divData, new com.ybsdk.feature.divkit.api.domain.a(null), divkitCommonScreenRepositoryKt$toEntity$1);
                } else if (i == 1) {
                    divCommonResponse2 = (DivCommonResponse) divkitCommonScreenRepositoryKt$toEntity$1.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    text2 = (Text) divkitCommonScreenRepositoryKt$toEntity$1.L$3;
                    text = (Text) divkitCommonScreenRepositoryKt$toEntity$1.L$2;
                    rr51Var = (rr51) divkitCommonScreenRepositoryKt$toEntity$1.L$1;
                    divCommonResponse3 = (DivCommonResponse) divkitCommonScreenRepositoryKt$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    rr51Var2 = (rr51) obj;
                    DivCommonResponse divCommonResponse4 = divCommonResponse3;
                    g = text2;
                    divCommonResponse2 = divCommonResponse4;
                    ThemedParameter<String> toolbarBackgroundColor = divCommonResponse2.getToolbarBackgroundColor();
                    fxy0 entity = toolbarBackgroundColor != null ? toolbarBackgroundColor.toEntity() : null;
                    fullscreens = divCommonResponse2.getFullscreens();
                    if (fullscreens != null) {
                        List<FullScreenDto> list = fullscreens;
                        arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(yua1.c((FullScreenDto) it2.next(), FullScreenEntity$Type.COMMON_DIVKIT));
                        }
                    } else {
                        arrayList = null;
                    }
                    educationsV2 = divCommonResponse2.getEducationsV2();
                    if (educationsV2 == null) {
                        rr51Var3 = rr51Var2;
                        text3 = text;
                        arrayList2 = null;
                        fxy0Var = entity;
                        arrayList3 = arrayList;
                        rr51Var4 = rr51Var;
                        return new bsl(rr51Var4, text3, g, rr51Var3, fxy0Var, arrayList3, arrayList2);
                    }
                    List<EducationsV2Dto> list2 = educationsV2;
                    ArrayList arrayList6 = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    rr51Var5 = rr51Var;
                    arrayList4 = arrayList6;
                    fxy0Var2 = entity;
                    rr51Var6 = rr51Var2;
                    text4 = text;
                    arrayList5 = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r3 = (Collection) divkitCommonScreenRepositoryKt$toEntity$1.L$8;
                    ?? r5 = (List) divkitCommonScreenRepositoryKt$toEntity$1.L$7;
                    fxy0Var2 = (fxy0) divkitCommonScreenRepositoryKt$toEntity$1.L$6;
                    rr51Var6 = (rr51) divkitCommonScreenRepositoryKt$toEntity$1.L$5;
                    g = (Text) divkitCommonScreenRepositoryKt$toEntity$1.L$4;
                    text4 = (Text) divkitCommonScreenRepositoryKt$toEntity$1.L$3;
                    rr51Var5 = (rr51) divkitCommonScreenRepositoryKt$toEntity$1.L$2;
                    it = (Iterator) divkitCommonScreenRepositoryKt$toEntity$1.L$1;
                    ?? r12 = (Collection) divkitCommonScreenRepositoryKt$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    ArrayList arrayList7 = r3;
                    ArrayList arrayList8 = r5;
                    arrayList7.add((kpn) obj);
                    arrayList4 = r12;
                    arrayList5 = arrayList8;
                    if (it.hasNext()) {
                        EducationsV2Dto educationsV2Dto = (EducationsV2Dto) it.next();
                        divkitCommonScreenRepositoryKt$toEntity$1.L$0 = arrayList4;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$1 = it;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$2 = rr51Var5;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$3 = text4;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$4 = g;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$5 = rr51Var6;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$6 = fxy0Var2;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$7 = arrayList5;
                        divkitCommonScreenRepositoryKt$toEntity$1.L$8 = arrayList4;
                        divkitCommonScreenRepositoryKt$toEntity$1.label = 3;
                        obj = com.ybsdk.feature.educations.api.a.d(educationsV2Dto, divkitCommonScreenRepositoryKt$toEntity$1);
                        if (obj != coroutineSingletons) {
                            r12 = arrayList4;
                            arrayList7 = arrayList4;
                            arrayList8 = arrayList5;
                            arrayList7.add((kpn) obj);
                            arrayList4 = r12;
                            arrayList5 = arrayList8;
                            if (it.hasNext()) {
                                arrayList2 = arrayList4;
                                arrayList3 = arrayList5;
                                fxy0Var = fxy0Var2;
                                rr51Var3 = rr51Var6;
                                text3 = text4;
                                rr51Var4 = rr51Var5;
                                return new bsl(rr51Var4, text3, g, rr51Var3, fxy0Var, arrayList3, arrayList2);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                rr51Var = (rr51) obj;
                Text.Constant g2 = d.g(divCommonResponse2.getTitle());
                g = d.g(divCommonResponse2.getSubtitle());
                toolbarDivData = divCommonResponse2.getToolbarDivData();
                if (toolbarDivData == null) {
                    divkitCommonScreenRepositoryKt$toEntity$1.L$0 = divCommonResponse2;
                    divkitCommonScreenRepositoryKt$toEntity$1.L$1 = rr51Var;
                    divkitCommonScreenRepositoryKt$toEntity$1.L$2 = g2;
                    divkitCommonScreenRepositoryKt$toEntity$1.L$3 = g;
                    divkitCommonScreenRepositoryKt$toEntity$1.label = 2;
                    a = com.ybsdk.feature.divkit.internal.a.a(toolbarDivData, new com.ybsdk.feature.divkit.api.domain.a(null), divkitCommonScreenRepositoryKt$toEntity$1);
                    if (a != coroutineSingletons) {
                        text = g2;
                        obj = a;
                        divCommonResponse3 = divCommonResponse2;
                        text2 = g;
                        rr51Var2 = (rr51) obj;
                        DivCommonResponse divCommonResponse42 = divCommonResponse3;
                        g = text2;
                        divCommonResponse2 = divCommonResponse42;
                        ThemedParameter<String> toolbarBackgroundColor2 = divCommonResponse2.getToolbarBackgroundColor();
                        if (toolbarBackgroundColor2 != null) {
                        }
                        fullscreens = divCommonResponse2.getFullscreens();
                        if (fullscreens != null) {
                        }
                        educationsV2 = divCommonResponse2.getEducationsV2();
                        if (educationsV2 == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                text = g2;
                rr51Var2 = null;
                ThemedParameter<String> toolbarBackgroundColor22 = divCommonResponse2.getToolbarBackgroundColor();
                if (toolbarBackgroundColor22 != null) {
                }
                fullscreens = divCommonResponse2.getFullscreens();
                if (fullscreens != null) {
                }
                educationsV2 = divCommonResponse2.getEducationsV2();
                if (educationsV2 == null) {
                }
            }
        }
        divkitCommonScreenRepositoryKt$toEntity$1 = new DivkitCommonScreenRepositoryKt$toEntity$1(continuationImpl);
        Object obj2 = divkitCommonScreenRepositoryKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divkitCommonScreenRepositoryKt$toEntity$1.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        Text.Constant g22 = d.g(divCommonResponse2.getTitle());
        g = d.g(divCommonResponse2.getSubtitle());
        toolbarDivData = divCommonResponse2.getToolbarDivData();
        if (toolbarDivData == null) {
        }
    }
}
