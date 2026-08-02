package xsna;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetStyle;
import com.vk.dto.actionlinks.SnippetTarget;
import com.vk.dto.common.ImageSizeKey;

/* compiled from: ActionLinkAdapter.kt */
/* loaded from: classes5.dex */
public final class x10 {
    public static final int a = ImageSizeKey.SIZE_Z_1080.getWidth();
    public static final int b = ImageSizeKey.SIZE_P_0200.getWidth();

    public static final ActionLink a(SdkActionLink sdkActionLink) {
        int i;
        String str;
        ActionLinkSnippet actionLinkSnippet;
        SnippetStyle snippetStyle;
        int i2 = sdkActionLink.c;
        String str2 = sdkActionLink.e;
        String str3 = sdkActionLink.b;
        String str4 = sdkActionLink.f;
        Integer num = sdkActionLink.j;
        com.vk.clips.sdk.models.ActionLinkSnippet actionLinkSnippet2 = sdkActionLink.g;
        if (actionLinkSnippet2 != null) {
            SdkImages sdkImages = actionLinkSnippet2.h;
            String str5 = actionLinkSnippet2.b;
            String str6 = actionLinkSnippet2.c;
            String str7 = actionLinkSnippet2.d;
            String str8 = actionLinkSnippet2.e;
            SnippetTarget snippetTarget = SnippetTarget.UNKNOWN;
            int i3 = actionLinkSnippet2.f;
            int i4 = actionLinkSnippet2.g;
            com.vk.clips.sdk.models.SnippetStyle snippetStyle2 = actionLinkSnippet2.i;
            i = i2;
            if (snippetStyle2 != null) {
                str = str2;
                snippetStyle = new SnippetStyle(snippetStyle2.b, snippetStyle2.c);
            } else {
                str = str2;
                snippetStyle = null;
            }
            actionLinkSnippet = new ActionLinkSnippet(str5, str6, str7, str8, snippetTarget, i3, i4, snippetStyle, sdkImages.a(a), sdkImages.a(b), null, null, null, null, null, 28672, null);
        } else {
            i = i2;
            str = str2;
            actionLinkSnippet = null;
        }
        return new ActionLink(i, str, str3, str4, actionLinkSnippet, sdkActionLink.h, sdkActionLink.i, num);
    }
}
