package com.yandex.div.core.view2;

import com.yandex.div.core.font.DivTypefaceProvider;
import java.util.Map;

/* compiled from: DivTypefaceResolver.kt */
/* loaded from: classes7.dex */
public class DivTypefaceResolver {
    private final DivTypefaceProvider defaultTypeface;
    private final Map<String, DivTypefaceProvider> typefaceProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTypefaceResolver(Map<String, ? extends DivTypefaceProvider> map, DivTypefaceProvider divTypefaceProvider) {
        this.typefaceProviders = map;
        this.defaultTypeface = divTypefaceProvider;
    }

    public DivTypefaceProvider getTypefaceProvider(String str) {
        DivTypefaceProvider divTypefaceProvider;
        return (str == null || (divTypefaceProvider = this.typefaceProviders.get(str)) == null) ? this.defaultTypeface : divTypefaceProvider;
    }
}
