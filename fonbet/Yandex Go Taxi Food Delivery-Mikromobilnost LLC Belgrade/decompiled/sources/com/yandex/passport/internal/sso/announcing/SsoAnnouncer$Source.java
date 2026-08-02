package com.yandex.passport.internal.sso.announcing;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/passport/internal/sso/announcing/SsoAnnouncer$Source", "", "Lcom/yandex/passport/internal/sso/announcing/SsoAnnouncer$Source;", "BOOTSTRAP", "BACKUP", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SsoAnnouncer$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SsoAnnouncer$Source[] $VALUES;
    public static final SsoAnnouncer$Source BACKUP;
    public static final SsoAnnouncer$Source BOOTSTRAP;

    static {
        SsoAnnouncer$Source ssoAnnouncer$Source = new SsoAnnouncer$Source("BOOTSTRAP", 0);
        BOOTSTRAP = ssoAnnouncer$Source;
        SsoAnnouncer$Source ssoAnnouncer$Source2 = new SsoAnnouncer$Source("BACKUP", 1);
        BACKUP = ssoAnnouncer$Source2;
        SsoAnnouncer$Source[] ssoAnnouncer$SourceArr = {ssoAnnouncer$Source, ssoAnnouncer$Source2};
        $VALUES = ssoAnnouncer$SourceArr;
        $ENTRIES = kotlin.enums.a.a(ssoAnnouncer$SourceArr);
    }

    public static SsoAnnouncer$Source valueOf(String str) {
        return (SsoAnnouncer$Source) Enum.valueOf(SsoAnnouncer$Source.class, str);
    }

    public static SsoAnnouncer$Source[] values() {
        return (SsoAnnouncer$Source[]) $VALUES.clone();
    }
}
