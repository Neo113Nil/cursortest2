package xsna;

import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import xsna.h6x0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pst0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pst0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                ((LinearLayout) obj2).getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                break;
            case 1:
                Throwable th = (Throwable) obj;
                r6y r6yVar = ((jwv0) obj2).b;
                if (r6yVar != null) {
                    r6yVar.z(JsApiMethodType.GET_PHONE_NUMBER, th);
                }
                break;
            case 2:
                ((m6w0) obj2).getClass();
                break;
            case 3:
                break;
            case 4:
                lcw0 lcw0Var = (lcw0) obj2;
                SessionRoomsDialog.a aVar = new SessionRoomsDialog.a();
                aVar.a = SessionRoomsDialog.DialogKind.SEND_MESSAGE_TO_ROOMS;
                aVar.a(lcw0Var.a.getParentFragmentManager());
                lcw0Var.c.invoke();
                break;
            case 5:
                VoipActionMultiLineView.b(((rnw0) obj2).k, ((Boolean) obj).booleanValue());
                break;
            case 6:
                ((nrw0) obj2).q(xcw0.n0.a);
                break;
            case 7:
                f6x0 f6x0Var = (f6x0) obj2;
                h6x0.e.a aVar2 = (h6x0.e.a) obj;
                int i2 = y5x0.l1;
                w5w0 w5w0Var = aVar2.a;
                String str = aVar2.b;
                int i3 = s5x0.e;
                int width = w5w0Var.getWidth();
                int height = w5w0Var.getHeight();
                com.vk.voip.ui.c.b.getClass();
                CallId b = com.vk.voip.ui.c.r.b();
                if (b == null) {
                    b = CallId.e;
                }
                s5x0 s5x0Var = new s5x0(b, str, width, height, true);
                ImageView imageView = f6x0Var.k;
                imageView.setBackground(new p5x0(s5x0Var.d, cn70.a() * 40.0f));
                imageView.setImageDrawable(s5x0Var);
                break;
            default:
                xkx0 xkx0Var = (xkx0) obj2;
                pir0.a(xkx0Var.G, xkx0Var.x.b, (VkAuthValidateAccountResponse) obj, null, 10);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pst0(qst0 qst0Var, LinearLayout linearLayout) {
        this.b = 0;
        this.c = linearLayout;
    }
}
