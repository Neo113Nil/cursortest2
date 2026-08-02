package com.yandex.go.navigator.settings.language_settings;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/navigator/settings/language_settings/VoiceLanguage;", "", "en", "fr", "hy", "ka", "kk", "ro", ClearCryptoProPrefs.COUNTRY, "sr", "uz", "az", "es_la", "pt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VoiceLanguage {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VoiceLanguage[] $VALUES;
    public static final VoiceLanguage az;
    public static final VoiceLanguage en;
    public static final VoiceLanguage es_la;
    public static final VoiceLanguage fr;
    public static final VoiceLanguage hy;
    public static final VoiceLanguage ka;
    public static final VoiceLanguage kk;
    public static final VoiceLanguage pt;
    public static final VoiceLanguage ro;

    /* renamed from: ru, reason: collision with root package name */
    public static final VoiceLanguage f99ru;
    public static final VoiceLanguage sr;
    public static final VoiceLanguage uz;

    static {
        VoiceLanguage voiceLanguage = new VoiceLanguage("en", 0);
        en = voiceLanguage;
        VoiceLanguage voiceLanguage2 = new VoiceLanguage("fr", 1);
        fr = voiceLanguage2;
        VoiceLanguage voiceLanguage3 = new VoiceLanguage("hy", 2);
        hy = voiceLanguage3;
        VoiceLanguage voiceLanguage4 = new VoiceLanguage("ka", 3);
        ka = voiceLanguage4;
        VoiceLanguage voiceLanguage5 = new VoiceLanguage("kk", 4);
        kk = voiceLanguage5;
        VoiceLanguage voiceLanguage6 = new VoiceLanguage("ro", 5);
        ro = voiceLanguage6;
        VoiceLanguage voiceLanguage7 = new VoiceLanguage(ClearCryptoProPrefs.COUNTRY, 6);
        f99ru = voiceLanguage7;
        VoiceLanguage voiceLanguage8 = new VoiceLanguage("sr", 7);
        sr = voiceLanguage8;
        VoiceLanguage voiceLanguage9 = new VoiceLanguage("uz", 8);
        uz = voiceLanguage9;
        VoiceLanguage voiceLanguage10 = new VoiceLanguage("az", 9);
        az = voiceLanguage10;
        VoiceLanguage voiceLanguage11 = new VoiceLanguage("es_la", 10);
        es_la = voiceLanguage11;
        VoiceLanguage voiceLanguage12 = new VoiceLanguage("pt", 11);
        pt = voiceLanguage12;
        VoiceLanguage[] voiceLanguageArr = {voiceLanguage, voiceLanguage2, voiceLanguage3, voiceLanguage4, voiceLanguage5, voiceLanguage6, voiceLanguage7, voiceLanguage8, voiceLanguage9, voiceLanguage10, voiceLanguage11, voiceLanguage12};
        $VALUES = voiceLanguageArr;
        $ENTRIES = kotlin.enums.a.a(voiceLanguageArr);
    }

    public static VoiceLanguage valueOf(String str) {
        return (VoiceLanguage) Enum.valueOf(VoiceLanguage.class, str);
    }

    public static VoiceLanguage[] values() {
        return (VoiceLanguage[]) $VALUES.clone();
    }
}
