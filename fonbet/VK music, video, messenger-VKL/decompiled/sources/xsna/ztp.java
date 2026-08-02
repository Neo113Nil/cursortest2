package xsna;

import com.huawei.hms.hihealth.HiHealthActivities;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EqualizerPreset.kt */
/* loaded from: classes3.dex */
public abstract class ztp {
    public static final int[] c = {50000, 100000, X3.b.c, 400000, 800000, 1000000, 2500000, 5000000, 15000000};
    public final String a;
    public final float[] b;

    /* compiled from: EqualizerPreset.kt */
    public static final class a extends ztp {
        public static final a d = new a("acoustic", new float[]{0.4f, 0.3f, 0.2f, 0.05f, 0.1f, 0.1f, 0.2f, 0.2f, 0.05f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1246397960;
        }

        public final String toString() {
            return "Acoustic";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class b extends ztp {
        public static final b d = new b("auto", new float[]{-0.03f, 0.1f, -0.07f, -0.05f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f, 0.18f, 0.08f, 0.2f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2013749916;
        }

        public final String toString() {
            return "Auto";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class c extends ztp {
        public static final c d = new c("bass_boost", new float[]{0.3f, 0.2f, 0.1f, 0.07f, 0.03f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1829344913;
        }

        public final String toString() {
            return "BassBoost";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class d extends ztp {
        public static final d d = new d("bass_cut", new float[]{-0.3f, -0.25f, -0.2f, -0.15f, -0.05f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 793627406;
        }

        public final String toString() {
            return "BassCut";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class e extends ztp {
        public static final e d = new e("classic", new float[]{0.25f, 0.2f, 0.05f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.05f, -0.1f, 0.05f, 0.1f, 0.2f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1979474109;
        }

        public final String toString() {
            return "Classic";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class f {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static ztp a(String str, String str2) {
            switch (str.hashCode()) {
                case -2010949979:
                    if (str.equals("headphones")) {
                        return k.d;
                    }
                    break;
                case -1788109629:
                    if (str.equals("acoustic")) {
                        return a.d;
                    }
                    break;
                case -1708248862:
                    if (str.equals("bass_cut")) {
                        return d.d;
                    }
                    break;
                case -1485376025:
                    if (str.equals("hi_freq_minus")) {
                        return l.d;
                    }
                    break;
                case -1349088399:
                    if (str.equals("custom")) {
                        try {
                            List c0 = drm0.c0(str2, new String[]{StringUtils.COMMA}, 0, 6);
                            int size = c0.size();
                            ArrayList arrayList = new ArrayList(size);
                            for (int i = 0; i < size; i++) {
                                arrayList.add(Short.valueOf(Short.parseShort((String) c0.get(i))));
                            }
                            return new g(arrayList);
                        } catch (NumberFormatException unused) {
                            return j.d;
                        }
                    }
                    break;
                case -1260009476:
                    if (str.equals("deep_sound")) {
                        return i.d;
                    }
                    break;
                case -1109877283:
                    if (str.equals("latina")) {
                        return p.d;
                    }
                    break;
                case -1096913606:
                    if (str.equals("lounge")) {
                        return q.d;
                    }
                    break;
                case -950752701:
                    if (str.equals("bass_boost")) {
                        return c.d;
                    }
                    break;
                case -740559549:
                    if (str.equals("hi_freq_plus")) {
                        return m.d;
                    }
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        return r.d;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return b.d;
                    }
                    break;
                case 3145593:
                    if (str.equals("flat")) {
                        return j.d;
                    }
                    break;
                case 3254967:
                    if (str.equals(HiHealthActivities.JAZZ)) {
                        return o.d;
                    }
                    break;
                case 3506021:
                    if (str.equals("rock")) {
                        return t.d;
                    }
                    break;
                case 95350707:
                    if (str.equals("dance")) {
                        return h.d;
                    }
                    break;
                case 108220292:
                    if (str.equals("r_n_b")) {
                        return s.d;
                    }
                    break;
                case 112380533:
                    if (str.equals("vocal")) {
                        return u.d;
                    }
                    break;
                case 853620882:
                    if (str.equals("classic")) {
                        return e.d;
                    }
                    break;
                case 923531161:
                    if (str.equals(HiHealthActivities.HIP_HOP)) {
                        return n.d;
                    }
                    break;
            }
            return j.d;
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class g extends ztp {
        public final List<Short> d;

        public g(List<Short> list) {
            super("custom", new float[0]);
            this.d = list;
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class h extends ztp {
        public static final h d = new h("dance", new float[]{0.5f, 0.4f, 0.2f, 0.05f, 0.1f, 0.15f, 0.22f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 2000430750;
        }

        public final String toString() {
            return "Dance";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class i extends ztp {
        public static final i d = new i("deep_sound", new float[]{0.2f, 0.07f, 0.1f, 0.12f, 0.15f, 0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.1f, -0.2f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1916655854;
        }

        public final String toString() {
            return "DeepSound";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class j extends ztp {
        public static final j d = new j("flat", new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -2013610194;
        }

        public final String toString() {
            return "Flat";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class k extends ztp {
        public static final k d = new k("headphones", new float[]{0.07f, 0.03f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.12f, 0.1f, 0.18f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1117078886;
        }

        public final String toString() {
            return "Headphones";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class l extends ztp {
        public static final l d = new l("hi_freq_minus", new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.03f, -0.05f, -0.15f, -0.2f, -0.3f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1816073342;
        }

        public final String toString() {
            return "HiFreqMinus";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class m extends ztp {
        public static final m d = new m("hi_freq_plus", new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.03f, 0.05f, 0.1f, 0.2f, 0.3f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -335585208;
        }

        public final String toString() {
            return "HiFreqPlus";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class n extends ztp {
        public static final n d = new n(HiHealthActivities.HIP_HOP, new float[]{0.25f, 0.2f, 0.07f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.05f, -0.1f, 0.07f, 0.12f, 0.2f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 2005749935;
        }

        public final String toString() {
            return "HipHop";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class o extends ztp {
        public static final o d = new o(HiHealthActivities.JAZZ, new float[]{0.15f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.05f, 0.03f, 0.12f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.12f, 0.22f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -2013500820;
        }

        public final String toString() {
            return "Jazz";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class p extends ztp {
        public static final p d = new p("latina", new float[]{0.12f, 0.08f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.1f, -0.11f, -0.15f, -0.05f, 0.1f, 0.25f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 2113029202;
        }

        public final String toString() {
            return "Latina";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class q extends ztp {
        public static final q d = new q("lounge", new float[]{-0.1f, -0.08f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.15f, 0.18f, 0.08f, -0.05f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.07f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 2125992879;
        }

        public final String toString() {
            return "Lounge";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class r extends ztp {
        public static final r d = new r("pop", new float[]{-0.08f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.03f, 0.18f, 0.2f, 0.22f, 0.04f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.1f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 1320527868;
        }

        public final String toString() {
            return "Pop";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class s extends ztp {
        public static final s d = new s("r_n_b", new float[]{0.5f, 0.4f, 0.21f, -0.1f, -0.12f, -0.15f, 0.15f, 0.17f, 0.19f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 1320529713;
        }

        public final String toString() {
            return "RnB";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class t extends ztp {
        public static final t d = new t("rock", new float[]{0.25f, 0.2f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.05f, -0.1f, 0.03f, 0.12f, 0.25f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -2013249766;
        }

        public final String toString() {
            return "Rock";
        }
    }

    /* compiled from: EqualizerPreset.kt */
    public static final class u extends ztp {
        public static final u d = new u("vocal", new float[]{-0.2f, -0.15f, -0.05f, 0.17f, 0.2f, 0.25f, 0.17f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.07f});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 2017460576;
        }

        public final String toString() {
            return "Vocal";
        }
    }

    public ztp(String str, float[] fArr) {
        this.a = str;
        this.b = fArr;
    }

    public final short a(int i2, int i3, short s2, short s3) {
        float f2 = 0.0f;
        int i4 = 0;
        for (int i5 = 0; i5 < 9; i5++) {
            int i6 = c[i5];
            if (i6 >= i2) {
                if (i6 > i3) {
                    break;
                }
                f2 += this.b[i5];
                i4++;
            }
        }
        return (short) ((i4 > 0 ? f2 / i4 : 0.0f) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (-r3) * s2 : s3 * r3);
    }
}
