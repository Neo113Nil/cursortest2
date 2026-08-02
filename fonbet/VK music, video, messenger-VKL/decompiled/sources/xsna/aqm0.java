package xsna;

import android.os.Bundle;
import android.text.SpannedString;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import kotlin.collections.EmptyList;

/* compiled from: StringExt.kt */
/* loaded from: classes5.dex */
public final class aqm0 {
    public static s8u0 a(String str, VkTypographyToken vkTypographyToken, VkColorToken vkColorToken, VkTypographyToken vkTypographyToken2, VkColorToken vkColorToken2, izs izsVar, int i) {
        VkTypographyToken vkTypographyToken3 = (i & 1) != 0 ? VkTypographyToken.SubheadNormal : vkTypographyToken;
        VkTypographyToken vkTypographyToken4 = (i & 4) != 0 ? VkTypographyToken.SubheadNormal : vkTypographyToken2;
        VkColorToken vkColorToken3 = (i & 8) != 0 ? VkColorToken.TextLink : vkColorToken2;
        boolean z = (i & 16) == 0;
        izs izsVar2 = (i & 32) != 0 ? null : izsVar;
        s8u0 s8u0Var = new s8u0(0);
        ucp ucpVar = ucp.a;
        SpannedString valueOf = SpannedString.valueOf(ucp.i(xwk.d().a().d(str, new LinksParserData(41851, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))));
        Iterable<qjc> u0 = valueOf != null ? rl3.u0(valueOf.getSpans(0, valueOf.length(), qjc.class)) : EmptyList.b;
        int i2 = s8u0Var.i(new klv0(vkTypographyToken3, vkColorToken));
        try {
            s8u0Var.e(valueOf.toString());
            for (qjc qjcVar : u0) {
                s8u0Var.d(new klv0(vkTypographyToken4, vkColorToken3), valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar));
                String str2 = "";
                if (z) {
                    String i3 = qjcVar.i();
                    if (i3 != null) {
                        str2 = i3;
                    }
                    s8u0Var.a(new h2v0(str2, null, new ypm0(0, str2, izsVar2)), valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar));
                } else {
                    String a = qjg.a(qjcVar);
                    String i4 = qjcVar.i();
                    if (i4 != null) {
                        str2 = i4;
                    }
                    s8u0Var.c(valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar), a, str2);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            s8u0Var.f(i2);
            return s8u0Var;
        } catch (Throwable th) {
            s8u0Var.f(i2);
            throw th;
        }
    }
}
