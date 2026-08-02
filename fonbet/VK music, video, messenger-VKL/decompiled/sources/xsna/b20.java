package xsna;

import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionSnippetDto;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionSnippetStyleDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SnippetStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ActionLinkDtoToClipEditActionLinkMapper.kt */
/* loaded from: classes17.dex */
public final class b20 implements izs<ActionLinksActionDto, SdkActionLink> {
    public static final b20 b = new b20();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final SdkActionLink invoke(ActionLinksActionDto actionLinksActionDto) {
        ActionLinkSnippet actionLinkSnippet;
        ?? r13;
        SnippetStyle snippetStyle;
        ActionLinksActionDto actionLinksActionDto2 = actionLinksActionDto;
        String id = actionLinksActionDto2.getId();
        String type = actionLinksActionDto2.getType();
        String url = actionLinksActionDto2.getUrl();
        Integer d = actionLinksActionDto2.d();
        int intValue = d != null ? d.intValue() : 0;
        ActionLinksActionSnippetDto e = actionLinksActionDto2.e();
        if (e != null) {
            String description = e.getDescription();
            String j = e.j();
            String title = e.getTitle();
            String o = e.o();
            List<BaseImageDto> g = e.g();
            if (g != null) {
                List<BaseImageDto> list = g;
                r13 = new ArrayList(c5g.u(list, 10));
                for (BaseImageDto baseImageDto : list) {
                    r13.add(new ImageUrl(baseImageDto.getUrl(), baseImageDto.getWidth(), false));
                }
            } else {
                r13 = 0;
            }
            if (r13 == 0) {
                r13 = EmptyList.b;
            }
            SdkImages sdkImages = new SdkImages(r13, null, 2, null);
            Integer k = e.k();
            int intValue2 = k != null ? k.intValue() : 0;
            Integer f = e.f();
            int intValue3 = f != null ? f.intValue() : 0;
            ActionLinksActionSnippetStyleDto l = e.l();
            if (l != null) {
                String d2 = l.d();
                Integer m = d2 != null ? arm0.m(10, d2) : null;
                String e2 = l.e();
                snippetStyle = new SnippetStyle(m, e2 != null ? arm0.m(10, e2) : null);
            } else {
                snippetStyle = null;
            }
            actionLinkSnippet = new ActionLinkSnippet(title, description, o, j, intValue2, intValue3, sdkImages, snippetStyle, e.e(), e.d(), null, 1024, null);
        } else {
            actionLinkSnippet = null;
        }
        return new SdkActionLink(id, intValue, "", type, url, actionLinkSnippet, null, null, null);
    }
}
