package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.Nullable;

/* compiled from: AudioManagerCompat.java */
/* loaded from: classes12.dex */
public final class hq4 {

    @Nullable
    public static AudioManager a;

    public static synchronized AudioManager a(Context context) {
        synchronized (hq4.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    wwi wwiVar = new wwi();
                    jw5.t().execute(new gq4(0, applicationContext, wwiVar));
                    wwiVar.b();
                    AudioManager audioManager2 = a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
