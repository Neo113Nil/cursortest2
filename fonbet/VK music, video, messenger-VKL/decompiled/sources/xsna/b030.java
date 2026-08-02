package xsna;

import android.view.View;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b030 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b030(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                c030 c030Var = (c030) this.c;
                VKImageController<? extends View> vKImageController = (VKImageController) this.d;
                String str = (String) this.e;
                e030 e030Var = c030Var.C;
                if (e030Var != null) {
                    e030Var.a(vKImageController, str);
                    break;
                }
                break;
            default:
                bo30 bo30Var = (bo30) this.c;
                Msg msg = (Msg) this.d;
                Attach attach = (Attach) this.e;
                pk30 pk30Var = bo30Var.l;
                if (pk30Var != null) {
                    co30 co30Var = bo30Var.k;
                    pk30Var.R(attach, msg, co30Var != null ? co30Var.w : null);
                    break;
                }
                break;
        }
    }
}
