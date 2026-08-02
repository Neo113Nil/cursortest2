package xsna;

import android.webkit.JavascriptInterface;
import com.ironsource.X3;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: JsWebAudioBridge.kt */
/* loaded from: classes6.dex */
public interface c8y {
    @JavascriptInterface
    default void VKWebAppAudioGetStatus(String str) {
        com.vk.webapp.bridges.features.audio.b d = d();
        onx onxVar = d.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.AUDIO_GET_STATUS;
        if (onxVar.u(jsApiMethodType, str)) {
            if (!d.d()) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            Integer c = d.c();
            if (c != null) {
                bex0.a.b(onxVar, jsApiMethodType, com.vk.webapp.bridges.features.audio.b.b(c.intValue()), null, 12);
            } else {
                bex0.a.a(onxVar, JsApiMethodType.AUDIO_RESUME, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
            }
        }
    }

    @JavascriptInterface
    default void VKWebAppAudioPause(String str) {
        com.vk.webapp.bridges.features.audio.b d = d();
        onx onxVar = d.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.AUDIO_PAUSE;
        if (onxVar.u(jsApiMethodType, str)) {
            if (!d.d()) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            Integer c = d.c();
            if (c == null) {
                bex0.a.a(onxVar, JsApiMethodType.AUDIO_RESUME, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            if (!com.vk.webapp.bridges.features.audio.a.a(c.intValue())) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            u2b0 u2b0Var = com.vk.webapp.bridges.features.audio.a.c;
            if (u2b0Var.m0() == PlayState.PLAYING) {
                u2b0Var.pause(6);
            }
            bex0.a.b(onxVar, jsApiMethodType, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
        }
    }

    @JavascriptInterface
    default void VKWebAppAudioPlay(String str) {
        com.vk.webapp.bridges.features.audio.b d = d();
        onx onxVar = d.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.AUDIO_PLAY;
        if (onxVar.u(jsApiMethodType, str)) {
            if (!d.d()) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
            } else {
                if (str == null) {
                    bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    return;
                }
                try {
                    d.e(new JSONObject(str));
                } catch (Exception unused) {
                    bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                }
            }
        }
    }

    @JavascriptInterface
    default void VKWebAppAudioSetPosition(String str) {
        com.vk.webapp.bridges.features.audio.b d = d();
        onx onxVar = d.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.AUDIO_SET_POSITION;
        if (onxVar.u(jsApiMethodType, str)) {
            if (!d.d()) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            Integer c = d.c();
            if (c == null) {
                bex0.a.a(onxVar, JsApiMethodType.AUDIO_RESUME, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            int intValue = c.intValue();
            if (str == null) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                return;
            }
            try {
                int millis = (int) TimeUnit.SECONDS.toMillis(new JSONObject(str).getLong(X3.i.L));
                if (!com.vk.webapp.bridges.features.audio.a.a(intValue)) {
                    bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                } else {
                    com.vk.webapp.bridges.features.audio.a.c.G0(millis, new PlaybackActionMeta(17, 0L, 2, null));
                    bex0.a.b(onxVar, jsApiMethodType, new JSONObject().put("result", true), null, 12);
                }
            } catch (Exception unused) {
                bex0.a.a(onxVar, JsApiMethodType.AUDIO_SET_POSITION, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
            }
        }
    }

    @JavascriptInterface
    default void VKWebAppAudioStop(String str) {
        com.vk.webapp.bridges.features.audio.b d = d();
        onx onxVar = d.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.AUDIO_STOP;
        if (onxVar.u(jsApiMethodType, str)) {
            if (!d.d()) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            Integer c = d.c();
            if (c == null) {
                bex0.a.a(onxVar, JsApiMethodType.AUDIO_RESUME, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            if (!com.vk.webapp.bridges.features.audio.a.a(c.intValue())) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            com.vk.webapp.bridges.features.audio.a.e = null;
            u2b0 u2b0Var = com.vk.webapp.bridges.features.audio.a.c;
            PlayState m0 = u2b0Var.m0();
            if (m0 != PlayState.STOPPED && m0 != PlayState.IDLE) {
                u2b0Var.stop(26);
            }
            bex0.a.b(onxVar, jsApiMethodType, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
        }
    }

    @JavascriptInterface
    default void VKWebAppAudioUnpause(String str) {
        com.vk.webapp.bridges.features.audio.b d = d();
        onx onxVar = d.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.AUDIO_RESUME;
        if (onxVar.u(jsApiMethodType, str)) {
            if (!d.d()) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            Integer c = d.c();
            if (c == null) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            if (!com.vk.webapp.bridges.features.audio.a.a(c.intValue())) {
                bex0.a.a(onxVar, jsApiMethodType, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return;
            }
            u2b0 u2b0Var = com.vk.webapp.bridges.features.audio.a.c;
            if (u2b0Var.m0() == PlayState.PAUSED) {
                u2b0Var.f(new PlaybackActionMeta(6, 0L, 2, null));
            }
            bex0.a.b(onxVar, jsApiMethodType, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
        }
    }

    com.vk.webapp.bridges.features.audio.b d();
}
