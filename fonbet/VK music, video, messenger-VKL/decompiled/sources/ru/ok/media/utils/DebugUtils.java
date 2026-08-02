package ru.ok.media.utils;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.task.g;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: DebugUtils.kt */
/* loaded from: classes9.dex */
public final class DebugUtils {
    public static final DebugUtils INSTANCE = new DebugUtils();

    private DebugUtils() {
    }

    public static final String channelsString(int i, boolean z) {
        if (i == 1) {
            return z ? InneractiveMediationDefs.GENDER_MALE : "mono";
        }
        if (i == 2) {
            return z ? UcumUtils.UCUM_SECONDS : "stereo";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }

    public static final String formatBitrate(long j, boolean z) {
        String str;
        StringBuilder sb;
        double d = j;
        if (j < 1000) {
            str = "";
        } else if (j < 1000000) {
            d /= 1000;
            str = CampaignEx.JSON_KEY_AD_K;
        } else if (j < 1000000000) {
            d /= 1000000;
            str = InneractiveMediationDefs.GENDER_MALE;
        } else {
            d /= 1000000000;
            str = g.e;
        }
        if (z) {
            sb = new StringBuilder();
            sb.append(d);
        } else {
            sb = new StringBuilder();
            sb.append(d);
            sb.append(" ");
        }
        sb.append(str);
        return sb.toString();
    }
}
