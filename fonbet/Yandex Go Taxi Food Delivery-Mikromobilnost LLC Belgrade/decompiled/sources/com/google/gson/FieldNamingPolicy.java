package com.google.gson;

import defpackage.uxq;
import java.lang.reflect.Field;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public abstract class FieldNamingPolicy implements uxq {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    public static final FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;

    static {
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.1
            @Override // defpackage.uxq
            public final String a(Field field) {
                return field.getName();
            }
        };
        IDENTITY = fieldNamingPolicy;
        FieldNamingPolicy fieldNamingPolicy2 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.2
            @Override // defpackage.uxq
            public final String a(Field field) {
                return FieldNamingPolicy.c(field.getName());
            }
        };
        UPPER_CAMEL_CASE = fieldNamingPolicy2;
        FieldNamingPolicy fieldNamingPolicy3 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.3
            @Override // defpackage.uxq
            public final String a(Field field) {
                return FieldNamingPolicy.c(FieldNamingPolicy.b(field.getName(), HexString.CHAR_SPACE));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = fieldNamingPolicy3;
        FieldNamingPolicy fieldNamingPolicy4 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.4
            @Override // defpackage.uxq
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = fieldNamingPolicy4;
        FieldNamingPolicy fieldNamingPolicy5 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.5
            @Override // defpackage.uxq
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = fieldNamingPolicy5;
        FieldNamingPolicy fieldNamingPolicy6 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.6
            @Override // defpackage.uxq
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), LicenseUtility.SEPARATOR).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = fieldNamingPolicy6;
        FieldNamingPolicy fieldNamingPolicy7 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.7
            @Override // defpackage.uxq
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = fieldNamingPolicy7;
        $VALUES = new FieldNamingPolicy[]{fieldNamingPolicy, fieldNamingPolicy2, fieldNamingPolicy3, fieldNamingPolicy4, fieldNamingPolicy5, fieldNamingPolicy6, fieldNamingPolicy7};
    }

    public static String b(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) $VALUES.clone();
    }
}
