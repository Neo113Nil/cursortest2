package com.ybsdk.core.common.data.network.dto;

import com.ybsdk.core.common.data.network.dto.WidgetDto;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[WidgetDto.Type.values().length];
        try {
            iArr[WidgetDto.Type.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetDto.Type.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[WidgetDto.Theme.Image.Type.values().length];
        try {
            iArr2[WidgetDto.Theme.Image.Type.BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[WidgetDto.Theme.Image.Type.TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
