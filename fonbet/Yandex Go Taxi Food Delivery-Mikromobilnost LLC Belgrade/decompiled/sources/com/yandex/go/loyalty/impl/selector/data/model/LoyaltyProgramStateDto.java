package com.yandex.go.loyalty.impl.selector.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o3z;
import defpackage.rvz;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyProgramStateDto;", "", "Companion", "rvz", "ENABLED", "DISABLED", "NEED_ACTIVATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyProgramStateDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoyaltyProgramStateDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final rvz Companion;
    public static final LoyaltyProgramStateDto DISABLED;
    public static final LoyaltyProgramStateDto ENABLED;
    public static final LoyaltyProgramStateDto NEED_ACTIVATION;

    static {
        LoyaltyProgramStateDto loyaltyProgramStateDto = new LoyaltyProgramStateDto("ENABLED", 0);
        ENABLED = loyaltyProgramStateDto;
        LoyaltyProgramStateDto loyaltyProgramStateDto2 = new LoyaltyProgramStateDto("DISABLED", 1);
        DISABLED = loyaltyProgramStateDto2;
        LoyaltyProgramStateDto loyaltyProgramStateDto3 = new LoyaltyProgramStateDto("NEED_ACTIVATION", 2);
        NEED_ACTIVATION = loyaltyProgramStateDto3;
        LoyaltyProgramStateDto[] loyaltyProgramStateDtoArr = {loyaltyProgramStateDto, loyaltyProgramStateDto2, loyaltyProgramStateDto3};
        $VALUES = loyaltyProgramStateDtoArr;
        $ENTRIES = kotlin.enums.a.a(loyaltyProgramStateDtoArr);
        Companion = new rvz();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(24));
    }

    public static LoyaltyProgramStateDto valueOf(String str) {
        return (LoyaltyProgramStateDto) Enum.valueOf(LoyaltyProgramStateDto.class, str);
    }

    public static LoyaltyProgramStateDto[] values() {
        return (LoyaltyProgramStateDto[]) $VALUES.clone();
    }
}
