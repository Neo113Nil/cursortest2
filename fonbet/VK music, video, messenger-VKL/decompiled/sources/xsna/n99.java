package xsna;

import android.util.Log;
import com.vk.im.engine.ImEnvironmentNotReadyException;
import com.vk.log.L;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.utils.Logger;
import xsna.ca9;
import xsna.go0;

/* compiled from: CallSettingsFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class n99 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n99(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                m99 m99Var = (m99) this.receiver;
                m99Var.getClass();
                m99Var.d(new lz0((whr0) obj, 10));
                m99Var.f(s99.a(m99Var.j(), null, null, null, null, go0.d.a, null, null, false, 239));
                if (m99Var.j().c instanceof ca9.c) {
                    m99Var.r();
                }
                break;
            case 1:
                fhe fheVar = (fhe) this.receiver;
                fheVar.getClass();
                io.reactivex.rxjava3.internal.operators.completable.y q = io.reactivex.rxjava3.core.a.l(new dhe(objArr == true ? 1 : 0, fheVar, (e2f) obj)).q(fheVar.b());
                asu0.a.getClass();
                break;
            case 2:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                break;
            case 3:
                L.i((Throwable) obj);
                break;
            case 4:
                ((bbp) this.receiver).a((uap) obj);
                break;
            case 5:
                ghq0 ghq0Var = (ghq0) obj;
                jcu jcuVar = (jcu) this.receiver;
                jcuVar.getClass();
                String str = ghq0Var.a;
                if (str != null) {
                    jcuVar.l.setImageBitmap(ghq0Var.b);
                    jcuVar.m.setText(str);
                }
                fyt0.o(jcuVar.j, str != null);
                break;
            case 6:
                yj50 yj50Var = (yj50) this.receiver;
                qcy<Object>[] qcyVarArr = yj50.m;
                Log.e(yj50Var.getClass().getCanonicalName(), "Error!", (Throwable) obj);
                break;
            case 7:
                ((dv60) this.receiver).c((xh60) obj);
                break;
            case 8:
                ((c4a0) this.receiver).f((Throwable) obj);
                break;
            case 9:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 10:
                Throwable th = (Throwable) obj;
                ((psp0) this.receiver).getClass();
                if (!(th instanceof ImEnvironmentNotReadyException) && !(th instanceof TimeoutException)) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("TsCompanion seed unhandled scenario", th));
                }
                break;
            case 11:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                break;
            default:
                ((wzh0) this.receiver).i(((Boolean) obj).booleanValue());
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n99(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, jcu.class, "handleUserData", "handleUserData(Lcom/vk/attachpicker/impl/graffiti/domain/model/UserData;)V", 0);
                break;
            case 6:
                super(1, obj, yj50.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, dv60.class, "sendEvent", "sendEvent(Lcom/vk/mvi/MviEvent;)V", 0);
                break;
            case 8:
            case 10:
            default:
                break;
            case 9:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n99(m99 m99Var) {
        super(1, m99Var, m99.class, "onAddToFriendsSuccess", "onAddToFriendsSuccess(Lcom/vk/voip/dto/VKUser;)V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n99(psp0 psp0Var) {
        super(1, psp0Var, psp0.class, "logIfRequired", "logIfRequired(Ljava/lang/Throwable;)Z", 0);
        this.b = 10;
    }
}
