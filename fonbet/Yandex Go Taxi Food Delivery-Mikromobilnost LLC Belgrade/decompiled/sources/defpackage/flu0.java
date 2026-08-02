package defpackage;

import com.yandex.div.data.StoredValue$Type;

/* loaded from: classes11.dex */
public final class flu0 {
    public static StoredValue$Type a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        StoredValue$Type storedValue$Type = StoredValue$Type.STRING;
        str2 = storedValue$Type.value;
        if (jl40.l(str, str2)) {
            return storedValue$Type;
        }
        StoredValue$Type storedValue$Type2 = StoredValue$Type.INTEGER;
        str3 = storedValue$Type2.value;
        if (jl40.l(str, str3)) {
            return storedValue$Type2;
        }
        StoredValue$Type storedValue$Type3 = StoredValue$Type.BOOLEAN;
        str4 = storedValue$Type3.value;
        if (jl40.l(str, str4)) {
            return storedValue$Type3;
        }
        StoredValue$Type storedValue$Type4 = StoredValue$Type.NUMBER;
        str5 = storedValue$Type4.value;
        if (jl40.l(str, str5)) {
            return storedValue$Type4;
        }
        StoredValue$Type storedValue$Type5 = StoredValue$Type.COLOR;
        str6 = storedValue$Type5.value;
        if (jl40.l(str, str6)) {
            return storedValue$Type5;
        }
        StoredValue$Type storedValue$Type6 = StoredValue$Type.URL;
        str7 = storedValue$Type6.value;
        if (jl40.l(str, str7)) {
            return storedValue$Type6;
        }
        StoredValue$Type storedValue$Type7 = StoredValue$Type.ARRAY;
        str8 = storedValue$Type7.value;
        if (jl40.l(str, str8)) {
            return storedValue$Type7;
        }
        StoredValue$Type storedValue$Type8 = StoredValue$Type.DICT;
        str9 = storedValue$Type8.value;
        if (jl40.l(str, str9)) {
            return storedValue$Type8;
        }
        return null;
    }
}
