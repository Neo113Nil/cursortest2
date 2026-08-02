package com.yandex.div.json.templates;

import com.yandex.div.json.JsonTemplate;
import java.util.Map;

/* compiled from: CachingTemplateProvider.kt */
/* loaded from: classes7.dex */
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {
    private final InMemoryTemplateProvider<T> cacheProvider;
    private TemplateProvider<? extends T> fallbackProvider;

    public CachingTemplateProvider(InMemoryTemplateProvider<T> inMemoryTemplateProvider, TemplateProvider<? extends T> templateProvider) {
        this.cacheProvider = inMemoryTemplateProvider;
        this.fallbackProvider = templateProvider;
    }

    public void putAll(Map<String, ? extends T> map) {
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            this.cacheProvider.put$div_data_release(entry.getKey(), entry.getValue());
        }
    }

    public void takeSnapshot(Map<String, T> map) {
        this.cacheProvider.takeSnapshot$div_data_release(map);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    public T get(String str) {
        T t = this.cacheProvider.get(str);
        if (t != null) {
            return t;
        }
        T t2 = this.fallbackProvider.get(str);
        if (t2 == null) {
            return null;
        }
        this.cacheProvider.put$div_data_release(str, t2);
        return t2;
    }
}
