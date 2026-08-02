package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import xsna.a1n0;
import xsna.gb30;
import xsna.n3i0;

/* compiled from: JpegMotionPhotoExtractor.java */
/* loaded from: classes12.dex */
public final class x0y implements pgq {
    public rgq b;
    public int c;
    public int d;
    public int e;

    @Nullable
    public ib30 g;
    public qgq h;
    public iqk0 i;

    @Nullable
    public uf30 j;
    public final xi90 a = new xi90(2);
    public long f = -1;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        String x;
        gb30 gb30Var;
        com.google.common.collect.g gVar;
        int i;
        ib30 ib30Var;
        long j;
        long j2;
        int i2 = this.c;
        long j3 = -1;
        xi90 xi90Var = this.a;
        if (i2 == 0) {
            xi90Var.M(2);
            qgqVar.readFully(xi90Var.a, 0, 2);
            int J = xi90Var.J();
            this.d = J;
            if (J == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                f();
                return 0;
            }
            if ((J < 65488 || J > 65497) && J != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            xi90Var.M(2);
            qgqVar.peekFully(xi90Var.a, 0, 2);
            this.e = xi90Var.J() - 2;
            qgqVar.skipFully(2);
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || qgqVar != this.h) {
                    this.h = qgqVar;
                    this.i = new iqk0(qgqVar, this.f);
                }
                uf30 uf30Var = this.j;
                uf30Var.getClass();
                int b = uf30Var.b(this.i, pzb0Var);
                if (b == 1) {
                    pzb0Var.a += this.f;
                }
                return b;
            }
            long position = qgqVar.getPosition();
            long j4 = this.f;
            if (position != j4) {
                pzb0Var.a = j4;
                return 1;
            }
            if (!qgqVar.peekFully(xi90Var.a, 0, 1, true)) {
                f();
                return 0;
            }
            qgqVar.resetPeekPosition();
            if (this.j == null) {
                this.j = new uf30(a1n0.a.a, 8);
            }
            iqk0 iqk0Var = new iqk0(qgqVar, this.f);
            this.i = iqk0Var;
            if (!this.j.d(iqk0Var)) {
                f();
                return 0;
            }
            uf30 uf30Var2 = this.j;
            long j5 = this.f;
            rgq rgqVar = this.b;
            rgqVar.getClass();
            uf30Var2.e(new jqk0(j5, rgqVar));
            ib30 ib30Var2 = this.g;
            ib30Var2.getClass();
            rgq rgqVar2 = this.b;
            rgqVar2.getClass();
            rgp0 track = rgqVar2.track(1024, 4);
            a.C0043a c0043a = new a.C0043a();
            c0043a.l = io20.q("image/jpeg");
            c0043a.k = new fi20(ib30Var2);
            zjh0.d(c0043a, track);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            xi90 xi90Var2 = new xi90(this.e);
            qgqVar.readFully(xi90Var2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(xi90Var2.x()) && (x = xi90Var2.x()) != null) {
                long length = qgqVar.getLength();
                if (length != -1) {
                    try {
                        gb30Var = m4y0.a(x);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        ahn.F("Ignoring unexpected XMP metadata");
                        gb30Var = null;
                    }
                    if (gb30Var != null && (i = (gVar = gb30Var.b).e) >= 2) {
                        int i3 = i - 1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        while (i3 >= 0) {
                            gb30.a aVar = (gb30.a) gVar.get(i3);
                            String str = aVar.a;
                            boolean z = str.equals(MimeTypes.VIDEO_MP4) || str.equals("video/quicktime");
                            if (i3 == 0) {
                                j = j3;
                                length -= aVar.c;
                                j2 = 0;
                            } else {
                                j = j3;
                                j2 = length - aVar.b;
                            }
                            long j10 = length;
                            length = j2;
                            if (z && length != j10) {
                                j9 = j10 - length;
                                j8 = length;
                            }
                            if (i3 == 0) {
                                j7 = j10;
                                j6 = length;
                            }
                            i3--;
                            j3 = j;
                        }
                        long j11 = j3;
                        if (j8 != j11 && j9 != j11 && j6 != j11 && j7 != j11) {
                            ib30Var = new ib30(j6, j7, gb30Var.a, j8, j9);
                            this.g = ib30Var;
                            if (ib30Var != null) {
                                this.f = ib30Var.d;
                            }
                        }
                    }
                }
                ib30Var = null;
                this.g = ib30Var;
                if (ib30Var != null) {
                }
            }
        } else {
            qgqVar.skipFully(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        String x;
        tel telVar = (tel) qgqVar;
        xi90 xi90Var = this.a;
        xi90Var.M(2);
        telVar.peekFully(xi90Var.a, 0, 2, false);
        if (xi90Var.J() == 65496) {
            while (true) {
                xi90Var.M(2);
                telVar.peekFully(xi90Var.a, 0, 2, false);
                int J = xi90Var.J();
                this.d = J;
                if (J == 65498) {
                    break;
                }
                xi90Var.M(2);
                telVar.peekFully(xi90Var.a, 0, 2);
                int J2 = xi90Var.J() - 2;
                if (J2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    telVar.b(J2, false);
                } else {
                    xi90Var.M(J2);
                    telVar.peekFully(xi90Var.a, 0, J2, false);
                    if (Objects.equals(xi90Var.x(), "http://ns.adobe.com/xap/1.0/") && (x = xi90Var.x()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (x.contains(m4y0.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.b = rgqVar;
    }

    public final void f() {
        rgq rgqVar = this.b;
        rgqVar.getClass();
        rgqVar.endTracks();
        this.b.f(new n3i0.b(C.TIME_UNSET));
        this.c = 6;
    }

    @Override // xsna.pgq
    public final void release() {
        uf30 uf30Var = this.j;
        if (uf30Var != null) {
            uf30Var.getClass();
        }
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            uf30 uf30Var = this.j;
            uf30Var.getClass();
            uf30Var.seek(j, j2);
        }
    }
}
