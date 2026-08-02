package xsna;

import android.content.Context;
import com.vk.auth.VkValidatePhoneRouterInfo;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;

/* compiled from: ValidatePhoneRouter.kt */
/* loaded from: classes.dex */
public final class tir0 {
    public final Context a;
    public final AuthModel b;
    public final SignUpRouter c;

    public tir0(Context context, AuthModel authModel, SignUpRouter signUpRouter) {
        this.a = context;
        this.b = authModel;
        this.c = signUpRouter;
    }

    public static /* synthetic */ void b(tir0 tir0Var, String str, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        tir0Var.a(str, z, false, vkAuthValidatePhoneResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, boolean z, boolean z2, VkAuthValidatePhoneResult vkAuthValidatePhoneResult) {
        sir0 sir0Var = sir0.a;
        sir0Var.getClass();
        LibverifyScreenData a = sir0.a(this.a, str, vkAuthValidatePhoneResult, true, true, z);
        String str2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        boolean z3 = false;
        sir0.f(sir0Var, this.c, null, null, new VkValidatePhoneRouterInfo(z3, new VerificationScreenData.Phone(str, VkPhoneFormatUtils.a(this.a, str, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12), vkAuthValidatePhoneResult.zb(), false, vkAuthValidatePhoneResult, true, true, z, null, str2, null, null, 3848, null), vkAuthValidatePhoneResult.zb(), a, new VkAuthMetaInfo(objArr2, str2, objArr3, SilentAuthSource.BY_PHONE, null, objArr, 55, null), str2, z2, 32, 0 == true ? 1 : 0), 6);
    }
}
