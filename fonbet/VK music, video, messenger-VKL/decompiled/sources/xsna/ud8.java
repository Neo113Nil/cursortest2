package xsna;

import android.widget.TextView;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.log.L;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.feature.pin.success.PinSuccessView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.je10;
import xsna.ruf;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ud8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                ((ke8) this.receiver).b((le8) obj);
                break;
            case 1:
                ((e3a) this.receiver).getClass();
                break;
            case 2:
                L.i((Throwable) obj);
                break;
            case 3:
                ((m8b) this.receiver).getClass();
                L.i((Throwable) obj);
                break;
            case 4:
                Throwable th = (Throwable) obj;
                xyb xybVar = (xyb) this.receiver;
                f9w f9wVar = xyb.C;
                xybVar.getClass();
                xyb.C.a(th);
                xybVar.q = zyb.a(xybVar.q, null, false, false, null, false, null, 1919);
                if (xybVar.A != null) {
                    zk70.e(th);
                }
                break;
            case 5:
                ((iqf) this.receiver).T((ttf) obj);
                break;
            case 6:
                ruf rufVar = (ruf) obj;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                if (rufVar instanceof ruf.b) {
                    x9q0 x9q0Var = clipsWrapperFragment.E0;
                    if (x9q0Var != null) {
                        x9q0Var.b();
                    }
                    x9q0 x9q0Var2 = clipsWrapperFragment.E0;
                    if (x9q0Var2 != null) {
                        x9q0Var2.a();
                    }
                } else if (rufVar instanceof ruf.c) {
                    x9q0 x9q0Var3 = clipsWrapperFragment.E0;
                    if (x9q0Var3 != null) {
                        x9q0Var3.c();
                    }
                    x9q0 x9q0Var4 = clipsWrapperFragment.E0;
                    if (x9q0Var4 != null) {
                        x9q0Var4.a();
                    }
                } else {
                    int i = ClipsWrapperFragment.Q0;
                    clipsWrapperFragment.getClass();
                }
                break;
            case 7:
                ((hp5) this.receiver).setItems((List) obj);
                break;
            case 8:
                he10 he10Var = (he10) this.receiver;
                he10Var.getClass();
                he10Var.T(new je10.a((hej0) obj));
                break;
            case 9:
                b0l0 b0l0Var = (b0l0) obj;
                nma0 nma0Var = (nma0) this.receiver;
                nma0Var.getClass();
                mma0 mma0Var = nma0Var.e;
                SchemeStatSak$TypeVkPayCheckoutItem.EventType eventType = SchemeStatSak$TypeVkPayCheckoutItem.EventType.NEW_PIN;
                shn0 shn0Var = nma0Var.i;
                shn0Var.a.a(b0l0Var);
                shn0Var.a(eventType);
                shn0Var.a.a(null);
                if (b0l0Var.b()) {
                    lo10 lo10Var = new lo10(nma0Var, 16);
                    PinSuccessView pinSuccessView = mma0Var.u;
                    if (pinSuccessView == null) {
                        pinSuccessView = null;
                    }
                    pinSuccessView.setOnShownListener(lo10Var);
                    PinSuccessView pinSuccessView2 = mma0Var.u;
                    (pinSuccessView2 != null ? pinSuccessView2 : null).a();
                } else {
                    nma0Var.a();
                    TextView textView = mma0Var.s;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setVisibility(0);
                    TextView textView2 = mma0Var.s;
                    (textView2 != null ? textView2 : null).setText(R.string.vk_pay_checkout_something_wrong);
                }
                break;
            case 10:
                obj2 = q81.a(this.receiver).get(vw6.b(obj));
                break;
            case 11:
                j03.l((Throwable) obj);
                break;
            default:
                ((com.vk.video.profile.presentation.c) this.receiver).T((com.vk.video.profile.presentation.f) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 10:
                super(1, obj, y92.d(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
                break;
            case 11:
                super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, com.vk.video.profile.presentation.c.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0);
                break;
            default:
                break;
        }
    }
}
