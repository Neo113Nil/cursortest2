package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.fullscreenvideo.ControlsState;
import xsna.z5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class zq2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zq2(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((ar2) obj5).a((wlp0) obj4, (uuk0) obj3, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ay9.d((izs) obj5, (a.C0919a) obj4, (CartItem.d.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                String str = ClipsUploadFragmentImpl.a0;
                ((ClipsUploadFragmentImpl) obj5).eo((z37) obj4, obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((z5h.b) obj5).e((wh50) obj4, (yzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(i2 | 1);
                i3p0.a(I2, (androidx.compose.runtime.a) obj, (gzs) obj5, (gzs) obj4, (q630) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                p8p0.e((ControlsState.b) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zq2(ar2 ar2Var, wlp0 wlp0Var, uuk0 uuk0Var, int i, int i2) {
        this.b = 0;
        this.d = ar2Var;
        this.e = wlp0Var;
        this.f = uuk0Var;
        this.c = i;
    }

    public /* synthetic */ zq2(izs izsVar, a.C0919a c0919a, CartItem.d.a aVar, int i) {
        this.b = 1;
        this.d = izsVar;
        this.e = c0919a;
        this.f = aVar;
        this.c = i;
    }
}
