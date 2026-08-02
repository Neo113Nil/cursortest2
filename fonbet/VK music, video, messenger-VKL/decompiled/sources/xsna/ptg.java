package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannedString;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ltg;
import xsna.rtg;
import xsna.utg;

/* compiled from: CommunityCategorySuggestionInfoFeature.kt */
/* loaded from: classes5.dex */
public final class ptg extends wk50<wtg, vtg, ltg, rtg> {
    public final /* synthetic */ g6b f;
    public final UserId g;

    public ptg(String str, String str2, UserId userId) {
        super(new ltg.b(str, str2), new stg(new vtg(null, null)));
        this.f = new g6b(1);
        this.g = userId;
    }

    @Override // xsna.wk50
    public final void N(vtg vtgVar, ltg ltgVar) {
        ltg ltgVar2 = ltgVar;
        boolean equals = ltgVar2.equals(ltg.a.b);
        g6b g6bVar = this.f;
        if (equals) {
            ((f4z) g6bVar.b).b(utg.a.C3828a.a);
            return;
        }
        s8u0 s8u0Var = null;
        if (!(ltgVar2 instanceof ltg.b)) {
            if (!(ltgVar2 instanceof ltg.c)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((ltg.c) ltgVar2).b;
            Uri g = jeq0.g(str);
            String path = g.getPath();
            if (path != null && drm0.D(path, "community_manage", false)) {
                Uri.Builder buildUpon = g.buildUpon();
                String fragment = g.getFragment();
                if (fragment != null && fragment.length() != 0) {
                    Uri.Builder appendEncodedPath = buildUpon.fragment("").appendEncodedPath("#");
                    String fragment2 = g.getFragment();
                    buildUpon = appendEncodedPath.appendPath(fragment2 != null ? drm0.q0(fragment2, '/') : null).appendEncodedPath("");
                }
                str = buildUpon.appendQueryParameter("group_id", String.valueOf(this.g.b)).build().toString();
            }
            ((f4z) g6bVar.b).b(new utg.a.b(str));
            return;
        }
        ltg.b bVar = (ltg.b) ltgVar2;
        String str2 = bVar.b;
        String str3 = bVar.c;
        if (str3 != null) {
            VkTypographyToken vkTypographyToken = VkTypographyToken.SubheadNormal;
            VkColorToken vkColorToken = VkColorToken.TextSubhead;
            VkColorToken vkColorToken2 = VkColorToken.TextLink;
            s8u0 s8u0Var2 = new s8u0(0);
            ucp ucpVar = ucp.a;
            SpannedString valueOf = SpannedString.valueOf(ucp.i(xwk.d().a().d(str3, new LinksParserData(41851, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))));
            Iterable<qjc> u0 = valueOf != null ? rl3.u0(valueOf.getSpans(0, valueOf.length(), qjc.class)) : EmptyList.b;
            int i = s8u0Var2.i(new klv0(vkTypographyToken, vkColorToken));
            try {
                s8u0Var2.e(valueOf.toString());
                for (qjc qjcVar : u0) {
                    s8u0Var2.d(new klv0(vkTypographyToken, vkColorToken2), valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar));
                    String a = qjg.a(qjcVar);
                    String i2 = qjcVar.i();
                    if (i2 == null) {
                        i2 = "";
                    }
                    s8u0Var2.c(valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar), a, i2);
                }
                s3q0 s3q0Var = s3q0.a;
                s8u0Var2.f(i);
                s8u0Var = s8u0Var2;
            } catch (Throwable th) {
                s8u0Var2.f(i);
                throw th;
            }
        }
        T(new rtg.a(str2, s8u0Var));
    }
}
