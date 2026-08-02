package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: SonicAudioProcessor.kt */
/* loaded from: classes3.dex */
public final class zek0 implements qt4 {
    public float a = 1.0f;
    public final ByteBuffer b;
    public int c;
    public AudioPcm d;
    public AudioPcm e;
    public AudioPcm f;
    public AudioPcm g;
    public boolean h;
    public yek0 i;
    public ByteBuffer j;
    public ByteBuffer k;
    public ShortBuffer l;

    public zek0() {
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        this.b = order;
        AudioPcm audioPcm = new AudioPcm(Integer.MIN_VALUE, Integer.MIN_VALUE, AudioPcm.EncodingType.UNSET);
        this.c = Integer.MIN_VALUE;
        this.d = audioPcm;
        this.e = audioPcm;
        this.f = audioPcm;
        this.g = audioPcm;
        this.j = order;
        this.k = order;
        this.l = order.asShortBuffer();
    }

    @Override // xsna.qt4
    public final AudioPcm a(AudioPcm audioPcm) {
        if (!audioPcm.d || audioPcm.c != AudioPcm.EncodingType.PCM_16BIT) {
            throw new IllegalArgumentException(("Wrong format=" + audioPcm).toString());
        }
        this.f = audioPcm;
        int i = this.c;
        if (i == Integer.MIN_VALUE) {
            i = audioPcm.a;
        }
        AudioPcm a = AudioPcm.a(audioPcm, i, 0, 6);
        this.g = a;
        this.h = true;
        return a;
    }

    public final boolean b() {
        if (this.g.d) {
            return Math.abs(this.a - 1.0f) >= 1.0E-4f || Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 1.0E-4f || this.g.a != this.f.a;
        }
        return false;
    }

    @Override // xsna.qt4
    public final void flush() {
        if (b()) {
            AudioPcm audioPcm = this.f;
            this.d = audioPcm;
            AudioPcm audioPcm2 = this.g;
            this.e = audioPcm2;
            if (!this.h) {
                yek0 yek0Var = this.i;
                if (yek0Var != null) {
                    yek0Var.i = 0;
                    yek0Var.k = 0;
                    yek0Var.m = 0;
                    yek0Var.o = 0;
                    yek0Var.p = 0;
                    yek0Var.q = 0;
                    yek0Var.r = 0;
                    yek0Var.s = 0;
                    yek0Var.t = 0;
                    yek0Var.u = 0;
                }
            } else {
                if (!audioPcm.d) {
                    throw new IllegalStateException(("SonicAudioProcessor inputAudioFormat is not valid: " + this.d).toString());
                }
                if (!audioPcm2.d) {
                    throw new IllegalStateException(("SonicAudioProcessor outputAudioFormat is not valid: " + this.e).toString());
                }
                this.i = new yek0(this.a, audioPcm.a, audioPcm.b, audioPcm2.a);
            }
        }
        this.k = this.b;
    }

