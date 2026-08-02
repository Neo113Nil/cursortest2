package xsna;

import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.auth.validation.VkBanRouterInfo;
import com.vk.auth.validation.VkChangePhoneRouterInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.auth.validation.VkValidateRouterInfo;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;

/* compiled from: VkExtraValidationRouter.kt */
/* loaded from: classes15.dex */
public interface ctu0 {
    void C0(CreateVkEmailRequiredData createVkEmailRequiredData);

    void D0(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo);

    void a(VkChangePhoneRouterInfo vkChangePhoneRouterInfo);

    void b(VkBanRouterInfo vkBanRouterInfo);

    void c(VkPassportRouterInfo vkPassportRouterInfo);

    void d(VkValidateRouterInfo vkValidateRouterInfo, boolean z);

    void e(VkAdditionalSignUpData vkAdditionalSignUpData);
}
