package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LPayUIEvgenAnalyticsPlatform;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Android", "AndroidTv", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PayUIEvgenAnalyticsPlatform {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenAnalyticsPlatform[] $VALUES;
    public static final PayUIEvgenAnalyticsPlatform Android;
    public static final PayUIEvgenAnalyticsPlatform AndroidTv;
    private final String eventValue;

    static {
        PayUIEvgenAnalyticsPlatform payUIEvgenAnalyticsPlatform = new PayUIEvgenAnalyticsPlatform("Android", 0, ConstantDeviceInfo.APP_PLATFORM);
        Android = payUIEvgenAnalyticsPlatform;
        PayUIEvgenAnalyticsPlatform payUIEvgenAnalyticsPlatform2 = new PayUIEvgenAnalyticsPlatform("AndroidTv", 1, "android_tv");
        AndroidTv = payUIEvgenAnalyticsPlatform2;
        PayUIEvgenAnalyticsPlatform[] payUIEvgenAnalyticsPlatformArr = {payUIEvgenAnalyticsPlatform, payUIEvgenAnalyticsPlatform2};
        $VALUES = payUIEvgenAnalyticsPlatformArr;
        $ENTRIES = a.a(payUIEvgenAnalyticsPlatformArr);
    }

    public PayUIEvgenAnalyticsPlatform(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenAnalyticsPlatform valueOf(String str) {
        return (PayUIEvgenAnalyticsPlatform) Enum.valueOf(PayUIEvgenAnalyticsPlatform.class, str);
    }

    public static PayUIEvgenAnalyticsPlatform[] values() {
        return (PayUIEvgenAnalyticsPlatform[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
