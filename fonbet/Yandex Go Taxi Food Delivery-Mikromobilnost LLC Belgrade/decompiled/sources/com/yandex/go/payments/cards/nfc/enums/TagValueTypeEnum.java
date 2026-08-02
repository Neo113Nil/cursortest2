package com.yandex.go.payments.cards.nfc.enums;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/enums/TagValueTypeEnum;", "", "BINARY", "NUMERIC", BaseDatabaseHelper.TYPE_TEXT, "DOL", "MIXED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TagValueTypeEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TagValueTypeEnum[] $VALUES;
    public static final TagValueTypeEnum BINARY;
    public static final TagValueTypeEnum DOL;
    public static final TagValueTypeEnum MIXED;
    public static final TagValueTypeEnum NUMERIC;
    public static final TagValueTypeEnum TEXT;

    static {
        TagValueTypeEnum tagValueTypeEnum = new TagValueTypeEnum("BINARY", 0);
        BINARY = tagValueTypeEnum;
        TagValueTypeEnum tagValueTypeEnum2 = new TagValueTypeEnum("NUMERIC", 1);
        NUMERIC = tagValueTypeEnum2;
        TagValueTypeEnum tagValueTypeEnum3 = new TagValueTypeEnum(BaseDatabaseHelper.TYPE_TEXT, 2);
        TEXT = tagValueTypeEnum3;
        TagValueTypeEnum tagValueTypeEnum4 = new TagValueTypeEnum("DOL", 3);
        DOL = tagValueTypeEnum4;
        TagValueTypeEnum tagValueTypeEnum5 = new TagValueTypeEnum("MIXED", 4);
        MIXED = tagValueTypeEnum5;
        TagValueTypeEnum[] tagValueTypeEnumArr = {tagValueTypeEnum, tagValueTypeEnum2, tagValueTypeEnum3, tagValueTypeEnum4, tagValueTypeEnum5};
        $VALUES = tagValueTypeEnumArr;
        $ENTRIES = a.a(tagValueTypeEnumArr);
    }

    public static TagValueTypeEnum valueOf(String str) {
        return (TagValueTypeEnum) Enum.valueOf(TagValueTypeEnum.class, str);
    }

    public static TagValueTypeEnum[] values() {
        return (TagValueTypeEnum[]) $VALUES.clone();
    }
}
