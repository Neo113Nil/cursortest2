package xsna;

import com.vk.api.generated.discover.dto.DiscoverCarouselButtonActionTypeDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonContextDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonTypeDto;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.actions.ActionOpenVkApp;
import com.vk.dto.common.actions.ButtonContext;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DiscoverCarouselButtonDtoToLinkButtonMapper.kt */
/* loaded from: classes3.dex */
public final class s1n {

    /* compiled from: DiscoverCarouselButtonDtoToLinkButtonMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverCarouselButtonActionTypeDto.values().length];
            try {
                iArr[DiscoverCarouselButtonActionTypeDto.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverCarouselButtonActionTypeDto.OPEN_VKAPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscoverCarouselButtonActionTypeDto.OPEN_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static LinkButton a(DiscoverCarouselButtonDto discoverCarouselButtonDto) {
        Action actionOpenUrl;
        DiscoverCarouselButtonContextDto d = discoverCarouselButtonDto.d().d();
        int i = a.$EnumSwitchMapping$0[discoverCarouselButtonDto.d().e().ordinal()];
        if (i == 1) {
            String url = discoverCarouselButtonDto.d().getUrl();
            if (url == null) {
                url = "";
            }
            actionOpenUrl = new ActionOpenUrl(url, null, 2, null);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            actionOpenUrl = new ActionOpenVkApp(null, d != null ? d.d() : 0L, discoverCarouselButtonDto.d().getUrl(), new ButtonContext(d != null ? d.d() : 0L, d != null ? d.e() : null, d != null ? d.f() : null));
        }
        String title = discoverCarouselButtonDto.getTitle();
        DiscoverCarouselButtonTypeDto e = discoverCarouselButtonDto.e();
        return new LinkButton(title, actionOpenUrl, e != null ? e.i() : null);
    }
}
