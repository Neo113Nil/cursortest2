package androidx.media3.exoplayer;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.exoplayer.b;
import defpackage.a3x0;
import defpackage.o2x0;
import defpackage.we3;

/* loaded from: classes10.dex */
public final class b {
    public final Context a;
    public final AudioBecomingNoisyManager$AudioBecomingNoisyReceiver b;
    public final a3x0 c;
    public boolean d;

    public b(Context context, Looper looper, Looper looper2, we3 we3Var, o2x0 o2x0Var) {
        this.a = context.getApplicationContext();
        this.c = o2x0Var.a(looper, null);
        this.b = new AudioBecomingNoisyManager$AudioBecomingNoisyReceiver(this, o2x0Var.a(looper2, null), we3Var);
    }

    public final void a(boolean z) {
        if (z == this.d) {
            return;
        }
        a3x0 a3x0Var = this.c;
        if (z) {
            final int i = 0;
            a3x0Var.e(new Runnable(this) { // from class: ve3
                public final /* synthetic */ b b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    b bVar = this.b;
                    switch (i2) {
                        case 0:
                            bVar.a.registerReceiver(bVar.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            bVar.a.unregisterReceiver(bVar.b);
                            break;
                    }
                }
            });
            this.d = true;
        } else {
            final int i2 = 1;
            a3x0Var.e(new Runnable(this) { // from class: ve3
                public final /* synthetic */ b b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    b bVar = this.b;
                    switch (i22) {
                        case 0:
                            bVar.a.registerReceiver(bVar.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            bVar.a.unregisterReceiver(bVar.b);
                            break;
                    }
                }
            });
            this.d = false;
        }
    }
}
