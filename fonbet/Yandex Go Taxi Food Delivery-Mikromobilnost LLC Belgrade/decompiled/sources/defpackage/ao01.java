package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public final class ao01 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        boolean z;
        yn01 yn01Var = (yn01) obj;
        String str = yn01Var.a;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            if (!atb1.b(str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        boolean z2 = z && str.length() > 0;
        return new zn01(yn01Var.b(), yn01Var.b, z2, z ? new Text.Resource(dzh0.ybsdk_transfer_transfer_receiver_name_error_switch_keyboard) : null, z2 ? ung0.ybColor_textIcon_negative : ung0.ybColor_textIcon_secondary);
    }
}
