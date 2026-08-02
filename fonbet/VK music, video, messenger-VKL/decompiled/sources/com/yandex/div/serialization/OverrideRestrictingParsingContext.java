package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;

/* compiled from: ParsingContext.kt */
/* loaded from: classes7.dex */
final class OverrideRestrictingParsingContext implements ParsingContext, ParsingContextWrapper {
    private final ParsingContext baseContext;

    public OverrideRestrictingParsingContext(ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return false;
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public ParsingErrorLogger getLogger() {
        return this.baseContext.getLogger();
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }
}
