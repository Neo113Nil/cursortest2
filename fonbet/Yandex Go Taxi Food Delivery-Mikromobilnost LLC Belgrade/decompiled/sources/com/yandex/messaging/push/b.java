package com.yandex.messaging.push;

import android.os.SystemClock;
import android.util.Log;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.PushPriority;
import com.yandex.messaging.profile.d;
import defpackage.b1g0;
import defpackage.hjt;
import defpackage.l7c;
import defpackage.m5g0;
import defpackage.m7c;
import defpackage.tje;
import defpackage.uza;
import defpackage.vse;
import defpackage.y9i0;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class b {
    public final m7c a;
    public final b1g0 b;
    public final vse c;
    public final d d;
    public final Moshi e;

    public b(m7c m7cVar, b1g0 b1g0Var, vse vseVar, d dVar, Moshi moshi) {
        this.a = m7cVar;
        this.b = b1g0Var;
        this.c = vseVar;
        this.d = dVar;
        this.e = moshi;
    }

    public final boolean a(l7c l7cVar) {
        String string;
        m5g0 m5g0Var;
        CloudMessageHandler$DecryptedPushData cloudMessageHandler$DecryptedPushData;
        Map map = l7cVar.a;
        String str = (String) map.get("messenger");
        String str2 = (String) map.get("xiva");
        String str3 = (String) map.get("encrypted_data");
        PushPriority pushPriority = l7cVar.b;
        PushPriority pushPriority2 = l7cVar.c;
        boolean z = str == null && str3 != null;
        m7c m7cVar = this.a;
        m7cVar.getClass();
        if (str2 != null) {
            try {
                string = new JSONObject(str2).getString("transit_id");
            } catch (JSONException unused) {
                m5g0Var = null;
            }
        } else {
            string = null;
        }
        m5g0Var = new m5g0(string, SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
        m7cVar.a.reportEvent("cloud_message_received", kotlin.collections.b.i(new Pair("transit_id", m5g0Var != null ? m5g0Var.a : null), new Pair("has_xiva_data", Boolean.valueOf(m5g0Var != null)), new Pair("priority", Integer.valueOf(pushPriority.getValue())), new Pair("original_priority", Integer.valueOf(pushPriority2.getValue())), new Pair("encrypted", Boolean.valueOf(z)), new Pair("push_handling_strategy", m7cVar.a())));
        if (str == null && str3 != null) {
            try {
                Log.i("CloudMessageHandler", "Try to decrypt push message");
                String str4 = new String(this.b.a(str3), uza.a);
                Log.i("CloudMessageHandler", "Push successfully decrypted");
                cloudMessageHandler$DecryptedPushData = (CloudMessageHandler$DecryptedPushData) this.e.adapter(CloudMessageHandler$DecryptedPushData.class).fromJson(str4);
            } catch (Exception e) {
                m7cVar.c(e, "push_decryption_failed");
                cloudMessageHandler$DecryptedPushData = null;
            }
            str = cloudMessageHandler$DecryptedPushData != null ? cloudMessageHandler$DecryptedPushData.getMessenger() : null;
        }
        y9i0 y9i0Var = str == null ? null : new y9i0(str, str2, pushPriority, pushPriority2);
        if (y9i0Var == null) {
            return false;
        }
        this.c.getClass();
        tje.N(hjt.a, null, null, new CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1(this, y9i0Var, null), 3);
        return true;
    }
}
