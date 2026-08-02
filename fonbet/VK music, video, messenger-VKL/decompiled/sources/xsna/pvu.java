package xsna;

import android.net.Uri;
import android.text.Editable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.common.links.LinksParserData;
import com.vk.common.links.a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: HashtagsParserDelegate.kt */
/* loaded from: classes17.dex */
public final class pvu {
    public final com.vk.common.links.a a;
    public final om8 b;

    public pvu(com.vk.common.links.a aVar, om8 om8Var) {
        this.a = aVar;
        this.b = om8Var;
    }

    public final void a(Editable editable, Matcher matcher, ArrayList arrayList, LinksParserData linksParserData) {
        qaz a;
        String a2;
        if (linksParserData.f != null) {
            a = this.a.a(matcher.group(), linksParserData, false);
        } else if (matcher.group(2) == null) {
            com.vk.common.links.a aVar = this.a;
            String group = matcher.group();
            int i = a.b.$EnumSwitchMapping$0[linksParserData.i.ordinal()];
            if (i == 1) {
                a2 = tdj.a(new StringBuilder("vkvideo://"), a0a.d, "/video?q=", group);
            } else if (i == 2) {
                a2 = "https://" + a0a.d + "/clips/hashtag/" + drm0.U(group, "#");
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = "vkontakte://search/".concat(group);
            }
            a = aVar.a(a2, linksParserData, false);
        } else {
            com.vk.common.links.a aVar2 = this.a;
            StringBuilder sb = new StringBuilder("vkontakte://");
            sb.append(a0a.d);
            sb.append(DomExceptionUtils.SEPARATOR);
            sb.append(matcher.group(2));
            sb.append(DomExceptionUtils.SEPARATOR);
            String group2 = matcher.group(1);
            sb.append(Uri.encode(group2 != null ? group2.substring(1) : ""));
            a = aVar2.a(sb.toString(), linksParserData, true);
        }
        editable.setSpan(a, matcher.start(), matcher.end(), 0);
        arrayList.add(new wlb(matcher.start(), matcher.end()));
    }
}
