package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;

/* compiled from: JsonTemplateParser.kt */
/* loaded from: classes7.dex */
public final class JsonTemplateParserKt {
    public static final void suppressMissingValueOrThrow(ParsingException parsingException) {
        if (parsingException.getReason() != ParsingExceptionReason.MISSING_VALUE) {
            throw parsingException;
        }
    }
}
