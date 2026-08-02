package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkStyledTextItemModel$TextStyle", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkStyledTextItemModel$TextStyle;", "NORMAL", "ITALIC", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkStyledTextItemModel$TextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkStyledTextItemModel$TextStyle[] $VALUES;
    public static final NetworkStyledTextItemModel$TextStyle ITALIC;
    public static final NetworkStyledTextItemModel$TextStyle NORMAL;

    static {
        NetworkStyledTextItemModel$TextStyle networkStyledTextItemModel$TextStyle = new NetworkStyledTextItemModel$TextStyle("NORMAL", 0);
        NORMAL = networkStyledTextItemModel$TextStyle;
        NetworkStyledTextItemModel$TextStyle networkStyledTextItemModel$TextStyle2 = new NetworkStyledTextItemModel$TextStyle("ITALIC", 1);
        ITALIC = networkStyledTextItemModel$TextStyle2;
        NetworkStyledTextItemModel$TextStyle[] networkStyledTextItemModel$TextStyleArr = {networkStyledTextItemModel$TextStyle, networkStyledTextItemModel$TextStyle2};
        $VALUES = networkStyledTextItemModel$TextStyleArr;
        $ENTRIES = a.a(networkStyledTextItemModel$TextStyleArr);
    }

    public static NetworkStyledTextItemModel$TextStyle valueOf(String str) {
        return (NetworkStyledTextItemModel$TextStyle) Enum.valueOf(NetworkStyledTextItemModel$TextStyle.class, str);
    }

    public static NetworkStyledTextItemModel$TextStyle[] values() {
        return (NetworkStyledTextItemModel$TextStyle[]) $VALUES.clone();
    }
}
