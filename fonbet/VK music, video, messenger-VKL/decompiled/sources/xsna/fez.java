package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* compiled from: ListChunk.java */
/* loaded from: classes12.dex */
public final class fez implements it5 {
    public final ImmutableList<it5> a;
    public final int b;

    public fez(int i, com.google.common.collect.g gVar) {
        this.b = i;
        this.a = gVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static fez b(int i, xi90 xi90Var) {
        it5 tom0Var;
        String str;
        ImmutableList.a aVar = new ImmutableList.a();
        int i2 = xi90Var.c;
        int i3 = -2;
        while (xi90Var.a() > 8) {
            int r = xi90Var.r();
            int r2 = xi90Var.b + xi90Var.r();
            xi90Var.O(r2);
            if (r != 1414744396) {
                lt5 lt5Var = null;
                switch (r) {
                    case 1718776947:
                        if (i3 == 2) {
                            xi90Var.Q(4);
                            int r3 = xi90Var.r();
                            int r4 = xi90Var.r();
                            xi90Var.Q(4);
                            int r5 = xi90Var.r();
                            switch (r5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                a.C0043a c0043a = new a.C0043a();
                                c0043a.t = r3;
                                c0043a.u = r4;
                                c0043a.q(str);
                                tom0Var = new tom0(new androidx.media3.common.a(c0043a));
                                break;
                            } else {
                                sn.d(r5, "Ignoring track with unsupported compression ");
                                tom0Var = lt5Var;
                                break;
                            }
                        } else {
                            if (i3 == 1) {
                                int v = xi90Var.v();
                                String str2 = v != 1 ? v != 85 ? v != 255 ? v != 8192 ? v != 8193 ? null : MimeTypes.AUDIO_DTS : MimeTypes.AUDIO_AC3 : "audio/mp4a-latm" : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_RAW;
                                if (str2 != null) {
                                    int v2 = xi90Var.v();
                                    int r6 = xi90Var.r();
                                    xi90Var.Q(6);
                                    int v3 = xi90Var.v();
                                    String str3 = y2r0.a;
                                    int F = y2r0.F(v3, ByteOrder.LITTLE_ENDIAN);
                                    int v4 = xi90Var.a() > 0 ? xi90Var.v() : 0;
                                    a.C0043a c0043a2 = new a.C0043a();
                                    c0043a2.m = io20.q(str2);
                                    c0043a2.E = v2;
                                    c0043a2.F = r6;
                                    if (str2.equals(MimeTypes.AUDIO_RAW) && F != 0) {
                                        c0043a2.G = F;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && v4 > 0) {
                                        byte[] bArr = new byte[v4];
                                        xi90Var.n(bArr, 0, v4);
                                        c0043a2.p = ImmutableList.p(bArr);
                                    }
                                    tom0Var = new tom0(new androidx.media3.common.a(c0043a2));
                                    break;
                                } else {
                                    sn.d(v, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                ahn.F("Ignoring strf box for unsupported track type: " + y2r0.H(i3));
                            }
                            tom0Var = lt5Var;
                        }
                    case 1751742049:
                        int r7 = xi90Var.r();
                        xi90Var.Q(8);
                        int r8 = xi90Var.r();
                        int r9 = xi90Var.r();
                        xi90Var.Q(4);
                        xi90Var.r();
                        xi90Var.Q(12);
                        tom0Var = new kt5(r7, r8, r9);
                        break;
                    case 1752331379:
                        int r10 = xi90Var.r();
                        xi90Var.Q(12);
                        xi90Var.r();
                        int r11 = xi90Var.r();
                        int r12 = xi90Var.r();
                        xi90Var.Q(4);
                        int r13 = xi90Var.r();
                        int r14 = xi90Var.r();
                        xi90Var.Q(4);
                        lt5Var = new lt5(r10, r11, r12, r13, r14, xi90Var.r());
                        tom0Var = lt5Var;
                        break;
                    case 1852994675:
                        tom0Var = new yom0(xi90Var.A(xi90Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        tom0Var = lt5Var;
                        break;
                }
            } else {
                tom0Var = b(xi90Var.r(), xi90Var);
            }
            if (tom0Var != null) {
                if (tom0Var.getType() == 1752331379) {
                    i3 = ((lt5) tom0Var).a();
                }
                aVar.c(tom0Var);
            }
            xi90Var.P(r2);
            xi90Var.O(i2);
        }
        return new fez(i, aVar.g());
    }

    @Nullable
    public final <T extends it5> T a(Class<T> cls) {
        ImmutableList.b listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            T t = (T) listIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // xsna.it5
    public final int getType() {
        return this.b;
    }
}
