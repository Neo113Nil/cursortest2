package com.yandex.go.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/domain/entities/UserPhotoButtonAction;", "", "DELETE_PHOTO", "TAKE_SELFIE", "SELECT_PHOTO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserPhotoButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserPhotoButtonAction[] $VALUES;
    public static final UserPhotoButtonAction DELETE_PHOTO;
    public static final UserPhotoButtonAction SELECT_PHOTO;
    public static final UserPhotoButtonAction TAKE_SELFIE;

    static {
        UserPhotoButtonAction userPhotoButtonAction = new UserPhotoButtonAction("DELETE_PHOTO", 0);
        DELETE_PHOTO = userPhotoButtonAction;
        UserPhotoButtonAction userPhotoButtonAction2 = new UserPhotoButtonAction("TAKE_SELFIE", 1);
        TAKE_SELFIE = userPhotoButtonAction2;
        UserPhotoButtonAction userPhotoButtonAction3 = new UserPhotoButtonAction("SELECT_PHOTO", 2);
        SELECT_PHOTO = userPhotoButtonAction3;
        UserPhotoButtonAction[] userPhotoButtonActionArr = {userPhotoButtonAction, userPhotoButtonAction2, userPhotoButtonAction3};
        $VALUES = userPhotoButtonActionArr;
        $ENTRIES = a.a(userPhotoButtonActionArr);
    }

    public static UserPhotoButtonAction valueOf(String str) {
        return (UserPhotoButtonAction) Enum.valueOf(UserPhotoButtonAction.class, str);
    }

    public static UserPhotoButtonAction[] values() {
        return (UserPhotoButtonAction[]) $VALUES.clone();
    }
}
