package com.ybsdk.common.mappers;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.network.dto.GetMenuResponse;
import defpackage.ny61;
import defpackage.pk10;
import defpackage.rr51;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(GetMenuResponse getMenuResponse, Continuation continuation) {
        MenuItemsMapperKt$toEntity$1 menuItemsMapperKt$toEntity$1;
        int i;
        DivDataDto toolbarDivkitData;
        rr51 rr51Var;
        rr51 rr51Var2;
        Object a;
        GetMenuResponse getMenuResponse2;
        rr51 rr51Var3;
        if (continuation instanceof MenuItemsMapperKt$toEntity$1) {
            menuItemsMapperKt$toEntity$1 = (MenuItemsMapperKt$toEntity$1) continuation;
            int i2 = menuItemsMapperKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuItemsMapperKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuItemsMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuItemsMapperKt$toEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    DivDataDto divkitData = getMenuResponse.getDivkitData();
                    menuItemsMapperKt$toEntity$1.L$0 = getMenuResponse;
                    menuItemsMapperKt$toEntity$1.label = 1;
                    obj = com.ybsdk.feature.divkit.internal.a.a(divkitData, new com.ybsdk.feature.divkit.api.domain.a(null), menuItemsMapperKt$toEntity$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rr51Var3 = (rr51) menuItemsMapperKt$toEntity$1.L$1;
                        getMenuResponse2 = (GetMenuResponse) menuItemsMapperKt$toEntity$1.L$0;
                        b.b(obj);
                        rr51Var2 = (rr51) obj;
                        GetMenuResponse getMenuResponse3 = getMenuResponse2;
                        rr51Var = rr51Var3;
                        getMenuResponse = getMenuResponse3;
                        ThemedParameter<String> toolbarBackgroundColor = getMenuResponse.getToolbarBackgroundColor();
                        return new pk10(rr51Var, rr51Var2, toolbarBackgroundColor != null ? toolbarBackgroundColor.toEntity() : null);
                    }
                    getMenuResponse = (GetMenuResponse) menuItemsMapperKt$toEntity$1.L$0;
                    b.b(obj);
                }
                rr51 rr51Var4 = (rr51) obj;
                toolbarDivkitData = getMenuResponse.getToolbarDivkitData();
                if (toolbarDivkitData != null) {
                    rr51Var = rr51Var4;
                    rr51Var2 = null;
                    ThemedParameter<String> toolbarBackgroundColor2 = getMenuResponse.getToolbarBackgroundColor();
                    return new pk10(rr51Var, rr51Var2, toolbarBackgroundColor2 != null ? toolbarBackgroundColor2.toEntity() : null);
                }
                menuItemsMapperKt$toEntity$1.L$0 = getMenuResponse;
                menuItemsMapperKt$toEntity$1.L$1 = rr51Var4;
                menuItemsMapperKt$toEntity$1.label = 2;
                a = com.ybsdk.feature.divkit.internal.a.a(toolbarDivkitData, new com.ybsdk.feature.divkit.api.domain.a(null), menuItemsMapperKt$toEntity$1);
                if (a != coroutineSingletons) {
                    getMenuResponse2 = getMenuResponse;
                    rr51Var3 = rr51Var4;
                    obj = a;
                    rr51Var2 = (rr51) obj;
                    GetMenuResponse getMenuResponse32 = getMenuResponse2;
                    rr51Var = rr51Var3;
                    getMenuResponse = getMenuResponse32;
                    ThemedParameter<String> toolbarBackgroundColor22 = getMenuResponse.getToolbarBackgroundColor();
                    return new pk10(rr51Var, rr51Var2, toolbarBackgroundColor22 != null ? toolbarBackgroundColor22.toEntity() : null);
                }
                return coroutineSingletons;
            }
        }
        menuItemsMapperKt$toEntity$1 = new MenuItemsMapperKt$toEntity$1(continuation);
        Object obj2 = menuItemsMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuItemsMapperKt$toEntity$1.label;
        if (i != 0) {
        }
        rr51 rr51Var42 = (rr51) obj2;
        toolbarDivkitData = getMenuResponse.getToolbarDivkitData();
        if (toolbarDivkitData != null) {
        }
    }
}
