package com.yandex.xplat.common;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/common/JSONItemKind;", "", "integer", "double", "string", "boolean", "nullItem", PolicyMappingsExtension.MAP, "array", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JSONItemKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ JSONItemKind[] $VALUES;
    public static final JSONItemKind array;

    /* renamed from: boolean, reason: not valid java name */
    public static final JSONItemKind f21boolean;

    /* renamed from: double, reason: not valid java name */
    public static final JSONItemKind f22double;
    public static final JSONItemKind integer;
    public static final JSONItemKind map;
    public static final JSONItemKind nullItem;
    public static final JSONItemKind string;

    static {
        JSONItemKind jSONItemKind = new JSONItemKind("integer", 0);
        integer = jSONItemKind;
        JSONItemKind jSONItemKind2 = new JSONItemKind("double", 1);
        f22double = jSONItemKind2;
        JSONItemKind jSONItemKind3 = new JSONItemKind("string", 2);
        string = jSONItemKind3;
        JSONItemKind jSONItemKind4 = new JSONItemKind("boolean", 3);
        f21boolean = jSONItemKind4;
        JSONItemKind jSONItemKind5 = new JSONItemKind("nullItem", 4);
        nullItem = jSONItemKind5;
        JSONItemKind jSONItemKind6 = new JSONItemKind(PolicyMappingsExtension.MAP, 5);
        map = jSONItemKind6;
        JSONItemKind jSONItemKind7 = new JSONItemKind("array", 6);
        array = jSONItemKind7;
        JSONItemKind[] jSONItemKindArr = {jSONItemKind, jSONItemKind2, jSONItemKind3, jSONItemKind4, jSONItemKind5, jSONItemKind6, jSONItemKind7};
        $VALUES = jSONItemKindArr;
        $ENTRIES = kotlin.enums.a.a(jSONItemKindArr);
    }

    public static JSONItemKind valueOf(String str) {
        return (JSONItemKind) Enum.valueOf(JSONItemKind.class, str);
    }

    public static JSONItemKind[] values() {
        return (JSONItemKind[]) $VALUES.clone();
    }
}
