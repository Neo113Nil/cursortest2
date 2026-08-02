package com.yandex.div.internal.parser;

import java.util.regex.Pattern;

/* compiled from: ParsingValidators.kt */
/* loaded from: classes7.dex */
public final class ParsingValidatorsKt {
    public static final boolean doesMatch(String str, String str2) {
        return Pattern.matches(str2, str);
    }
}
