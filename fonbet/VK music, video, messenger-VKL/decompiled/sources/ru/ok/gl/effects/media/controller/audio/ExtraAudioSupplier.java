package ru.ok.gl.effects.media.controller.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.media3.datasource.c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.n;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gleffects.EffectAudioController;
import xsna.b630;
import xsna.fxc0;
import xsna.hv1;
import xsna.kr10;
import xsna.o7j;
import xsna.or4;
import xsna.pm0;
import xsna.uel;

/* loaded from: classes9.dex */
public class ExtraAudioSupplier implements EffectAudioController {
    static final int CHANNEL_COUNT = 2;
    static final long FRAME_DURATION = 23220;
    private static final int HEADPHONES_CHECK_TRIES = 6;
    static final int SAMPLES_PER_FRAME = 1024;
    static final int SAMPLE_RATE_HZ = 44100;
    static final int SAMPLE_SIZE = 4096;
    private static final String TAG = "ExtraAudioSupplier";
    private Context context;
    private HeadsetListener headsetListener;
    private volatile boolean needSyncAms;
    private float normalized;
    private float normalized1;
    private float normalized2;
    private short s;
    private short s1;
    private short s2;
    private final ConcurrentHashMap<Integer, AudioMuxingSupplier> currentSuppliers = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, AudioPlayer> currentPlayers = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Long> syncTimes = new ConcurrentHashMap<>();
    private final Handler playerHandler = new Handler(Looper.getMainLooper());
    private AtomicInteger newId = new AtomicInteger(0);
    private ArrayList<byte[]> currentSounds = new ArrayList<>();
    private int duetId = -1;

    public static final class AudioPlayer {
        l sep;

        @SuppressLint({"UnsafeOptInUsageError"})
        public AudioPlayer(Context context, Handler handler) {
            try {
                ExoPlayer.b bVar = new ExoPlayer.b(context);
                bVar.c(handler.getLooper());
                fxc0.z(!bVar.y);
                bVar.y = true;
                this.sep = new l(bVar);
            } catch (Exception e) {
                Log.e(ExtraAudioSupplier.TAG, "failed to create audio exoplayer", e);
            }
        }
    }

    public ExtraAudioSupplier(@NonNull Context context) {
        this.context = context.getApplicationContext();
        this.headsetListener = new HeadsetListener(context);
    }

