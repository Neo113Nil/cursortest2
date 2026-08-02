package com.yandex.div.core.util.inputfilter;

import kotlin.text.Regex;

/* compiled from: RegexInputFilter.kt */
/* loaded from: classes7.dex */
public final class RegexInputFilter implements BaseInputFilter {
    private final Regex regex;

    public RegexInputFilter(String str) {
        this.regex = new Regex(str);
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(String str) {
        return this.regex.f(str);
    }
}
