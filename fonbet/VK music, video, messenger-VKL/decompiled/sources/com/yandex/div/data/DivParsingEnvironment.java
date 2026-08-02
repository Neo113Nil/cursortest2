package com.yandex.div.data;

import com.vk.movika.sdk.base.model.n;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.nb;
import com.yandex.div2.q6;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: DivParsingEnvironment.kt */
/* loaded from: classes7.dex */
public class DivParsingEnvironment extends TemplateParsingEnvironment<nb> {
    private final TemplateParsingEnvironment.TemplateFactory<nb> templateFactory;
    private final CachingTemplateProvider<nb> templates;

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i, zcl zclVar) {
        this(parsingErrorLogger, (i & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.Companion.empty()) : cachingTemplateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nb templateFactory$lambda$0(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
        return ((q6) BuiltInParserKt.getBuiltInParserComponent().A9.getValue()).deserialize(parsingEnvironment, jSONObject);
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment
    public TemplateParsingEnvironment.TemplateFactory<nb> getTemplateFactory() {
        return this.templateFactory;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public CachingTemplateProvider<nb> getTemplates() {
        return this.templates;
    }

    public DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider<nb> cachingTemplateProvider) {
        super(parsingErrorLogger, cachingTemplateProvider);
        this.templates = cachingTemplateProvider;
        this.templateFactory = new n(9);
    }
}
