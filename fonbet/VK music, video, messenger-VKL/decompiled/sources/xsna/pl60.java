package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.HashSet;
import ru.ok.android.commons.http.Http;

/* compiled from: NewsfeedHolderUiDtoOffsetCalculator.kt */
/* loaded from: classes4.dex */
public final class pl60 {
    public static final HashMap<Integer, Integer> c = new HashMap<>();
    public static final HashSet d = izi0.d(78, Integer.valueOf(PsExtractor.AUDIO_STREAM), 194, 193, 238, 50, 52, 53, 11, 110, 111, 302, 331, 181, 329, 330, 350, 2, 37, 178, 372, 5, Integer.valueOf(PsExtractor.PRIVATE_STREAM_1), 51, 59, 353, Integer.valueOf(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE), Integer.valueOf(Http.StatusCode.SEE_OTHER), 41, 70, 96, 45, 46, 148, 81, 42, 97, 7, 48, 40, 1, 73, 341, Integer.valueOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), 297, 343, 348, 365, 60, 65, 203, 204, 205, 352, 206, 207, Integer.valueOf(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE), 258, 257, Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE), Integer.valueOf(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE), 344, 345, 293, Integer.valueOf(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE), 211, 75, 187);
    public static final int e = cn70.b(6);
    public static final int f = cn70.b(4);
    public static final int g = cn70.b(12);
    public static final int h = cn70.b(12);
    public static final int i = cn70.b(12);
    public static final int j = cn70.b(6);
    public static final int k = cn70.b(8);
    public final boolean a;
    public final qen b = new qen();

    public pl60(boolean z) {
        this.a = z;
    }

    public static boolean a(int i2) {
        if (i2 == 238 || i2 == 297 || i2 == 343 || i2 == 348 || i2 == 365) {
            return true;
        }
        switch (i2) {
            case PsExtractor.AUDIO_STREAM /* 192 */:
            case 193:
            case 194:
                return true;
            default:
                return false;
        }
    }

    public static boolean b(int i2) {
        return i2 == 342 || i2 == 346 || i2 == 357;
    }

    public static int c(int i2) {
        if (lbs.y(i2)) {
            return cn70.b(-5);
        }
        if (lbs.v(i2)) {
            return (int) dq.a(-2.5f, 0.5f);
        }
        if (lbs.s(i2)) {
            return (int) dq.a(-2.5f, 0.5f);
        }
        if (lbs.z(i2)) {
            return cn70.b(-2);
        }
        if (lbs.w(i2)) {
            return (int) dq.a(-2.5f, 0.5f);
        }
        if (lbs.x(i2)) {
            return cn70.b(-10);
        }
        if (a(i2)) {
            return cn70.b(-2);
        }
        if (lbs.A(i2)) {
            return cn70.b(-2);
        }
        if (lbs.u(i2)) {
            return cn70.b(-2);
        }
        if (i2 != 7) {
            if (i2 == 18) {
                return cn70.b(-10);
            }
            if (i2 == 40) {
                return cn70.b(-4);
            }
            if (i2 != 48) {
                if (i2 == 78) {
                    return cn70.b(-1);
                }
                if (i2 != 97) {
                    if (i2 == 124 || i2 == 187) {
                        return cn70.b(-6);
                    }
                    if (i2 != 231) {
                        return 0;
                    }
                    return cn70.b(-2);
                }
            }
        }
        return cn70.b(-2);
    }

    public final int d(int i2) {
        if (lbs.y(i2)) {
            return -((int) dq.a(2.5f, 0.5f));
        }
        this.b.getClass();
        if (qen.d(i2)) {
            return cn70.b(-8);
        }
        return 0;
    }
}
