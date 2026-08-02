package ru.ok.android.externcalls.sdk.ml.config.ns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.externcalls.sdk.ml.delegate.NSFeatureDelegate;
import ru.ok.android.webrtc.RTCLog;
import xsna.c5g;
import xsna.j5g;
import xsna.rl3;
import xsna.zcl;

/* compiled from: NSFeatureConfigProvider.kt */
/* loaded from: classes9.dex */
public final class NSFeatureConfigProvider extends MLFeatureConfigProviderBase {
    public static final Companion Companion = new Companion(null);

    /* compiled from: NSFeatureConfigProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Set<String> getFeatureKeys() {
            Set y0 = rl3.y0(new Integer[]{1, 2, 3});
            ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                arrayList.add(NSFeatureDelegate.Companion.getFeatureKeyByVersion(((Number) it.next()).intValue()));
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.format("android.mlfeatures.%s", Arrays.copyOf(new Object[]{(String) it2.next()}, 1)));
            }
            return j5g.S0(arrayList2);
        }

        private Companion() {
        }
    }

    public NSFeatureConfigProvider(RemoteSettings remoteSettings, int i, RTCLog rTCLog) {
        super(remoteSettings, rTCLog, String.format("android.mlfeatures.%s", Arrays.copyOf(new Object[]{NSFeatureDelegate.Companion.getFeatureKeyByVersion(i)}, 1)));
    }

    public static final Set<String> getFeatureKeys() {
        return Companion.getFeatureKeys();
    }
}
