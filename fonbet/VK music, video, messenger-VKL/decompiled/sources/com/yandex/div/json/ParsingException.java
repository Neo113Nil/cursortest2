package com.yandex.div.json;

import com.yandex.div.internal.util.JsonNode;
import xsna.zcl;

/* compiled from: ParsingException.kt */
/* loaded from: classes7.dex */
public class ParsingException extends RuntimeException {
    private final String jsonSummary;
    private final ParsingExceptionReason reason;
    private final JsonNode source;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, JsonNode jsonNode, String str2, int i, zcl zclVar) {
        this(parsingExceptionReason, str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : jsonNode, (i & 16) != 0 ? null : str2);
    }

    public String getJsonSummary() {
        return this.jsonSummary;
    }

    public ParsingExceptionReason getReason() {
        return this.reason;
    }

    public JsonNode getSource() {
        return this.source;
    }

    public ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, JsonNode jsonNode, String str2) {
        super(str, th);
        this.reason = parsingExceptionReason;
        this.source = jsonNode;
        this.jsonSummary = str2;
    }
}
