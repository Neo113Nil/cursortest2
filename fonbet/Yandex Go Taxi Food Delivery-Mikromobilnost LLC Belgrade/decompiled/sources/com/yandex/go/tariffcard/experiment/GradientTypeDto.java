package com.yandex.go.tariffcard.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mvt;
import defpackage.nzt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/GradientTypeDto;", "", "Companion", "nzt", "CUSTOM", "CLEAR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GradientTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GradientTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final GradientTypeDto CLEAR;
    public static final GradientTypeDto CUSTOM;
    public static final nzt Companion;

    static {
        GradientTypeDto gradientTypeDto = new GradientTypeDto("CUSTOM", 0);
        CUSTOM = gradientTypeDto;
        GradientTypeDto gradientTypeDto2 = new GradientTypeDto("CLEAR", 1);
        CLEAR = gradientTypeDto2;
        GradientTypeDto[] gradientTypeDtoArr = {gradientTypeDto, gradientTypeDto2};
        $VALUES = gradientTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(gradientTypeDtoArr);
        Companion = new nzt();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(8));
    }

    public static GradientTypeDto valueOf(String str) {
        return (GradientTypeDto) Enum.valueOf(GradientTypeDto.class, str);
    }

    public static GradientTypeDto[] values() {
        return (GradientTypeDto[]) $VALUES.clone();
    }
}
