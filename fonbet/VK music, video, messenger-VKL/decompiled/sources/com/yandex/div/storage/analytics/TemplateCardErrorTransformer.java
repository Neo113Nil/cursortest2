package com.yandex.div.storage.analytics;

import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import xsna.zcl;

/* compiled from: TemplateCardErrorTransformer.kt */
/* loaded from: classes7.dex */
public class TemplateCardErrorTransformer implements CardErrorTransformer {
    public static final Companion Companion = new Companion(null);
    private final ParsingErrorLogger internalLogger;
    private final TemplatesContainer templateContainer;

    /* compiled from: TemplateCardErrorTransformer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TemplateCardErrorTransformer(TemplatesContainer templatesContainer, ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.internalLogger = parsingErrorLogger;
    }
}
