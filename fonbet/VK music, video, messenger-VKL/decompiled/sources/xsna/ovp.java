package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.vibration.js.bridge.api.events.TapticImpactOccurred$Error;
import com.vk.superapp.vibration.js.bridge.api.events.TapticNotificationOccurred$Error;
import com.vk.superapp.vibration.js.bridge.api.events.TapticSelectionChanged$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class ovp {
    public final com.vk.superapp.base.js.bridge.b a;

    public ovp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppTapticImpactOccurred"), new TapticImpactOccurred$Error(null, new TapticImpactOccurred$Error.Data(TapticImpactOccurred$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }

    public final void b(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppTapticNotificationOccurred"), new TapticNotificationOccurred$Error(null, new TapticNotificationOccurred$Error.Data(TapticNotificationOccurred$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }

    public final void c(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppTapticSelectionChanged"), new TapticSelectionChanged$Error(null, new TapticSelectionChanged$Error.Data(TapticSelectionChanged$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }
}
