package com.yandex.quark.configuration;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/quark/configuration/Language;", "", "Russian", "Arabic", "Kazakh", "Turkish", "Uzbek", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Language {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Language[] $VALUES;
    public static final Language Arabic;
    public static final Language Kazakh;
    public static final Language Russian;
    public static final Language Turkish;
    public static final Language Uzbek;

    static {
        Language language = new Language("Russian", 0);
        Russian = language;
        Language language2 = new Language("Arabic", 1);
        Arabic = language2;
        Language language3 = new Language("Kazakh", 2);
        Kazakh = language3;
        Language language4 = new Language("Turkish", 3);
        Turkish = language4;
        Language language5 = new Language("Uzbek", 4);
        Uzbek = language5;
        Language[] languageArr = {language, language2, language3, language4, language5};
        $VALUES = languageArr;
        $ENTRIES = a.a(languageArr);
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) $VALUES.clone();
    }
}
