package com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/sdk/nfcscanner/tools/ownimpl/enums/TagTypeEnum;", "", "PRIMITIVE", "CONSTRUCTED", "nfcscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TagTypeEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TagTypeEnum[] $VALUES;
    public static final TagTypeEnum CONSTRUCTED;
    public static final TagTypeEnum PRIMITIVE;

    static {
        TagTypeEnum tagTypeEnum = new TagTypeEnum("PRIMITIVE", 0);
        PRIMITIVE = tagTypeEnum;
        TagTypeEnum tagTypeEnum2 = new TagTypeEnum("CONSTRUCTED", 1);
        CONSTRUCTED = tagTypeEnum2;
        TagTypeEnum[] tagTypeEnumArr = {tagTypeEnum, tagTypeEnum2};
        $VALUES = tagTypeEnumArr;
        $ENTRIES = a.a(tagTypeEnumArr);
    }

    public static TagTypeEnum valueOf(String str) {
        return (TagTypeEnum) Enum.valueOf(TagTypeEnum.class, str);
    }

    public static TagTypeEnum[] values() {
        return (TagTypeEnum[]) $VALUES.clone();
    }
}
