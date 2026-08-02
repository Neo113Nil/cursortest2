package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class iqi0 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        kao kaoVar;
        Text.Resource resource;
        Text.Resource resource2;
        lao laoVar;
        Themes themes;
        lao laoVar2;
        Themes themes2;
        lao laoVar3;
        lao laoVar4;
        Themes themes3;
        lao laoVar5;
        Themes themes4;
        lao laoVar6;
        gqi0 gqi0Var = (gqi0) obj;
        boolean z = gqi0Var instanceof fqi0;
        if (gqi0Var instanceof eqi0) {
            eqi0 eqi0Var = (eqi0) gqi0Var;
            if (eqi0Var instanceof zpi0) {
                zpi0 zpi0Var = (zpi0) gqi0Var;
                Themes themes5 = zpi0Var.g;
                List list = zpi0Var.h;
                Throwable th = zpi0Var.f;
                Text text = zpi0Var.a;
                Text.Resource resource3 = new Text.Resource(dzh0.ybsdk_common_support_title);
                if (text == null || !d.b(text)) {
                    text = resource3;
                }
                Text text2 = zpi0Var.b;
                Text resource4 = new Text.Resource(dzh0.ybsdk_common_support_message);
                if (text2 != null && d.b(text2)) {
                    resource4 = text2;
                }
                rbv c = fob1.c(themes5 != null ? (String) themes5.getLight() : null, themes5 != null ? (String) themes5.getDark() : null, new cbg0(29));
                if (c == null) {
                    c = new nbv(rxg0.ybsdk_ic_blocked, null);
                }
                rbv rbvVar = c;
                Text text3 = (list == null || (laoVar6 = (lao) a.R(list)) == null) ? null : laoVar6.a;
                kaoVar = r501.a(th, text, resource4, (text3 == null || !d.b(text3)) ? unr0.h(Text.Companion, dzh0.ybsdk_common_send_message_to_support) : text3, (list == null || (laoVar3 = (lao) a.S(1, list)) == null) ? null : laoVar3.a, null, (list == null || (laoVar5 = (lao) a.R(list)) == null || (themes4 = laoVar5.c) == null) ? null : lvy0.c(themes4), (list == null || (laoVar4 = (lao) a.R(list)) == null || (themes3 = laoVar4.d) == null) ? null : lvy0.c(themes3), (list == null || (laoVar2 = (lao) a.S(1, list)) == null || (themes2 = laoVar2.c) == null) ? null : lvy0.c(themes2), (list == null || (laoVar = (lao) a.S(1, list)) == null || (themes = laoVar.d) == null) ? null : lvy0.c(themes), rbvVar, null, null, 61506);
            } else if (eqi0Var instanceof ypi0) {
                ypi0 ypi0Var = (ypi0) gqi0Var;
                YBProduct yBProduct = ypi0Var.d;
                Throwable th2 = ypi0Var.f;
                Text text4 = ypi0Var.a;
                Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_common_error_view_title);
                if (text4 == null || !d.b(text4)) {
                    text4 = h;
                }
                Text text5 = ypi0Var.b;
                Text resource5 = (text5 == null || !d.b(text5)) ? new Text.Resource(dzh0.ybsdk_common_error_view_message) : text5;
                int[] iArr = hqi0.a;
                switch (iArr[yBProduct.ordinal()]) {
                    case 1:
                        resource = new Text.Resource(dzh0.ybsdk_common_error_retry);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        resource = new Text.Resource(dzh0.ybsdk_common_send_message_to_support);
                        break;
                    default:
                        w511.b();
                        return null;
                }
                Text.Resource resource6 = resource;
                switch (iArr[yBProduct.ordinal()]) {
                    case 1:
                        resource2 = new Text.Resource(dzh0.ybsdk_common_send_message_to_support);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        resource2 = null;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                kaoVar = r501.a(th2, text4, resource5, resource6, resource2, null, null, null, null, null, null, null, null, 65474);
            } else if (eqi0Var instanceof dqi0) {
                kaoVar = r501.a(((dqi0) gqi0Var).c, unr0.h(Text.Companion, dzh0.ybsdk_authorization_open_product_status_error), null, null, null, null, null, null, null, null, null, null, null, 65530);
            } else if (eqi0Var instanceof bqi0) {
                kaoVar = r501.a(null, null, null, unr0.h(Text.Companion, dzh0.ybsdk_common_send_message_to_support), null, null, null, null, null, null, null, null, null, 65519);
            } else {
                if (!(eqi0Var instanceof aqi0)) {
                    w511.b();
                    return null;
                }
                kaoVar = r501.a(null, null, null, unr0.h(Text.Companion, dzh0.ybsdk_common_error_retry), null, null, null, null, null, null, null, null, null, 65519);
            }
        } else {
            kaoVar = null;
        }
        fqi0 fqi0Var = z ? (fqi0) gqi0Var : null;
        Text text6 = fqi0Var != null ? fqi0Var.a : null;
        fqi0 fqi0Var2 = z ? (fqi0) gqi0Var : null;
        return new sqi0(z, kaoVar, text6, fqi0Var2 != null ? fqi0Var2.b : null);
    }
}
