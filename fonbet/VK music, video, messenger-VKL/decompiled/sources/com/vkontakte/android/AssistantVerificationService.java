package com.vkontakte.android;

import android.app.NotificationChannel;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.vk.log.L;
import xsna.arm0;
import xsna.ocw;
import xsna.q7s;
import xsna.x870;
import xsna.zr;

/* compiled from: AssistantVerificationService.kt */
/* loaded from: classes7.dex */
public final class AssistantVerificationService extends SearchActionVerificationClientService {
    public final q7s h = new q7s();

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public final void c(Intent intent, boolean z) {
        String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
        Long n = stringExtra != null ? arm0.n(stringExtra) : null;
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        L.e("GoogleAssistant", "received SEND_MESSAGE_TO_CONTACTS intent isVerified: " + z + " with contact id: " + n + ", text: " + stringExtra2);
        if (z) {
            if (n == null || stringExtra2 == null) {
                throw new IllegalArgumentException(zr.a("Invalid message parameters from assistant ", n == null ? "peerId" : "textMsg", " = null"));
            }
            ocw ocwVar = ocw.a;
            ocw.b(this, n.longValue(), stringExtra2, null, 8);
        }
    }

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public final void d() {
        this.h.getClass();
        q7s.a("AssistantVerificationService");
        x870 x870Var = x870.a;
        NotificationCompat.h hVar = new NotificationCompat.h(this, new NotificationChannel("sync_msg_send_channel", getString(R.string.push_sync_msg_send_channel), 2).getId());
        hVar.I.icon = R.drawable.vk_icon_recent_24;
        hVar.k(getString(R.string.push_sync_title));
        hVar.j(getString(R.string.push_sync_msg_send_text_unchecked));
        startForeground(10000, hVar.c());
    }
}
