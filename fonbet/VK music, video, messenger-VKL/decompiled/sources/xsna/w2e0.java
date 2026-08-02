package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.avw;
import xsna.er9;
import xsna.thy;

/* compiled from: ProgressIndicator.kt */
/* loaded from: classes11.dex */
public final class w2e0 {
    public static final float a = rdc.a;
    public static final nkk b = sb30.c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x014a, code lost:
    
        if (r12.p(r5) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final float f, float f2, int i, final int i2, final long j, long j2, androidx.compose.runtime.a aVar, q630 q630Var) {
        q630 q630Var2;
        final float f3;
        final int i3;
        final long j3;
        int i4;
        int i5;
        float f4;
        long j4;
        boolean z;
        boolean z2;
        Object obj;
        final float f5;
        androidx.compose.runtime.a M = aVar.M(333154241);
        int i6 = i2 | (M.p(j) ? 32 : 16) | 222208;
        if (M.t(i6 & 1, (74899 & i6) != 74898)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                int i7 = j2e0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1947901123, 6, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:838)");
                }
                j3 = l5g.j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i4 = i6 & (-7169);
                i5 = j2e0.a;
                f4 = j2e0.b;
            } else {
                M.h();
                i4 = i6 & (-7169);
                f4 = f2;
                i5 = i;
                j3 = j2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(333154241, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
            }
            final frm0 frm0Var = new frm0(((azl) M.r(uvi.h)).I0(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5, 0, null, 26);
            avw c = dvw.c(M);
            float f6 = f4;
            final avw.a a2 = dvw.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1080.0f, jq2.a(6, 0L, null, jq2.d(RtpSenderHelper.AUDIO_BITRATE_MIN, 0, luo.d, 2)), M);
            t6c0 t6c0Var = new t6c0(2);
            thy.b bVar = new thy.b();
            t6c0Var.invoke(bVar);
            final avw.a a3 = dvw.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, jq2.a(6, 0L, null, new thy(bVar)), M);
            thy.b bVar2 = new thy.b();
            bVar2.a = RtpSenderHelper.AUDIO_BITRATE_MIN;
            bVar2.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, Float.valueOf(0.87f)).b = b;
            bVar2.a(RtpSenderHelper.AUDIO_BITRATE_MIN, Float.valueOf(0.1f));
            s3q0 s3q0Var = s3q0.a;
            final avw.a a4 = dvw.a(c, 0.1f, 0.87f, jq2.a(6, 0L, null, new thy(bVar2)), M);
            q630Var2 = q630Var;
            q630 q = txj0.q(egi0.b(q630Var2, true, new h3e0(0)), a);
            boolean J = M.J(a4) | M.J(a2) | M.J(a3) | M.p(j3) | M.y(frm0Var);
            if (((i4 & 112) ^ 48) > 32) {
                j4 = j;
            } else {
                j4 = j;
            }
            if ((i4 & 48) != 32) {
                z = false;
                z2 = J | z;
                Object x = M.x();
                if (!z2 || x == a.C0011a.a) {
                    f5 = f6;
                    final long j5 = j4;
                    final int i8 = i5;
                    obj = new izs() { // from class: xsna.n2e0
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            long j6;
                            long j7 = j3;
                            frm0 frm0Var2 = frm0Var;
                            long j8 = j5;
                            oio oioVar = (oio) obj2;
                            float floatValue = ((Number) a4.getValue()).floatValue() * 360.0f;
                            int i9 = i8;
                            float f7 = f5;
                            if (i9 != 0 && Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (oioVar.d() >> 32))) {
                                f7 += f;
                            }
                            float k1 = (f7 / ((float) (oioVar.k1(Float.intBitsToFloat((int) (oioVar.d() >> 32))) * 3.141592653589793d))) * 360.0f;
                            float floatValue2 = ((Number) a3.getValue()).floatValue() + ((Number) a2.getValue()).floatValue();
                            long n1 = oioVar.n1();
                            er9.b a0 = oioVar.a0();
                            long d = a0.d();
                            a0.a().e();
                            try {
                                a0.a.h(floatValue2, n1);
                                w2e0.b(oioVar, Math.min(floatValue, k1) + floatValue, (360.0f - floatValue) - (Math.min(floatValue, k1) * 2), j7, frm0Var2);
                                j6 = d;
                                try {
                                    w2e0.b(oioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue, j8, frm0Var2);
                                    nq.b(a0, j6);
                                    return s3q0.a;
                                } catch (Throwable th) {
                                    th = th;
                                    nq.b(a0, j6);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j6 = d;
                            }
                        }
                    };
                    M.R(obj);
                } else {
                    obj = x;
                    f5 = f6;
                }
                xa4.i(0, M, (izs) obj, q);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f3 = f5;
                i3 = i5;
            }
            z = true;
            z2 = J | z;
            Object x2 = M.x();
            if (z2) {
            }
            f5 = f6;
            final long j52 = j4;
            final int i82 = i5;
            obj = new izs() { // from class: xsna.n2e0
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    long j6;
                    long j7 = j3;
                    frm0 frm0Var2 = frm0Var;
                    long j8 = j52;
                    oio oioVar = (oio) obj2;
                    float floatValue = ((Number) a4.getValue()).floatValue() * 360.0f;
                    int i9 = i82;
                    float f7 = f5;
                    if (i9 != 0 && Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (oioVar.d() >> 32))) {
                        f7 += f;
                    }
                    float k1 = (f7 / ((float) (oioVar.k1(Float.intBitsToFloat((int) (oioVar.d() >> 32))) * 3.141592653589793d))) * 360.0f;
                    float floatValue2 = ((Number) a3.getValue()).floatValue() + ((Number) a2.getValue()).floatValue();
                    long n1 = oioVar.n1();
                    er9.b a0 = oioVar.a0();
                    long d = a0.d();
                    a0.a().e();
                    try {
                        a0.a.h(floatValue2, n1);
                        w2e0.b(oioVar, Math.min(floatValue, k1) + floatValue, (360.0f - floatValue) - (Math.min(floatValue, k1) * 2), j7, frm0Var2);
                        j6 = d;
                        try {
                            w2e0.b(oioVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue, j8, frm0Var2);
                            nq.b(a0, j6);
                            return s3q0.a;
                        } catch (Throwable th) {
                            th = th;
                            nq.b(a0, j6);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j6 = d;
                    }
                }
            };
            M.R(obj);
            xa4.i(0, M, (izs) obj, q);
            if (androidx.compose.runtime.b.d()) {
            }
            f3 = f5;
            i3 = i5;
        } else {
            q630Var2 = q630Var;
            M.h();
            f3 = f2;
            i3 = i;
            j3 = j2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(f, f3, i3, i2, j, j3, q630Var3) { // from class: xsna.o2e0
                public final /* synthetic */ q630 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ float d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;
                public final /* synthetic */ float g;

                {
                    this.b = q630Var3;
                    this.c = j;
                    this.e = j3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(391);
                    w2e0.a(this.d, this.g, this.f, I, this.c, this.e, (androidx.compose.runtime.a) obj2, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(oio oioVar, float f, float f2, long j, frm0 frm0Var) {
        float f3 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - (f3 * (frm0Var.a / f3));
        oio.X0(oioVar, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var, 832);
    }
}
