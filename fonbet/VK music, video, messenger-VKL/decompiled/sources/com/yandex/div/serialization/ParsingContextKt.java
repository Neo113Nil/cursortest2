package com.yandex.div.serialization;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ParsingContext.kt */
/* loaded from: classes7.dex */
public final class ParsingContextKt {
    public static final ParsingContext collectingErrors(ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? parsingContext : new ErrorCollectingParsingContext(parsingContext);
    }

    public static final List<Exception> getCollectedErrors(ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? ((ErrorCollectingParsingContext) parsingContext).getErrors() : parsingContext instanceof ParsingContextWrapper ? getCollectedErrors(((ParsingContextWrapper) parsingContext).getBaseContext()) : EmptyList.b;
    }

    public static final ParsingContext restrictPropertyOverride(ParsingContext parsingContext) {
        return parsingContext instanceof OverrideRestrictingParsingContext ? parsingContext : new OverrideRestrictingParsingContext(parsingContext);
    }
}
