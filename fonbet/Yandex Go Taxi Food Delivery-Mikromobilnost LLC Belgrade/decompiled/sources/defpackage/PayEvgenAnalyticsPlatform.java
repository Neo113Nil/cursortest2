package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LPayEvgenAnalyticsPlatform;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Android", "AndroidTv", "pay-sdk-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PayEvgenAnalyticsPlatform {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayEvgenAnalyticsPlatform[] $VALUES;
    public static final PayEvgenAnalyticsPlatform Android;
    public static final PayEvgenAnalyticsPlatform AndroidTv;
    private final String eventValue;

    static {
        PayEvgenAnalyticsPlatform payEvgenAnalyticsPlatform = new PayEvgenAnalyticsPlatform("Android", 0, ConstantDeviceInfo.APP_PLATFORM);
        Android = payEvgenAnalyticsPlatform;
        PayEvgenAnalyticsPlatform payEvgenAnalyticsPlatform2 = new PayEvgenAnalyticsPlatform("AndroidTv", 1, "android_tv");
        AndroidTv = payEvgenAnalyticsPlatform2;
        PayEvgenAnalyticsPlatform[] payEvgenAnalyticsPlatformArr = {payEvgenAnalyticsPlatform, payEvgenAnalyticsPlatform2};
        $VALUES = payEvgenAnalyticsPlatformArr;
        $ENTRIES = a.a(payEvgenAnalyticsPlatformArr);
    }

    public PayEvgenAnalyticsPlatform(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayEvgenAnalyticsPlatform valueOf(String str) {
        return (PayEvgenAnalyticsPlatform) Enum.valueOf(PayEvgenAnalyticsPlatform.class, str);
    }

    public static PayEvgenAnalyticsPlatform[] values() {
        return (PayEvgenAnalyticsPlatform[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
