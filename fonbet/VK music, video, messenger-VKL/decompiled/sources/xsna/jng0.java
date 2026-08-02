package xsna;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Handler;
import android.os.HandlerThread;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RouletteSoundPlayer.kt */
/* loaded from: classes6.dex */
public final class jng0 {
    public final SoundPool a;
    public final AtomicBoolean b;
    public final int[] c;
    public int d;
    public final HandlerThread e;
    public final Handler f;

    public jng0(Context context) {
        SoundPool build = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).setMaxStreams(4).build();
        this.a = build;
        this.b = new AtomicBoolean();
        this.c = new int[]{build.load(context, R.raw.roulette_click_1, 1), build.load(context, R.raw.roulette_click_2, 1), build.load(context, R.raw.roulette_click_3, 1), build.load(context, R.raw.roulette_click_4, 1), build.load(context, R.raw.roulette_reward, 1)};
        HandlerThread handlerThread = new HandlerThread("vk-roulette-sound-thread");
        this.e = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }
}
