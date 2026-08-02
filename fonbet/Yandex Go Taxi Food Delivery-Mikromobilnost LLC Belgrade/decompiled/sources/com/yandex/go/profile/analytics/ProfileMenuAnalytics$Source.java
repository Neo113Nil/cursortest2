package com.yandex.go.profile.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/profile/analytics/ProfileMenuAnalytics$Source", "", "Lcom/yandex/go/profile/analytics/ProfileMenuAnalytics$Source;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Cache", "Fallback", "Network", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProfileMenuAnalytics$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProfileMenuAnalytics$Source[] $VALUES;
    public static final ProfileMenuAnalytics$Source Cache;
    public static final ProfileMenuAnalytics$Source Fallback;
    public static final ProfileMenuAnalytics$Source Network;
    private final String eventValue;

    static {
        ProfileMenuAnalytics$Source profileMenuAnalytics$Source = new ProfileMenuAnalytics$Source("Cache", 0, "cache");
        Cache = profileMenuAnalytics$Source;
        ProfileMenuAnalytics$Source profileMenuAnalytics$Source2 = new ProfileMenuAnalytics$Source("Fallback", 1, "fallback");
        Fallback = profileMenuAnalytics$Source2;
        ProfileMenuAnalytics$Source profileMenuAnalytics$Source3 = new ProfileMenuAnalytics$Source("Network", 2, "network");
        Network = profileMenuAnalytics$Source3;
        ProfileMenuAnalytics$Source[] profileMenuAnalytics$SourceArr = {profileMenuAnalytics$Source, profileMenuAnalytics$Source2, profileMenuAnalytics$Source3};
        $VALUES = profileMenuAnalytics$SourceArr;
        $ENTRIES = a.a(profileMenuAnalytics$SourceArr);
    }

    public ProfileMenuAnalytics$Source(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ProfileMenuAnalytics$Source valueOf(String str) {
        return (ProfileMenuAnalytics$Source) Enum.valueOf(ProfileMenuAnalytics$Source.class, str);
    }

    public static ProfileMenuAnalytics$Source[] values() {
        return (ProfileMenuAnalytics$Source[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
