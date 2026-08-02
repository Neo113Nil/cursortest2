package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import com.ironsource.O6;

/* loaded from: classes9.dex */
final class JsonTokens {
    private JsonTokens() {
    }

    @NonNull
    public static String toString(int i) {
        switch (i) {
            case 0:
                return O6.x1;
            case 34:
                return "string";
            case 39:
                return "name";
            case 44:
                return "`,`";
            case 49:
                return "number";
            case 58:
                return "`:`";
            case JsonToken.BEGIN_ARRAY /* 91 */:
                return "`[`";
            case JsonToken.END_ARRAY /* 93 */:
                return "`]`";
            case JsonToken.BOOLEAN /* 98 */:
                return "boolean";
            case 110:
                return "null";
            case 123:
                return "`{`";
            case 125:
                return "`}`";
            default:
                throw new AssertionError();
        }
    }

    @NonNull
    public static String toString(int... iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(toString(i));
        }
        return sb.toString();
    }
}
