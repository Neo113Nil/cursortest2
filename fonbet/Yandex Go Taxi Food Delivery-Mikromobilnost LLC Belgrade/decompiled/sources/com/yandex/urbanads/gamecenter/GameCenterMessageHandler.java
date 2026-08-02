package com.yandex.urbanads.gamecenter;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.webkit.JavascriptInterface;
import androidx.lifecycle.p;
import defpackage.a82;
import defpackage.qke;
import defpackage.rk31;
import defpackage.rss;
import defpackage.tje;

/* loaded from: classes2.dex */
public final class GameCenterMessageHandler {
    public final Context a;
    public final p b;
    public final rss c;
    public final rss d;

    public GameCenterMessageHandler(Context context, p pVar, rss rssVar, rss rssVar2) {
        this.a = context;
        this.b = pVar;
        this.c = rssVar;
        this.d = rssVar2;
    }

    public static final void a(GameCenterMessageHandler gameCenterMessageHandler, GameCenterHapticType gameCenterHapticType) {
        Context context = gameCenterMessageHandler.a;
        if (qke.h(context, "android.permission.VIBRATE") == 0) {
            Vibrator vibrator = null;
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = context.getSystemService("vibrator_manager");
                VibratorManager h = rk31.n(systemService) ? a82.h(systemService) : null;
                if (h != null) {
                    vibrator = h.getDefaultVibrator();
                }
            } else {
                Object systemService2 = context.getSystemService("vibrator");
                if (systemService2 instanceof Vibrator) {
                    vibrator = (Vibrator) systemService2;
                }
            }
            if (vibrator == null) {
                return;
            }
            vibrator.vibrate(VibrationEffect.createOneShot(gameCenterHapticType.getDurationMs(), gameCenterHapticType.getAmplitude()));
        }
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        tje.N(this.b, null, null, new GameCenterMessageHandler$postMessage$1(str, this, null), 3);
    }
}
