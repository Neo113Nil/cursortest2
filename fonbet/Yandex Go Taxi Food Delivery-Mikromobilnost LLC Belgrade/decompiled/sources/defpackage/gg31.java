package defpackage;

import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;

/* loaded from: classes14.dex */
public final class gg31 {
    public static MobilityHubSourceType a(String str) {
        if (str == null) {
            return null;
        }
        if (!str.equals("hub") && str.equals("transport")) {
            return MobilityHubSourceType.TRANSPORT;
        }
        return MobilityHubSourceType.HUB;
    }
}
