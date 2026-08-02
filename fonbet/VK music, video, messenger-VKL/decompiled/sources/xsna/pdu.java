package xsna;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Lambda;
import xsna.mdu;

/* compiled from: AndroidGraphicsLayer.android.kt */
/* loaded from: classes11.dex */
public interface pdu {
    public static final a a = a.a;

    /* compiled from: AndroidGraphicsLayer.android.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C3508a b = C3508a.i;

        /* compiled from: AndroidGraphicsLayer.android.kt */
        /* renamed from: xsna.pdu$a$a, reason: collision with other inner class name */
        public static final class C3508a extends Lambda implements izs<oio, s3q0> {
            public static final C3508a i = new C3508a(1);

            @Override // xsna.izs
            public final s3q0 invoke(oio oioVar) {
                oio.P(oioVar, l5g.j, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            }
        }
    }

    void A(float f);

    void B(float f);

    gyf0 C();

    default boolean D() {
        return true;
    }

    void E(Outline outline, long j);

    float F();

    void G();

    float H();

    float I();

    float J();

    void K(long j);

    float L();

    float M();

    long N();

    float O();

    Matrix P();

    int Q();

    void R(int i, int i2, long j);

    long S();

    void T(azl azlVar, LayoutDirection layoutDirection, mdu mduVar, mdu.a aVar);

    int U();

    void V(yq9 yq9Var);

    void W(int i);

    float a();

    void b(float f);

    d6g c();

    void f(boolean z);

    void g(float f);

    void h(float f);

    void i(float f);

    void j(float f);

    void l(int i);

    void m(long j);

    void n(float f);

    void o(float f);

    float p();

    float q();

    void r(long j);

    void s(gyf0 gyf0Var);

    void t();

    void u(float f);
}
