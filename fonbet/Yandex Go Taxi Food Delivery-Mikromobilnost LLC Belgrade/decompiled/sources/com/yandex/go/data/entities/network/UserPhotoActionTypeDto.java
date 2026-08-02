package com.yandex.go.data.entities.network;

import defpackage.cq21;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/data/entities/network/UserPhotoActionTypeDto;", "", "Companion", "cq21", "DELETE_PHOTO", "TAKE_SELFIE", "SELECT_PHOTO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserPhotoActionTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserPhotoActionTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final cq21 Companion;
    public static final UserPhotoActionTypeDto DELETE_PHOTO;
    public static final UserPhotoActionTypeDto SELECT_PHOTO;
    public static final UserPhotoActionTypeDto TAKE_SELFIE;

    static {
        UserPhotoActionTypeDto userPhotoActionTypeDto = new UserPhotoActionTypeDto("DELETE_PHOTO", 0);
        DELETE_PHOTO = userPhotoActionTypeDto;
        UserPhotoActionTypeDto userPhotoActionTypeDto2 = new UserPhotoActionTypeDto("TAKE_SELFIE", 1);
        TAKE_SELFIE = userPhotoActionTypeDto2;
        UserPhotoActionTypeDto userPhotoActionTypeDto3 = new UserPhotoActionTypeDto("SELECT_PHOTO", 2);
        SELECT_PHOTO = userPhotoActionTypeDto3;
        UserPhotoActionTypeDto[] userPhotoActionTypeDtoArr = {userPhotoActionTypeDto, userPhotoActionTypeDto2, userPhotoActionTypeDto3};
        $VALUES = userPhotoActionTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(userPhotoActionTypeDtoArr);
        Companion = new cq21();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(6));
    }

    public static UserPhotoActionTypeDto valueOf(String str) {
        return (UserPhotoActionTypeDto) Enum.valueOf(UserPhotoActionTypeDto.class, str);
    }

    public static UserPhotoActionTypeDto[] values() {
        return (UserPhotoActionTypeDto[]) $VALUES.clone();
    }
}
