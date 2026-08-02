package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingErrorLogger;

/* compiled from: TemplateParsingErrorLogger.kt */
/* loaded from: classes7.dex */
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {
    private final ParsingErrorLogger logger;
    private final String templateId;

    public TemplateParsingErrorLogger(ParsingErrorLogger parsingErrorLogger, String str) {
        this.logger = parsingErrorLogger;
        this.templateId = str;
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    public void logError(Exception exc) {
        this.logger.logTemplateError(exc, this.templateId);
    }
}
