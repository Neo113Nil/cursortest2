package xsna;

import android.util.SparseArray;
import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.mail.platform.libverify.sms.SmsRetrieverService;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.yl4;

/* compiled from: AudioTracksUnifier.kt */
/* loaded from: classes3.dex */
public final class tz4 {
    public final SparseArray<kz4> a;
    public final n3q0 b;
    public final SparseArray<bz4> c = new SparseArray<>();
    public final br4 d = new br4();
    public int e = 4096;
    public final bif0 f;
    public double g;
    public int h;
    public long i;
    public final ArrayList<yl4> j;

    public tz4(SparseArray<kz4> sparseArray, n3q0 n3q0Var) {
        this.a = sparseArray;
        this.b = n3q0Var;
        int size = sparseArray.size();
        int i = this.e;
        bif0 bif0Var = new bif0();
        bif0Var.a = size;
        bif0Var.b = new ArrayList(size);
        bif0Var.c = ByteBuffer.allocate(i).order(ByteOrder.nativeOrder());
        for (int i2 = 0; i2 < size; i2++) {
            ((ArrayList) bif0Var.b).add(new nmj0(ByteBuffer.allocate(i).order(ByteOrder.nativeOrder())));
        }
        this.f = bif0Var;
        this.g = n3q0Var.d;
        f100 f100Var = n3q0Var.c;
        if (f100Var != null) {
            f100Var.i("AudioTracksUnifier", "initialized");
        }
        ArrayList<yl4> arrayList = new ArrayList<>();
        int size2 = sparseArray.size();
        for (int i3 = 0; i3 < size2; i3++) {
            int i4 = this.b.a.b;
            arrayList.add(yl4.a.a(i4, i4));
        }
        this.j = arrayList;
    }

    public final bz4 a(int i) {
        SparseArray<bz4> sparseArray = this.c;
        bz4 bz4Var = sparseArray.get(i);
        if (bz4Var != null) {
            return bz4Var;
        }
        bz4 bz4Var2 = new bz4(i, this.a.get(i), this.b);
        sparseArray.put(i, bz4Var2);
        return bz4Var2;
    }

