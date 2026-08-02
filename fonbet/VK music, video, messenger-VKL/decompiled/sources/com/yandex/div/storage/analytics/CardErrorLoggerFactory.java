package com.yandex.div.storage.analytics;

import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import com.yandex.div.storage.util.LazyProvider;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: CardErrorLoggerFactory.kt */
/* loaded from: classes7.dex */
public class CardErrorLoggerFactory {
    private final e9e0<CardErrorTransformer> errorTransformer;
    private final ParsingErrorLogger parsingErrorLogger;
    private final TemplatesContainer templateContainer;

    public CardErrorLoggerFactory(final e9e0<? extends CardErrorTransformer> e9e0Var, TemplatesContainer templatesContainer, ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.parsingErrorLogger = parsingErrorLogger;
        this.errorTransformer = new LazyProvider(new gzs<CardErrorTransformer>() { // from class: com.yandex.div.storage.analytics.CardErrorLoggerFactory$errorTransformer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final CardErrorTransformer invoke() {
                TemplatesContainer templatesContainer2;
                ParsingErrorLogger parsingErrorLogger2;
                TemplatesContainer templatesContainer3;
                ParsingErrorLogger parsingErrorLogger3;
                e9e0<? extends CardErrorTransformer> e9e0Var2 = e9e0Var;
                if (e9e0Var2 == null) {
                    templatesContainer3 = this.templateContainer;
                    parsingErrorLogger3 = this.parsingErrorLogger;
                    return new TemplateCardErrorTransformer(templatesContainer3, parsingErrorLogger3);
                }
                templatesContainer2 = this.templateContainer;
                parsingErrorLogger2 = this.parsingErrorLogger;
                return new CardErrorTransformer.Composite(e9e0Var2.get(), new TemplateCardErrorTransformer(templatesContainer2, parsingErrorLogger2));
            }
        });
    }
}
