package com.yandex.go.inapp_calls.api.navigation;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/inapp_calls/api/navigation/ResumeInAppCallSource;", "", "", "source", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "CALLS_ROUTER", "DEEPLINK", "go-client-android.features.inapp_calls:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResumeInAppCallSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResumeInAppCallSource[] $VALUES;
    public static final ResumeInAppCallSource CALLS_ROUTER;
    public static final ResumeInAppCallSource DEEPLINK;
    private final String source;

    static {
        ResumeInAppCallSource resumeInAppCallSource = new ResumeInAppCallSource("CALLS_ROUTER", 0, "calls_router");
        CALLS_ROUTER = resumeInAppCallSource;
        ResumeInAppCallSource resumeInAppCallSource2 = new ResumeInAppCallSource("DEEPLINK", 1, Constants.DEEPLINK);
        DEEPLINK = resumeInAppCallSource2;
        ResumeInAppCallSource[] resumeInAppCallSourceArr = {resumeInAppCallSource, resumeInAppCallSource2};
        $VALUES = resumeInAppCallSourceArr;
        $ENTRIES = a.a(resumeInAppCallSourceArr);
    }

    public ResumeInAppCallSource(String str, int i, String str2) {
        this.source = str2;
    }

    public static ResumeInAppCallSource valueOf(String str) {
        return (ResumeInAppCallSource) Enum.valueOf(ResumeInAppCallSource.class, str);
    }

    public static ResumeInAppCallSource[] values() {
        return (ResumeInAppCallSource[]) $VALUES.clone();
    }

    public final String a() {
        return this.source.toUpperCase(Locale.ROOT);
    }
}
