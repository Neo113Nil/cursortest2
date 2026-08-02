package xsna;

import java.util.Map;
import kotlin.Pair;

/* compiled from: SdkInfoAnalyticsEvent.kt */
/* loaded from: classes9.dex */
public final class pjh0 extends be {
    public final Object b;

    public pjh0(String str) {
        this.b = pn00.k(new Pair("sdkName", "ru.rustore.sdk:appupdate"), new Pair("sdkVersion", "6.1.1"), new Pair("sdkType", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // xsna.be
    public final Map<String, String> P() {
        return this.b;
    }

    @Override // xsna.be
    public final String Q() {
        return "sdkInfo";
    }
}
