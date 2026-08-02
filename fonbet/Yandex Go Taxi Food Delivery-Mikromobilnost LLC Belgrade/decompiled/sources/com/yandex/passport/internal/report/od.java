package com.yandex.passport.internal.report;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public abstract class od {
    public static final void a(String str, IReporterYandex iReporterYandex) {
        String str2;
        RtmConfig.Builder withUserAgent = RtmConfig.newBuilder().withProjectName("passport-android").withEnvironment(RtmConfig.Environment.PRODUCTION).withUserAgent("device_id: ".concat(str));
        try {
            str2 = String.valueOf(Math.abs(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8))).order(ByteOrder.BIG_ENDIAN).getLong()));
        } catch (NoSuchAlgorithmException unused) {
            str2 = null;
        }
        iReporterYandex.updateRtmConfig(withUserAgent.withUserId(str2).build());
    }

    public static final IReporterYandex b(Context context) {
        AppMetricaYandex.activateReporter(context, ReporterYandexConfig.newBuilder("67bb016b-be40-4c08-a190-96a3f3b503d3").withRtmConfig(RtmConfig.newBuilder().withProjectName("passport-android").withEnvironment(RtmConfig.Environment.PRODUCTION).build()).build());
        return AppMetricaYandex.getReporter(context, "67bb016b-be40-4c08-a190-96a3f3b503d3");
    }
}
