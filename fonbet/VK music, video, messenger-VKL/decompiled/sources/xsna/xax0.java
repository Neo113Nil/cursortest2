package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.donut.dto.DonutPaidDurationDto;
import com.vk.api.generated.donut.dto.DonutPaywallDto;
import com.vk.api.generated.donut.dto.DonutPaywallSnippetDto;
import com.vk.api.generated.wall.dto.WallWallpostDonutDto;
import com.vk.api.generated.wall.dto.WallWallpostDonutPlaceholderDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.posting.DonutPostingSettings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WallpostDonutDtoToPostDonutMapper.kt */
/* loaded from: classes3.dex */
public final class xax0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static PostDonut a(WallWallpostDonutDto wallWallpostDonutDto) {
        PostDonut.Placeholder placeholder;
        String str;
        Object obj;
        PostDonut.Paywall paywall;
        PostDonut.PaywallSnippetIcon paywallSnippetIcon;
        PostDonut.PaywallSnippetIcon paywallSnippetIcon2;
        LinkButton linkButton;
        Image image;
        Action b;
        LinkButton linkButton2;
        BaseLinkButtonActionDto e;
        Action b2;
        boolean o = wallWallpostDonutDto.o();
        WallWallpostDonutPlaceholderDto l = wallWallpostDonutDto.l();
        if (l != null) {
            String e2 = l.e();
            BaseLinkButtonDto d = l.d();
            if (d == null || (e = d.e()) == null || (b2 = wf6.b(e)) == null) {
                linkButton2 = null;
            } else {
                String title = d.getTitle();
                if (title == null) {
                    title = "";
                }
                BaseLinkButtonStyleDto o2 = d.o();
                linkButton2 = new LinkButton(title, b2, o2 != null ? o2.name() : null);
            }
            placeholder = new PostDonut.Placeholder(e2, linkButton2);
            str = null;
        } else {
            placeholder = null;
            str = null;
        }
        Integer i = wallWallpostDonutDto.i();
        WallWallpostDonutDto.EditModeDto g = wallWallpostDonutDto.g();
        String i2 = g != null ? g.i() : str;
        if (i2 == null) {
            i2 = "";
        }
        List<DonutPaidDurationDto> f = wallWallpostDonutDto.f();
        if (f != null) {
            List<DonutPaidDurationDto> list = f;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (DonutPaidDurationDto donutPaidDurationDto : list) {
                arrayList.add(new DonutPostingSettings.Duration(donutPaidDurationDto.getId(), donutPaidDurationDto.d()));
            }
            obj = new DonutPostingSettings(arrayList);
        } else {
            obj = str;
        }
        DonutPaywallDto j = wallWallpostDonutDto.j();
        if (j != null) {
            String f2 = j.f();
            if (f2 == null) {
                f2 = "";
            }
            String d2 = j.d();
            DonutPaywallSnippetDto e3 = j.e();
            switch (e1o.$EnumSwitchMapping$0[e3.e().ordinal()]) {
                case 1:
                    paywallSnippetIcon = PostDonut.PaywallSnippetIcon.VIDEO;
                    paywallSnippetIcon2 = paywallSnippetIcon;
                    break;
                case 2:
                    paywallSnippetIcon = PostDonut.PaywallSnippetIcon.IMAGE;
                    paywallSnippetIcon2 = paywallSnippetIcon;
                    break;
                case 3:
                    paywallSnippetIcon = PostDonut.PaywallSnippetIcon.POLL;
                    paywallSnippetIcon2 = paywallSnippetIcon;
                    break;
                case 4:
                    paywallSnippetIcon = PostDonut.PaywallSnippetIcon.PLAYLIST;
                    paywallSnippetIcon2 = paywallSnippetIcon;
                    break;
                case 5:
                    paywallSnippetIcon = PostDonut.PaywallSnippetIcon.AUDIO;
                    paywallSnippetIcon2 = paywallSnippetIcon;
                    break;
                case 6:
                    paywallSnippetIcon = PostDonut.PaywallSnippetIcon.PODCAST;
                    paywallSnippetIcon2 = paywallSnippetIcon;
                    break;
                case 7:
                    paywallSnippetIcon = PostDonut.PaywallSnippetIcon.TEXT;
                    paywallSnippetIcon2 = paywallSnippetIcon;
                    break;
                default:
                    paywallSnippetIcon2 = str;
                    break;
            }
            String title2 = e3.getTitle();
            String g2 = e3.g();
            BaseLinkButtonDto d3 = e3.d();
            BaseLinkButtonActionDto e4 = d3.e();
            if (e4 == null || (b = wf6.b(e4)) == null) {
                linkButton = null;
            } else {
                String title3 = d3.getTitle();
                String str2 = title3 != null ? title3 : "";
                BaseLinkButtonStyleDto o3 = d3.o();
                linkButton = new LinkButton(str2, b, o3 != null ? o3.name() : null);
            }
            List<BaseImageDto> f3 = e3.f();
            if (f3 != null) {
                new ne6();
                image = ne6.a(f3);
            } else {
                image = null;
            }
            paywall = new PostDonut.Paywall(f2, d2, new PostDonut.Snippet(paywallSnippetIcon2, title2, g2, linkButton, image));
        } else {
            paywall = null;
        }
        return new PostDonut(o, placeholder, i, i2, obj, paywall, wallWallpostDonutDto.e(), wallWallpostDonutDto.p(), wallWallpostDonutDto.k(), wallWallpostDonutDto.n());
    }
}
