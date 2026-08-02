package xsna;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import xsna.fqg0;

/* compiled from: RtmpChunkStream.java */
/* loaded from: classes3.dex */
public final class zpg0 {
    public boolean a;
    public fqg0 b;
    public boolean c;
    public boolean d;
    public ByteBuffer e;
    public int f;
    public int g;
    public byte h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;

    /* compiled from: RtmpChunkStream.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fqg0.b.values().length];
            a = iArr;
            try {
                iArr[fqg0.b.RTMP_COMMAND_RESPONSE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[fqg0.b.RTMP_COMMAND_RESPONSE_CONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[fqg0.b.RTMP_COMMAND_RESPONSE_CREATE_STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(ByteBuffer byteBuffer) {
        int i;
        char c;
        int i2;
        String g;
        int length;
        int i3;
        double e;
        int i4;
        int i5;
        int indexOf;
        boolean z;
        int min;
        fqg0 fqg0Var = this.b;
        ByteBuffer byteBuffer2 = this.e;
        this.n = 0;
        if (this.d) {
            byte b = byteBuffer.get(0);
            int i6 = (b & 255) >> 6;
            int i7 = b & CharsetEncoder.DEFAULT_REPLACEMENT;
            i2 = i7 == 0 ? 2 : i7 == 1 ? 3 : 1;
            i = 8;
            c = 7;
            if (!this.c && i6 != 0) {
                Log.e("RtmpChunkStream", "first message for chunk stream must be fmt type 0, fmt=" + Integer.toString(i6) + ", init=" + Boolean.toString(this.c) + ", cs_id=" + Integer.toString(i7));
                return 2;
            }
            if ((i6 != 0 ? i6 != 1 ? i6 != 2 ? 0 : 3 : 7 : 11) + i2 <= byteBuffer.position()) {
                if (i6 == 0) {
                    this.f = hqg0.a(i2, byteBuffer);
                    this.g = hqg0.a(i2 + 3, byteBuffer);
                    this.h = byteBuffer.get(i2 + 6);
                    this.i = (byteBuffer.get(i2 + 7) & 255) | ((byteBuffer.get(i2 + 10) & 255) << 24) | ((byteBuffer.get(i2 + 9) & 255) << 16) | ((byteBuffer.get(i2 + 8) & 255) << 8);
                    if (!this.c) {
                        this.c = true;
                    }
                    int i8 = i2 + 11;
                    if (this.f != 16777215) {
                        i2 = i8;
                    } else if (byteBuffer.limit() - i8 >= 4) {
                        this.f = hqg0.b(i8, byteBuffer);
                        i2 += 15;
                    }
                    byteBuffer2.position(0);
                    min = Math.min(this.g - byteBuffer2.position(), fqg0Var.C);
                    this.j = min;
                    if (min != 0) {
                    }
                } else if (i6 == 1) {
                    this.f = hqg0.a(i2, byteBuffer);
                    this.g = hqg0.a(i2 + 3, byteBuffer);
                    this.h = byteBuffer.get(i2 + 6);
                    int i9 = i2 + 7;
                    if (this.f != 16777215) {
                        i2 = i9;
                    } else if (byteBuffer.limit() - i9 >= 4) {
                        this.f = hqg0.b(i9, byteBuffer);
                        i2 += 11;
                    }
                    byteBuffer2.position(0);
                    min = Math.min(this.g - byteBuffer2.position(), fqg0Var.C);
                    this.j = min;
                    if (min != 0) {
                    }
                } else if (i6 != 2) {
                    if (this.f >= 16777215) {
                        if (byteBuffer.limit() - i2 >= 4) {
                            this.f = hqg0.b(i2, byteBuffer);
                            i2 += 4;
                        }
                    }
                    byteBuffer2.position();
                    min = Math.min(this.g - byteBuffer2.position(), fqg0Var.C);
                    this.j = min;
                    if (min != 0) {
                        this.d = true;
                        hqg0.l(i2, byteBuffer);
                        return 8;
                    }
                    this.k = 0;
                    this.d = false;
                } else {
                    int a2 = hqg0.a(i2, byteBuffer);
                    this.f = a2;
                    int i10 = i2 + 3;
                    if (a2 != 16777215) {
                        i2 = i10;
                    } else if (byteBuffer.limit() - i10 >= 4) {
                        this.f = hqg0.b(i10, byteBuffer);
                        i2 += 7;
                    }
                    min = Math.min(this.g - byteBuffer2.position(), fqg0Var.C);
                    this.j = min;
                    if (min != 0) {
                    }
                }
            }
            return 1;
        }
        i = 8;
        c = 7;
        i2 = 0;
        int min2 = Math.min(byteBuffer.position() - i2, this.j - this.k);
        if (min2 == 0) {
            hqg0.l(i2, byteBuffer);
            return 1;
        }
        try {
            byteBuffer2.put(byteBuffer.array(), i2, min2);
            this.k += min2;
            hqg0.l(i2 + min2, byteBuffer);
            if (this.j == this.k) {
                this.d = true;
                int position = byteBuffer2.position();
                int i11 = this.g;
                if (position == i11) {
                    if (this.l == 2) {
                        if (this.i == 0) {
                            byte b2 = this.h;
                            if (b2 != 1) {
                                if (b2 != 2) {
                                    if (b2 != 4) {
                                        if (b2 == 5) {
                                            if (i11 == 4) {
                                                fqg0Var.D = hqg0.b(0, byteBuffer2);
                                            }
                                        }
                                    } else if (i11 == 6 && ((byteBuffer2.get(0) & 255) << 16) + (byteBuffer2.get(1) & 255) == 6) {
                                        byte[] bArr = new byte[12];
                                        bArr[0] = 2;
                                        bArr[6] = 6;
                                        bArr[c] = 4;
                                        byte[] bArr2 = {0, 7};
                                        try {
                                            fqg0Var.getClass();
                                            fqg0Var.i(0, 12, bArr);
                                            fqg0Var.i(0, 2, bArr2);
                                            fqg0Var.i(2, 4, byteBuffer2.array());
                                        } catch (Exception e2) {
                                            Log.e("RtmpChunkStream", Log.getStackTraceString(e2));
                                        }
                                    }
                                }
                                z = false;
                                byteBuffer2.position(0);
                                if (!z) {
                                    return this.a ? 34 : 2;
                                }
                                if (!this.m) {
                                    this.n = -1;
                                    this.m = true;
                                }
                            } else {
                                if (i11 == 4) {
                                    int b3 = hqg0.b(0, byteBuffer2);
                                    int i12 = b3 <= 16777215 ? b3 : 16777215;
                                    if (i12 < 1) {
                                        i12 = 1;
                                    }
                                    fqg0Var.C = i12;
                                }
                                z = false;
                                byteBuffer2.position(0);
                                if (!z) {
                                }
                            }
                        }
                        z = true;
                        byteBuffer2.position(0);
                        if (!z) {
                        }
                    } else {
                        if (this.h == 20) {
                            this.a = false;
                            try {
                                g = hqg0.g(0, byteBuffer2);
                                length = g.length();
                                i3 = length + 3;
                            } catch (Exception e3) {
                                Log.e("RtmpChunkStream", Log.getStackTraceString(e3));
                            }
                            if (g.equals("_result")) {
                                try {
                                    e = hqg0.e(i3, byteBuffer2);
                                    i4 = length + 12;
                                    i5 = a.a[fqg0Var.p(e).ordinal()];
                                } catch (Exception e4) {
                                    Log.e("RtmpChunkStream", "failed to process transaction id for _result command");
                                    Log.e("RtmpChunkStream", Log.getStackTraceString(e4));
                                }
                                if (i5 == 1) {
                                    Log.e("RtmpChunkStream", "unknown command _result response");
                                    z = false;
                                    byteBuffer2.position(0);
                                    if (!z) {
                                    }
                                } else if (i5 == 2) {
                                    fqg0Var.x(e, this.i);
                                } else if (i5 == 3) {
                                    try {
                                        hqg0.d(i4, byteBuffer2);
                                        fqg0Var.x(e, hqg0.e(length + 13, byteBuffer2));
                                    } catch (Exception e5) {
                                        Log.e("RtmpChunkStream", Log.getStackTraceString(e5));
                                    }
                                }
                            } else if (g.equals("onStatus")) {
                                try {
                                    hqg0.e(i3, byteBuffer2);
                                    try {
                                        hqg0.d(length + 12, byteBuffer2);
                                        hqg0.f(length + 13, byteBuffer2);
                                        int i13 = length + 14;
                                        boolean z2 = false;
                                        while (true) {
                                            String c2 = hqg0.c(i13, byteBuffer2);
                                            if (c2 != null) {
                                                int length2 = c2.length() + 2 + i13;
                                                if (byteBuffer2.get(length2) != 2) {
                                                    break;
                                                }
                                                String g2 = hqg0.g(length2, byteBuffer2);
                                                int length3 = length2 + g2.length() + 3;
                                                if (c2.equals("level") && g2.equals("error")) {
                                                    i13 = length3;
                                                    z2 = true;
                                                } else {
                                                    i13 = length3;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (!z2) {
                                            if (fqg0Var.p(-1.0d) == fqg0.b.RTMP_COMMAND_RESPONSE_PUBLISH) {
                                                fqg0Var.x(-1.0d, this.i);
                                            }
                                        }
                                    } catch (Exception e6) {
                                        Log.e("RtmpChunkStream", Log.getStackTraceString(e6));
                                    }
                                } catch (Exception e7) {
                                    Log.e("RtmpChunkStream", Log.getStackTraceString(e7));
                                }
                                z = false;
                                byteBuffer2.position(0);
                                if (!z) {
                                }
                            } else if (g.equals("_error")) {
                                Log.e("RtmpChunkStream", "_error response received");
                                try {
                                    int i14 = length + 12;
                                    if (fqg0Var.p(hqg0.e(i3, byteBuffer2)) == fqg0.b.RTMP_COMMAND_RESPONSE_CONNECT) {
                                        hqg0.d(i14, byteBuffer2);
                                        hqg0.f(length + 13, byteBuffer2);
                                        int i15 = length + 14;
                                        while (true) {
                                            String c3 = hqg0.c(i15, byteBuffer2);
                                            if (c3 != null) {
                                                int length4 = c3.length() + 2 + i15;
                                                if (byteBuffer2.get(length4) != 2) {
                                                    break;
                                                }
                                                String g3 = hqg0.g(length4, byteBuffer2);
                                                int length5 = length4 + g3.length() + 3;
                                                if (c3.equals("description") && g3.contains("AccessManager.Reject")) {
                                                    Log.e("RtmpChunkStream", "AccessManager.Reject");
                                                    this.a = true;
                                                    if (g3.contains("authmod=llnw") && (indexOf = g3.indexOf("?")) != -1 && indexOf != g3.length() - 1) {
                                                        ArrayList arrayList = new ArrayList(Arrays.asList(g3.substring(indexOf + 1).split("&")));
                                                        HashMap hashMap = new HashMap();
                                                        Iterator it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            ArrayList arrayList2 = new ArrayList(Arrays.asList(((String) it.next()).split("=")));
                                                            if (arrayList2.size() >= 2) {
                                                                hashMap.put((String) arrayList2.get(0), (String) arrayList2.get(1));
                                                            }
                                                        }
                                                        String str = (String) hashMap.get("reason");
                                                        if (str != null && str.equals("needauth")) {
                                                        }
                                                    }
                                                }
                                                i15 = length5;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e8) {
                                    Log.e("RtmpChunkStream", Log.getStackTraceString(e8));
                                }
                                z = false;
                                byteBuffer2.position(0);
                                if (!z) {
                                }
                            }
                        }
                        z = true;
                        byteBuffer2.position(0);
                        if (!z) {
                        }
                    }
                } else if (this.m) {
                    this.n = 1;
                    this.m = false;
                }
                return i;
            }
            return 1;
        } catch (Exception e9) {
            Log.e("RtmpChunkStream", Log.getStackTraceString(e9));
            return 2;
        }
    }
}
