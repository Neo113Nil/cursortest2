package com.squareup.moshi;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ny61;
import defpackage.qq6;
import defpackage.uza;
import defpackage.y9t0;
import defpackage.ydz0;
import defpackage.yp6;
import java.io.IOException;
import okio.ByteString;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes4.dex */
final class JsonValueSource implements y9t0 {
    public static final ByteString A;
    public static final ByteString B;
    public static final ByteString C;
    public static final ByteString D;
    public static final ByteString E;
    public static final ByteString F;
    public final qq6 a;
    public final yp6 b;
    public final yp6 c;
    public ByteString w;
    public int x;
    public long y = 0;
    public boolean z = false;

    static {
        ByteString byteString = new ByteString("[]{}\"'/#".getBytes(uza.a));
        byteString.b = "[]{}\"'/#";
        A = byteString;
        ByteString byteString2 = new ByteString("'\\".getBytes(uza.a));
        byteString2.b = "'\\";
        B = byteString2;
        ByteString byteString3 = new ByteString("\"\\".getBytes(uza.a));
        byteString3.b = "\"\\";
        C = byteString3;
        ByteString byteString4 = new ByteString(Constants.LINE_SEPARATOR.getBytes(uza.a));
        byteString4.b = Constants.LINE_SEPARATOR;
        D = byteString4;
        ByteString byteString5 = new ByteString("*".getBytes(uza.a));
        byteString5.b = "*";
        E = byteString5;
        F = ByteString.c;
    }

    public JsonValueSource(qq6 qq6Var, yp6 yp6Var, ByteString byteString, int i) {
        this.a = qq6Var;
        this.b = qq6Var.h();
        this.c = yp6Var;
        this.w = byteString;
        this.x = i;
    }

    public final void a(long j) {
        while (true) {
            long j2 = this.y;
            if (j2 >= j) {
                return;
            }
            ByteString byteString = this.w;
            ByteString byteString2 = F;
            if (byteString == byteString2) {
                return;
            }
            yp6 yp6Var = this.b;
            long j3 = yp6Var.b;
            qq6 qq6Var = this.a;
            if (j2 == j3) {
                if (j2 > 0) {
                    return;
                } else {
                    qq6Var.B1(1L);
                }
            }
            long o = yp6Var.o(this.y, this.w);
            if (o == -1) {
                this.y = yp6Var.b;
            } else {
                byte e = yp6Var.e(o);
                ByteString byteString3 = this.w;
                ByteString byteString4 = C;
                ByteString byteString5 = B;
                ByteString byteString6 = E;
                ByteString byteString7 = D;
                ByteString byteString8 = A;
                if (byteString3 == byteString8) {
                    if (e == 34) {
                        this.w = byteString4;
                        this.y = o + 1;
                    } else if (e == 35) {
                        this.w = byteString7;
                        this.y = o + 1;
                    } else if (e == 39) {
                        this.w = byteString5;
                        this.y = o + 1;
                    } else if (e != 47) {
                        if (e != 91) {
                            if (e != 93) {
                                if (e != 123) {
                                    if (e != 125) {
                                    }
                                }
                            }
                            int i = this.x - 1;
                            this.x = i;
                            if (i == 0) {
                                this.w = byteString2;
                            }
                            this.y = o + 1;
                        }
                        this.x++;
                        this.y = o + 1;
                    } else {
                        long j4 = 2 + o;
                        qq6Var.B1(j4);
                        long j5 = o + 1;
                        byte e2 = yp6Var.e(j5);
                        if (e2 == 47) {
                            this.w = byteString7;
                            this.y = j4;
                        } else if (e2 == 42) {
                            this.w = byteString6;
                            this.y = j4;
                        } else {
                            this.y = j5;
                        }
                    }
                } else if (byteString3 == byteString5 || byteString3 == byteString4) {
                    if (e == 92) {
                        long j6 = o + 2;
                        qq6Var.B1(j6);
                        this.y = j6;
                    } else {
                        if (this.x > 0) {
                            byteString2 = byteString8;
                        }
                        this.w = byteString2;
                        this.y = o + 1;
                    }
                } else if (byteString3 == byteString6) {
                    long j7 = 2 + o;
                    qq6Var.B1(j7);
                    long j8 = o + 1;
                    if (yp6Var.e(j8) == 47) {
                        this.y = j7;
                        this.w = byteString8;
                    } else {
                        this.y = j8;
                    }
                } else if (byteString3 != byteString7) {
                    ny61.w();
                    return;
                } else {
                    this.y = o + 1;
                    this.w = byteString8;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.z = true;
    }

    public void discard() throws IOException {
        this.z = true;
        while (this.w != F) {
            a(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            this.a.skip(this.y);
        }
    }

    @Override // defpackage.y9t0
    public long read(yp6 yp6Var, long j) throws IOException {
        if (this.z) {
            ny61.r("closed");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        yp6 yp6Var2 = this.c;
        boolean I1 = yp6Var2.I1();
        yp6 yp6Var3 = this.b;
        if (!I1) {
            long read = yp6Var2.read(yp6Var, j);
            long j2 = j - read;
            if (!yp6Var3.I1()) {
                long read2 = read(yp6Var, j2);
                if (read2 != -1) {
                    return read2 + read;
                }
            }
            return read;
        }
        a(j);
        long j3 = this.y;
        if (j3 == 0) {
            if (this.w == F) {
                return -1L;
            }
            ny61.w();
            return 0L;
        }
        long min = Math.min(j, j3);
        yp6Var.write(yp6Var3, min);
        this.y -= min;
        return min;
    }

    @Override // defpackage.y9t0
    public ydz0 timeout() {
        return this.a.timeout();
    }
}
