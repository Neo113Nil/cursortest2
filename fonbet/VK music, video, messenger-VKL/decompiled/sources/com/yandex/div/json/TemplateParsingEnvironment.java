package com.yandex.div.json;

import com.vk.movika.sdk.base.model.n;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.nb;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: TemplateParsingEnvironment.kt */
/* loaded from: classes7.dex */
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {
    private final ParsingErrorLogger logger;
    private final CachingTemplateProvider<T> mainTemplateProvider;
    private final TemplateProvider<T> templates;

    /* compiled from: TemplateParsingEnvironment.kt */
    public interface TemplateFactory<T> {
    }

    /* compiled from: TemplateParsingEnvironment.kt */
    public static final class TemplateParsingResult<T> {
        private final Map<String, T> parsedTemplates;
        private final Map<String, Set<String>> templateDependencies;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateParsingResult(Map<String, ? extends T> map, Map<String, ? extends Set<String>> map2) {
            this.parsedTemplates = map;
            this.templateDependencies = map2;
        }

        public final Map<String, T> getParsedTemplates() {
            return this.parsedTemplates;
        }
    }

    public TemplateParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider<T> cachingTemplateProvider) {
        this.logger = parsingErrorLogger;
        this.mainTemplateProvider = cachingTemplateProvider;
        this.templates = cachingTemplateProvider;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    public abstract TemplateFactory<T> getTemplateFactory();

    public final void parseTemplates(JSONObject jSONObject) {
        this.mainTemplateProvider.putAll(parseTemplatesWithResult(jSONObject));
    }

    public final Map<String, T> parseTemplatesWithResult(JSONObject jSONObject) {
        return parseTemplatesWithResultAndDependencies(jSONObject).getParsedTemplates();
    }

    public final TemplateParsingResult<T> parseTemplatesWithResultAndDependencies(JSONObject jSONObject) {
        nb templateFactory$lambda$0;
        Map<String, T> arrayMap = CollectionsKt.arrayMap();
        Map arrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> sort = JsonTopologicalSorting.INSTANCE.sort(this, jSONObject);
            this.mainTemplateProvider.takeSnapshot(arrayMap);
            TemplateProvider wrap = TemplateProvider.Companion.wrap(arrayMap);
            for (Map.Entry<String, Set<String>> entry : sort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    ParsingEnvironmentImpl parsingEnvironmentImpl = new ParsingEnvironmentImpl(wrap, new TemplateParsingErrorLogger(getLogger(), key));
                    TemplateFactory<T> templateFactory = getTemplateFactory();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    ((n) templateFactory).getClass();
                    templateFactory$lambda$0 = DivParsingEnvironment.templateFactory$lambda$0(parsingEnvironmentImpl, true, jSONObject2);
                    arrayMap.put(key, templateFactory$lambda$0);
                    if (!value.isEmpty()) {
                        arrayMap2.put(key, value);
                    }
                } catch (ParsingException e) {
                    getLogger().logTemplateError(e, key);
                }
            }
        } catch (Exception e2) {
            getLogger().logError(e2);
        }
        return new TemplateParsingResult<>(arrayMap, arrayMap2);
    }
}
