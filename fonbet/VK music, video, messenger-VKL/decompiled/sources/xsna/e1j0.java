package xsna;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* compiled from: SettingsChangeBroadcast.kt */
/* loaded from: classes.dex */
public final class e1j0 extends ContentObserver {
    public static final e1j0 a = new e1j0(i0q0.a());
    public static final CopyOnWriteArraySet<izs<Integer, s3q0>> b = new CopyOnWriteArraySet<>();
    public static AudioManager c;
    public static volatile int d;
    public static long e;
    public static io.reactivex.rxjava3.disposables.c f;

    public static int a() {
        try {
            AudioManager audioManager = c;
            AudioManager audioManager2 = null;
            if (audioManager == null) {
                audioManager = null;
            }
            float streamVolume = audioManager.getStreamVolume(3) * 100.0f;
            AudioManager audioManager3 = c;
            if (audioManager3 != null) {
                audioManager2 = audioManager3;
            }
            return an10.b(streamVolume / audioManager2.getStreamMaxVolume(3));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final synchronized void b() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - e;
            if (j >= 1000) {
                e = elapsedRealtime;
                io.reactivex.rxjava3.disposables.c cVar = f;
                if (cVar != null) {
                    cVar.dispose();
                }
                f = null;
                final int a2 = a();
                i0q0.a().post(new Runnable() { // from class: xsna.d1j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<izs<Integer, s3q0>> it = e1j0.b.iterator();
                        while (it.hasNext()) {
                            it.next().invoke(Integer.valueOf(a2));
                        }
                    }
                });
                d = a2;
            } else if (f == null) {
                f = asu0.a.c().d(new cs2(this, 15), 1000 - j, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        asu0.a.getClass();
        asu0.n().execute(new scp(1));
    }
}
