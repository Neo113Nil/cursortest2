package com.yandex.messaging.auth;

import defpackage.k4o;
import defpackage.qi3;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/auth/AuthEnvironment;", "", "", "integer", CA20Status.STATUS_USER_I, "a", "()I", "", "isTeam", "Z", "()Z", "Companion", "qi3", "Production", "TeamProduction", "Testing", "TeamTesting", "Rc", "messaging-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AuthEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuthEnvironment[] $VALUES;
    public static final qi3 Companion;
    public static final AuthEnvironment Production;
    public static final AuthEnvironment Rc;
    public static final AuthEnvironment TeamProduction;
    public static final AuthEnvironment TeamTesting;
    public static final AuthEnvironment Testing;
    private final int integer;
    private final boolean isTeam;

    static {
        AuthEnvironment authEnvironment = new AuthEnvironment("Production", 0, 1, false);
        Production = authEnvironment;
        AuthEnvironment authEnvironment2 = new AuthEnvironment("TeamProduction", 1, 2, true);
        TeamProduction = authEnvironment2;
        AuthEnvironment authEnvironment3 = new AuthEnvironment("Testing", 2, 3, false);
        Testing = authEnvironment3;
        AuthEnvironment authEnvironment4 = new AuthEnvironment("TeamTesting", 3, 4, true);
        TeamTesting = authEnvironment4;
        AuthEnvironment authEnvironment5 = new AuthEnvironment("Rc", 4, 5, false);
        Rc = authEnvironment5;
        AuthEnvironment[] authEnvironmentArr = {authEnvironment, authEnvironment2, authEnvironment3, authEnvironment4, authEnvironment5};
        $VALUES = authEnvironmentArr;
        $ENTRIES = a.a(authEnvironmentArr);
        Companion = new qi3();
    }

    public AuthEnvironment(String str, int i, int i2, boolean z) {
        this.integer = i2;
        this.isTeam = z;
    }

    public static AuthEnvironment valueOf(String str) {
        return (AuthEnvironment) Enum.valueOf(AuthEnvironment.class, str);
    }

    public static AuthEnvironment[] values() {
        return (AuthEnvironment[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getInteger() {
        return this.integer;
    }
}
