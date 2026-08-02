package xsna;

import android.content.Context;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.log.L;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class v6v0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v6v0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        File file;
        switch (this.b) {
            case 0:
                w6v0 w6v0Var = (w6v0) this.c;
                String str = (String) this.d;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                SignUpDataHolder signUpDataHolder = w6v0Var.p;
                SignUpDataHolder signUpDataHolder2 = signUpDataHolder != null ? signUpDataHolder : null;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                signUpDataHolder2.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_PHONE, null, null, 55);
                tir0.b(w6v0Var.C, str, vkAuthValidatePhoneResult, false, 12);
                break;
            default:
                Context context = (Context) this.c;
                b25 b25Var = (b25) this.d;
                File file2 = (File) obj;
                try {
                    file = l370.L(file2);
                } catch (Throwable th) {
                    enj.r(context, "Trace zip failed: " + th.getMessage(), 0);
                    L.i(th);
                    file = null;
                }
                if (file != null) {
                    try {
                        file2.delete();
                    } catch (Throwable th2) {
                        enj.r(context, "Unable to delete original trace file: " + th2.getMessage(), 0);
                        L.i(th2);
                    }
                }
                if (file != null) {
                    file2 = file;
                }
                enj.r(context, "Trace collected: " + file2, 1);
                com.vk.upload.impl.a.i(new com.vk.upload.impl.tasks.i(file2.getAbsolutePath(), b25Var.c(), false, true));
                break;
        }
        return s3q0.a;
    }
}
