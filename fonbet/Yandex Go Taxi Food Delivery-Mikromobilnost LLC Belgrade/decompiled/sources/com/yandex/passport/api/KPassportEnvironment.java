package com.yandex.passport.api;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/passport/api/KPassportEnvironment;", "Lcom/yandex/passport/api/t0;", "", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "a", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "Companion", "com/yandex/passport/api/d", "PRODUCTION", "TEAM_PRODUCTION", "TESTING", "TEAM_TESTING", "RC", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KPassportEnvironment implements t0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ KPassportEnvironment[] $VALUES;
    public static final d Companion;
    public static final KPassportEnvironment PRODUCTION;
    public static final KPassportEnvironment RC;
    public static final KPassportEnvironment TEAM_PRODUCTION;
    public static final KPassportEnvironment TEAM_TESTING;
    public static final KPassportEnvironment TESTING;
    private final PassportEnvironmentImpl environment;

    static {
        KPassportEnvironment kPassportEnvironment = new KPassportEnvironment(PassportEnvironmentImpl.PRODUCTION, "PRODUCTION", 0);
        PRODUCTION = kPassportEnvironment;
        KPassportEnvironment kPassportEnvironment2 = new KPassportEnvironment(PassportEnvironmentImpl.TEAM_PRODUCTION, "TEAM_PRODUCTION", 1);
        TEAM_PRODUCTION = kPassportEnvironment2;
        KPassportEnvironment kPassportEnvironment3 = new KPassportEnvironment(PassportEnvironmentImpl.TESTING, "TESTING", 2);
        TESTING = kPassportEnvironment3;
        KPassportEnvironment kPassportEnvironment4 = new KPassportEnvironment(PassportEnvironmentImpl.TEAM_TESTING, "TEAM_TESTING", 3);
        TEAM_TESTING = kPassportEnvironment4;
        KPassportEnvironment kPassportEnvironment5 = new KPassportEnvironment(PassportEnvironmentImpl.RC, "RC", 4);
        RC = kPassportEnvironment5;
        KPassportEnvironment[] kPassportEnvironmentArr = {kPassportEnvironment, kPassportEnvironment2, kPassportEnvironment3, kPassportEnvironment4, kPassportEnvironment5};
        $VALUES = kPassportEnvironmentArr;
        $ENTRIES = kotlin.enums.a.a(kPassportEnvironmentArr);
        Companion = new d();
    }

    public KPassportEnvironment(PassportEnvironmentImpl passportEnvironmentImpl, String str, int i) {
        this.environment = passportEnvironmentImpl;
    }

    public static KPassportEnvironment valueOf(String str) {
        return (KPassportEnvironment) Enum.valueOf(KPassportEnvironment.class, str);
    }

    public static KPassportEnvironment[] values() {
        return (KPassportEnvironment[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    public final PassportEnvironmentImpl b() {
        return this.environment;
    }

    @Override // com.yandex.passport.api.t0
    public final int getInteger() {
        return this.environment.getInteger();
    }
}
