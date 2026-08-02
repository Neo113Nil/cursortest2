package xsna;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ColorSpaces.kt */
/* loaded from: classes11.dex */
public final class h8g {
    public static final float[] a;
    public static final float[] b;
    public static final pjp0 c;
    public static final pjp0 d;
    public static final njg0 e;
    public static final njg0 f;
    public static final njg0 g;
    public static final njg0 h;
    public static final njg0 i;
    public static final njg0 j;
    public static final njg0 k;
    public static final njg0 l;
    public static final njg0 m;
    public static final njg0 n;
    public static final njg0 o;
    public static final njg0 p;
    public static final njg0 q;
    public static final njg0 r;
    public static final n4y0 s;
    public static final yky t;
    public static final njg0 u;
    public static final njg0 v;
    public static final njg0 w;
    public static final fz70 x;
    public static final d8g[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        pjp0 pjp0Var = new pjp0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        pjp0 pjp0Var2 = new pjp0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        pjp0 pjp0Var3 = new pjp0(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = pjp0Var3;
        pjp0 pjp0Var4 = new pjp0(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = pjp0Var4;
        blx0 blx0Var = crx0.l;
        njg0 njg0Var = new njg0("sRGB IEC61966-2.1", fArr, blx0Var, pjp0Var, 0);
        e = njg0Var;
        njg0 njg0Var2 = new njg0("sRGB IEC61966-2.1 (Linear)", fArr, blx0Var, 1.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1);
        f = njg0Var2;
        int i2 = 10;
        njg0 njg0Var3 = new njg0("scRGB-nl IEC 61966-2-2:2003", fArr, blx0Var, null, new er(i2), new fr(i2), -0.799f, 2.399f, pjp0Var, 2);
        g = njg0Var3;
        njg0 njg0Var4 = new njg0("scRGB IEC 61966-2-2:2003", fArr, blx0Var, 1.0d, -0.5f, 7.499f, 3);
        h = njg0Var4;
        njg0 njg0Var5 = new njg0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, blx0Var, new pjp0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = njg0Var5;
        njg0 njg0Var6 = new njg0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, blx0Var, new pjp0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = njg0Var6;
        njg0 njg0Var7 = new njg0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new blx0(0.314f, 0.351f), 2.6d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 6);
        k = njg0Var7;
        njg0 njg0Var8 = new njg0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, blx0Var, pjp0Var, 7);
        l = njg0Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        njg0 njg0Var9 = new njg0("NTSC (1953)", fArr2, crx0.i, new pjp0(d4, d5, d6, d2, d3), 8);
        m = njg0Var9;
        njg0 njg0Var10 = new njg0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, blx0Var, new pjp0(d4, d5, d6, d2, d3), 9);
        n = njg0Var10;
        njg0 njg0Var11 = new njg0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, blx0Var, 2.2d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 10);
        o = njg0Var11;
        njg0 njg0Var12 = new njg0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, crx0.j, new pjp0(1.8d, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0.0625d, 0.031248d), 11);
        p = njg0Var12;
        float[] fArr4 = {0.7347f, 0.2653f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0E-4f, -0.077f};
        blx0 blx0Var2 = crx0.k;
        njg0 njg0Var13 = new njg0("SMPTE ST 2065-1:2012 ACES", fArr4, blx0Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = njg0Var13;
        njg0 njg0Var14 = new njg0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, blx0Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = njg0Var14;
        n4y0 n4y0Var = new n4y0("Generic XYZ", x6g.b, 14);
        s = n4y0Var;
        long j2 = x6g.c;
        yky ykyVar = new yky("Generic L*a*b*", j2, 15);
        t = ykyVar;
        njg0 njg0Var15 = new njg0("None", fArr, blx0Var, pjp0Var2, 16);
        u = njg0Var15;
        njg0 njg0Var16 = new njg0("Hybrid Log Gamma encoding", fArr3, blx0Var, null, new gr(8), new dn(9), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, pjp0Var3, 17);
        v = njg0Var16;
        njg0 njg0Var17 = new njg0("Perceptual Quantizer encoding", fArr3, blx0Var, null, new en(13), new io.reactivex.rxjava3.internal.operators.observable.q1(12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, pjp0Var4, 18);
        w = njg0Var17;
        fz70 fz70Var = new fz70("Oklab", j2, 19);
        x = fz70Var;
        y = new d8g[]{njg0Var, njg0Var2, njg0Var3, njg0Var4, njg0Var5, njg0Var6, njg0Var7, njg0Var8, njg0Var9, njg0Var10, njg0Var11, njg0Var12, njg0Var13, njg0Var14, n4y0Var, ykyVar, njg0Var15, njg0Var16, njg0Var17, fz70Var};
    }

    public static double a(pjp0 pjp0Var, double d2) {
        double d3 = d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = pjp0Var.b;
        double d6 = pjp0Var.c;
        double d7 = pjp0Var.d;
        double d8 = pjp0Var.e;
        double d9 = pjp0Var.f;
        double d10 = d5 * d4;
        return (pjp0Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(pjp0 pjp0Var, double d2) {
        double d3 = d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1.0d : 1.0d;
        double d4 = 1.0d / pjp0Var.b;
        double d5 = 1.0d / pjp0Var.c;
        double d6 = 1.0d / pjp0Var.d;
        double d7 = pjp0Var.e;
        double d8 = pjp0Var.f;
        double d9 = (d2 * d3) / (pjp0Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(pjp0 pjp0Var, double d2) {
        double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double d4 = d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = pjp0Var.b;
        double d7 = pjp0Var.d;
        double pow = (Math.pow(d5, d7) * pjp0Var.c) + d6;
        if (pow >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            d3 = pow;
        }
        return Math.pow(d3 / ((Math.pow(d5, d7) * pjp0Var.f) + pjp0Var.e), pjp0Var.g) * d4;
    }

    public static double d(pjp0 pjp0Var, double d2) {
        double d3 = d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -pjp0Var.b;
        double d6 = pjp0Var.e;
        double d7 = 1.0d / pjp0Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) / ((Math.pow(d4, d7) * (-pjp0Var.f)) + pjp0Var.c), 1.0d / pjp0Var.d) * d3;
    }
}
