package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;

/* compiled from: ParsingContext.kt */
/* loaded from: classes7.dex */
public interface ParsingContext {
    default boolean getAllowPropertyOverride() {
        return true;
    }

    ParsingErrorLogger getLogger();

    TemplateProvider<EntityTemplate<?>> getTemplates();
}
