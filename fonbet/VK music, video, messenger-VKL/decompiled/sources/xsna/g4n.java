package xsna;

import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.dto.user.ObsceneTextFilter;
import xsna.uij0;

/* compiled from: DiscoverMediaParsers.kt */
/* loaded from: classes18.dex */
public final class g4n {
    public static String a(String str) {
        uij0.a aVar = uij0.a.a;
        ObsceneTextFilter obsceneTextFilter = ObsceneTextFilter.UNAVAILABLE;
        LinksParserData.HashtagService hashtagService = LinksParserData.HashtagService.Posts;
        LinksParserData linksParserData = new LinksParserData(43787, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, obsceneTextFilter == ObsceneTextFilter.ENABLED, 8188);
        vdz vdzVar = new vdz(0);
        ucp ucpVar = ucp.a;
        return ucp.i(xwk.d().a().o(str, linksParserData, vdzVar)).toString();
    }
}
