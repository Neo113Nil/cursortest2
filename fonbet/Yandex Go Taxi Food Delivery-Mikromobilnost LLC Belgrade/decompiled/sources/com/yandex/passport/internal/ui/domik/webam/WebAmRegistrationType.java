package com.yandex.passport.internal.ui.domik.webam;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/webam/WebAmRegistrationType;", "", "", "value", "Ljava/lang/String;", "Portal", "Neophonish", "Doregish", "Nothing", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebAmRegistrationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebAmRegistrationType[] $VALUES;
    public static final WebAmRegistrationType Doregish;
    public static final WebAmRegistrationType Neophonish;
    public static final WebAmRegistrationType Nothing;
    public static final WebAmRegistrationType Portal;
    private final String value;

    static {
        WebAmRegistrationType webAmRegistrationType = new WebAmRegistrationType("Portal", 0, "portal");
        Portal = webAmRegistrationType;
        WebAmRegistrationType webAmRegistrationType2 = new WebAmRegistrationType("Neophonish", 1, "neophonish");
        Neophonish = webAmRegistrationType2;
        WebAmRegistrationType webAmRegistrationType3 = new WebAmRegistrationType("Doregish", 2, "doregish");
        Doregish = webAmRegistrationType3;
        WebAmRegistrationType webAmRegistrationType4 = new WebAmRegistrationType("Nothing", 3, "nothing");
        Nothing = webAmRegistrationType4;
        WebAmRegistrationType[] webAmRegistrationTypeArr = {webAmRegistrationType, webAmRegistrationType2, webAmRegistrationType3, webAmRegistrationType4};
        $VALUES = webAmRegistrationTypeArr;
        $ENTRIES = a.a(webAmRegistrationTypeArr);
    }

    public WebAmRegistrationType(String str, int i, String str2) {
        this.value = str2;
    }

    public static WebAmRegistrationType valueOf(String str) {
        return (WebAmRegistrationType) Enum.valueOf(WebAmRegistrationType.class, str);
    }

    public static WebAmRegistrationType[] values() {
        return (WebAmRegistrationType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
