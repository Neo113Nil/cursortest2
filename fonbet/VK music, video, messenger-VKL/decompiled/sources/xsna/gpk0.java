package xsna;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import xsna.fyt;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes12.dex */
public final class gpk0 implements fyt {
    public int[] a;
    public final fyt.a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public myt l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;

    @Nullable
    public Boolean s;
    public final int[] b = new int[256];

    @NonNull
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public gpk0(@NonNull fyt.a aVar, myt mytVar, ByteBuffer byteBuffer, int i) {
        this.c = aVar;
        this.l = new myt();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = mytVar;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = mytVar.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((jyt) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i2 = mytVar.f;
                this.r = i2 / highestOneBit;
                int i3 = mytVar.g;
                this.q = i3 / highestOneBit;
                int i4 = i2 * i3;
                cl3 cl3Var = ((dyt) this.c).b;
                this.i = cl3Var == null ? new byte[i4] : (byte[]) cl3Var.c(i4, byte[].class);
                fyt.a aVar2 = this.c;
                int i5 = this.r * this.q;
                cl3 cl3Var2 = ((dyt) aVar2).b;
                this.j = cl3Var2 == null ? new int[i5] : (int[]) cl3Var2.c(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        this.k = (this.k + 1) % this.l.c;
    }

    public final Bitmap b() {
        Boolean bool = this.s;
        Bitmap d = ((dyt) this.c).a.d(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        d.setHasAlpha(true);
        return d;
    }

    public final void c(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r5.j == r35.h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(jyt jytVar, jyt jytVar2) {
        int[] iArr;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr2;
        int i6;
        short[] sArr;
        short s;
        short s2;
        int i7;
        Bitmap bitmap;
        int i8;
        int i9;
        int i10;
        fyt.a aVar = this.c;
        byte b2 = 0;
        int[] iArr3 = this.j;
        if (jytVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                ((dyt) aVar).a.c(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr3, 0);
        }
        if (jytVar2 != null && jytVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (jytVar2 != null && (i7 = jytVar2.g) > 0) {
            if (i7 == 2) {
                if (!jytVar.f) {
                    myt mytVar = this.l;
                    i8 = mytVar.k;
                    if (jytVar.k != null) {
                    }
                    int i11 = jytVar2.d;
                    int i12 = this.p;
                    int i13 = i11 / i12;
                    int i14 = jytVar2.b / i12;
                    int i15 = jytVar2.c / i12;
                    int i16 = jytVar2.a / i12;
                    int i17 = this.r;
                    i9 = (i14 * i17) + i16;
                    i10 = (i13 * i17) + i9;
                    while (i9 < i10) {
                        int i18 = i9 + i15;
                        for (int i19 = i9; i19 < i18; i19++) {
                            iArr3[i19] = i8;
                        }
                        i9 += this.r;
                    }
                }
                i8 = 0;
                int i112 = jytVar2.d;
                int i122 = this.p;
                int i132 = i112 / i122;
                int i142 = jytVar2.b / i122;
                int i152 = jytVar2.c / i122;
                int i162 = jytVar2.a / i122;
                int i172 = this.r;
                i9 = (i142 * i172) + i162;
                i10 = (i132 * i172) + i9;
                while (i9 < i10) {
                }
            } else if (i7 == 3 && (bitmap = this.m) != null) {
                int i20 = this.q;
                int i21 = this.r;
                bitmap.getPixels(iArr3, 0, i21, 0, 0, i21, i20);
            }
        }
        this.d.position(jytVar.j);
        int i22 = jytVar.c * jytVar.d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i22) {
            cl3 cl3Var = ((dyt) aVar).b;
            this.i = cl3Var == null ? new byte[i22] : (byte[]) cl3Var.c(i22, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr2 = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int i23 = this.d.get() & 255;
        int i24 = 1;
        int i25 = 1 << i23;
        int i26 = i25 + 1;
        int i27 = i25 + 2;
        int i28 = i23 + 1;
        int i29 = (1 << i28) - 1;
        int i30 = 0;
        while (i30 < i25) {
            sArr2[i30] = 0;
            bArr3[i30] = (byte) i30;
            i30++;
            i24 = i24;
        }
        int i31 = i24;
        byte[] bArr5 = this.e;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = i28;
        int i41 = i27;
        int i42 = i29;
        short s3 = -1;
        while (true) {
            if (i32 >= i22) {
                iArr = iArr3;
                b = b2;
                break;
            }
            if (i33 == 0) {
                s = -1;
                int i43 = this.d.get() & 255;
                if (i43 <= 0) {
                    sArr = sArr2;
                    iArr = iArr3;
                } else {
                    ByteBuffer byteBuffer = this.d;
                    sArr = sArr2;
                    iArr = iArr3;
                    byteBuffer.get(this.e, 0, Math.min(i43, byteBuffer.remaining()));
                }
                if (i43 <= 0) {
                    this.o = 3;
                    b = 0;
                    break;
                }
                i33 = i43;
                i34 = 0;
            } else {
                sArr = sArr2;
                iArr = iArr3;
                s = -1;
            }
            i36 += (bArr5[i34] & 255) << i35;
            i34++;
            i33--;
            int i44 = i35 + 8;
            int i45 = i41;
            int i46 = i40;
            short s4 = s3;
            int i47 = i38;
            while (true) {
                i35 = i44;
                if (i44 < i46) {
                    s3 = s4;
                    i38 = i47;
                    i40 = i46;
                    iArr3 = iArr;
                    b2 = 0;
                    i41 = i45;
                    sArr2 = sArr;
                    break;
                }
                int i48 = i36 & i42;
                i36 >>= i46;
                i35 -= i46;
                if (i48 == i25) {
                    i46 = i28;
                    i45 = i27;
                    i42 = i29;
                    i44 = i35;
                    s4 = s;
                } else {
                    if (i48 == i26) {
                        i41 = i45;
                        i40 = i46;
                        s3 = s4;
                        i38 = i47;
                        sArr2 = sArr;
                        iArr3 = iArr;
                        b2 = 0;
                        break;
                    }
                    int i49 = i46;
                    if (s4 == s) {
                        bArr2[i37] = bArr3[i48 == true ? 1 : 0];
                        i37++;
                        i32++;
                        s4 = i48 == true ? 1 : 0;
                        i47 = s4;
                        i44 = i35;
                        i46 = i49;
                    } else {
                        if (i48 >= i45) {
                            bArr4[i39] = (byte) i47;
                            i39++;
                            s2 = s4;
                        } else {
                            s2 = i48 == true ? 1 : 0;
                        }
                        while (s2 >= i25) {
                            bArr4[i39] = bArr3[s2];
                            i39++;
                            s2 = sArr[s2];
                        }
                        i47 = bArr3[s2] & 255;
                        byte b3 = (byte) i47;
                        bArr2[i37] = b3;
                        while (true) {
                            i37++;
                            i32++;
                            if (i39 <= 0) {
                                break;
                            }
                            i39--;
                            bArr2[i37] = bArr4[i39];
                        }
                        if (i45 < 4096) {
                            sArr[i45] = s4;
                            bArr3[i45] = b3;
                            i45++;
                            if ((i45 & i42) == 0 && i45 < 4096) {
                                i46 = i49 + 1;
                                i42 += i45;
                                i44 = i35;
                                s4 = i48 == true ? 1 : 0;
                            }
                        }
                        i46 = i49;
                        i44 = i35;
                        s4 = i48 == true ? 1 : 0;
                    }
                    s = -1;
                }
            }
        }
        Arrays.fill(bArr2, i37, i22, b);
        if (jytVar.e || this.p != i31) {
            int i50 = jytVar.d;
            int i51 = this.p;
            int i52 = i50 / i51;
            int i53 = jytVar.b / i51;
            int i54 = jytVar.c / i51;
            int i55 = jytVar.a / i51;
            boolean z = this.k == 0;
            byte[] bArr6 = this.i;
            int[] iArr4 = this.a;
            Boolean bool = this.s;
            int i56 = 8;
            int i57 = 0;
            int i58 = 1;
            int i59 = 0;
            while (i59 < i52) {
                if (jytVar.e) {
                    if (i57 >= i52) {
                        i58++;
                        if (i58 == 2) {
                            i57 = 4;
                        } else if (i58 == 3) {
                            i56 = 4;
                            i57 = 2;
                        } else if (i58 == 4) {
                            i57 = 1;
                            i56 = 2;
                        }
                    }
                    i = i57 + i56;
                } else {
                    i = i57;
                    i57 = i59;
                }
                int i60 = i57 + i53;
                int i61 = i52;
                boolean z2 = i51 == 1;
                if (i60 < this.q) {
                    int i62 = this.r;
                    int i63 = i60 * i62;
                    int i64 = i63 + i55;
                    i3 = i53;
                    int i65 = i64 + i54;
                    int i66 = i63 + i62;
                    if (i66 < i65) {
                        i65 = i66;
                    }
                    i4 = i54;
                    int i67 = i59 * i51 * jytVar.c;
                    int[] iArr5 = this.j;
                    if (z2) {
                        while (i64 < i65) {
                            int i68 = i64;
                            int i69 = iArr4[bArr6[i67] & 255];
                            if (i69 != 0) {
                                iArr5[i68] = i69;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i67 += i51;
                            i64 = i68 + 1;
                        }
                    } else {
                        int b4 = ir.b(i65, i64, i51, i67);
                        while (i64 < i65) {
                            int i70 = i64;
                            int i71 = jytVar.c;
                            int i72 = i51;
                            int i73 = i67;
                            int i74 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            while (true) {
                                if (i73 >= this.p + i67) {
                                    i5 = i65;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i5 = i65;
                                if (i73 >= bArr7.length || i73 >= b4) {
                                    break;
                                }
                                int i79 = this.a[bArr7[i73] & 255];
                                if (i79 != 0) {
                                    i74 += (i79 >> 24) & 255;
                                    i75 += (i79 >> 16) & 255;
                                    i76 += (i79 >> 8) & 255;
                                    i77 += i79 & 255;
                                    i78++;
                                }
                                i73++;
                                i65 = i5;
                            }
                            int i80 = i67 + i71;
                            int i81 = i80;
                            while (i81 < this.p + i80) {
                                byte[] bArr8 = this.i;
                                int i82 = i80;
                                if (i81 >= bArr8.length || i81 >= b4) {
                                    break;
                                }
                                int i83 = this.a[bArr8[i81] & 255];
                                if (i83 != 0) {
                                    i74 += (i83 >> 24) & 255;
                                    i75 += (i83 >> 16) & 255;
                                    i76 += (i83 >> 8) & 255;
                                    i77 += i83 & 255;
                                    i78++;
                                }
                                i81++;
                                i80 = i82;
                            }
                            int i84 = i78 == 0 ? 0 : ((i74 / i78) << 24) | ((i75 / i78) << 16) | ((i76 / i78) << 8) | (i77 / i78);
                            if (i84 != 0) {
                                iArr5[i70] = i84;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i67 += i72;
                            i64 = i70 + 1;
                            i51 = i72;
                            i65 = i5;
                        }
                    }
                    i2 = i51;
                } else {
                    i2 = i51;
                    i3 = i53;
                    i4 = i54;
                }
                i59++;
                i57 = i;
                i52 = i61;
                i54 = i4;
                i53 = i3;
                i51 = i2;
            }
            if (this.s == null) {
                this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i85 = jytVar.d;
            int i86 = jytVar.b;
            int i87 = jytVar.c;
            int i88 = jytVar.a;
            byte b5 = this.k == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.i;
            int[] iArr6 = this.a;
            int i89 = -1;
            for (int i90 = b; i90 < i85; i90++) {
                int i91 = this.r;
                int i92 = (i90 + i86) * i91;
                int i93 = i92 + i88;
                int i94 = i93 + i87;
                int i95 = i92 + i91;
                if (i95 < i94) {
                    i94 = i95;
                }
                int i96 = jytVar.c * i90;
                while (i93 < i94) {
                    int i97 = bArr9[i96];
                    int i98 = i97 & 255;
                    if (i98 != i89) {
                        int i99 = iArr6[i98];
                        if (i99 != 0) {
                            this.j[i93] = i99;
                        } else {
                            i89 = i97;
                        }
                    }
                    i96++;
                    i93++;
                }
            }
            Boolean bool2 = this.s;
            this.s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.s != null || b5 == 0 || i89 == -1));
        }
        if (this.n && ((i6 = jytVar.g) == 0 || i6 == 1)) {
            if (this.m == null) {
                this.m = b();
            }
            Bitmap bitmap3 = this.m;
            int i100 = this.q;
            int i101 = this.r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i101, 0, 0, i101, i100);
        } else {
            iArr2 = iArr;
        }
        Bitmap b6 = b();
        int i102 = this.q;
        int i103 = this.r;
        b6.setPixels(iArr2, 0, i103, 0, 0, i103, i102);
        return b6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x000d, TRY_LEAVE, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    @Override // xsna.fyt
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap getNextFrame() {
        int i;
        int[] iArr;
        try {
            if (this.l.c > 0) {
                if (this.k < 0) {
                }
                i = this.o;
                if (i != 1 && i != 2) {
                    this.o = 0;
                    if (this.e == null) {
                        cl3 cl3Var = ((dyt) this.c).b;
                        this.e = cl3Var == null ? new byte[255] : (byte[]) cl3Var.c(255, byte[].class);
                    }
                    jyt jytVar = (jyt) this.l.e.get(this.k);
                    int i2 = this.k - 1;
                    jyt jytVar2 = i2 < 0 ? (jyt) this.l.e.get(i2) : null;
                    iArr = jytVar.k;
                    if (iArr != null) {
                        iArr = this.l.a;
                    }
                    this.a = iArr;
                    if (iArr != null) {
                        this.o = 1;
                        return null;
                    }
                    if (jytVar.f) {
                        System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                        int[] iArr2 = this.b;
                        this.a = iArr2;
                        iArr2[jytVar.h] = 0;
                        if (jytVar.g == 2 && this.k == 0) {
                            this.s = Boolean.TRUE;
                        }
                    }
                    return d(jytVar, jytVar2);
                }
                return null;
            }
            if (Log.isLoggable("gpk0", 3)) {
                int i3 = this.l.c;
            }
            this.o = 1;
            i = this.o;
            if (i != 1) {
                this.o = 0;
                if (this.e == null) {
                }
                jyt jytVar3 = (jyt) this.l.e.get(this.k);
                int i22 = this.k - 1;
                if (i22 < 0) {
                }
                iArr = jytVar3.k;
                if (iArr != null) {
                }
                this.a = iArr;
                if (iArr != null) {
                }
            }
            return null;
        } finally {
        }
    }
}
