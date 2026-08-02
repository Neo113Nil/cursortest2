package com.yandex.xplat.xflags;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/xplat/xflags/LanguageKind;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "En", "Ru", "Uk", "Tr", "Be", "Uz", "Other", "xplat-xflags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LanguageKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LanguageKind[] $VALUES;
    public static final LanguageKind Be;
    public static final LanguageKind En;
    public static final LanguageKind Other;
    public static final LanguageKind Ru;
    public static final LanguageKind Tr;
    public static final LanguageKind Uk;
    public static final LanguageKind Uz;
    private final String value;

    static {
        LanguageKind languageKind = new LanguageKind("En", 0, "en");
        En = languageKind;
        LanguageKind languageKind2 = new LanguageKind("Ru", 1, ClearCryptoProPrefs.COUNTRY);
        Ru = languageKind2;
        LanguageKind languageKind3 = new LanguageKind("Uk", 2, "uk");
        Uk = languageKind3;
        LanguageKind languageKind4 = new LanguageKind("Tr", 3, "tr");
        Tr = languageKind4;
        LanguageKind languageKind5 = new LanguageKind("Be", 4, "be");
        Be = languageKind5;
        LanguageKind languageKind6 = new LanguageKind("Uz", 5, "uz");
        Uz = languageKind6;
        LanguageKind languageKind7 = new LanguageKind("Other", 6, "other");
        Other = languageKind7;
        LanguageKind[] languageKindArr = {languageKind, languageKind2, languageKind3, languageKind4, languageKind5, languageKind6, languageKind7};
        $VALUES = languageKindArr;
        $ENTRIES = kotlin.enums.a.a(languageKindArr);
    }

    public LanguageKind(String str, int i, String str2) {
        this.value = str2;
    }

    public static LanguageKind valueOf(String str) {
        return (LanguageKind) Enum.valueOf(LanguageKind.class, str);
    }

    public static LanguageKind[] values() {
        return (LanguageKind[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
