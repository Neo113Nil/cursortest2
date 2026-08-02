package com.yandex.passport.internal.sso.announcing;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/sso/announcing/SsoAccountsSyncHelper$Source", "", "Lcom/yandex/passport/internal/sso/announcing/SsoAccountsSyncHelper$Source;", "RECEIVER", "BOOTSTRAP", "INSERT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SsoAccountsSyncHelper$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SsoAccountsSyncHelper$Source[] $VALUES;
    public static final SsoAccountsSyncHelper$Source BOOTSTRAP;
    public static final SsoAccountsSyncHelper$Source INSERT;
    public static final SsoAccountsSyncHelper$Source RECEIVER;

    static {
        SsoAccountsSyncHelper$Source ssoAccountsSyncHelper$Source = new SsoAccountsSyncHelper$Source("RECEIVER", 0);
        RECEIVER = ssoAccountsSyncHelper$Source;
        SsoAccountsSyncHelper$Source ssoAccountsSyncHelper$Source2 = new SsoAccountsSyncHelper$Source("BOOTSTRAP", 1);
        BOOTSTRAP = ssoAccountsSyncHelper$Source2;
        SsoAccountsSyncHelper$Source ssoAccountsSyncHelper$Source3 = new SsoAccountsSyncHelper$Source("INSERT", 2);
        INSERT = ssoAccountsSyncHelper$Source3;
        SsoAccountsSyncHelper$Source[] ssoAccountsSyncHelper$SourceArr = {ssoAccountsSyncHelper$Source, ssoAccountsSyncHelper$Source2, ssoAccountsSyncHelper$Source3};
        $VALUES = ssoAccountsSyncHelper$SourceArr;
        $ENTRIES = kotlin.enums.a.a(ssoAccountsSyncHelper$SourceArr);
    }

    public static SsoAccountsSyncHelper$Source valueOf(String str) {
        return (SsoAccountsSyncHelper$Source) Enum.valueOf(SsoAccountsSyncHelper$Source.class, str);
    }

    public static SsoAccountsSyncHelper$Source[] values() {
        return (SsoAccountsSyncHelper$Source[]) $VALUES.clone();
    }
}
