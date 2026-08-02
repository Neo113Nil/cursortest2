package com.yandex.plus.pay.data.mb.dto;

import defpackage.d6p;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nbp;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/data/mb/dto/FamilyRoleDto;", "", "Companion", "nbp", "PARENT", "CHILD", JCP.RAW_PREFIX, "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyRoleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FamilyRoleDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final FamilyRoleDto CHILD;
    public static final nbp Companion;
    public static final FamilyRoleDto NONE;
    public static final FamilyRoleDto PARENT;

    static {
        FamilyRoleDto familyRoleDto = new FamilyRoleDto("PARENT", 0);
        PARENT = familyRoleDto;
        FamilyRoleDto familyRoleDto2 = new FamilyRoleDto("CHILD", 1);
        CHILD = familyRoleDto2;
        FamilyRoleDto familyRoleDto3 = new FamilyRoleDto(JCP.RAW_PREFIX, 2);
        NONE = familyRoleDto3;
        FamilyRoleDto[] familyRoleDtoArr = {familyRoleDto, familyRoleDto2, familyRoleDto3};
        $VALUES = familyRoleDtoArr;
        $ENTRIES = kotlin.enums.a.a(familyRoleDtoArr);
        Companion = new nbp();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d6p(22));
    }

    public static FamilyRoleDto valueOf(String str) {
        return (FamilyRoleDto) Enum.valueOf(FamilyRoleDto.class, str);
    }

    public static FamilyRoleDto[] values() {
        return (FamilyRoleDto[]) $VALUES.clone();
    }
}
