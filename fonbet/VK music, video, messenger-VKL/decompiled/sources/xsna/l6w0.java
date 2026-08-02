package xsna;

import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.vmoji.character.model.VmojiProductModel;
import xsna.e6w0;
import xsna.m5x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l6w0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6w0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((m6w0) obj2).C(new e6w0.b((VmojiProductModel) obj));
                break;
            case 1:
                break;
            case 2:
                g6x0 g6x0Var = ((f6x0) obj2).b;
                g6x0Var.b.C(new m5x0.b(g6x0Var.a));
                break;
            case 3:
                ((ufg0) obj2).invoke((Throwable) obj);
                break;
            default:
                xkx0 xkx0Var = (xkx0) obj2;
                xkx0Var.A0(xkx0Var.x.b, (VkAuthValidatePhoneResult) obj);
                break;
        }
        return s3q0.a;
    }
}
