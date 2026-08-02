package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes12.dex */
public final class nyt {
    public ByteBuffer b;
    public myt c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    @NonNull
    public final myt b() {
        byte[] bArr;
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int c = c();
            myt mytVar = this.c;
            mytVar.h = (c & 128) != 0;
            mytVar.i = (int) Math.pow(2.0d, (c & 7) + 1);
            this.c.j = c();
            myt mytVar2 = this.c;
            c();
            mytVar2.getClass();
            if (this.c.h && !a()) {
                myt mytVar3 = this.c;
                mytVar3.a = e(mytVar3.i);
                myt mytVar4 = this.c;
                mytVar4.k = mytVar4.a[mytVar4.j];
            }
        } else {
            this.c.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int c2 = c();
                if (c2 == 33) {
                    int c3 = c();
                    if (c3 == 1) {
                        f();
                    } else if (c3 == 249) {
                        this.c.d = new jyt();
                        c();
                        int c4 = c();
                        jyt jytVar = this.c.d;
                        int i2 = (c4 & 28) >> 2;
                        jytVar.g = i2;
                        if (i2 == 0) {
                            jytVar.g = 1;
                        }
                        jytVar.f = (c4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        jyt jytVar2 = this.c.d;
                        jytVar2.i = s * 10;
                        jytVar2.h = c();
                        c();
                    } else if (c3 == 254) {
                        f();
                    } else if (c3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c2 == 44) {
                    myt mytVar5 = this.c;
                    if (mytVar5.d == null) {
                        mytVar5.d = new jyt();
                    }
                    this.c.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int c5 = c();
                    boolean z2 = (c5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c5 & 7) + 1);
                    jyt jytVar3 = this.c.d;
                    jytVar3.e = (c5 & 64) != 0;
                    if (z2) {
                        jytVar3.k = e(pow);
                    } else {
                        jytVar3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        myt mytVar6 = this.c;
                        mytVar6.c++;
                        mytVar6.e.add(mytVar6.d);
                    }
                } else if (c2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            myt mytVar7 = this.c;
            if (mytVar7.c < 0) {
                mytVar7.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.c.b = 1;
                return;
            }
        }
    }

    @Nullable
    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }
}
