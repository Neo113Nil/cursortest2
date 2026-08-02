package xsna;

import java.nio.ByteBuffer;
import xsna.hsu;

/* compiled from: H264SpsInfo.java */
/* loaded from: classes3.dex */
public final class lsu {
    public int a;
    public int b;

    public static lsu a(int i, byte[] bArr) {
        boolean z;
        try {
            hsu hsuVar = new hsu(bArr, i);
            if ((hsuVar.d() & 31) != 7) {
                return null;
            }
            int i2 = i - 1;
            int i3 = 0;
            if (i2 >= 3) {
                int i4 = i - 4;
                for (int i5 = 1; i5 <= i4; i5++) {
                    if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 3) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return c(hsuVar);
            }
            ByteBuffer allocate = ByteBuffer.allocate(i2);
            allocate.put(bArr, 1, i2);
            if (allocate.position() >= 3) {
                int position = allocate.position() - 3;
                while (i3 <= position) {
                    if (allocate.get(i3) == 0 && allocate.get(i3 + 1) == 0) {
                        int i6 = i3 + 2;
                        if (allocate.get(i6) == 3) {
                            if (i6 < allocate.position()) {
                                System.arraycopy(allocate.array(), i3 + 3, allocate.array(), i6, (allocate.position() - i6) - 1);
                                allocate.position(allocate.position() - 1);
                            }
                            position = allocate.position() - 3;
                            i3 = i6;
                        }
                    }
                    i3++;
                }
            }
            return c(new hsu(allocate.array(), allocate.position()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean b(hsu hsuVar) throws hsu.a {
        int e = hsuVar.e();
        if (e > 1024) {
            return false;
        }
        hsuVar.f(8);
        for (int i = 0; i <= e; i++) {
            hsuVar.e();
            hsuVar.e();
            hsuVar.f(1);
        }
        hsuVar.f(20);
        return true;
    }

    public static lsu c(hsu hsuVar) {
        int i;
        int i2;
        int i3;
        int b;
        try {
            int d = hsuVar.d();
            hsuVar.f(16);
            hsuVar.e();
            int i4 = 0;
            if (d == 100 || d == 110 || d == 122 || d == 244 || d == 44 || d == 83 || d == 86 || d == 118 || d == 128 || d == 138 || d == 144) {
                int e = hsuVar.e();
                if (e == 3) {
                    hsuVar.f(1);
                }
                hsuVar.e();
                hsuVar.e();
                hsuVar.f(1);
                if (hsuVar.b() != 0) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= (e != 3 ? 8 : 12)) {
                            break;
                        }
                        if (hsuVar.b() != 0) {
                            if (i5 < 6) {
                                d(hsuVar, 16);
                            } else {
                                d(hsuVar, 64);
                            }
                        }
                        i5++;
                    }
                }
            }
            hsuVar.e();
            int e2 = hsuVar.e();
            if (e2 == 0) {
                hsuVar.e();
            } else if (e2 == 1) {
                hsuVar.f(1);
                hsuVar.c();
                hsuVar.c();
                int e3 = hsuVar.e();
                if (e3 > 1024) {
                    return null;
                }
                for (int i6 = 0; i6 < e3; i6++) {
                    hsuVar.c();
                }
            }
            hsuVar.e();
            hsuVar.f(1);
            int e4 = hsuVar.e();
            int e5 = hsuVar.e();
            int b2 = hsuVar.b();
            if (b2 == 0) {
                hsuVar.f(1);
            }
            hsuVar.f(1);
            if (hsuVar.b() != 0) {
                i4 = hsuVar.e();
                i = hsuVar.e();
                i2 = hsuVar.e();
                i3 = hsuVar.e();
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            lsu lsuVar = new lsu();
            lsuVar.a = (((e4 + 1) * 16) - (i4 * 2)) - (i * 2);
            lsuVar.b = ((((e5 + 1) * (2 - b2)) * 16) - (i2 * 2)) - (i3 * 2);
            if (hsuVar.b() != 0) {
                if (hsuVar.b() != 0 && hsuVar.d() == 255) {
                    hsuVar.f(32);
                }
                if (hsuVar.b() != 0) {
                    hsuVar.f(1);
                }
                if (hsuVar.b() != 0) {
                    hsuVar.f(4);
                    if (hsuVar.b() != 0) {
                        hsuVar.f(24);
                    }
                }
                if (hsuVar.b() != 0) {
                    hsuVar.e();
                    hsuVar.e();
                }
                if (hsuVar.b() != 0) {
                    hsuVar.f(65);
                }
                int b3 = hsuVar.b();
                if ((b3 == 0 || b(hsuVar)) && ((b = hsuVar.b()) == 0 || b(hsuVar))) {
                    if (b3 != 0 || b != 0) {
                        hsuVar.f(1);
                    }
                    hsuVar.f(1);
                    if (hsuVar.b() != 0) {
                        hsuVar.f(1);
                        hsuVar.e();
                        hsuVar.e();
                        hsuVar.e();
                        hsuVar.e();
                        hsuVar.e();
                        hsuVar.e();
                    }
                }
                return null;
            }
            return lsuVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static void d(hsu hsuVar, int i) throws hsu.a {
        int i2 = 8;
        int i3 = 0;
        int i4 = 8;
        while (i3 < i) {
            if (i2 != 0) {
                i2 = ((hsuVar.c() + i4) + 256) % 256;
            }
            i4 = i2;
            if (i4 == 0) {
                return;
            }
            i3++;
            i2 = i4;
        }
    }
}
