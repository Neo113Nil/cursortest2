package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.json.JSONObject;
import xsna.i5s;

/* loaded from: classes8.dex */
public class DefaultResponseParser {

    public static class Response {

        @NonNull
        public final String mStatus;

        public Response(@NonNull String str) {
            this.mStatus = str;
        }

        public String toString() {
            return i5s.a(new StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    @Nullable
    public Response parse(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return new Response(new JSONObject(new String(bArr, C.UTF8_NAME)).optString("status"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
