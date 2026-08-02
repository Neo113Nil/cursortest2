package xsna;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;

/* compiled from: AudioBecomingNoisyManager.java */
/* loaded from: classes12.dex */
public final class tc4 {
    public final Context a;
    public final a b;
    public final otu c;
    public boolean d;

    /* compiled from: AudioBecomingNoisyManager.java */
    public final class a extends BroadcastReceiver {
        public final b a;
        public final otu b;

        public a(otu otuVar, b bVar) {
            this.b = otuVar;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(new sc4(this, 0));
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    public interface b {
    }

    public tc4(Context context, Looper looper, Looper looper2, b bVar, dvf dvfVar) {
        this.a = context.getApplicationContext();
        this.c = dvfVar.createHandler(looper, null);
        this.b = new a(dvfVar.createHandler(looper2, null), bVar);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void a() {
        if (this.d) {
            this.c.post(new rc4(this, 0));
            this.d = false;
        }
    }
}
