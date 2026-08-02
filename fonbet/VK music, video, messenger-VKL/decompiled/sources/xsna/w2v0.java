package xsna;

import android.content.Context;
import android.view.View;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w2v0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w2v0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                x2v0 x2v0Var = (x2v0) this.c;
                VkLoginConfirmationStatusType vkLoginConfirmationStatusType = (VkLoginConfirmationStatusType) this.d;
                Object obj = x2v0Var.o;
                if (obj == null) {
                    obj = null;
                }
                ((u2v0) obj).T(vkLoginConfirmationStatusType);
                break;
            case 1:
                haw0 haw0Var = (haw0) this.c;
                i70 i70Var = (i70) this.d;
                haw0Var.getClass();
                y8w0 y8w0Var = new y8w0(0);
                y8w0Var.e = Boolean.TRUE;
                y8w0Var.f = "vmoji_avatar_suggestion_stickers_suggestions";
                String a = y8w0Var.a();
                d6w0 e = b6m.e();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                d6w0.a(e, context, "vmoji_avatar_suggestion_stickers_suggestions", a, 8);
                i70Var.invoke();
                break;
            default:
                mxy0 mxy0Var = (mxy0) this.c;
                wty0 wty0Var = (wty0) this.d;
                bjy0 bjy0Var = mxy0Var.a;
                fvy0 fvy0Var = mxy0Var.f;
                if (fvy0Var == null || !fvy0Var.c()) {
                    fvy0 fvy0Var2 = mxy0Var.f;
                    if (fvy0Var2 != null) {
                        fvy0Var2.b(bjy0Var.getContext());
                        break;
                    } else {
                        de.L(wty0Var.b, null, null, null, bjy0Var.getContext());
                        break;
                    }
                }
                break;
        }
    }
}
