package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.main.internal.data.network.dto.ProductDto;
import com.ybsdk.feature.main.internal.data.network.dto.ProductScreenItemDto;
import com.ybsdk.feature.main.internal.data.network.dto.QuickActionsHeaderDto;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsRequest;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsResponseDto;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsV4ResponseDto;
import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipDto;
import defpackage.cuq0;
import defpackage.d7f0;
import defpackage.dlg0;
import defpackage.f5j0;
import defpackage.fdr;
import defpackage.fzw;
import defpackage.g5j0;
import defpackage.kpn;
import defpackage.laf0;
import defpackage.n860;
import defpackage.ny61;
import defpackage.p860;
import defpackage.rb00;
import defpackage.rr51;
import defpackage.t400;
import defpackage.tcc;
import defpackage.tvv;
import defpackage.x4c;
import defpackage.y1r0;
import defpackage.yig;
import defpackage.yua1;
import defpackage.z8f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class a {
    public final MainScreenApi a;
    public final com.ybsdk.common.b b;
    public final n860 c;
    public final f5j0 d;
    public final fdr e;
    public final tvv f;
    public final com.ybsdk.common.a g;
    public final b h;
    public final y1r0 i;
    public final rb00 j;
    public final yig k;

    public a(MainScreenApi mainScreenApi, com.ybsdk.common.b bVar, n860 n860Var, f5j0 f5j0Var, fdr fdrVar, tvv tvvVar, com.ybsdk.common.a aVar, b bVar2, y1r0 y1r0Var, rb00 rb00Var, yig yigVar) {
        this.a = mainScreenApi;
        this.b = bVar;
        this.c = n860Var;
        this.d = f5j0Var;
        this.e = fdrVar;
        this.f = tvvVar;
        this.g = aVar;
        this.h = bVar2;
        this.i = y1r0Var;
        this.j = rb00Var;
        this.k = yigVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x020a -> B:13:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0132 -> B:47:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00e4 -> B:79:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ScreenProductsResponseDto screenProductsResponseDto, ContinuationImpl continuationImpl) {
        ProductScreenRepository$toEntityV3$1 productScreenRepository$toEntityV3$1;
        int i;
        Collection arrayList;
        Iterator it;
        ScreenProductsResponseDto screenProductsResponseDto2;
        Collection arrayList2;
        Iterator it2;
        List list;
        List list2;
        ArrayList arrayList3;
        ScreenProductsResponseDto screenProductsResponseDto3;
        rr51 rr51Var;
        Object a;
        List list3;
        ArrayList arrayList4;
        boolean booleanValue;
        List<EducationsV2Dto> educationsV2;
        List list4;
        rr51 rr51Var2;
        List list5;
        ArrayList arrayList5;
        List list6;
        List list7;
        List list8;
        ?? r0;
        ScreenProductsResponseDto screenProductsResponseDto4;
        Iterator it3;
        Collection collection;
        rr51 rr51Var3;
        ArrayList arrayList6;
        List<ServerTooltipDto> smallTooltips;
        aVar.getClass();
        if (continuationImpl instanceof ProductScreenRepository$toEntityV3$1) {
            productScreenRepository$toEntityV3$1 = (ProductScreenRepository$toEntityV3$1) continuationImpl;
            int i2 = productScreenRepository$toEntityV3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productScreenRepository$toEntityV3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productScreenRepository$toEntityV3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productScreenRepository$toEntityV3$1.label;
                int i3 = 2;
                ArrayList arrayList7 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<ProductDto> products = screenProductsResponseDto.getProducts();
                    arrayList = new ArrayList(tcc.n(products, 10));
                    it = products.iterator();
                    screenProductsResponseDto2 = screenProductsResponseDto;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    arrayList = (Collection) productScreenRepository$toEntityV3$1.L$3;
                    it = (Iterator) productScreenRepository$toEntityV3$1.L$2;
                    Collection collection2 = (Collection) productScreenRepository$toEntityV3$1.L$1;
                    ScreenProductsResponseDto screenProductsResponseDto5 = (ScreenProductsResponseDto) productScreenRepository$toEntityV3$1.L$0;
                    kotlin.b.b(obj);
                    arrayList.add((d7f0) obj);
                    arrayList = collection2;
                    screenProductsResponseDto2 = screenProductsResponseDto5;
                    if (it.hasNext()) {
                        ProductDto productDto = (ProductDto) it.next();
                        b bVar = aVar.h;
                        productScreenRepository$toEntityV3$1.L$0 = screenProductsResponseDto2;
                        productScreenRepository$toEntityV3$1.L$1 = arrayList;
                        productScreenRepository$toEntityV3$1.L$2 = it;
                        productScreenRepository$toEntityV3$1.L$3 = arrayList;
                        productScreenRepository$toEntityV3$1.label = 1;
                        Object a2 = bVar.a(productDto, productScreenRepository$toEntityV3$1);
                        if (a2 != coroutineSingletons) {
                            screenProductsResponseDto5 = screenProductsResponseDto2;
                            obj = a2;
                            collection2 = arrayList;
                            arrayList.add((d7f0) obj);
                            arrayList = collection2;
                            screenProductsResponseDto2 = screenProductsResponseDto5;
                            if (it.hasNext()) {
                                List list9 = (List) arrayList;
                                List<ProductScreenItemDto> screenItems = screenProductsResponseDto2.getScreenItems();
                                arrayList2 = new ArrayList();
                                it2 = screenItems.iterator();
                                list = list9;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i == 2) {
                        ProductScreenItemDto productScreenItemDto = (ProductScreenItemDto) productScreenRepository$toEntityV3$1.L$4;
                        it2 = (Iterator) productScreenRepository$toEntityV3$1.L$3;
                        arrayList2 = (Collection) productScreenRepository$toEntityV3$1.L$2;
                        List list10 = (List) productScreenRepository$toEntityV3$1.L$1;
                        ScreenProductsResponseDto screenProductsResponseDto6 = (ScreenProductsResponseDto) productScreenRepository$toEntityV3$1.L$0;
                        kotlin.b.b(obj);
                        Object obj2 = ((Result) obj).getValue();
                        Throwable a3 = Result.a(obj2);
                        if (a3 != null) {
                            x4c.g("Can't parse products screen item", a3, null, null, 12);
                        }
                        if (obj2 instanceof Result.Failure) {
                            obj2 = null;
                        }
                        rr51 rr51Var4 = (rr51) obj2;
                        z8f0 z8f0Var = rr51Var4 == null ? new z8f0(rr51Var4, productScreenItemDto.getItemType()) : null;
                        if (z8f0Var != null) {
                            arrayList2.add(z8f0Var);
                        }
                        list = list10;
                        screenProductsResponseDto2 = screenProductsResponseDto6;
                        i3 = 2;
                        if (it2.hasNext()) {
                            ProductScreenItemDto productScreenItemDto2 = (ProductScreenItemDto) it2.next();
                            com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(screenProductsResponseDto2.getCommonDivData());
                            DivDataDto divkitData = productScreenItemDto2.getDivkitData();
                            productScreenRepository$toEntityV3$1.L$0 = screenProductsResponseDto2;
                            productScreenRepository$toEntityV3$1.L$1 = list;
                            productScreenRepository$toEntityV3$1.L$2 = arrayList2;
                            productScreenRepository$toEntityV3$1.L$3 = it2;
                            productScreenRepository$toEntityV3$1.L$4 = productScreenItemDto2;
                            productScreenRepository$toEntityV3$1.label = i3;
                            Object b = aVar2.b(divkitData, productScreenRepository$toEntityV3$1);
                            if (b != coroutineSingletons) {
                                list10 = list;
                                productScreenItemDto = productScreenItemDto2;
                                screenProductsResponseDto6 = screenProductsResponseDto2;
                                obj2 = b;
                                Throwable a32 = Result.a(obj2);
                                if (a32 != null) {
                                }
                                if (obj2 instanceof Result.Failure) {
                                }
                                rr51 rr51Var42 = (rr51) obj2;
                                if (rr51Var42 == null) {
                                }
                                if (z8f0Var != null) {
                                }
                                list = list10;
                                screenProductsResponseDto2 = screenProductsResponseDto6;
                                i3 = 2;
                                if (it2.hasNext()) {
                                    list2 = (List) arrayList2;
                                    List<FullScreenDto> fullScreens = screenProductsResponseDto2.getFullScreens();
                                    if (fullScreens != null) {
                                        List<FullScreenDto> list11 = fullScreens;
                                        arrayList3 = new ArrayList(tcc.n(list11, 10));
                                        Iterator it4 = list11.iterator();
                                        while (it4.hasNext()) {
                                            arrayList3.add(yua1.c((FullScreenDto) it4.next(), FullScreenEntity$Type.PRODUCTS));
                                        }
                                    } else {
                                        arrayList3 = null;
                                    }
                                    DivDataDto divUserInfoBlock = screenProductsResponseDto2.getDivUserInfoBlock();
                                    if (divUserInfoBlock != null) {
                                        productScreenRepository$toEntityV3$1.L$0 = screenProductsResponseDto2;
                                        productScreenRepository$toEntityV3$1.L$1 = list;
                                        productScreenRepository$toEntityV3$1.L$2 = list2;
                                        productScreenRepository$toEntityV3$1.L$3 = arrayList3;
                                        productScreenRepository$toEntityV3$1.L$4 = null;
                                        productScreenRepository$toEntityV3$1.label = 3;
                                        a = com.ybsdk.feature.divkit.internal.a.a(divUserInfoBlock, new com.ybsdk.feature.divkit.api.domain.a(null), productScreenRepository$toEntityV3$1);
                                        if (a != coroutineSingletons) {
                                            screenProductsResponseDto3 = screenProductsResponseDto2;
                                            obj = a;
                                            list3 = list;
                                            arrayList4 = arrayList3;
                                            rr51Var = (rr51) obj;
                                            arrayList3 = arrayList4;
                                            list = list3;
                                            Boolean areProductsSorted = screenProductsResponseDto3.getAreProductsSorted();
                                            if (areProductsSorted != null) {
                                            }
                                            educationsV2 = screenProductsResponseDto3.getEducationsV2();
                                            if (educationsV2 == null) {
                                            }
                                        }
                                    } else {
                                        screenProductsResponseDto3 = screenProductsResponseDto2;
                                        rr51Var = null;
                                        Boolean areProductsSorted2 = screenProductsResponseDto3.getAreProductsSorted();
                                        if (areProductsSorted2 != null) {
                                        }
                                        educationsV2 = screenProductsResponseDto3.getEducationsV2();
                                        if (educationsV2 == null) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        ?? r02 = (List) productScreenRepository$toEntityV3$1.L$3;
                        list2 = (List) productScreenRepository$toEntityV3$1.L$2;
                        list3 = (List) productScreenRepository$toEntityV3$1.L$1;
                        screenProductsResponseDto3 = (ScreenProductsResponseDto) productScreenRepository$toEntityV3$1.L$0;
                        kotlin.b.b(obj);
                        arrayList4 = r02;
                        rr51Var = (rr51) obj;
                        arrayList3 = arrayList4;
                        list = list3;
                        Boolean areProductsSorted22 = screenProductsResponseDto3.getAreProductsSorted();
                        booleanValue = areProductsSorted22 != null ? areProductsSorted22.booleanValue() : false;
                        educationsV2 = screenProductsResponseDto3.getEducationsV2();
                        if (educationsV2 == null) {
                            list4 = list;
                            rr51Var2 = rr51Var;
                            list5 = list2;
                            arrayList5 = arrayList3;
                            list6 = null;
                            smallTooltips = screenProductsResponseDto3.getSmallTooltips();
                            if (smallTooltips != null) {
                            }
                            return new laf0(list4, list5, arrayList5, null, rr51Var2, !booleanValue, list6, arrayList7);
                        }
                        List<EducationsV2Dto> list12 = educationsV2;
                        ArrayList arrayList8 = new ArrayList(tcc.n(list12, 10));
                        list7 = list;
                        list8 = list2;
                        r0 = booleanValue;
                        screenProductsResponseDto4 = screenProductsResponseDto3;
                        it3 = list12.iterator();
                        collection = arrayList8;
                        rr51Var3 = rr51Var;
                        arrayList6 = arrayList3;
                        if (it3.hasNext()) {
                        }
                    } else {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = productScreenRepository$toEntityV3$1.I$0;
                        collection = (Collection) productScreenRepository$toEntityV3$1.L$7;
                        it3 = (Iterator) productScreenRepository$toEntityV3$1.L$6;
                        Collection collection3 = (Collection) productScreenRepository$toEntityV3$1.L$5;
                        rr51Var3 = (rr51) productScreenRepository$toEntityV3$1.L$4;
                        ?? r13 = (List) productScreenRepository$toEntityV3$1.L$3;
                        list8 = (List) productScreenRepository$toEntityV3$1.L$2;
                        list7 = (List) productScreenRepository$toEntityV3$1.L$1;
                        screenProductsResponseDto4 = (ScreenProductsResponseDto) productScreenRepository$toEntityV3$1.L$0;
                        kotlin.b.b(obj);
                        int i5 = i4;
                        ArrayList arrayList9 = r13;
                        collection.add((kpn) obj);
                        collection = collection3;
                        r0 = i5;
                        arrayList6 = arrayList9;
                        if (it3.hasNext()) {
                            EducationsV2Dto educationsV2Dto = (EducationsV2Dto) it3.next();
                            productScreenRepository$toEntityV3$1.L$0 = screenProductsResponseDto4;
                            productScreenRepository$toEntityV3$1.L$1 = list7;
                            productScreenRepository$toEntityV3$1.L$2 = list8;
                            productScreenRepository$toEntityV3$1.L$3 = arrayList6;
                            productScreenRepository$toEntityV3$1.L$4 = rr51Var3;
                            productScreenRepository$toEntityV3$1.L$5 = collection;
                            productScreenRepository$toEntityV3$1.L$6 = it3;
                            productScreenRepository$toEntityV3$1.L$7 = collection;
                            productScreenRepository$toEntityV3$1.I$0 = r0;
                            productScreenRepository$toEntityV3$1.label = 4;
                            obj = com.ybsdk.feature.educations.api.a.d(educationsV2Dto, productScreenRepository$toEntityV3$1);
                            if (obj != coroutineSingletons) {
                                collection3 = collection;
                                i5 = r0;
                                arrayList9 = arrayList6;
                                collection.add((kpn) obj);
                                collection = collection3;
                                r0 = i5;
                                arrayList6 = arrayList9;
                                if (it3.hasNext()) {
                                    list6 = (List) collection;
                                    screenProductsResponseDto3 = screenProductsResponseDto4;
                                    rr51Var2 = rr51Var3;
                                    arrayList5 = arrayList6;
                                    list5 = list8;
                                    list4 = list7;
                                    booleanValue = r0;
                                    smallTooltips = screenProductsResponseDto3.getSmallTooltips();
                                    if (smallTooltips != null) {
                                        List<ServerTooltipDto> list13 = smallTooltips;
                                        arrayList7 = new ArrayList(tcc.n(list13, 10));
                                        Iterator it5 = list13.iterator();
                                        while (it5.hasNext()) {
                                            arrayList7.add(cuq0.a((ServerTooltipDto) it5.next()));
                                        }
                                    }
                                    return new laf0(list4, list5, arrayList5, null, rr51Var2, !booleanValue, list6, arrayList7);
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                }
            }
        }
        productScreenRepository$toEntityV3$1 = new ProductScreenRepository$toEntityV3$1(aVar, continuationImpl);
        Object obj3 = productScreenRepository$toEntityV3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productScreenRepository$toEntityV3$1.label;
        int i32 = 2;
        ArrayList arrayList72 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c5  */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0226 -> B:13:0x0227). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0149 -> B:45:0x014e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ScreenProductsV4ResponseDto screenProductsV4ResponseDto, ContinuationImpl continuationImpl) {
        ProductScreenRepository$toEntityV4$1 productScreenRepository$toEntityV4$1;
        int i;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto2;
        DivDataDto divkitData;
        Object b;
        dlg0 dlg0Var;
        ArrayList arrayList;
        EmptyList emptyList;
        Iterator it;
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto3;
        com.ybsdk.feature.divkit.api.domain.a aVar3;
        Throwable a;
        rr51 rr51Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        dlg0 dlg0Var2;
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto4;
        rr51 rr51Var2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        EmptyList emptyList2;
        Object obj;
        List<EducationsV2Dto> educationsV2;
        rr51 rr51Var3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        dlg0 dlg0Var3;
        List list;
        EmptyList emptyList3;
        Iterator it2;
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto5;
        EmptyList emptyList4;
        ArrayList arrayList8;
        Collection collection;
        dlg0 dlg0Var4;
        ArrayList arrayList9;
        rr51 rr51Var4;
        Throwable a2;
        List<ServerTooltipDto> smallTooltips;
        aVar.getClass();
        if (continuationImpl instanceof ProductScreenRepository$toEntityV4$1) {
            productScreenRepository$toEntityV4$1 = (ProductScreenRepository$toEntityV4$1) continuationImpl;
            int i2 = productScreenRepository$toEntityV4$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productScreenRepository$toEntityV4$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productScreenRepository$toEntityV4$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productScreenRepository$toEntityV4$1.label;
                int i3 = 2;
                ArrayList arrayList10 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    aVar2 = new com.ybsdk.feature.divkit.api.domain.a(screenProductsV4ResponseDto.getCommonDivData());
                    QuickActionsHeaderDto quickActionsHeader = screenProductsV4ResponseDto.getQuickActionsHeader();
                    if (quickActionsHeader != null && (divkitData = quickActionsHeader.getDivkitData()) != null) {
                        productScreenRepository$toEntityV4$1.L$0 = screenProductsV4ResponseDto;
                        productScreenRepository$toEntityV4$1.L$1 = aVar2;
                        productScreenRepository$toEntityV4$1.label = 1;
                        b = aVar2.b(divkitData, productScreenRepository$toEntityV4$1);
                        if (b != coroutineSingletons) {
                            screenProductsV4ResponseDto2 = screenProductsV4ResponseDto;
                        }
                        return coroutineSingletons;
                    }
                    screenProductsV4ResponseDto2 = screenProductsV4ResponseDto;
                    dlg0Var = null;
                    List<ProductScreenItemDto> screenItems = screenProductsV4ResponseDto2.getScreenItems();
                    arrayList = new ArrayList();
                    Iterator it3 = screenItems.iterator();
                    emptyList = EmptyList.a;
                    ScreenProductsV4ResponseDto screenProductsV4ResponseDto6 = screenProductsV4ResponseDto2;
                    it = it3;
                    screenProductsV4ResponseDto3 = screenProductsV4ResponseDto6;
                    aVar3 = aVar2;
                    if (!it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    aVar2 = (com.ybsdk.feature.divkit.api.domain.a) productScreenRepository$toEntityV4$1.L$1;
                    screenProductsV4ResponseDto2 = (ScreenProductsV4ResponseDto) productScreenRepository$toEntityV4$1.L$0;
                    kotlin.b.b(obj2);
                    b = ((Result) obj2).getValue();
                } else {
                    if (i == 2) {
                        ProductScreenItemDto productScreenItemDto = (ProductScreenItemDto) productScreenRepository$toEntityV4$1.L$6;
                        it = (Iterator) productScreenRepository$toEntityV4$1.L$5;
                        ?? r11 = (Collection) productScreenRepository$toEntityV4$1.L$4;
                        ?? r12 = (List) productScreenRepository$toEntityV4$1.L$3;
                        dlg0 dlg0Var5 = (dlg0) productScreenRepository$toEntityV4$1.L$2;
                        aVar3 = (com.ybsdk.feature.divkit.api.domain.a) productScreenRepository$toEntityV4$1.L$1;
                        ScreenProductsV4ResponseDto screenProductsV4ResponseDto7 = (ScreenProductsV4ResponseDto) productScreenRepository$toEntityV4$1.L$0;
                        kotlin.b.b(obj2);
                        Object obj3 = ((Result) obj2).getValue();
                        arrayList = r11;
                        dlg0Var = dlg0Var5;
                        emptyList = r12;
                        Throwable a3 = Result.a(obj3);
                        if (a3 != null) {
                            x4c.g("Can't parse products screen item", a3, null, null, 12);
                        }
                        if (obj3 instanceof Result.Failure) {
                            obj3 = null;
                        }
                        rr51 rr51Var5 = (rr51) obj3;
                        z8f0 z8f0Var = rr51Var5 == null ? new z8f0(rr51Var5, productScreenItemDto.getItemType()) : null;
                        if (z8f0Var != null) {
                            arrayList.add(z8f0Var);
                        }
                        screenProductsV4ResponseDto3 = screenProductsV4ResponseDto7;
                        i3 = 2;
                        if (!it.hasNext()) {
                            productScreenItemDto = (ProductScreenItemDto) it.next();
                            DivDataDto divkitData2 = productScreenItemDto.getDivkitData();
                            productScreenRepository$toEntityV4$1.L$0 = screenProductsV4ResponseDto3;
                            productScreenRepository$toEntityV4$1.L$1 = aVar3;
                            productScreenRepository$toEntityV4$1.L$2 = dlg0Var;
                            productScreenRepository$toEntityV4$1.L$3 = emptyList;
                            productScreenRepository$toEntityV4$1.L$4 = arrayList;
                            productScreenRepository$toEntityV4$1.L$5 = it;
                            productScreenRepository$toEntityV4$1.L$6 = productScreenItemDto;
                            productScreenRepository$toEntityV4$1.label = i3;
                            Object b2 = aVar3.b(divkitData2, productScreenRepository$toEntityV4$1);
                            if (b2 != coroutineSingletons) {
                                screenProductsV4ResponseDto7 = screenProductsV4ResponseDto3;
                                obj3 = b2;
                                Throwable a32 = Result.a(obj3);
                                if (a32 != null) {
                                }
                                if (obj3 instanceof Result.Failure) {
                                }
                                rr51 rr51Var52 = (rr51) obj3;
                                if (rr51Var52 == null) {
                                }
                                if (z8f0Var != null) {
                                }
                                screenProductsV4ResponseDto3 = screenProductsV4ResponseDto7;
                                i3 = 2;
                                if (!it.hasNext()) {
                                    arrayList2 = arrayList;
                                    List<FullScreenDto> fullScreens = screenProductsV4ResponseDto3.getFullScreens();
                                    if (fullScreens != null) {
                                        List<FullScreenDto> list2 = fullScreens;
                                        arrayList3 = new ArrayList(tcc.n(list2, 10));
                                        Iterator it4 = list2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList3.add(yua1.c((FullScreenDto) it4.next(), FullScreenEntity$Type.PRODUCTS));
                                        }
                                    } else {
                                        arrayList3 = null;
                                    }
                                    DivDataDto divUserInfoBlock = screenProductsV4ResponseDto3.getDivUserInfoBlock();
                                    if (divUserInfoBlock != null) {
                                        productScreenRepository$toEntityV4$1.L$0 = screenProductsV4ResponseDto3;
                                        productScreenRepository$toEntityV4$1.L$1 = dlg0Var;
                                        productScreenRepository$toEntityV4$1.L$2 = emptyList;
                                        productScreenRepository$toEntityV4$1.L$3 = arrayList2;
                                        productScreenRepository$toEntityV4$1.L$4 = arrayList3;
                                        productScreenRepository$toEntityV4$1.L$5 = null;
                                        productScreenRepository$toEntityV4$1.L$6 = null;
                                        productScreenRepository$toEntityV4$1.label = 3;
                                        Object b3 = aVar3.b(divUserInfoBlock, productScreenRepository$toEntityV4$1);
                                        if (b3 != coroutineSingletons) {
                                            arrayList4 = arrayList2;
                                            arrayList5 = arrayList3;
                                            dlg0Var2 = dlg0Var;
                                            emptyList2 = emptyList;
                                            screenProductsV4ResponseDto4 = screenProductsV4ResponseDto3;
                                            obj = b3;
                                            a2 = Result.a(obj);
                                            if (a2 != null) {
                                            }
                                            if (obj instanceof Result.Failure) {
                                            }
                                            rr51Var2 = (rr51) obj;
                                            emptyList = emptyList2;
                                            arrayList3 = arrayList5;
                                            arrayList2 = arrayList4;
                                            educationsV2 = screenProductsV4ResponseDto4.getEducationsV2();
                                            if (educationsV2 == null) {
                                            }
                                        }
                                    } else {
                                        dlg0Var2 = dlg0Var;
                                        screenProductsV4ResponseDto4 = screenProductsV4ResponseDto3;
                                        rr51Var2 = null;
                                        educationsV2 = screenProductsV4ResponseDto4.getEducationsV2();
                                        if (educationsV2 == null) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        ?? r3 = (List) productScreenRepository$toEntityV4$1.L$4;
                        ?? r6 = (List) productScreenRepository$toEntityV4$1.L$3;
                        ?? r7 = (List) productScreenRepository$toEntityV4$1.L$2;
                        dlg0Var2 = (dlg0) productScreenRepository$toEntityV4$1.L$1;
                        screenProductsV4ResponseDto4 = (ScreenProductsV4ResponseDto) productScreenRepository$toEntityV4$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        arrayList5 = r3;
                        arrayList4 = r6;
                        emptyList2 = r7;
                        a2 = Result.a(obj);
                        if (a2 != null) {
                            x4c.g("Can't parse products user block", a2, null, null, 12);
                        }
                        if (obj instanceof Result.Failure) {
                            obj = null;
                        }
                        rr51Var2 = (rr51) obj;
                        emptyList = emptyList2;
                        arrayList3 = arrayList5;
                        arrayList2 = arrayList4;
                        educationsV2 = screenProductsV4ResponseDto4.getEducationsV2();
                        if (educationsV2 == null) {
                            rr51Var3 = rr51Var2;
                            arrayList6 = arrayList2;
                            arrayList7 = arrayList3;
                            dlg0Var3 = dlg0Var2;
                            list = null;
                            emptyList3 = emptyList;
                            smallTooltips = screenProductsV4ResponseDto4.getSmallTooltips();
                            if (smallTooltips != null) {
                            }
                            return new laf0(emptyList3, arrayList6, arrayList7, dlg0Var3, rr51Var3, false, list, arrayList10);
                        }
                        List<EducationsV2Dto> list3 = educationsV2;
                        ArrayList arrayList11 = new ArrayList(tcc.n(list3, 10));
                        it2 = list3.iterator();
                        screenProductsV4ResponseDto5 = screenProductsV4ResponseDto4;
                        emptyList4 = emptyList;
                        arrayList8 = arrayList2;
                        collection = arrayList11;
                        dlg0Var4 = dlg0Var2;
                        arrayList9 = arrayList3;
                        rr51Var4 = rr51Var2;
                        if (it2.hasNext()) {
                        }
                    } else {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        collection = (Collection) productScreenRepository$toEntityV4$1.L$8;
                        it2 = (Iterator) productScreenRepository$toEntityV4$1.L$7;
                        Collection collection2 = (Collection) productScreenRepository$toEntityV4$1.L$6;
                        rr51Var4 = (rr51) productScreenRepository$toEntityV4$1.L$5;
                        ?? r8 = (List) productScreenRepository$toEntityV4$1.L$4;
                        ?? r112 = (List) productScreenRepository$toEntityV4$1.L$3;
                        ?? r122 = (List) productScreenRepository$toEntityV4$1.L$2;
                        dlg0Var4 = (dlg0) productScreenRepository$toEntityV4$1.L$1;
                        screenProductsV4ResponseDto5 = (ScreenProductsV4ResponseDto) productScreenRepository$toEntityV4$1.L$0;
                        kotlin.b.b(obj2);
                        ArrayList arrayList12 = r8;
                        ArrayList arrayList13 = r112;
                        EmptyList emptyList5 = r122;
                        collection.add((kpn) obj2);
                        collection = collection2;
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        emptyList4 = emptyList5;
                        if (it2.hasNext()) {
                            EducationsV2Dto educationsV2Dto = (EducationsV2Dto) it2.next();
                            productScreenRepository$toEntityV4$1.L$0 = screenProductsV4ResponseDto5;
                            productScreenRepository$toEntityV4$1.L$1 = dlg0Var4;
                            productScreenRepository$toEntityV4$1.L$2 = emptyList4;
                            productScreenRepository$toEntityV4$1.L$3 = arrayList8;
                            productScreenRepository$toEntityV4$1.L$4 = arrayList9;
                            productScreenRepository$toEntityV4$1.L$5 = rr51Var4;
                            productScreenRepository$toEntityV4$1.L$6 = collection;
                            productScreenRepository$toEntityV4$1.L$7 = it2;
                            productScreenRepository$toEntityV4$1.L$8 = collection;
                            productScreenRepository$toEntityV4$1.label = 4;
                            obj2 = com.ybsdk.feature.educations.api.a.d(educationsV2Dto, productScreenRepository$toEntityV4$1);
                            if (obj2 != coroutineSingletons) {
                                collection2 = collection;
                                arrayList12 = arrayList9;
                                arrayList13 = arrayList8;
                                emptyList5 = emptyList4;
                                collection.add((kpn) obj2);
                                collection = collection2;
                                arrayList9 = arrayList12;
                                arrayList8 = arrayList13;
                                emptyList4 = emptyList5;
                                if (it2.hasNext()) {
                                    list = (List) collection;
                                    rr51Var3 = rr51Var4;
                                    arrayList7 = arrayList9;
                                    arrayList6 = arrayList8;
                                    emptyList3 = emptyList4;
                                    dlg0Var3 = dlg0Var4;
                                    screenProductsV4ResponseDto4 = screenProductsV4ResponseDto5;
                                    smallTooltips = screenProductsV4ResponseDto4.getSmallTooltips();
                                    if (smallTooltips != null) {
                                        List<ServerTooltipDto> list4 = smallTooltips;
                                        arrayList10 = new ArrayList(tcc.n(list4, 10));
                                        Iterator it5 = list4.iterator();
                                        while (it5.hasNext()) {
                                            arrayList10.add(cuq0.a((ServerTooltipDto) it5.next()));
                                        }
                                    }
                                    return new laf0(emptyList3, arrayList6, arrayList7, dlg0Var3, rr51Var3, false, list, arrayList10);
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                }
                a = Result.a(b);
                if (a != null) {
                    x4c.g("Can't parse quick actions header", a, null, null, 12);
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var != null) {
                    dlg0Var = new dlg0(rr51Var);
                    List<ProductScreenItemDto> screenItems2 = screenProductsV4ResponseDto2.getScreenItems();
                    arrayList = new ArrayList();
                    Iterator it32 = screenItems2.iterator();
                    emptyList = EmptyList.a;
                    ScreenProductsV4ResponseDto screenProductsV4ResponseDto62 = screenProductsV4ResponseDto2;
                    it = it32;
                    screenProductsV4ResponseDto3 = screenProductsV4ResponseDto62;
                    aVar3 = aVar2;
                    if (!it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                dlg0Var = null;
                List<ProductScreenItemDto> screenItems22 = screenProductsV4ResponseDto2.getScreenItems();
                arrayList = new ArrayList();
                Iterator it322 = screenItems22.iterator();
                emptyList = EmptyList.a;
                ScreenProductsV4ResponseDto screenProductsV4ResponseDto622 = screenProductsV4ResponseDto2;
                it = it322;
                screenProductsV4ResponseDto3 = screenProductsV4ResponseDto622;
                aVar3 = aVar2;
                if (!it.hasNext()) {
                }
                return coroutineSingletons;
            }
        }
        productScreenRepository$toEntityV4$1 = new ProductScreenRepository$toEntityV4$1(aVar, continuationImpl);
        Object obj22 = productScreenRepository$toEntityV4$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productScreenRepository$toEntityV4$1.label;
        int i32 = 2;
        ArrayList arrayList102 = null;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var != null) {
        }
        dlg0Var = null;
        List<ProductScreenItemDto> screenItems222 = screenProductsV4ResponseDto2.getScreenItems();
        arrayList = new ArrayList();
        Iterator it3222 = screenItems222.iterator();
        emptyList = EmptyList.a;
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto6222 = screenProductsV4ResponseDto2;
        it = it3222;
        screenProductsV4ResponseDto3 = screenProductsV4ResponseDto6222;
        aVar3 = aVar2;
        if (!it.hasNext()) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ProductScreenRepository$getProductScreenItems$1 productScreenRepository$getProductScreenItems$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z;
        Object y;
        DeviceInfoDto deviceInfoDto;
        if (continuationImpl instanceof ProductScreenRepository$getProductScreenItems$1) {
            productScreenRepository$getProductScreenItems$1 = (ProductScreenRepository$getProductScreenItems$1) continuationImpl;
            int i2 = productScreenRepository$getProductScreenItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productScreenRepository$getProductScreenItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productScreenRepository$getProductScreenItems$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productScreenRepository$getProductScreenItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean d = ((t400) this.j).d();
                    productScreenRepository$getProductScreenItems$1.Z$0 = d;
                    productScreenRepository$getProductScreenItems$1.label = 1;
                    Object a = this.b.a(productScreenRepository$getProductScreenItems$1);
                    if (a != coroutineSingletons) {
                        z = d;
                        obj = a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = productScreenRepository$getProductScreenItems$1.Z$0;
                    DeviceInfoDto deviceInfoDto2 = (DeviceInfoDto) productScreenRepository$getProductScreenItems$1.L$0;
                    kotlin.b.b(obj);
                    deviceInfoDto = deviceInfoDto2;
                    ProductScreenRepository$getProductScreenItems$2 productScreenRepository$getProductScreenItems$2 = new ProductScreenRepository$getProductScreenItems$2(this, new ScreenProductsRequest(z, deviceInfoDto, (NfcInfoDto) obj, this.f.b(), com.ybsdk.core.common.data.network.dto.a.a(this.g.b()), this.i.b(), ((g5j0) this.d).a()), null);
                    productScreenRepository$getProductScreenItems$1.L$0 = null;
                    productScreenRepository$getProductScreenItems$1.label = 3;
                    Object c = com.ybsdk.core.utils.ext.c.c(productScreenRepository$getProductScreenItems$2, productScreenRepository$getProductScreenItems$1);
                    return c != coroutineSingletons ? coroutineSingletons : c;
                }
                z = productScreenRepository$getProductScreenItems$1.Z$0;
                kotlin.b.b(obj);
                DeviceInfoDto deviceInfoDto3 = (DeviceInfoDto) obj;
                fzw b = ((p860) this.c).b();
                productScreenRepository$getProductScreenItems$1.L$0 = deviceInfoDto3;
                productScreenRepository$getProductScreenItems$1.Z$0 = z;
                productScreenRepository$getProductScreenItems$1.label = 2;
                y = e.y(b, productScreenRepository$getProductScreenItems$1);
                if (y != coroutineSingletons) {
                    deviceInfoDto = deviceInfoDto3;
                    obj = y;
                    ProductScreenRepository$getProductScreenItems$2 productScreenRepository$getProductScreenItems$22 = new ProductScreenRepository$getProductScreenItems$2(this, new ScreenProductsRequest(z, deviceInfoDto, (NfcInfoDto) obj, this.f.b(), com.ybsdk.core.common.data.network.dto.a.a(this.g.b()), this.i.b(), ((g5j0) this.d).a()), null);
                    productScreenRepository$getProductScreenItems$1.L$0 = null;
                    productScreenRepository$getProductScreenItems$1.label = 3;
                    Object c2 = com.ybsdk.core.utils.ext.c.c(productScreenRepository$getProductScreenItems$22, productScreenRepository$getProductScreenItems$1);
                    if (c2 != coroutineSingletons) {
                    }
                }
            }
        }
        productScreenRepository$getProductScreenItems$1 = new ProductScreenRepository$getProductScreenItems$1(this, continuationImpl);
        Object obj2 = productScreenRepository$getProductScreenItems$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productScreenRepository$getProductScreenItems$1.label;
        if (i != 0) {
        }
        DeviceInfoDto deviceInfoDto32 = (DeviceInfoDto) obj2;
        fzw b2 = ((p860) this.c).b();
        productScreenRepository$getProductScreenItems$1.L$0 = deviceInfoDto32;
        productScreenRepository$getProductScreenItems$1.Z$0 = z;
        productScreenRepository$getProductScreenItems$1.label = 2;
        y = e.y(b2, productScreenRepository$getProductScreenItems$1);
        if (y != coroutineSingletons) {
        }
    }
}
