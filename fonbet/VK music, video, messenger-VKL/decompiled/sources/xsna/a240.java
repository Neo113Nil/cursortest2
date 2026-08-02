package xsna;

import android.content.DialogInterface;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import kotlin.NoWhenBranchMatchedException;
import xsna.x3a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class a240 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a240(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        VkPhoneValidationErrorReason vkPhoneValidationErrorReason;
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                return;
            default:
                Object obj = ((v3a0) this.c).o;
                if (obj == null) {
                    obj = null;
                }
                x3a0 x3a0Var = (x3a0) obj;
                g4a0 g4a0Var = x3a0Var.A;
                g4a0Var.getClass();
                g4a0Var.a(new rjd(com.vk.registration.funnels.b.a, 4));
                int i2 = x3a0.a.$EnumSwitchMapping$0[x3a0Var.x.e.ordinal()];
                if (i2 == 1) {
                    vkPhoneValidationErrorReason = VkPhoneValidationErrorReason.LOGOUT;
                } else if (i2 == 2) {
                    vkPhoneValidationErrorReason = VkPhoneValidationErrorReason.UNLINK;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkPhoneValidationErrorReason = VkPhoneValidationErrorReason.LATER;
                }
                x3a0Var.y0(vkPhoneValidationErrorReason);
                return;
        }
    }
}
