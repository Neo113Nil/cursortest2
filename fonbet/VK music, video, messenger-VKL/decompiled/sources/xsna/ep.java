package xsna;

import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ep implements MyTracker.AttributionListener {
    public static PropertyReference1Impl a(int i, Class cls, String str, String str2, hpf0 hpf0Var) {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(cls, str, str2, i);
        hpf0Var.getClass();
        return propertyReference1Impl;
    }

    @Override // com.my.tracker.MyTracker.AttributionListener
    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Deferred deeplink: " + myTrackerAttribution.getDeeplink()});
        }
        uc00.d = myTrackerAttribution.getDeeplink();
        je5 je5Var = uc00.f;
        if (je5Var != null) {
            je5Var.invoke(myTrackerAttribution.getDeeplink());
        }
    }
}