    public final int b() {
        double d;
        n3q0 n3q0Var = this.b;
        AudioPcm audioPcm = n3q0Var.a;
        SparseArray<bz4> sparseArray = this.c;
        if (sparseArray.size() != this.a.size()) {
            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        } else {
            int size = sparseArray.size();
            double d2 = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                d2 = Double.min(d2, sparseArray.valueAt(i).e - this.g);
            }
            d = d2;
        }
        int c = audioPcm.c((long) d);
        int i2 = n3q0Var.a.e;
        return c % i2 != 0 ? c - (c % i2) : c;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tll c() {
        AudioPcm audioPcm;
        ByteBuffer byteBuffer;
        ArrayList<yl4> arrayList;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        int i2;
        int i3;
        AudioPcm audioPcm2;
        AudioPcm audioPcm3;
        double d;
        double d2;
        int b = b();
        if (b <= 0) {
            return null;
        }
        int min = Math.min(b, 8192);
        n3q0 n3q0Var = this.b;
        AudioPcm audioPcm4 = n3q0Var.a;
        int i4 = this.e;
        int i5 = 0;
        bif0 bif0Var = this.f;
        if (i4 < min) {
            f100 f100Var = n3q0Var.c;
            if (f100Var != null) {
                f100Var.i("AudioTracksUnifier", bd3.b(", new=", this.e, min, new StringBuilder("increasing capacity, ex=")));
            }
            bif0Var.getClass();
            int i6 = bif0Var.a;
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList2.add(new nmj0(ByteBuffer.allocate(min).order(ByteOrder.nativeOrder())));
            }
            bif0Var.b = arrayList2;
            bif0Var.c = ByteBuffer.allocate(min).order(ByteOrder.nativeOrder());
            this.e = min;
        }
        Iterator it = ((ArrayList) bif0Var.b).iterator();
        while (it.hasNext()) {
            nmj0 nmj0Var = (nmj0) it.next();
            nmj0Var.a.position(0);
            nmj0Var.a.limit(min);
        }
        ((ByteBuffer) bif0Var.c).position(0);
        ((ByteBuffer) bif0Var.c).limit(min);
        long nanoTime = System.nanoTime();
        SparseArray<bz4> sparseArray = this.c;
        int size = sparseArray.size();
        int i8 = 0;
        while (i8 < size) {
            bz4 valueAt = sparseArray.valueAt(i8);
            ((nmj0) ((ArrayList) bif0Var.b).get(i8)).a.position(i5);
            nmj0 nmj0Var2 = (nmj0) ((ArrayList) bif0Var.b).get(i8);
            valueAt.getClass();
            ByteBuffer byteBuffer2 = nmj0Var2.a;
            bqk bqkVar = valueAt.f;
            int i9 = bqkVar.d;
            bif0 bif0Var2 = bif0Var;
            double d3 = valueAt.d;
            n3q0 n3q0Var2 = valueAt.c;
            SparseArray<bz4> sparseArray2 = sparseArray;
            AudioPcm audioPcm5 = n3q0Var2.a;
            int i10 = size;
            int i11 = audioPcm5.e;
            double d4 = audioPcm5.f;
            f100 f100Var2 = n3q0Var2.c;
            double d5 = min;
            double d6 = (d4 * d5) + d3;
            kz4 kz4Var = valueAt.b;
            long j = nanoTime;
            if (kz4Var.f) {
                nmj0Var2.b = true;
                valueAt.d = d6;
                audioPcm3 = audioPcm4;
                i3 = i8;
            } else {
                nmj0Var2.b = false;
                int position = byteBuffer2.position();
                if (i9 >= min) {
                    i2 = i8;
                    if (valueAt.a(valueAt.d) && valueAt.a(d6)) {
                        bqkVar.b(min, byteBuffer2);
                        audioPcm2 = audioPcm5;
                        audioPcm3 = audioPcm4;
                        i3 = i2;
                        byteBuffer2.position(position);
                        d = valueAt.d;
                        if (valueAt.a(d)) {
                            double d7 = d - kz4Var.a;
                            if (d7 < 300000.0d) {
                                double d8 = (d7 * 1.0d) / SmsRetrieverService.SMS_SAVE_STATE_TIMEOUT;
                                d2 = d8 * d8;
                            } else {
                                double d9 = (r4 + kz4Var.g) - d;
                                if (d9 < 300000.0d) {
                                    double d10 = (d9 * 1.0d) / SmsRetrieverService.SMS_SAVE_STATE_TIMEOUT;
                                    d2 = d10 * d10;
                                } else {
                                    d2 = -1.0d;
                                }
                            }
                            if (d2 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                byte[] array = byteBuffer2.array();
                                int arrayOffset = byteBuffer2.arrayOffset();
                                int position2 = byteBuffer2.position();
                                while (true) {
                                    AudioPcm audioPcm6 = audioPcm2;
                                    if (position2 >= byteBuffer2.limit() - (i11 / audioPcm6.b)) {
                                        break;
                                    }
                                    int i12 = position2 + 1;
                                    int i13 = (array[i12 + arrayOffset] << 8) | (array[position2 + arrayOffset] & 255);
                                    array[position2] = (byte) i13;
                                    position2 += 2;
                                    array[i12] = (byte) ((i13 & 65280) >> 8);
                                    audioPcm2 = audioPcm6;
                                }
                            }
                        }
                        valueAt.d = (d4 * d5) + valueAt.d;
                    }
                } else {
                    i2 = i8;
                }
                if (valueAt.a(valueAt.d) || valueAt.a(d6)) {
                    byte[] array2 = byteBuffer2.array();
                    int arrayOffset2 = byteBuffer2.arrayOffset();
                    int position3 = byteBuffer2.position();
                    double d11 = valueAt.d;
                    double d12 = kz4Var.i;
                    i3 = i2;
                    if (d11 < d12) {
                        audioPcm2 = audioPcm5;
                        audioPcm3 = audioPcm4;
                        long j2 = (long) (d12 - d11);
                        if (j2 < 0) {
                            throw new IllegalStateException("Wrong samples duration");
                        }
                        int i14 = (int) (j2 / d4);
                        int i15 = i14 % i11;
                        if (i15 != 0) {
                            i14 = (i14 + i11) - i15;
                        }
                        if (i14 > min) {
                            throw new IllegalArgumentException(efz.a(i14, min, "applying partial silence at start, but all samples are silenced, silenceBytesCount=", ", n=").toString());
                        }
                        Arrays.fill(array2, byteBuffer2.position() + arrayOffset2, byteBuffer2.position() + arrayOffset2 + i14, (byte) 0);
                        byteBuffer2.position(i14 + position3);
                        int min2 = Integer.min(bqkVar.d, byteBuffer2.remaining());
                        if (min2 < byteBuffer2.remaining() && f100Var2 != null) {
                            StringBuilder sb = new StringBuilder("decoded bytes are not enough to fill buffer, id=");
                            cgn.a(valueAt.a, min2, ", partial silence at start, decodedBytes=", ", required=", sb);
                            sb.append(byteBuffer2.remaining());
                            f100Var2.e("AudioTrackConverter", sb.toString());
                        }
                        bqkVar.b(min2, byteBuffer2);
                        Arrays.fill(array2, byteBuffer2.position() + arrayOffset2 + min2, arrayOffset2 + position3 + min, (byte) 0);
                    } else {
                        audioPcm2 = audioPcm5;
                        audioPcm3 = audioPcm4;
                        long j3 = (long) (kz4Var.j - d11);
                        if (j3 < 0) {
                            throw new IllegalStateException("Wrong samples duration");
                        }
                        int i16 = (int) (j3 / d4);
                        if (i16 > min) {
                            if (f100Var2 != null) {
                                f100Var2.w("AudioTrackConverter", efz.a(i16, min, "applying partial silence at end, but all of the samples aren't silenced, nonSilentBytes=", ", n="));
                            }
                            i16 = Math.max(0, byteBuffer2.remaining() - bqkVar.d);
                        }
                        int min3 = Integer.min(bqkVar.d, byteBuffer2.remaining() - i16);
                        if (min3 >= byteBuffer2.remaining() - i16 && f100Var2 != null) {
                            StringBuilder b2 = ji.b(min3, "decoded bytes are not enough to fill buffer, partial silence at end, decodedBytes=", ", required=");
                            b2.append(byteBuffer2.remaining() - i16);
                            f100Var2.w("AudioTrackConverter", b2.toString());
                        }
                        bqkVar.b(min3, byteBuffer2);
                        Arrays.fill(array2, byteBuffer2.position() + arrayOffset2 + min3, byteBuffer2.position() + arrayOffset2 + min, (byte) 0);
                    }
                    byteBuffer2.position(position);
                    d = valueAt.d;
                    if (valueAt.a(d)) {
                    }
                    valueAt.d = (d4 * d5) + valueAt.d;
                } else {
                    nmj0Var2.b = true;
                    audioPcm2 = audioPcm5;
                    audioPcm3 = audioPcm4;
                    i3 = i2;
                    byteBuffer2.position(position);
                    d = valueAt.d;
                    if (valueAt.a(d)) {
                    }
                    valueAt.d = (d4 * d5) + valueAt.d;
                }
            }
            i8 = i3 + 1;
            bif0Var = bif0Var2;
            sparseArray = sparseArray2;
            size = i10;
            nanoTime = j;
            audioPcm4 = audioPcm3;
            i5 = 0;
        }
        AudioPcm audioPcm7 = audioPcm4;
        bif0 bif0Var3 = bif0Var;
        long j4 = nanoTime;
        ArrayList arrayList3 = (ArrayList) bif0Var3.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            nmj0 nmj0Var3 = (nmj0) it2.next();
            nmj0Var3.a.position(0);
            ByteBuffer byteBuffer3 = nmj0Var3.b ? null : nmj0Var3.a;
            if (byteBuffer3 != null) {
                arrayList4.add(byteBuffer3);
            }
        }
        if (arrayList4.isEmpty()) {
            audioPcm = audioPcm7;
            ((ByteBuffer) bif0Var3.c).position(0);
            byteBuffer = (ByteBuffer) bif0Var3.c;
        } else if (arrayList4.size() == 1) {
            byteBuffer = (ByteBuffer) arrayList4.get(0);
            audioPcm = audioPcm7;
        } else {
            ((nmj0) ((ArrayList) bif0Var3.b).get(0)).a.position(0);
            ByteBuffer byteBuffer4 = ((nmj0) ((ArrayList) bif0Var3.b).get(0)).a;
            audioPcm = audioPcm7;
            int i17 = 2;
            int i18 = (min / audioPcm.b) / 2;
            this.d.getClass();
            int size2 = arrayList4.size();
            for (int i19 = 0; i19 < size2; i19++) {
                if (!((ByteBuffer) arrayList4.get(i19)).hasArray()) {
                    throw new IllegalStateException(uq.b(arrayList4, vq.a("AudioMixerOptimized found not array-backed input ByteBuffer: ", i19, '/')).toString());
                }
            }
            if (!byteBuffer4.hasArray()) {
                throw new IllegalStateException("AudioMixerOptimized not array-backed mix ByteBuffer");
            }
            int size3 = arrayList4.size();
            at20[] at20VarArr = new at20[size3];
            int i20 = 0;
            while (true) {
                arrayList = this.j;
                if (i20 >= size3) {
                    break;
                }
                at20VarArr[i20] = new at20((ByteBuffer) arrayList4.get(i20), audioPcm, arrayList.get(i20));
                i20++;
            }
            AudioPcm.EncodingType encodingType = AudioPcm.EncodingType.UNSET;
            int i21 = arrayList.get(0).b;
            float[] fArr = new float[i21];
            for (int i22 = 0; i22 < i21; i22++) {
                fArr[i22] = 0.5f;
            }
            byte[] array3 = byteBuffer4.array();
            int arrayOffset3 = byteBuffer4.arrayOffset();
            int position4 = byteBuffer4.position() + arrayOffset3;
            int i23 = 0;
            while (i23 < i18) {
                int i24 = i17;
                int size4 = arrayList4.size();
                ArrayList arrayList5 = arrayList4;
                int i25 = 0;
                while (i25 < size4) {
                    at20 at20Var = at20VarArr[i25];
                    int i26 = i18;
                    ByteBuffer byteBuffer5 = at20Var.a;
                    int i27 = size4;
                    float[] fArr2 = at20Var.d;
                    at20[] at20VarArr2 = at20VarArr;
                    int length = fArr2.length;
                    int i28 = 0;
                    while (i28 < length) {
                        int i29 = i28;
                        byte[] bArr = at20Var.e;
                        int position5 = byteBuffer5.position() + 1;
                        int i30 = at20Var.f;
                        fArr2[i29] = (bArr[position5 + i30] << 8) | (bArr[byteBuffer5.position() + i30] & 255);
                        byteBuffer5.position(byteBuffer5.position() + 2);
                        i28 = i29 + 1;
                    }
                    at20 at20Var2 = at20VarArr2[i25];
                    int i31 = at20Var2.c.b;
                    int i32 = 0;
                    while (i32 < i31) {
                        float f7 = at20Var2.d[i32];
                        int i33 = i31;
                        at20 at20Var3 = at20Var2;
                        if (at20Var2.b.c == AudioPcm.EncodingType.PCM_16BIT) {
                            short s = (short) f7;
                            if (s >= 0) {
                                f6 = io.reactivex.rxjava3.internal.operators.observable.n0.b(s * 1.0f, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, 0.5f, 0.5f);
                                f3 = 0.5f;
                            } else {
                                f3 = 0.5f;
                                f6 = (((-32768.0f) - s) / (-32768)) * 0.5f;
                            }
                            f4 = f6;
                            i = i24;
                        } else {
                            f3 = 0.5f;
                            i = i24;
                            f4 = (f7 + 1.0f) / i;
                        }
                        float f8 = fArr[i32];
                        if (f8 >= f3 || f4 >= f3) {
                            float f9 = f4;
                            float f10 = i;
                            f5 = (((f8 + f9) * f10) - ((f10 * f8) * f9)) - 1;
                        } else {
                            f5 = f8 * f4 * i;
                        }
                        fArr[i32] = f5;
                        i32++;
                        i31 = i33;
                        at20Var2 = at20Var3;
                        i24 = 2;
                    }
                    i25++;
                    i18 = i26;
                    size4 = i27;
                    at20VarArr = at20VarArr2;
                    i24 = 2;
                }
                int i34 = i18;
                at20[] at20VarArr3 = at20VarArr;
                float f11 = 1.0f;
                int i35 = 0;
                while (i35 < i21) {
                    float f12 = fArr[i35];
                    if (audioPcm.c != AudioPcm.EncodingType.PCM_16BIT) {
                        f = f11;
                        f2 = (f12 * 2.0f) - f;
                    } else if (f12 >= 0.5f) {
                        f2 = (f12 - 0.5f) * 2 * OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND;
                        f = f11;
                    } else {
                        f = f11;
                        f2 = pm0.a(f12, 2, f, -32768);
                    }
                    int i36 = (int) f2;
                    int i37 = position4 + 1;
                    array3[position4] = (byte) i36;
                    position4 += 2;
                    array3[i37] = (byte) ((i36 & 65280) >> 8);
                    fArr[i35] = 0.5f;
                    i35++;
                    f11 = f;
                }
                i23++;
                arrayList4 = arrayList5;
                i18 = i34;
                at20VarArr = at20VarArr3;
                i17 = 2;
            }
            byteBuffer4.position(position4 - arrayOffset3);
            ((nmj0) ((ArrayList) bif0Var3.b).get(0)).a.position(0);
            byteBuffer = ((nmj0) ((ArrayList) bif0Var3.b).get(0)).a;
        }
        long nanoTime2 = System.nanoTime() - j4;
        this.h++;
        this.i += nanoTime2;
        double d13 = this.g;
        tll tllVar = new tll((long) d13, min, byteBuffer);
        this.g = (audioPcm.f * min) + d13;
        return tllVar;
    }
}
