package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/roundabout/items/SocialProvider;", "", "VKONTAKTE", "FACEBOOK", "TWITTER", "ODNOKLASSNIKI", "MAILRU", "GOOGLE", "ESIA", "TV1001", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialProvider {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SocialProvider[] $VALUES;
    public static final SocialProvider ESIA;
    public static final SocialProvider FACEBOOK;
    public static final SocialProvider GOOGLE;
    public static final SocialProvider MAILRU;
    public static final SocialProvider ODNOKLASSNIKI;
    public static final SocialProvider TV1001;
    public static final SocialProvider TWITTER;
    public static final SocialProvider VKONTAKTE;

    static {
        SocialProvider socialProvider = new SocialProvider("VKONTAKTE", 0);
        VKONTAKTE = socialProvider;
        SocialProvider socialProvider2 = new SocialProvider("FACEBOOK", 1);
        FACEBOOK = socialProvider2;
        SocialProvider socialProvider3 = new SocialProvider("TWITTER", 2);
        TWITTER = socialProvider3;
        SocialProvider socialProvider4 = new SocialProvider("ODNOKLASSNIKI", 3);
        ODNOKLASSNIKI = socialProvider4;
        SocialProvider socialProvider5 = new SocialProvider("MAILRU", 4);
        MAILRU = socialProvider5;
        SocialProvider socialProvider6 = new SocialProvider("GOOGLE", 5);
        GOOGLE = socialProvider6;
        SocialProvider socialProvider7 = new SocialProvider("ESIA", 6);
        ESIA = socialProvider7;
        SocialProvider socialProvider8 = new SocialProvider("TV1001", 7);
        TV1001 = socialProvider8;
        SocialProvider[] socialProviderArr = {socialProvider, socialProvider2, socialProvider3, socialProvider4, socialProvider5, socialProvider6, socialProvider7, socialProvider8};
        $VALUES = socialProviderArr;
        $ENTRIES = kotlin.enums.a.a(socialProviderArr);
    }

    public static SocialProvider valueOf(String str) {
        return (SocialProvider) Enum.valueOf(SocialProvider.class, str);
    }

    public static SocialProvider[] values() {
        return (SocialProvider[]) $VALUES.clone();
    }
}
