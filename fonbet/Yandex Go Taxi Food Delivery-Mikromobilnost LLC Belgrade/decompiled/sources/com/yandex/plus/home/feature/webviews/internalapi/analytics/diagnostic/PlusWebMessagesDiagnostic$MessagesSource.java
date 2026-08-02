package com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/diagnostic/PlusWebMessagesDiagnostic$MessagesSource", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/diagnostic/PlusWebMessagesDiagnostic$MessagesSource;", "HOME", "STORIES", "SMART", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusWebMessagesDiagnostic$MessagesSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusWebMessagesDiagnostic$MessagesSource[] $VALUES;
    public static final PlusWebMessagesDiagnostic$MessagesSource HOME;
    public static final PlusWebMessagesDiagnostic$MessagesSource SMART;
    public static final PlusWebMessagesDiagnostic$MessagesSource STORIES;

    static {
        PlusWebMessagesDiagnostic$MessagesSource plusWebMessagesDiagnostic$MessagesSource = new PlusWebMessagesDiagnostic$MessagesSource("HOME", 0);
        HOME = plusWebMessagesDiagnostic$MessagesSource;
        PlusWebMessagesDiagnostic$MessagesSource plusWebMessagesDiagnostic$MessagesSource2 = new PlusWebMessagesDiagnostic$MessagesSource("STORIES", 1);
        STORIES = plusWebMessagesDiagnostic$MessagesSource2;
        PlusWebMessagesDiagnostic$MessagesSource plusWebMessagesDiagnostic$MessagesSource3 = new PlusWebMessagesDiagnostic$MessagesSource("SMART", 2);
        SMART = plusWebMessagesDiagnostic$MessagesSource3;
        PlusWebMessagesDiagnostic$MessagesSource[] plusWebMessagesDiagnostic$MessagesSourceArr = {plusWebMessagesDiagnostic$MessagesSource, plusWebMessagesDiagnostic$MessagesSource2, plusWebMessagesDiagnostic$MessagesSource3};
        $VALUES = plusWebMessagesDiagnostic$MessagesSourceArr;
        $ENTRIES = a.a(plusWebMessagesDiagnostic$MessagesSourceArr);
    }

    public static PlusWebMessagesDiagnostic$MessagesSource valueOf(String str) {
        return (PlusWebMessagesDiagnostic$MessagesSource) Enum.valueOf(PlusWebMessagesDiagnostic$MessagesSource.class, str);
    }

    public static PlusWebMessagesDiagnostic$MessagesSource[] values() {
        return (PlusWebMessagesDiagnostic$MessagesSource[]) $VALUES.clone();
    }
}
