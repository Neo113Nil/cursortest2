package ru.ok.android.webrtc.simulcast;

import kotlin.Pair;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.RtpParameters;
import org.webrtc.Size;
import ru.ok.android.webrtc.utils.UtilsKt;
import xsna.be;
import xsna.de;
import xsna.dgn;
import xsna.e43;
import xsna.epx;
import xsna.wn4;
import xsna.xe9;
import xsna.y57;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class SimulcastLayerInfo {
    public static final Companion Companion = new Companion(null);
    public final String a;
    public final SimulcastDirection b;
    public final boolean c;
    public final double d;
    public final int e;
    public final int f;
    public final int g;
    public final Integer h;
    public final int i;
    public final int j;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final SimulcastLayerInfo fromEncoding(RtpParameters.Encoding encoding, SimulcastDirection simulcastDirection, Size size, CropAndScaleParamsProvider cropAndScaleParamsProvider) {
            int i = size.width;
            int i2 = size.height;
            Double d = encoding.scaleResolutionDownBy;
            Size toScaledSize = UtilsKt.getToScaledSize(cropAndScaleParamsProvider.calculate(i, i2, d != null ? d.doubleValue() : 1.0d));
            String str = encoding.rid;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean z = encoding.active;
            Double d2 = encoding.scaleResolutionDownBy;
            double doubleValue = d2 != null ? d2.doubleValue() : 1.0d;
            Integer num = encoding.maxBitrateBps;
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = encoding.minBitrateBps;
            int intValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = encoding.maxFramerate;
            return new SimulcastLayerInfo(str2, simulcastDirection, z, doubleValue, intValue, intValue2, num3 != null ? num3.intValue() : 0, null, toScaledSize.width, toScaledSize.height, 128, null);
        }
    }

    public SimulcastLayerInfo(String str, SimulcastDirection simulcastDirection, boolean z, double d, int i, int i2, int i3, Integer num, int i4, int i5) {
        this.a = str;
        this.b = simulcastDirection;
        this.c = z;
        this.d = d;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = num;
        this.i = i4;
        this.j = i5;
    }

    public static /* synthetic */ SimulcastLayerInfo copy$default(SimulcastLayerInfo simulcastLayerInfo, String str, SimulcastDirection simulcastDirection, boolean z, double d, int i, int i2, int i3, Integer num, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = simulcastLayerInfo.a;
        }
        if ((i6 & 2) != 0) {
            simulcastDirection = simulcastLayerInfo.b;
        }
        if ((i6 & 4) != 0) {
            z = simulcastLayerInfo.c;
        }
        if ((i6 & 8) != 0) {
            d = simulcastLayerInfo.d;
        }
        if ((i6 & 16) != 0) {
            i = simulcastLayerInfo.e;
        }
        if ((i6 & 32) != 0) {
            i2 = simulcastLayerInfo.f;
        }
        if ((i6 & 64) != 0) {
            i3 = simulcastLayerInfo.g;
        }
        if ((i6 & 128) != 0) {
            num = simulcastLayerInfo.h;
        }
        if ((i6 & 256) != 0) {
            i4 = simulcastLayerInfo.i;
        }
        if ((i6 & 512) != 0) {
            i5 = simulcastLayerInfo.j;
        }
        int i7 = i4;
        int i8 = i5;
        double d2 = d;
        boolean z2 = z;
        return simulcastLayerInfo.copy(str, simulcastDirection, z2, d2, i, i2, i3, num, i7, i8);
    }

    public final String component1() {
        return this.a;
    }

    public final int component10() {
        return this.j;
    }

    public final SimulcastDirection component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final double component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final int component7() {
        return this.g;
    }

    public final Integer component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    public final SimulcastLayerInfo copy(String str, SimulcastDirection simulcastDirection, boolean z, double d, int i, int i2, int i3, Integer num, int i4, int i5) {
        return new SimulcastLayerInfo(str, simulcastDirection, z, d, i, i2, i3, num, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimulcastLayerInfo)) {
            return false;
        }
        SimulcastLayerInfo simulcastLayerInfo = (SimulcastLayerInfo) obj;
        return epx.f(this.a, simulcastLayerInfo.a) && this.b == simulcastLayerInfo.b && this.c == simulcastLayerInfo.c && Double.compare(this.d, simulcastLayerInfo.d) == 0 && this.e == simulcastLayerInfo.e && this.f == simulcastLayerInfo.f && this.g == simulcastLayerInfo.g && epx.f(this.h, simulcastLayerInfo.h) && this.i == simulcastLayerInfo.i && this.j == simulcastLayerInfo.j;
    }

    public final SimulcastDirection getDirection() {
        return this.b;
    }

    public final int getHeight() {
        return this.j;
    }

    public final int getMaxBitrate() {
        return this.e;
    }

    public final int getMaxFps() {
        return this.g;
    }

    public final int getMinBitrate() {
        return this.f;
    }

    public final Integer getNumTemporalLayers() {
        return this.h;
    }

    public final double getResolutionScale() {
        return this.d;
    }

    public final String getRid() {
        return this.a;
    }

    public final int getWidth() {
        return this.i;
    }

    public int hashCode() {
        int v = de.v(this.g, de.v(this.f, de.v(this.e, be.b(this.d, wn4.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31)))));
        Integer num = this.h;
        return Integer.hashCode(this.j) + de.v(this.i, (v + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final boolean isActive() {
        return this.c;
    }

    public final String toAridLine() {
        StringBuilder sb = new StringBuilder();
        int i = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (i <= 0) {
            valueOf = null;
        }
        Pair pair = new Pair("max-width", valueOf);
        int i2 = this.j;
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 <= 0) {
            valueOf2 = null;
        }
        Pair pair2 = new Pair("max-height", valueOf2);
        int i3 = this.g;
        Integer valueOf3 = Integer.valueOf(i3);
        if (i3 <= 0) {
            valueOf3 = null;
        }
        Pair pair3 = new Pair("max-fps", valueOf3);
        int i4 = this.e;
        for (Pair pair4 : e43.l(pair, pair2, pair3, new Pair("max-br", i4 > 0 ? Integer.valueOf(i4) : null))) {
            String str = (String) pair4.d();
            Integer num = (Integer) pair4.g();
            if (num != null) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str + "=" + num);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return y57.a("a=rid:", this.a, " ", this.b.getStringValue());
        }
        StringBuilder a = xe9.a("a=rid:", this.a, " ", this.b.getStringValue(), " ");
        a.append(sb2);
        return a.toString();
    }

    public String toString() {
        String str = this.a;
        SimulcastDirection simulcastDirection = this.b;
        boolean z = this.c;
        double d = this.d;
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        Integer num = this.h;
        int i4 = this.i;
        int i5 = this.j;
        StringBuilder sb = new StringBuilder("SimulcastLayerInfo(rid=");
        sb.append(str);
        sb.append(", direction=");
        sb.append(simulcastDirection);
        sb.append(", isActive=");
        sb.append(z);
        sb.append(", resolutionScale=");
        sb.append(d);
        dgn.a(i, i2, ", maxBitrate=", ", minBitrate=", sb);
        sb.append(", maxFps=");
        sb.append(i3);
        sb.append(", numTemporalLayers=");
        sb.append(num);
        dgn.a(i4, i5, ", width=", ", height=", sb);
        sb.append(")");
        return sb.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SimulcastLayerInfo(java.lang.String r15, ru.ok.android.webrtc.simulcast.SimulcastDirection r16, boolean r17, double r18, int r20, int r21, int r22, java.lang.Integer r23, int r24, int r25, int r26, xsna.zcl r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 4
            if (r1 == 0) goto L9
            r1 = 1
            r5 = r1
            goto Lb
        L9:
            r5 = r17
        Lb:
            r1 = r0 & 8
            if (r1 == 0) goto L13
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = r1
            goto L15
        L13:
            r6 = r18
        L15:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L1c
            r8 = r2
            goto L1e
        L1c:
            r8 = r20
        L1e:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r9 = r2
            goto L26
        L24:
            r9 = r21
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2c
            r10 = r2
            goto L2e
        L2c:
            r10 = r22
        L2e:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L35
            r1 = 0
            r11 = r1
            goto L37
        L35:
            r11 = r23
        L37:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3d
            r12 = r2
            goto L3f
        L3d:
            r12 = r24
        L3f:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L49
            r13 = r2
            r3 = r15
            r4 = r16
            r2 = r14
            goto L4f
        L49:
            r13 = r25
            r2 = r14
            r3 = r15
            r4 = r16
        L4f:
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.webrtc.simulcast.SimulcastLayerInfo.<init>(java.lang.String, ru.ok.android.webrtc.simulcast.SimulcastDirection, boolean, double, int, int, int, java.lang.Integer, int, int, int, xsna.zcl):void");
    }
}
