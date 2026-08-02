package xsna;

import android.view.View;
import com.vk.clips.sdk.facade.api.MyTargetFacadeClickTarget;
import com.vk.mvi.MviLazyViewContainer;
import xsna.mp50;

/* compiled from: MyTargetFacadeToClickHandlerAdapter.kt */
/* loaded from: classes4.dex */
public final class bq50 implements wp50 {
    public final mp50 a;

    /* compiled from: MyTargetFacadeToClickHandlerAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MyTargetFacadeClickTarget.values().length];
            try {
                iArr[MyTargetFacadeClickTarget.CTA_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyTargetFacadeClickTarget.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bq50(mp50 mp50Var) {
        this.a = mp50Var;
    }

    public static mp50.a i(MyTargetFacadeClickTarget myTargetFacadeClickTarget) {
        int i = a.$EnumSwitchMapping$0[myTargetFacadeClickTarget.ordinal()];
        if (i == 1) {
            return mp50.a.b.a;
        }
        if (i == 2) {
            return mp50.a.c.a;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Received " + myTargetFacadeClickTarget + " , but CTA_BUTTON/TITLE expected"));
        return null;
    }

    @Override // xsna.wp50
    public final long a() {
        return 0L;
    }

    @Override // xsna.wp50
    public final String b() {
        return null;
    }

    @Override // xsna.wp50
    public final String e() {
        return "";
    }

    @Override // xsna.zp50
    public final void f(xp50 xp50Var) {
        i0q0.j(new vo2(3, this, xp50Var));
    }

    @Override // xsna.wp50
    public final void g() {
    }

    @Override // xsna.wp50
    public final void c(MviLazyViewContainer mviLazyViewContainer) {
    }

    @Override // xsna.wp50
    public final void h(izs<? super String, s3q0> izsVar) {
    }

    @Override // xsna.wp50
    public final void d(View view, m960 m960Var, tbe0 tbe0Var) {
    }
}
