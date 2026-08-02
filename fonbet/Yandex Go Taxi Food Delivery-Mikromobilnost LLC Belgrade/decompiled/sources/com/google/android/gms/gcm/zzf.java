package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes11.dex */
final class zzf extends com.google.android.gms.internal.gcm.zzj {
    private final /* synthetic */ b zzak;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(b bVar, Looper looper) {
        super(looper);
        this.zzak = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        Handler handler;
        if (message != null) {
            boolean z2 = message.obj instanceof Intent;
        }
        Intent intent = (Intent) message.obj;
        boolean equals = "com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction());
        b bVar = this.zzak;
        if (equals) {
            bVar.b.add(intent);
            return;
        }
        int i = b.c;
        bVar.getClass();
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra == null || (handler = (Handler) bVar.a.remove(stringExtra)) == null) {
            z = false;
        } else {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            z = handler.sendMessage(obtain);
        }
        if (z) {
            return;
        }
        this.zzak.getClass();
        throw null;
    }
}
