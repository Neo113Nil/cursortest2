package xsna;

import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.stickers.roulette.StickersRouletteFragment;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sme0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ sme0(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        switch (i) {
            case 0:
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    TextView Jn = dw20Var.Jn();
                    int i2 = com.vk.qrcode.d.f;
                    bwt0.e0(Jn, 0, i2, 0, i2);
                    Jn.setGravity(8388611);
                    Jn.setMovementMethod(LinkMovementMethod.getInstance());
                    ViewGroup Gn = dw20Var.Gn();
                    if (Gn != null) {
                        f4m.t(i2, Gn);
                    }
                }
                break;
            default:
                int i3 = StickersRouletteFragment.o0;
                dw20 dw20Var2 = (dw20) ref$ObjectRef.element;
                if (dw20Var2 != null) {
                    dw20Var2.hide();
                }
                break;
        }
        return s3q0.a;
    }
}
