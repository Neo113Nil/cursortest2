package xsna;

import com.ironsource.D1;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionSnippetDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionSnippetStyleDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetStyle;
import com.vk.dto.actionlinks.SnippetTarget;
import java.util.List;

/* compiled from: ActionLinksActionToActionLinkMapper.kt */
/* loaded from: classes3.dex */
public final class s20 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c2, code lost:
    
        if (r0.equals(com.ironsource.D1.e) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.equals("clips_trend") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0022, code lost:
    
        if (r0.equals("clips_compilation_view") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x002c, code lost:
    
        if (r0.equals("clips_compilation_next") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0036, code lost:
    
        if (r0.equals("clips_challenge") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0040, code lost:
    
        if (r0.equals("video") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x004a, code lost:
    
        if (r0.equals("group") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0054, code lost:
    
        if (r0.equals("user") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x005e, code lost:
    
        if (r0.equals("post") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0068, code lost:
    
        if (r0.equals("poll") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0071, code lost:
    
        if (r0.equals("link") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x007a, code lost:
    
        if (r0.equals(com.mbridge.msdk.MBridgeConstans.DYNAMIC_VIEW_WX_APP) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0083, code lost:
    
        if (r0.equals("product") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x008c, code lost:
    
        if (r0.equals("video_postcard_gift") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0095, code lost:
    
        if (r0.equals("link_community_with_subscribe") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x009e, code lost:
    
        if (r0.equals("clips_user_link") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00a7, code lost:
    
        if (r0.equals("article") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b0, code lost:
    
        if (r0.equals("clips_compilation_first") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00b9, code lost:
    
        if (r0.equals("moneysend") == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ActionLink a(ActionLinksActionDto actionLinksActionDto) {
        String str;
        String str2;
        ActionLinkSnippet actionLinkSnippet;
        String str3;
        String str4;
        String str5;
        String type = actionLinksActionDto.getType();
        switch (type.hashCode()) {
            case -1820761141:
                str2 = D1.e;
                break;
            case -1712615352:
                str2 = "moneysend";
                break;
            case -933240040:
                str2 = "clips_compilation_first";
                break;
            case -732377866:
                str2 = "article";
                break;
            case -652765742:
                str2 = "clips_user_link";
                break;
            case -591591220:
                str2 = "link_community_with_subscribe";
                break;
            case -378331237:
                str2 = "video_postcard_gift";
                break;
            case -309474065:
                str2 = "product";
                break;
            case 96801:
                str2 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
                break;
            case 3321850:
                str2 = "link";
                break;
            case 3446719:
                str2 = "poll";
                break;
            case 3446944:
                str2 = "post";
                break;
            case 3599307:
                str2 = "user";
                break;
            case 98629247:
                str2 = "group";
                break;
            case 112202875:
                str2 = "video";
                break;
            case 410578503:
                str2 = "clips_challenge";
                break;
            case 1217056139:
                str2 = "clips_compilation_next";
                break;
            case 1217297725:
                str2 = "clips_compilation_view";
                break;
            case 1378026881:
                str2 = "clips_trend";
                break;
            default:
                str = "";
                break;
        }
        ActionLinksActionSnippetDto e = actionLinksActionDto.e();
        if (e != null) {
            List<BaseImageDto> g = e.g();
            if (g != null) {
                String str6 = null;
                String str7 = null;
                String str8 = null;
                for (BaseImageDto baseImageDto : g) {
                    int width = baseImageDto.getWidth();
                    if (width >= 0 && width < 100) {
                        str8 = baseImageDto.getUrl();
                    } else if (100 > width || width >= 300) {
                        str6 = baseImageDto.getUrl();
                    } else {
                        str7 = baseImageDto.getUrl();
                    }
                }
                str3 = str6;
                str4 = str7;
                str5 = str8;
            } else {
                str3 = null;
                str4 = null;
                str5 = null;
            }
            ActionLinksActionSnippetStyleDto l = e.l();
            Integer G = f370.G(l != null ? l.d() : null);
            ActionLinksActionSnippetStyleDto l2 = e.l();
            SnippetStyle snippetStyle = new SnippetStyle(G, f370.G(l2 != null ? l2.e() : null));
            String title = e.getTitle();
            String description = e.getDescription();
            String o = e.o();
            String j = e.j();
            SnippetTarget.a aVar = SnippetTarget.Companion;
            String n = e.n();
            String str9 = n != null ? n : "";
            aVar.getClass();
            SnippetTarget a = SnippetTarget.a.a(str9);
            Integer k = e.k();
            int intValue = k != null ? k.intValue() : 0;
            Integer f = e.f();
            int intValue2 = f != null ? f.intValue() : 0;
            MarketMarketItemDto i = e.i();
            actionLinkSnippet = new ActionLinkSnippet(title, description, o, j, a, intValue, intValue2, snippetStyle, str3, str4, str5, i != null ? b210.c(i) : null, e.e(), e.d(), null, 16384, null);
        } else {
            actionLinkSnippet = null;
        }
        Integer d = actionLinksActionDto.d();
        return new ActionLink(d != null ? d.intValue() : 0, str, actionLinksActionDto.getId(), actionLinksActionDto.getUrl(), actionLinkSnippet, null, null, null);
    }
}
