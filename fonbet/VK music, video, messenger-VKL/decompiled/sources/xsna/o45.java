package xsna;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.room.RoomDatabase;
import com.vk.core.view.IndeterminateProgressBarWithLogoView;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.superapp.api.exceptions.AuthException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o45 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o45(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                MailAuthFlowConfig mailAuthFlowConfig = (MailAuthFlowConfig) this.c;
                Throwable th = (Throwable) obj;
                if (!(th instanceof AuthException.NeedSilentAuthException)) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                if (mailAuthFlowConfig != null && (str = mailAuthFlowConfig.b) != null && str.length() != 0) {
                    AuthException.NeedSilentAuthException needSilentAuthException = (AuthException.NeedSilentAuthException) th;
                    if (needSilentAuthException.g().length() != 0 && needSilentAuthException.i().length() != 0 && !mailAuthFlowConfig.d) {
                        l55.a.getClass();
                        io.reactivex.rxjava3.internal.operators.observable.o1 o1Var = new io.reactivex.rxjava3.internal.operators.observable.o1(((ad00) l55.g.getValue()).invoke(), new u45(new t45(0)));
                        final tk1 tk1Var = new tk1(1, th, str);
                        return o1Var.L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.v45
                            @Override // io.reactivex.rxjava3.functions.l
                            public final Object apply(Object obj2) {
                                return (io.reactivex.rxjava3.core.t) tk1.this.invoke(obj2);
                            }
                        }, false);
                    }
                }
                return io.reactivex.rxjava3.core.q.H(th);
            case 1:
                Handler handler = (Handler) this.c;
                Runnable runnable = (Runnable) obj;
                if (epx.f(Looper.myLooper(), handler.getLooper())) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
                return s3q0.a;
            case 2:
                ((ImageView) this.c).setTranslationY((-IndeterminateProgressBarWithLogoView.b) * ((Float) obj).floatValue());
                return s3q0.a;
            case 3:
                return ((RoomDatabase) this.c).g((androidx.room.b) obj);
            default:
                return new ptt0((b2a) obj, (m7a) this.c);
        }
    }
}
