package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: AudioFocusListener.kt */
/* loaded from: classes6.dex */
public final class ao4 extends hs6 {
    public final p1d0 c;
    public final afl0 d;
    public boolean e;

    public ao4(p1d0 p1d0Var, afl0 afl0Var) {
        this.c = p1d0Var;
        this.d = afl0Var;
    }

    public final synchronized void a(Context context) {
        if (!this.e) {
            c(this.d);
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Audio focus abandoned"});
        }
        ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(this);
        onAudioFocusChange(-1);
    }

    public final synchronized void b(Context context) {
        if (this.e) {
            c(this.c);
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Audio focus requested"});
        }
        if (((AudioManager) context.getSystemService("audio")).requestAudioFocus(this, 3, 2) == 1) {
            onAudioFocusChange(2);
        } else {
            onAudioFocusChange(-1);
        }
    }

    public final void c(gzs<s3q0> gzsVar) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.b;
        if (epx.f(myLooper, handler.getLooper())) {
            gzsVar.invoke();
        } else {
            handler.post(new zn4(0, gzsVar));
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final synchronized void onAudioFocusChange(int i) {
        try {
            if (i == -2 || i == -1) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Audio focus lost"});
                }
                this.e = false;
                c(this.d);
            } else if (i == 1 || i == 2) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"Audio focus acquired"});
                }
                this.e = true;
                c(this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
