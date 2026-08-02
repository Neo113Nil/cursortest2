package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.o9t;
import xsna.usc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uzo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ uzo(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new usc.b.g((String) obj));
                return s3q0.a;
            case 1:
                this.c.invoke(new o9t.a((uet) obj));
                return s3q0.a;
            case 2:
                z5x z5xVar = (z5x) obj;
                z5xVar.getClass();
                z5xVar.a.c(SignalingProtocol.KEY_OFFSET, this.c);
                return s3q0.a;
            case 3:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new xk0(tf3.b(viewGroup, R.layout.list_money_add_card_item, viewGroup, false), this.c);
            default:
                this.c.invoke((tho0) obj);
                return s3q0.a;
        }
    }
}
