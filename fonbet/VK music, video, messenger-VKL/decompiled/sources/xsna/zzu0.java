package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import java.util.List;

/* compiled from: VkIdentityEditContractCommon.kt */
/* loaded from: classes6.dex */
public interface zzu0 {
    void Ce(WebIdentityCard webIdentityCard);

    void E();

    void R0(VKApiException vKApiException);

    void fa(WebIdentityCard webIdentityCard);

    Context getContext();

    void reset();

    void vd(List<WebIdentityLabel> list);
}
