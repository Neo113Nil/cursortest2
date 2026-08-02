package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import xsna.tu2;

/* compiled from: OAuthHttpUrlChainCall.kt */
/* loaded from: classes11.dex */
public final class bo70 extends ara<com.vk.superapp.core.api.models.a> {
    public static final long d = TimeUnit.SECONDS.toMillis(10);
    public final vx70 b;
    public final alv c;

    public bo70(l7r0 l7r0Var, vx70 vx70Var, alv alvVar) {
        super(l7r0Var);
        this.b = vx70Var;
        this.c = alvVar;
    }

    @Override // xsna.ara
    public final com.vk.superapp.core.api.models.a a(zqa zqaVar) {
        return c(zqaVar, System.currentTimeMillis());
    }

    public final com.vk.superapp.core.api.models.a c(zqa zqaVar, long j) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        alv alvVar = this.c;
        long j2 = alvVar.b;
        long j3 = d;
        if (j2 <= 0) {
            j2 = j3;
        }
        if (j2 + j < currentTimeMillis) {
            throw new IOException();
        }
        tu2.a a = uu2.a(this.b, alvVar, zqaVar);
        JSONObject b = a.b();
        if (b == null) {
            throw new VKApiException("Response returned null instead of valid string response");
        }
        String optString = b.optString("error", null);
        boolean has = b.has("processing");
        if (!epx.f(optString, "need_captcha")) {
            if (!has) {
                com.vk.superapp.core.api.models.a aVar = new com.vk.superapp.core.api.models.a(b);
                if (a.a().a("x-vkc-client-cookie") != null) {
                    aVar.h(new ArrayList<>(a.a().g("x-vkc-client-cookie")));
                }
                return aVar;
            }
            long optLong = b.optLong("timeout", 200L);
            long j4 = alvVar.b;
            if (j4 > 0) {
                j3 = j4;
            }
            SystemClock.sleep(Math.max(200L, Math.min(optLong, j3)));
            return c(zqaVar, j);
        }
        Bundle bundle = new Bundle();
        bundle.putString("captcha_sid", b.getString("captcha_sid"));
        bundle.putString("captcha_img", b.getString("captcha_img"));
        Integer x = f370.x(b, "captcha_attempt");
        if (x != null) {
            bundle.putInt("captcha_attempt", x.intValue());
        }
        Double t = f370.t(b, "captcha_ts");
        if (t != null) {
            bundle.putDouble("captcha_ts", t.doubleValue());
        }
        Double t2 = f370.t(b, "captcha_ratio");
        if (t2 != null) {
            bundle.putDouble("captcha_ratio", t2.doubleValue());
        }
        Boolean q = f370.q(b, "is_refresh_enabled");
        if (q != null) {
            bundle.putBoolean("is_refresh_enabled", q.booleanValue());
        }
        Integer x2 = f370.x(b, "captcha_height");
        if (x2 != null) {
            bundle.putInt("captcha_height", x2.intValue());
        }
        Integer x3 = f370.x(b, "captcha_width");
        if (x3 != null) {
            bundle.putInt("captcha_width", x3.intValue());
        }
        Boolean q2 = f370.q(b, "is_sound_captcha_available");
        if (q2 != null) {
            bundle.putBoolean("is_sound_captcha_available", q2.booleanValue());
        }
        String D = f370.D(b, "captcha_track");
        if (D != null) {
            bundle.putString("captcha_track", D);
        }
        String D2 = f370.D(b, "redirect_uri");
        if (D2 != null) {
            bundle.putString("redirect_uri", D2);
        }
        throw new VKApiExecutionException(14, alvVar.a, false, "need_captcha", bundle, null, null, null, 0, null, null, null, 4064);
    }
}