    @Override // xsna.qt4
    public final ByteBuffer getOutput() {
        yek0 yek0Var = this.i;
        if (yek0Var != null) {
            int i = yek0Var.b;
            int i2 = yek0Var.k * i * 2;
            if (i2 > 0) {
                if (this.j.capacity() < i2) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.j = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.j.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i, yek0Var.k);
                int i3 = min * i;
                shortBuffer.put(yek0Var.l, 0, i3);
                int i4 = yek0Var.k - min;
                yek0Var.k = i4;
                short[] sArr = yek0Var.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.j.limit(i2);
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer = this.k;
        this.k = this.b;
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01c0 A[LOOP:2: B:22:0x01c0->B:28:0x0203, LOOP_START, PHI: r2
      0x01c0: PHI (r2v45 int) = (r2v43 int), (r2v55 int) binds: [B:21:0x01be, B:28:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0258  */
    @Override // xsna.qt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void queueInput(ByteBuffer byteBuffer) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (byteBuffer.hasRemaining()) {
            yek0 yek0Var = this.i;
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            yek0Var.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i13 = yek0Var.b;
            int i14 = remaining2 / i13;
            short[] c = yek0Var.c(yek0Var.j, yek0Var.i, i14);
            yek0Var.j = c;
            asShortBuffer.get(c, yek0Var.i * i13, ((i14 * i13) * 2) / 2);
            int i15 = yek0Var.i + i14;
            yek0Var.i = i15;
            int i16 = yek0Var.a;
            int i17 = yek0Var.k;
            float f3 = yek0Var.c;
            int i18 = 1;
            if (f3 > 1.00001f || f3 < 0.99999f) {
                int i19 = yek0Var.g;
                if (i15 >= i19) {
                    int i20 = 0;
                    while (true) {
                        int i21 = yek0Var.q;
                        if (i21 > 0) {
                            i4 = Math.min(i19, i21);
                            yek0Var.a(yek0Var.j, i20, i4);
                            yek0Var.q -= i4;
                            i = i19;
                            f = 1.0f;
                        } else {
                            short[] sArr = yek0Var.j;
                            short[] sArr2 = yek0Var.h;
                            int i22 = yek0Var.f;
                            f = 1.0f;
                            int i23 = yek0Var.e;
                            int i24 = i16 > 4000 ? i16 / 4000 : i18;
                            if (i13 == i18 && i24 == i18) {
                                i2 = yek0Var.d(sArr, i20, i23, i22);
                                i = i19;
                            } else {
                                yek0Var.b(sArr, i20, i24);
                                i = i19;
                                int d = yek0Var.d(sArr2, 0, i23 / i24, i22 / i24);
                                if (i24 != 1) {
                                    int i25 = d * i24;
                                    int i26 = i24 * 4;
                                    int i27 = i25 - i26;
                                    int i28 = i25 + i26;
                                    if (i27 >= i23) {
                                        i23 = i27;
                                    }
                                    if (i28 <= i22) {
                                        i22 = i28;
                                    }
                                    if (i13 == 1) {
                                        d = yek0Var.d(sArr, i20, i23, i22);
                                    } else {
                                        yek0Var.b(sArr, i20, 1);
                                        d = yek0Var.d(sArr2, 0, i23, i22);
                                    }
                                }
                                i2 = d;
                            }
                            int i29 = yek0Var.t;
                            int i30 = (i29 == 0 || (i6 = yek0Var.r) == 0 || yek0Var.u > i29 * 3 || i29 * 2 <= yek0Var.s * 3) ? i2 : i6;
                            yek0Var.s = i29;
                            yek0Var.r = i2;
                            if (f3 > 1.0d) {
                                short[] sArr3 = yek0Var.j;
                                if (f3 >= 2.0f) {
                                    i5 = (int) (i30 / (f3 - 1.0f));
                                } else {
                                    yek0Var.q = (int) (((2.0f - f3) * i30) / (f3 - 1.0f));
                                    i5 = i30;
                                }
                                yek0Var.l = yek0Var.c(yek0Var.l, yek0Var.k, i5);
                                yek0Var.e(i5, yek0Var.k, sArr3, i20, i20 + i30);
                                yek0Var.k += i5;
                                i4 = i30 + i5;
                            } else {
                                short[] sArr4 = yek0Var.j;
                                if (f3 < 0.5f) {
                                    i3 = (int) ((i30 * f3) / (1.0f - f3));
                                } else {
                                    yek0Var.q = (int) ((((2.0f * f3) - 1.0f) * i30) / (1.0f - f3));
                                    i3 = i30;
                                }
                                int i31 = i30 + i3;
                                short[] c2 = yek0Var.c(yek0Var.l, yek0Var.k, i31);
                                yek0Var.l = c2;
                                System.arraycopy(sArr4, i20 * i13, c2, yek0Var.k * i13, i30 * i13);
                                int i32 = i20;
                                yek0Var.e(i3, yek0Var.k + i30, sArr4, i20 + i30, i32);
                                i20 = i32;
                                yek0Var.k += i31;
                                i4 = i3;
                            }
                        }
                        i20 += i4;
                        if (i20 + i > i15) {
                            break;
                        }
                        i18 = 1;
                        i19 = i;
                    }
                    short[] sArr5 = yek0Var.j;
                    int length = sArr5.length;
                    jw5.n(length, sArr5.length);
                    yek0Var.j = Arrays.copyOfRange(sArr5, i20 * i13, length);
                    yek0Var.i -= i20;
                    f2 = yek0Var.d;
                    if (f2 != f && yek0Var.k != i17) {
                        i7 = (int) (i16 / f2);
                        while (true) {
                            if (i7 > 16384 && i16 <= 16384) {
                                break;
                            }
                            i7 /= 2;
                            i16 /= 2;
                        }
                        int i33 = yek0Var.k - i17;
                        short[] c3 = yek0Var.c(yek0Var.n, yek0Var.m, i33);
                        yek0Var.n = c3;
                        System.arraycopy(yek0Var.l, i17 * i13, c3, yek0Var.m * i13, i33 * i13);
                        yek0Var.k = i17;
                        int i34 = yek0Var.m + i33;
                        yek0Var.m = i34;
                        int i35 = 1;
                        i8 = i34 - 1;
                        i9 = 0;
                        while (i9 < i8) {
                            while (true) {
                                i11 = yek0Var.o + i35;
                                int i36 = i11 * i7;
                                i12 = yek0Var.p;
                                if (i36 <= i12 * i16) {
                                    break;
                                }
                                yek0Var.l = yek0Var.c(yek0Var.l, yek0Var.k, i35);
                                for (int i37 = 0; i37 < i13; i37++) {
                                    short[] sArr6 = yek0Var.l;
                                    int i38 = (yek0Var.k * i13) + i37;
                                    short[] sArr7 = yek0Var.n;
                                    int i39 = (i9 * i13) + i37;
                                    short s = sArr7[i39];
                                    short s2 = sArr7[i39 + i13];
                                    int i40 = yek0Var.p * i16;
                                    int i41 = yek0Var.o;
                                    int i42 = i41 * i7;
                                    int i43 = (i41 + 1) * i7;
                                    int i44 = i43 - i40;
                                    int i45 = i43 - i42;
                                    sArr6[i38] = (short) ((((i45 - i44) * s2) + (s * i44)) / i45);
                                }
                                yek0Var.p++;
                                yek0Var.k++;
                                i35 = 1;
                            }
                            int i46 = i35;
                            yek0Var.o = i11;
                            if (i11 == i16) {
                                yek0Var.o = 0;
                                if (i12 != i7) {
                                    throw new IllegalStateException(("Sonic newRatePosition != newSampleRate (" + yek0Var.p + '|' + i7 + ')').toString());
                                }
                                yek0Var.p = 0;
                            }
                            i9++;
                            i35 = i46;
                        }
                        int i47 = yek0Var.m;
                        i10 = i47 - 1;
                        if (i10 != 0) {
                            short[] sArr8 = yek0Var.n;
                            System.arraycopy(sArr8, i10 * i13, sArr8, 0, (i47 - i10) * i13);
                            yek0Var.m -= i10;
                        }
                    }
                    wr.c(remaining, byteBuffer);
                }
            } else {
                yek0Var.a(yek0Var.j, 0, i15);
                yek0Var.i = 0;
            }
            f = 1.0f;
            f2 = yek0Var.d;
            if (f2 != f) {
                i7 = (int) (i16 / f2);
                while (true) {
                    if (i7 > 16384) {
                    }
                    i7 /= 2;
                    i16 /= 2;
                }
                int i332 = yek0Var.k - i17;
                short[] c32 = yek0Var.c(yek0Var.n, yek0Var.m, i332);
                yek0Var.n = c32;
                System.arraycopy(yek0Var.l, i17 * i13, c32, yek0Var.m * i13, i332 * i13);
                yek0Var.k = i17;
                int i342 = yek0Var.m + i332;
                yek0Var.m = i342;
                int i352 = 1;
                i8 = i342 - 1;
                i9 = 0;
                while (i9 < i8) {
                }
                int i472 = yek0Var.m;
                i10 = i472 - 1;
                if (i10 != 0) {
                }
            }
            wr.c(remaining, byteBuffer);
        }
    }

    public final String toString() {
        return "SonicAudioProcessor{s/p=" + this.a + "/1.0|iaf/oaf=" + this.d + '/' + this.e + "|a?=" + b() + "|e?=false}";
    }
}
