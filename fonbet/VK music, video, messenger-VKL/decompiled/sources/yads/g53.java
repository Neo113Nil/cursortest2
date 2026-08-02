package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes10.dex */
public final class g53 {
    public final Context a;
    public final Handler b;
    public final e53 c;
    public final AudioManager d;
    public f53 e;
    public HandlerThread f;
    public int g;
    public int h;
    public boolean i;

    public g53(Context context, Handler handler, xn0 xn0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = xn0Var;
        AudioManager audioManager = (AudioManager) ni.a((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.g = 3;
        this.h = b(audioManager, 3);
        this.i = a(audioManager, this.g);
        f53 f53Var = new f53(this);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            HandlerThread handlerThread = new HandlerThread("StreamVolumeReceiver");
            this.f = handlerThread;
            handlerThread.start();
            applicationContext.registerReceiver(f53Var, intentFilter, null, new Handler(this.f.getLooper()));
            this.e = f53Var;
        } catch (RuntimeException e) {
            ji1.a(e);
            HandlerThread handlerThread2 = this.f;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.f = null;
            }
        }
    }

    public static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            ji1.d("StreamVolumeManager", ji1.a("Could not retrieve stream volume for stream type " + i, e));
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void a(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        int b = b(this.d, i);
        boolean a = a(this.d, this.g);
        if (this.h != b || this.i != a) {
            this.h = b;
            this.i = a;
            ((xn0) this.c).a(a, b);
        }
        ((xn0) this.c).a();
    }

    public final void b() {
        f53 f53Var = this.e;
        if (f53Var != null) {
            try {
                this.a.unregisterReceiver(f53Var);
            } catch (RuntimeException e) {
                ji1.d("StreamVolumeManager", ji1.a("Error unregistering stream volume receiver", e));
            }
            this.e = null;
        }
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f = null;
        }
    }

    public final int a() {
        if (mc3.a >= 28) {
            return this.d.getStreamMinVolume(this.g);
        }
        return 0;
    }

    public static boolean a(AudioManager audioManager, int i) {
        if (mc3.a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return b(audioManager, i) == 0;
    }
}
