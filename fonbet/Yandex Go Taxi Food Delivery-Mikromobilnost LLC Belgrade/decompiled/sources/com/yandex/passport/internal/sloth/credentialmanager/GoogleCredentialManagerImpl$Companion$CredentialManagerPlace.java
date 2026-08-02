package com.yandex.passport.internal.sloth.credentialmanager;

import com.yandex.auth.LegacyAccountType;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/passport/internal/sloth/credentialmanager/GoogleCredentialManagerImpl$Companion$CredentialManagerPlace", "", "Lcom/yandex/passport/internal/sloth/credentialmanager/GoogleCredentialManagerImpl$Companion$CredentialManagerPlace;", "", "from", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "AutoLogin", "Native", "Login", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GoogleCredentialManagerImpl$Companion$CredentialManagerPlace {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GoogleCredentialManagerImpl$Companion$CredentialManagerPlace[] $VALUES;
    public static final GoogleCredentialManagerImpl$Companion$CredentialManagerPlace AutoLogin;
    public static final GoogleCredentialManagerImpl$Companion$CredentialManagerPlace Login;
    public static final GoogleCredentialManagerImpl$Companion$CredentialManagerPlace Native;
    private final String from;

    static {
        GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace = new GoogleCredentialManagerImpl$Companion$CredentialManagerPlace("AutoLogin", 0, "autologin");
        AutoLogin = googleCredentialManagerImpl$Companion$CredentialManagerPlace;
        GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace2 = new GoogleCredentialManagerImpl$Companion$CredentialManagerPlace("Native", 1, "native_login");
        Native = googleCredentialManagerImpl$Companion$CredentialManagerPlace2;
        GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace3 = new GoogleCredentialManagerImpl$Companion$CredentialManagerPlace("Login", 2, LegacyAccountType.STRING_LOGIN);
        Login = googleCredentialManagerImpl$Companion$CredentialManagerPlace3;
        GoogleCredentialManagerImpl$Companion$CredentialManagerPlace[] googleCredentialManagerImpl$Companion$CredentialManagerPlaceArr = {googleCredentialManagerImpl$Companion$CredentialManagerPlace, googleCredentialManagerImpl$Companion$CredentialManagerPlace2, googleCredentialManagerImpl$Companion$CredentialManagerPlace3};
        $VALUES = googleCredentialManagerImpl$Companion$CredentialManagerPlaceArr;
        $ENTRIES = kotlin.enums.a.a(googleCredentialManagerImpl$Companion$CredentialManagerPlaceArr);
    }

    public GoogleCredentialManagerImpl$Companion$CredentialManagerPlace(String str, int i, String str2) {
        this.from = str2;
    }

    public static GoogleCredentialManagerImpl$Companion$CredentialManagerPlace valueOf(String str) {
        return (GoogleCredentialManagerImpl$Companion$CredentialManagerPlace) Enum.valueOf(GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.class, str);
    }

    public static GoogleCredentialManagerImpl$Companion$CredentialManagerPlace[] values() {
        return (GoogleCredentialManagerImpl$Companion$CredentialManagerPlace[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getFrom() {
        return this.from;
    }
}