    private short getShortFromBytes(byte b, byte b2) {
        return (short) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pause$2(AudioPlayer audioPlayer) {
        audioPlayer.sep.setPlayWhenReady(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$prepareExoPlayer$7(AudioPlayer audioPlayer, i iVar) {
        l lVar = audioPlayer.sep;
        lVar.y();
        androidx.media3.exoplayer.c cVar = lVar.c;
        cVar.X();
        cVar.r(iVar);
        cVar.prepare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resume$1(AudioPlayer audioPlayer) {
        audioPlayer.sep.setPlayWhenReady(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setVolume$5(AudioPlayer audioPlayer, float f) {
        audioPlayer.sep.setVolume(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$start$0(AudioPlayer audioPlayer, float f, int i, long j) {
        audioPlayer.sep.setVolume(f);
        l lVar = audioPlayer.sep;
        lVar.y();
        lVar.c.P(i);
        audioPlayer.sep.x(j);
        audioPlayer.sep.setPlayWhenReady(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stop$3(AudioPlayer audioPlayer) {
        audioPlayer.sep.x(0L);
        audioPlayer.sep.setPlayWhenReady(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stop$4(AudioPlayer audioPlayer) {
        audioPlayer.sep.x(0L);
        audioPlayer.sep.setPlayWhenReady(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncAms$6() {
        AudioPlayer audioPlayer;
        this.syncTimes.clear();
        for (Integer num : this.currentPlayers.keySet()) {
            num.intValue();
            if (this.currentPlayers.containsKey(num) && (audioPlayer = this.currentPlayers.get(num)) != null) {
                this.syncTimes.put(num, Long.valueOf(audioPlayer.sep.getContentPosition()));
            }
        }
        this.needSyncAms = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void muxRawAudio(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        if (i2 > bArr3.length) {
            Log.e(TAG, "Unable to mux raw audio, wrong incoming params");
            return;
        }
        int i3 = i == 1 ? 2 : 1;
        int i4 = 0;
        while (i4 < bArr2.length && i2 > 0) {
            int i5 = i4 + 1;
            short shortFromBytes = getShortFromBytes(bArr2[i5], bArr2[i4]);
            this.s1 = shortFromBytes;
            this.normalized1 = normalize(shortFromBytes);
            int i6 = i4 * i3;
            short shortFromBytes2 = getShortFromBytes(bArr3[i6 + 1], bArr3[i6]);
            this.s2 = shortFromBytes2;
            this.normalized2 = normalize(shortFromBytes2);
            if (i3 == 2) {
                short shortFromBytes3 = getShortFromBytes(bArr3[i6 + 3], bArr3[i6 + 2]);
                this.s = shortFromBytes3;
                this.s2 = (short) ((shortFromBytes3 + this.s2) / 2);
            }
            float f = this.normalized1;
            if (f < 0.5f) {
                float f2 = this.normalized2;
                if (f2 < 0.5f) {
                    this.normalized = f * f2 * 2.0f;
                    if (this.normalized < 0.5f) {
                        this.s = (short) ((r3 - 0.5f) * 2.0f * 32767.0f);
                    } else {
                        this.s = (short) pm0.a(r3, 2.0f, 1.0f, -32768.0f);
                    }
                    short s = this.s;
                    bArr[i4] = (byte) s;
                    bArr[i5] = (byte) ((s & 65280) >> 8);
                    i4 += 2;
                    i2 -= i3 * 2;
                }
            }
            float f3 = this.normalized2;
            this.normalized = (((f + f3) * 2.0f) - ((f * 2.0f) * f3)) - 1.0f;
            if (this.normalized < 0.5f) {
            }
            short s2 = this.s;
            bArr[i4] = (byte) s2;
            bArr[i5] = (byte) ((s2 & 65280) >> 8);
            i4 += 2;
            i2 -= i3 * 2;
        }
    }

    private float normalize(short s) {
        return s >= 0 ? (((s * 1.0f) / 32767.0f) * 0.5f) + 0.5f : (((-32768.0f) - s) / (-32768.0f)) * 0.5f;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private AudioPlayer prepareExoPlayer(String str, Handler handler) {
        File file = new File(str);
        final AudioPlayer audioPlayer = (file.exists() && file.isFile() && file.length() >= 4) ? new AudioPlayer(this.context, handler) : null;
        if (audioPlayer == null || audioPlayer.sep == null) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        c.a aVar = new c.a(this.context);
        b630 b630Var = new b630(new uel(), 8);
        androidx.media3.exoplayer.upstream.a aVar2 = new androidx.media3.exoplayer.upstream.a();
        kr10 b = kr10.b(fromFile);
        b.b.getClass();
        b.b.getClass();
        b.b.getClass();
        final n nVar = new n(b, aVar, b630Var, androidx.media3.exoplayer.drm.b.a, aVar2, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
        handler.post(new Runnable() { // from class: ru.ok.gl.effects.media.controller.audio.e
            @Override // java.lang.Runnable
            public final void run() {
                ExtraAudioSupplier.lambda$prepareExoPlayer$7(ExtraAudioSupplier.AudioPlayer.this, nVar);
            }
        });
        return audioPlayer;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private void releaseMediaPlayers() {
        Iterator<Map.Entry<Integer, AudioPlayer>> it = this.currentPlayers.entrySet().iterator();
        while (it.hasNext()) {
            AudioPlayer value = it.next().getValue();
            Handler handler = this.playerHandler;
            l lVar = value.sep;
            Objects.requireNonNull(lVar);
            handler.post(new or4(lVar, 5));
        }
        this.currentPlayers.clear();
    }

    public int addAudioStream(@NonNull AudioMuxingData audioMuxingData, String str, boolean z) {
        AudioMuxingSupplier audioMuxingSupplier;
        int andIncrement = this.newId.getAndIncrement();
        try {
            audioMuxingSupplier = new AudioMuxingSupplier(audioMuxingData, str, z);
        } catch (Exception e) {
            Log.e(TAG, "" + e.getMessage());
            audioMuxingSupplier = null;
        }
        if (audioMuxingSupplier == null || !audioMuxingSupplier.isInitialized() || ((AudioManager) this.context.getSystemService("audio")) == null) {
            return -1;
        }
        AudioPlayer prepareExoPlayer = z ? null : prepareExoPlayer(str, this.playerHandler);
        if (prepareExoPlayer != null) {
            this.currentPlayers.put(Integer.valueOf(andIncrement), prepareExoPlayer);
        }
        this.currentSuppliers.put(Integer.valueOf(andIncrement), audioMuxingSupplier);
        return andIncrement;
    }

    public void addDuetFile(File file) {
        this.duetId = addAudioStream(-1L, -1L, false, 0.65f, file.getAbsolutePath(), true);
    }

    public long getDuetCurrentTimestamp() {
        AudioMuxingSupplier audioMuxingSupplier;
        int i = this.duetId;
        if (i == -1 || (audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i))) == null) {
            return 0L;
        }
        return audioMuxingSupplier.getCurrentExtractorTimestampUs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r3.isPreFetched() != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getRawData(byte[] bArr, int i, int i2, Boolean bool, boolean z) {
        if (this.needSyncAms) {
            for (Integer num : this.currentSuppliers.keySet()) {
                num.intValue();
                if (this.syncTimes.containsKey(num)) {
                    AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(num);
                    Long l = this.syncTimes.get(num);
                    if (audioMuxingSupplier != null && l != null && audioMuxingSupplier.getAmd().pure) {
                        audioMuxingSupplier.seekTo(l.longValue(), false);
                    }
                }
            }
            this.needSyncAms = false;
        }
        this.currentSounds.clear();
        if (i2 == 1) {
            i *= 2;
        }
        int i3 = i;
        Iterator<AudioMuxingSupplier> it = this.currentSuppliers.values().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AudioMuxingSupplier next = it.next();
            if (bool == null || bool.booleanValue() || !next.isPreFetched()) {
                next.lock(true);
                if (next.isRunning()) {
                    byte[] rawAudioData = next.getRawAudioData(i3);
                    if (rawAudioData == null) {
                        next.stop();
                        if (next.getAmd().cyclic) {
                            next.start();
                        }
                    } else if (next.isSilenced()) {
                        next.lock(false);
                    } else {
                        this.currentSounds.add(rawAudioData);
                        z2 |= next.getAmd().pure;
                    }
                }
                next.lock(false);
            }
        }
        if (z2) {
            if (z || this.headsetListener.getHeadsetsOn()) {
                for (int i4 = 0; i4 < this.currentSounds.size(); i4++) {
                    muxRawAudio(bArr, bArr, this.currentSounds.get(i4), i2, i3);
                }
            }
        }
    }

    @Override // ru.ok.gleffects.EffectAudioController
    @SuppressLint({"UnsafeOptInUsageError"})
    public void pause(int i) {
        AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i));
        final AudioPlayer audioPlayer = this.currentPlayers.get(Integer.valueOf(i));
        if (audioMuxingSupplier != null) {
            audioMuxingSupplier.lock(true);
            audioMuxingSupplier.stop();
            audioMuxingSupplier.setPaused();
            audioMuxingSupplier.lock(false);
            if (audioPlayer != null) {
                this.playerHandler.post(new Runnable() { // from class: ru.ok.gl.effects.media.controller.audio.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExtraAudioSupplier.lambda$pause$2(ExtraAudioSupplier.AudioPlayer.this);
                    }
                });
            }
        }
    }

    public void release() {
        for (AudioMuxingSupplier audioMuxingSupplier : this.currentSuppliers.values()) {
            audioMuxingSupplier.lock(true);
            audioMuxingSupplier.release();
            audioMuxingSupplier.lock(false);
        }
        this.currentSuppliers.clear();
        releaseMediaPlayers();
    }

    public void releaseDuets() {
        release(this.duetId);
        this.duetId = -1;
    }

    @Override // ru.ok.gleffects.EffectAudioController
    @SuppressLint({"UnsafeOptInUsageError"})
    public void resume(int i) {
        AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i));
        final AudioPlayer audioPlayer = this.currentPlayers.get(Integer.valueOf(i));
        if (audioMuxingSupplier == null || !audioMuxingSupplier.isPaused()) {
            return;
        }
        audioMuxingSupplier.lock(true);
        audioMuxingSupplier.start();
        audioMuxingSupplier.lock(false);
        if (audioPlayer != null) {
            this.playerHandler.post(new Runnable() { // from class: ru.ok.gl.effects.media.controller.audio.f
                @Override // java.lang.Runnable
                public final void run() {
                    ExtraAudioSupplier.lambda$resume$1(ExtraAudioSupplier.AudioPlayer.this);
                }
            });
        }
    }

    public void seek(int i, long j) {
        AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i));
        if (audioMuxingSupplier != null) {
            audioMuxingSupplier.lock(true);
            audioMuxingSupplier.seekTo(j);
            audioMuxingSupplier.lock(false);
        }
    }

    public void setHeadsetCallback(o7j<Boolean> o7jVar) {
        this.headsetListener.setHeadsetCallback(o7jVar);
    }

    @Override // ru.ok.gleffects.EffectAudioController
    @SuppressLint({"UnsafeOptInUsageError"})
    public void setVolume(int i, final float f) {
        AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i));
        if (audioMuxingSupplier != null) {
            AudioMuxingData amd = audioMuxingSupplier.getAmd();
            if (amd != null) {
                amd.setVolume(f);
            }
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                audioMuxingSupplier.setSilenced(false);
            } else {
                audioMuxingSupplier.setSilenced(true);
            }
        }
        final AudioPlayer audioPlayer = this.currentPlayers.get(Integer.valueOf(i));
        if (audioPlayer != null) {
            this.playerHandler.post(new Runnable() { // from class: ru.ok.gl.effects.media.controller.audio.d
                @Override // java.lang.Runnable
                public final void run() {
                    ExtraAudioSupplier.lambda$setVolume$5(ExtraAudioSupplier.AudioPlayer.this, f);
                }
            });
        }
    }

    public boolean start(int i) {
        AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i));
        if (audioMuxingSupplier == null) {
            return true;
        }
        start(i, audioMuxingSupplier.getAmd().cyclic, false, 1.0f, 0L);
        return true;
    }

    public void startDuet() {
        start(this.duetId, false, true, 0.65f, 0L);
    }

    @Override // ru.ok.gleffects.EffectAudioController
    @SuppressLint({"UnsafeOptInUsageError"})
    public void stop(int i) {
        AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i));
        final AudioPlayer audioPlayer = this.currentPlayers.get(Integer.valueOf(i));
        if (audioMuxingSupplier != null) {
            audioMuxingSupplier.lock(true);
            audioMuxingSupplier.stop();
            audioMuxingSupplier.lock(false);
            if (audioPlayer != null) {
                this.playerHandler.post(new Runnable() { // from class: ru.ok.gl.effects.media.controller.audio.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExtraAudioSupplier.lambda$stop$3(ExtraAudioSupplier.AudioPlayer.this);
                    }
                });
            }
        }
    }

    public void stopDuet() {
        stop(this.duetId);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public void syncAms() {
        this.playerHandler.post(new hv1(this, 6));
    }

    public void tie() {
        Iterator<AudioMuxingSupplier> it = this.currentSuppliers.values().iterator();
        while (it.hasNext()) {
            it.next().tie();
        }
    }

    public void untie() {
        Iterator<AudioMuxingSupplier> it = this.currentSuppliers.values().iterator();
        while (it.hasNext()) {
            it.next().untie();
        }
    }

    @Override // ru.ok.gleffects.EffectAudioController
    @SuppressLint({"UnsafeOptInUsageError"})
    public void start(int i, boolean z, boolean z2, float f, final long j) {
        AudioMuxingSupplier audioMuxingSupplier = this.currentSuppliers.get(Integer.valueOf(i));
        final AudioPlayer audioPlayer = this.currentPlayers.get(Integer.valueOf(i));
        if (audioMuxingSupplier != null) {
            stop(i);
            AudioMuxingData amd = audioMuxingSupplier.getAmd();
            audioMuxingSupplier.lock(true);
            amd.volume = f;
            amd.cyclic = z;
            amd.pure = z2;
            audioMuxingSupplier.start();
            audioMuxingSupplier.lock(false);
            if (audioPlayer != null) {
                final float f2 = audioMuxingSupplier.getAmd().volume;
                boolean z3 = audioMuxingSupplier.getAmd().cyclic;
                Handler handler = this.playerHandler;
                final int i2 = z3 ? 1 : 0;
                handler.post(new Runnable() { // from class: ru.ok.gl.effects.media.controller.audio.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExtraAudioSupplier.lambda$start$0(ExtraAudioSupplier.AudioPlayer.this, f2, i2, j);
                    }
                });
            }
        }
    }

    @Override // ru.ok.gleffects.EffectAudioController
    @SuppressLint({"UnsafeOptInUsageError"})
    public void release(int i) {
        AudioMuxingSupplier remove = this.currentSuppliers.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.lock(true);
            remove.stop();
            remove.release();
            remove.lock(false);
        }
        AudioPlayer audioPlayer = this.currentPlayers.get(Integer.valueOf(i));
        if (audioPlayer != null) {
            this.currentPlayers.remove(Integer.valueOf(i));
            Handler handler = this.playerHandler;
            l lVar = audioPlayer.sep;
            Objects.requireNonNull(lVar);
            handler.post(new or4(lVar, 5));
        }
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public void stop() {
        for (Map.Entry<Integer, AudioMuxingSupplier> entry : this.currentSuppliers.entrySet()) {
            entry.getValue().stop();
            final AudioPlayer audioPlayer = this.currentPlayers.get(entry.getKey());
            if (audioPlayer != null) {
                this.playerHandler.post(new Runnable() { // from class: ru.ok.gl.effects.media.controller.audio.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExtraAudioSupplier.lambda$stop$4(ExtraAudioSupplier.AudioPlayer.this);
                    }
                });
            }
        }
    }

    @Override // ru.ok.gleffects.EffectAudioController
    public int addAudioStream(String str) {
        return addAudioStream(-1L, -1L, false, 1.0f, str, false);
    }

    public int addAudioStream(long j, long j2, boolean z, float f, String str, boolean z2) {
        return addAudioStream(new AudioMuxingData(j, j2, z, f), str, z2);
    }
}
