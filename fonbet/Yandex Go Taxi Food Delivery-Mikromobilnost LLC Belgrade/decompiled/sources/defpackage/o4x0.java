package defpackage;

import com.yandex.plus.core.graphql.type.TRANSITION_LANGUAGE;

/* loaded from: classes2.dex */
public final class o4x0 {
    public static TRANSITION_LANGUAGE a(String str) {
        TRANSITION_LANGUAGE transition_language;
        TRANSITION_LANGUAGE[] values = TRANSITION_LANGUAGE.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                transition_language = null;
                break;
            }
            transition_language = values[i];
            if (jl40.l(transition_language.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return transition_language == null ? TRANSITION_LANGUAGE.UNKNOWN__ : transition_language;
    }
}
