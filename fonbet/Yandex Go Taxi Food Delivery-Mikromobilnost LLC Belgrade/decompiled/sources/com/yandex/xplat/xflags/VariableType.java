package com.yandex.xplat.xflags;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/xplat/xflags/VariableType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Int", "Double", "Boolean", "String_", "Version", "Array", "Map", "xplat-xflags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VariableType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VariableType[] $VALUES;
    public static final VariableType Array;
    public static final VariableType Boolean;
    public static final VariableType Double;
    public static final VariableType Int;
    public static final VariableType Map;
    public static final VariableType String_;
    public static final VariableType Version;
    private final String value;

    static {
        VariableType variableType = new VariableType("Int", 0, "int");
        Int = variableType;
        VariableType variableType2 = new VariableType("Double", 1, "double");
        Double = variableType2;
        VariableType variableType3 = new VariableType("Boolean", 2, "boolean");
        Boolean = variableType3;
        VariableType variableType4 = new VariableType("String_", 3, "string");
        String_ = variableType4;
        VariableType variableType5 = new VariableType("Version", 4, "version");
        Version = variableType5;
        VariableType variableType6 = new VariableType("Array", 5, "array");
        Array = variableType6;
        VariableType variableType7 = new VariableType("Map", 6, PolicyMappingsExtension.MAP);
        Map = variableType7;
        VariableType[] variableTypeArr = {variableType, variableType2, variableType3, variableType4, variableType5, variableType6, variableType7};
        $VALUES = variableTypeArr;
        $ENTRIES = kotlin.enums.a.a(variableTypeArr);
    }

    public VariableType(String str, int i, String str2) {
        this.value = str2;
    }

    public static VariableType valueOf(String str) {
        return (VariableType) Enum.valueOf(VariableType.class, str);
    }

    public static VariableType[] values() {
        return (VariableType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
