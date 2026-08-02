package com.yandex.auth;

import defpackage.w53;
import java.util.Map;

/* loaded from: classes5.dex */
public final class LegacyAccountType {
    private static final Map<Integer, String> INTEGER_TO_STRING;
    static final int LOGIN = 2;
    static final int MAILISH = 32;
    static final int PHONISH = 16;
    static final int SOCIAL = 8;
    public static final String STRING_LOGIN = "login";
    public static final String STRING_MAILISH = "external_mail";
    public static final String STRING_PHONISH = "phone";
    public static final String STRING_SOCIAL = "social";
    public static final String STRING_TEAM = "team";
    private static final Map<String, Integer> STRING_TO_INTEGER;
    public static final int TEAM = 4;

    static {
        w53 w53Var = new w53();
        STRING_TO_INTEGER = w53Var;
        w53 w53Var2 = new w53();
        INTEGER_TO_STRING = w53Var2;
        w53Var.put(STRING_LOGIN, 2);
        w53Var.put(STRING_TEAM, 4);
        w53Var.put(STRING_SOCIAL, 8);
        w53Var.put("phone", 16);
        w53Var.put(STRING_MAILISH, 32);
        w53Var2.put(2, STRING_LOGIN);
        w53Var2.put(4, STRING_TEAM);
        w53Var2.put(8, STRING_SOCIAL);
        w53Var2.put(16, "phone");
        w53Var2.put(32, STRING_MAILISH);
    }

    public static int from(String str) {
        Integer num;
        if (str == null || str.isEmpty() || (num = STRING_TO_INTEGER.get(str)) == null) {
            return 2;
        }
        return num.intValue();
    }

    public static boolean isAllowed(int i, int i2) {
        return (i & i2) == i2;
    }

    public static boolean isOnlyAllowed(int i, int i2) {
        return i == i2;
    }

    public static String toString(int i) {
        String str = INTEGER_TO_STRING.get(Integer.valueOf(i));
        return str == null ? STRING_LOGIN : str;
    }
}
