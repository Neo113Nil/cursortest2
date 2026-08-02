package xsna;

import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: CameraReplyDelegate.kt */
/* loaded from: classes16.dex */
public final class cl9 implements l7s0 {
    public final /* synthetic */ r4g0 a;
    public final /* synthetic */ dl9 b;

    /* compiled from: CameraReplyDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public cl9(r4g0 r4g0Var, dl9 dl9Var) {
        this.a = r4g0Var;
        this.b = dl9Var;
    }

    @Override // xsna.l7s0
    public final void a(final float f) {
        final r4g0 r4g0Var = this.a;
        i0q0.f(new gzs() { // from class: xsna.bl9
            @Override // xsna.gzs
            public final Object invoke() {
                r4g0 r4g0Var2 = r4g0.this;
                r4g0Var2.setDeterminateProgress(true);
                r4g0Var2.setLoadingProgress(an10.b(f * 100));
                return s3q0.a;
            }
        });
    }

    @Override // xsna.l7s0
    public final void b(String str, String str2) {
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new al9(str2, 0));
        asu0 asu0Var = asu0.a;
        itg0.h(vVar.q(asu0Var.c()).m(asu0Var.d()), new com.vk.movika.sdk.base.observable.a(this.a, 13), new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
    }

    @Override // xsna.l7s0
    public final void d() {
        r4g0 r4g0Var = this.a;
        r4g0Var.setLoadingVisible(false);
        r4g0Var.getVideo().setShowOnlyFirstFrame(true);
        this.b.c.O7(false);
        cvk.u(R.string.download_error, true);
    }

    @Override // xsna.l7s0
    public final void c() {
    }
}
