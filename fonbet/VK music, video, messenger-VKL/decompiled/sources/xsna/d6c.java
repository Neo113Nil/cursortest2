package xsna;

import android.graphics.Bitmap;
import android.widget.Toast;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.ppr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d6c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d6c(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                a6c a6cVar = ((e6c) this.d).b;
                if (((gt9) obj).b()) {
                    List<? extends hfz> list = a6cVar.un().h;
                    if (!ttp0.f(list)) {
                        list = new ArrayList(list);
                    }
                    int i = this.c;
                    list.remove(i);
                    a6cVar.un().setItems(list);
                    a6cVar.un().notifyItemRemoved(i);
                } else {
                    Toast.makeText(a6cVar.requireContext(), R.string.vk_pay_checkout_methods_list_failed_to_unbind_card, 0).show();
                }
                break;
            case 1:
                ppr0 ppr0Var = (ppr0) this.d;
                Bitmap bitmap = (Bitmap) obj;
                ppr0.a aVar = ppr0Var.h;
                if (aVar != null) {
                    aVar.d(bitmap, this.c, true);
                }
                ppr0Var.h();
                break;
            default:
                ((atu0) this.d).a.put(Integer.valueOf(this.c), (wmu0) obj);
                break;
        }
        return s3q0.a;
    }
}
