package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lhnf0;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface hnf0 extends l050 {
    ReferralCode getInitialReferralCode();

    void overrideBackgroundColor(String str);

    void overrideFirstButtonColors(String str, String str2);

    void overridePromocodeColor(String str);

    void overrideRidesLeftColor(String str);

    void overrideSendButtonColors(String str, String str2);

    void setBackgroundImage(String str, int i);

    void setBodyText(String str);

    void setButtonGroupVisibility(boolean z);

    void setConsiderOnlyTextForBottomViewsVisibility(boolean z);

    void setFirstButtonState(boolean z, String str);

    void setLoadingVisibility(boolean z);

    void setPromoCodeText(String str);

    void setRidesLeftText(String str);

    void setSendButtonText(String str);

    void setTitleText(String str);
}
