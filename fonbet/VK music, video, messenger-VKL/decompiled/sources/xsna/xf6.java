package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionModalPageDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.ButtonActionModalPage;

/* compiled from: BaseLinkButtonActionToButtonActionMapper.kt */
/* loaded from: classes3.dex */
public final class xf6 {

    /* compiled from: BaseLinkButtonActionToButtonActionMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseLinkButtonActionModalPageDto.TypeDto.values().length];
            try {
                iArr[BaseLinkButtonActionModalPageDto.TypeDto.WORKI_CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ButtonAction a(BaseLinkButtonActionDto baseLinkButtonActionDto) {
        ButtonActionModalPage buttonActionModalPage;
        if (baseLinkButtonActionDto != null) {
            BaseOwnerButtonActionTargetDto B = baseLinkButtonActionDto.B();
            String i = B != null ? B.i() : null;
            String url = baseLinkButtonActionDto.getUrl();
            if (url != null) {
                AwayLink awayLink = new AwayLink(url, null);
                UserId i2 = baseLinkButtonActionDto.i();
                int i3 = i2 != null ? (int) i2.b : 0;
                String j = baseLinkButtonActionDto.C().j();
                BaseLinkButtonActionModalPageDto n = baseLinkButtonActionDto.n();
                if (n == null) {
                    buttonActionModalPage = null;
                } else {
                    BaseLinkButtonActionModalPageDto.TypeDto d = n.d();
                    buttonActionModalPage = new ButtonActionModalPage((d == null ? -1 : a.$EnumSwitchMapping$0[d.ordinal()]) == 1 ? ButtonActionModalPage.Type.WORKI_CONTACT : null, null, n.r(), 2, null);
                }
                return new ButtonAction(i, i3, j, awayLink, null, buttonActionModalPage);
            }
        }
        return null;
    }
}
