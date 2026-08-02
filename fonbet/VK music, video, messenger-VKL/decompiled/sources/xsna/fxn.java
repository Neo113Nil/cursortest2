package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.api.generated.donut.dto.DonutBannerDto;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.profile.DonutBanner;

/* compiled from: DonutBannerFromDtoMapper.kt */
/* loaded from: classes5.dex */
public final class fxn {

    /* compiled from: DonutBannerFromDtoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutBannerDto.IconDto.values().length];
            try {
                iArr[DonutBannerDto.IconDto.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r3 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DonutBanner.a a(BaseLinkButtonDto baseLinkButtonDto) {
        ActionOpenUrl actionOpenUrl;
        String url;
        ActionOpenUrl.Target target;
        BaseOwnerButtonActionTargetDto B;
        String title = baseLinkButtonDto.getTitle();
        if (title == null) {
            title = "";
        }
        BaseLinkButtonActionDto e = baseLinkButtonDto.e();
        if (e == null || (url = e.getUrl()) == null) {
            actionOpenUrl = null;
        } else {
            BaseLinkButtonActionDto e2 = baseLinkButtonDto.e();
            if (e2 != null && (B = e2.B()) != null) {
                String i = B.i();
                target = epx.f(i, BaseOwnerButtonActionTargetDto.INTERNAL.i()) ? ActionOpenUrl.Target.f88internal : epx.f(i, BaseOwnerButtonActionTargetDto.EXTERNAL.i()) ? ActionOpenUrl.Target.external : epx.f(i, BaseOwnerButtonActionTargetDto.AUTHORIZE.i()) ? ActionOpenUrl.Target.authorize : ActionOpenUrl.Target.f30default;
            }
            target = ActionOpenUrl.Target.f30default;
            actionOpenUrl = new ActionOpenUrl(url, target);
        }
        return new DonutBanner.a(title, actionOpenUrl, baseLinkButtonDto.d());
    }
}
