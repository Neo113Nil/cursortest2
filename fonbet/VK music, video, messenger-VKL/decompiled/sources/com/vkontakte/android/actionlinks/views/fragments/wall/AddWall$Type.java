package com.vkontakte.android.actionlinks.views.fragments.wall;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddWall.kt */
/* loaded from: classes7.dex */
public final class AddWall$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AddWall$Type[] $VALUES;
    public static final AddWall$Type POST;
    public static final AddWall$Type PRODUCT;
    private final String value;

    static {
        AddWall$Type addWall$Type = new AddWall$Type("POST", 0, "post");
        POST = addWall$Type;
        AddWall$Type addWall$Type2 = new AddWall$Type("PRODUCT", 1, "product");
        PRODUCT = addWall$Type2;
        AddWall$Type[] addWall$TypeArr = {addWall$Type, addWall$Type2};
        $VALUES = addWall$TypeArr;
        $ENTRIES = new asp(addWall$TypeArr);
    }

    public AddWall$Type(String str, int i, String str2) {
        this.value = str2;
    }

    public static AddWall$Type valueOf(String str) {
        return (AddWall$Type) Enum.valueOf(AddWall$Type.class, str);
    }

    public static AddWall$Type[] values() {
        return (AddWall$Type[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
