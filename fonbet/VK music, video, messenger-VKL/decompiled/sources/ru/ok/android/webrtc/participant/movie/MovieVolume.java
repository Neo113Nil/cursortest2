package ru.ok.android.webrtc.participant.movie;

import com.unity3d.services.UnityAdsConstants;
import xsna.vby;
import xsna.zcl;

@vby
/* loaded from: classes9.dex */
public final class MovieVolume {
    public static final Companion Companion = new Companion(null);
    public static final float b = m365constructorimpl(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final float c = m365constructorimpl(1.0f);
    public final float a;

    public /* synthetic */ MovieVolume(float f) {
        this.a = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MovieVolume m364boximpl(float f) {
        return new MovieVolume(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m365constructorimpl(float f) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 1.0f) {
            throw new IllegalArgumentException("Gain must be in range of 0f and 1f");
        }
        return f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m366equalsimpl(float f, Object obj) {
        return (obj instanceof MovieVolume) && Float.compare(f, ((MovieVolume) obj).m372unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m367equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: getFULL-_pGdNCs, reason: not valid java name */
    public static final float m368getFULL_pGdNCs() {
        return Companion.m375getFULL_pGdNCs();
    }

    /* renamed from: getMUTED-_pGdNCs, reason: not valid java name */
    public static final float m369getMUTED_pGdNCs() {
        return Companion.m376getMUTED_pGdNCs();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m370hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m371toStringimpl(float f) {
        return "MovieVolume(value=" + f + ")";
    }

    public boolean equals(Object obj) {
        return m366equalsimpl(this.a, obj);
    }

    public final float getValue() {
        return this.a;
    }

    public int hashCode() {
        return m370hashCodeimpl(this.a);
    }

    public String toString() {
        return m371toStringimpl(this.a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m372unboximpl() {
        return this.a;
    }

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        /* renamed from: getFULL-_pGdNCs, reason: not valid java name */
        public final float m375getFULL_pGdNCs() {
            return MovieVolume.c;
        }

        /* renamed from: getMUTED-_pGdNCs, reason: not valid java name */
        public final float m376getMUTED_pGdNCs() {
            return MovieVolume.b;
        }

        /* renamed from: getFULL-_pGdNCs$annotations, reason: not valid java name */
        public static /* synthetic */ void m373getFULL_pGdNCs$annotations() {
        }

        /* renamed from: getMUTED-_pGdNCs$annotations, reason: not valid java name */
        public static /* synthetic */ void m374getMUTED_pGdNCs$annotations() {
        }
    }
}
