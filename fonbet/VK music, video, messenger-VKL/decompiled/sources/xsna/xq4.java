package xsna;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.SystemClock;
import android.os.Vibrator;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audio.AudioMessageSource;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.codec.AudioMessageCodecBitrate;
import com.vk.dto.common.im.codec.AudioMessageCodecSampleRate;
import com.vk.log.L;
import com.vk.medianative.AudioNative;
import com.vkontakte.android.R;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ky6;

/* compiled from: AudioMessageUtils.java */
/* loaded from: classes15.dex */
public final class xq4 {
    public static final Object A = msy.a(LazyThreadSafetyMode.NONE, new yv2(2));
    public static final double B = Math.log10(Math.abs(20.0d) / 32767.0d) * 20.0d;
    public static volatile xq4 C;
    public final AudioMessageCodecSampleRate n;
    public final AudioMessageCodecBitrate o;
    public final AudioMessageCodecSampleRate p;
    public File q;
    public volatile String r;
    public Boolean s;
    public volatile AudioRecord t;
    public final int u;
    public long v;
    public long w;
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new bv0(2));
    public final b b = new b();
    public final HashMap c = new HashMap();
    public final m3a d = new m3a("fileEncodingQueue");
    public final m3a e = new m3a("recordQueue");
    public final ByteBuffer f = ByteBuffer.allocateDirect(1920);
    public final d g = new d();
    public final c h = new c();
    public final a i = new a();
    public final ArrayList j = new ArrayList();
    public final short[] k = new short[1024];
    public final fo4 l = new fo4(e43.a, false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final ky6 x = Preference.j();
    public final WeakHashMap<AudioRecord, String> y = new WeakHashMap<>();
    public Exception z = null;

    /* compiled from: AudioMessageUtils.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            xq4.this.b();
        }
    }

    /* compiled from: AudioMessageUtils.java */
    public class c implements Runnable {
        public long b;

        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            ByteBuffer byteBuffer;
            double d;
            long currentTimeMillis;
            xq4 xq4Var;
            double d2;
            L.e("run() called in RecordingRunnable");
            if (xq4.this.t != null) {
                xq4 xq4Var2 = xq4.this;
                String str = xq4Var2.y.get(xq4Var2.t);
                if (xq4.this.j.isEmpty()) {
                    byteBuffer = ByteBuffer.allocateDirect(xq4.this.u);
                    byteBuffer.order(ByteOrder.nativeOrder());
                } else {
                    byteBuffer = (ByteBuffer) xq4.this.j.get(0);
                    xq4.this.j.remove(0);
                }
                ByteBuffer byteBuffer2 = byteBuffer;
                byteBuffer2.rewind();
                int read = xq4.this.t.read(byteBuffer2, byteBuffer2.capacity());
                if (read < 0) {
                    xq4 xq4Var3 = xq4.this;
                    xq4Var3.j.add(byteBuffer2);
                    xq4.a(xq4Var3, 0, null, true, read);
                    return;
                }
                if (read > 0) {
                    byteBuffer2.limit(read);
                    try {
                        xq4 xq4Var4 = xq4.this;
                        long j = xq4Var4.v;
                        long j2 = (read / 2) + j;
                        int length = (int) ((j / j2) * r0.length);
                        int length2 = xq4Var4.k.length - length;
                        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (length != 0) {
                            float length3 = r0.length / length;
                            float f2 = 0.0f;
                            for (int i = 0; i < length; i++) {
                                short[] sArr = xq4.this.k;
                                sArr[i] = sArr[(int) f2];
                                f2 += length3;
                            }
                        }
                        float f3 = (read / 2.0f) / length2;
                        d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        for (int i2 = 0; i2 < read / 2; i2++) {
                            try {
                                short s = byteBuffer2.getShort();
                                d2 += s * s;
                                if (i2 == ((int) f)) {
                                    short[] sArr2 = xq4.this.k;
                                    if (length < sArr2.length) {
                                        sArr2[length] = s;
                                        f += f3;
                                        length++;
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                L.f("AudioMessageUtils", "Audio record failure", e);
                                byteBuffer2.position(0);
                                d = Math.sqrt((d2 / read) / 2.0d);
                                xq4.this.d.i(new yq4(this, byteBuffer2, read == byteBuffer2.capacity()));
                                xq4 xq4Var5 = xq4.this;
                                xq4Var5.e.i(xq4Var5.h);
                                currentTimeMillis = System.currentTimeMillis();
                                if (currentTimeMillis - this.b >= 17) {
                                }
                                xq4Var = xq4.this;
                                if (xq4Var.w < 3600000) {
                                }
                            }
                        }
                        xq4.this.v = j2;
                    } catch (Exception e2) {
                        e = e2;
                        d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    }
                    byteBuffer2.position(0);
                    d = Math.sqrt((d2 / read) / 2.0d);
                    xq4.this.d.i(new yq4(this, byteBuffer2, read == byteBuffer2.capacity()));
                } else {
                    d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                }
                xq4 xq4Var52 = xq4.this;
                xq4Var52.e.i(xq4Var52.h);
                currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.b >= 17) {
                    this.b = currentTimeMillis;
                    double log10 = Math.log10(Math.abs(d) / 32767.0d) * 20.0d;
                    xq4 xq4Var6 = xq4.this;
                    if (str == null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        StringBuilder sb = new StringBuilder("sessionId is null in notify progress\ncurrentSessionId: '");
                        sb.append(xq4Var6.r);
                        sb.append("',\ntime: '");
                        sb.append(elapsedRealtime);
                        sb.append("',\nis recorder exist: '");
                        sb.append(xq4Var6.t != null);
                        sb.append("',\n");
                        if (xq4Var6.t != null) {
                            sb.append("associated session id: '");
                            sb.append(xq4Var6.y.get(xq4Var6.t));
                            sb.append("',\n");
                        }
                        sb.append("current record: '");
                        sb.append(xq4Var6.q);
                        sb.append("',\nrecord duration: '");
                        sb.append(xq4Var6.w);
                        sb.append("'.");
                        com.vk.metrics.eventtracking.b.a.q(new IllegalStateException(sb.toString(), xq4Var6.z));
                    } else {
                        Iterator it = xq4Var6.m.iterator();
                        while (it.hasNext()) {
                            yu4 yu4Var = (yu4) it.next();
                            long j3 = xq4Var6.w;
                            double d3 = xq4.B;
                            if (log10 >= d3) {
                                d3 = log10;
                            }
                            yu4Var.c(str, j3, d3);
                        }
                    }
                }
                xq4Var = xq4.this;
                if (xq4Var.w < 3600000) {
                    L.e("stopRecording() called");
                    xq4Var.e.i(new vq4(xq4Var, 0, null));
                }
            }
        }
    }

    /* compiled from: AudioMessageUtils.java */
    public class d implements Runnable {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public final void run() {
            String str;
            L.e("run() called in StartRecordRunnable");
            try {
                xq4.this.z = null;
                File file = (File) xq4.A.getValue();
                xq4.this.q = new File(file, "audio_message_" + (System.currentTimeMillis() / 1000) + ".ogg");
                if (!file.exists()) {
                    file.mkdirs();
                }
                int audioStartRecord = AudioNative.audioStartRecord(xq4.this.q.getAbsolutePath(), xq4.this.o.h(), xq4.this.p.h());
                if (audioStartRecord <= 0) {
                    StringBuilder sb = new StringBuilder("Audio record start native error: \"");
                    switch (audioStartRecord) {
                        case -8:
                            str = "start record error: ogg write header";
                            break;
                        case -7:
                            str = "start record error: ogg stream init";
                            break;
                        case -6:
                            str = "start record error: opus get lookahead";
                            break;
                        case -5:
                            str = "start record error: opus set bitrate";
                            break;
                        case -4:
                            str = "start record error: opus create";
                            break;
                        case -3:
                            str = "start record error: invalid sample rate";
                            break;
                        case -2:
                            str = "start record: error open file";
                            break;
                        case -1:
                            str = "start record: error empty path";
                            break;
                        default:
                            str = "unknown error code " + audioStartRecord;
                            break;
                    }
                    sb.append(str);
                    sb.append("\". Native error: ");
                    sb.append(AudioNative.audioGetIoError());
                    throw new IllegalStateException(sb.toString());
                }
                L.e("AudioMessageUtils", "Audio record start");
                xq4.this.t = new AudioRecord(1, xq4.this.p.h(), 16, 2, xq4.this.u * 10);
                xq4 xq4Var = xq4.this;
                xq4Var.y.put(xq4Var.t, xq4.this.r);
                if (xq4.this.t.getState() == 0) {
                    throw new IllegalStateException("Audio record STATE_UNINITIALIZED supportedSampleRate " + xq4.this.p.h() + " recordBufferSize " + xq4.this.u + "hasAnySuccessRecordInit " + xq4.this.x.getBoolean("success_audio_record", false));
                }
                xq4 xq4Var2 = xq4.this;
                long j = 0;
                xq4Var2.v = 0L;
                xq4Var2.w = 0L;
                xq4Var2.f.rewind();
                xq4.f(xq4.this.s);
                AudioManager audioManager = (AudioManager) e43.a.getSystemService("audio");
                while (audioManager.isMusicActive() && j <= 500) {
                    j += 50;
                    Thread.sleep(50L);
                }
                xq4.this.t.startRecording();
                xq4 xq4Var3 = xq4.this;
                xq4Var3.e.i(xq4Var3.h);
                ky6.a aVar = (ky6.a) xq4.this.x.edit();
                aVar.putBoolean("success_audio_record", true);
                aVar.a();
            } catch (Exception e) {
                L.l("AudioMessageUtils", cqi.b(e, new StringBuilder("Audio record failure ")));
                xq4 xq4Var4 = xq4.this;
                String remove = xq4Var4.y.remove(xq4Var4.t);
                xq4 xq4Var5 = xq4.this;
                if (remove == null) {
                    remove = xq4Var5.r;
                }
                Iterator it = xq4Var5.m.iterator();
                while (it.hasNext()) {
                    ((yu4) it.next()).b(e, remove);
                }
                AudioNative.audioStopRecord();
                xq4.this.b();
                try {
                    if (xq4.this.t != null) {
                        xq4.this.t.release();
                        xq4.this.t = null;
                    }
                } catch (Exception e2) {
                    L.l("AudioMessageUtils", e2.getMessage());
                }
                cvk.u(R.string.audio_message_rec_error, false);
                xq4 xq4Var6 = xq4.this;
                fo4 fo4Var = xq4Var6.l;
                fo4Var.a.g.remove(xq4Var6.b);
                fo4Var.b();
            }
        }
    }

    public xq4(@NonNull mq4 mq4Var) {
        AudioMessageCodecSampleRate audioMessageCodecSampleRate = mq4Var.b;
        this.n = audioMessageCodecSampleRate;
        AudioMessageCodecBitrate audioMessageCodecBitrate = mq4Var.a;
        this.o = audioMessageCodecBitrate;
        L.e("AudioMessageUtils", "set neededSampleRate " + audioMessageCodecSampleRate + " neededOpusBitRate " + audioMessageCodecBitrate);
        while (audioMessageCodecSampleRate != null) {
            int minBufferSize = AudioRecord.getMinBufferSize(audioMessageCodecSampleRate.h(), 16, 2);
            this.u = minBufferSize;
            if (minBufferSize > 0) {
                break;
            }
            AudioMessageCodecSampleRate.Companion.getClass();
            int ordinal = audioMessageCodecSampleRate.ordinal() - 1;
            audioMessageCodecSampleRate = ordinal >= 0 ? AudioMessageCodecSampleRate.values()[ordinal] : null;
        }
        if (audioMessageCodecSampleRate == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Device not support available sample rates");
            String str = this.r;
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((yu4) it.next()).b(illegalStateException, str);
            }
            return;
        }
        this.p = audioMessageCodecSampleRate;
        L.e("AudioMessageUtils", "neededSampleRate " + this.n + " supportedSampleRate " + this.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[Catch: Exception -> 0x00d6, LOOP:0: B:30:0x0079->B:32:0x007f, LOOP_END, TryCatch #0 {Exception -> 0x00d6, blocks: (B:3:0x000b, B:5:0x0010, B:7:0x0026, B:11:0x0045, B:29:0x006c, B:30:0x0079, B:32:0x007f, B:34:0x0090, B:40:0x00a3, B:41:0x00a9, B:43:0x00af, B:45:0x00bb, B:47:0x00bf, B:50:0x0023), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(xq4 xq4Var, int i, AudioMessageSource audioMessageSource, boolean z, int i2) {
        String str;
        boolean z2;
        boolean z3;
        Iterator it;
        xq4Var.d.i(new wq4(xq4Var, 0));
        try {
            if (xq4Var.t != null) {
                str = xq4Var.y.remove(xq4Var.t);
                xq4Var.t.release();
                xq4Var.t = null;
            } else {
                str = xq4Var.r;
            }
            String str2 = str;
            f(Boolean.TRUE);
            ((fl4) xq4Var.a.getValue()).A();
            boolean z4 = xq4Var.w < 500;
            if (!z && xq4Var.q.exists()) {
                if (!z4 && i != 1) {
                    if (i != 4 && i != 0) {
                        z2 = false;
                        if (i != 2 && i != 3) {
                            z3 = false;
                            boolean z5 = i != 3;
                            short[] sArr = xq4Var.k;
                            byte[] audioGetWaveform = AudioNative.audioGetWaveform(sArr, sArr.length);
                            it = xq4Var.m.iterator();
                            while (it.hasNext()) {
                                ((yu4) it.next()).d(str2, xq4Var.q, z2, z3, z5, xq4Var.w, audioGetWaveform, audioMessageSource);
                            }
                            xq4Var.q = null;
                            ky6.a aVar = (ky6.a) xq4Var.x.edit();
                            aVar.putBoolean("success_audio_record", true);
                            aVar.a();
                            return;
                        }
                        z3 = true;
                        if (i != 3) {
                        }
                        short[] sArr2 = xq4Var.k;
                        byte[] audioGetWaveform2 = AudioNative.audioGetWaveform(sArr2, sArr2.length);
                        it = xq4Var.m.iterator();
                        while (it.hasNext()) {
                        }
                        xq4Var.q = null;
                        ky6.a aVar2 = (ky6.a) xq4Var.x.edit();
                        aVar2.putBoolean("success_audio_record", true);
                        aVar2.a();
                        return;
                    }
                    z2 = true;
                    if (i != 2) {
                        z3 = false;
                        if (i != 3) {
                        }
                        short[] sArr22 = xq4Var.k;
                        byte[] audioGetWaveform22 = AudioNative.audioGetWaveform(sArr22, sArr22.length);
                        it = xq4Var.m.iterator();
                        while (it.hasNext()) {
                        }
                        xq4Var.q = null;
                        ky6.a aVar22 = (ky6.a) xq4Var.x.edit();
                        aVar22.putBoolean("success_audio_record", true);
                        aVar22.a();
                        return;
                    }
                    z3 = true;
                    if (i != 3) {
                    }
                    short[] sArr222 = xq4Var.k;
                    byte[] audioGetWaveform222 = AudioNative.audioGetWaveform(sArr222, sArr222.length);
                    it = xq4Var.m.iterator();
                    while (it.hasNext()) {
                    }
                    xq4Var.q = null;
                    ky6.a aVar222 = (ky6.a) xq4Var.x.edit();
                    aVar222.putBoolean("success_audio_record", true);
                    aVar222.a();
                    return;
                }
                Iterator it2 = xq4Var.m.iterator();
                while (it2.hasNext()) {
                    ((yu4) it2.next()).a(str2, xq4Var.q, z4);
                }
                xq4Var.b();
                return;
            }
            xq4Var.d(i2, xq4Var.w, xq4Var.q.exists());
            xq4Var.b();
            cvk.u(R.string.audio_message_rec_error, false);
        } catch (Exception e) {
            L.f("AudioMessageUtils", "Audio record stop failure", e);
        }
    }

    public static xq4 c(@NonNull mq4 mq4Var) {
        xq4 xq4Var;
        xq4 xq4Var2 = C;
        if (xq4Var2 != null) {
            return xq4Var2;
        }
        synchronized (xq4.class) {
            try {
                xq4Var = C;
                if (xq4Var == null) {
                    xq4Var = new xq4(mq4Var);
                    C = xq4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xq4Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public static String e(int i, UserId userId, String str) {
        File file = new File((File) A.getValue(), userId.b + BundleUtil.UNDERLINE_TAG + i + ".ogg");
        return new File(str).renameTo(file) ? file.getAbsolutePath() : str;
    }

    public static void f(Boolean bool) {
        if (bool.booleanValue()) {
            try {
                ((Vibrator) e43.a.getSystemService("vibrator")).vibrate(50L);
                Thread.sleep(50L);
            } catch (Exception e) {
                L.f("AudioMessageUtils", "Vibrator error ", e);
            }
        }
    }

    public final void b() {
        this.z = new Exception(defpackage.k0.a(SystemClock.elapsedRealtime(), ""));
        File file = this.q;
        if (file != null) {
            file.delete();
            this.q = null;
        }
        this.w = 0L;
        this.r = null;
    }

    public final void d(int i, long j, boolean z) {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((yu4) it.next()).b(new IllegalStateException("fileExist=" + z + " errorCode " + i + " recordDuration " + j + " hasAnySuccessRecord " + this.x.getBoolean("success_audio_record", false)), this.r);
        }
    }

    /* compiled from: AudioMessageUtils.java */
    public class b implements do4 {
        public b() {
        }

        @Override // xsna.do4
        public final void a() {
            xq4 xq4Var = xq4.this;
            xq4Var.e.i(xq4Var.g);
        }

        @Override // xsna.do4
        public final void c() {
            L.e("stopRecording() called");
            xq4 xq4Var = xq4.this;
            xq4Var.e.i(new vq4(xq4Var, 0, null));
        }

        @Override // xsna.do4
        public final void d() {
            L.e("stopRecording() called");
            xq4 xq4Var = xq4.this;
            xq4Var.e.i(new vq4(xq4Var, 0, null));
        }

        @Override // xsna.do4
        public final void b() {
        }
    }
}
