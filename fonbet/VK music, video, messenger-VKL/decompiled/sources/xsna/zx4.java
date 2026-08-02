package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;

/* compiled from: AudioSpecificConfig.java */
@x2m(objectTypeIndication = 64, tags = {5})
/* loaded from: classes13.dex */
public final class zx4 extends sc6 {
    public static final HashMap V;
    public static final HashMap W;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public byte[] U;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int l = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    static {
        HashMap hashMap = new HashMap();
        V = hashMap;
        HashMap hashMap2 = new HashMap();
        W = hashMap2;
        hashMap.put(0, 96000);
        hashMap.put(1, 88200);
        hashMap.put(2, Integer.valueOf(RtpSenderHelper.AUDIO_BITRATE_MAX));
        hashMap.put(3, 48000);
        hashMap.put(4, 44100);
        hashMap.put(5, 32000);
        hashMap.put(6, 24000);
        hashMap.put(7, 22050);
        hashMap.put(8, 16000);
        hashMap.put(9, 12000);
        hashMap.put(10, 11025);
        hashMap.put(11, 8000);
        hashMap2.put(1, "AAC main");
        hashMap2.put(2, "AAC LC");
        hashMap2.put(3, "AAC SSR");
        hashMap2.put(4, "AAC LTP");
        hashMap2.put(5, "SBR");
        hashMap2.put(6, "AAC Scalable");
        hashMap2.put(7, "TwinVQ");
        hashMap2.put(8, "CELP");
        hashMap2.put(9, "HVXC");
        hashMap2.put(10, "(reserved)");
        hashMap2.put(11, "(reserved)");
        hashMap2.put(12, "TTSI");
        hq.c(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        hq.c(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        hq.c(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        hq.c(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        hq.c(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        hq.c(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        hq.c(25, hashMap2, "ER HVXC", 26, "ER HILN");
        hq.c(27, hashMap2, "ER Parametric", 28, "SSC");
        hq.c(29, hashMap2, "PS", 30, "MPEG Surround");
        hq.c(31, hashMap2, "(escape)", 32, "Layer-1");
        hq.c(33, hashMap2, "Layer-2", 34, "Layer-3");
        hq.c(35, hashMap2, "DST", 36, "ALS");
        hq.c(37, hashMap2, "SLS", 38, "SLS non-core");
        hq.c(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
        hashMap2.put(41, "SMR Main");
    }

    public zx4() {
        this.a = 5;
    }

    public static int f(lb7 lb7Var) throws IOException {
        int a = lb7Var.a(5);
        return a == 31 ? lb7Var.a(6) + 32 : a;
    }

    public static void g(int i, mb7 mb7Var) {
        if (i < 32) {
            mb7Var.a(i, 5);
        } else {
            mb7Var.a(31, 5);
            mb7Var.a(i - 32, 6);
        }
    }

    @Override // xsna.sc6
    public final int a() {
        int i = this.e > 30 ? 11 : 5;
        int i2 = i + 4;
        if (this.f == 15) {
            i2 = i + 28;
        }
        int i3 = i2 + 4;
        int i4 = this.d;
        if (i4 == 5 || i4 == 29) {
            i3 = i2 + 8;
            if (this.l == 15) {
                i3 = i2 + 32;
            }
        }
        if (i4 == 22) {
            i3 += 4;
        }
        int i5 = this.w == 1 ? 16 : 2;
        int i6 = i5 + 1;
        if (this.h == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (i4 == 6 || i4 == 20) {
            i6 = i5 + 4;
        }
        if (this.y == 1) {
            if (i4 == 22) {
                i6 += 16;
            }
            if (i4 == 17 || i4 == 19 || i4 == 20 || i4 == 23) {
                i6 += 3;
            }
            i6++;
            if (this.F == 1) {
                throw new RuntimeException("Not implemented");
            }
        }
        int i7 = i3 + i6;
        int i8 = this.u;
        if (i8 >= 0) {
            int i9 = i7 + 11;
            if (i8 == 695) {
                int i10 = i7 + 16;
                int i11 = this.i;
                if (i11 > 30) {
                    i10 = i7 + 22;
                }
                if (i11 == 5) {
                    i7 = i10 + 1;
                    if (this.j) {
                        i7 = i10 + 5;
                        if (this.l == 15) {
                            i7 = i10 + 29;
                        }
                        int i12 = this.t;
                        if (i12 >= 0) {
                            i7 = i12 == 1352 ? i7 + 12 : i7 + 11;
                        }
                    }
                } else {
                    i7 = i10;
                }
                if (i11 == 22) {
                    int i13 = i7 + 1;
                    if (this.j) {
                        i13 = i7 + 5;
                        if (this.l == 15) {
                            i13 = i7 + 29;
                        }
                    }
                    i7 = i13 + 4;
                }
            } else {
                i7 = i9;
            }
        }
        return (int) Math.ceil(i7 / 8.0d);
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        int i;
        int i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.b);
        byteBuffer.position(byteBuffer.position() + this.b);
        byte[] bArr = new byte[this.b];
        this.U = bArr;
        slice.get(bArr);
        slice.rewind();
        lb7 lb7Var = new lb7(slice);
        int f = f(lb7Var);
        this.d = f;
        this.e = f;
        int a = lb7Var.a(4);
        this.f = a;
        int i3 = 15;
        if (a == 15) {
            this.g = lb7Var.a(24);
        }
        this.h = lb7Var.a(4);
        int i4 = this.d;
        if (i4 == 5 || i4 == 29) {
            this.i = 5;
            this.j = true;
            if (i4 == 29) {
                this.k = true;
            }
            int a2 = lb7Var.a(4);
            this.l = a2;
            if (a2 == 15) {
                this.m = lb7Var.a(24);
            }
            int f2 = f(lb7Var);
            this.d = f2;
            if (f2 == 22) {
                this.n = lb7Var.a(4);
            }
        } else {
            this.i = 0;
        }
        int i5 = this.d;
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                int i6 = this.h;
                this.v = lb7Var.a(1);
                int a3 = lb7Var.a(1);
                this.w = a3;
                if (a3 == 1) {
                    this.x = lb7Var.a(14);
                }
                this.y = lb7Var.a(1);
                if (i6 == 0) {
                    throw new UnsupportedOperationException("can't parse program_config_element yet");
                }
                if (i5 == 6 || i5 == 20) {
                    this.z = lb7Var.a(3);
                }
                if (this.y == 1) {
                    if (i5 == 22) {
                        this.A = lb7Var.a(5);
                        this.B = lb7Var.a(11);
                    }
                    if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                        this.C = lb7Var.b();
                        this.D = lb7Var.b();
                        this.E = lb7Var.b();
                    }
                    int a4 = lb7Var.a(1);
                    this.F = a4;
                    if (a4 == 1) {
                        throw new RuntimeException("not yet implemented");
                    }
                }
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                int a5 = lb7Var.a(1);
                this.G = a5;
                if (a5 == 1) {
                    int a6 = lb7Var.a(2);
                    this.H = a6;
                    if (a6 != 1) {
                        this.J = lb7Var.a(1);
                        this.K = lb7Var.a(2);
                        int a7 = lb7Var.a(1);
                        this.L = a7;
                        if (a7 == 1) {
                            this.M = lb7Var.a(1);
                        }
                    }
                    if (this.H != 0) {
                        this.N = lb7Var.a(1);
                        this.O = lb7Var.a(8);
                        this.P = lb7Var.a(4);
                        this.Q = lb7Var.a(12);
                        this.R = lb7Var.a(2);
                    }
                    this.I = lb7Var.a(1);
                    break;
                } else {
                    int a8 = lb7Var.a(1);
                    this.S = a8;
                    if (a8 == 1) {
                        this.T = lb7Var.a(2);
                        break;
                    }
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.o = lb7Var.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.p = lb7Var.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                int i7 = this.h;
                lb7Var.b();
                lb7Var.b();
                lb7Var.b();
                lb7Var.b();
                if (lb7Var.b()) {
                    lb7Var.b();
                    lb7Var.b();
                    switch (i7) {
                        case 1:
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i2 = 3;
                            break;
                        case 7:
                            i2 = 4;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    for (int i8 = 0; i8 < i2; i8++) {
                        lb7Var.b();
                        lb7Var.a(4);
                        lb7Var.a(4);
                        lb7Var.a(3);
                        lb7Var.a(2);
                        boolean b = lb7Var.b();
                        boolean b2 = lb7Var.b();
                        if (b) {
                            lb7Var.a(2);
                            lb7Var.b();
                            lb7Var.a(2);
                        }
                        if (b2) {
                            lb7Var.a(2);
                            lb7Var.a(2);
                            lb7Var.b();
                        }
                        lb7Var.b();
                    }
                }
                while (lb7Var.a(4) != 0) {
                    int a9 = lb7Var.a(4);
                    if (a9 == i3) {
                        i = lb7Var.a(8);
                        a9 += i;
                    } else {
                        i = 0;
                    }
                    if (i == 255) {
                        a9 += lb7Var.a(16);
                    }
                    for (int i9 = 0; i9 < a9; i9++) {
                        lb7Var.a(8);
                    }
                    i3 = 15;
                }
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i10 = this.d;
        if (i10 != 17 && i10 != 39) {
            switch (i10) {
            }
            if (this.i != 5 || (lb7Var.c.limit() * 8) - lb7Var.b < 16) {
            }
            int a10 = lb7Var.a(11);
            this.s = a10;
            this.u = a10;
            if (a10 == 695) {
                int f3 = f(lb7Var);
                this.i = f3;
                if (f3 == 5) {
                    boolean b3 = lb7Var.b();
                    this.j = b3;
                    if (b3) {
                        int a11 = lb7Var.a(4);
                        this.l = a11;
                        if (a11 == 15) {
                            this.m = lb7Var.a(24);
                        }
                        if ((lb7Var.c.limit() * 8) - lb7Var.b >= 12) {
                            int a12 = lb7Var.a(11);
                            this.s = a12;
                            this.t = a12;
                            if (a12 == 1352) {
                                this.k = lb7Var.b();
                            }
                        }
                    }
                }
                if (this.i == 22) {
                    boolean b4 = lb7Var.b();
                    this.j = b4;
                    if (b4) {
                        int a13 = lb7Var.a(4);
                        this.l = a13;
                        if (a13 == 15) {
                            this.m = lb7Var.a(24);
                        }
                    }
                    this.n = lb7Var.a(4);
                    return;
                }
                return;
            }
            return;
        }
        int a14 = lb7Var.a(2);
        this.q = a14;
        if (a14 == 2 || a14 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a14 == 3) {
            int a15 = lb7Var.a(1);
            this.r = a15;
            if (a15 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.i != 5) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zx4.class != obj.getClass()) {
            return false;
        }
        zx4 zx4Var = (zx4) obj;
        return this.D == zx4Var.D && this.C == zx4Var.C && this.E == zx4Var.E && this.d == zx4Var.d && this.h == zx4Var.h && this.x == zx4Var.x && this.w == zx4Var.w && this.r == zx4Var.r && this.q == zx4Var.q && this.L == zx4Var.L && this.i == zx4Var.i && this.n == zx4Var.n && this.y == zx4Var.y && this.F == zx4Var.F && this.m == zx4Var.m && this.l == zx4Var.l && this.p == zx4Var.p && this.v == zx4Var.v && this.R == zx4Var.R && this.S == zx4Var.S && this.T == zx4Var.T && this.Q == zx4Var.Q && this.O == zx4Var.O && this.N == zx4Var.N && this.P == zx4Var.P && this.K == zx4Var.K && this.J == zx4Var.J && this.G == zx4Var.G && this.z == zx4Var.z && this.B == zx4Var.B && this.A == zx4Var.A && this.I == zx4Var.I && this.H == zx4Var.H && this.k == zx4Var.k && this.o == zx4Var.o && this.g == zx4Var.g && this.f == zx4Var.f && this.j == zx4Var.j && this.s == zx4Var.s && this.M == zx4Var.M && Arrays.equals(this.U, zx4Var.U);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Arrays.hashCode(this.U) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + 1) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + 1;
    }

    @Override // xsna.sc6
    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(skd.c(0, this.U));
        sb.append(", audioObjectType=");
        sb.append(this.d);
        sb.append(" (");
        Integer valueOf = Integer.valueOf(this.d);
        HashMap hashMap = W;
        sb.append((String) hashMap.get(valueOf));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.f);
        sb.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f);
        HashMap hashMap2 = V;
        sb.append(hashMap2.get(valueOf2));
        sb.append("), samplingFrequency=");
        sb.append(this.g);
        sb.append(", channelConfiguration=");
        sb.append(this.h);
        if (this.i > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.i);
            sb.append(" (");
            sb.append((String) hashMap.get(Integer.valueOf(this.i)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.j);
            sb.append(", psPresentFlag=");
            sb.append(this.k);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.l);
            sb.append(" (");
            sb.append(hashMap2.get(Integer.valueOf(this.l)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.m);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.n);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.s);
        sb.append(", frameLengthFlag=");
        sb.append(this.v);
        sb.append(", dependsOnCoreCoder=");
        sb.append(this.w);
        sb.append(", coreCoderDelay=");
        sb.append(this.x);
        sb.append(", extensionFlag=");
        sb.append(this.y);
        sb.append(", layerNr=");
        sb.append(this.z);
        sb.append(", numOfSubFrame=");
        sb.append(this.A);
        sb.append(", layer_length=");
        sb.append(this.B);
        sb.append(", aacSectionDataResilienceFlag=");
        sb.append(this.C);
        sb.append(", aacScalefactorDataResilienceFlag=");
        sb.append(this.D);
        sb.append(", aacSpectralDataResilienceFlag=");
        sb.append(this.E);
        sb.append(", extensionFlag3=");
        sb.append(this.F);
        sb.append(", isBaseLayer=");
        sb.append(this.G);
        sb.append(", paraMode=");
        sb.append(this.H);
        sb.append(", paraExtensionFlag=");
        sb.append(this.I);
        sb.append(", hvxcVarMode=");
        sb.append(this.J);
        sb.append(", hvxcRateMode=");
        sb.append(this.K);
        sb.append(", erHvxcExtensionFlag=");
        sb.append(this.L);
        sb.append(", var_ScalableFlag=");
        sb.append(this.M);
        sb.append(", hilnQuantMode=");
        sb.append(this.N);
        sb.append(", hilnMaxNumLine=");
        sb.append(this.O);
        sb.append(", hilnSampleRateCode=");
        sb.append(this.P);
        sb.append(", hilnFrameLength=");
        sb.append(this.Q);
        sb.append(", hilnContMode=");
        sb.append(this.R);
        sb.append(", hilnEnhaLayer=");
        sb.append(this.S);
        sb.append(", hilnEnhaQuantMode=");
        return vu5.b(sb, this.T, '}');
    }
}
