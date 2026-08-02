package xsna;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Handler;
import android.os.HandlerThread;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TimerSoundPlayer.kt */
/* loaded from: classes16.dex */
public final class rxo0 {
    public final SoundPool a;
    public final AtomicBoolean b;
    public final int[] c;
    public final HandlerThread d;
    public final Handler e;

    public rxo0(Context context) {
        SoundPool build = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).setMaxStreams(2).build();
        this.a = build;
        this.b = new AtomicBoolean();
        this.c = new int[]{build.load(context, R.raw.timer_intermediate, 1), build.load(context, R.raw.timer_cancel, 1), build.load(context, R.raw.timer_end, 1)};
        HandlerThread handlerThread = new HandlerThread("vk-timer-sound-thread");
        this.d = handlerThread;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }
}
