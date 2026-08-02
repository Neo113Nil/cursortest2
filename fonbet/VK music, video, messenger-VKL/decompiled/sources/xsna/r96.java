package xsna;

import android.os.CountDownTimer;
import xsna.qr9;

/* compiled from: BaseCaptchaPresenter.kt */
/* loaded from: classes15.dex */
public abstract class r96 implements pr9 {
    public Object a;
    public int b;
    public qr9 c = new qr9.b(this.b);
    public final a d = new a(new com.vk.movika.sdk.base.logic.interactor.p(this, 6));

    /* compiled from: BaseCaptchaPresenter.kt */
    public static final class a extends CountDownTimer {
        public final com.vk.movika.sdk.base.logic.interactor.p a;

        public a(com.vk.movika.sdk.base.logic.interactor.p pVar) {
            super(5000L, 1000L);
            this.a = pVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.a.invoke(0L);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            this.a.invoke(Long.valueOf(j));
        }
    }

    @Override // xsna.pr9
    public final void a(String str) {
        if (drm0.N(str)) {
            return;
        }
        b(new qr9.a(str, this.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.or9] */
    public final void b(qr9 qr9Var) {
        this.c = qr9Var;
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.a(qr9Var);
        }
    }

    public void e() {
        refresh();
    }
}
