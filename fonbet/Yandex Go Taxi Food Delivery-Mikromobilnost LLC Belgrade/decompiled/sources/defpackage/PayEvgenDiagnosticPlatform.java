package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LPayEvgenDiagnosticPlatform;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Android", "AndroidTv", "pay-sdk-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PayEvgenDiagnosticPlatform {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayEvgenDiagnosticPlatform[] $VALUES;
    public static final PayEvgenDiagnosticPlatform Android;
    public static final PayEvgenDiagnosticPlatform AndroidTv;
    private final String eventValue;

    static {
        PayEvgenDiagnosticPlatform payEvgenDiagnosticPlatform = new PayEvgenDiagnosticPlatform("Android", 0, ConstantDeviceInfo.APP_PLATFORM);
        Android = payEvgenDiagnosticPlatform;
        PayEvgenDiagnosticPlatform payEvgenDiagnosticPlatform2 = new PayEvgenDiagnosticPlatform("AndroidTv", 1, "android_tv");
        AndroidTv = payEvgenDiagnosticPlatform2;
        PayEvgenDiagnosticPlatform[] payEvgenDiagnosticPlatformArr = {payEvgenDiagnosticPlatform, payEvgenDiagnosticPlatform2};
        $VALUES = payEvgenDiagnosticPlatformArr;
        $ENTRIES = a.a(payEvgenDiagnosticPlatformArr);
    }

    public PayEvgenDiagnosticPlatform(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayEvgenDiagnosticPlatform valueOf(String str) {
        return (PayEvgenDiagnosticPlatform) Enum.valueOf(PayEvgenDiagnosticPlatform.class, str);
    }

    public static PayEvgenDiagnosticPlatform[] values() {
        return (PayEvgenDiagnosticPlatform[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
