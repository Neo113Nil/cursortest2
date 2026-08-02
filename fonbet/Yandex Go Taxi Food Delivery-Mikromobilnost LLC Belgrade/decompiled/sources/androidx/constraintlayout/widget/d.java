package androidx.constraintlayout.widget;

import androidx.constraintlayout.widget.e;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class d {
    public int[] a = new int[10];
    public int[] b = new int[10];
    public int c = 0;
    public int[] d = new int[10];
    public float[] e = new float[10];
    public int f = 0;
    public int[] g = new int[5];
    public String[] h = new String[5];
    public int i = 0;
    public int[] j = new int[4];
    public boolean[] k = new boolean[4];
    public int l = 0;

    public final void a(float f, int i) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }

    public final void e(e.a aVar) {
        for (int i = 0; i < this.c; i++) {
            int i2 = this.a[i];
            int i3 = this.b[i];
            int[] iArr = e.h;
            if (i2 == 6) {
                aVar.e.D = i3;
            } else if (i2 == 7) {
                aVar.e.E = i3;
            } else if (i2 == 8) {
                aVar.e.K = i3;
            } else if (i2 == 27) {
                aVar.e.F = i3;
            } else if (i2 == 28) {
                aVar.e.H = i3;
            } else if (i2 == 41) {
                aVar.e.W = i3;
            } else if (i2 == 42) {
                aVar.e.X = i3;
            } else if (i2 == 61) {
                aVar.e.A = i3;
            } else if (i2 == 62) {
                aVar.e.B = i3;
            } else if (i2 == 72) {
                aVar.e.g0 = i3;
            } else if (i2 == 73) {
                aVar.e.h0 = i3;
            } else if (i2 == 88) {
                aVar.d.l = i3;
            } else if (i2 == 89) {
                aVar.d.m = i3;
            } else if (i2 == 2) {
                aVar.e.J = i3;
            } else if (i2 == 31) {
                aVar.e.L = i3;
            } else if (i2 == 34) {
                aVar.e.I = i3;
            } else if (i2 == 38) {
                aVar.a = i3;
            } else if (i2 == 64) {
                aVar.d.b = i3;
            } else if (i2 == 66) {
                aVar.d.f = i3;
            } else if (i2 == 76) {
                aVar.d.e = i3;
            } else if (i2 == 78) {
                aVar.c.c = i3;
            } else if (i2 == 97) {
                aVar.e.p0 = i3;
            } else if (i2 == 93) {
                aVar.e.M = i3;
            } else if (i2 != 94) {
                switch (i2) {
                    case 11:
                        aVar.e.Q = i3;
                        break;
                    case 12:
                        aVar.e.R = i3;
                        break;
                    case 13:
                        aVar.e.N = i3;
                        break;
                    case 14:
                        aVar.e.P = i3;
                        break;
                    case 15:
                        aVar.e.S = i3;
                        break;
                    case 16:
                        aVar.e.O = i3;
                        break;
                    case 17:
                        aVar.e.e = i3;
                        break;
                    case 18:
                        aVar.e.f = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                aVar.e.d = i3;
                                break;
                            case 22:
                                aVar.c.b = i3;
                                break;
                            case 23:
                                aVar.e.c = i3;
                                break;
                            case 24:
                                aVar.e.G = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 54:
                                        aVar.e.Y = i3;
                                        break;
                                    case SODA_DE_DE_VALUE:
                                        aVar.e.Z = i3;
                                        break;
                                    case 56:
                                        aVar.e.a0 = i3;
                                        break;
                                    case SODA_ES_ES_VALUE:
                                        aVar.e.b0 = i3;
                                        break;
                                    case 58:
                                        aVar.e.c0 = i3;
                                        break;
                                    case 59:
                                        aVar.e.d0 = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                aVar.d.c = i3;
                                                break;
                                            case 83:
                                                aVar.f.i = i3;
                                                break;
                                            case HProv.ALG_SID_NO_HASH /* 84 */:
                                                aVar.d.j = i3;
                                                break;
                                        }
                                }
                        }
                }
            } else {
                aVar.e.T = i3;
            }
        }
        for (int i4 = 0; i4 < this.f; i4++) {
            int i5 = this.d[i4];
            float f = this.e[i4];
            int[] iArr2 = e.h;
            if (i5 == 19) {
                aVar.e.g = f;
            } else if (i5 == 20) {
                aVar.e.x = f;
            } else if (i5 == 37) {
                aVar.e.y = f;
            } else if (i5 == 60) {
                aVar.f.b = f;
            } else if (i5 == 63) {
                aVar.e.C = f;
            } else if (i5 == 79) {
                aVar.d.g = f;
            } else if (i5 == 85) {
                aVar.d.i = f;
            } else if (i5 == 39) {
                aVar.e.V = f;
            } else if (i5 != 40) {
                switch (i5) {
                    case 43:
                        aVar.c.d = f;
                        break;
                    case 44:
                        e.C0007e c0007e = aVar.f;
                        c0007e.n = f;
                        c0007e.m = true;
                        break;
                    case 45:
                        aVar.f.c = f;
                        break;
                    case 46:
                        aVar.f.d = f;
                        break;
                    case 47:
                        aVar.f.e = f;
                        break;
                    case 48:
                        aVar.f.f = f;
                        break;
                    case 49:
                        aVar.f.g = f;
                        break;
                    case 50:
                        aVar.f.h = f;
                        break;
                    case SAFETY_TIPS_VALUE:
                        aVar.f.j = f;
                        break;
                    case 52:
                        aVar.f.k = f;
                        break;
                    case 53:
                        aVar.f.l = f;
                        break;
                    default:
                        switch (i5) {
                            case 67:
                                aVar.d.h = f;
                                break;
                            case TRANSLATE_KIT_VALUE:
                                aVar.c.e = f;
                                break;
                            case 69:
                                aVar.e.e0 = f;
                                break;
                            case 70:
                                aVar.e.f0 = f;
                                break;
                        }
                }
            } else {
                aVar.e.U = f;
            }
        }
        for (int i6 = 0; i6 < this.i; i6++) {
            int i7 = this.g[i6];
            String str = this.h[i6];
            int[] iArr3 = e.h;
            if (i7 == 5) {
                aVar.e.z = str;
            } else if (i7 == 65) {
                aVar.d.d = str;
            } else if (i7 == 74) {
                e.b bVar = aVar.e;
                bVar.k0 = str;
                bVar.j0 = null;
            } else if (i7 == 77) {
                aVar.e.l0 = str;
            } else if (i7 == 90) {
                aVar.d.k = str;
            }
        }
        for (int i8 = 0; i8 < this.l; i8++) {
            int i9 = this.j[i8];
            boolean z = this.k[i8];
            int[] iArr4 = e.h;
            if (i9 == 44) {
                aVar.f.m = z;
            } else if (i9 == 75) {
                aVar.e.o0 = z;
            } else if (i9 == 80) {
                aVar.e.m0 = z;
            } else if (i9 == 81) {
                aVar.e.n0 = z;
            }
        }
    }
}
